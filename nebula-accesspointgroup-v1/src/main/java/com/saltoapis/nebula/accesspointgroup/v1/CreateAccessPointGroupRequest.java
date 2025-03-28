// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accesspointgroup.v1;

/**
 * <pre>
 * The request message for [`CreateAccessPointGroup`][salto.nebula.accesspointgroup.v1.AccessPointGroupService.CreateAccessPointGroup]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest}
 */
public final class CreateAccessPointGroupRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)
    CreateAccessPointGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateAccessPointGroupRequest.class.getName());
  }
  // Use CreateAccessPointGroupRequest.newBuilder() to construct.
  private CreateAccessPointGroupRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateAccessPointGroupRequest() {
    parent_ = "";
    accessPointGroupId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_CreateAccessPointGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_CreateAccessPointGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.class, com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where to create the access point
   * group. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of the parent resource where to create the access point
   * group. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_POINT_GROUP_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accessPointGroupId_ = "";
  /**
   * <pre>
   * The access point group ID to use for this access point group. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_group_id = 2;</code>
   * @return Whether the accessPointGroupId field is set.
   */
  @java.lang.Override
  public boolean hasAccessPointGroupId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The access point group ID to use for this access point group. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_group_id = 2;</code>
   * @return The accessPointGroupId.
   */
  @java.lang.Override
  public java.lang.String getAccessPointGroupId() {
    java.lang.Object ref = accessPointGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessPointGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The access point group ID to use for this access point group. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_group_id = 2;</code>
   * @return The bytes for accessPointGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccessPointGroupIdBytes() {
    java.lang.Object ref = accessPointGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessPointGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_POINT_GROUP_FIELD_NUMBER = 3;
  private com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup accessPointGroup_;
  /**
   * <pre>
   * The access point group resource to be created. Client must not set the
   * `AccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
   * @return Whether the accessPointGroup field is set.
   */
  @java.lang.Override
  public boolean hasAccessPointGroup() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The access point group resource to be created. Client must not set the
   * `AccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
   * @return The accessPointGroup.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup getAccessPointGroup() {
    return accessPointGroup_ == null ? com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance() : accessPointGroup_;
  }
  /**
   * <pre>
   * The access point group resource to be created. Client must not set the
   * `AccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder getAccessPointGroupOrBuilder() {
    return accessPointGroup_ == null ? com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance() : accessPointGroup_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, accessPointGroupId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getAccessPointGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, accessPointGroupId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAccessPointGroup());
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
    if (!(obj instanceof com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest other = (com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasAccessPointGroupId() != other.hasAccessPointGroupId()) return false;
    if (hasAccessPointGroupId()) {
      if (!getAccessPointGroupId()
          .equals(other.getAccessPointGroupId())) return false;
    }
    if (hasAccessPointGroup() != other.hasAccessPointGroup()) return false;
    if (hasAccessPointGroup()) {
      if (!getAccessPointGroup()
          .equals(other.getAccessPointGroup())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasAccessPointGroupId()) {
      hash = (37 * hash) + ACCESS_POINT_GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPointGroupId().hashCode();
    }
    if (hasAccessPointGroup()) {
      hash = (37 * hash) + ACCESS_POINT_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPointGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest prototype) {
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
   * The request message for [`CreateAccessPointGroup`][salto.nebula.accesspointgroup.v1.AccessPointGroupService.CreateAccessPointGroup]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)
      com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_CreateAccessPointGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_CreateAccessPointGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.class, com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      accessPointGroupId_ = "";
      accessPointGroup_ = null;
      if (accessPointGroupBuilder_ != null) {
        accessPointGroupBuilder_.dispose();
        accessPointGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_CreateAccessPointGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest build() {
      com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest buildPartial() {
      com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest result = new com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accessPointGroupId_ = accessPointGroupId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accessPointGroup_ = accessPointGroupBuilder_ == null
            ? accessPointGroup_
            : accessPointGroupBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest) {
        return mergeFrom((com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest other) {
      if (other == com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAccessPointGroupId()) {
        accessPointGroupId_ = other.accessPointGroupId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasAccessPointGroup()) {
        mergeAccessPointGroup(other.getAccessPointGroup());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              accessPointGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAccessPointGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Resource name of the parent resource where to create the access point
     * group. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the access point
     * group. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the access point
     * group. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the access point
     * group. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the parent resource where to create the access point
     * group. For example: `installations/surelock-homes-hq`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object accessPointGroupId_ = "";
    /**
     * <pre>
     * The access point group ID to use for this access point group. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string access_point_group_id = 2;</code>
     * @return Whether the accessPointGroupId field is set.
     */
    public boolean hasAccessPointGroupId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The access point group ID to use for this access point group. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string access_point_group_id = 2;</code>
     * @return The accessPointGroupId.
     */
    public java.lang.String getAccessPointGroupId() {
      java.lang.Object ref = accessPointGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessPointGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The access point group ID to use for this access point group. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string access_point_group_id = 2;</code>
     * @return The bytes for accessPointGroupId.
     */
    public com.google.protobuf.ByteString
        getAccessPointGroupIdBytes() {
      java.lang.Object ref = accessPointGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessPointGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The access point group ID to use for this access point group. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string access_point_group_id = 2;</code>
     * @param value The accessPointGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setAccessPointGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accessPointGroupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group ID to use for this access point group. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string access_point_group_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessPointGroupId() {
      accessPointGroupId_ = getDefaultInstance().getAccessPointGroupId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group ID to use for this access point group. In
     * case it's empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string access_point_group_id = 2;</code>
     * @param value The bytes for accessPointGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setAccessPointGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accessPointGroupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup accessPointGroup_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder> accessPointGroupBuilder_;
    /**
     * <pre>
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
     * @return Whether the accessPointGroup field is set.
     */
    public boolean hasAccessPointGroup() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
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
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
     */
    public Builder setAccessPointGroup(
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder builderForValue) {
      if (accessPointGroupBuilder_ == null) {
        accessPointGroup_ = builderForValue.build();
      } else {
        accessPointGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
     */
    public Builder mergeAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup value) {
      if (accessPointGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
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
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
     */
    public Builder clearAccessPointGroup() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.Builder getAccessPointGroupBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAccessPointGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
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
     * The access point group resource to be created. Client must not set the
     * `AccessPointGroup.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)
  private static final com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest();
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccessPointGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAccessPointGroupRequest>() {
    @java.lang.Override
    public CreateAccessPointGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAccessPointGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccessPointGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

