// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/encoder/v1/encoder.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.encoder.v1;

/**
 * <pre>
 * The request message for [`GenerateAuthorizationToken`][salto.nebula.encoder.v1.EncoderService.GenerateAuthorizationToken]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.encoder.v1.GenerateAuthorizationTokenRequest}
 */
public final class GenerateAuthorizationTokenRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.encoder.v1.GenerateAuthorizationTokenRequest)
    GenerateAuthorizationTokenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      GenerateAuthorizationTokenRequest.class.getName());
  }
  // Use GenerateAuthorizationTokenRequest.newBuilder() to construct.
  private GenerateAuthorizationTokenRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GenerateAuthorizationTokenRequest() {
    encoder_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.encoder.v1.EncoderProto.internal_static_salto_nebula_encoder_v1_GenerateAuthorizationTokenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.encoder.v1.EncoderProto.internal_static_salto_nebula_encoder_v1_GenerateAuthorizationTokenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.class, com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.Builder.class);
  }

  public static final int ENCODER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object encoder_ = "";
  /**
   * <pre>
   * The resource name of the encoder that the authorization token is
   * generated for. For example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   * @return The encoder.
   */
  @java.lang.Override
  public java.lang.String getEncoder() {
    java.lang.Object ref = encoder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encoder_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the encoder that the authorization token is
   * generated for. For example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string encoder = 1;</code>
   * @return The bytes for encoder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncoderBytes() {
    java.lang.Object ref = encoder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encoder_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(encoder_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, encoder_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(encoder_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, encoder_);
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
    if (!(obj instanceof com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest other = (com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest) obj;

    if (!getEncoder()
        .equals(other.getEncoder())) return false;
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
    hash = (37 * hash) + ENCODER_FIELD_NUMBER;
    hash = (53 * hash) + getEncoder().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest prototype) {
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
   * The request message for [`GenerateAuthorizationToken`][salto.nebula.encoder.v1.EncoderService.GenerateAuthorizationToken]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.encoder.v1.GenerateAuthorizationTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.encoder.v1.GenerateAuthorizationTokenRequest)
      com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.encoder.v1.EncoderProto.internal_static_salto_nebula_encoder_v1_GenerateAuthorizationTokenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.encoder.v1.EncoderProto.internal_static_salto_nebula_encoder_v1_GenerateAuthorizationTokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.class, com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      encoder_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.encoder.v1.EncoderProto.internal_static_salto_nebula_encoder_v1_GenerateAuthorizationTokenRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest build() {
      com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest buildPartial() {
      com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest result = new com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encoder_ = encoder_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest) {
        return mergeFrom((com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest other) {
      if (other == com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.getDefaultInstance()) return this;
      if (!other.getEncoder().isEmpty()) {
        encoder_ = other.encoder_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              encoder_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object encoder_ = "";
    /**
     * <pre>
     * The resource name of the encoder that the authorization token is
     * generated for. For example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @return The encoder.
     */
    public java.lang.String getEncoder() {
      java.lang.Object ref = encoder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encoder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the encoder that the authorization token is
     * generated for. For example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @return The bytes for encoder.
     */
    public com.google.protobuf.ByteString
        getEncoderBytes() {
      java.lang.Object ref = encoder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encoder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the encoder that the authorization token is
     * generated for. For example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @param value The encoder to set.
     * @return This builder for chaining.
     */
    public Builder setEncoder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      encoder_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the encoder that the authorization token is
     * generated for. For example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncoder() {
      encoder_ = getDefaultInstance().getEncoder();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the encoder that the authorization token is
     * generated for. For example:
     * `installations/surelock-homes-hq/encoders/conan-doyle`.
     * </pre>
     *
     * <code>string encoder = 1;</code>
     * @param value The bytes for encoder to set.
     * @return This builder for chaining.
     */
    public Builder setEncoderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      encoder_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.encoder.v1.GenerateAuthorizationTokenRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.encoder.v1.GenerateAuthorizationTokenRequest)
  private static final com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest();
  }

  public static com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAuthorizationTokenRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateAuthorizationTokenRequest>() {
    @java.lang.Override
    public GenerateAuthorizationTokenRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateAuthorizationTokenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAuthorizationTokenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

