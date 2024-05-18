// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/gateway/v1/gateway.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.gateway.v1;

/**
 * <pre>
 * DNS settings
 * </pre>
 *
 * Protobuf type {@code salto.nebula.gateway.v1.DNSSettings}
 */
public final class DNSSettings extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.gateway.v1.DNSSettings)
    DNSSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DNSSettings.class.getName());
  }
  // Use DNSSettings.newBuilder() to construct.
  private DNSSettings(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DNSSettings() {
    dnsAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_DNSSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_DNSSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.gateway.v1.DNSSettings.class, com.saltoapis.nebula.gateway.v1.DNSSettings.Builder.class);
  }

  public static final int DNS_ADDRESSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList dnsAddresses_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * DNS server IP addresses. The order of the elements in this list will mark
   * priorities. For example: the first element will be primary DNS and the
   * second element will be secondary DNS.
   *
   * If empty, an automatic DNS address given by the network will be used.
   * </pre>
   *
   * <code>repeated string dns_addresses = 1;</code>
   * @return A list containing the dnsAddresses.
   */
  public com.google.protobuf.ProtocolStringList
      getDnsAddressesList() {
    return dnsAddresses_;
  }
  /**
   * <pre>
   * DNS server IP addresses. The order of the elements in this list will mark
   * priorities. For example: the first element will be primary DNS and the
   * second element will be secondary DNS.
   *
   * If empty, an automatic DNS address given by the network will be used.
   * </pre>
   *
   * <code>repeated string dns_addresses = 1;</code>
   * @return The count of dnsAddresses.
   */
  public int getDnsAddressesCount() {
    return dnsAddresses_.size();
  }
  /**
   * <pre>
   * DNS server IP addresses. The order of the elements in this list will mark
   * priorities. For example: the first element will be primary DNS and the
   * second element will be secondary DNS.
   *
   * If empty, an automatic DNS address given by the network will be used.
   * </pre>
   *
   * <code>repeated string dns_addresses = 1;</code>
   * @param index The index of the element to return.
   * @return The dnsAddresses at the given index.
   */
  public java.lang.String getDnsAddresses(int index) {
    return dnsAddresses_.get(index);
  }
  /**
   * <pre>
   * DNS server IP addresses. The order of the elements in this list will mark
   * priorities. For example: the first element will be primary DNS and the
   * second element will be secondary DNS.
   *
   * If empty, an automatic DNS address given by the network will be used.
   * </pre>
   *
   * <code>repeated string dns_addresses = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dnsAddresses at the given index.
   */
  public com.google.protobuf.ByteString
      getDnsAddressesBytes(int index) {
    return dnsAddresses_.getByteString(index);
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
    for (int i = 0; i < dnsAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, dnsAddresses_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < dnsAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(dnsAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDnsAddressesList().size();
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
    if (!(obj instanceof com.saltoapis.nebula.gateway.v1.DNSSettings)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.gateway.v1.DNSSettings other = (com.saltoapis.nebula.gateway.v1.DNSSettings) obj;

    if (!getDnsAddressesList()
        .equals(other.getDnsAddressesList())) return false;
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
    if (getDnsAddressesCount() > 0) {
      hash = (37 * hash) + DNS_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getDnsAddressesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.gateway.v1.DNSSettings parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.gateway.v1.DNSSettings prototype) {
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
   * DNS settings
   * </pre>
   *
   * Protobuf type {@code salto.nebula.gateway.v1.DNSSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.gateway.v1.DNSSettings)
      com.saltoapis.nebula.gateway.v1.DNSSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_DNSSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_DNSSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.gateway.v1.DNSSettings.class, com.saltoapis.nebula.gateway.v1.DNSSettings.Builder.class);
    }

    // Construct using com.saltoapis.nebula.gateway.v1.DNSSettings.newBuilder()
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
      dnsAddresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.internal_static_salto_nebula_gateway_v1_DNSSettings_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.DNSSettings getDefaultInstanceForType() {
      return com.saltoapis.nebula.gateway.v1.DNSSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.DNSSettings build() {
      com.saltoapis.nebula.gateway.v1.DNSSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.gateway.v1.DNSSettings buildPartial() {
      com.saltoapis.nebula.gateway.v1.DNSSettings result = new com.saltoapis.nebula.gateway.v1.DNSSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.gateway.v1.DNSSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        dnsAddresses_.makeImmutable();
        result.dnsAddresses_ = dnsAddresses_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.gateway.v1.DNSSettings) {
        return mergeFrom((com.saltoapis.nebula.gateway.v1.DNSSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.gateway.v1.DNSSettings other) {
      if (other == com.saltoapis.nebula.gateway.v1.DNSSettings.getDefaultInstance()) return this;
      if (!other.dnsAddresses_.isEmpty()) {
        if (dnsAddresses_.isEmpty()) {
          dnsAddresses_ = other.dnsAddresses_;
          bitField0_ |= 0x00000001;
        } else {
          ensureDnsAddressesIsMutable();
          dnsAddresses_.addAll(other.dnsAddresses_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureDnsAddressesIsMutable();
              dnsAddresses_.add(s);
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

    private com.google.protobuf.LazyStringArrayList dnsAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDnsAddressesIsMutable() {
      if (!dnsAddresses_.isModifiable()) {
        dnsAddresses_ = new com.google.protobuf.LazyStringArrayList(dnsAddresses_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @return A list containing the dnsAddresses.
     */
    public com.google.protobuf.ProtocolStringList
        getDnsAddressesList() {
      dnsAddresses_.makeImmutable();
      return dnsAddresses_;
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @return The count of dnsAddresses.
     */
    public int getDnsAddressesCount() {
      return dnsAddresses_.size();
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @param index The index of the element to return.
     * @return The dnsAddresses at the given index.
     */
    public java.lang.String getDnsAddresses(int index) {
      return dnsAddresses_.get(index);
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dnsAddresses at the given index.
     */
    public com.google.protobuf.ByteString
        getDnsAddressesBytes(int index) {
      return dnsAddresses_.getByteString(index);
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @param index The index to set the value at.
     * @param value The dnsAddresses to set.
     * @return This builder for chaining.
     */
    public Builder setDnsAddresses(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDnsAddressesIsMutable();
      dnsAddresses_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @param value The dnsAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addDnsAddresses(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDnsAddressesIsMutable();
      dnsAddresses_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @param values The dnsAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllDnsAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureDnsAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dnsAddresses_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDnsAddresses() {
      dnsAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DNS server IP addresses. The order of the elements in this list will mark
     * priorities. For example: the first element will be primary DNS and the
     * second element will be secondary DNS.
     *
     * If empty, an automatic DNS address given by the network will be used.
     * </pre>
     *
     * <code>repeated string dns_addresses = 1;</code>
     * @param value The bytes of the dnsAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addDnsAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDnsAddressesIsMutable();
      dnsAddresses_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.gateway.v1.DNSSettings)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.gateway.v1.DNSSettings)
  private static final com.saltoapis.nebula.gateway.v1.DNSSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.gateway.v1.DNSSettings();
  }

  public static com.saltoapis.nebula.gateway.v1.DNSSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DNSSettings>
      PARSER = new com.google.protobuf.AbstractParser<DNSSettings>() {
    @java.lang.Override
    public DNSSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<DNSSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNSSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.gateway.v1.DNSSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

