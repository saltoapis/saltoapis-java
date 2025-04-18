// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

/**
 * <pre>
 * The request message for [`UpdateAccessRight`][salto.nebula.accessright.v1.AccessRightService.UpdateAccessRight]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accessright.v1.UpdateAccessRightRequest}
 */
public final class UpdateAccessRightRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accessright.v1.UpdateAccessRightRequest)
    UpdateAccessRightRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UpdateAccessRightRequest.class.getName());
  }
  // Use UpdateAccessRightRequest.newBuilder() to construct.
  private UpdateAccessRightRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateAccessRightRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_UpdateAccessRightRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_UpdateAccessRightRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.class, com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_RIGHT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accessright.v1.AccessRight accessRight_;
  /**
   * <pre>
   * The access right resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   * @return Whether the accessRight field is set.
   */
  @java.lang.Override
  public boolean hasAccessRight() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The access right resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   * @return The accessRight.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight() {
    return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
  }
  /**
   * <pre>
   * The access right resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder getAccessRightOrBuilder() {
    return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAccessRight());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccessRight());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest other = (com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest) obj;

    if (hasAccessRight() != other.hasAccessRight()) return false;
    if (hasAccessRight()) {
      if (!getAccessRight()
          .equals(other.getAccessRight())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasAccessRight()) {
      hash = (37 * hash) + ACCESS_RIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getAccessRight().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest prototype) {
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
   * The request message for [`UpdateAccessRight`][salto.nebula.accessright.v1.AccessRightService.UpdateAccessRight]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accessright.v1.UpdateAccessRightRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accessright.v1.UpdateAccessRightRequest)
      com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_UpdateAccessRightRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_UpdateAccessRightRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.class, com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getAccessRightFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessRight_ = null;
      if (accessRightBuilder_ != null) {
        accessRightBuilder_.dispose();
        accessRightBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_UpdateAccessRightRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest build() {
      com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest buildPartial() {
      com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest result = new com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessRight_ = accessRightBuilder_ == null
            ? accessRight_
            : accessRightBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest) {
        return mergeFrom((com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest other) {
      if (other == com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.getDefaultInstance()) return this;
      if (other.hasAccessRight()) {
        mergeAccessRight(other.getAccessRight());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getAccessRightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.saltoapis.nebula.accessright.v1.AccessRight accessRight_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRight, com.saltoapis.nebula.accessright.v1.AccessRight.Builder, com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder> accessRightBuilder_;
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     * @return Whether the accessRight field is set.
     */
    public boolean hasAccessRight() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     * @return The accessRight.
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight() {
      if (accessRightBuilder_ == null) {
        return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
      } else {
        return accessRightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder setAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
      if (accessRightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessRight_ = value;
      } else {
        accessRightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder setAccessRight(
        com.saltoapis.nebula.accessright.v1.AccessRight.Builder builderForValue) {
      if (accessRightBuilder_ == null) {
        accessRight_ = builderForValue.build();
      } else {
        accessRightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder mergeAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
      if (accessRightBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          accessRight_ != null &&
          accessRight_ != com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance()) {
          getAccessRightBuilder().mergeFrom(value);
        } else {
          accessRight_ = value;
        }
      } else {
        accessRightBuilder_.mergeFrom(value);
      }
      if (accessRight_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder clearAccessRight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessRight_ = null;
      if (accessRightBuilder_ != null) {
        accessRightBuilder_.dispose();
        accessRightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight.Builder getAccessRightBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessRightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder getAccessRightOrBuilder() {
      if (accessRightBuilder_ != null) {
        return accessRightBuilder_.getMessageOrBuilder();
      } else {
        return accessRight_ == null ?
            com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
      }
    }
    /**
     * <pre>
     * The access right resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRight, com.saltoapis.nebula.accessright.v1.AccessRight.Builder, com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder> 
        getAccessRightFieldBuilder() {
      if (accessRightBuilder_ == null) {
        accessRightBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.accessright.v1.AccessRight, com.saltoapis.nebula.accessright.v1.AccessRight.Builder, com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder>(
                getAccessRight(),
                getParentForChildren(),
                isClean());
        accessRight_ = null;
      }
      return accessRightBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accessright.v1.UpdateAccessRightRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accessright.v1.UpdateAccessRightRequest)
  private static final com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest();
  }

  public static com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccessRightRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAccessRightRequest>() {
    @java.lang.Override
    public UpdateAccessRightRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAccessRightRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccessRightRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

