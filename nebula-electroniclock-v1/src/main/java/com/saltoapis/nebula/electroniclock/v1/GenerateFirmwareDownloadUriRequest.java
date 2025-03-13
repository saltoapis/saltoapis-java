// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electroniclock/v1/electronic_lock.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.electroniclock.v1;

/**
 * <pre>
 * The request message for [`GenerateFirmwareDownloadUri`][salto.nebula.electroniclock.v1.ElectronicLockService.GenerateFirmwareDownloadUri]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest}
 */
public final class GenerateFirmwareDownloadUriRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest)
    GenerateFirmwareDownloadUriRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      GenerateFirmwareDownloadUriRequest.class.getName());
  }
  // Use GenerateFirmwareDownloadUriRequest.newBuilder() to construct.
  private GenerateFirmwareDownloadUriRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GenerateFirmwareDownloadUriRequest() {
    electronicLock_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_GenerateFirmwareDownloadUriRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_GenerateFirmwareDownloadUriRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.class, com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.Builder.class);
  }

  public static final int ELECTRONIC_LOCK_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object electronicLock_ = "";
  /**
   * <pre>
   * The resource name of the electronic lock to get the firmware download URI.
   * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string electronic_lock = 1;</code>
   * @return The electronicLock.
   */
  @java.lang.Override
  public java.lang.String getElectronicLock() {
    java.lang.Object ref = electronicLock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      electronicLock_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the electronic lock to get the firmware download URI.
   * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string electronic_lock = 1;</code>
   * @return The bytes for electronicLock.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getElectronicLockBytes() {
    java.lang.Object ref = electronicLock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      electronicLock_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(electronicLock_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, electronicLock_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(electronicLock_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, electronicLock_);
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
    if (!(obj instanceof com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest other = (com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest) obj;

    if (!getElectronicLock()
        .equals(other.getElectronicLock())) return false;
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
    hash = (37 * hash) + ELECTRONIC_LOCK_FIELD_NUMBER;
    hash = (53 * hash) + getElectronicLock().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest prototype) {
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
   * The request message for [`GenerateFirmwareDownloadUri`][salto.nebula.electroniclock.v1.ElectronicLockService.GenerateFirmwareDownloadUri]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest)
      com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_GenerateFirmwareDownloadUriRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_GenerateFirmwareDownloadUriRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.class, com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.newBuilder()
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
      electronicLock_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.electroniclock.v1.ElectronicLockProto.internal_static_salto_nebula_electroniclock_v1_GenerateFirmwareDownloadUriRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest build() {
      com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest buildPartial() {
      com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest result = new com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.electronicLock_ = electronicLock_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest) {
        return mergeFrom((com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest other) {
      if (other == com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance()) return this;
      if (!other.getElectronicLock().isEmpty()) {
        electronicLock_ = other.electronicLock_;
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
              electronicLock_ = input.readStringRequireUtf8();
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

    private java.lang.Object electronicLock_ = "";
    /**
     * <pre>
     * The resource name of the electronic lock to get the firmware download URI.
     * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
     * </pre>
     *
     * <code>string electronic_lock = 1;</code>
     * @return The electronicLock.
     */
    public java.lang.String getElectronicLock() {
      java.lang.Object ref = electronicLock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        electronicLock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the electronic lock to get the firmware download URI.
     * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
     * </pre>
     *
     * <code>string electronic_lock = 1;</code>
     * @return The bytes for electronicLock.
     */
    public com.google.protobuf.ByteString
        getElectronicLockBytes() {
      java.lang.Object ref = electronicLock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        electronicLock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the electronic lock to get the firmware download URI.
     * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
     * </pre>
     *
     * <code>string electronic_lock = 1;</code>
     * @param value The electronicLock to set.
     * @return This builder for chaining.
     */
    public Builder setElectronicLock(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      electronicLock_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the electronic lock to get the firmware download URI.
     * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
     * </pre>
     *
     * <code>string electronic_lock = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearElectronicLock() {
      electronicLock_ = getDefaultInstance().getElectronicLock();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the electronic lock to get the firmware download URI.
     * For example: `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
     * </pre>
     *
     * <code>string electronic_lock = 1;</code>
     * @param value The bytes for electronicLock to set.
     * @return This builder for chaining.
     */
    public Builder setElectronicLockBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      electronicLock_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest)
  private static final com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest();
  }

  public static com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateFirmwareDownloadUriRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateFirmwareDownloadUriRequest>() {
    @java.lang.Override
    public GenerateFirmwareDownloadUriRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateFirmwareDownloadUriRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateFirmwareDownloadUriRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.electroniclock.v1.GenerateFirmwareDownloadUriRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

