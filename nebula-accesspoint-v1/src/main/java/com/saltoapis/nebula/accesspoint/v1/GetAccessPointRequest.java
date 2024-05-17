// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspoint/v1/access_point.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.accesspoint.v1;

/**
 * <pre>
 * The request message for [`GetAccessPoint`][salto.nebula.accesspoint.v1.AccessPointService.GetAccessPoint]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accesspoint.v1.GetAccessPointRequest}
 */
public  final class GetAccessPointRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetAccessPointRequest, GetAccessPointRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accesspoint.v1.GetAccessPointRequest)
    GetAccessPointRequestOrBuilder {
  private GetAccessPointRequest() {
    name_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();

  }

  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for [`GetAccessPoint`][salto.nebula.accesspoint.v1.AccessPointService.GetAccessPoint]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accesspoint.v1.GetAccessPointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accesspoint.v1.GetAccessPointRequest)
      com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequestOrBuilder {
    // Construct using com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the requested access point resource. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name of the requested access point resource. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name of the requested access point resource. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the requested access point resource. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name of the requested access point resource. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accesspoint.v1.GetAccessPointRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.accesspoint.v1.GetAccessPointRequest)
  private static final com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest DEFAULT_INSTANCE;
  static {
    GetAccessPointRequest defaultInstance = new GetAccessPointRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetAccessPointRequest.class, defaultInstance);
  }

  public static com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetAccessPointRequest> PARSER;

  public static com.google.protobuf.Parser<GetAccessPointRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

