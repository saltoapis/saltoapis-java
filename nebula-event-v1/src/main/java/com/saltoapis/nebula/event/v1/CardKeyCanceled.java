// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/types.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the cancelation of a user's card key.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.CardKeyCanceled}
 */
public final class CardKeyCanceled extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.CardKeyCanceled)
    CardKeyCanceledOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CardKeyCanceled.class.getName());
  }
  // Use CardKeyCanceled.newBuilder() to construct.
  private CardKeyCanceled(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CardKeyCanceled() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_CardKeyCanceled_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_CardKeyCanceled_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.event.v1.CardKeyCanceled.class, com.saltoapis.nebula.event.v1.CardKeyCanceled.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.user.v1.User user_;
  /**
   * <pre>
   * Card key's user.
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
   * Card key's user.
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
   * Card key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
  }

  public static final int CARD_KEY_FIELD_NUMBER = 2;
  private com.saltoapis.nebula.user.v1.CardKey cardKey_;
  /**
   * <pre>
   * Card key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
   * @return Whether the cardKey field is set.
   */
  @java.lang.Override
  public boolean hasCardKey() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Card key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
   * @return The cardKey.
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.CardKey getCardKey() {
    return cardKey_ == null ? com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance() : cardKey_;
  }
  /**
   * <pre>
   * Card key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.CardKeyOrBuilder getCardKeyOrBuilder() {
    return cardKey_ == null ? com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance() : cardKey_;
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
      output.writeMessage(2, getCardKey());
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
        .computeMessageSize(2, getCardKey());
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
    if (!(obj instanceof com.saltoapis.nebula.event.v1.CardKeyCanceled)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.event.v1.CardKeyCanceled other = (com.saltoapis.nebula.event.v1.CardKeyCanceled) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (hasCardKey() != other.hasCardKey()) return false;
    if (hasCardKey()) {
      if (!getCardKey()
          .equals(other.getCardKey())) return false;
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
    if (hasCardKey()) {
      hash = (37 * hash) + CARD_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getCardKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.CardKeyCanceled parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.CardKeyCanceled prototype) {
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
   * Event representing the cancelation of a user's card key.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.CardKeyCanceled}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.CardKeyCanceled)
      com.saltoapis.nebula.event.v1.CardKeyCanceledOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_CardKeyCanceled_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_CardKeyCanceled_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.event.v1.CardKeyCanceled.class, com.saltoapis.nebula.event.v1.CardKeyCanceled.Builder.class);
    }

    // Construct using com.saltoapis.nebula.event.v1.CardKeyCanceled.newBuilder()
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
        getCardKeyFieldBuilder();
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
      cardKey_ = null;
      if (cardKeyBuilder_ != null) {
        cardKeyBuilder_.dispose();
        cardKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_CardKeyCanceled_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.CardKeyCanceled getDefaultInstanceForType() {
      return com.saltoapis.nebula.event.v1.CardKeyCanceled.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.CardKeyCanceled build() {
      com.saltoapis.nebula.event.v1.CardKeyCanceled result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.CardKeyCanceled buildPartial() {
      com.saltoapis.nebula.event.v1.CardKeyCanceled result = new com.saltoapis.nebula.event.v1.CardKeyCanceled(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.event.v1.CardKeyCanceled result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cardKey_ = cardKeyBuilder_ == null
            ? cardKey_
            : cardKeyBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.event.v1.CardKeyCanceled) {
        return mergeFrom((com.saltoapis.nebula.event.v1.CardKeyCanceled)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.event.v1.CardKeyCanceled other) {
      if (other == com.saltoapis.nebula.event.v1.CardKeyCanceled.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.hasCardKey()) {
        mergeCardKey(other.getCardKey());
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
                  getCardKeyFieldBuilder().getBuilder(),
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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
     * Card key's user.
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

    private com.saltoapis.nebula.user.v1.CardKey cardKey_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.CardKey, com.saltoapis.nebula.user.v1.CardKey.Builder, com.saltoapis.nebula.user.v1.CardKeyOrBuilder> cardKeyBuilder_;
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     * @return Whether the cardKey field is set.
     */
    public boolean hasCardKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     * @return The cardKey.
     */
    public com.saltoapis.nebula.user.v1.CardKey getCardKey() {
      if (cardKeyBuilder_ == null) {
        return cardKey_ == null ? com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance() : cardKey_;
      } else {
        return cardKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    public Builder setCardKey(com.saltoapis.nebula.user.v1.CardKey value) {
      if (cardKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cardKey_ = value;
      } else {
        cardKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    public Builder setCardKey(
        com.saltoapis.nebula.user.v1.CardKey.Builder builderForValue) {
      if (cardKeyBuilder_ == null) {
        cardKey_ = builderForValue.build();
      } else {
        cardKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    public Builder mergeCardKey(com.saltoapis.nebula.user.v1.CardKey value) {
      if (cardKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          cardKey_ != null &&
          cardKey_ != com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance()) {
          getCardKeyBuilder().mergeFrom(value);
        } else {
          cardKey_ = value;
        }
      } else {
        cardKeyBuilder_.mergeFrom(value);
      }
      if (cardKey_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    public Builder clearCardKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cardKey_ = null;
      if (cardKeyBuilder_ != null) {
        cardKeyBuilder_.dispose();
        cardKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    public com.saltoapis.nebula.user.v1.CardKey.Builder getCardKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCardKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    public com.saltoapis.nebula.user.v1.CardKeyOrBuilder getCardKeyOrBuilder() {
      if (cardKeyBuilder_ != null) {
        return cardKeyBuilder_.getMessageOrBuilder();
      } else {
        return cardKey_ == null ?
            com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance() : cardKey_;
      }
    }
    /**
     * <pre>
     * Card key canceled.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.CardKey card_key = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.CardKey, com.saltoapis.nebula.user.v1.CardKey.Builder, com.saltoapis.nebula.user.v1.CardKeyOrBuilder> 
        getCardKeyFieldBuilder() {
      if (cardKeyBuilder_ == null) {
        cardKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.user.v1.CardKey, com.saltoapis.nebula.user.v1.CardKey.Builder, com.saltoapis.nebula.user.v1.CardKeyOrBuilder>(
                getCardKey(),
                getParentForChildren(),
                isClean());
        cardKey_ = null;
      }
      return cardKeyBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.CardKeyCanceled)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.CardKeyCanceled)
  private static final com.saltoapis.nebula.event.v1.CardKeyCanceled DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.event.v1.CardKeyCanceled();
  }

  public static com.saltoapis.nebula.event.v1.CardKeyCanceled getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardKeyCanceled>
      PARSER = new com.google.protobuf.AbstractParser<CardKeyCanceled>() {
    @java.lang.Override
    public CardKeyCanceled parsePartialFrom(
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

  public static com.google.protobuf.Parser<CardKeyCanceled> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardKeyCanceled> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.event.v1.CardKeyCanceled getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

