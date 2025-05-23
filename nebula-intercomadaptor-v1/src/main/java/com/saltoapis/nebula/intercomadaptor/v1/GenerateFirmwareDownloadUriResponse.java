// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.intercomadaptor.v1;

/**
 * <pre>
 * The response message for [`GenerateFirmwareDownloadUri`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.GenerateFirmwareDownloadUri]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse}
 */
public final class GenerateFirmwareDownloadUriResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse)
    GenerateFirmwareDownloadUriResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      GenerateFirmwareDownloadUriResponse.class.getName());
  }
  // Use GenerateFirmwareDownloadUriResponse.newBuilder() to construct.
  private GenerateFirmwareDownloadUriResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GenerateFirmwareDownloadUriResponse() {
    downloadUri_ = "";
    digest_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_GenerateFirmwareDownloadUriResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_GenerateFirmwareDownloadUriResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.class, com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.Builder.class);
  }

  public static final int DOWNLOAD_URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object downloadUri_ = "";
  /**
   * <pre>
   * The URI to download the firmware bundle. The URI will be valid for 15
   * minutes.
   * </pre>
   *
   * <code>string download_uri = 1;</code>
   * @return The downloadUri.
   */
  @java.lang.Override
  public java.lang.String getDownloadUri() {
    java.lang.Object ref = downloadUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      downloadUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URI to download the firmware bundle. The URI will be valid for 15
   * minutes.
   * </pre>
   *
   * <code>string download_uri = 1;</code>
   * @return The bytes for downloadUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDownloadUriBytes() {
    java.lang.Object ref = downloadUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      downloadUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIGEST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object digest_ = "";
  /**
   * <pre>
   * Digest of the file to be download. This can be used to cache the file and
   * avoid downloading it multiple times.
   * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
   * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
   * </pre>
   *
   * <code>string digest = 2;</code>
   * @return The digest.
   */
  @java.lang.Override
  public java.lang.String getDigest() {
    java.lang.Object ref = digest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      digest_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Digest of the file to be download. This can be used to cache the file and
   * avoid downloading it multiple times.
   * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
   * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
   * </pre>
   *
   * <code>string digest = 2;</code>
   * @return The bytes for digest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDigestBytes() {
    java.lang.Object ref = digest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      digest_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(downloadUri_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, downloadUri_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(digest_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, digest_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(downloadUri_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, downloadUri_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(digest_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, digest_);
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
    if (!(obj instanceof com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse other = (com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse) obj;

    if (!getDownloadUri()
        .equals(other.getDownloadUri())) return false;
    if (!getDigest()
        .equals(other.getDigest())) return false;
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
    hash = (37 * hash) + DOWNLOAD_URI_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadUri().hashCode();
    hash = (37 * hash) + DIGEST_FIELD_NUMBER;
    hash = (53 * hash) + getDigest().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse prototype) {
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
   * The response message for [`GenerateFirmwareDownloadUri`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.GenerateFirmwareDownloadUri]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse)
      com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_GenerateFirmwareDownloadUriResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_GenerateFirmwareDownloadUriResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.class, com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.newBuilder()
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
      downloadUri_ = "";
      digest_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_GenerateFirmwareDownloadUriResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse build() {
      com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse buildPartial() {
      com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse result = new com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.downloadUri_ = downloadUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.digest_ = digest_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse) {
        return mergeFrom((com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse other) {
      if (other == com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse.getDefaultInstance()) return this;
      if (!other.getDownloadUri().isEmpty()) {
        downloadUri_ = other.downloadUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDigest().isEmpty()) {
        digest_ = other.digest_;
        bitField0_ |= 0x00000002;
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
              downloadUri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              digest_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object downloadUri_ = "";
    /**
     * <pre>
     * The URI to download the firmware bundle. The URI will be valid for 15
     * minutes.
     * </pre>
     *
     * <code>string download_uri = 1;</code>
     * @return The downloadUri.
     */
    public java.lang.String getDownloadUri() {
      java.lang.Object ref = downloadUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        downloadUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URI to download the firmware bundle. The URI will be valid for 15
     * minutes.
     * </pre>
     *
     * <code>string download_uri = 1;</code>
     * @return The bytes for downloadUri.
     */
    public com.google.protobuf.ByteString
        getDownloadUriBytes() {
      java.lang.Object ref = downloadUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        downloadUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URI to download the firmware bundle. The URI will be valid for 15
     * minutes.
     * </pre>
     *
     * <code>string download_uri = 1;</code>
     * @param value The downloadUri to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      downloadUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI to download the firmware bundle. The URI will be valid for 15
     * minutes.
     * </pre>
     *
     * <code>string download_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadUri() {
      downloadUri_ = getDefaultInstance().getDownloadUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI to download the firmware bundle. The URI will be valid for 15
     * minutes.
     * </pre>
     *
     * <code>string download_uri = 1;</code>
     * @param value The bytes for downloadUri to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      downloadUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object digest_ = "";
    /**
     * <pre>
     * Digest of the file to be download. This can be used to cache the file and
     * avoid downloading it multiple times.
     * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
     * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return The digest.
     */
    public java.lang.String getDigest() {
      java.lang.Object ref = digest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        digest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Digest of the file to be download. This can be used to cache the file and
     * avoid downloading it multiple times.
     * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
     * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return The bytes for digest.
     */
    public com.google.protobuf.ByteString
        getDigestBytes() {
      java.lang.Object ref = digest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        digest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Digest of the file to be download. This can be used to cache the file and
     * avoid downloading it multiple times.
     * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
     * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @param value The digest to set.
     * @return This builder for chaining.
     */
    public Builder setDigest(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      digest_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Digest of the file to be download. This can be used to cache the file and
     * avoid downloading it multiple times.
     * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
     * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDigest() {
      digest_ = getDefaultInstance().getDigest();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Digest of the file to be download. This can be used to cache the file and
     * avoid downloading it multiple times.
     * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
     * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @param value The bytes for digest to set.
     * @return This builder for chaining.
     */
    public Builder setDigestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      digest_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse)
  private static final com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse();
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateFirmwareDownloadUriResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateFirmwareDownloadUriResponse>() {
    @java.lang.Override
    public GenerateFirmwareDownloadUriResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateFirmwareDownloadUriResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateFirmwareDownloadUriResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

