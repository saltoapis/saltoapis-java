// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.intercomadaptor.v1;

/**
 * <pre>
 * The intercom adaptor's access point association
 * </pre>
 *
 * Protobuf type {@code salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint}
 */
public  final class IntercomAdaptorAccessPoint extends
    com.google.protobuf.GeneratedMessageLite<
        IntercomAdaptorAccessPoint, IntercomAdaptorAccessPoint.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint)
    IntercomAdaptorAccessPointOrBuilder {
  private IntercomAdaptorAccessPoint() {
    accessPoint_ = "";
    frameSettings_ = com.google.protobuf.ByteString.EMPTY;
  }
  private int bitField0_;
  public static final int ACCESS_POINT_FIELD_NUMBER = 1;
  private java.lang.String accessPoint_;
  /**
   * <pre>
   * The access point resource name to bind as an association to the parent
   * intercom adaptor. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string access_point = 1;</code>
   * @return The accessPoint.
   */
  @java.lang.Override
  public java.lang.String getAccessPoint() {
    return accessPoint_;
  }
  /**
   * <pre>
   * The access point resource name to bind as an association to the parent
   * intercom adaptor. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string access_point = 1;</code>
   * @return The bytes for accessPoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccessPointBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(accessPoint_);
  }
  /**
   * <pre>
   * The access point resource name to bind as an association to the parent
   * intercom adaptor. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string access_point = 1;</code>
   * @param value The accessPoint to set.
   */
  private void setAccessPoint(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    accessPoint_ = value;
  }
  /**
   * <pre>
   * The access point resource name to bind as an association to the parent
   * intercom adaptor. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string access_point = 1;</code>
   */
  private void clearAccessPoint() {

    accessPoint_ = getDefaultInstance().getAccessPoint();
  }
  /**
   * <pre>
   * The access point resource name to bind as an association to the parent
   * intercom adaptor. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string access_point = 1;</code>
   * @param value The bytes for accessPoint to set.
   */
  private void setAccessPointBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    accessPoint_ = value.toStringUtf8();

  }

  public static final int FRAME_SETTINGS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString frameSettings_;
  /**
   * <pre>
   * The set of learnt frames. Left unset for analog intercoms.
   * </pre>
   *
   * <code>optional bytes frame_settings = 2;</code>
   * @return Whether the frameSettings field is set.
   */
  @java.lang.Override
  public boolean hasFrameSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The set of learnt frames. Left unset for analog intercoms.
   * </pre>
   *
   * <code>optional bytes frame_settings = 2;</code>
   * @return The frameSettings.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFrameSettings() {
    return frameSettings_;
  }
  /**
   * <pre>
   * The set of learnt frames. Left unset for analog intercoms.
   * </pre>
   *
   * <code>optional bytes frame_settings = 2;</code>
   * @param value The frameSettings to set.
   */
  private void setFrameSettings(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  bitField0_ |= 0x00000001;
    frameSettings_ = value;
  }
  /**
   * <pre>
   * The set of learnt frames. Left unset for analog intercoms.
   * </pre>
   *
   * <code>optional bytes frame_settings = 2;</code>
   */
  private void clearFrameSettings() {
    bitField0_ = (bitField0_ & ~0x00000001);
    frameSettings_ = getDefaultInstance().getFrameSettings();
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The intercom adaptor's access point association
   * </pre>
   *
   * Protobuf type {@code salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint)
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPointOrBuilder {
    // Construct using com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The access point resource name to bind as an association to the parent
     * intercom adaptor. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string access_point = 1;</code>
     * @return The accessPoint.
     */
    @java.lang.Override
    public java.lang.String getAccessPoint() {
      return instance.getAccessPoint();
    }
    /**
     * <pre>
     * The access point resource name to bind as an association to the parent
     * intercom adaptor. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string access_point = 1;</code>
     * @return The bytes for accessPoint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccessPointBytes() {
      return instance.getAccessPointBytes();
    }
    /**
     * <pre>
     * The access point resource name to bind as an association to the parent
     * intercom adaptor. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string access_point = 1;</code>
     * @param value The accessPoint to set.
     * @return This builder for chaining.
     */
    public Builder setAccessPoint(
        java.lang.String value) {
      copyOnWrite();
      instance.setAccessPoint(value);
      return this;
    }
    /**
     * <pre>
     * The access point resource name to bind as an association to the parent
     * intercom adaptor. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string access_point = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessPoint() {
      copyOnWrite();
      instance.clearAccessPoint();
      return this;
    }
    /**
     * <pre>
     * The access point resource name to bind as an association to the parent
     * intercom adaptor. For example:
     * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
     * </pre>
     *
     * <code>string access_point = 1;</code>
     * @param value The bytes for accessPoint to set.
     * @return This builder for chaining.
     */
    public Builder setAccessPointBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAccessPointBytes(value);
      return this;
    }

    /**
     * <pre>
     * The set of learnt frames. Left unset for analog intercoms.
     * </pre>
     *
     * <code>optional bytes frame_settings = 2;</code>
     * @return Whether the frameSettings field is set.
     */
    @java.lang.Override
    public boolean hasFrameSettings() {
      return instance.hasFrameSettings();
    }
    /**
     * <pre>
     * The set of learnt frames. Left unset for analog intercoms.
     * </pre>
     *
     * <code>optional bytes frame_settings = 2;</code>
     * @return The frameSettings.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFrameSettings() {
      return instance.getFrameSettings();
    }
    /**
     * <pre>
     * The set of learnt frames. Left unset for analog intercoms.
     * </pre>
     *
     * <code>optional bytes frame_settings = 2;</code>
     * @param value The frameSettings to set.
     * @return This builder for chaining.
     */
    public Builder setFrameSettings(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFrameSettings(value);
      return this;
    }
    /**
     * <pre>
     * The set of learnt frames. Left unset for analog intercoms.
     * </pre>
     *
     * <code>optional bytes frame_settings = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrameSettings() {
      copyOnWrite();
      instance.clearFrameSettings();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "accessPoint_",
            "frameSettings_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u100a" +
              "\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint)
  private static final com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint DEFAULT_INSTANCE;
  static {
    IntercomAdaptorAccessPoint defaultInstance = new IntercomAdaptorAccessPoint();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      IntercomAdaptorAccessPoint.class, defaultInstance);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<IntercomAdaptorAccessPoint> PARSER;

  public static com.google.protobuf.Parser<IntercomAdaptorAccessPoint> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

