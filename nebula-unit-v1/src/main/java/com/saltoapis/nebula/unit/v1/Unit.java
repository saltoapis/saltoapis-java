// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/unit/v1/unit.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.unit.v1;

/**
 * <pre>
 * Representation of a unit resource inside the API
 * </pre>
 *
 * Protobuf type {@code salto.nebula.unit.v1.Unit}
 */
public  final class Unit extends
    com.google.protobuf.GeneratedMessageLite<
        Unit, Unit.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.unit.v1.Unit)
    UnitOrBuilder {
  private Unit() {
    name_ = "";
    displayName_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
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
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
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
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
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
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
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

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private java.lang.String displayName_;
  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    return displayName_;
  }
  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(displayName_);
  }
  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @param value The displayName to set.
   */
  private void setDisplayName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    displayName_ = value;
  }
  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  private void clearDisplayName() {

    displayName_ = getDefaultInstance().getDisplayName();
  }
  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @param value The bytes for displayName to set.
   */
  private void setDisplayNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    displayName_ = value.toStringUtf8();

  }

  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.unit.v1.Unit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.unit.v1.Unit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.unit.v1.Unit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.unit.v1.Unit prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Representation of a unit resource inside the API
   * </pre>
   *
   * Protobuf type {@code salto.nebula.unit.v1.Unit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.unit.v1.Unit, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.unit.v1.Unit)
      com.saltoapis.nebula.unit.v1.UnitOrBuilder {
    // Construct using com.saltoapis.nebula.unit.v1.Unit.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Resource name of the unit. It must have the format
     * `installations/&#42;&#47;units/&#42;`, for example:
     * `installations/surelock-homes-hq/units/101`.
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
     * Resource name of the unit. It must have the format
     * `installations/&#42;&#47;units/&#42;`, for example:
     * `installations/surelock-homes-hq/units/101`.
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
     * Resource name of the unit. It must have the format
     * `installations/&#42;&#47;units/&#42;`, for example:
     * `installations/surelock-homes-hq/units/101`.
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
     * Resource name of the unit. It must have the format
     * `installations/&#42;&#47;units/&#42;`, for example:
     * `installations/surelock-homes-hq/units/101`.
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
     * Resource name of the unit. It must have the format
     * `installations/&#42;&#47;units/&#42;`, for example:
     * `installations/surelock-homes-hq/units/101`.
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

    /**
     * <pre>
     * Display name.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The displayName.
     */
    @java.lang.Override
    public java.lang.String getDisplayName() {
      return instance.getDisplayName();
    }
    /**
     * <pre>
     * Display name.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The bytes for displayName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      return instance.getDisplayNameBytes();
    }
    /**
     * <pre>
     * Display name.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      copyOnWrite();
      instance.setDisplayName(value);
      return this;
    }
    /**
     * <pre>
     * Display name.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      copyOnWrite();
      instance.clearDisplayName();
      return this;
    }
    /**
     * <pre>
     * Display name.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDisplayNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.unit.v1.Unit)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.unit.v1.Unit();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "displayName_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.unit.v1.Unit> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.unit.v1.Unit.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.unit.v1.Unit>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.unit.v1.Unit)
  private static final com.saltoapis.nebula.unit.v1.Unit DEFAULT_INSTANCE;
  static {
    Unit defaultInstance = new Unit();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Unit.class, defaultInstance);
  }

  public static com.saltoapis.nebula.unit.v1.Unit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Unit> PARSER;

  public static com.google.protobuf.Parser<Unit> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

