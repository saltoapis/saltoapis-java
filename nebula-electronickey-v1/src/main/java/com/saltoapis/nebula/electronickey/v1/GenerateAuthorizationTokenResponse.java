// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electronickey/v1/electronic_key.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.electronickey.v1;

/**
 * <pre>
 * The response message for [`GenerateAuthorizationToken`][salto.nebula.electronickey.v1.ElectronicKeyService.GenerateAuthorizationToken]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.electronickey.v1.GenerateAuthorizationTokenResponse}
 */
public final class GenerateAuthorizationTokenResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.electronickey.v1.GenerateAuthorizationTokenResponse)
    GenerateAuthorizationTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GenerateAuthorizationTokenResponse.class.getName());
  }
  // Use GenerateAuthorizationTokenResponse.newBuilder() to construct.
  private GenerateAuthorizationTokenResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GenerateAuthorizationTokenResponse() {
    authorizationToken_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_GenerateAuthorizationTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_GenerateAuthorizationTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.class, com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.Builder.class);
  }

  public static final int AUTHORIZATION_TOKEN_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString authorizationToken_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Authorization token to be used for connecting to an electronic key.
   * </pre>
   *
   * <code>bytes authorization_token = 1;</code>
   * @return The authorizationToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAuthorizationToken() {
    return authorizationToken_;
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
    if (!authorizationToken_.isEmpty()) {
      output.writeBytes(1, authorizationToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!authorizationToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, authorizationToken_);
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
    if (!(obj instanceof com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse other = (com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse) obj;

    if (!getAuthorizationToken()
        .equals(other.getAuthorizationToken())) return false;
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
    hash = (37 * hash) + AUTHORIZATION_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAuthorizationToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse prototype) {
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
   * The response message for [`GenerateAuthorizationToken`][salto.nebula.electronickey.v1.ElectronicKeyService.GenerateAuthorizationToken]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.electronickey.v1.GenerateAuthorizationTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.electronickey.v1.GenerateAuthorizationTokenResponse)
      com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_GenerateAuthorizationTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_GenerateAuthorizationTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.class, com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.newBuilder()
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
      authorizationToken_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_GenerateAuthorizationTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse build() {
      com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse buildPartial() {
      com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse result = new com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authorizationToken_ = authorizationToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse) {
        return mergeFrom((com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse other) {
      if (other == com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.getDefaultInstance()) return this;
      if (other.getAuthorizationToken() != com.google.protobuf.ByteString.EMPTY) {
        setAuthorizationToken(other.getAuthorizationToken());
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
              authorizationToken_ = input.readBytes();
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

    private com.google.protobuf.ByteString authorizationToken_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Authorization token to be used for connecting to an electronic key.
     * </pre>
     *
     * <code>bytes authorization_token = 1;</code>
     * @return The authorizationToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAuthorizationToken() {
      return authorizationToken_;
    }
    /**
     * <pre>
     * Authorization token to be used for connecting to an electronic key.
     * </pre>
     *
     * <code>bytes authorization_token = 1;</code>
     * @param value The authorizationToken to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationToken(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      authorizationToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Authorization token to be used for connecting to an electronic key.
     * </pre>
     *
     * <code>bytes authorization_token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorizationToken() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authorizationToken_ = getDefaultInstance().getAuthorizationToken();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.electronickey.v1.GenerateAuthorizationTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.electronickey.v1.GenerateAuthorizationTokenResponse)
  private static final com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse();
  }

  public static com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAuthorizationTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateAuthorizationTokenResponse>() {
    @java.lang.Override
    public GenerateAuthorizationTokenResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateAuthorizationTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAuthorizationTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

