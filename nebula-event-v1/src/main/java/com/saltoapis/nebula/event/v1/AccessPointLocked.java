// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the locking of an access point.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.AccessPointLocked}
 */
public  final class AccessPointLocked extends
    com.google.protobuf.GeneratedMessageLite<
        AccessPointLocked, AccessPointLocked.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.AccessPointLocked)
    AccessPointLockedOrBuilder {
  private AccessPointLocked() {
  }
  private int bitField0_;
  public static final int ACCESS_POINT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accesspoint.v1.AccessPoint accessPoint_;
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  @java.lang.Override
  public boolean hasAccessPoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint() {
    return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
  }
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  private void setAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
    value.getClass();
  accessPoint_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
    value.getClass();
  if (accessPoint_ != null &&
        accessPoint_ != com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance()) {
      accessPoint_ =
        com.saltoapis.nebula.accesspoint.v1.AccessPoint.newBuilder(accessPoint_).mergeFrom(value).buildPartial();
    } else {
      accessPoint_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  private void clearAccessPoint() {  accessPoint_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int USER_FIELD_NUMBER = 2;
  private com.saltoapis.nebula.user.v1.User user_;
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.User getUser() {
    return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  private void setUser(com.saltoapis.nebula.user.v1.User value) {
    value.getClass();
  user_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeUser(com.saltoapis.nebula.user.v1.User value) {
    value.getClass();
  if (user_ != null &&
        user_ != com.saltoapis.nebula.user.v1.User.getDefaultInstance()) {
      user_ =
        com.saltoapis.nebula.user.v1.User.newBuilder(user_).mergeFrom(value).buildPartial();
    } else {
      user_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  private void clearUser() {  user_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointLocked parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.AccessPointLocked prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Event representing the locking of an access point.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.AccessPointLocked}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.event.v1.AccessPointLocked, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.AccessPointLocked)
      com.saltoapis.nebula.event.v1.AccessPointLockedOrBuilder {
    // Construct using com.saltoapis.nebula.event.v1.AccessPointLocked.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The access point that's been locked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    @java.lang.Override
    public boolean hasAccessPoint() {
      return instance.hasAccessPoint();
    }
    /**
     * <pre>
     * The access point that's been locked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint() {
      return instance.getAccessPoint();
    }
    /**
     * <pre>
     * The access point that's been locked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder setAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
      copyOnWrite();
      instance.setAccessPoint(value);
      return this;
      }
    /**
     * <pre>
     * The access point that's been locked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder setAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder builderForValue) {
      copyOnWrite();
      instance.setAccessPoint(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The access point that's been locked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder mergeAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
      copyOnWrite();
      instance.mergeAccessPoint(value);
      return this;
    }
    /**
     * <pre>
     * The access point that's been locked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder clearAccessPoint() {  copyOnWrite();
      instance.clearAccessPoint();
      return this;
    }

    /**
     * <pre>
     * The user who locked the access point.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    @java.lang.Override
    public boolean hasUser() {
      return instance.hasUser();
    }
    /**
     * <pre>
     * The user who locked the access point.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.user.v1.User getUser() {
      return instance.getUser();
    }
    /**
     * <pre>
     * The user who locked the access point.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder setUser(com.saltoapis.nebula.user.v1.User value) {
      copyOnWrite();
      instance.setUser(value);
      return this;
      }
    /**
     * <pre>
     * The user who locked the access point.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder setUser(
        com.saltoapis.nebula.user.v1.User.Builder builderForValue) {
      copyOnWrite();
      instance.setUser(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The user who locked the access point.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder mergeUser(com.saltoapis.nebula.user.v1.User value) {
      copyOnWrite();
      instance.mergeUser(value);
      return this;
    }
    /**
     * <pre>
     * The user who locked the access point.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder clearUser() {  copyOnWrite();
      instance.clearUser();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.AccessPointLocked)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.event.v1.AccessPointLocked();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "accessPoint_",
            "user_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.event.v1.AccessPointLocked> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.event.v1.AccessPointLocked.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.event.v1.AccessPointLocked>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.AccessPointLocked)
  private static final com.saltoapis.nebula.event.v1.AccessPointLocked DEFAULT_INSTANCE;
  static {
    AccessPointLocked defaultInstance = new AccessPointLocked();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AccessPointLocked.class, defaultInstance);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointLocked getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AccessPointLocked> PARSER;

  public static com.google.protobuf.Parser<AccessPointLocked> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

