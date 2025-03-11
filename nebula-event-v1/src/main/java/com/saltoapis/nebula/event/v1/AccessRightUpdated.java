// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/types.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the update of an access right.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.AccessRightUpdated}
 */
public final class AccessRightUpdated extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.AccessRightUpdated)
    AccessRightUpdatedOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      AccessRightUpdated.class.getName());
  }
  // Use AccessRightUpdated.newBuilder() to construct.
  private AccessRightUpdated(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccessRightUpdated() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessRightUpdated_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessRightUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.event.v1.AccessRightUpdated.class, com.saltoapis.nebula.event.v1.AccessRightUpdated.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_RIGHT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accessright.v1.AccessRight accessRight_;
  /**
   * <pre>
   * Access right updated.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   * @return Whether the accessRight field is set.
   */
  @java.lang.Override
  public boolean hasAccessRight() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Access right updated.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   * @return The accessRight.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight() {
    return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
  }
  /**
   * <pre>
   * Access right updated.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder getAccessRightOrBuilder() {
    return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
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
      output.writeMessage(1, getAccessRight());
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
        .computeMessageSize(1, getAccessRight());
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
    if (!(obj instanceof com.saltoapis.nebula.event.v1.AccessRightUpdated)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.event.v1.AccessRightUpdated other = (com.saltoapis.nebula.event.v1.AccessRightUpdated) obj;

    if (hasAccessRight() != other.hasAccessRight()) return false;
    if (hasAccessRight()) {
      if (!getAccessRight()
          .equals(other.getAccessRight())) return false;
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
    if (hasAccessRight()) {
      hash = (37 * hash) + ACCESS_RIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getAccessRight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessRightUpdated parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.AccessRightUpdated prototype) {
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
   * Event representing the update of an access right.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.AccessRightUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.AccessRightUpdated)
      com.saltoapis.nebula.event.v1.AccessRightUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessRightUpdated_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessRightUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.event.v1.AccessRightUpdated.class, com.saltoapis.nebula.event.v1.AccessRightUpdated.Builder.class);
    }

    // Construct using com.saltoapis.nebula.event.v1.AccessRightUpdated.newBuilder()
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
        getAccessRightFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessRight_ = null;
      if (accessRightBuilder_ != null) {
        accessRightBuilder_.dispose();
        accessRightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessRightUpdated_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessRightUpdated getDefaultInstanceForType() {
      return com.saltoapis.nebula.event.v1.AccessRightUpdated.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessRightUpdated build() {
      com.saltoapis.nebula.event.v1.AccessRightUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessRightUpdated buildPartial() {
      com.saltoapis.nebula.event.v1.AccessRightUpdated result = new com.saltoapis.nebula.event.v1.AccessRightUpdated(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.event.v1.AccessRightUpdated result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessRight_ = accessRightBuilder_ == null
            ? accessRight_
            : accessRightBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.event.v1.AccessRightUpdated) {
        return mergeFrom((com.saltoapis.nebula.event.v1.AccessRightUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.event.v1.AccessRightUpdated other) {
      if (other == com.saltoapis.nebula.event.v1.AccessRightUpdated.getDefaultInstance()) return this;
      if (other.hasAccessRight()) {
        mergeAccessRight(other.getAccessRight());
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
                  getAccessRightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.saltoapis.nebula.accessright.v1.AccessRight accessRight_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRight, com.saltoapis.nebula.accessright.v1.AccessRight.Builder, com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder> accessRightBuilder_;
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     * @return Whether the accessRight field is set.
     */
    public boolean hasAccessRight() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     * @return The accessRight.
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight() {
      if (accessRightBuilder_ == null) {
        return accessRight_ == null ? com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
      } else {
        return accessRightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder setAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
      if (accessRightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessRight_ = value;
      } else {
        accessRightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder setAccessRight(
        com.saltoapis.nebula.accessright.v1.AccessRight.Builder builderForValue) {
      if (accessRightBuilder_ == null) {
        accessRight_ = builderForValue.build();
      } else {
        accessRightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder mergeAccessRight(com.saltoapis.nebula.accessright.v1.AccessRight value) {
      if (accessRightBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          accessRight_ != null &&
          accessRight_ != com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance()) {
          getAccessRightBuilder().mergeFrom(value);
        } else {
          accessRight_ = value;
        }
      } else {
        accessRightBuilder_.mergeFrom(value);
      }
      if (accessRight_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public Builder clearAccessRight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessRight_ = null;
      if (accessRightBuilder_ != null) {
        accessRightBuilder_.dispose();
        accessRightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight.Builder getAccessRightBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessRightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder getAccessRightOrBuilder() {
      if (accessRightBuilder_ != null) {
        return accessRightBuilder_.getMessageOrBuilder();
      } else {
        return accessRight_ == null ?
            com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance() : accessRight_;
      }
    }
    /**
     * <pre>
     * Access right updated.
     * </pre>
     *
     * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accessright.v1.AccessRight, com.saltoapis.nebula.accessright.v1.AccessRight.Builder, com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder> 
        getAccessRightFieldBuilder() {
      if (accessRightBuilder_ == null) {
        accessRightBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.accessright.v1.AccessRight, com.saltoapis.nebula.accessright.v1.AccessRight.Builder, com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder>(
                getAccessRight(),
                getParentForChildren(),
                isClean());
        accessRight_ = null;
      }
      return accessRightBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.AccessRightUpdated)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.AccessRightUpdated)
  private static final com.saltoapis.nebula.event.v1.AccessRightUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.event.v1.AccessRightUpdated();
  }

  public static com.saltoapis.nebula.event.v1.AccessRightUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessRightUpdated>
      PARSER = new com.google.protobuf.AbstractParser<AccessRightUpdated>() {
    @java.lang.Override
    public AccessRightUpdated parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessRightUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessRightUpdated> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.event.v1.AccessRightUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

