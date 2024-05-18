// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.intercomadaptor.v1;

/**
 * <pre>
 * The request message for [`UnbindIntercomAdaptor`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.UnbindIntercomAdaptor]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest}
 */
public final class UnbindIntercomAdaptorRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest)
    UnbindIntercomAdaptorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      UnbindIntercomAdaptorRequest.class.getName());
  }
  // Use UnbindIntercomAdaptorRequest.newBuilder() to construct.
  private UnbindIntercomAdaptorRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UnbindIntercomAdaptorRequest() {
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UnbindIntercomAdaptorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UnbindIntercomAdaptorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.class, com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The resource name of the intercom adaptor to be bound. For example:
   * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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
   * The resource name of the intercom adaptor to be bound. For example:
   * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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

  public static final int FORCE_FIELD_NUMBER = 2;
  private boolean force_ = false;
  /**
   * <pre>
   * If set to true, the device identifier is removed (unbound) from the
   * intercom adaptor. Otherwise, the request will only work if the intercom
   * adaptor isn't bound to any previous device identifier.
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  @java.lang.Override
  public boolean getForce() {
    return force_;
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
    if (force_ != false) {
      output.writeBool(2, force_);
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
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, force_);
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
    if (!(obj instanceof com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest other = (com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getForce()
        != other.getForce()) return false;
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
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForce());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest prototype) {
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
   * The request message for [`UnbindIntercomAdaptor`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.UnbindIntercomAdaptor]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest)
      com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UnbindIntercomAdaptorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UnbindIntercomAdaptorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.class, com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.newBuilder()
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
      force_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UnbindIntercomAdaptorRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest build() {
      com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest buildPartial() {
      com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest result = new com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.force_ = force_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest) {
        return mergeFrom((com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest other) {
      if (other == com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
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
            case 16: {
              force_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * The resource name of the intercom adaptor to be bound. For example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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
     * The resource name of the intercom adaptor to be bound. For example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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
     * The resource name of the intercom adaptor to be bound. For example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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
     * The resource name of the intercom adaptor to be bound. For example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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
     * The resource name of the intercom adaptor to be bound. For example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
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

    private boolean force_ ;
    /**
     * <pre>
     * If set to true, the device identifier is removed (unbound) from the
     * intercom adaptor. Otherwise, the request will only work if the intercom
     * adaptor isn't bound to any previous device identifier.
     * </pre>
     *
     * <code>bool force = 2;</code>
     * @return The force.
     */
    @java.lang.Override
    public boolean getForce() {
      return force_;
    }
    /**
     * <pre>
     * If set to true, the device identifier is removed (unbound) from the
     * intercom adaptor. Otherwise, the request will only work if the intercom
     * adaptor isn't bound to any previous device identifier.
     * </pre>
     *
     * <code>bool force = 2;</code>
     * @param value The force to set.
     * @return This builder for chaining.
     */
    public Builder setForce(boolean value) {

      force_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, the device identifier is removed (unbound) from the
     * intercom adaptor. Otherwise, the request will only work if the intercom
     * adaptor isn't bound to any previous device identifier.
     * </pre>
     *
     * <code>bool force = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearForce() {
      bitField0_ = (bitField0_ & ~0x00000002);
      force_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest)
  private static final com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest();
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnbindIntercomAdaptorRequest>
      PARSER = new com.google.protobuf.AbstractParser<UnbindIntercomAdaptorRequest>() {
    @java.lang.Override
    public UnbindIntercomAdaptorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnbindIntercomAdaptorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnbindIntercomAdaptorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

