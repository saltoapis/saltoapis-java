// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the creation of an access point.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.AccessPointCreated}
 */
public final class AccessPointCreated extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.AccessPointCreated)
    AccessPointCreatedOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      AccessPointCreated.class.getName());
  }
  // Use AccessPointCreated.newBuilder() to construct.
  private AccessPointCreated(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccessPointCreated() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointCreated_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointCreated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.event.v1.AccessPointCreated.class, com.saltoapis.nebula.event.v1.AccessPointCreated.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_POINT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accesspoint.v1.AccessPoint accessPoint_;
  /**
   * <pre>
   * Access point created.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return Whether the accessPoint field is set.
   */
  @java.lang.Override
  public boolean hasAccessPoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Access point created.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return The accessPoint.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint() {
    return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
  }
  /**
   * <pre>
   * Access point created.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder() {
    return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
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
      output.writeMessage(1, getAccessPoint());
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
        .computeMessageSize(1, getAccessPoint());
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
    if (!(obj instanceof com.saltoapis.nebula.event.v1.AccessPointCreated)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.event.v1.AccessPointCreated other = (com.saltoapis.nebula.event.v1.AccessPointCreated) obj;

    if (hasAccessPoint() != other.hasAccessPoint()) return false;
    if (hasAccessPoint()) {
      if (!getAccessPoint()
          .equals(other.getAccessPoint())) return false;
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
    if (hasAccessPoint()) {
      hash = (37 * hash) + ACCESS_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointCreated parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.AccessPointCreated prototype) {
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
   * Event representing the creation of an access point.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.AccessPointCreated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.AccessPointCreated)
      com.saltoapis.nebula.event.v1.AccessPointCreatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointCreated_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointCreated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.event.v1.AccessPointCreated.class, com.saltoapis.nebula.event.v1.AccessPointCreated.Builder.class);
    }

    // Construct using com.saltoapis.nebula.event.v1.AccessPointCreated.newBuilder()
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
        getAccessPointFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessPoint_ = null;
      if (accessPointBuilder_ != null) {
        accessPointBuilder_.dispose();
        accessPointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointCreated_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessPointCreated getDefaultInstanceForType() {
      return com.saltoapis.nebula.event.v1.AccessPointCreated.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessPointCreated build() {
      com.saltoapis.nebula.event.v1.AccessPointCreated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessPointCreated buildPartial() {
      com.saltoapis.nebula.event.v1.AccessPointCreated result = new com.saltoapis.nebula.event.v1.AccessPointCreated(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.event.v1.AccessPointCreated result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessPoint_ = accessPointBuilder_ == null
            ? accessPoint_
            : accessPointBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.event.v1.AccessPointCreated) {
        return mergeFrom((com.saltoapis.nebula.event.v1.AccessPointCreated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.event.v1.AccessPointCreated other) {
      if (other == com.saltoapis.nebula.event.v1.AccessPointCreated.getDefaultInstance()) return this;
      if (other.hasAccessPoint()) {
        mergeAccessPoint(other.getAccessPoint());
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
                  getAccessPointFieldBuilder().getBuilder(),
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

    private com.saltoapis.nebula.accesspoint.v1.AccessPoint accessPoint_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspoint.v1.AccessPoint, com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder, com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder> accessPointBuilder_;
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     * @return Whether the accessPoint field is set.
     */
    public boolean hasAccessPoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     * @return The accessPoint.
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint() {
      if (accessPointBuilder_ == null) {
        return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
      } else {
        return accessPointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder setAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
      if (accessPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessPoint_ = value;
      } else {
        accessPointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder setAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder builderForValue) {
      if (accessPointBuilder_ == null) {
        accessPoint_ = builderForValue.build();
      } else {
        accessPointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder mergeAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
      if (accessPointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          accessPoint_ != null &&
          accessPoint_ != com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance()) {
          getAccessPointBuilder().mergeFrom(value);
        } else {
          accessPoint_ = value;
        }
      } else {
        accessPointBuilder_.mergeFrom(value);
      }
      if (accessPoint_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder clearAccessPoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessPoint_ = null;
      if (accessPointBuilder_ != null) {
        accessPointBuilder_.dispose();
        accessPointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder getAccessPointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessPointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder() {
      if (accessPointBuilder_ != null) {
        return accessPointBuilder_.getMessageOrBuilder();
      } else {
        return accessPoint_ == null ?
            com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
      }
    }
    /**
     * <pre>
     * Access point created.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspoint.v1.AccessPoint, com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder, com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder> 
        getAccessPointFieldBuilder() {
      if (accessPointBuilder_ == null) {
        accessPointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.accesspoint.v1.AccessPoint, com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder, com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder>(
                getAccessPoint(),
                getParentForChildren(),
                isClean());
        accessPoint_ = null;
      }
      return accessPointBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.AccessPointCreated)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.AccessPointCreated)
  private static final com.saltoapis.nebula.event.v1.AccessPointCreated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.event.v1.AccessPointCreated();
  }

  public static com.saltoapis.nebula.event.v1.AccessPointCreated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessPointCreated>
      PARSER = new com.google.protobuf.AbstractParser<AccessPointCreated>() {
    @java.lang.Override
    public AccessPointCreated parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessPointCreated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessPointCreated> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.event.v1.AccessPointCreated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

