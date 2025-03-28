// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accesspointgroup.v1;

/**
 * <pre>
 * The response message for [`BatchCreateAccessPointGroupAccessPoints`][salto.nebula.user.v1.AccessPointGroupService.BatchCreateAccessPointGroupAccessPoints]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse}
 */
public final class BatchCreateAccessPointGroupAccessPointsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse)
    BatchCreateAccessPointGroupAccessPointsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      BatchCreateAccessPointGroupAccessPointsResponse.class.getName());
  }
  // Use BatchCreateAccessPointGroupAccessPointsResponse.newBuilder() to construct.
  private BatchCreateAccessPointGroupAccessPointsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateAccessPointGroupAccessPointsResponse() {
    accessPointGroupAccessPoints_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_BatchCreateAccessPointGroupAccessPointsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_BatchCreateAccessPointGroupAccessPointsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.class, com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.Builder.class);
  }

  public static final int ACCESS_POINT_GROUP_ACCESS_POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> accessPointGroupAccessPoints_;
  /**
   * <pre>
   * Access point group access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getAccessPointGroupAccessPointsList() {
    return accessPointGroupAccessPoints_;
  }
  /**
   * <pre>
   * Access point group access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder> 
      getAccessPointGroupAccessPointsOrBuilderList() {
    return accessPointGroupAccessPoints_;
  }
  /**
   * <pre>
   * Access point group access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public int getAccessPointGroupAccessPointsCount() {
    return accessPointGroupAccessPoints_.size();
  }
  /**
   * <pre>
   * Access point group access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoints(int index) {
    return accessPointGroupAccessPoints_.get(index);
  }
  /**
   * <pre>
   * Access point group access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder getAccessPointGroupAccessPointsOrBuilder(
      int index) {
    return accessPointGroupAccessPoints_.get(index);
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
    for (int i = 0; i < accessPointGroupAccessPoints_.size(); i++) {
      output.writeMessage(1, accessPointGroupAccessPoints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accessPointGroupAccessPoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accessPointGroupAccessPoints_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse other = (com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse) obj;

    if (!getAccessPointGroupAccessPointsList()
        .equals(other.getAccessPointGroupAccessPointsList())) return false;
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
    if (getAccessPointGroupAccessPointsCount() > 0) {
      hash = (37 * hash) + ACCESS_POINT_GROUP_ACCESS_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPointGroupAccessPointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse prototype) {
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
   * The response message for [`BatchCreateAccessPointGroupAccessPoints`][salto.nebula.user.v1.AccessPointGroupService.BatchCreateAccessPointGroupAccessPoints]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse)
      com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_BatchCreateAccessPointGroupAccessPointsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_BatchCreateAccessPointGroupAccessPointsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.class, com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.newBuilder()
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
      if (accessPointGroupAccessPointsBuilder_ == null) {
        accessPointGroupAccessPoints_ = java.util.Collections.emptyList();
      } else {
        accessPointGroupAccessPoints_ = null;
        accessPointGroupAccessPointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.internal_static_salto_nebula_accesspointgroup_v1_BatchCreateAccessPointGroupAccessPointsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse build() {
      com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse buildPartial() {
      com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse result = new com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse result) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessPointGroupAccessPoints_ = java.util.Collections.unmodifiableList(accessPointGroupAccessPoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessPointGroupAccessPoints_ = accessPointGroupAccessPoints_;
      } else {
        result.accessPointGroupAccessPoints_ = accessPointGroupAccessPointsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse) {
        return mergeFrom((com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse other) {
      if (other == com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.getDefaultInstance()) return this;
      if (accessPointGroupAccessPointsBuilder_ == null) {
        if (!other.accessPointGroupAccessPoints_.isEmpty()) {
          if (accessPointGroupAccessPoints_.isEmpty()) {
            accessPointGroupAccessPoints_ = other.accessPointGroupAccessPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessPointGroupAccessPointsIsMutable();
            accessPointGroupAccessPoints_.addAll(other.accessPointGroupAccessPoints_);
          }
          onChanged();
        }
      } else {
        if (!other.accessPointGroupAccessPoints_.isEmpty()) {
          if (accessPointGroupAccessPointsBuilder_.isEmpty()) {
            accessPointGroupAccessPointsBuilder_.dispose();
            accessPointGroupAccessPointsBuilder_ = null;
            accessPointGroupAccessPoints_ = other.accessPointGroupAccessPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessPointGroupAccessPointsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getAccessPointGroupAccessPointsFieldBuilder() : null;
          } else {
            accessPointGroupAccessPointsBuilder_.addAllMessages(other.accessPointGroupAccessPoints_);
          }
        }
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
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint m =
                  input.readMessage(
                      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.parser(),
                      extensionRegistry);
              if (accessPointGroupAccessPointsBuilder_ == null) {
                ensureAccessPointGroupAccessPointsIsMutable();
                accessPointGroupAccessPoints_.add(m);
              } else {
                accessPointGroupAccessPointsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> accessPointGroupAccessPoints_ =
      java.util.Collections.emptyList();
    private void ensureAccessPointGroupAccessPointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessPointGroupAccessPoints_ = new java.util.ArrayList<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>(accessPointGroupAccessPoints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder> accessPointGroupAccessPointsBuilder_;

    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getAccessPointGroupAccessPointsList() {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessPointGroupAccessPoints_);
      } else {
        return accessPointGroupAccessPointsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public int getAccessPointGroupAccessPointsCount() {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        return accessPointGroupAccessPoints_.size();
      } else {
        return accessPointGroupAccessPointsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoints(int index) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        return accessPointGroupAccessPoints_.get(index);
      } else {
        return accessPointGroupAccessPointsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder setAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.set(index, value);
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder setAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder builderForValue) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.add(value);
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.add(index, value);
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder builderForValue) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.add(builderForValue.build());
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder builderForValue) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAllAccessPointGroupAccessPoints(
        java.lang.Iterable<? extends com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> values) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        ensureAccessPointGroupAccessPointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accessPointGroupAccessPoints_);
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder clearAccessPointGroupAccessPoints() {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        accessPointGroupAccessPoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder removeAccessPointGroupAccessPoints(int index) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        ensureAccessPointGroupAccessPointsIsMutable();
        accessPointGroupAccessPoints_.remove(index);
        onChanged();
      } else {
        accessPointGroupAccessPointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder getAccessPointGroupAccessPointsBuilder(
        int index) {
      return getAccessPointGroupAccessPointsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder getAccessPointGroupAccessPointsOrBuilder(
        int index) {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        return accessPointGroupAccessPoints_.get(index);  } else {
        return accessPointGroupAccessPointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder> 
         getAccessPointGroupAccessPointsOrBuilderList() {
      if (accessPointGroupAccessPointsBuilder_ != null) {
        return accessPointGroupAccessPointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessPointGroupAccessPoints_);
      }
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder addAccessPointGroupAccessPointsBuilder() {
      return getAccessPointGroupAccessPointsFieldBuilder().addBuilder(
          com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder addAccessPointGroupAccessPointsBuilder(
        int index) {
      return getAccessPointGroupAccessPointsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Access point group access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder> 
         getAccessPointGroupAccessPointsBuilderList() {
      return getAccessPointGroupAccessPointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder> 
        getAccessPointGroupAccessPointsFieldBuilder() {
      if (accessPointGroupAccessPointsBuilder_ == null) {
        accessPointGroupAccessPointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder>(
                accessPointGroupAccessPoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accessPointGroupAccessPoints_ = null;
      }
      return accessPointGroupAccessPointsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse)
  private static final com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse();
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateAccessPointGroupAccessPointsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateAccessPointGroupAccessPointsResponse>() {
    @java.lang.Override
    public BatchCreateAccessPointGroupAccessPointsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateAccessPointGroupAccessPointsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateAccessPointGroupAccessPointsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

