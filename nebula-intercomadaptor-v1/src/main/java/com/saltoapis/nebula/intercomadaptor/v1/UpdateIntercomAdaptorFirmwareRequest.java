// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.intercomadaptor.v1;

/**
 * <pre>
 * The request message for [`UpdateIntercomAdaptorFirmware`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.UpdateIntercomAdaptorFirmware]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest}
 */
public final class UpdateIntercomAdaptorFirmwareRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest)
    UpdateIntercomAdaptorFirmwareRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateIntercomAdaptorFirmwareRequest.class.getName());
  }
  // Use UpdateIntercomAdaptorFirmwareRequest.newBuilder() to construct.
  private UpdateIntercomAdaptorFirmwareRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateIntercomAdaptorFirmwareRequest() {
    intercomAdaptor_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UpdateIntercomAdaptorFirmwareRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UpdateIntercomAdaptorFirmwareRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.class, com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.Builder.class);
  }

  public static final int INTERCOM_ADAPTOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object intercomAdaptor_ = "";
  /**
   * <pre>
   * The resource name of the intercom adaptor whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
   * </pre>
   *
   * <code>string intercom_adaptor = 1;</code>
   * @return The intercomAdaptor.
   */
  @java.lang.Override
  public java.lang.String getIntercomAdaptor() {
    java.lang.Object ref = intercomAdaptor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      intercomAdaptor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the intercom adaptor whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
   * </pre>
   *
   * <code>string intercom_adaptor = 1;</code>
   * @return The bytes for intercomAdaptor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntercomAdaptorBytes() {
    java.lang.Object ref = intercomAdaptor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      intercomAdaptor_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(intercomAdaptor_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, intercomAdaptor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(intercomAdaptor_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, intercomAdaptor_);
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
    if (!(obj instanceof com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest other = (com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest) obj;

    if (!getIntercomAdaptor()
        .equals(other.getIntercomAdaptor())) return false;
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
    hash = (37 * hash) + INTERCOM_ADAPTOR_FIELD_NUMBER;
    hash = (53 * hash) + getIntercomAdaptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest prototype) {
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
   * The request message for [`UpdateIntercomAdaptorFirmware`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.UpdateIntercomAdaptorFirmware]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest)
      com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UpdateIntercomAdaptorFirmwareRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UpdateIntercomAdaptorFirmwareRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.class, com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.newBuilder()
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
      intercomAdaptor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.internal_static_salto_nebula_intercomadaptor_v1_UpdateIntercomAdaptorFirmwareRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest build() {
      com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest buildPartial() {
      com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest result = new com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.intercomAdaptor_ = intercomAdaptor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest) {
        return mergeFrom((com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest other) {
      if (other == com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.getDefaultInstance()) return this;
      if (!other.getIntercomAdaptor().isEmpty()) {
        intercomAdaptor_ = other.intercomAdaptor_;
        bitField0_ |= 0x00000001;
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
              intercomAdaptor_ = input.readStringRequireUtf8();
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

    private java.lang.Object intercomAdaptor_ = "";
    /**
     * <pre>
     * The resource name of the intercom adaptor whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
     * </pre>
     *
     * <code>string intercom_adaptor = 1;</code>
     * @return The intercomAdaptor.
     */
    public java.lang.String getIntercomAdaptor() {
      java.lang.Object ref = intercomAdaptor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        intercomAdaptor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the intercom adaptor whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
     * </pre>
     *
     * <code>string intercom_adaptor = 1;</code>
     * @return The bytes for intercomAdaptor.
     */
    public com.google.protobuf.ByteString
        getIntercomAdaptorBytes() {
      java.lang.Object ref = intercomAdaptor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        intercomAdaptor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the intercom adaptor whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
     * </pre>
     *
     * <code>string intercom_adaptor = 1;</code>
     * @param value The intercomAdaptor to set.
     * @return This builder for chaining.
     */
    public Builder setIntercomAdaptor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      intercomAdaptor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the intercom adaptor whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
     * </pre>
     *
     * <code>string intercom_adaptor = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntercomAdaptor() {
      intercomAdaptor_ = getDefaultInstance().getIntercomAdaptor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the intercom adaptor whose firmware will be updated. For
     * example:
     * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
     * </pre>
     *
     * <code>string intercom_adaptor = 1;</code>
     * @param value The bytes for intercomAdaptor to set.
     * @return This builder for chaining.
     */
    public Builder setIntercomAdaptorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      intercomAdaptor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest)
  private static final com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest();
  }

  public static com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIntercomAdaptorFirmwareRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateIntercomAdaptorFirmwareRequest>() {
    @java.lang.Override
    public UpdateIntercomAdaptorFirmwareRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateIntercomAdaptorFirmwareRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIntercomAdaptorFirmwareRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
