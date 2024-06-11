// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.user.v1;

/**
 * <pre>
 * The request message for [`AssignCardkey`][salto.nebula.user.v1.UserService.AssignCardkey]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.user.v1.AssignCardKeyRequest}
 */
public final class AssignCardKeyRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.user.v1.AssignCardKeyRequest)
    AssignCardKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AssignCardKeyRequest.class.getName());
  }
  // Use AssignCardKeyRequest.newBuilder() to construct.
  private AssignCardKeyRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AssignCardKeyRequest() {
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignCardKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignCardKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.user.v1.AssignCardKeyRequest.class, com.saltoapis.nebula.user.v1.AssignCardKeyRequest.Builder.class);
  }

  private int cardIdCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object cardId_;
  public enum CardIdCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UID(2),
    CARDID_NOT_SET(0);
    private final int value;
    private CardIdCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CardIdCase valueOf(int value) {
      return forNumber(value);
    }

    public static CardIdCase forNumber(int value) {
      switch (value) {
        case 2: return UID;
        case 0: return CARDID_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CardIdCase
  getCardIdCase() {
    return CardIdCase.forNumber(
        cardIdCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the requested user's card key to be assigned. For example:
   * `installations/surelock-homes-hq/users/john-watson/card-key`.
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
   * The name of the requested user's card key to be assigned. For example:
   * `installations/surelock-homes-hq/users/john-watson/card-key`.
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

  public static final int UID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return Whether the uid field is set.
   */
  public boolean hasUid() {
    return cardIdCase_ == 2;
  }
  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The uid.
   */
  public java.lang.String getUid() {
    java.lang.Object ref = "";
    if (cardIdCase_ == 2) {
      ref = cardId_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (cardIdCase_ == 2) {
        cardId_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The bytes for uid.
   */
  public com.google.protobuf.ByteString
      getUidBytes() {
    java.lang.Object ref = "";
    if (cardIdCase_ == 2) {
      ref = cardId_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (cardIdCase_ == 2) {
        cardId_ = b;
      }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (cardIdCase_ == 2) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, cardId_);
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
    if (cardIdCase_ == 2) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, cardId_);
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
    if (!(obj instanceof com.saltoapis.nebula.user.v1.AssignCardKeyRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.user.v1.AssignCardKeyRequest other = (com.saltoapis.nebula.user.v1.AssignCardKeyRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getCardIdCase().equals(other.getCardIdCase())) return false;
    switch (cardIdCase_) {
      case 2:
        if (!getUid()
            .equals(other.getUid())) return false;
        break;
      case 0:
      default:
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
    switch (cardIdCase_) {
      case 2:
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.user.v1.AssignCardKeyRequest prototype) {
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
   * The request message for [`AssignCardkey`][salto.nebula.user.v1.UserService.AssignCardkey]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.user.v1.AssignCardKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.user.v1.AssignCardKeyRequest)
      com.saltoapis.nebula.user.v1.AssignCardKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignCardKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignCardKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.user.v1.AssignCardKeyRequest.class, com.saltoapis.nebula.user.v1.AssignCardKeyRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.user.v1.AssignCardKeyRequest.newBuilder()
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
      cardIdCase_ = 0;
      cardId_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignCardKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.AssignCardKeyRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.user.v1.AssignCardKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.AssignCardKeyRequest build() {
      com.saltoapis.nebula.user.v1.AssignCardKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.AssignCardKeyRequest buildPartial() {
      com.saltoapis.nebula.user.v1.AssignCardKeyRequest result = new com.saltoapis.nebula.user.v1.AssignCardKeyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.user.v1.AssignCardKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
    }

    private void buildPartialOneofs(com.saltoapis.nebula.user.v1.AssignCardKeyRequest result) {
      result.cardIdCase_ = cardIdCase_;
      result.cardId_ = this.cardId_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.user.v1.AssignCardKeyRequest) {
        return mergeFrom((com.saltoapis.nebula.user.v1.AssignCardKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.user.v1.AssignCardKeyRequest other) {
      if (other == com.saltoapis.nebula.user.v1.AssignCardKeyRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getCardIdCase()) {
        case UID: {
          cardIdCase_ = 2;
          cardId_ = other.cardId_;
          onChanged();
          break;
        }
        case CARDID_NOT_SET: {
          break;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              cardIdCase_ = 2;
              cardId_ = s;
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
    private int cardIdCase_ = 0;
    private java.lang.Object cardId_;
    public CardIdCase
        getCardIdCase() {
      return CardIdCase.forNumber(
          cardIdCase_);
    }

    public Builder clearCardId() {
      cardIdCase_ = 0;
      cardId_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the requested user's card key to be assigned. For example:
     * `installations/surelock-homes-hq/users/john-watson/card-key`.
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
     * The name of the requested user's card key to be assigned. For example:
     * `installations/surelock-homes-hq/users/john-watson/card-key`.
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
     * The name of the requested user's card key to be assigned. For example:
     * `installations/surelock-homes-hq/users/john-watson/card-key`.
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
     * The name of the requested user's card key to be assigned. For example:
     * `installations/surelock-homes-hq/users/john-watson/card-key`.
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
     * The name of the requested user's card key to be assigned. For example:
     * `installations/surelock-homes-hq/users/john-watson/card-key`.
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

    /**
     * <pre>
     * Unique identifier of the physical card. Length dependent of technology.
     * Max length for ISO14443-3 is 10 bytes.
     * </pre>
     *
     * <code>string uid = 2;</code>
     * @return Whether the uid field is set.
     */
    @java.lang.Override
    public boolean hasUid() {
      return cardIdCase_ == 2;
    }
    /**
     * <pre>
     * Unique identifier of the physical card. Length dependent of technology.
     * Max length for ISO14443-3 is 10 bytes.
     * </pre>
     *
     * <code>string uid = 2;</code>
     * @return The uid.
     */
    @java.lang.Override
    public java.lang.String getUid() {
      java.lang.Object ref = "";
      if (cardIdCase_ == 2) {
        ref = cardId_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (cardIdCase_ == 2) {
          cardId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique identifier of the physical card. Length dependent of technology.
     * Max length for ISO14443-3 is 10 bytes.
     * </pre>
     *
     * <code>string uid = 2;</code>
     * @return The bytes for uid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUidBytes() {
      java.lang.Object ref = "";
      if (cardIdCase_ == 2) {
        ref = cardId_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (cardIdCase_ == 2) {
          cardId_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique identifier of the physical card. Length dependent of technology.
     * Max length for ISO14443-3 is 10 bytes.
     * </pre>
     *
     * <code>string uid = 2;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cardIdCase_ = 2;
      cardId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier of the physical card. Length dependent of technology.
     * Max length for ISO14443-3 is 10 bytes.
     * </pre>
     *
     * <code>string uid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      if (cardIdCase_ == 2) {
        cardIdCase_ = 0;
        cardId_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Unique identifier of the physical card. Length dependent of technology.
     * Max length for ISO14443-3 is 10 bytes.
     * </pre>
     *
     * <code>string uid = 2;</code>
     * @param value The bytes for uid to set.
     * @return This builder for chaining.
     */
    public Builder setUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cardIdCase_ = 2;
      cardId_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.user.v1.AssignCardKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.user.v1.AssignCardKeyRequest)
  private static final com.saltoapis.nebula.user.v1.AssignCardKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.user.v1.AssignCardKeyRequest();
  }

  public static com.saltoapis.nebula.user.v1.AssignCardKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignCardKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<AssignCardKeyRequest>() {
    @java.lang.Override
    public AssignCardKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignCardKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignCardKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.user.v1.AssignCardKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

