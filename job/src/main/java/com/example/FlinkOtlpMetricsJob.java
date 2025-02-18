package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.opentelemetry.proto.trace.v1.Span;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.flink.streaming.api.datastream.DataStream;

import java.util.Properties;

public class FlinkOtlpMetricsJob {

    public static void main(String[] args) throws Exception {

        // Set up Flink execution environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // Kafka consumer properties
        Properties kafkaConsumerProps = new Properties();
        kafkaConsumerProps.setProperty("bootstrap.servers", "host.docker.internal:9092");
        kafkaConsumerProps.setProperty("group.id", "flink-opentelemetry-group");

        // Kafka producer properties
        Properties kafkaProducerProps = new Properties();
        kafkaProducerProps.setProperty("bootstrap.servers", "host.docker.internal:9092");

        // Create Kafka consumer to read Protobuf messages
        String inputTopic = "otlp-metrics";
        DataStream<byte[]> protobufStream = env
                .addSource(new FlinkKafkaConsumer<>(inputTopic, new ProtobufDeserializationSchema(), kafkaConsumerProps));

        // Process the Protobuf stream
        DataStream<String> jsonStream = protobufStream.map(bytes -> {

            // Deserialize Protobuf to an OpenTelemetry Span object
            Span span = Span.parseFrom(bytes);

            // Transform the Span object to JSON using Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // You can customize the logic here (e.g., extract necessary fields)
            return objectMapper.writeValueAsString(span);
        }).returns(TypeInformation.of(String.class)); // Output type is String

        // Create Kafka producer to write JSON strings
        String outputTopic = "otlp-metrics-json";
        jsonStream.addSink(new FlinkKafkaProducer<>(
                outputTopic,
                new SimpleStringSchema(),
                kafkaProducerProps
        ));

        // Execute the Flink pipeline
        env.execute("OpenTelemetry Flink Processor");
    }
} 