package com.example;

import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OtlpMetricsDeserializerTest {

    @Test
    public void testDeserialize() throws Exception {
        // Create an empty OTLP metrics request as a sample (customize as needed)
        ExportMetricsServiceRequest originalRequest = ExportMetricsServiceRequest.newBuilder().build();
        byte[] data = originalRequest.toByteArray();

        // Deserialize using our custom deserializer
        FlinkOtlpMetricsJob.OtlpMetricsDeserializer deserializer = new FlinkOtlpMetricsJob.OtlpMetricsDeserializer();
        ExportMetricsServiceRequest resultRequest = deserializer.deserialize(data);

        // Verify that the deserialized object is equal to the original
        assertEquals(originalRequest, resultRequest, "The deserialized request should match the original");
    }
} 