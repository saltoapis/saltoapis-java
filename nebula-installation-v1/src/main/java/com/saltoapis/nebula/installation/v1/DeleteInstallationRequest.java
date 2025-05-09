// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/installation/v1/installation.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.installation.v1;

/**
 * <pre>
 * The request message for [`DeleteInstallation`][salto.nebula.installation.v1.InstallationService.DeleteInstallation]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.installation.v1.DeleteInstallationRequest}
 */
public final class DeleteInstallationRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.installation.v1.DeleteInstallationRequest)
    DeleteInstallationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      DeleteInstallationRequest.class.getName());
  }
  // Use DeleteInstallationRequest.newBuilder() to construct.
  private DeleteInstallationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DeleteInstallationRequest() {
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_DeleteInstallationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_DeleteInstallationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.class, com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The resource name of the installation to be soft deleted. For example:
   * `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the installation to be soft deleted. For example:
   * `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * If set, validate the request but do not actually delete the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 2;</code>
   * @return Whether the validateOnly field is set.
   */
  @java.lang.Override
  public boolean hasValidateOnly() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * If set, validate the request but do not actually delete the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  public static final int DELAY_HOURS_FIELD_NUMBER = 3;
  private int delayHours_ = 0;
  /**
   * <pre>
   * The number of hours to wait before permanently deleting the installation.
   * If unset, the default is 720 (30 days).
   * </pre>
   *
   * <code>optional int32 delay_hours = 3;</code>
   * @return Whether the delayHours field is set.
   */
  @java.lang.Override
  public boolean hasDelayHours() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The number of hours to wait before permanently deleting the installation.
   * If unset, the default is 720 (30 days).
   * </pre>
   *
   * <code>optional int32 delay_hours = 3;</code>
   * @return The delayHours.
   */
  @java.lang.Override
  public int getDelayHours() {
    return delayHours_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(2, validateOnly_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(3, delayHours_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, validateOnly_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, delayHours_);
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
    if (!(obj instanceof com.saltoapis.nebula.installation.v1.DeleteInstallationRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.installation.v1.DeleteInstallationRequest other = (com.saltoapis.nebula.installation.v1.DeleteInstallationRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasValidateOnly() != other.hasValidateOnly()) return false;
    if (hasValidateOnly()) {
      if (getValidateOnly()
          != other.getValidateOnly()) return false;
    }
    if (hasDelayHours() != other.hasDelayHours()) return false;
    if (hasDelayHours()) {
      if (getDelayHours()
          != other.getDelayHours()) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasValidateOnly()) {
      hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getValidateOnly());
    }
    if (hasDelayHours()) {
      hash = (37 * hash) + DELAY_HOURS_FIELD_NUMBER;
      hash = (53 * hash) + getDelayHours();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.installation.v1.DeleteInstallationRequest prototype) {
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
   * The request message for [`DeleteInstallation`][salto.nebula.installation.v1.InstallationService.DeleteInstallation]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.installation.v1.DeleteInstallationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.installation.v1.DeleteInstallationRequest)
      com.saltoapis.nebula.installation.v1.DeleteInstallationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_DeleteInstallationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_DeleteInstallationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.class, com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.newBuilder()
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
      name_ = "";
      validateOnly_ = false;
      delayHours_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_DeleteInstallationRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.DeleteInstallationRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.DeleteInstallationRequest build() {
      com.saltoapis.nebula.installation.v1.DeleteInstallationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.DeleteInstallationRequest buildPartial() {
      com.saltoapis.nebula.installation.v1.DeleteInstallationRequest result = new com.saltoapis.nebula.installation.v1.DeleteInstallationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.installation.v1.DeleteInstallationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validateOnly_ = validateOnly_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.delayHours_ = delayHours_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.installation.v1.DeleteInstallationRequest) {
        return mergeFrom((com.saltoapis.nebula.installation.v1.DeleteInstallationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.installation.v1.DeleteInstallationRequest other) {
      if (other == com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasValidateOnly()) {
        setValidateOnly(other.getValidateOnly());
      }
      if (other.hasDelayHours()) {
        setDelayHours(other.getDelayHours());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              delayHours_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name of the installation to be soft deleted. For example:
     * `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the installation to be soft deleted. For example:
     * `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the installation to be soft deleted. For example:
     * `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the installation to be soft deleted. For example:
     * `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the installation to be soft deleted. For example:
     * `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If set, validate the request but do not actually delete the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 2;</code>
     * @return Whether the validateOnly field is set.
     */
    @java.lang.Override
    public boolean hasValidateOnly() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * If set, validate the request but do not actually delete the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 2;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If set, validate the request but do not actually delete the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 2;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, validate the request but do not actually delete the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validateOnly_ = false;
      onChanged();
      return this;
    }

    private int delayHours_ ;
    /**
     * <pre>
     * The number of hours to wait before permanently deleting the installation.
     * If unset, the default is 720 (30 days).
     * </pre>
     *
     * <code>optional int32 delay_hours = 3;</code>
     * @return Whether the delayHours field is set.
     */
    @java.lang.Override
    public boolean hasDelayHours() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The number of hours to wait before permanently deleting the installation.
     * If unset, the default is 720 (30 days).
     * </pre>
     *
     * <code>optional int32 delay_hours = 3;</code>
     * @return The delayHours.
     */
    @java.lang.Override
    public int getDelayHours() {
      return delayHours_;
    }
    /**
     * <pre>
     * The number of hours to wait before permanently deleting the installation.
     * If unset, the default is 720 (30 days).
     * </pre>
     *
     * <code>optional int32 delay_hours = 3;</code>
     * @param value The delayHours to set.
     * @return This builder for chaining.
     */
    public Builder setDelayHours(int value) {

      delayHours_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of hours to wait before permanently deleting the installation.
     * If unset, the default is 720 (30 days).
     * </pre>
     *
     * <code>optional int32 delay_hours = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDelayHours() {
      bitField0_ = (bitField0_ & ~0x00000004);
      delayHours_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.installation.v1.DeleteInstallationRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.installation.v1.DeleteInstallationRequest)
  private static final com.saltoapis.nebula.installation.v1.DeleteInstallationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.installation.v1.DeleteInstallationRequest();
  }

  public static com.saltoapis.nebula.installation.v1.DeleteInstallationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteInstallationRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteInstallationRequest>() {
    @java.lang.Override
    public DeleteInstallationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteInstallationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteInstallationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.installation.v1.DeleteInstallationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

