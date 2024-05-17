// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the creation of an access right.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.AccessRightCreated}
 */
public  final class AccessRightCreated extends
    com.google.protobuf.GeneratedMessageLite<
        AccessRightCreated, AccessRightCreated.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.AccessRightCreated)
    AccessRightCreatedOrBuilder {
  private AccessRightCreated() {
  }
  private int bitField0_;
  public static final int ACCESS_RIGHT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accessright.v1.AccessRight accessRight_;
  /**
   * <pre>
   * Access right created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  @java.lang.Override
  public boolean hasAccessRight() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Access right created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight() {
    return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
  }
  /**
   * <pre>
   * Access right created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  private void setAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
    value.getClass();
  accessRight_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Access right created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
    value.getClass();
  if (accessRight_ != null &&
        accessRight_ != com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance()) {
      accessRight_ =
        com.saltoapis.nebula.accessright.v1.AccessRight.newBuilder(accessRight_).mergeFrom(value).buildPartial();
    } else {
      accessRight_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Access right created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  private void clearAccessRight() {  accessRight_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightCreated parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.AccessRightCreated prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Event representing the creation of an access right.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.AccessRightCreated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.event.v1.AccessRightCreated, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.AccessRightCreated)
      com.saltoapis.nebula.event.v1.AccessRightCreatedOrBuilder {
    // Construct using com.saltoapis.nebula.event.v1.AccessRightCreated.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Access right created.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    @java.lang.Override
    public boolean hasAccessRight() {
      return instance.hasAccessRight();
    }
    /**
     * <pre>
     * Access right created.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight() {
      return instance.getAccessRight();
    }
    /**
     * <pre>
     * Access right created.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder setAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
      copyOnWrite();
      instance.setAccessRight(value);
      return this;
      }
    /**
     * <pre>
     * Access right created.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder setAccessRight(
        com.saltoapis.nebula.accessright.v1.AccessRight.Builder builderForValue) {
      copyOnWrite();
      instance.setAccessRight(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Access right created.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder mergeAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
      copyOnWrite();
      instance.mergeAccessRight(value);
      return this;
    }
    /**
     * <pre>
     * Access right created.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder clearAccessRight() {  copyOnWrite();
      instance.clearAccessRight();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.AccessRightCreated)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.event.v1.AccessRightCreated();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "accessRight_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.event.v1.AccessRightCreated> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.event.v1.AccessRightCreated.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.event.v1.AccessRightCreated>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.AccessRightCreated)
  private static final com.saltoapis.nebula.event.v1.AccessRightCreated DEFAULT_INSTANCE;
  static {
    AccessRightCreated defaultInstance = new AccessRightCreated();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AccessRightCreated.class, defaultInstance);
  }

  public static com.saltoapis.nebula.event.v1.AccessRightCreated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AccessRightCreated> PARSER;

  public static com.google.protobuf.Parser<AccessRightCreated> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

