// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/gateway/v1/gateway.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.gateway.v1;

/**
 * <pre>
 * The request message for [CreateGateway][salto.nebula.gateway.v1.GatewayService.CreateGateway]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.gateway.v1.CreateGatewayRequest}
 */
public final class CreateGatewayRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.gateway.v1.CreateGatewayRequest)
    CreateGatewayRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      CreateGatewayRequest.class.getName());
  }
  // Use CreateGatewayRequest.newBuilder() to construct.
  private CreateGatewayRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateGatewayRequest() {
    parent_ = "";
    gatewayId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_CreateGatewayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_CreateGatewayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.class, com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where to create the gateway. For
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
   * Resource name of the parent resource where to create the gateway. For
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

  public static final int GATEWAY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gatewayId_ = "";
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @return Whether the gatewayId field is set.
   */
  @java.lang.Override
  public boolean hasGatewayId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @return The gatewayId.
   */
  @java.lang.Override
  public java.lang.String getGatewayId() {
    java.lang.Object ref = gatewayId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gatewayId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @return The bytes for gatewayId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGatewayIdBytes() {
    java.lang.Object ref = gatewayId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gatewayId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GATEWAY_FIELD_NUMBER = 3;
  private com.saltoapis.nebula.gateway.v1.Gateway gateway_;
  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   * @return Whether the gateway field is set.
   */
  @java.lang.Override
  public boolean hasGateway() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   * @return The gateway.
   */
  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.Gateway getGateway() {
    return gateway_ == null ? com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance() : gateway_;
  }
  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.GatewayOrBuilder getGatewayOrBuilder() {
    return gateway_ == null ? com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance() : gateway_;
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
      com.google.protobuf.GeneratedMessage.writeString(output, 2, gatewayId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getGateway());
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
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, gatewayId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGateway());
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
    if (!(obj instanceof com.saltoapis.nebula.gateway.v1.CreateGatewayRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.gateway.v1.CreateGatewayRequest other = (com.saltoapis.nebula.gateway.v1.CreateGatewayRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasGatewayId() != other.hasGatewayId()) return false;
    if (hasGatewayId()) {
      if (!getGatewayId()
          .equals(other.getGatewayId())) return false;
    }
    if (hasGateway() != other.hasGateway()) return false;
    if (hasGateway()) {
      if (!getGateway()
          .equals(other.getGateway())) return false;
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
    if (hasGatewayId()) {
      hash = (37 * hash) + GATEWAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGatewayId().hashCode();
    }
    if (hasGateway()) {
      hash = (37 * hash) + GATEWAY_FIELD_NUMBER;
      hash = (53 * hash) + getGateway().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest prototype) {
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
   * The request message for [CreateGateway][salto.nebula.gateway.v1.GatewayService.CreateGateway]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.gateway.v1.CreateGatewayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.gateway.v1.CreateGatewayRequest)
      com.saltoapis.nebula.gateway.v1.CreateGatewayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_CreateGatewayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_CreateGatewayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.class, com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.newBuilder()
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
        getGatewayFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      gatewayId_ = "";
      gateway_ = null;
      if (gatewayBuilder_ != null) {
        gatewayBuilder_.dispose();
        gatewayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_CreateGatewayRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.CreateGatewayRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.CreateGatewayRequest build() {
      com.saltoapis.nebula.gateway.v1.CreateGatewayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.CreateGatewayRequest buildPartial() {
      com.saltoapis.nebula.gateway.v1.CreateGatewayRequest result = new com.saltoapis.nebula.gateway.v1.CreateGatewayRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gatewayId_ = gatewayId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gateway_ = gatewayBuilder_ == null
            ? gateway_
            : gatewayBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.gateway.v1.CreateGatewayRequest) {
        return mergeFrom((com.saltoapis.nebula.gateway.v1.CreateGatewayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest other) {
      if (other == com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGatewayId()) {
        gatewayId_ = other.gatewayId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasGateway()) {
        mergeGateway(other.getGateway());
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
              gatewayId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getGatewayFieldBuilder().getBuilder(),
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
     * Resource name of the parent resource where to create the gateway. For
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
     * Resource name of the parent resource where to create the gateway. For
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
     * Resource name of the parent resource where to create the gateway. For
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
     * Resource name of the parent resource where to create the gateway. For
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
     * Resource name of the parent resource where to create the gateway. For
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

    private java.lang.Object gatewayId_ = "";
    /**
     * <pre>
     * The gateway ID to use for this gateway. In case it's empty the
     * server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string gateway_id = 2;</code>
     * @return Whether the gatewayId field is set.
     */
    public boolean hasGatewayId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The gateway ID to use for this gateway. In case it's empty the
     * server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string gateway_id = 2;</code>
     * @return The gatewayId.
     */
    public java.lang.String getGatewayId() {
      java.lang.Object ref = gatewayId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gatewayId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The gateway ID to use for this gateway. In case it's empty the
     * server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string gateway_id = 2;</code>
     * @return The bytes for gatewayId.
     */
    public com.google.protobuf.ByteString
        getGatewayIdBytes() {
      java.lang.Object ref = gatewayId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gatewayId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The gateway ID to use for this gateway. In case it's empty the
     * server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string gateway_id = 2;</code>
     * @param value The gatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gatewayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway ID to use for this gateway. In case it's empty the
     * server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string gateway_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGatewayId() {
      gatewayId_ = getDefaultInstance().getGatewayId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway ID to use for this gateway. In case it's empty the
     * server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string gateway_id = 2;</code>
     * @param value The bytes for gatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gatewayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.saltoapis.nebula.gateway.v1.Gateway gateway_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.gateway.v1.Gateway, com.saltoapis.nebula.gateway.v1.Gateway.Builder, com.saltoapis.nebula.gateway.v1.GatewayOrBuilder> gatewayBuilder_;
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     * @return Whether the gateway field is set.
     */
    public boolean hasGateway() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     * @return The gateway.
     */
    public com.saltoapis.nebula.gateway.v1.Gateway getGateway() {
      if (gatewayBuilder_ == null) {
        return gateway_ == null ? com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance() : gateway_;
      } else {
        return gatewayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    public Builder setGateway(com.saltoapis.nebula.gateway.v1.Gateway value) {
      if (gatewayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gateway_ = value;
      } else {
        gatewayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    public Builder setGateway(
        com.saltoapis.nebula.gateway.v1.Gateway.Builder builderForValue) {
      if (gatewayBuilder_ == null) {
        gateway_ = builderForValue.build();
      } else {
        gatewayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    public Builder mergeGateway(com.saltoapis.nebula.gateway.v1.Gateway value) {
      if (gatewayBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          gateway_ != null &&
          gateway_ != com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance()) {
          getGatewayBuilder().mergeFrom(value);
        } else {
          gateway_ = value;
        }
      } else {
        gatewayBuilder_.mergeFrom(value);
      }
      if (gateway_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    public Builder clearGateway() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gateway_ = null;
      if (gatewayBuilder_ != null) {
        gatewayBuilder_.dispose();
        gatewayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    public com.saltoapis.nebula.gateway.v1.Gateway.Builder getGatewayBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGatewayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    public com.saltoapis.nebula.gateway.v1.GatewayOrBuilder getGatewayOrBuilder() {
      if (gatewayBuilder_ != null) {
        return gatewayBuilder_.getMessageOrBuilder();
      } else {
        return gateway_ == null ?
            com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance() : gateway_;
      }
    }
    /**
     * <pre>
     * The gateway resource to be created. Client must not set the
     * `Gateway.name` field.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.gateway.v1.Gateway, com.saltoapis.nebula.gateway.v1.Gateway.Builder, com.saltoapis.nebula.gateway.v1.GatewayOrBuilder> 
        getGatewayFieldBuilder() {
      if (gatewayBuilder_ == null) {
        gatewayBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.gateway.v1.Gateway, com.saltoapis.nebula.gateway.v1.Gateway.Builder, com.saltoapis.nebula.gateway.v1.GatewayOrBuilder>(
                getGateway(),
                getParentForChildren(),
                isClean());
        gateway_ = null;
      }
      return gatewayBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.gateway.v1.CreateGatewayRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.gateway.v1.CreateGatewayRequest)
  private static final com.saltoapis.nebula.gateway.v1.CreateGatewayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.gateway.v1.CreateGatewayRequest();
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGatewayRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateGatewayRequest>() {
    @java.lang.Override
    public CreateGatewayRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateGatewayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGatewayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.CreateGatewayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

