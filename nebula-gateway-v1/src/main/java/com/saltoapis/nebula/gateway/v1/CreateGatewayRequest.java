// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/gateway/v1/gateway.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.gateway.v1;

/**
 * <pre>
 * The request message for [CreateGateway][salto.nebula.gateway.v1.GatewayService.CreateGateway]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.gateway.v1.CreateGatewayRequest}
 */
public  final class CreateGatewayRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateGatewayRequest, CreateGatewayRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.gateway.v1.CreateGatewayRequest)
    CreateGatewayRequestOrBuilder {
  private CreateGatewayRequest() {
    parent_ = "";
    gatewayId_ = "";
  }
  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private java.lang.String parent_;
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
    return parent_;
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
    return com.google.protobuf.ByteString.copyFromUtf8(parent_);
  }
  /**
   * <pre>
   * Resource name of the parent resource where to create the gateway. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @param value The parent to set.
   */
  private void setParent(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    parent_ = value;
  }
  /**
   * <pre>
   * Resource name of the parent resource where to create the gateway. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  private void clearParent() {

    parent_ = getDefaultInstance().getParent();
  }
  /**
   * <pre>
   * Resource name of the parent resource where to create the gateway. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @param value The bytes for parent to set.
   */
  private void setParentBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    parent_ = value.toStringUtf8();

  }

  public static final int GATEWAY_ID_FIELD_NUMBER = 2;
  private java.lang.String gatewayId_;
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
    return gatewayId_;
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
    return com.google.protobuf.ByteString.copyFromUtf8(gatewayId_);
  }
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @param value The gatewayId to set.
   */
  private void setGatewayId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  bitField0_ |= 0x00000001;
    gatewayId_ = value;
  }
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   */
  private void clearGatewayId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    gatewayId_ = getDefaultInstance().getGatewayId();
  }
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @param value The bytes for gatewayId to set.
   */
  private void setGatewayIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    gatewayId_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
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
  private void setGateway(com.saltoapis.nebula.gateway.v1.Gateway value) {
    value.getClass();
  gateway_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeGateway(com.saltoapis.nebula.gateway.v1.Gateway value) {
    value.getClass();
  if (gateway_ != null &&
        gateway_ != com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance()) {
      gateway_ =
        com.saltoapis.nebula.gateway.v1.Gateway.newBuilder(gateway_).mergeFrom(value).buildPartial();
    } else {
      gateway_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   */
  private void clearGateway() {  gateway_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for [CreateGateway][salto.nebula.gateway.v1.GatewayService.CreateGateway]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.gateway.v1.CreateGatewayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.gateway.v1.CreateGatewayRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.gateway.v1.CreateGatewayRequest)
      com.saltoapis.nebula.gateway.v1.CreateGatewayRequestOrBuilder {
    // Construct using com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


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
      return instance.getParent();
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
      return instance.getParentBytes();
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
      copyOnWrite();
      instance.setParent(value);
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
      copyOnWrite();
      instance.clearParent();
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
      copyOnWrite();
      instance.setParentBytes(value);
      return this;
    }

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
      return instance.hasGatewayId();
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
      return instance.getGatewayId();
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
      return instance.getGatewayIdBytes();
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
      copyOnWrite();
      instance.setGatewayId(value);
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
      copyOnWrite();
      instance.clearGatewayId();
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
      copyOnWrite();
      instance.setGatewayIdBytes(value);
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
    @java.lang.Override
    public boolean hasGateway() {
      return instance.hasGateway();
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
    public com.saltoapis.nebula.gateway.v1.Gateway getGateway() {
      return instance.getGateway();
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
      copyOnWrite();
      instance.setGateway(value);
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
      copyOnWrite();
      instance.setGateway(builderForValue.build());
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
      copyOnWrite();
      instance.mergeGateway(value);
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
    public Builder clearGateway() {  copyOnWrite();
      instance.clearGateway();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.gateway.v1.CreateGatewayRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.gateway.v1.CreateGatewayRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "parent_",
            "gatewayId_",
            "gateway_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u1208" +
              "\u0000\u0003\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.gateway.v1.CreateGatewayRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.gateway.v1.CreateGatewayRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:salto.nebula.gateway.v1.CreateGatewayRequest)
  private static final com.saltoapis.nebula.gateway.v1.CreateGatewayRequest DEFAULT_INSTANCE;
  static {
    CreateGatewayRequest defaultInstance = new CreateGatewayRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateGatewayRequest.class, defaultInstance);
  }

  public static com.saltoapis.nebula.gateway.v1.CreateGatewayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateGatewayRequest> PARSER;

  public static com.google.protobuf.Parser<CreateGatewayRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

