// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/gateway/v1/gateway.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.gateway.v1;

/**
 * <pre>
 * IPv4 (Internet Protocol version 4) settings
 * </pre>
 *
 * Protobuf type {@code salto.nebula.gateway.v1.IPv4Settings}
 */
public final class IPv4Settings extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.gateway.v1.IPv4Settings)
    IPv4SettingsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      IPv4Settings.class.getName());
  }
  // Use IPv4Settings.newBuilder() to construct.
  private IPv4Settings(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IPv4Settings() {
    ipAddress_ = "";
    mask_ = "";
    routerAddress_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_IPv4Settings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_IPv4Settings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.gateway.v1.IPv4Settings.class, com.saltoapis.nebula.gateway.v1.IPv4Settings.Builder.class);
  }

  private int bitField0_;
  public static final int IP_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ipAddress_ = "";
  /**
   * <pre>
   * IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string ip_address = 1;</code>
   * @return Whether the ipAddress field is set.
   */
  @java.lang.Override
  public boolean hasIpAddress() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string ip_address = 1;</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string ip_address = 1;</code>
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MASK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mask_ = "";
  /**
   * <pre>
   * Subnet mask is expressed in dot-decimal notation like an address.
   * For example: 255.255.255.0 is the subnet mask for the prefix
   * 198.51.100.0/24.
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string mask = 2;</code>
   * @return Whether the mask field is set.
   */
  @java.lang.Override
  public boolean hasMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Subnet mask is expressed in dot-decimal notation like an address.
   * For example: 255.255.255.0 is the subnet mask for the prefix
   * 198.51.100.0/24.
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string mask = 2;</code>
   * @return The mask.
   */
  @java.lang.Override
  public java.lang.String getMask() {
    java.lang.Object ref = mask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mask_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Subnet mask is expressed in dot-decimal notation like an address.
   * For example: 255.255.255.0 is the subnet mask for the prefix
   * 198.51.100.0/24.
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string mask = 2;</code>
   * @return The bytes for mask.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMaskBytes() {
    java.lang.Object ref = mask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mask_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUTER_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object routerAddress_ = "";
  /**
   * <pre>
   * Default network router's IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string router_address = 3;</code>
   * @return Whether the routerAddress field is set.
   */
  @java.lang.Override
  public boolean hasRouterAddress() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Default network router's IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string router_address = 3;</code>
   * @return The routerAddress.
   */
  @java.lang.Override
  public java.lang.String getRouterAddress() {
    java.lang.Object ref = routerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      routerAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Default network router's IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string router_address = 3;</code>
   * @return The bytes for routerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRouterAddressBytes() {
    java.lang.Object ref = routerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      routerAddress_ = b;
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
      com.google.protobuf.GeneratedMessage.writeString(output, 1, ipAddress_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, mask_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, routerAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, ipAddress_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, mask_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, routerAddress_);
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
    if (!(obj instanceof com.saltoapis.nebula.gateway.v1.IPv4Settings)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.gateway.v1.IPv4Settings other = (com.saltoapis.nebula.gateway.v1.IPv4Settings) obj;

    if (hasIpAddress() != other.hasIpAddress()) return false;
    if (hasIpAddress()) {
      if (!getIpAddress()
          .equals(other.getIpAddress())) return false;
    }
    if (hasMask() != other.hasMask()) return false;
    if (hasMask()) {
      if (!getMask()
          .equals(other.getMask())) return false;
    }
    if (hasRouterAddress() != other.hasRouterAddress()) return false;
    if (hasRouterAddress()) {
      if (!getRouterAddress()
          .equals(other.getRouterAddress())) return false;
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
    if (hasIpAddress()) {
      hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getIpAddress().hashCode();
    }
    if (hasMask()) {
      hash = (37 * hash) + MASK_FIELD_NUMBER;
      hash = (53 * hash) + getMask().hashCode();
    }
    if (hasRouterAddress()) {
      hash = (37 * hash) + ROUTER_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getRouterAddress().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.IPv4Settings parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.gateway.v1.IPv4Settings prototype) {
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
   * IPv4 (Internet Protocol version 4) settings
   * </pre>
   *
   * Protobuf type {@code salto.nebula.gateway.v1.IPv4Settings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.gateway.v1.IPv4Settings)
      com.saltoapis.nebula.gateway.v1.IPv4SettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_IPv4Settings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_IPv4Settings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.gateway.v1.IPv4Settings.class, com.saltoapis.nebula.gateway.v1.IPv4Settings.Builder.class);
    }

    // Construct using com.saltoapis.nebula.gateway.v1.IPv4Settings.newBuilder()
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
      ipAddress_ = "";
      mask_ = "";
      routerAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_IPv4Settings_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.IPv4Settings getDefaultInstanceForType() {
      return com.saltoapis.nebula.gateway.v1.IPv4Settings.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.IPv4Settings build() {
      com.saltoapis.nebula.gateway.v1.IPv4Settings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.IPv4Settings buildPartial() {
      com.saltoapis.nebula.gateway.v1.IPv4Settings result = new com.saltoapis.nebula.gateway.v1.IPv4Settings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.gateway.v1.IPv4Settings result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ipAddress_ = ipAddress_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mask_ = mask_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.routerAddress_ = routerAddress_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.gateway.v1.IPv4Settings) {
        return mergeFrom((com.saltoapis.nebula.gateway.v1.IPv4Settings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.gateway.v1.IPv4Settings other) {
      if (other == com.saltoapis.nebula.gateway.v1.IPv4Settings.getDefaultInstance()) return this;
      if (other.hasIpAddress()) {
        ipAddress_ = other.ipAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMask()) {
        mask_ = other.mask_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRouterAddress()) {
        routerAddress_ = other.routerAddress_;
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
              ipAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              mask_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              routerAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object ipAddress_ = "";
    /**
     * <pre>
     * IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string ip_address = 1;</code>
     * @return Whether the ipAddress field is set.
     */
    public boolean hasIpAddress() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string ip_address = 1;</code>
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string ip_address = 1;</code>
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string ip_address = 1;</code>
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ipAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string ip_address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      ipAddress_ = getDefaultInstance().getIpAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string ip_address = 1;</code>
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ipAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object mask_ = "";
    /**
     * <pre>
     * Subnet mask is expressed in dot-decimal notation like an address.
     * For example: 255.255.255.0 is the subnet mask for the prefix
     * 198.51.100.0/24.
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string mask = 2;</code>
     * @return Whether the mask field is set.
     */
    public boolean hasMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Subnet mask is expressed in dot-decimal notation like an address.
     * For example: 255.255.255.0 is the subnet mask for the prefix
     * 198.51.100.0/24.
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string mask = 2;</code>
     * @return The mask.
     */
    public java.lang.String getMask() {
      java.lang.Object ref = mask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Subnet mask is expressed in dot-decimal notation like an address.
     * For example: 255.255.255.0 is the subnet mask for the prefix
     * 198.51.100.0/24.
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string mask = 2;</code>
     * @return The bytes for mask.
     */
    public com.google.protobuf.ByteString
        getMaskBytes() {
      java.lang.Object ref = mask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Subnet mask is expressed in dot-decimal notation like an address.
     * For example: 255.255.255.0 is the subnet mask for the prefix
     * 198.51.100.0/24.
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string mask = 2;</code>
     * @param value The mask to set.
     * @return This builder for chaining.
     */
    public Builder setMask(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mask_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subnet mask is expressed in dot-decimal notation like an address.
     * For example: 255.255.255.0 is the subnet mask for the prefix
     * 198.51.100.0/24.
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string mask = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMask() {
      mask_ = getDefaultInstance().getMask();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subnet mask is expressed in dot-decimal notation like an address.
     * For example: 255.255.255.0 is the subnet mask for the prefix
     * 198.51.100.0/24.
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string mask = 2;</code>
     * @param value The bytes for mask to set.
     * @return This builder for chaining.
     */
    public Builder setMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mask_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object routerAddress_ = "";
    /**
     * <pre>
     * Default network router's IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string router_address = 3;</code>
     * @return Whether the routerAddress field is set.
     */
    public boolean hasRouterAddress() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Default network router's IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string router_address = 3;</code>
     * @return The routerAddress.
     */
    public java.lang.String getRouterAddress() {
      java.lang.Object ref = routerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        routerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Default network router's IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string router_address = 3;</code>
     * @return The bytes for routerAddress.
     */
    public com.google.protobuf.ByteString
        getRouterAddressBytes() {
      java.lang.Object ref = routerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        routerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Default network router's IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string router_address = 3;</code>
     * @param value The routerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRouterAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      routerAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default network router's IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string router_address = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRouterAddress() {
      routerAddress_ = getDefaultInstance().getRouterAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default network router's IP address
     *
     * If unset, an automatic value given by the network will be used.
     * </pre>
     *
     * <code>optional string router_address = 3;</code>
     * @param value The bytes for routerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRouterAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      routerAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.gateway.v1.IPv4Settings)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.gateway.v1.IPv4Settings)
  private static final com.saltoapis.nebula.gateway.v1.IPv4Settings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.gateway.v1.IPv4Settings();
  }

  public static com.saltoapis.nebula.gateway.v1.IPv4Settings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IPv4Settings>
      PARSER = new com.google.protobuf.AbstractParser<IPv4Settings>() {
    @java.lang.Override
    public IPv4Settings parsePartialFrom(
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

  public static com.google.protobuf.Parser<IPv4Settings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IPv4Settings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.IPv4Settings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

