// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/logs/v1/logs.proto

package io.opentelemetry.proto.logs.v1;

public final class LogsProto {
  private LogsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_logs_v1_LogsData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_logs_v1_LogsData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_logs_v1_ResourceLogs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_logs_v1_ResourceLogs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_logs_v1_ScopeLogs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_logs_v1_ScopeLogs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_logs_v1_LogRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_logs_v1_LogRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&opentelemetry/proto/logs/v1/logs.proto" +
      "\022\033opentelemetry.proto.logs.v1\032*opentelem" +
      "etry/proto/common/v1/common.proto\032.opent" +
      "elemetry/proto/resource/v1/resource.prot" +
      "o\"L\n\010LogsData\022@\n\rresource_logs\030\001 \003(\0132).o" +
      "pentelemetry.proto.logs.v1.ResourceLogs\"" +
      "\243\001\n\014ResourceLogs\022;\n\010resource\030\001 \001(\0132).ope" +
      "ntelemetry.proto.resource.v1.Resource\022:\n" +
      "\nscope_logs\030\002 \003(\0132&.opentelemetry.proto." +
      "logs.v1.ScopeLogs\022\022\n\nschema_url\030\003 \001(\tJ\006\010" +
      "\350\007\020\351\007\"\240\001\n\tScopeLogs\022B\n\005scope\030\001 \001(\01323.ope" +
      "ntelemetry.proto.common.v1.Instrumentati" +
      "onScope\022;\n\013log_records\030\002 \003(\0132&.opentelem" +
      "etry.proto.logs.v1.LogRecord\022\022\n\nschema_u" +
      "rl\030\003 \001(\t\"\203\003\n\tLogRecord\022\026\n\016time_unix_nano" +
      "\030\001 \001(\006\022\037\n\027observed_time_unix_nano\030\013 \001(\006\022" +
      "D\n\017severity_number\030\002 \001(\0162+.opentelemetry" +
      ".proto.logs.v1.SeverityNumber\022\025\n\rseverit" +
      "y_text\030\003 \001(\t\0225\n\004body\030\005 \001(\0132\'.opentelemet" +
      "ry.proto.common.v1.AnyValue\022;\n\nattribute" +
      "s\030\006 \003(\0132\'.opentelemetry.proto.common.v1." +
      "KeyValue\022 \n\030dropped_attributes_count\030\007 \001" +
      "(\r\022\r\n\005flags\030\010 \001(\007\022\020\n\010trace_id\030\t \001(\014\022\017\n\007s" +
      "pan_id\030\n \001(\014\022\022\n\nevent_name\030\014 \001(\tJ\004\010\004\020\005*\303" +
      "\005\n\016SeverityNumber\022\037\n\033SEVERITY_NUMBER_UNS" +
      "PECIFIED\020\000\022\031\n\025SEVERITY_NUMBER_TRACE\020\001\022\032\n" +
      "\026SEVERITY_NUMBER_TRACE2\020\002\022\032\n\026SEVERITY_NU" +
      "MBER_TRACE3\020\003\022\032\n\026SEVERITY_NUMBER_TRACE4\020" +
      "\004\022\031\n\025SEVERITY_NUMBER_DEBUG\020\005\022\032\n\026SEVERITY" +
      "_NUMBER_DEBUG2\020\006\022\032\n\026SEVERITY_NUMBER_DEBU" +
      "G3\020\007\022\032\n\026SEVERITY_NUMBER_DEBUG4\020\010\022\030\n\024SEVE" +
      "RITY_NUMBER_INFO\020\t\022\031\n\025SEVERITY_NUMBER_IN" +
      "FO2\020\n\022\031\n\025SEVERITY_NUMBER_INFO3\020\013\022\031\n\025SEVE" +
      "RITY_NUMBER_INFO4\020\014\022\030\n\024SEVERITY_NUMBER_W" +
      "ARN\020\r\022\031\n\025SEVERITY_NUMBER_WARN2\020\016\022\031\n\025SEVE" +
      "RITY_NUMBER_WARN3\020\017\022\031\n\025SEVERITY_NUMBER_W" +
      "ARN4\020\020\022\031\n\025SEVERITY_NUMBER_ERROR\020\021\022\032\n\026SEV" +
      "ERITY_NUMBER_ERROR2\020\022\022\032\n\026SEVERITY_NUMBER" +
      "_ERROR3\020\023\022\032\n\026SEVERITY_NUMBER_ERROR4\020\024\022\031\n" +
      "\025SEVERITY_NUMBER_FATAL\020\025\022\032\n\026SEVERITY_NUM" +
      "BER_FATAL2\020\026\022\032\n\026SEVERITY_NUMBER_FATAL3\020\027" +
      "\022\032\n\026SEVERITY_NUMBER_FATAL4\020\030*Y\n\016LogRecor" +
      "dFlags\022\037\n\033LOG_RECORD_FLAGS_DO_NOT_USE\020\000\022" +
      "&\n!LOG_RECORD_FLAGS_TRACE_FLAGS_MASK\020\377\001B" +
      "s\n\036io.opentelemetry.proto.logs.v1B\tLogsP" +
      "rotoP\001Z&go.opentelemetry.io/proto/otlp/l" +
      "ogs/v1\252\002\033OpenTelemetry.Proto.Logs.V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opentelemetry.proto.common.v1.CommonProto.getDescriptor(),
          io.opentelemetry.proto.resource.v1.ResourceProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_logs_v1_LogsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_logs_v1_LogsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_logs_v1_LogsData_descriptor,
        new java.lang.String[] { "ResourceLogs", });
    internal_static_opentelemetry_proto_logs_v1_ResourceLogs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_logs_v1_ResourceLogs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_logs_v1_ResourceLogs_descriptor,
        new java.lang.String[] { "Resource", "ScopeLogs", "SchemaUrl", });
    internal_static_opentelemetry_proto_logs_v1_ScopeLogs_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opentelemetry_proto_logs_v1_ScopeLogs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_logs_v1_ScopeLogs_descriptor,
        new java.lang.String[] { "Scope", "LogRecords", "SchemaUrl", });
    internal_static_opentelemetry_proto_logs_v1_LogRecord_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opentelemetry_proto_logs_v1_LogRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_logs_v1_LogRecord_descriptor,
        new java.lang.String[] { "TimeUnixNano", "ObservedTimeUnixNano", "SeverityNumber", "SeverityText", "Body", "Attributes", "DroppedAttributesCount", "Flags", "TraceId", "SpanId", "EventName", });
    io.opentelemetry.proto.common.v1.CommonProto.getDescriptor();
    io.opentelemetry.proto.resource.v1.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
