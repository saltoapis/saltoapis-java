// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.user.v1;

/**
 * <pre>
 * The response message for [`AssignPasscode`][salto.nebula.user.v1.UserService.AssignPasscode]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.user.v1.AssignPasscodeResponse}
 */
public final class AssignPasscodeResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.user.v1.AssignPasscodeResponse)
    AssignPasscodeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AssignPasscodeResponse.class.getName());
  }
  // Use AssignPasscodeResponse.newBuilder() to construct.
  private AssignPasscodeResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AssignPasscodeResponse() {
    value_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignPasscodeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignPasscodeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.user.v1.AssignPasscodeResponse.class, com.saltoapis.nebula.user.v1.AssignPasscodeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PASSCODE_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.user.v1.Passcode passcode_;
  /**
   * <pre>
   * The assigned passcode.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
   * @return Whether the passcode field is set.
   */
  @java.lang.Override
  public boolean hasPasscode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The assigned passcode.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
   * @return The passcode.
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.Passcode getPasscode() {
    return passcode_ == null ? com.saltoapis.nebula.user.v1.Passcode.getDefaultInstance() : passcode_;
  }
  /**
   * <pre>
   * The assigned passcode.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.PasscodeOrBuilder getPasscodeOrBuilder() {
    return passcode_ == null ? com.saltoapis.nebula.user.v1.Passcode.getDefaultInstance() : passcode_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <pre>
   * The passcode value.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The passcode value.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPasscode());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, value_);
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
        .computeMessageSize(1, getPasscode());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, value_);
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
    if (!(obj instanceof com.saltoapis.nebula.user.v1.AssignPasscodeResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.user.v1.AssignPasscodeResponse other = (com.saltoapis.nebula.user.v1.AssignPasscodeResponse) obj;

    if (hasPasscode() != other.hasPasscode()) return false;
    if (hasPasscode()) {
      if (!getPasscode()
          .equals(other.getPasscode())) return false;
    }
    if (!getValue()
        .equals(other.getValue())) return false;
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
    if (hasPasscode()) {
      hash = (37 * hash) + PASSCODE_FIELD_NUMBER;
      hash = (53 * hash) + getPasscode().hashCode();
    }
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.user.v1.AssignPasscodeResponse prototype) {
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
   * The response message for [`AssignPasscode`][salto.nebula.user.v1.UserService.AssignPasscode]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.user.v1.AssignPasscodeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.user.v1.AssignPasscodeResponse)
      com.saltoapis.nebula.user.v1.AssignPasscodeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignPasscodeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignPasscodeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.user.v1.AssignPasscodeResponse.class, com.saltoapis.nebula.user.v1.AssignPasscodeResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.user.v1.AssignPasscodeResponse.newBuilder()
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
        getPasscodeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      passcode_ = null;
      if (passcodeBuilder_ != null) {
        passcodeBuilder_.dispose();
        passcodeBuilder_ = null;
      }
      value_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.user.v1.UserProto.internal_static_salto_nebula_user_v1_AssignPasscodeResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.AssignPasscodeResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.user.v1.AssignPasscodeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.AssignPasscodeResponse build() {
      com.saltoapis.nebula.user.v1.AssignPasscodeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.user.v1.AssignPasscodeResponse buildPartial() {
      com.saltoapis.nebula.user.v1.AssignPasscodeResponse result = new com.saltoapis.nebula.user.v1.AssignPasscodeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.user.v1.AssignPasscodeResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.passcode_ = passcodeBuilder_ == null
            ? passcode_
            : passcodeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.user.v1.AssignPasscodeResponse) {
        return mergeFrom((com.saltoapis.nebula.user.v1.AssignPasscodeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.user.v1.AssignPasscodeResponse other) {
      if (other == com.saltoapis.nebula.user.v1.AssignPasscodeResponse.getDefaultInstance()) return this;
      if (other.hasPasscode()) {
        mergePasscode(other.getPasscode());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
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
              input.readMessage(
                  getPasscodeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              value_ = input.readStringRequireUtf8();
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

    private com.saltoapis.nebula.user.v1.Passcode passcode_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.Passcode, com.saltoapis.nebula.user.v1.Passcode.Builder, com.saltoapis.nebula.user.v1.PasscodeOrBuilder> passcodeBuilder_;
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     * @return Whether the passcode field is set.
     */
    public boolean hasPasscode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     * @return The passcode.
     */
    public com.saltoapis.nebula.user.v1.Passcode getPasscode() {
      if (passcodeBuilder_ == null) {
        return passcode_ == null ? com.saltoapis.nebula.user.v1.Passcode.getDefaultInstance() : passcode_;
      } else {
        return passcodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    public Builder setPasscode(com.saltoapis.nebula.user.v1.Passcode value) {
      if (passcodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        passcode_ = value;
      } else {
        passcodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    public Builder setPasscode(
        com.saltoapis.nebula.user.v1.Passcode.Builder builderForValue) {
      if (passcodeBuilder_ == null) {
        passcode_ = builderForValue.build();
      } else {
        passcodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    public Builder mergePasscode(com.saltoapis.nebula.user.v1.Passcode value) {
      if (passcodeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          passcode_ != null &&
          passcode_ != com.saltoapis.nebula.user.v1.Passcode.getDefaultInstance()) {
          getPasscodeBuilder().mergeFrom(value);
        } else {
          passcode_ = value;
        }
      } else {
        passcodeBuilder_.mergeFrom(value);
      }
      if (passcode_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    public Builder clearPasscode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      passcode_ = null;
      if (passcodeBuilder_ != null) {
        passcodeBuilder_.dispose();
        passcodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.Passcode.Builder getPasscodeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPasscodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    public com.saltoapis.nebula.user.v1.PasscodeOrBuilder getPasscodeOrBuilder() {
      if (passcodeBuilder_ != null) {
        return passcodeBuilder_.getMessageOrBuilder();
      } else {
        return passcode_ == null ?
            com.saltoapis.nebula.user.v1.Passcode.getDefaultInstance() : passcode_;
      }
    }
    /**
     * <pre>
     * The assigned passcode.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.Passcode passcode = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.Passcode, com.saltoapis.nebula.user.v1.Passcode.Builder, com.saltoapis.nebula.user.v1.PasscodeOrBuilder> 
        getPasscodeFieldBuilder() {
      if (passcodeBuilder_ == null) {
        passcodeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.user.v1.Passcode, com.saltoapis.nebula.user.v1.Passcode.Builder, com.saltoapis.nebula.user.v1.PasscodeOrBuilder>(
                getPasscode(),
                getParentForChildren(),
                isClean());
        passcode_ = null;
      }
      return passcodeBuilder_;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * The passcode value.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The passcode value.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The passcode value.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The passcode value.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The passcode value.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.user.v1.AssignPasscodeResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.user.v1.AssignPasscodeResponse)
  private static final com.saltoapis.nebula.user.v1.AssignPasscodeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.user.v1.AssignPasscodeResponse();
  }

  public static com.saltoapis.nebula.user.v1.AssignPasscodeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignPasscodeResponse>
      PARSER = new com.google.protobuf.AbstractParser<AssignPasscodeResponse>() {
    @java.lang.Override
    public AssignPasscodeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignPasscodeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignPasscodeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.user.v1.AssignPasscodeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

