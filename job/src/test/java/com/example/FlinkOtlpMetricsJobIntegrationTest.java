package com.example;

import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSink;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.junit.jupiter.api.Test;

public class FlinkOtlpMetricsJobIntegrationTest {

    @Test
    public void testLocalExecution() throws Exception {
        // Setup the local execution environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironment(1);

        // Create a simple source with one OTLP metrics request
        ExportMetricsServiceRequest sampleRequest = ExportMetricsServiceRequest.newBuilder().build();
        DataStream<ExportMetricsServiceRequest> sourceStream = env.fromElements(sampleRequest);

        // Here we simulate processing (a no-op map in this example)
        DataStream<ExportMetricsServiceRequest> processedStream = sourceStream.map(request -> request);

        // Attach a print sink (for example purposes)
        processedStream.print();

        // Execute the job locally; this verifies that the job structure is valid
        env.execute("Flink OTLP Metrics Integration Test");
    }
} 