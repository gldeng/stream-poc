// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/profiles/v1development/profiles.proto

package io.opentelemetry.proto.profiles.v1development;

public interface LinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.profiles.v1development.Link)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifier of a trace that this linked span is part of. The ID is a
   * 16-byte array.
   * </pre>
   *
   * <code>bytes trace_id = 1;</code>
   * @return The traceId.
   */
  com.google.protobuf.ByteString getTraceId();

  /**
   * <pre>
   * A unique identifier for the linked span. The ID is an 8-byte array.
   * </pre>
   *
   * <code>bytes span_id = 2;</code>
   * @return The spanId.
   */
  com.google.protobuf.ByteString getSpanId();
}
