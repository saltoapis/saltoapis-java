// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/gateway/v1/gateway.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.gateway.v1;

/**
 * <pre>
 * The request message for [UpdateGateway][salto.nebula.gateway.v1.GatewayService.UpdateGateway]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.gateway.v1.UpdateGatewayRequest}
 */
public final class UpdateGatewayRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.gateway.v1.UpdateGatewayRequest)
    UpdateGatewayRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UpdateGatewayRequest.class.getName());
  }
  // Use UpdateGatewayRequest.newBuilder() to construct.
  private UpdateGatewayRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateGatewayRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_UpdateGatewayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_UpdateGatewayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.class, com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.Builder.class);
  }

  private int bitField0_;
  public static final int GATEWAY_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.gateway.v1.Gateway gateway_;
  /**
   * <pre>
   * The gateway resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
   * @return Whether the gateway field is set.
   */
  @java.lang.Override
  public boolean hasGateway() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The gateway resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
   * @return The gateway.
   */
  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.Gateway getGateway() {
    return gateway_ == null ? com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance() : gateway_;
  }
  /**
   * <pre>
   * The gateway resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.GatewayOrBuilder getGatewayOrBuilder() {
    return gateway_ == null ? com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance() : gateway_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getGateway());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGateway());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest other = (com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest) obj;

    if (hasGateway() != other.hasGateway()) return false;
    if (hasGateway()) {
      if (!getGateway()
          .equals(other.getGateway())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasGateway()) {
      hash = (37 * hash) + GATEWAY_FIELD_NUMBER;
      hash = (53 * hash) + getGateway().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest prototype) {
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
   * The request message for [UpdateGateway][salto.nebula.gateway.v1.GatewayService.UpdateGateway]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.gateway.v1.UpdateGatewayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.gateway.v1.UpdateGatewayRequest)
      com.saltoapis.nebula.gateway.v1.UpdateGatewayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_UpdateGatewayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_UpdateGatewayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.class, com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.newBuilder()
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
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gateway_ = null;
      if (gatewayBuilder_ != null) {
        gatewayBuilder_.dispose();
        gatewayBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_UpdateGatewayRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest build() {
      com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest buildPartial() {
      com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest result = new com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gateway_ = gatewayBuilder_ == null
            ? gateway_
            : gatewayBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest) {
        return mergeFrom((com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest other) {
      if (other == com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.getDefaultInstance()) return this;
      if (other.hasGateway()) {
        mergeGateway(other.getGateway());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getGatewayFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.saltoapis.nebula.gateway.v1.Gateway gateway_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.gateway.v1.Gateway, com.saltoapis.nebula.gateway.v1.Gateway.Builder, com.saltoapis.nebula.gateway.v1.GatewayOrBuilder> gatewayBuilder_;
    /**
     * <pre>
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
     * @return Whether the gateway field is set.
     */
    public boolean hasGateway() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
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
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
     */
    public Builder setGateway(
        com.saltoapis.nebula.gateway.v1.Gateway.Builder builderForValue) {
      if (gatewayBuilder_ == null) {
        gateway_ = builderForValue.build();
      } else {
        gatewayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
     */
    public Builder mergeGateway(com.saltoapis.nebula.gateway.v1.Gateway value) {
      if (gatewayBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
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
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
     */
    public Builder clearGateway() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
     */
    public com.saltoapis.nebula.gateway.v1.Gateway.Builder getGatewayBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGatewayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
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
     * The gateway resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.gateway.v1.Gateway gateway = 1;</code>
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.gateway.v1.UpdateGatewayRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.gateway.v1.UpdateGatewayRequest)
  private static final com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest();
  }

  public static com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGatewayRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGatewayRequest>() {
    @java.lang.Override
    public UpdateGatewayRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateGatewayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGatewayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

