// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/electroniclock/v1/electronic_lock.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.electroniclock.v1;

/**
 * <pre>
 * The metadata message for [`ConfigureElectronicLock`][salto.nebula.electroniclock.v1.ElectronicLockService.ConfigureElectronicLock]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.electroniclock.v1.ConfigureElectronicLockMetadata}
 */
public final class ConfigureElectronicLockMetadata extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.electroniclock.v1.ConfigureElectronicLockMetadata)
    ConfigureElectronicLockMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ConfigureElectronicLockMetadata.class.getName());
  }
  // Use ConfigureElectronicLockMetadata.newBuilder() to construct.
  private ConfigureElectronicLockMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ConfigureElectronicLockMetadata() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_ConfigureElectronicLockMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_ConfigureElectronicLockMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.class, com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.Builder.class);
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
    if (!(obj instanceof com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata other = (com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata) obj;

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

  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata prototype) {
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
   * The metadata message for [`ConfigureElectronicLock`][salto.nebula.electroniclock.v1.ElectronicLockService.ConfigureElectronicLock]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.electroniclock.v1.ConfigureElectronicLockMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.electroniclock.v1.ConfigureElectronicLockMetadata)
      com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_ConfigureElectronicLockMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_ConfigureElectronicLockMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.class, com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.Builder.class);
    }

    // Construct using com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.newBuilder()
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
      return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_ConfigureElectronicLockMetadata_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata getDefaultInstanceForType() {
      return com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata build() {
      com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata buildPartial() {
      com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata result = new com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata) {
        return mergeFrom((com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata other) {
      if (other == com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata.getDefaultInstance()) return this;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.electroniclock.v1.ConfigureElectronicLockMetadata)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.electroniclock.v1.ConfigureElectronicLockMetadata)
  private static final com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata();
  }

  public static com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigureElectronicLockMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ConfigureElectronicLockMetadata>() {
    @java.lang.Override
    public ConfigureElectronicLockMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfigureElectronicLockMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigureElectronicLockMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

