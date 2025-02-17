// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/profiles/v1development/profiles.proto

package io.opentelemetry.proto.profiles.v1development;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.profiles.v1development.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reference to mapping in Profile.mapping_table.
   * It can be unset if the mapping is unknown or not applicable for
   * this profile type.
   * </pre>
   *
   * <code>optional int32 mapping_index = 1;</code>
   * @return Whether the mappingIndex field is set.
   */
  boolean hasMappingIndex();
  /**
   * <pre>
   * Reference to mapping in Profile.mapping_table.
   * It can be unset if the mapping is unknown or not applicable for
   * this profile type.
   * </pre>
   *
   * <code>optional int32 mapping_index = 1;</code>
   * @return The mappingIndex.
   */
  int getMappingIndex();

  /**
   * <pre>
   * The instruction address for this location, if available.  It
   * should be within [Mapping.memory_start...Mapping.memory_limit]
   * for the corresponding mapping. A non-leaf address may be in the
   * middle of a call instruction. It is up to display tools to find
   * the beginning of the instruction if necessary.
   * </pre>
   *
   * <code>uint64 address = 2;</code>
   * @return The address.
   */
  long getAddress();

  /**
   * <pre>
   * Multiple line indicates this location has inlined functions,
   * where the last entry represents the caller into which the
   * preceding entries were inlined.
   * E.g., if memcpy() is inlined into printf:
   *    line[0].function_name == "memcpy"
   *    line[1].function_name == "printf"
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Line line = 3;</code>
   */
  java.util.List<io.opentelemetry.proto.profiles.v1development.Line> 
      getLineList();
  /**
   * <pre>
   * Multiple line indicates this location has inlined functions,
   * where the last entry represents the caller into which the
   * preceding entries were inlined.
   * E.g., if memcpy() is inlined into printf:
   *    line[0].function_name == "memcpy"
   *    line[1].function_name == "printf"
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Line line = 3;</code>
   */
  io.opentelemetry.proto.profiles.v1development.Line getLine(int index);
  /**
   * <pre>
   * Multiple line indicates this location has inlined functions,
   * where the last entry represents the caller into which the
   * preceding entries were inlined.
   * E.g., if memcpy() is inlined into printf:
   *    line[0].function_name == "memcpy"
   *    line[1].function_name == "printf"
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Line line = 3;</code>
   */
  int getLineCount();
  /**
   * <pre>
   * Multiple line indicates this location has inlined functions,
   * where the last entry represents the caller into which the
   * preceding entries were inlined.
   * E.g., if memcpy() is inlined into printf:
   *    line[0].function_name == "memcpy"
   *    line[1].function_name == "printf"
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Line line = 3;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.profiles.v1development.LineOrBuilder> 
      getLineOrBuilderList();
  /**
   * <pre>
   * Multiple line indicates this location has inlined functions,
   * where the last entry represents the caller into which the
   * preceding entries were inlined.
   * E.g., if memcpy() is inlined into printf:
   *    line[0].function_name == "memcpy"
   *    line[1].function_name == "printf"
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.Line line = 3;</code>
   */
  io.opentelemetry.proto.profiles.v1development.LineOrBuilder getLineOrBuilder(
      int index);

  /**
   * <pre>
   * Provides an indication that multiple symbols map to this location's
   * address, for example due to identical code folding by the linker. In that
   * case the line information above represents one of the multiple
   * symbols. This field must be recomputed when the symbolization state of the
   * profile changes.
   * </pre>
   *
   * <code>bool is_folded = 4;</code>
   * @return The isFolded.
   */
  boolean getIsFolded();

  /**
   * <pre>
   * References to attributes in Profile.attribute_table. [optional]
   * </pre>
   *
   * <code>repeated int32 attribute_indices = 5;</code>
   * @return A list containing the attributeIndices.
   */
  java.util.List<java.lang.Integer> getAttributeIndicesList();
  /**
   * <pre>
   * References to attributes in Profile.attribute_table. [optional]
   * </pre>
   *
   * <code>repeated int32 attribute_indices = 5;</code>
   * @return The count of attributeIndices.
   */
  int getAttributeIndicesCount();
  /**
   * <pre>
   * References to attributes in Profile.attribute_table. [optional]
   * </pre>
   *
   * <code>repeated int32 attribute_indices = 5;</code>
   * @param index The index of the element to return.
   * @return The attributeIndices at the given index.
   */
  int getAttributeIndices(int index);
}
