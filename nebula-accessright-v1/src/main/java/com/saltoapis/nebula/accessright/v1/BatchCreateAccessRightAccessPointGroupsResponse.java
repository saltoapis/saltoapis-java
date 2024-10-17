// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accessright/v1/access_right.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accessright.v1;

/**
 * <pre>
 * The response message for [`BatchCreateAccessRightAccessPointGroups`][salto.nebula.user.v1.AccessRightService.BatchCreateAccessRightAccessPointGroups]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse}
 */
public final class BatchCreateAccessRightAccessPointGroupsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse)
    BatchCreateAccessRightAccessPointGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      BatchCreateAccessRightAccessPointGroupsResponse.class.getName());
  }
  // Use BatchCreateAccessRightAccessPointGroupsResponse.newBuilder() to construct.
  private BatchCreateAccessRightAccessPointGroupsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateAccessRightAccessPointGroupsResponse() {
    accessRightAccessPointGroups_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.class, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.Builder.class);
  }

  public static final int ACCESS_RIGHT_ACCESS_POINT_GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> accessRightAccessPointGroups_;
  /**
   * <pre>
   * Access right's access point groups created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getAccessRightAccessPointGroupsList() {
    return accessRightAccessPointGroups_;
  }
  /**
   * <pre>
   * Access right's access point groups created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder> 
      getAccessRightAccessPointGroupsOrBuilderList() {
    return accessRightAccessPointGroups_;
  }
  /**
   * <pre>
   * Access right's access point groups created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
   */
  @java.lang.Override
  public int getAccessRightAccessPointGroupsCount() {
    return accessRightAccessPointGroups_.size();
  }
  /**
   * <pre>
   * Access right's access point groups created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup getAccessRightAccessPointGroups(int index) {
    return accessRightAccessPointGroups_.get(index);
  }
  /**
   * <pre>
   * Access right's access point groups created.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder getAccessRightAccessPointGroupsOrBuilder(
      int index) {
    return accessRightAccessPointGroups_.get(index);
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
    for (int i = 0; i < accessRightAccessPointGroups_.size(); i++) {
      output.writeMessage(1, accessRightAccessPointGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accessRightAccessPointGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accessRightAccessPointGroups_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse other = (com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse) obj;

    if (!getAccessRightAccessPointGroupsList()
        .equals(other.getAccessRightAccessPointGroupsList())) return false;
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
    if (getAccessRightAccessPointGroupsCount() > 0) {
      hash = (37 * hash) + ACCESS_RIGHT_ACCESS_POINT_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessRightAccessPointGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse prototype) {
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
   * The response message for [`BatchCreateAccessRightAccessPointGroups`][salto.nebula.user.v1.AccessRightService.BatchCreateAccessRightAccessPointGroups]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse)
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.class, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.newBuilder()
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
      if (accessRightAccessPointGroupsBuilder_ == null) {
        accessRightAccessPointGroups_ = java.util.Collections.emptyList();
      } else {
        accessRightAccessPointGroups_ = null;
        accessRightAccessPointGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse build() {
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse buildPartial() {
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse result = new com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse result) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accessRightAccessPointGroups_ = java.util.Collections.unmodifiableList(accessRightAccessPointGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accessRightAccessPointGroups_ = accessRightAccessPointGroups_;
      } else {
        result.accessRightAccessPointGroups_ = accessRightAccessPointGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse) {
        return mergeFrom((com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse other) {
      if (other == com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.getDefaultInstance()) return this;
      if (accessRightAccessPointGroupsBuilder_ == null) {
        if (!other.accessRightAccessPointGroups_.isEmpty()) {
          if (accessRightAccessPointGroups_.isEmpty()) {
            accessRightAccessPointGroups_ = other.accessRightAccessPointGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessRightAccessPointGroupsIsMutable();
            accessRightAccessPointGroups_.addAll(other.accessRightAccessPointGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.accessRightAccessPointGroups_.isEmpty()) {
          if (accessRightAccessPointGroupsBuilder_.isEmpty()) {
            accessRightAccessPointGroupsBuilder_.dispose();
            accessRightAccessPointGroupsBuilder_ = null;
            accessRightAccessPointGroups_ = other.accessRightAccessPointGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessRightAccessPointGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getAccessRightAccessPointGroupsFieldBuilder() : null;
          } else {
            accessRightAccessPointGroupsBuilder_.addAllMessages(other.accessRightAccessPointGroups_);
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
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup m =
                  input.readMessage(
                      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.parser(),
                      extensionRegistry);
              if (accessRightAccessPointGroupsBuilder_ == null) {
                ensureAccessRightAccessPointGroupsIsMutable();
                accessRightAccessPointGroups_.add(m);
              } else {
                accessRightAccessPointGroupsBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> accessRightAccessPointGroups_ =
      java.util.Collections.emptyList();
    private void ensureAccessRightAccessPointGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accessRightAccessPointGroups_ = new java.util.ArrayList<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>(accessRightAccessPointGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder> accessRightAccessPointGroupsBuilder_;

    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getAccessRightAccessPointGroupsList() {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accessRightAccessPointGroups_);
      } else {
        return accessRightAccessPointGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public int getAccessRightAccessPointGroupsCount() {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        return accessRightAccessPointGroups_.size();
      } else {
        return accessRightAccessPointGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup getAccessRightAccessPointGroups(int index) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        return accessRightAccessPointGroups_.get(index);
      } else {
        return accessRightAccessPointGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder setAccessRightAccessPointGroups(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup value) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.set(index, value);
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder setAccessRightAccessPointGroups(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder builderForValue) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder addAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup value) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.add(value);
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder addAccessRightAccessPointGroups(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup value) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.add(index, value);
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder addAccessRightAccessPointGroups(
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder builderForValue) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.add(builderForValue.build());
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder addAccessRightAccessPointGroups(
        int index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder builderForValue) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder addAllAccessRightAccessPointGroups(
        java.lang.Iterable<? extends com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> values) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        ensureAccessRightAccessPointGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accessRightAccessPointGroups_);
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder clearAccessRightAccessPointGroups() {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        accessRightAccessPointGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public Builder removeAccessRightAccessPointGroups(int index) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        ensureAccessRightAccessPointGroupsIsMutable();
        accessRightAccessPointGroups_.remove(index);
        onChanged();
      } else {
        accessRightAccessPointGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder getAccessRightAccessPointGroupsBuilder(
        int index) {
      return getAccessRightAccessPointGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder getAccessRightAccessPointGroupsOrBuilder(
        int index) {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        return accessRightAccessPointGroups_.get(index);  } else {
        return accessRightAccessPointGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder> 
         getAccessRightAccessPointGroupsOrBuilderList() {
      if (accessRightAccessPointGroupsBuilder_ != null) {
        return accessRightAccessPointGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accessRightAccessPointGroups_);
      }
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder addAccessRightAccessPointGroupsBuilder() {
      return getAccessRightAccessPointGroupsFieldBuilder().addBuilder(
          com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder addAccessRightAccessPointGroupsBuilder(
        int index) {
      return getAccessRightAccessPointGroupsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * Access right's access point groups created.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_groups = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder> 
         getAccessRightAccessPointGroupsBuilderList() {
      return getAccessRightAccessPointGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder> 
        getAccessRightAccessPointGroupsFieldBuilder() {
      if (accessRightAccessPointGroupsBuilder_ == null) {
        accessRightAccessPointGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder>(
                accessRightAccessPointGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accessRightAccessPointGroups_ = null;
      }
      return accessRightAccessPointGroupsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse)
  private static final com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse();
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateAccessRightAccessPointGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateAccessRightAccessPointGroupsResponse>() {
    @java.lang.Override
    public BatchCreateAccessRightAccessPointGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateAccessRightAccessPointGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateAccessRightAccessPointGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
