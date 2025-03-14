// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/types.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the cancelation of a user's app key.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.AppKeyCanceled}
 */
public final class AppKeyCanceled extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.AppKeyCanceled)
    AppKeyCanceledOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      AppKeyCanceled.class.getName());
  }
  // Use AppKeyCanceled.newBuilder() to construct.
  private AppKeyCanceled(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AppKeyCanceled() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AppKeyCanceled_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AppKeyCanceled_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.event.v1.AppKeyCanceled.class, com.saltoapis.nebula.event.v1.AppKeyCanceled.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.user.v1.User user_;
  /**
   * <pre>
   * App key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * App key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return The user.
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.User getUser() {
    return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * App key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
  }

  public static final int APP_KEY_FIELD_NUMBER = 2;
  private com.saltoapis.nebula.user.v1.AppKey appKey_;
  /**
   * <pre>
   * App key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
   * @return Whether the appKey field is set.
   */
  @java.lang.Override
  public boolean hasAppKey() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * App key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
   * @return The appKey.
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.AppKey getAppKey() {
    return appKey_ == null ? com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance() : appKey_;
  }
  /**
   * <pre>
   * App key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.AppKeyOrBuilder getAppKeyOrBuilder() {
    return appKey_ == null ? com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance() : appKey_;
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
      output.writeMessage(1, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getAppKey());
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
        .computeMessageSize(1, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppKey());
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
    if (!(obj instanceof com.saltoapis.nebula.event.v1.AppKeyCanceled)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.event.v1.AppKeyCanceled other = (com.saltoapis.nebula.event.v1.AppKeyCanceled) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (hasAppKey() != other.hasAppKey()) return false;
    if (hasAppKey()) {
      if (!getAppKey()
          .equals(other.getAppKey())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (hasAppKey()) {
      hash = (37 * hash) + APP_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getAppKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AppKeyCanceled parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.AppKeyCanceled prototype) {
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
   * Event representing the cancelation of a user's app key.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.AppKeyCanceled}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.AppKeyCanceled)
      com.saltoapis.nebula.event.v1.AppKeyCanceledOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AppKeyCanceled_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AppKeyCanceled_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.event.v1.AppKeyCanceled.class, com.saltoapis.nebula.event.v1.AppKeyCanceled.Builder.class);
    }

    // Construct using com.saltoapis.nebula.event.v1.AppKeyCanceled.newBuilder()
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
        getUserFieldBuilder();
        getAppKeyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      appKey_ = null;
      if (appKeyBuilder_ != null) {
        appKeyBuilder_.dispose();
        appKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AppKeyCanceled_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AppKeyCanceled getDefaultInstanceForType() {
      return com.saltoapis.nebula.event.v1.AppKeyCanceled.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AppKeyCanceled build() {
      com.saltoapis.nebula.event.v1.AppKeyCanceled result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AppKeyCanceled buildPartial() {
      com.saltoapis.nebula.event.v1.AppKeyCanceled result = new com.saltoapis.nebula.event.v1.AppKeyCanceled(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.event.v1.AppKeyCanceled result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appKey_ = appKeyBuilder_ == null
            ? appKey_
            : appKeyBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.event.v1.AppKeyCanceled) {
        return mergeFrom((com.saltoapis.nebula.event.v1.AppKeyCanceled)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.event.v1.AppKeyCanceled other) {
      if (other == com.saltoapis.nebula.event.v1.AppKeyCanceled.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.hasAppKey()) {
        mergeAppKey(other.getAppKey());
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
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAppKeyFieldBuilder().getBuilder(),
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

    private com.saltoapis.nebula.user.v1.User user_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.User, com.saltoapis.nebula.user.v1.User.Builder, com.saltoapis.nebula.user.v1.UserOrBuilder> userBuilder_;
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     * @return The user.
     */
    public com.saltoapis.nebula.user.v1.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    public Builder setUser(com.saltoapis.nebula.user.v1.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    public Builder setUser(
        com.saltoapis.nebula.user.v1.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    public Builder mergeUser(com.saltoapis.nebula.user.v1.User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          user_ != null &&
          user_ != com.saltoapis.nebula.user.v1.User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.User.Builder getUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * App key's user.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.User, com.saltoapis.nebula.user.v1.User.Builder, com.saltoapis.nebula.user.v1.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.user.v1.User, com.saltoapis.nebula.user.v1.User.Builder, com.saltoapis.nebula.user.v1.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private com.saltoapis.nebula.user.v1.AppKey appKey_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.AppKey, com.saltoapis.nebula.user.v1.AppKey.Builder, com.saltoapis.nebula.user.v1.AppKeyOrBuilder> appKeyBuilder_;
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     * @return Whether the appKey field is set.
     */
    public boolean hasAppKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     * @return The appKey.
     */
    public com.saltoapis.nebula.user.v1.AppKey getAppKey() {
      if (appKeyBuilder_ == null) {
        return appKey_ == null ? com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance() : appKey_;
      } else {
        return appKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    public Builder setAppKey(com.saltoapis.nebula.user.v1.AppKey value) {
      if (appKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appKey_ = value;
      } else {
        appKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    public Builder setAppKey(
        com.saltoapis.nebula.user.v1.AppKey.Builder builderForValue) {
      if (appKeyBuilder_ == null) {
        appKey_ = builderForValue.build();
      } else {
        appKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    public Builder mergeAppKey(com.saltoapis.nebula.user.v1.AppKey value) {
      if (appKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          appKey_ != null &&
          appKey_ != com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance()) {
          getAppKeyBuilder().mergeFrom(value);
        } else {
          appKey_ = value;
        }
      } else {
        appKeyBuilder_.mergeFrom(value);
      }
      if (appKey_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    public Builder clearAppKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appKey_ = null;
      if (appKeyBuilder_ != null) {
        appKeyBuilder_.dispose();
        appKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    public com.saltoapis.nebula.user.v1.AppKey.Builder getAppKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAppKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    public com.saltoapis.nebula.user.v1.AppKeyOrBuilder getAppKeyOrBuilder() {
      if (appKeyBuilder_ != null) {
        return appKeyBuilder_.getMessageOrBuilder();
      } else {
        return appKey_ == null ?
            com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance() : appKey_;
      }
    }
    /**
     * <pre>
     * App key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.AppKey, com.saltoapis.nebula.user.v1.AppKey.Builder, com.saltoapis.nebula.user.v1.AppKeyOrBuilder> 
        getAppKeyFieldBuilder() {
      if (appKeyBuilder_ == null) {
        appKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.user.v1.AppKey, com.saltoapis.nebula.user.v1.AppKey.Builder, com.saltoapis.nebula.user.v1.AppKeyOrBuilder>(
                getAppKey(),
                getParentForChildren(),
                isClean());
        appKey_ = null;
      }
      return appKeyBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.AppKeyCanceled)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.AppKeyCanceled)
  private static final com.saltoapis.nebula.event.v1.AppKeyCanceled DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.event.v1.AppKeyCanceled();
  }

  public static com.saltoapis.nebula.event.v1.AppKeyCanceled getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppKeyCanceled>
      PARSER = new com.google.protobuf.AbstractParser<AppKeyCanceled>() {
    @java.lang.Override
    public AppKeyCanceled parsePartialFrom(
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

  public static com.google.protobuf.Parser<AppKeyCanceled> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppKeyCanceled> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.event.v1.AppKeyCanceled getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

