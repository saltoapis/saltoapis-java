// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/unit/v1/unit.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.unit.v1;

/**
 * <pre>
 * The request message for [`CreatePolicy`][salto.nebula.unit.v1.UnitService.CreatePolicy]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.unit.v1.CreatePolicyRequest}
 */
public final class CreatePolicyRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.unit.v1.CreatePolicyRequest)
    CreatePolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreatePolicyRequest.class.getName());
  }
  // Use CreatePolicyRequest.newBuilder() to construct.
  private CreatePolicyRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreatePolicyRequest() {
    parent_ = "";
    policyId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_CreatePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_CreatePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.unit.v1.CreatePolicyRequest.class, com.saltoapis.nebula.unit.v1.CreatePolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where to create the policy. For
   * example: `installations/salto-hq/units/101`.
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
   * Resource name of the parent resource where to create the policy. For
   * example: `installations/salto-hq/units/101`.
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

  public static final int POLICY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object policyId_ = "";
  /**
   * <pre>
   * The policy ID to use for policy. In case it's empty the server
   * will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string policy_id = 2;</code>
   * @return The policyId.
   */
  @java.lang.Override
  public java.lang.String getPolicyId() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The policy ID to use for policy. In case it's empty the server
   * will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string policy_id = 2;</code>
   * @return The bytes for policyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPolicyIdBytes() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      policyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_FIELD_NUMBER = 3;
  private com.saltoapis.nebula.unit.v1.Policy policy_;
  /**
   * <pre>
   * The policy resource to be created. Client must not set the `Policy.name`
   * field.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The policy resource to be created. Client must not set the `Policy.name`
   * field.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
   * @return The policy.
   */
  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.Policy getPolicy() {
    return policy_ == null ? com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance() : policy_;
  }
  /**
   * <pre>
   * The policy resource to be created. Client must not set the `Policy.name`
   * field.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance() : policy_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(policyId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, policyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPolicy());
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(policyId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, policyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPolicy());
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
    if (!(obj instanceof com.saltoapis.nebula.unit.v1.CreatePolicyRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.unit.v1.CreatePolicyRequest other = (com.saltoapis.nebula.unit.v1.CreatePolicyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getPolicyId()
        .equals(other.getPolicyId())) return false;
    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy()
          .equals(other.getPolicy())) return false;
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
    hash = (37 * hash) + POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPolicyId().hashCode();
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.unit.v1.CreatePolicyRequest prototype) {
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
   * The request message for [`CreatePolicy`][salto.nebula.unit.v1.UnitService.CreatePolicy]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.unit.v1.CreatePolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.unit.v1.CreatePolicyRequest)
      com.saltoapis.nebula.unit.v1.CreatePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_CreatePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_CreatePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.unit.v1.CreatePolicyRequest.class, com.saltoapis.nebula.unit.v1.CreatePolicyRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.unit.v1.CreatePolicyRequest.newBuilder()
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
        getPolicyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      policyId_ = "";
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_CreatePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.CreatePolicyRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.unit.v1.CreatePolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.CreatePolicyRequest build() {
      com.saltoapis.nebula.unit.v1.CreatePolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.CreatePolicyRequest buildPartial() {
      com.saltoapis.nebula.unit.v1.CreatePolicyRequest result = new com.saltoapis.nebula.unit.v1.CreatePolicyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.unit.v1.CreatePolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.policyId_ = policyId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.policy_ = policyBuilder_ == null
            ? policy_
            : policyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.unit.v1.CreatePolicyRequest) {
        return mergeFrom((com.saltoapis.nebula.unit.v1.CreatePolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.unit.v1.CreatePolicyRequest other) {
      if (other == com.saltoapis.nebula.unit.v1.CreatePolicyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPolicyId().isEmpty()) {
        policyId_ = other.policyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
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
              policyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPolicyFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Resource name of the parent resource where to create the policy. For
     * example: `installations/salto-hq/units/101`.
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
     * Resource name of the parent resource where to create the policy. For
     * example: `installations/salto-hq/units/101`.
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
     * Resource name of the parent resource where to create the policy. For
     * example: `installations/salto-hq/units/101`.
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
     * Resource name of the parent resource where to create the policy. For
     * example: `installations/salto-hq/units/101`.
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
     * Resource name of the parent resource where to create the policy. For
     * example: `installations/salto-hq/units/101`.
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

    private java.lang.Object policyId_ = "";
    /**
     * <pre>
     * The policy ID to use for policy. In case it's empty the server
     * will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string policy_id = 2;</code>
     * @return The policyId.
     */
    public java.lang.String getPolicyId() {
      java.lang.Object ref = policyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The policy ID to use for policy. In case it's empty the server
     * will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string policy_id = 2;</code>
     * @return The bytes for policyId.
     */
    public com.google.protobuf.ByteString
        getPolicyIdBytes() {
      java.lang.Object ref = policyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        policyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The policy ID to use for policy. In case it's empty the server
     * will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string policy_id = 2;</code>
     * @param value The policyId to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      policyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy ID to use for policy. In case it's empty the server
     * will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string policy_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPolicyId() {
      policyId_ = getDefaultInstance().getPolicyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy ID to use for policy. In case it's empty the server
     * will autogenerate a unique identifier.
     * </pre>
     *
     * <code>string policy_id = 2;</code>
     * @param value The bytes for policyId to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      policyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.saltoapis.nebula.unit.v1.Policy policy_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.unit.v1.Policy, com.saltoapis.nebula.unit.v1.Policy.Builder, com.saltoapis.nebula.unit.v1.PolicyOrBuilder> policyBuilder_;
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     * @return The policy.
     */
    public com.saltoapis.nebula.unit.v1.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    public Builder setPolicy(com.saltoapis.nebula.unit.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    public Builder setPolicy(
        com.saltoapis.nebula.unit.v1.Policy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    public Builder mergePolicy(com.saltoapis.nebula.unit.v1.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          policy_ != null &&
          policy_ != com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      if (policy_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    public com.saltoapis.nebula.unit.v1.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    public com.saltoapis.nebula.unit.v1.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ?
            com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance() : policy_;
      }
    }
    /**
     * <pre>
     * The policy resource to be created. Client must not set the `Policy.name`
     * field.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.unit.v1.Policy, com.saltoapis.nebula.unit.v1.Policy.Builder, com.saltoapis.nebula.unit.v1.PolicyOrBuilder> 
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.unit.v1.Policy, com.saltoapis.nebula.unit.v1.Policy.Builder, com.saltoapis.nebula.unit.v1.PolicyOrBuilder>(
                getPolicy(),
                getParentForChildren(),
                isClean());
        policy_ = null;
      }
      return policyBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.unit.v1.CreatePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.unit.v1.CreatePolicyRequest)
  private static final com.saltoapis.nebula.unit.v1.CreatePolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.unit.v1.CreatePolicyRequest();
  }

  public static com.saltoapis.nebula.unit.v1.CreatePolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreatePolicyRequest>() {
    @java.lang.Override
    public CreatePolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.CreatePolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

