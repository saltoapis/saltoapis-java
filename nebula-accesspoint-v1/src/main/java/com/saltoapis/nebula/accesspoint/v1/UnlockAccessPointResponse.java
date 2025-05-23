// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accesspoint/v1/access_point.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accesspoint.v1;

/**
 * <pre>
 * The empty response message for [`UnlockAccessPoint`][salto.nebula.accesspoint.v1.AccessPointService.UnlockAccessPoint]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accesspoint.v1.UnlockAccessPointResponse}
 */
public final class UnlockAccessPointResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accesspoint.v1.UnlockAccessPointResponse)
    UnlockAccessPointResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UnlockAccessPointResponse.class.getName());
  }
  // Use UnlockAccessPointResponse.newBuilder() to construct.
  private UnlockAccessPointResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UnlockAccessPointResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accesspoint.v1.AccessPointProto.internal_static_salto_nebula_accesspoint_v1_UnlockAccessPointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accesspoint.v1.AccessPointProto.internal_static_salto_nebula_accesspoint_v1_UnlockAccessPointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.class, com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.Builder.class);
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
    if (!(obj instanceof com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse other = (com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse) obj;

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

  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse prototype) {
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
   * The empty response message for [`UnlockAccessPoint`][salto.nebula.accesspoint.v1.AccessPointService.UnlockAccessPoint]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accesspoint.v1.UnlockAccessPointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accesspoint.v1.UnlockAccessPointResponse)
      com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accesspoint.v1.AccessPointProto.internal_static_salto_nebula_accesspoint_v1_UnlockAccessPointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accesspoint.v1.AccessPointProto.internal_static_salto_nebula_accesspoint_v1_UnlockAccessPointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.class, com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.newBuilder()
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
      return com.saltoapis.nebula.accesspoint.v1.AccessPointProto.internal_static_salto_nebula_accesspoint_v1_UnlockAccessPointResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse build() {
      com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse buildPartial() {
      com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse result = new com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse) {
        return mergeFrom((com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse other) {
      if (other == com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.accesspoint.v1.UnlockAccessPointResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accesspoint.v1.UnlockAccessPointResponse)
  private static final com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse();
  }

  public static com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnlockAccessPointResponse>
      PARSER = new com.google.protobuf.AbstractParser<UnlockAccessPointResponse>() {
    @java.lang.Override
    public UnlockAccessPointResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnlockAccessPointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnlockAccessPointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

