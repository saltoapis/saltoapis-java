// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/openingmodeschedule/v1/opening_mode_schedule.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.openingmodeschedule.v1;

/**
 * <pre>
 * The request message for [`CreateOpeningModeSchedule`][salto.nebula.openingmodeschedule.v1.OpeningModeScheduleService.CreateOpeningModeSchedule]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest}
 */
public final class CreateOpeningModeScheduleRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)
    CreateOpeningModeScheduleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateOpeningModeScheduleRequest.class.getName());
  }
  // Use CreateOpeningModeScheduleRequest.newBuilder() to construct.
  private CreateOpeningModeScheduleRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateOpeningModeScheduleRequest() {
    parent_ = "";
    openingModeScheduleId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleProto.internal_static_salto_nebula_openingmodeschedule_v1_CreateOpeningModeScheduleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleProto.internal_static_salto_nebula_openingmodeschedule_v1_CreateOpeningModeScheduleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.class, com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where to create the opening mode
   * schedule. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of the parent resource where to create the opening mode
   * schedule. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPENING_MODE_SCHEDULE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object openingModeScheduleId_ = "";
  /**
   * <pre>
   * The opening mode schedule ID to use for this opening mode schedule. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string opening_mode_schedule_id = 2;</code>
   * @return The openingModeScheduleId.
   */
  @java.lang.Override
  public java.lang.String getOpeningModeScheduleId() {
    java.lang.Object ref = openingModeScheduleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      openingModeScheduleId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The opening mode schedule ID to use for this opening mode schedule. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string opening_mode_schedule_id = 2;</code>
   * @return The bytes for openingModeScheduleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOpeningModeScheduleIdBytes() {
    java.lang.Object ref = openingModeScheduleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      openingModeScheduleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPENING_MODE_SCHEDULE_FIELD_NUMBER = 3;
  private com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule openingModeSchedule_;
  /**
   * <pre>
   * The opening mode schedule resource to be created. Client must not set the
   * `OpeningModeSchedule.name` field.
   * </pre>
   *
   * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
   * @return Whether the openingModeSchedule field is set.
   */
  @java.lang.Override
  public boolean hasOpeningModeSchedule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The opening mode schedule resource to be created. Client must not set the
   * `OpeningModeSchedule.name` field.
   * </pre>
   *
   * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
   * @return The openingModeSchedule.
   */
  @java.lang.Override
  public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule getOpeningModeSchedule() {
    return openingModeSchedule_ == null ? com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance() : openingModeSchedule_;
  }
  /**
   * <pre>
   * The opening mode schedule resource to be created. Client must not set the
   * `OpeningModeSchedule.name` field.
   * </pre>
   *
   * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder getOpeningModeScheduleOrBuilder() {
    return openingModeSchedule_ == null ? com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance() : openingModeSchedule_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(openingModeScheduleId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, openingModeScheduleId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getOpeningModeSchedule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(openingModeScheduleId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, openingModeScheduleId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOpeningModeSchedule());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest other = (com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getOpeningModeScheduleId()
        .equals(other.getOpeningModeScheduleId())) return false;
    if (hasOpeningModeSchedule() != other.hasOpeningModeSchedule()) return false;
    if (hasOpeningModeSchedule()) {
      if (!getOpeningModeSchedule()
          .equals(other.getOpeningModeSchedule())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + OPENING_MODE_SCHEDULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOpeningModeScheduleId().hashCode();
    if (hasOpeningModeSchedule()) {
      hash = (37 * hash) + OPENING_MODE_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getOpeningModeSchedule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message for [`CreateOpeningModeSchedule`][salto.nebula.openingmodeschedule.v1.OpeningModeScheduleService.CreateOpeningModeSchedule]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)
      com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleProto.internal_static_salto_nebula_openingmodeschedule_v1_CreateOpeningModeScheduleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleProto.internal_static_salto_nebula_openingmodeschedule_v1_CreateOpeningModeScheduleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.class, com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getOpeningModeScheduleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      openingModeScheduleId_ = "";
      openingModeSchedule_ = null;
      if (openingModeScheduleBuilder_ != null) {
        openingModeScheduleBuilder_.dispose();
        openingModeScheduleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleProto.internal_static_salto_nebula_openingmodeschedule_v1_CreateOpeningModeScheduleRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest build() {
      com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest buildPartial() {
      com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest result = new com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.openingModeScheduleId_ = openingModeScheduleId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.openingModeSchedule_ = openingModeScheduleBuilder_ == null
            ? openingModeSchedule_
            : openingModeScheduleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest) {
        return mergeFrom((com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest other) {
      if (other == com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOpeningModeScheduleId().isEmpty()) {
        openingModeScheduleId_ = other.openingModeScheduleId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasOpeningModeSchedule()) {
        mergeOpeningModeSchedule(other.getOpeningModeSchedule());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              openingModeScheduleId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getOpeningModeScheduleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Resource name of the parent resource where to create the opening mode
     * schedule. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the opening mode
     * schedule. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the opening mode
     * schedule. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the opening mode
     * schedule. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the opening mode
     * schedule. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object openingModeScheduleId_ = "";
    /**
     * <pre>
     * The opening mode schedule ID to use for this opening mode schedule. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string opening_mode_schedule_id = 2;</code>
     * @return The openingModeScheduleId.
     */
    public java.lang.String getOpeningModeScheduleId() {
      java.lang.Object ref = openingModeScheduleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        openingModeScheduleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The opening mode schedule ID to use for this opening mode schedule. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string opening_mode_schedule_id = 2;</code>
     * @return The bytes for openingModeScheduleId.
     */
    public com.google.protobuf.ByteString
        getOpeningModeScheduleIdBytes() {
      java.lang.Object ref = openingModeScheduleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        openingModeScheduleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The opening mode schedule ID to use for this opening mode schedule. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string opening_mode_schedule_id = 2;</code>
     * @param value The openingModeScheduleId to set.
     * @return This builder for chaining.
     */
    public Builder setOpeningModeScheduleId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      openingModeScheduleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The opening mode schedule ID to use for this opening mode schedule. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string opening_mode_schedule_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpeningModeScheduleId() {
      openingModeScheduleId_ = getDefaultInstance().getOpeningModeScheduleId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The opening mode schedule ID to use for this opening mode schedule. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string opening_mode_schedule_id = 2;</code>
     * @param value The bytes for openingModeScheduleId to set.
     * @return This builder for chaining.
     */
    public Builder setOpeningModeScheduleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      openingModeScheduleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule openingModeSchedule_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Builder, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder> openingModeScheduleBuilder_;
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     * @return Whether the openingModeSchedule field is set.
     */
    public boolean hasOpeningModeSchedule() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     * @return The openingModeSchedule.
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule getOpeningModeSchedule() {
      if (openingModeScheduleBuilder_ == null) {
        return openingModeSchedule_ == null ? com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance() : openingModeSchedule_;
      } else {
        return openingModeScheduleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    public Builder setOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule value) {
      if (openingModeScheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        openingModeSchedule_ = value;
      } else {
        openingModeScheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    public Builder setOpeningModeSchedule(
        com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Builder builderForValue) {
      if (openingModeScheduleBuilder_ == null) {
        openingModeSchedule_ = builderForValue.build();
      } else {
        openingModeScheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    public Builder mergeOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule value) {
      if (openingModeScheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          openingModeSchedule_ != null &&
          openingModeSchedule_ != com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance()) {
          getOpeningModeScheduleBuilder().mergeFrom(value);
        } else {
          openingModeSchedule_ = value;
        }
      } else {
        openingModeScheduleBuilder_.mergeFrom(value);
      }
      if (openingModeSchedule_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    public Builder clearOpeningModeSchedule() {
      bitField0_ = (bitField0_ & ~0x00000004);
      openingModeSchedule_ = null;
      if (openingModeScheduleBuilder_ != null) {
        openingModeScheduleBuilder_.dispose();
        openingModeScheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Builder getOpeningModeScheduleBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOpeningModeScheduleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder getOpeningModeScheduleOrBuilder() {
      if (openingModeScheduleBuilder_ != null) {
        return openingModeScheduleBuilder_.getMessageOrBuilder();
      } else {
        return openingModeSchedule_ == null ?
            com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance() : openingModeSchedule_;
      }
    }
    /**
     * <pre>
     * The opening mode schedule resource to be created. Client must not set the
     * `OpeningModeSchedule.name` field.
     * </pre>
     *
     * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Builder, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder> 
        getOpeningModeScheduleFieldBuilder() {
      if (openingModeScheduleBuilder_ == null) {
        openingModeScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Builder, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder>(
                getOpeningModeSchedule(),
                getParentForChildren(),
                isClean());
        openingModeSchedule_ = null;
      }
      return openingModeScheduleBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)
  private static final com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest();
  }

  public static com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOpeningModeScheduleRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateOpeningModeScheduleRequest>() {
    @java.lang.Override
    public CreateOpeningModeScheduleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateOpeningModeScheduleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOpeningModeScheduleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

