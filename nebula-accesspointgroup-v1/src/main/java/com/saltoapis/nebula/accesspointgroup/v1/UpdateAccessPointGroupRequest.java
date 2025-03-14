// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accesspointgroup.v1;

/**
 * <pre>
 * The request message for [`UpdateAccessPointGroup`][salto.nebula.accesspointgroup.v1.AccessPointGroupService.UpdateAccessPointGroup]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest}
 */
public final class UpdateAccessPointGroupRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest)
    UpdateAccessPointGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UpdateAccessPointGroupRequest.class.getName());
  }
  // Use UpdateAccessPointGroupRequest.newBuilder() to construct.
  private UpdateAccessPointGroupRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateAccessPointGroupRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_UpdateAccessPointGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_UpdateAccessPointGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.class, com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_POINT_GROUP_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup accessPointGroup_;
  /**
   * <pre>
   * The access point group resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
   * @return Whether the accessPointGroup field is set.
   */
  @java.lang.Override
  public boolean hasAccessPointGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The access point group resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
   * @return The accessPointGroup.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup getAccessPointGroup() {
    return accessPointGroup_ == null ? com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance() : accessPointGroup_;
  }
  /**
   * <pre>
   * The access point group resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder getAccessPointGroupOrBuilder() {
    return accessPointGroup_ == null ? com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance() : accessPointGroup_;
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
      output.writeMessage(1, getAccessPointGroup());
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
        .computeMessageSize(1, getAccessPointGroup());
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
    if (!(obj instanceof com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest other = (com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest) obj;

    if (hasAccessPointGroup() != other.hasAccessPointGroup()) return false;
    if (hasAccessPointGroup()) {
      if (!getAccessPointGroup()
          .equals(other.getAccessPointGroup())) return false;
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
    if (hasAccessPointGroup()) {
      hash = (37 * hash) + ACCESS_POINT_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPointGroup().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest prototype) {
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
   * The request message for [`UpdateAccessPointGroup`][salto.nebula.accesspointgroup.v1.AccessPointGroupService.UpdateAccessPointGroup]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest)
      com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_UpdateAccessPointGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_UpdateAccessPointGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.class, com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.newBuilder()
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
        getAccessPointGroupFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessPointGroup_ = null;
      if (accessPointGroupBuilder_ != null) {
        accessPointGroupBuilder_.dispose();
        accessPointGroupBuilder_ = null;
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
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_UpdateAccessPointGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest build() {
      com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest buildPartial() {
      com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest result = new com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessPointGroup_ = accessPointGroupBuilder_ == null
            ? accessPointGroup_
            : accessPointGroupBuilder_.build();
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
      if (other instanceof com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest) {
        return mergeFrom((com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest other) {
      if (other == com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.getDefaultInstance()) return this;
      if (other.hasAccessPointGroup()) {
        mergeAccessPointGroup(other.getAccessPointGroup());
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
                  getAccessPointGroupFieldBuilder().getBuilder(),
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

    private com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup accessPointGroup_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder> accessPointGroupBuilder_;
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     * @return Whether the accessPointGroup field is set.
     */
    public boolean hasAccessPointGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     * @return The accessPointGroup.
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup getAccessPointGroup() {
      if (accessPointGroupBuilder_ == null) {
        return accessPointGroup_ == null ? com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance() : accessPointGroup_;
      } else {
        return accessPointGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    public Builder setAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup value) {
      if (accessPointGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessPointGroup_ = value;
      } else {
        accessPointGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    public Builder setAccessPointGroup(
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder builderForValue) {
      if (accessPointGroupBuilder_ == null) {
        accessPointGroup_ = builderForValue.build();
      } else {
        accessPointGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    public Builder mergeAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup value) {
      if (accessPointGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          accessPointGroup_ != null &&
          accessPointGroup_ != com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance()) {
          getAccessPointGroupBuilder().mergeFrom(value);
        } else {
          accessPointGroup_ = value;
        }
      } else {
        accessPointGroupBuilder_.mergeFrom(value);
      }
      if (accessPointGroup_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    public Builder clearAccessPointGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessPointGroup_ = null;
      if (accessPointGroupBuilder_ != null) {
        accessPointGroupBuilder_.dispose();
        accessPointGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder getAccessPointGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessPointGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder getAccessPointGroupOrBuilder() {
      if (accessPointGroupBuilder_ != null) {
        return accessPointGroupBuilder_.getMessageOrBuilder();
      } else {
        return accessPointGroup_ == null ?
            com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance() : accessPointGroup_;
      }
    }
    /**
     * <pre>
     * The access point group resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder> 
        getAccessPointGroupFieldBuilder() {
      if (accessPointGroupBuilder_ == null) {
        accessPointGroupBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder>(
                getAccessPointGroup(),
                getParentForChildren(),
                isClean());
        accessPointGroup_ = null;
      }
      return accessPointGroupBuilder_;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest)
  private static final com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest();
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccessPointGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAccessPointGroupRequest>() {
    @java.lang.Override
    public UpdateAccessPointGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAccessPointGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccessPointGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

