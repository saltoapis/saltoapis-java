// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/digitalkey/v1/digital_key.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.digitalkey.v1;

/**
 * <pre>
 * The empty response message for [`UnlockAccessPoint`][salto.nebula.digitalkey.v1.DigitalKeyService.UnlockDigitalKeyAccessPoint]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse}
 */
public final class UnlockDigitalKeyAccessPointResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse)
    UnlockDigitalKeyAccessPointResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UnlockDigitalKeyAccessPointResponse.class.getName());
  }
  // Use UnlockDigitalKeyAccessPointResponse.newBuilder() to construct.
  private UnlockDigitalKeyAccessPointResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UnlockDigitalKeyAccessPointResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.digitalkey.v1.DigitalKeyProto.internal_static_salto_nebula_digitalkey_v1_UnlockDigitalKeyAccessPointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.digitalkey.v1.DigitalKeyProto.internal_static_salto_nebula_digitalkey_v1_UnlockDigitalKeyAccessPointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.class, com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse other = (com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse prototype) {
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
   * The empty response message for [`UnlockAccessPoint`][salto.nebula.digitalkey.v1.DigitalKeyService.UnlockDigitalKeyAccessPoint]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse)
      com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.digitalkey.v1.DigitalKeyProto.internal_static_salto_nebula_digitalkey_v1_UnlockDigitalKeyAccessPointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.digitalkey.v1.DigitalKeyProto.internal_static_salto_nebula_digitalkey_v1_UnlockDigitalKeyAccessPointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.class, com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.digitalkey.v1.DigitalKeyProto.internal_static_salto_nebula_digitalkey_v1_UnlockDigitalKeyAccessPointResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse build() {
      com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse buildPartial() {
      com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse result = new com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse) {
        return mergeFrom((com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse other) {
      if (other == com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse)
  private static final com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse();
  }

  public static com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnlockDigitalKeyAccessPointResponse>
      PARSER = new com.google.protobuf.AbstractParser<UnlockDigitalKeyAccessPointResponse>() {
    @java.lang.Override
    public UnlockDigitalKeyAccessPointResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnlockDigitalKeyAccessPointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnlockDigitalKeyAccessPointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.digitalkey.v1.UnlockDigitalKeyAccessPointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

