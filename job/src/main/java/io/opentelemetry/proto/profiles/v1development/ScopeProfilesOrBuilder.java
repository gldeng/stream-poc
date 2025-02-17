// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/profiles/v1development/profiles.proto

package io.opentelemetry.proto.profiles.v1development;

public interface ScopeProfilesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.profiles.v1development.ScopeProfiles)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instrumentation scope information for the profiles in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1;</code>
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   * <pre>
   * The instrumentation scope information for the profiles in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1;</code>
   * @return The scope.
   */
  io.opentelemetry.proto.common.v1.InstrumentationScope getScope();
  /**
   * <pre>
   * The instrumentation scope information for the profiles in this message.
   * Semantically when InstrumentationScope isn't set, it is equivalent with
   * an empty instrumentation scope name (unknown).
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.InstrumentationScope scope = 1;</code>
   */
  io.opentelemetry.proto.common.v1.InstrumentationScopeOrBuilder getScopeOrBuilder();

  /**
   * <pre>
   * A list of Profiles that originate from an instrumentation scope.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Profile profiles = 2;</code>
   */
  java.util.List<io.opentelemetry.proto.profiles.v1development.Profile> 
      getProfilesList();
  /**
   * <pre>
   * A list of Profiles that originate from an instrumentation scope.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Profile profiles = 2;</code>
   */
  io.opentelemetry.proto.profiles.v1development.Profile getProfiles(int index);
  /**
   * <pre>
   * A list of Profiles that originate from an instrumentation scope.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Profile profiles = 2;</code>
   */
  int getProfilesCount();
  /**
   * <pre>
   * A list of Profiles that originate from an instrumentation scope.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Profile profiles = 2;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.profiles.v1development.ProfileOrBuilder> 
      getProfilesOrBuilderList();
  /**
   * <pre>
   * A list of Profiles that originate from an instrumentation scope.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Profile profiles = 2;</code>
   */
  io.opentelemetry.proto.profiles.v1development.ProfileOrBuilder getProfilesOrBuilder(
      int index);

  /**
   * <pre>
   * The Schema URL, if known. This is the identifier of the Schema that the profile data
   * is recorded in. Notably, the last part of the URL path is the version number of the
   * schema: http[s]://server[:port]/path/&lt;version&gt;. To learn more about Schema URL see
   * https://opentelemetry.io/docs/specs/otel/schemas/#schema-url
   * This schema_url applies to all profiles in the "profiles" field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   * @return The schemaUrl.
   */
  java.lang.String getSchemaUrl();
  /**
   * <pre>
   * The Schema URL, if known. This is the identifier of the Schema that the profile data
   * is recorded in. Notably, the last part of the URL path is the version number of the
   * schema: http[s]://server[:port]/path/&lt;version&gt;. To learn more about Schema URL see
   * https://opentelemetry.io/docs/specs/otel/schemas/#schema-url
   * This schema_url applies to all profiles in the "profiles" field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   * @return The bytes for schemaUrl.
   */
  com.google.protobuf.ByteString
      getSchemaUrlBytes();
}
