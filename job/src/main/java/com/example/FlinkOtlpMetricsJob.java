package com.example;

import com.google.protobuf.util.JsonFormat;
import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.serialization.AbstractDeserializationSchema;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;

import java.io.IOException;
import java.util.Properties;

public class FlinkOtlpMetricsJob {

    public static void main(String[] args) throws Exception {
        // Create Flink execution environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // Configure Kafka consumer properties
        Properties kafkaProps = new Properties();
        kafkaProps.setProperty("bootstrap.servers", "host.docker.internal:9092");
        kafkaProps.setProperty("group.id", "flink-metrics-consumer");

        // Create Kafka consumer for the "otlp-metrics" topic
        FlinkKafkaConsumer<ExportMetricsServiceRequest> kafkaConsumer = new FlinkKafkaConsumer<>(
                "otlp-metrics",
                new OtlpMetricsDeserializer(),
                kafkaProps
        );
        // Start reading from the beginning of the topic
        kafkaConsumer.setStartFromEarliest();

        // Add the Kafka consumer as a source
        DataStream<ExportMetricsServiceRequest> metricsStream = env.addSource(kafkaConsumer);

        metricsStream.map(new MapFunction<ExportMetricsServiceRequest, String>() {
            @Override
            public String map(ExportMetricsServiceRequest value) throws Exception {
                // Convert Protobuf message to JSON
                return JsonFormat.printer()
                        .includingDefaultValueFields()
                        .print(value);
            }
        });

        // Simple processing: print out the metrics
        metricsStream.print();

        // Execute the Flink job
        env.execute("Flink OTLP Metrics Job");
    }

    /**
     * Custom deserialization schema for OTLP metrics messages.
     */
    public static class OtlpMetricsDeserializer extends AbstractDeserializationSchema<ExportMetricsServiceRequest> {
        @Override
        public ExportMetricsServiceRequest deserialize(byte[] message) throws IOException {
            // Deserialize using the generated protobuf parseFrom method
            return ExportMetricsServiceRequest.parseFrom(message);
        }
    }
} 