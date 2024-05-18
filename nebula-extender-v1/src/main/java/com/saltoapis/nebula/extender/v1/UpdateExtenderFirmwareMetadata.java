// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/extender/v1/extender.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.extender.v1;

/**
 * <pre>
 * The metadata message for [`UpdateExtenderFirmware`][salto.nebula.extender.v1.ExtenderService.UpdateExtenderFirmware]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.extender.v1.UpdateExtenderFirmwareMetadata}
 */
public final class UpdateExtenderFirmwareMetadata extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.extender.v1.UpdateExtenderFirmwareMetadata)
    UpdateExtenderFirmwareMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateExtenderFirmwareMetadata.class.getName());
  }
  // Use UpdateExtenderFirmwareMetadata.newBuilder() to construct.
  private UpdateExtenderFirmwareMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateExtenderFirmwareMetadata() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.class, com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.Builder.class);
  }

  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 1;
  private int progressPercent_ = 0;
  /**
   * <pre>
   * Progress of operation. Range: [0, 100].
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   * @return The progressPercent.
   */
  @java.lang.Override
  public int getProgressPercent() {
    return progressPercent_;
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
    if (progressPercent_ != 0) {
      output.writeInt32(1, progressPercent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (progressPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, progressPercent_);
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
    if (!(obj instanceof com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata other = (com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata) obj;

    if (getProgressPercent()
        != other.getProgressPercent()) return false;
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
    hash = (37 * hash) + PROGRESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercent();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata prototype) {
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
   * The metadata message for [`UpdateExtenderFirmware`][salto.nebula.extender.v1.ExtenderService.UpdateExtenderFirmware]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.extender.v1.UpdateExtenderFirmwareMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.extender.v1.UpdateExtenderFirmwareMetadata)
      com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.class, com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.Builder.class);
    }

    // Construct using com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.newBuilder()
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
      progressPercent_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata getDefaultInstanceForType() {
      return com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata build() {
      com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata buildPartial() {
      com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata result = new com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.progressPercent_ = progressPercent_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata) {
        return mergeFrom((com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata other) {
      if (other == com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata.getDefaultInstance()) return this;
      if (other.getProgressPercent() != 0) {
        setProgressPercent(other.getProgressPercent());
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
            case 8: {
              progressPercent_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int progressPercent_ ;
    /**
     * <pre>
     * Progress of operation. Range: [0, 100].
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @return The progressPercent.
     */
    @java.lang.Override
    public int getProgressPercent() {
      return progressPercent_;
    }
    /**
     * <pre>
     * Progress of operation. Range: [0, 100].
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @param value The progressPercent to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercent(int value) {

      progressPercent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress of operation. Range: [0, 100].
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgressPercent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      progressPercent_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.extender.v1.UpdateExtenderFirmwareMetadata)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.extender.v1.UpdateExtenderFirmwareMetadata)
  private static final com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata();
  }

  public static com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExtenderFirmwareMetadata>
      PARSER = new com.google.protobuf.AbstractParser<UpdateExtenderFirmwareMetadata>() {
    @java.lang.Override
    public UpdateExtenderFirmwareMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateExtenderFirmwareMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExtenderFirmwareMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

