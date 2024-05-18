// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accessright/v1/access_right.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accessright.v1;

/**
 * <pre>
 * The request message for [`CreateAccessRightAccessPoint`][salto.nebula.accessright.v1.AccessRightService.CreateAccessRightAccessPoint]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest}
 */
public final class CreateAccessRightAccessPointRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest)
    CreateAccessRightAccessPointRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      CreateAccessRightAccessPointRequest.class.getName());
  }
  // Use CreateAccessRightAccessPointRequest.newBuilder() to construct.
  private CreateAccessRightAccessPointRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateAccessRightAccessPointRequest() {
    parent_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_CreateAccessRightAccessPointRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_CreateAccessRightAccessPointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.class, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where the access right's access
   * point association is to be created. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of the parent resource where the access right's access
   * point association is to be created. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_RIGHT_ACCESS_POINT_FIELD_NUMBER = 2;
  private com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint accessRightAccessPoint_;
  /**
   * <pre>
   * The access right's access point association resource to be created.
   * Client must not set the `AccessRightAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
   * @return Whether the accessRightAccessPoint field is set.
   */
  @java.lang.Override
  public boolean hasAccessRightAccessPoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The access right's access point association resource to be created.
   * Client must not set the `AccessRightAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
   * @return The accessRightAccessPoint.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint getAccessRightAccessPoint() {
    return accessRightAccessPoint_ == null ? com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance() : accessRightAccessPoint_;
  }
  /**
   * <pre>
   * The access right's access point association resource to be created.
   * Client must not set the `AccessRightAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder getAccessRightAccessPointOrBuilder() {
    return accessRightAccessPoint_ == null ? com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance() : accessRightAccessPoint_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAccessRightAccessPoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAccessRightAccessPoint());
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
    if (!(obj instanceof com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest other = (com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasAccessRightAccessPoint() != other.hasAccessRightAccessPoint()) return false;
    if (hasAccessRightAccessPoint()) {
      if (!getAccessRightAccessPoint()
          .equals(other.getAccessRightAccessPoint())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasAccessRightAccessPoint()) {
      hash = (37 * hash) + ACCESS_RIGHT_ACCESS_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getAccessRightAccessPoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest prototype) {
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
   * The request message for [`CreateAccessRightAccessPoint`][salto.nebula.accessright.v1.AccessRightService.CreateAccessRightAccessPoint]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest)
      com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_CreateAccessRightAccessPointRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_CreateAccessRightAccessPointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.class, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.newBuilder()
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
        getAccessRightAccessPointFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      accessRightAccessPoint_ = null;
      if (accessRightAccessPointBuilder_ != null) {
        accessRightAccessPointBuilder_.dispose();
        accessRightAccessPointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_CreateAccessRightAccessPointRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest build() {
      com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest buildPartial() {
      com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest result = new com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accessRightAccessPoint_ = accessRightAccessPointBuilder_ == null
            ? accessRightAccessPoint_
            : accessRightAccessPointBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest) {
        return mergeFrom((com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest other) {
      if (other == com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAccessRightAccessPoint()) {
        mergeAccessRightAccessPoint(other.getAccessRightAccessPoint());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAccessRightAccessPointFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Resource name of the parent resource where the access right's access
     * point association is to be created. For example:
     * `installations/surelock-homes-hq/access-rights/baskerville`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the parent resource where the access right's access
     * point association is to be created. For example:
     * `installations/surelock-homes-hq/access-rights/baskerville`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the parent resource where the access right's access
     * point association is to be created. For example:
     * `installations/surelock-homes-hq/access-rights/baskerville`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the parent resource where the access right's access
     * point association is to be created. For example:
     * `installations/surelock-homes-hq/access-rights/baskerville`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the parent resource where the access right's access
     * point association is to be created. For example:
     * `installations/surelock-homes-hq/access-rights/baskerville`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint accessRightAccessPoint_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder> accessRightAccessPointBuilder_;
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     * @return Whether the accessRightAccessPoint field is set.
     */
    public boolean hasAccessRightAccessPoint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     * @return The accessRightAccessPoint.
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint getAccessRightAccessPoint() {
      if (accessRightAccessPointBuilder_ == null) {
        return accessRightAccessPoint_ == null ? com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance() : accessRightAccessPoint_;
      } else {
        return accessRightAccessPointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    public Builder setAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint value) {
      if (accessRightAccessPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessRightAccessPoint_ = value;
      } else {
        accessRightAccessPointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    public Builder setAccessRightAccessPoint(
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder builderForValue) {
      if (accessRightAccessPointBuilder_ == null) {
        accessRightAccessPoint_ = builderForValue.build();
      } else {
        accessRightAccessPointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    public Builder mergeAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint value) {
      if (accessRightAccessPointBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          accessRightAccessPoint_ != null &&
          accessRightAccessPoint_ != com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance()) {
          getAccessRightAccessPointBuilder().mergeFrom(value);
        } else {
          accessRightAccessPoint_ = value;
        }
      } else {
        accessRightAccessPointBuilder_.mergeFrom(value);
      }
      if (accessRightAccessPoint_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    public Builder clearAccessRightAccessPoint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      accessRightAccessPoint_ = null;
      if (accessRightAccessPointBuilder_ != null) {
        accessRightAccessPointBuilder_.dispose();
        accessRightAccessPointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder getAccessRightAccessPointBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAccessRightAccessPointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder getAccessRightAccessPointOrBuilder() {
      if (accessRightAccessPointBuilder_ != null) {
        return accessRightAccessPointBuilder_.getMessageOrBuilder();
      } else {
        return accessRightAccessPoint_ == null ?
            com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance() : accessRightAccessPoint_;
      }
    }
    /**
     * <pre>
     * The access right's access point association resource to be created.
     * Client must not set the `AccessRightAccessPoint.name` field.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder> 
        getAccessRightAccessPointFieldBuilder() {
      if (accessRightAccessPointBuilder_ == null) {
        accessRightAccessPointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.Builder, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder>(
                getAccessRightAccessPoint(),
                getParentForChildren(),
                isClean());
        accessRightAccessPoint_ = null;
      }
      return accessRightAccessPointBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest)
  private static final com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest();
  }

  public static com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccessRightAccessPointRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAccessRightAccessPointRequest>() {
    @java.lang.Override
    public CreateAccessRightAccessPointRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAccessRightAccessPointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccessRightAccessPointRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

