// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/installation/v1/installation.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.installation.v1;

/**
 * <pre>
 * The request message for [`UnapplyCoupon`][salto.nebula.installation.v1.InstallationService.UnapplyCoupon]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.installation.v1.UnapplyCouponRequest}
 */
public final class UnapplyCouponRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.installation.v1.UnapplyCouponRequest)
    UnapplyCouponRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UnapplyCouponRequest.class.getName());
  }
  // Use UnapplyCouponRequest.newBuilder() to construct.
  private UnapplyCouponRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UnapplyCouponRequest() {
    subscription_ = "";
    coupon_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_UnapplyCouponRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_UnapplyCouponRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.class, com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subscription_ = "";
  /**
   * <pre>
   * The resource name of the subscription for which the coupon is being
   * requested to be unapplied. For example:
   * `installations/surelock-homes-hq/subscription`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the subscription for which the coupon is being
   * requested to be unapplied. For example:
   * `installations/surelock-homes-hq/subscription`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUPON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object coupon_ = "";
  /**
   * <pre>
   * The resource name of the coupon that is requested to be unapplied.
   * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
   * </pre>
   *
   * <code>string coupon = 2;</code>
   * @return The coupon.
   */
  @java.lang.Override
  public java.lang.String getCoupon() {
    java.lang.Object ref = coupon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coupon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the coupon that is requested to be unapplied.
   * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
   * </pre>
   *
   * <code>string coupon = 2;</code>
   * @return The bytes for coupon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCouponBytes() {
    java.lang.Object ref = coupon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coupon_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, subscription_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(coupon_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, coupon_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, subscription_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(coupon_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, coupon_);
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
    if (!(obj instanceof com.saltoapis.nebula.installation.v1.UnapplyCouponRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.installation.v1.UnapplyCouponRequest other = (com.saltoapis.nebula.installation.v1.UnapplyCouponRequest) obj;

    if (!getSubscription()
        .equals(other.getSubscription())) return false;
    if (!getCoupon()
        .equals(other.getCoupon())) return false;
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
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    hash = (37 * hash) + COUPON_FIELD_NUMBER;
    hash = (53 * hash) + getCoupon().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.installation.v1.UnapplyCouponRequest prototype) {
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
   * The request message for [`UnapplyCoupon`][salto.nebula.installation.v1.InstallationService.UnapplyCoupon]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.installation.v1.UnapplyCouponRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.installation.v1.UnapplyCouponRequest)
      com.saltoapis.nebula.installation.v1.UnapplyCouponRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_UnapplyCouponRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_UnapplyCouponRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.class, com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.newBuilder()
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
      subscription_ = "";
      coupon_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_UnapplyCouponRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.UnapplyCouponRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.UnapplyCouponRequest build() {
      com.saltoapis.nebula.installation.v1.UnapplyCouponRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.UnapplyCouponRequest buildPartial() {
      com.saltoapis.nebula.installation.v1.UnapplyCouponRequest result = new com.saltoapis.nebula.installation.v1.UnapplyCouponRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.installation.v1.UnapplyCouponRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscription_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coupon_ = coupon_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.installation.v1.UnapplyCouponRequest) {
        return mergeFrom((com.saltoapis.nebula.installation.v1.UnapplyCouponRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.installation.v1.UnapplyCouponRequest other) {
      if (other == com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCoupon().isEmpty()) {
        coupon_ = other.coupon_;
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
              subscription_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              coupon_ = input.readStringRequireUtf8();
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

    private java.lang.Object subscription_ = "";
    /**
     * <pre>
     * The resource name of the subscription for which the coupon is being
     * requested to be unapplied. For example:
     * `installations/surelock-homes-hq/subscription`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the subscription for which the coupon is being
     * requested to be unapplied. For example:
     * `installations/surelock-homes-hq/subscription`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString
        getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the subscription for which the coupon is being
     * requested to be unapplied. For example:
     * `installations/surelock-homes-hq/subscription`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the subscription for which the coupon is being
     * requested to be unapplied. For example:
     * `installations/surelock-homes-hq/subscription`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      subscription_ = getDefaultInstance().getSubscription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the subscription for which the coupon is being
     * requested to be unapplied. For example:
     * `installations/surelock-homes-hq/subscription`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object coupon_ = "";
    /**
     * <pre>
     * The resource name of the coupon that is requested to be unapplied.
     * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
     * </pre>
     *
     * <code>string coupon = 2;</code>
     * @return The coupon.
     */
    public java.lang.String getCoupon() {
      java.lang.Object ref = coupon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coupon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the coupon that is requested to be unapplied.
     * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
     * </pre>
     *
     * <code>string coupon = 2;</code>
     * @return The bytes for coupon.
     */
    public com.google.protobuf.ByteString
        getCouponBytes() {
      java.lang.Object ref = coupon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coupon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the coupon that is requested to be unapplied.
     * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
     * </pre>
     *
     * <code>string coupon = 2;</code>
     * @param value The coupon to set.
     * @return This builder for chaining.
     */
    public Builder setCoupon(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      coupon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the coupon that is requested to be unapplied.
     * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
     * </pre>
     *
     * <code>string coupon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoupon() {
      coupon_ = getDefaultInstance().getCoupon();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the coupon that is requested to be unapplied.
     * For example: `installations/surelock-homes-hq/subscription/coupons/01HCD0YB`.
     * </pre>
     *
     * <code>string coupon = 2;</code>
     * @param value The bytes for coupon to set.
     * @return This builder for chaining.
     */
    public Builder setCouponBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      coupon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.installation.v1.UnapplyCouponRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.installation.v1.UnapplyCouponRequest)
  private static final com.saltoapis.nebula.installation.v1.UnapplyCouponRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.installation.v1.UnapplyCouponRequest();
  }

  public static com.saltoapis.nebula.installation.v1.UnapplyCouponRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnapplyCouponRequest>
      PARSER = new com.google.protobuf.AbstractParser<UnapplyCouponRequest>() {
    @java.lang.Override
    public UnapplyCouponRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnapplyCouponRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnapplyCouponRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.installation.v1.UnapplyCouponRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

