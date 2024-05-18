// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/extender/v1/extender.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.extender.v1;

/**
 * <pre>
 * The response message for [`UpdateExtenderFirmware`][salto.nebula.extender.v1.ExtenderService.UpdateExtenderFirmware]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.extender.v1.UpdateExtenderFirmwareResponse}
 */
public final class UpdateExtenderFirmwareResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.extender.v1.UpdateExtenderFirmwareResponse)
    UpdateExtenderFirmwareResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateExtenderFirmwareResponse.class.getName());
  }
  // Use UpdateExtenderFirmwareResponse.newBuilder() to construct.
  private UpdateExtenderFirmwareResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateExtenderFirmwareResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.class, com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.Builder.class);
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
    if (!(obj instanceof com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse other = (com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse) obj;

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

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse prototype) {
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
   * The response message for [`UpdateExtenderFirmware`][salto.nebula.extender.v1.ExtenderService.UpdateExtenderFirmware]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.extender.v1.UpdateExtenderFirmwareResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.extender.v1.UpdateExtenderFirmwareResponse)
      com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.class, com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.newBuilder()
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
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse build() {
      com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse buildPartial() {
      com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse result = new com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse) {
        return mergeFrom((com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse other) {
      if (other == com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.extender.v1.UpdateExtenderFirmwareResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.extender.v1.UpdateExtenderFirmwareResponse)
  private static final com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse();
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExtenderFirmwareResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateExtenderFirmwareResponse>() {
    @java.lang.Override
    public UpdateExtenderFirmwareResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateExtenderFirmwareResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExtenderFirmwareResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

