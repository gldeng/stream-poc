package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import io.opentelemetry.proto.trace.v1.Span;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.util.Collector;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class FlinkOtlpMetricsJob {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("Please provide Kafka broker address as argument");
        }
        String kafkaBroker = args[0];

        // Set up Flink execution environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // Kafka consumer properties
        Properties kafkaConsumerProps = new Properties();
        kafkaConsumerProps.setProperty("bootstrap.servers", kafkaBroker);
        kafkaConsumerProps.setProperty("group.id", "flink-opentelemetry-group");

        // Kafka producer properties
        Properties kafkaProducerProps = new Properties();
        kafkaProducerProps.setProperty("bootstrap.servers", kafkaBroker);
        kafkaProducerProps.setProperty("group.id", "flink-opentelemetry-group-producer");

        // Create Kafka consumer to read Protobuf messages
        String inputTopic = "otlp-metrics";
        DataStream<byte[]> protobufStream = env
                .addSource(new FlinkKafkaConsumer<>(inputTopic, new ProtobufDeserializationSchema(), kafkaConsumerProps));

        // Process the Protobuf stream
        DataStream<String> jsonStream = protobufStream.flatMap(
                new FlatMapFunction<byte[], String>() {
                    @Override
                    public void flatMap(byte[] bytes, Collector<String> out) throws Exception {
                        // Log bytes in base64 format
                        String base64Data = java.util.Base64.getEncoder().encodeToString(bytes);
                        System.out.println("Received protobuf message (base64): " + base64Data);

                        try {
                            ExportMetricsServiceRequest request = ExportMetricsServiceRequest.parseFrom(bytes);
                            request.getResourceMetricsList().stream()
                                    .map(resourceMetric -> {
                                        try {
                                            return OBJECT_MAPPER.writeValueAsString(resourceMetric);
                                        } catch (JsonProcessingException e) {
                                            System.err.println("Failed to serialize metric: " + e.getMessage());
                                            return null;
                                        }
                                    })
                                    .filter(json -> json != null)
                                    .forEach(out::collect);
                        } catch (InvalidProtocolBufferException e) {
                            System.err.println("Failed to parse protobuf message: " + e.getMessage());
                        }
                    }
                }
        );

        // Create Kafka producer to write JSON strings
        String outputTopic = "otlp-metrics-processed";
        jsonStream.addSink(new FlinkKafkaProducer<>(
                outputTopic,
                new SimpleStringSchema(),
                kafkaProducerProps
        ));

        // Execute the Flink pipeline
        env.execute("OpenTelemetry Flink Processor");
    }
} 