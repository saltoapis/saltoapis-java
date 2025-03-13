// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accessright/v1/access_right.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accessright.v1;

/**
 * <pre>
 * The response message for [`BatchCreateAccessRightAccessPoints`][salto.nebula.user.v1.AccessRightService.BatchCreateAccessRightAccessPoints]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse}
 */
public final class BatchCreateAccessRightAccessPointsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse)
    BatchCreateAccessRightAccessPointsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      BatchCreateAccessRightAccessPointsResponse.class.getName());
  }
  // Use BatchCreateAccessRightAccessPointsResponse.newBuilder() to construct.
  private BatchCreateAccessRightAccessPointsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateAccessRightAccessPointsResponse() {
    accessRightAccessPoints_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.class, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.Builder.class);
  }

  public static final int ACCESS_RIGHT_ACCESS_POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> accessRightAccessPoints_;
  /**
   * <pre>
   * Access right access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getAccessRightAccessPointsList() {
    return accessRightAccessPoints_;
  }
  /**
   * <pre>
   * Access right access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder> 
      getAccessRightAccessPointsOrBuilderList() {
    return accessRightAccessPoints_;
  }
  /**
   * <pre>
   * Access right access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
   */
  @java.lang.Override
  public int getAccessRightAccessPointsCount() {
    return accessRightAccessPoints_.size();
  }
  /**
   * <pre>
   * Access right access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint getAccessRightAccessPoints(int index) {
    return accessRightAccessPoints_.get(index);
  }
  /**
   * <pre>
   * Access right access points created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder getAccessRightAccessPointsOrBuilder(
      int index) {
    return accessRightAccessPoints_.get(index);
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
    for (int i = 0; i < accessRightAccessPoints_.size(); i++) {
      output.writeMessage(1, accessRightAccessPoints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accessRightAccessPoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accessRightAccessPoints_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse other = (com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse) obj;

    if (!getAccessRightAccessPointsList()
        .equals(other.getAccessRightAccessPointsList())) return false;
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
    if (getAccessRightAccessPointsCount() > 0) {
      hash = (37 * hash) + ACCESS_RIGHT_ACCESS_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessRightAccessPointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse prototype) {
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
   * The response message for [`BatchCreateAccessRightAccessPoints`][salto.nebula.user.v1.AccessRightService.BatchCreateAccessRightAccessPoints]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse)
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.class, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.newBuilder()
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
      if (accessRightAccessPointsBuilder_ == null) {
        accessRightAccessPoints_ = java.util.Collections.emptyList();
      } else {
        accessRightAccessPoints_ = null;
        accessRightAccessPointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse build() {
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse buildPartial() {
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse result = new com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse result) {
      if (accessRightAccessPointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessRightAccessPoints_ = java.util.Collections.unmodifiableList(accessRightAccessPoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessRightAccessPoints_ = accessRightAccessPoints_;
      } else {
        result.accessRightAccessPoints_ = accessRightAccessPointsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse) {
        return mergeFrom((com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse other) {
      if (other == com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.getDefaultInstance()) return this;
      if (accessRightAccessPointsBuilder_ == null) {
        if (!other.accessRightAccessPoints_.isEmpty()) {
          if (accessRightAccessPoints_.isEmpty()) {
            accessRightAccessPoints_ = other.accessRightAccessPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessRightAccessPointsIsMutable();
            accessRightAccessPoints_.addAll(other.accessRightAccessPoints_);
          }
          onChanged();
        }
      } else {
        if (!other.accessRightAccessPoints_.isEmpty()) {
          if (accessRightAccessPointsBuilder_.isEmpty()) {
            accessRightAccessPointsBuilder_.dispose();
            accessRightAccessPointsBuilder_ = null;
            accessRightAccessPoints_ = other.accessRightAccessPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessRightAccessPointsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getAccessRightAccessPointsFieldBuilder() : null;
          } else {
            accessRightAccessPointsBuilder_.addAllMessages(other.accessRightAccessPoints_);
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
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint m =
                  input.readMessage(
                      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.parser(),
                      extensionRegistry);
              if (accessRightAccessPointsBuilder_ == null) {
                ensureAccessRightAccessPointsIsMutable();
                accessRightAccessPoints_.add(m);
              } else {
                accessRightAccessPointsBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> accessRightAccessPoints_ =
      java.util.Collections.emptyList();
    private void ensureAccessRightAccessPointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessRightAccessPoints_ = new java.util.ArrayList<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>(accessRightAccessPoints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder> accessRightAccessPointsBuilder_;

    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getAccessRightAccessPointsList() {
      if (accessRightAccessPointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessRightAccessPoints_);
      } else {
        return accessRightAccessPointsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public int getAccessRightAccessPointsCount() {
      if (accessRightAccessPointsBuilder_ == null) {
        return accessRightAccessPoints_.size();
      } else {
        return accessRightAccessPointsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint getAccessRightAccessPoints(int index) {
      if (accessRightAccessPointsBuilder_ == null) {
        return accessRightAccessPoints_.get(index);
      } else {
        return accessRightAccessPointsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder setAccessRightAccessPoints(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint value) {
      if (accessRightAccessPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.set(index, value);
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder setAccessRightAccessPoints(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder builderForValue) {
      if (accessRightAccessPointsBuilder_ == null) {
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder addAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint value) {
      if (accessRightAccessPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.add(value);
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder addAccessRightAccessPoints(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint value) {
      if (accessRightAccessPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.add(index, value);
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder addAccessRightAccessPoints(
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder builderForValue) {
      if (accessRightAccessPointsBuilder_ == null) {
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.add(builderForValue.build());
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder addAccessRightAccessPoints(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder builderForValue) {
      if (accessRightAccessPointsBuilder_ == null) {
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder addAllAccessRightAccessPoints(
        java.lang.Iterable<? extends com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> values) {
      if (accessRightAccessPointsBuilder_ == null) {
        ensureAccessRightAccessPointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accessRightAccessPoints_);
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder clearAccessRightAccessPoints() {
      if (accessRightAccessPointsBuilder_ == null) {
        accessRightAccessPoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public Builder removeAccessRightAccessPoints(int index) {
      if (accessRightAccessPointsBuilder_ == null) {
        ensureAccessRightAccessPointsIsMutable();
        accessRightAccessPoints_.remove(index);
        onChanged();
      } else {
        accessRightAccessPointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder getAccessRightAccessPointsBuilder(
        int index) {
      return getAccessRightAccessPointsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder getAccessRightAccessPointsOrBuilder(
        int index) {
      if (accessRightAccessPointsBuilder_ == null) {
        return accessRightAccessPoints_.get(index);  } else {
        return accessRightAccessPointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder> 
         getAccessRightAccessPointsOrBuilderList() {
      if (accessRightAccessPointsBuilder_ != null) {
        return accessRightAccessPointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessRightAccessPoints_);
      }
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder addAccessRightAccessPointsBuilder() {
      return getAccessRightAccessPointsFieldBuilder().addBuilder(
          com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder addAccessRightAccessPointsBuilder(
        int index) {
      return getAccessRightAccessPointsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Access right access points created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_points = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder> 
         getAccessRightAccessPointsBuilderList() {
      return getAccessRightAccessPointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder> 
        getAccessRightAccessPointsFieldBuilder() {
      if (accessRightAccessPointsBuilder_ == null) {
        accessRightAccessPointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder>(
                accessRightAccessPoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accessRightAccessPoints_ = null;
      }
      return accessRightAccessPointsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse)
  private static final com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse();
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateAccessRightAccessPointsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateAccessRightAccessPointsResponse>() {
    @java.lang.Override
    public BatchCreateAccessRightAccessPointsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateAccessRightAccessPointsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateAccessRightAccessPointsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

