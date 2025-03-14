// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/extender/v1/extender.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.extender.v1;

/**
 * <pre>
 * The request message for [CreateExtender][salto.nebula.extender.v1.ExtenderService.CreateExtender]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.extender.v1.CreateExtenderRequest}
 */
public final class CreateExtenderRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.extender.v1.CreateExtenderRequest)
    CreateExtenderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateExtenderRequest.class.getName());
  }
  // Use CreateExtenderRequest.newBuilder() to construct.
  private CreateExtenderRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateExtenderRequest() {
    parent_ = "";
    extenderId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_CreateExtenderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_CreateExtenderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.extender.v1.CreateExtenderRequest.class, com.saltoapis.nebula.extender.v1.CreateExtenderRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where to create the extender. For
   * example, `installations/surelock-homes-hq`.
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
   * Resource name of the parent resource where to create the extender. For
   * example, `installations/surelock-homes-hq`.
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

  public static final int EXTENDER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object extenderId_ = "";
  /**
   * <pre>
   * The extender ID to use for this extender. In case it's empty
   * the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string extender_id = 2;</code>
   * @return Whether the extenderId field is set.
   */
  @java.lang.Override
  public boolean hasExtenderId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The extender ID to use for this extender. In case it's empty
   * the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string extender_id = 2;</code>
   * @return The extenderId.
   */
  @java.lang.Override
  public java.lang.String getExtenderId() {
    java.lang.Object ref = extenderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extenderId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The extender ID to use for this extender. In case it's empty
   * the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string extender_id = 2;</code>
   * @return The bytes for extenderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtenderIdBytes() {
    java.lang.Object ref = extenderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extenderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENDER_FIELD_NUMBER = 3;
  private com.saltoapis.nebula.extender.v1.Extender extender_;
  /**
   * <pre>
   * The extender resource to be created. Client must not set the
   * `Extender.name` field.
   * </pre>
   *
   * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
   * @return Whether the extender field is set.
   */
  @java.lang.Override
  public boolean hasExtender() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The extender resource to be created. Client must not set the
   * `Extender.name` field.
   * </pre>
   *
   * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
   * @return The extender.
   */
  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.Extender getExtender() {
    return extender_ == null ? com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance() : extender_;
  }
  /**
   * <pre>
   * The extender resource to be created. Client must not set the
   * `Extender.name` field.
   * </pre>
   *
   * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.ExtenderOrBuilder getExtenderOrBuilder() {
    return extender_ == null ? com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance() : extender_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, extenderId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getExtender());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, extenderId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExtender());
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
    if (!(obj instanceof com.saltoapis.nebula.extender.v1.CreateExtenderRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.extender.v1.CreateExtenderRequest other = (com.saltoapis.nebula.extender.v1.CreateExtenderRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasExtenderId() != other.hasExtenderId()) return false;
    if (hasExtenderId()) {
      if (!getExtenderId()
          .equals(other.getExtenderId())) return false;
    }
    if (hasExtender() != other.hasExtender()) return false;
    if (hasExtender()) {
      if (!getExtender()
          .equals(other.getExtender())) return false;
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
    if (hasExtenderId()) {
      hash = (37 * hash) + EXTENDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getExtenderId().hashCode();
    }
    if (hasExtender()) {
      hash = (37 * hash) + EXTENDER_FIELD_NUMBER;
      hash = (53 * hash) + getExtender().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.extender.v1.CreateExtenderRequest prototype) {
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
   * The request message for [CreateExtender][salto.nebula.extender.v1.ExtenderService.CreateExtender]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.extender.v1.CreateExtenderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.extender.v1.CreateExtenderRequest)
      com.saltoapis.nebula.extender.v1.CreateExtenderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_CreateExtenderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_CreateExtenderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.extender.v1.CreateExtenderRequest.class, com.saltoapis.nebula.extender.v1.CreateExtenderRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.extender.v1.CreateExtenderRequest.newBuilder()
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
        getExtenderFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      extenderId_ = "";
      extender_ = null;
      if (extenderBuilder_ != null) {
        extenderBuilder_.dispose();
        extenderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_CreateExtenderRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.CreateExtenderRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.extender.v1.CreateExtenderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.CreateExtenderRequest build() {
      com.saltoapis.nebula.extender.v1.CreateExtenderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.CreateExtenderRequest buildPartial() {
      com.saltoapis.nebula.extender.v1.CreateExtenderRequest result = new com.saltoapis.nebula.extender.v1.CreateExtenderRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.extender.v1.CreateExtenderRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.extenderId_ = extenderId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.extender_ = extenderBuilder_ == null
            ? extender_
            : extenderBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.extender.v1.CreateExtenderRequest) {
        return mergeFrom((com.saltoapis.nebula.extender.v1.CreateExtenderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.extender.v1.CreateExtenderRequest other) {
      if (other == com.saltoapis.nebula.extender.v1.CreateExtenderRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExtenderId()) {
        extenderId_ = other.extenderId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasExtender()) {
        mergeExtender(other.getExtender());
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
              extenderId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getExtenderFieldBuilder().getBuilder(),
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
     * Resource name of the parent resource where to create the extender. For
     * example, `installations/surelock-homes-hq`.
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
     * Resource name of the parent resource where to create the extender. For
     * example, `installations/surelock-homes-hq`.
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
     * Resource name of the parent resource where to create the extender. For
     * example, `installations/surelock-homes-hq`.
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
     * Resource name of the parent resource where to create the extender. For
     * example, `installations/surelock-homes-hq`.
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
     * Resource name of the parent resource where to create the extender. For
     * example, `installations/surelock-homes-hq`.
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

    private java.lang.Object extenderId_ = "";
    /**
     * <pre>
     * The extender ID to use for this extender. In case it's empty
     * the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string extender_id = 2;</code>
     * @return Whether the extenderId field is set.
     */
    public boolean hasExtenderId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The extender ID to use for this extender. In case it's empty
     * the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string extender_id = 2;</code>
     * @return The extenderId.
     */
    public java.lang.String getExtenderId() {
      java.lang.Object ref = extenderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extenderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The extender ID to use for this extender. In case it's empty
     * the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string extender_id = 2;</code>
     * @return The bytes for extenderId.
     */
    public com.google.protobuf.ByteString
        getExtenderIdBytes() {
      java.lang.Object ref = extenderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extenderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The extender ID to use for this extender. In case it's empty
     * the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string extender_id = 2;</code>
     * @param value The extenderId to set.
     * @return This builder for chaining.
     */
    public Builder setExtenderId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      extenderId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extender ID to use for this extender. In case it's empty
     * the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string extender_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExtenderId() {
      extenderId_ = getDefaultInstance().getExtenderId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extender ID to use for this extender. In case it's empty
     * the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string extender_id = 2;</code>
     * @param value The bytes for extenderId to set.
     * @return This builder for chaining.
     */
    public Builder setExtenderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      extenderId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.saltoapis.nebula.extender.v1.Extender extender_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.extender.v1.Extender, com.saltoapis.nebula.extender.v1.Extender.Builder, com.saltoapis.nebula.extender.v1.ExtenderOrBuilder> extenderBuilder_;
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     * @return Whether the extender field is set.
     */
    public boolean hasExtender() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     * @return The extender.
     */
    public com.saltoapis.nebula.extender.v1.Extender getExtender() {
      if (extenderBuilder_ == null) {
        return extender_ == null ? com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance() : extender_;
      } else {
        return extenderBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    public Builder setExtender(com.saltoapis.nebula.extender.v1.Extender value) {
      if (extenderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extender_ = value;
      } else {
        extenderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    public Builder setExtender(
        com.saltoapis.nebula.extender.v1.Extender.Builder builderForValue) {
      if (extenderBuilder_ == null) {
        extender_ = builderForValue.build();
      } else {
        extenderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    public Builder mergeExtender(com.saltoapis.nebula.extender.v1.Extender value) {
      if (extenderBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          extender_ != null &&
          extender_ != com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance()) {
          getExtenderBuilder().mergeFrom(value);
        } else {
          extender_ = value;
        }
      } else {
        extenderBuilder_.mergeFrom(value);
      }
      if (extender_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    public Builder clearExtender() {
      bitField0_ = (bitField0_ & ~0x00000004);
      extender_ = null;
      if (extenderBuilder_ != null) {
        extenderBuilder_.dispose();
        extenderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    public com.saltoapis.nebula.extender.v1.Extender.Builder getExtenderBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getExtenderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    public com.saltoapis.nebula.extender.v1.ExtenderOrBuilder getExtenderOrBuilder() {
      if (extenderBuilder_ != null) {
        return extenderBuilder_.getMessageOrBuilder();
      } else {
        return extender_ == null ?
            com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance() : extender_;
      }
    }
    /**
     * <pre>
     * The extender resource to be created. Client must not set the
     * `Extender.name` field.
     * </pre>
     *
     * <code>.salto.nebula.extender.v1.Extender extender = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.extender.v1.Extender, com.saltoapis.nebula.extender.v1.Extender.Builder, com.saltoapis.nebula.extender.v1.ExtenderOrBuilder> 
        getExtenderFieldBuilder() {
      if (extenderBuilder_ == null) {
        extenderBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.extender.v1.Extender, com.saltoapis.nebula.extender.v1.Extender.Builder, com.saltoapis.nebula.extender.v1.ExtenderOrBuilder>(
                getExtender(),
                getParentForChildren(),
                isClean());
        extender_ = null;
      }
      return extenderBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.extender.v1.CreateExtenderRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.extender.v1.CreateExtenderRequest)
  private static final com.saltoapis.nebula.extender.v1.CreateExtenderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.extender.v1.CreateExtenderRequest();
  }

  public static com.saltoapis.nebula.extender.v1.CreateExtenderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExtenderRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateExtenderRequest>() {
    @java.lang.Override
    public CreateExtenderRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateExtenderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExtenderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.CreateExtenderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

