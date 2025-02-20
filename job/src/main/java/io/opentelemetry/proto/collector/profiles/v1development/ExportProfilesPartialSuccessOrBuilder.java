// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/collector/profiles/v1development/profiles_service.proto

package io.opentelemetry.proto.collector.profiles.v1development;

public interface ExportProfilesPartialSuccessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.collector.profiles.v1development.ExportProfilesPartialSuccess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of rejected profiles.
   * A `rejected_&lt;signal&gt;` field holding a `0` value indicates that the
   * request was fully accepted.
   * </pre>
   *
   * <code>int64 rejected_profiles = 1;</code>
   * @return The rejectedProfiles.
   */
  long getRejectedProfiles();

  /**
   * <pre>
   * A developer-facing human-readable message in English. It should be used
   * either to explain why the server rejected parts of the data during a partial
   * success or to convey warnings/suggestions during a full success. The message
   * should offer guidance on how users can address such issues.
   * error_message is an optional field. An error_message with an empty value
   * is equivalent to it not being set.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * A developer-facing human-readable message in English. It should be used
   * either to explain why the server rejected parts of the data during a partial
   * success or to convey warnings/suggestions during a full success. The message
   * should offer guidance on how users can address such issues.
   * error_message is an optional field. An error_message with an empty value
   * is equivalent to it not being set.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
