// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

/**
 * <pre>
 * The access right's destination association
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accessright.v1.AccessRightDestination}
 */
public final class AccessRightDestination extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accessright.v1.AccessRightDestination)
    AccessRightDestinationOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      AccessRightDestination.class.getName());
  }
  // Use AccessRightDestination.newBuilder() to construct.
  private AccessRightDestination(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccessRightDestination() {
    name_ = "";
    destination_ = "";
    displayName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_AccessRightDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_AccessRightDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accessright.v1.AccessRightDestination.class, com.saltoapis.nebula.accessright.v1.AccessRightDestination.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Resource name of the access right's destination association. It must
   * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
   * For example:
   * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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
   * Resource name of the access right's destination association. It must
   * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
   * For example:
   * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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

  public static final int DESTINATION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object destination_ = "";
  /**
   * <pre>
   * The destination resource name to bind as an association to the parent
   * access right. For example:
   * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
   * </pre>
   *
   * <code>string destination = 2;</code>
   * @return The destination.
   */
  @java.lang.Override
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The destination resource name to bind as an association to the parent
   * access right. For example:
   * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
   * </pre>
   *
   * <code>string destination = 2;</code>
   * @return The bytes for destination.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   * <pre>
   * Display name of the associated entity. In this case a destination.
   * </pre>
   *
   * <code>string display_name = 3;</code>
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
   * Display name of the associated entity. In this case a destination.
   * </pre>
   *
   * <code>string display_name = 3;</code>
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(destination_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, destination_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, displayName_);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(destination_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, destination_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, displayName_);
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
    if (!(obj instanceof com.saltoapis.nebula.accessright.v1.AccessRightDestination)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accessright.v1.AccessRightDestination other = (com.saltoapis.nebula.accessright.v1.AccessRightDestination) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDestination()
        .equals(other.getDestination())) return false;
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
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestination().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accessright.v1.AccessRightDestination prototype) {
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
   * The access right's destination association
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accessright.v1.AccessRightDestination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accessright.v1.AccessRightDestination)
      com.saltoapis.nebula.accessright.v1.AccessRightDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_AccessRightDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_AccessRightDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accessright.v1.AccessRightDestination.class, com.saltoapis.nebula.accessright.v1.AccessRightDestination.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accessright.v1.AccessRightDestination.newBuilder()
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
      destination_ = "";
      displayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_AccessRightDestination_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.AccessRightDestination getDefaultInstanceForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.AccessRightDestination build() {
      com.saltoapis.nebula.accessright.v1.AccessRightDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.AccessRightDestination buildPartial() {
      com.saltoapis.nebula.accessright.v1.AccessRightDestination result = new com.saltoapis.nebula.accessright.v1.AccessRightDestination(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.accessright.v1.AccessRightDestination result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destination_ = destination_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayName_ = displayName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accessright.v1.AccessRightDestination) {
        return mergeFrom((com.saltoapis.nebula.accessright.v1.AccessRightDestination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accessright.v1.AccessRightDestination other) {
      if (other == com.saltoapis.nebula.accessright.v1.AccessRightDestination.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000004;
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
              destination_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              displayName_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Resource name of the access right's destination association. It must
     * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
     * For example:
     * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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
     * Resource name of the access right's destination association. It must
     * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
     * For example:
     * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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
     * Resource name of the access right's destination association. It must
     * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
     * For example:
     * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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
     * Resource name of the access right's destination association. It must
     * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
     * For example:
     * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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
     * Resource name of the access right's destination association. It must
     * have the format of `installations/&#42;&#47;access-rights/&#42;&#47;destinations/&#42;`.
     * For example:
     * `installations/surelock-homes-hq/access-rights/baskerville/destinations/elevator-floor-5`.
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

    private java.lang.Object destination_ = "";
    /**
     * <pre>
     * The destination resource name to bind as an association to the parent
     * access right. For example:
     * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
     * </pre>
     *
     * <code>string destination = 2;</code>
     * @return The destination.
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The destination resource name to bind as an association to the parent
     * access right. For example:
     * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
     * </pre>
     *
     * <code>string destination = 2;</code>
     * @return The bytes for destination.
     */
    public com.google.protobuf.ByteString
        getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The destination resource name to bind as an association to the parent
     * access right. For example:
     * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
     * </pre>
     *
     * <code>string destination = 2;</code>
     * @param value The destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestination(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      destination_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The destination resource name to bind as an association to the parent
     * access right. For example:
     * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
     * </pre>
     *
     * <code>string destination = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestination() {
      destination_ = getDefaultInstance().getDestination();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The destination resource name to bind as an association to the parent
     * access right. For example:
     * `installations/surelock-homes-hq/destinations/elevator-floor-5`.
     * </pre>
     *
     * <code>string destination = 2;</code>
     * @param value The bytes for destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      destination_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * Display name of the associated entity. In this case a destination.
     * </pre>
     *
     * <code>string display_name = 3;</code>
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
     * Display name of the associated entity. In this case a destination.
     * </pre>
     *
     * <code>string display_name = 3;</code>
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
     * Display name of the associated entity. In this case a destination.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      displayName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display name of the associated entity. In this case a destination.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display name of the associated entity. In this case a destination.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accessright.v1.AccessRightDestination)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accessright.v1.AccessRightDestination)
  private static final com.saltoapis.nebula.accessright.v1.AccessRightDestination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accessright.v1.AccessRightDestination();
  }

  public static com.saltoapis.nebula.accessright.v1.AccessRightDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessRightDestination>
      PARSER = new com.google.protobuf.AbstractParser<AccessRightDestination>() {
    @java.lang.Override
    public AccessRightDestination parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessRightDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessRightDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

