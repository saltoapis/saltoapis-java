// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/intercom/v1/intercom.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.intercom.v1;

/**
 * <pre>
 * The brand object
 * </pre>
 *
 * Protobuf type {@code salto.intercom.v1.Brand}
 */
public final class Brand extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.intercom.v1.Brand)
    BrandOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Brand.class.getName());
  }
  // Use Brand.newBuilder() to construct.
  private Brand(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Brand() {
    name_ = "";
    displayName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_Brand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_Brand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.intercom.v1.Brand.class, com.saltoapis.intercom.v1.Brand.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Resource name of the brand. It must have the format `brands/&#42;`. For
   * example: `brands/bticino`.
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
   * Resource name of the brand. It must have the format `brands/&#42;`. For
   * example: `brands/bticino`.
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

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   * <pre>
   * Brand display name. For example: Bticino.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Brand display name. For example: Bticino.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, displayName_);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, displayName_);
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
    if (!(obj instanceof com.saltoapis.intercom.v1.Brand)) {
      return super.equals(obj);
    }
    com.saltoapis.intercom.v1.Brand other = (com.saltoapis.intercom.v1.Brand) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.intercom.v1.Brand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.intercom.v1.Brand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.intercom.v1.Brand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.intercom.v1.Brand parseFrom(
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
  public static Builder newBuilder(com.saltoapis.intercom.v1.Brand prototype) {
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
   * The brand object
   * </pre>
   *
   * Protobuf type {@code salto.intercom.v1.Brand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.intercom.v1.Brand)
      com.saltoapis.intercom.v1.BrandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_Brand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_Brand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.intercom.v1.Brand.class, com.saltoapis.intercom.v1.Brand.Builder.class);
    }

    // Construct using com.saltoapis.intercom.v1.Brand.newBuilder()
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
      displayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_Brand_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.intercom.v1.Brand getDefaultInstanceForType() {
      return com.saltoapis.intercom.v1.Brand.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.intercom.v1.Brand build() {
      com.saltoapis.intercom.v1.Brand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.intercom.v1.Brand buildPartial() {
      com.saltoapis.intercom.v1.Brand result = new com.saltoapis.intercom.v1.Brand(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.intercom.v1.Brand result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayName_ = displayName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.intercom.v1.Brand) {
        return mergeFrom((com.saltoapis.intercom.v1.Brand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.intercom.v1.Brand other) {
      if (other == com.saltoapis.intercom.v1.Brand.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              displayName_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Resource name of the brand. It must have the format `brands/&#42;`. For
     * example: `brands/bticino`.
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
     * Resource name of the brand. It must have the format `brands/&#42;`. For
     * example: `brands/bticino`.
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
     * Resource name of the brand. It must have the format `brands/&#42;`. For
     * example: `brands/bticino`.
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
     * Resource name of the brand. It must have the format `brands/&#42;`. For
     * example: `brands/bticino`.
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
     * Resource name of the brand. It must have the format `brands/&#42;`. For
     * example: `brands/bticino`.
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

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * Brand display name. For example: Bticino.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Brand display name. For example: Bticino.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Brand display name. For example: Bticino.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Brand display name. For example: Bticino.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Brand display name. For example: Bticino.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.intercom.v1.Brand)
  }

  // @@protoc_insertion_point(class_scope:salto.intercom.v1.Brand)
  private static final com.saltoapis.intercom.v1.Brand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.intercom.v1.Brand();
  }

  public static com.saltoapis.intercom.v1.Brand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Brand>
      PARSER = new com.google.protobuf.AbstractParser<Brand>() {
    @java.lang.Override
    public Brand parsePartialFrom(
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

  public static com.google.protobuf.Parser<Brand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Brand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.intercom.v1.Brand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

