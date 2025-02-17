// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/profiles/v1development/profiles.proto

package io.opentelemetry.proto.profiles.v1development;

/**
 * <pre>
 * ProfilesData represents the profiles data that can be stored in persistent storage,
 * OR can be embedded by other protocols that transfer OTLP profiles data but do not
 * implement the OTLP protocol.
 * The main difference between this message and collector protocol is that
 * in this message there will not be any "control" or "metadata" specific to
 * OTLP protocol.
 * When new fields are added into this message, the OTLP request MUST be updated
 * as well.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.profiles.v1development.ProfilesData}
 */
public final class ProfilesData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.profiles.v1development.ProfilesData)
    ProfilesDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProfilesData.newBuilder() to construct.
  private ProfilesData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProfilesData() {
    resourceProfiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProfilesData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProfilesData(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              resourceProfiles_ = new java.util.ArrayList<io.opentelemetry.proto.profiles.v1development.ResourceProfiles>();
              mutable_bitField0_ |= 0x00000001;
            }
            resourceProfiles_.add(
                input.readMessage(io.opentelemetry.proto.profiles.v1development.ResourceProfiles.parser(), extensionRegistry));
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
        resourceProfiles_ = java.util.Collections.unmodifiableList(resourceProfiles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_ProfilesData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_ProfilesData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.profiles.v1development.ProfilesData.class, io.opentelemetry.proto.profiles.v1development.ProfilesData.Builder.class);
  }

  public static final int RESOURCE_PROFILES_FIELD_NUMBER = 1;
  private java.util.List<io.opentelemetry.proto.profiles.v1development.ResourceProfiles> resourceProfiles_;
  /**
   * <pre>
   * An array of ResourceProfiles.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.opentelemetry.proto.profiles.v1development.ResourceProfiles> getResourceProfilesList() {
    return resourceProfiles_;
  }
  /**
   * <pre>
   * An array of ResourceProfiles.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder> 
      getResourceProfilesOrBuilderList() {
    return resourceProfiles_;
  }
  /**
   * <pre>
   * An array of ResourceProfiles.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
   */
  @java.lang.Override
  public int getResourceProfilesCount() {
    return resourceProfiles_.size();
  }
  /**
   * <pre>
   * An array of ResourceProfiles.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
   */
  @java.lang.Override
  public io.opentelemetry.proto.profiles.v1development.ResourceProfiles getResourceProfiles(int index) {
    return resourceProfiles_.get(index);
  }
  /**
   * <pre>
   * An array of ResourceProfiles.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
   */
  @java.lang.Override
  public io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder getResourceProfilesOrBuilder(
      int index) {
    return resourceProfiles_.get(index);
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
    for (int i = 0; i < resourceProfiles_.size(); i++) {
      output.writeMessage(1, resourceProfiles_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < resourceProfiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, resourceProfiles_.get(i));
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
    if (!(obj instanceof io.opentelemetry.proto.profiles.v1development.ProfilesData)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.profiles.v1development.ProfilesData other = (io.opentelemetry.proto.profiles.v1development.ProfilesData) obj;

    if (!getResourceProfilesList()
        .equals(other.getResourceProfilesList())) return false;
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
    if (getResourceProfilesCount() > 0) {
      hash = (37 * hash) + RESOURCE_PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getResourceProfilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentelemetry.proto.profiles.v1development.ProfilesData parseFrom(
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
  public static Builder newBuilder(io.opentelemetry.proto.profiles.v1development.ProfilesData prototype) {
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
   * ProfilesData represents the profiles data that can be stored in persistent storage,
   * OR can be embedded by other protocols that transfer OTLP profiles data but do not
   * implement the OTLP protocol.
   * The main difference between this message and collector protocol is that
   * in this message there will not be any "control" or "metadata" specific to
   * OTLP protocol.
   * When new fields are added into this message, the OTLP request MUST be updated
   * as well.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.profiles.v1development.ProfilesData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.profiles.v1development.ProfilesData)
      io.opentelemetry.proto.profiles.v1development.ProfilesDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_ProfilesData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_ProfilesData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.profiles.v1development.ProfilesData.class, io.opentelemetry.proto.profiles.v1development.ProfilesData.Builder.class);
    }

    // Construct using io.opentelemetry.proto.profiles.v1development.ProfilesData.newBuilder()
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
        getResourceProfilesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resourceProfilesBuilder_ == null) {
        resourceProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resourceProfilesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesProto.internal_static_opentelemetry_proto_profiles_v1development_ProfilesData_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.profiles.v1development.ProfilesData getDefaultInstanceForType() {
      return io.opentelemetry.proto.profiles.v1development.ProfilesData.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.profiles.v1development.ProfilesData build() {
      io.opentelemetry.proto.profiles.v1development.ProfilesData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.profiles.v1development.ProfilesData buildPartial() {
      io.opentelemetry.proto.profiles.v1development.ProfilesData result = new io.opentelemetry.proto.profiles.v1development.ProfilesData(this);
      int from_bitField0_ = bitField0_;
      if (resourceProfilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceProfiles_ = java.util.Collections.unmodifiableList(resourceProfiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceProfiles_ = resourceProfiles_;
      } else {
        result.resourceProfiles_ = resourceProfilesBuilder_.build();
      }
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
      if (other instanceof io.opentelemetry.proto.profiles.v1development.ProfilesData) {
        return mergeFrom((io.opentelemetry.proto.profiles.v1development.ProfilesData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.profiles.v1development.ProfilesData other) {
      if (other == io.opentelemetry.proto.profiles.v1development.ProfilesData.getDefaultInstance()) return this;
      if (resourceProfilesBuilder_ == null) {
        if (!other.resourceProfiles_.isEmpty()) {
          if (resourceProfiles_.isEmpty()) {
            resourceProfiles_ = other.resourceProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceProfilesIsMutable();
            resourceProfiles_.addAll(other.resourceProfiles_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceProfiles_.isEmpty()) {
          if (resourceProfilesBuilder_.isEmpty()) {
            resourceProfilesBuilder_.dispose();
            resourceProfilesBuilder_ = null;
            resourceProfiles_ = other.resourceProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceProfilesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResourceProfilesFieldBuilder() : null;
          } else {
            resourceProfilesBuilder_.addAllMessages(other.resourceProfiles_);
          }
        }
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
      io.opentelemetry.proto.profiles.v1development.ProfilesData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.profiles.v1development.ProfilesData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.opentelemetry.proto.profiles.v1development.ResourceProfiles> resourceProfiles_ =
      java.util.Collections.emptyList();
    private void ensureResourceProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceProfiles_ = new java.util.ArrayList<io.opentelemetry.proto.profiles.v1development.ResourceProfiles>(resourceProfiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentelemetry.proto.profiles.v1development.ResourceProfiles, io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder, io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder> resourceProfilesBuilder_;

    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public java.util.List<io.opentelemetry.proto.profiles.v1development.ResourceProfiles> getResourceProfilesList() {
      if (resourceProfilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceProfiles_);
      } else {
        return resourceProfilesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public int getResourceProfilesCount() {
      if (resourceProfilesBuilder_ == null) {
        return resourceProfiles_.size();
      } else {
        return resourceProfilesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public io.opentelemetry.proto.profiles.v1development.ResourceProfiles getResourceProfiles(int index) {
      if (resourceProfilesBuilder_ == null) {
        return resourceProfiles_.get(index);
      } else {
        return resourceProfilesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder setResourceProfiles(
        int index, io.opentelemetry.proto.profiles.v1development.ResourceProfiles value) {
      if (resourceProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceProfilesIsMutable();
        resourceProfiles_.set(index, value);
        onChanged();
      } else {
        resourceProfilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder setResourceProfiles(
        int index, io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder builderForValue) {
      if (resourceProfilesBuilder_ == null) {
        ensureResourceProfilesIsMutable();
        resourceProfiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceProfilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder addResourceProfiles(io.opentelemetry.proto.profiles.v1development.ResourceProfiles value) {
      if (resourceProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceProfilesIsMutable();
        resourceProfiles_.add(value);
        onChanged();
      } else {
        resourceProfilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder addResourceProfiles(
        int index, io.opentelemetry.proto.profiles.v1development.ResourceProfiles value) {
      if (resourceProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceProfilesIsMutable();
        resourceProfiles_.add(index, value);
        onChanged();
      } else {
        resourceProfilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder addResourceProfiles(
        io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder builderForValue) {
      if (resourceProfilesBuilder_ == null) {
        ensureResourceProfilesIsMutable();
        resourceProfiles_.add(builderForValue.build());
        onChanged();
      } else {
        resourceProfilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder addResourceProfiles(
        int index, io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder builderForValue) {
      if (resourceProfilesBuilder_ == null) {
        ensureResourceProfilesIsMutable();
        resourceProfiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceProfilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder addAllResourceProfiles(
        java.lang.Iterable<? extends io.opentelemetry.proto.profiles.v1development.ResourceProfiles> values) {
      if (resourceProfilesBuilder_ == null) {
        ensureResourceProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resourceProfiles_);
        onChanged();
      } else {
        resourceProfilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder clearResourceProfiles() {
      if (resourceProfilesBuilder_ == null) {
        resourceProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceProfilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public Builder removeResourceProfiles(int index) {
      if (resourceProfilesBuilder_ == null) {
        ensureResourceProfilesIsMutable();
        resourceProfiles_.remove(index);
        onChanged();
      } else {
        resourceProfilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder getResourceProfilesBuilder(
        int index) {
      return getResourceProfilesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder getResourceProfilesOrBuilder(
        int index) {
      if (resourceProfilesBuilder_ == null) {
        return resourceProfiles_.get(index);  } else {
        return resourceProfilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public java.util.List<? extends io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder> 
         getResourceProfilesOrBuilderList() {
      if (resourceProfilesBuilder_ != null) {
        return resourceProfilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceProfiles_);
      }
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder addResourceProfilesBuilder() {
      return getResourceProfilesFieldBuilder().addBuilder(
          io.opentelemetry.proto.profiles.v1development.ResourceProfiles.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder addResourceProfilesBuilder(
        int index) {
      return getResourceProfilesFieldBuilder().addBuilder(
          index, io.opentelemetry.proto.profiles.v1development.ResourceProfiles.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of ResourceProfiles.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.profiles.v1development.ResourceProfiles resource_profiles = 1;</code>
     */
    public java.util.List<io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder> 
         getResourceProfilesBuilderList() {
      return getResourceProfilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentelemetry.proto.profiles.v1development.ResourceProfiles, io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder, io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder> 
        getResourceProfilesFieldBuilder() {
      if (resourceProfilesBuilder_ == null) {
        resourceProfilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.opentelemetry.proto.profiles.v1development.ResourceProfiles, io.opentelemetry.proto.profiles.v1development.ResourceProfiles.Builder, io.opentelemetry.proto.profiles.v1development.ResourceProfilesOrBuilder>(
                resourceProfiles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        resourceProfiles_ = null;
      }
      return resourceProfilesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.profiles.v1development.ProfilesData)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.profiles.v1development.ProfilesData)
  private static final io.opentelemetry.proto.profiles.v1development.ProfilesData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.profiles.v1development.ProfilesData();
  }

  public static io.opentelemetry.proto.profiles.v1development.ProfilesData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProfilesData>
      PARSER = new com.google.protobuf.AbstractParser<ProfilesData>() {
    @java.lang.Override
    public ProfilesData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProfilesData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProfilesData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProfilesData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.profiles.v1development.ProfilesData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

