// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/user/v1/user.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.user.v1;

/**
 * <pre>
 * The response message for [`ListUserAccessRights`][salto.nebula.user.v1.UserService.ListUserAccessRights]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.user.v1.ListUserAccessRightsResponse}
 */
public final class ListUserAccessRightsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.user.v1.ListUserAccessRightsResponse)
    ListUserAccessRightsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListUserAccessRightsResponse.class.getName());
  }
  // Use ListUserAccessRightsResponse.newBuilder() to construct.
  private ListUserAccessRightsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListUserAccessRightsResponse() {
    userAccessRights_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_ListUserAccessRightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_ListUserAccessRightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.class, com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.Builder.class);
  }

  public static final int USER_ACCESS_RIGHTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.user.v1.UserAccessRight> userAccessRights_;
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.user.v1.UserAccessRight> getUserAccessRightsList() {
    return userAccessRights_;
  }
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder> 
      getUserAccessRightsOrBuilderList() {
    return userAccessRights_;
  }
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  @java.lang.Override
  public int getUserAccessRightsCount() {
    return userAccessRights_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.UserAccessRight getUserAccessRights(int index) {
    return userAccessRights_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder getUserAccessRightsOrBuilder(
      int index) {
    return userAccessRights_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < userAccessRights_.size(); i++) {
      output.writeMessage(1, userAccessRights_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userAccessRights_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userAccessRights_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse other = (com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse) obj;

    if (!getUserAccessRightsList()
        .equals(other.getUserAccessRightsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getUserAccessRightsCount() > 0) {
      hash = (37 * hash) + USER_ACCESS_RIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getUserAccessRightsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse prototype) {
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
   * The response message for [`ListUserAccessRights`][salto.nebula.user.v1.UserService.ListUserAccessRights]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.user.v1.ListUserAccessRightsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.user.v1.ListUserAccessRightsResponse)
      com.saltoapis.nebula.user.v1.ListUserAccessRightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_ListUserAccessRightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_ListUserAccessRightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.class, com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.newBuilder()
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
      if (userAccessRightsBuilder_ == null) {
        userAccessRights_ = java.util.Collections.emptyList();
      } else {
        userAccessRights_ = null;
        userAccessRightsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_ListUserAccessRightsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse build() {
      com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse buildPartial() {
      com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse result = new com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse result) {
      if (userAccessRightsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userAccessRights_ = java.util.Collections.unmodifiableList(userAccessRights_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userAccessRights_ = userAccessRights_;
      } else {
        result.userAccessRights_ = userAccessRightsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse) {
        return mergeFrom((com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse other) {
      if (other == com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.getDefaultInstance()) return this;
      if (userAccessRightsBuilder_ == null) {
        if (!other.userAccessRights_.isEmpty()) {
          if (userAccessRights_.isEmpty()) {
            userAccessRights_ = other.userAccessRights_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserAccessRightsIsMutable();
            userAccessRights_.addAll(other.userAccessRights_);
          }
          onChanged();
        }
      } else {
        if (!other.userAccessRights_.isEmpty()) {
          if (userAccessRightsBuilder_.isEmpty()) {
            userAccessRightsBuilder_.dispose();
            userAccessRightsBuilder_ = null;
            userAccessRights_ = other.userAccessRights_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userAccessRightsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getUserAccessRightsFieldBuilder() : null;
          } else {
            userAccessRightsBuilder_.addAllMessages(other.userAccessRights_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              com.saltoapis.nebula.user.v1.UserAccessRight m =
                  input.readMessage(
                      com.saltoapis.nebula.user.v1.UserAccessRight.parser(),
                      extensionRegistry);
              if (userAccessRightsBuilder_ == null) {
                ensureUserAccessRightsIsMutable();
                userAccessRights_.add(m);
              } else {
                userAccessRightsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.saltoapis.nebula.user.v1.UserAccessRight> userAccessRights_ =
      java.util.Collections.emptyList();
    private void ensureUserAccessRightsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userAccessRights_ = new java.util.ArrayList<com.saltoapis.nebula.user.v1.UserAccessRight>(userAccessRights_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.user.v1.UserAccessRight, com.saltoapis.nebula.user.v1.UserAccessRight.Builder, com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder> userAccessRightsBuilder_;

    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.user.v1.UserAccessRight> getUserAccessRightsList() {
      if (userAccessRightsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userAccessRights_);
      } else {
        return userAccessRightsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public int getUserAccessRightsCount() {
      if (userAccessRightsBuilder_ == null) {
        return userAccessRights_.size();
      } else {
        return userAccessRightsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight getUserAccessRights(int index) {
      if (userAccessRightsBuilder_ == null) {
        return userAccessRights_.get(index);
      } else {
        return userAccessRightsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder setUserAccessRights(
        int index, com.saltoapis.nebula.user.v1.UserAccessRight value) {
      if (userAccessRightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserAccessRightsIsMutable();
        userAccessRights_.set(index, value);
        onChanged();
      } else {
        userAccessRightsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder setUserAccessRights(
        int index, com.saltoapis.nebula.user.v1.UserAccessRight.Builder builderForValue) {
      if (userAccessRightsBuilder_ == null) {
        ensureUserAccessRightsIsMutable();
        userAccessRights_.set(index, builderForValue.build());
        onChanged();
      } else {
        userAccessRightsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder addUserAccessRights(com.saltoapis.nebula.user.v1.UserAccessRight value) {
      if (userAccessRightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserAccessRightsIsMutable();
        userAccessRights_.add(value);
        onChanged();
      } else {
        userAccessRightsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder addUserAccessRights(
        int index, com.saltoapis.nebula.user.v1.UserAccessRight value) {
      if (userAccessRightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserAccessRightsIsMutable();
        userAccessRights_.add(index, value);
        onChanged();
      } else {
        userAccessRightsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder addUserAccessRights(
        com.saltoapis.nebula.user.v1.UserAccessRight.Builder builderForValue) {
      if (userAccessRightsBuilder_ == null) {
        ensureUserAccessRightsIsMutable();
        userAccessRights_.add(builderForValue.build());
        onChanged();
      } else {
        userAccessRightsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder addUserAccessRights(
        int index, com.saltoapis.nebula.user.v1.UserAccessRight.Builder builderForValue) {
      if (userAccessRightsBuilder_ == null) {
        ensureUserAccessRightsIsMutable();
        userAccessRights_.add(index, builderForValue.build());
        onChanged();
      } else {
        userAccessRightsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder addAllUserAccessRights(
        java.lang.Iterable<? extends com.saltoapis.nebula.user.v1.UserAccessRight> values) {
      if (userAccessRightsBuilder_ == null) {
        ensureUserAccessRightsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userAccessRights_);
        onChanged();
      } else {
        userAccessRightsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder clearUserAccessRights() {
      if (userAccessRightsBuilder_ == null) {
        userAccessRights_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userAccessRightsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public Builder removeUserAccessRights(int index) {
      if (userAccessRightsBuilder_ == null) {
        ensureUserAccessRightsIsMutable();
        userAccessRights_.remove(index);
        onChanged();
      } else {
        userAccessRightsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight.Builder getUserAccessRightsBuilder(
        int index) {
      return getUserAccessRightsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder getUserAccessRightsOrBuilder(
        int index) {
      if (userAccessRightsBuilder_ == null) {
        return userAccessRights_.get(index);  } else {
        return userAccessRightsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder> 
         getUserAccessRightsOrBuilderList() {
      if (userAccessRightsBuilder_ != null) {
        return userAccessRightsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userAccessRights_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight.Builder addUserAccessRightsBuilder() {
      return getUserAccessRightsFieldBuilder().addBuilder(
          com.saltoapis.nebula.user.v1.UserAccessRight.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight.Builder addUserAccessRightsBuilder(
        int index) {
      return getUserAccessRightsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.user.v1.UserAccessRight.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `user_access_rights` in the method
     * name. There will be a maximum number of items returned based on the
     * `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.user.v1.UserAccessRight.Builder> 
         getUserAccessRightsBuilderList() {
      return getUserAccessRightsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.user.v1.UserAccessRight, com.saltoapis.nebula.user.v1.UserAccessRight.Builder, com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder> 
        getUserAccessRightsFieldBuilder() {
      if (userAccessRightsBuilder_ == null) {
        userAccessRightsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.user.v1.UserAccessRight, com.saltoapis.nebula.user.v1.UserAccessRight.Builder, com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder>(
                userAccessRights_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userAccessRights_ = null;
      }
      return userAccessRightsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.user.v1.ListUserAccessRightsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.user.v1.ListUserAccessRightsResponse)
  private static final com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse();
  }

  public static com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUserAccessRightsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUserAccessRightsResponse>() {
    @java.lang.Override
    public ListUserAccessRightsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUserAccessRightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUserAccessRightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

