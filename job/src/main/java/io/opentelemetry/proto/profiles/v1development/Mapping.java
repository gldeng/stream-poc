// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/profiles/v1development/profiles.proto

package io.opentelemetry.proto.profiles.v1development;

/**
 * <pre>
 * Describes the mapping of a binary in memory, including its address range,
 * file offset, and metadata like build ID
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.profiles.v1development.Mapping}
 */
public final class Mapping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.profiles.v1development.Mapping)
    MappingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Mapping.newBuilder() to construct.
  private Mapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Mapping() {
    attributeIndices_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Mapping();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Mapping(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            memoryStart_ = input.readUInt64();
            break;
          }
          case 16: {

            memoryLimit_ = input.readUInt64();
            break;
          }
          case 24: {

            fileOffset_ = input.readUInt64();
            break;
          }
          case 32: {

            filenameStrindex_ = input.readInt32();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attributeIndices_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            attributeIndices_.addInt(input.readInt32());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              attributeIndices_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              attributeIndices_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 48: {

            hasFunctions_ = input.readBool();
            break;
          }
          case 56: {

            hasFilenames_ = input.readBool();
            break;
          }
          case 64: {

            hasLineNumbers_ = input.readBool();
            break;
          }
          case 72: {

            hasInlineFrames_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        attributeIndices_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_Mapping_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_Mapping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.profiles.v1development.Mapping.class, io.opentelemetry.proto.profiles.v1development.Mapping.Builder.class);
  }

  public static final int MEMORY_START_FIELD_NUMBER = 1;
  private long memoryStart_;
  /**
   * <pre>
   * Address at which the binary (or DLL) is loaded into memory.
   * </pre>
   *
   * <code>uint64 memory_start = 1;</code>
   * @return The memoryStart.
   */
  @java.lang.Override
  public long getMemoryStart() {
    return memoryStart_;
  }

  public static final int MEMORY_LIMIT_FIELD_NUMBER = 2;
  private long memoryLimit_;
  /**
   * <pre>
   * The limit of the address range occupied by this mapping.
   * </pre>
   *
   * <code>uint64 memory_limit = 2;</code>
   * @return The memoryLimit.
   */
  @java.lang.Override
  public long getMemoryLimit() {
    return memoryLimit_;
  }

  public static final int FILE_OFFSET_FIELD_NUMBER = 3;
  private long fileOffset_;
  /**
   * <pre>
   * Offset in the binary that corresponds to the first mapped address.
   * </pre>
   *
   * <code>uint64 file_offset = 3;</code>
   * @return The fileOffset.
   */
  @java.lang.Override
  public long getFileOffset() {
    return fileOffset_;
  }

  public static final int FILENAME_STRINDEX_FIELD_NUMBER = 4;
  private int filenameStrindex_;
  /**
   * <pre>
   * The object this entry is loaded from.  This can be a filename on
   * disk for the main binary and shared libraries, or virtual
   * abstractions like "[vdso]".
   * </pre>
   *
   * <code>int32 filename_strindex = 4;</code>
   * @return The filenameStrindex.
   */
  @java.lang.Override
  public int getFilenameStrindex() {
    return filenameStrindex_;
  }

  public static final int ATTRIBUTE_INDICES_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList attributeIndices_;
  /**
   * <pre>
   * References to attributes in Profile.attribute_table. [optional]
   * </pre>
   *
   * <code>repeated int32 attribute_indices = 5;</code>
   * @return A list containing the attributeIndices.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAttributeIndicesList() {
    return attributeIndices_;
  }
  /**
   * <pre>
   * References to attributes in Profile.attribute_table. [optional]
   * </pre>
   *
   * <code>repeated int32 attribute_indices = 5;</code>
   * @return The count of attributeIndices.
   */
  public int getAttributeIndicesCount() {
    return attributeIndices_.size();
  }
  /**
   * <pre>
   * References to attributes in Profile.attribute_table. [optional]
   * </pre>
   *
   * <code>repeated int32 attribute_indices = 5;</code>
   * @param index The index of the element to return.
   * @return The attributeIndices at the given index.
   */
  public int getAttributeIndices(int index) {
    return attributeIndices_.getInt(index);
  }
  private int attributeIndicesMemoizedSerializedSize = -1;

  public static final int HAS_FUNCTIONS_FIELD_NUMBER = 6;
  private boolean hasFunctions_;
  /**
   * <pre>
   * The following fields indicate the resolution of symbolic info.
   * </pre>
   *
   * <code>bool has_functions = 6;</code>
   * @return The hasFunctions.
   */
  @java.lang.Override
  public boolean getHasFunctions() {
    return hasFunctions_;
  }

  public static final int HAS_FILENAMES_FIELD_NUMBER = 7;
  private boolean hasFilenames_;
  /**
   * <code>bool has_filenames = 7;</code>
   * @return The hasFilenames.
   */
  @java.lang.Override
  public boolean getHasFilenames() {
    return hasFilenames_;
  }

  public static final int HAS_LINE_NUMBERS_FIELD_NUMBER = 8;
  private boolean hasLineNumbers_;
  /**
   * <code>bool has_line_numbers = 8;</code>
   * @return The hasLineNumbers.
   */
  @java.lang.Override
  public boolean getHasLineNumbers() {
    return hasLineNumbers_;
  }

  public static final int HAS_INLINE_FRAMES_FIELD_NUMBER = 9;
  private boolean hasInlineFrames_;
  /**
   * <code>bool has_inline_frames = 9;</code>
   * @return The hasInlineFrames.
   */
  @java.lang.Override
  public boolean getHasInlineFrames() {
    return hasInlineFrames_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (memoryStart_ != 0L) {
      output.writeUInt64(1, memoryStart_);
    }
    if (memoryLimit_ != 0L) {
      output.writeUInt64(2, memoryLimit_);
    }
    if (fileOffset_ != 0L) {
      output.writeUInt64(3, fileOffset_);
    }
    if (filenameStrindex_ != 0) {
      output.writeInt32(4, filenameStrindex_);
    }
    if (getAttributeIndicesList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(attributeIndicesMemoizedSerializedSize);
    }
    for (int i = 0; i < attributeIndices_.size(); i++) {
      output.writeInt32NoTag(attributeIndices_.getInt(i));
    }
    if (hasFunctions_ != false) {
      output.writeBool(6, hasFunctions_);
    }
    if (hasFilenames_ != false) {
      output.writeBool(7, hasFilenames_);
    }
    if (hasLineNumbers_ != false) {
      output.writeBool(8, hasLineNumbers_);
    }
    if (hasInlineFrames_ != false) {
      output.writeBool(9, hasInlineFrames_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memoryStart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, memoryStart_);
    }
    if (memoryLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, memoryLimit_);
    }
    if (fileOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, fileOffset_);
    }
    if (filenameStrindex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, filenameStrindex_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < attributeIndices_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(attributeIndices_.getInt(i));
      }
      size += dataSize;
      if (!getAttributeIndicesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      attributeIndicesMemoizedSerializedSize = dataSize;
    }
    if (hasFunctions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, hasFunctions_);
    }
    if (hasFilenames_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, hasFilenames_);
    }
    if (hasLineNumbers_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, hasLineNumbers_);
    }
    if (hasInlineFrames_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, hasInlineFrames_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.opentelemetry.proto.profiles.v1development.Mapping)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.profiles.v1development.Mapping other = (io.opentelemetry.proto.profiles.v1development.Mapping) obj;

    if (getMemoryStart()
        != other.getMemoryStart()) return false;
    if (getMemoryLimit()
        != other.getMemoryLimit()) return false;
    if (getFileOffset()
        != other.getFileOffset()) return false;
    if (getFilenameStrindex()
        != other.getFilenameStrindex()) return false;
    if (!getAttributeIndicesList()
        .equals(other.getAttributeIndicesList())) return false;
    if (getHasFunctions()
        != other.getHasFunctions()) return false;
    if (getHasFilenames()
        != other.getHasFilenames()) return false;
    if (getHasLineNumbers()
        != other.getHasLineNumbers()) return false;
    if (getHasInlineFrames()
        != other.getHasInlineFrames()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MEMORY_START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemoryStart());
    hash = (37 * hash) + MEMORY_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemoryLimit());
    hash = (37 * hash) + FILE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFileOffset());
    hash = (37 * hash) + FILENAME_STRINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getFilenameStrindex();
    if (getAttributeIndicesCount() > 0) {
      hash = (37 * hash) + ATTRIBUTE_INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeIndicesList().hashCode();
    }
    hash = (37 * hash) + HAS_FUNCTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasFunctions());
    hash = (37 * hash) + HAS_FILENAMES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasFilenames());
    hash = (37 * hash) + HAS_LINE_NUMBERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasLineNumbers());
    hash = (37 * hash) + HAS_INLINE_FRAMES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasInlineFrames());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.profiles.v1development.Mapping parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.opentelemetry.proto.profiles.v1development.Mapping prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes the mapping of a binary in memory, including its address range,
   * file offset, and metadata like build ID
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.profiles.v1development.Mapping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.profiles.v1development.Mapping)
      io.opentelemetry.proto.profiles.v1development.MappingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_Mapping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_Mapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.profiles.v1development.Mapping.class, io.opentelemetry.proto.profiles.v1development.Mapping.Builder.class);
    }

    // Construct using io.opentelemetry.proto.profiles.v1development.Mapping.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      memoryStart_ = 0L;

      memoryLimit_ = 0L;

      fileOffset_ = 0L;

      filenameStrindex_ = 0;

      attributeIndices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      hasFunctions_ = false;

      hasFilenames_ = false;

      hasLineNumbers_ = false;

      hasInlineFrames_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_Mapping_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.profiles.v1development.Mapping getDefaultInstanceForType() {
      return io.opentelemetry.proto.profiles.v1development.Mapping.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.profiles.v1development.Mapping build() {
      io.opentelemetry.proto.profiles.v1development.Mapping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.profiles.v1development.Mapping buildPartial() {
      io.opentelemetry.proto.profiles.v1development.Mapping result = new io.opentelemetry.proto.profiles.v1development.Mapping(this);
      int from_bitField0_ = bitField0_;
      result.memoryStart_ = memoryStart_;
      result.memoryLimit_ = memoryLimit_;
      result.fileOffset_ = fileOffset_;
      result.filenameStrindex_ = filenameStrindex_;
      if (((bitField0_ & 0x00000001) != 0)) {
        attributeIndices_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.attributeIndices_ = attributeIndices_;
      result.hasFunctions_ = hasFunctions_;
      result.hasFilenames_ = hasFilenames_;
      result.hasLineNumbers_ = hasLineNumbers_;
      result.hasInlineFrames_ = hasInlineFrames_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opentelemetry.proto.profiles.v1development.Mapping) {
        return mergeFrom((io.opentelemetry.proto.profiles.v1development.Mapping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.profiles.v1development.Mapping other) {
      if (other == io.opentelemetry.proto.profiles.v1development.Mapping.getDefaultInstance()) return this;
      if (other.getMemoryStart() != 0L) {
        setMemoryStart(other.getMemoryStart());
      }
      if (other.getMemoryLimit() != 0L) {
        setMemoryLimit(other.getMemoryLimit());
      }
      if (other.getFileOffset() != 0L) {
        setFileOffset(other.getFileOffset());
      }
      if (other.getFilenameStrindex() != 0) {
        setFilenameStrindex(other.getFilenameStrindex());
      }
      if (!other.attributeIndices_.isEmpty()) {
        if (attributeIndices_.isEmpty()) {
          attributeIndices_ = other.attributeIndices_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAttributeIndicesIsMutable();
          attributeIndices_.addAll(other.attributeIndices_);
        }
        onChanged();
      }
      if (other.getHasFunctions() != false) {
        setHasFunctions(other.getHasFunctions());
      }
      if (other.getHasFilenames() != false) {
        setHasFilenames(other.getHasFilenames());
      }
      if (other.getHasLineNumbers() != false) {
        setHasLineNumbers(other.getHasLineNumbers());
      }
      if (other.getHasInlineFrames() != false) {
        setHasInlineFrames(other.getHasInlineFrames());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.opentelemetry.proto.profiles.v1development.Mapping parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.profiles.v1development.Mapping) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long memoryStart_ ;
    /**
     * <pre>
     * Address at which the binary (or DLL) is loaded into memory.
     * </pre>
     *
     * <code>uint64 memory_start = 1;</code>
     * @return The memoryStart.
     */
    @java.lang.Override
    public long getMemoryStart() {
      return memoryStart_;
    }
    /**
     * <pre>
     * Address at which the binary (or DLL) is loaded into memory.
     * </pre>
     *
     * <code>uint64 memory_start = 1;</code>
     * @param value The memoryStart to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryStart(long value) {
      
      memoryStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address at which the binary (or DLL) is loaded into memory.
     * </pre>
     *
     * <code>uint64 memory_start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemoryStart() {
      
      memoryStart_ = 0L;
      onChanged();
      return this;
    }

    private long memoryLimit_ ;
    /**
     * <pre>
     * The limit of the address range occupied by this mapping.
     * </pre>
     *
     * <code>uint64 memory_limit = 2;</code>
     * @return The memoryLimit.
     */
    @java.lang.Override
    public long getMemoryLimit() {
      return memoryLimit_;
    }
    /**
     * <pre>
     * The limit of the address range occupied by this mapping.
     * </pre>
     *
     * <code>uint64 memory_limit = 2;</code>
     * @param value The memoryLimit to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryLimit(long value) {
      
      memoryLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The limit of the address range occupied by this mapping.
     * </pre>
     *
     * <code>uint64 memory_limit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemoryLimit() {
      
      memoryLimit_ = 0L;
      onChanged();
      return this;
    }

    private long fileOffset_ ;
    /**
     * <pre>
     * Offset in the binary that corresponds to the first mapped address.
     * </pre>
     *
     * <code>uint64 file_offset = 3;</code>
     * @return The fileOffset.
     */
    @java.lang.Override
    public long getFileOffset() {
      return fileOffset_;
    }
    /**
     * <pre>
     * Offset in the binary that corresponds to the first mapped address.
     * </pre>
     *
     * <code>uint64 file_offset = 3;</code>
     * @param value The fileOffset to set.
     * @return This builder for chaining.
     */
    public Builder setFileOffset(long value) {
      
      fileOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset in the binary that corresponds to the first mapped address.
     * </pre>
     *
     * <code>uint64 file_offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileOffset() {
      
      fileOffset_ = 0L;
      onChanged();
      return this;
    }

    private int filenameStrindex_ ;
    /**
     * <pre>
     * The object this entry is loaded from.  This can be a filename on
     * disk for the main binary and shared libraries, or virtual
     * abstractions like "[vdso]".
     * </pre>
     *
     * <code>int32 filename_strindex = 4;</code>
     * @return The filenameStrindex.
     */
    @java.lang.Override
    public int getFilenameStrindex() {
      return filenameStrindex_;
    }
    /**
     * <pre>
     * The object this entry is loaded from.  This can be a filename on
     * disk for the main binary and shared libraries, or virtual
     * abstractions like "[vdso]".
     * </pre>
     *
     * <code>int32 filename_strindex = 4;</code>
     * @param value The filenameStrindex to set.
     * @return This builder for chaining.
     */
    public Builder setFilenameStrindex(int value) {
      
      filenameStrindex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The object this entry is loaded from.  This can be a filename on
     * disk for the main binary and shared libraries, or virtual
     * abstractions like "[vdso]".
     * </pre>
     *
     * <code>int32 filename_strindex = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilenameStrindex() {
      
      filenameStrindex_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList attributeIndices_ = emptyIntList();
    private void ensureAttributeIndicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attributeIndices_ = mutableCopy(attributeIndices_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @return A list containing the attributeIndices.
     */
    public java.util.List<java.lang.Integer>
        getAttributeIndicesList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(attributeIndices_) : attributeIndices_;
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @return The count of attributeIndices.
     */
    public int getAttributeIndicesCount() {
      return attributeIndices_.size();
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @param index The index of the element to return.
     * @return The attributeIndices at the given index.
     */
    public int getAttributeIndices(int index) {
      return attributeIndices_.getInt(index);
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @param index The index to set the value at.
     * @param value The attributeIndices to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeIndices(
        int index, int value) {
      ensureAttributeIndicesIsMutable();
      attributeIndices_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @param value The attributeIndices to add.
     * @return This builder for chaining.
     */
    public Builder addAttributeIndices(int value) {
      ensureAttributeIndicesIsMutable();
      attributeIndices_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @param values The attributeIndices to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttributeIndices(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAttributeIndicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attributeIndices_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * References to attributes in Profile.attribute_table. [optional]
     * </pre>
     *
     * <code>repeated int32 attribute_indices = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeIndices() {
      attributeIndices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private boolean hasFunctions_ ;
    /**
     * <pre>
     * The following fields indicate the resolution of symbolic info.
     * </pre>
     *
     * <code>bool has_functions = 6;</code>
     * @return The hasFunctions.
     */
    @java.lang.Override
    public boolean getHasFunctions() {
      return hasFunctions_;
    }
    /**
     * <pre>
     * The following fields indicate the resolution of symbolic info.
     * </pre>
     *
     * <code>bool has_functions = 6;</code>
     * @param value The hasFunctions to set.
     * @return This builder for chaining.
     */
    public Builder setHasFunctions(boolean value) {
      
      hasFunctions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The following fields indicate the resolution of symbolic info.
     * </pre>
     *
     * <code>bool has_functions = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasFunctions() {
      
      hasFunctions_ = false;
      onChanged();
      return this;
    }

    private boolean hasFilenames_ ;
    /**
     * <code>bool has_filenames = 7;</code>
     * @return The hasFilenames.
     */
    @java.lang.Override
    public boolean getHasFilenames() {
      return hasFilenames_;
    }
    /**
     * <code>bool has_filenames = 7;</code>
     * @param value The hasFilenames to set.
     * @return This builder for chaining.
     */
    public Builder setHasFilenames(boolean value) {
      
      hasFilenames_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_filenames = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasFilenames() {
      
      hasFilenames_ = false;
      onChanged();
      return this;
    }

    private boolean hasLineNumbers_ ;
    /**
     * <code>bool has_line_numbers = 8;</code>
     * @return The hasLineNumbers.
     */
    @java.lang.Override
    public boolean getHasLineNumbers() {
      return hasLineNumbers_;
    }
    /**
     * <code>bool has_line_numbers = 8;</code>
     * @param value The hasLineNumbers to set.
     * @return This builder for chaining.
     */
    public Builder setHasLineNumbers(boolean value) {
      
      hasLineNumbers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_line_numbers = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasLineNumbers() {
      
      hasLineNumbers_ = false;
      onChanged();
      return this;
    }

    private boolean hasInlineFrames_ ;
    /**
     * <code>bool has_inline_frames = 9;</code>
     * @return The hasInlineFrames.
     */
    @java.lang.Override
    public boolean getHasInlineFrames() {
      return hasInlineFrames_;
    }
    /**
     * <code>bool has_inline_frames = 9;</code>
     * @param value The hasInlineFrames to set.
     * @return This builder for chaining.
     */
    public Builder setHasInlineFrames(boolean value) {
      
      hasInlineFrames_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_inline_frames = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasInlineFrames() {
      
      hasInlineFrames_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.profiles.v1development.Mapping)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.profiles.v1development.Mapping)
  private static final io.opentelemetry.proto.profiles.v1development.Mapping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.profiles.v1development.Mapping();
  }

  public static io.opentelemetry.proto.profiles.v1development.Mapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Mapping>
      PARSER = new com.google.protobuf.AbstractParser<Mapping>() {
    @java.lang.Override
    public Mapping parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Mapping(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Mapping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Mapping> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.profiles.v1development.Mapping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

