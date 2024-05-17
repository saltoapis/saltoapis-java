// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.encoder.v1;

/**
 * <pre>
 * The request message for [`UpdateEncoderFirmware`][salto.nebula.encoder.v1.EncoderService.UpdateEncoderFirmware]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.encoder.v1.UpdateEncoderFirmwareRequest}
 */
public  final class UpdateEncoderFirmwareRequest extends
    com.google.protobuf.GeneratedMessageLite<
        UpdateEncoderFirmwareRequest, UpdateEncoderFirmwareRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.encoder.v1.UpdateEncoderFirmwareRequest)
    UpdateEncoderFirmwareRequestOrBuilder {
  private UpdateEncoderFirmwareRequest() {
    encoder_ = "";
  }
  public static final int ENCODER_FIELD_NUMBER = 1;
  private java.lang.String encoder_;
  /**
   * <pre>
   * The resource name of the encoder whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   * @return The encoder.
   */
  @java.lang.Override
  public java.lang.String getEncoder() {
    return encoder_;
  }
  /**
   * <pre>
   * The resource name of the encoder whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   * @return The bytes for encoder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncoderBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(encoder_);
  }
  /**
   * <pre>
   * The resource name of the encoder whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   * @param value The encoder to set.
   */
  private void setEncoder(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    encoder_ = value;
  }
  /**
   * <pre>
   * The resource name of the encoder whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   */
  private void clearEncoder() {

    encoder_ = getDefaultInstance().getEncoder();
  }
  /**
   * <pre>
   * The resource name of the encoder whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   * @param value The bytes for encoder to set.
   */
  private void setEncoderBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    encoder_ = value.toStringUtf8();

  }

  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for [`UpdateEncoderFirmware`][salto.nebula.encoder.v1.EncoderService.UpdateEncoderFirmware]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.encoder.v1.UpdateEncoderFirmwareRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.encoder.v1.UpdateEncoderFirmwareRequest)
      com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequestOrBuilder {
    // Construct using com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The resource name of the encoder whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @return The encoder.
     */
    @java.lang.Override
    public java.lang.String getEncoder() {
      return instance.getEncoder();
    }
    /**
     * <pre>
     * The resource name of the encoder whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @return The bytes for encoder.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEncoderBytes() {
      return instance.getEncoderBytes();
    }
    /**
     * <pre>
     * The resource name of the encoder whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @param value The encoder to set.
     * @return This builder for chaining.
     */
    public Builder setEncoder(
        java.lang.String value) {
      copyOnWrite();
      instance.setEncoder(value);
      return this;
    }
    /**
     * <pre>
     * The resource name of the encoder whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncoder() {
      copyOnWrite();
      instance.clearEncoder();
      return this;
    }
    /**
     * <pre>
     * The resource name of the encoder whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @param value The bytes for encoder to set.
     * @return This builder for chaining.
     */
    public Builder setEncoderBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEncoderBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.encoder.v1.UpdateEncoderFirmwareRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "encoder_",
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
        com.google.protobuf.Parser<com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.encoder.v1.UpdateEncoderFirmwareRequest)
  private static final com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest DEFAULT_INSTANCE;
  static {
    UpdateEncoderFirmwareRequest defaultInstance = new UpdateEncoderFirmwareRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UpdateEncoderFirmwareRequest.class, defaultInstance);
  }

  public static com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UpdateEncoderFirmwareRequest> PARSER;

  public static com.google.protobuf.Parser<UpdateEncoderFirmwareRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

