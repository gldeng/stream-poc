// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/collector/profiles/v1development/profiles_service.proto

package io.opentelemetry.proto.collector.profiles.v1development;

public interface ExportProfilesServiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.collector.profiles.v1development.ExportProfilesServiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.profiles.v1development.ExportProfilesPartialSuccess partial_success = 1;</code>
   * @return Whether the partialSuccess field is set.
   */
  boolean hasPartialSuccess();
  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.profiles.v1development.ExportProfilesPartialSuccess partial_success = 1;</code>
   * @return The partialSuccess.
   */
  io.opentelemetry.proto.collector.profiles.v1development.ExportProfilesPartialSuccess getPartialSuccess();
  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.profiles.v1development.ExportProfilesPartialSuccess partial_success = 1;</code>
   */
  io.opentelemetry.proto.collector.profiles.v1development.ExportProfilesPartialSuccessOrBuilder getPartialSuccessOrBuilder();
}
