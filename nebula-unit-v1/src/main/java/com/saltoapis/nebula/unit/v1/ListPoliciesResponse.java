// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/unit/v1/unit.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.unit.v1;

/**
 * <pre>
 * The response message for [`ListPolicies`][salto.nebula.unit.v1.UnitService.ListPolicies]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.unit.v1.ListPoliciesResponse}
 */
public final class ListPoliciesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.unit.v1.ListPoliciesResponse)
    ListPoliciesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ListPoliciesResponse.class.getName());
  }
  // Use ListPoliciesResponse.newBuilder() to construct.
  private ListPoliciesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListPoliciesResponse() {
    policies_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_ListPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_ListPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.unit.v1.ListPoliciesResponse.class, com.saltoapis.nebula.unit.v1.ListPoliciesResponse.Builder.class);
  }

  public static final int POLICIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.unit.v1.Policy> policies_;
  /**
   * <pre>
   * The field name should match the noun `policies` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.unit.v1.Policy> getPoliciesList() {
    return policies_;
  }
  /**
   * <pre>
   * The field name should match the noun `policies` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.unit.v1.PolicyOrBuilder> 
      getPoliciesOrBuilderList() {
    return policies_;
  }
  /**
   * <pre>
   * The field name should match the noun `policies` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
   */
  @java.lang.Override
  public int getPoliciesCount() {
    return policies_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `policies` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.Policy getPolicies(int index) {
    return policies_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `policies` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.PolicyOrBuilder getPoliciesOrBuilder(
      int index) {
    return policies_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < policies_.size(); i++) {
      output.writeMessage(1, policies_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < policies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, policies_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.saltoapis.nebula.unit.v1.ListPoliciesResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.unit.v1.ListPoliciesResponse other = (com.saltoapis.nebula.unit.v1.ListPoliciesResponse) obj;

    if (!getPoliciesList()
        .equals(other.getPoliciesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getPoliciesCount() > 0) {
      hash = (37 * hash) + POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getPoliciesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.unit.v1.ListPoliciesResponse prototype) {
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
   * The response message for [`ListPolicies`][salto.nebula.unit.v1.UnitService.ListPolicies]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.unit.v1.ListPoliciesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.unit.v1.ListPoliciesResponse)
      com.saltoapis.nebula.unit.v1.ListPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_ListPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_ListPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.unit.v1.ListPoliciesResponse.class, com.saltoapis.nebula.unit.v1.ListPoliciesResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.unit.v1.ListPoliciesResponse.newBuilder()
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
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
      } else {
        policies_ = null;
        policiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_ListPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.ListPoliciesResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.unit.v1.ListPoliciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.ListPoliciesResponse build() {
      com.saltoapis.nebula.unit.v1.ListPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.ListPoliciesResponse buildPartial() {
      com.saltoapis.nebula.unit.v1.ListPoliciesResponse result = new com.saltoapis.nebula.unit.v1.ListPoliciesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.unit.v1.ListPoliciesResponse result) {
      if (policiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          policies_ = java.util.Collections.unmodifiableList(policies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policies_ = policies_;
      } else {
        result.policies_ = policiesBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.unit.v1.ListPoliciesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.unit.v1.ListPoliciesResponse) {
        return mergeFrom((com.saltoapis.nebula.unit.v1.ListPoliciesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.unit.v1.ListPoliciesResponse other) {
      if (other == com.saltoapis.nebula.unit.v1.ListPoliciesResponse.getDefaultInstance()) return this;
      if (policiesBuilder_ == null) {
        if (!other.policies_.isEmpty()) {
          if (policies_.isEmpty()) {
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePoliciesIsMutable();
            policies_.addAll(other.policies_);
          }
          onChanged();
        }
      } else {
        if (!other.policies_.isEmpty()) {
          if (policiesBuilder_.isEmpty()) {
            policiesBuilder_.dispose();
            policiesBuilder_ = null;
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            policiesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPoliciesFieldBuilder() : null;
          } else {
            policiesBuilder_.addAllMessages(other.policies_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              com.saltoapis.nebula.unit.v1.Policy m =
                  input.readMessage(
                      com.saltoapis.nebula.unit.v1.Policy.parser(),
                      extensionRegistry);
              if (policiesBuilder_ == null) {
                ensurePoliciesIsMutable();
                policies_.add(m);
              } else {
                policiesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.saltoapis.nebula.unit.v1.Policy> policies_ =
      java.util.Collections.emptyList();
    private void ensurePoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        policies_ = new java.util.ArrayList<com.saltoapis.nebula.unit.v1.Policy>(policies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.unit.v1.Policy, com.saltoapis.nebula.unit.v1.Policy.Builder, com.saltoapis.nebula.unit.v1.PolicyOrBuilder> policiesBuilder_;

    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.unit.v1.Policy> getPoliciesList() {
      if (policiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policies_);
      } else {
        return policiesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public int getPoliciesCount() {
      if (policiesBuilder_ == null) {
        return policies_.size();
      } else {
        return policiesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.Policy getPolicies(int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);
      } else {
        return policiesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder setPolicies(
        int index, com.saltoapis.nebula.unit.v1.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.set(index, value);
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder setPolicies(
        int index, com.saltoapis.nebula.unit.v1.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.set(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder addPolicies(com.saltoapis.nebula.unit.v1.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder addPolicies(
        int index, com.saltoapis.nebula.unit.v1.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(index, value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder addPolicies(
        com.saltoapis.nebula.unit.v1.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder addPolicies(
        int index, com.saltoapis.nebula.unit.v1.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder addAllPolicies(
        java.lang.Iterable<? extends com.saltoapis.nebula.unit.v1.Policy> values) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, policies_);
        onChanged();
      } else {
        policiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder clearPolicies() {
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        policiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public Builder removePolicies(int index) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.remove(index);
        onChanged();
      } else {
        policiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.Policy.Builder getPoliciesBuilder(
        int index) {
      return getPoliciesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.PolicyOrBuilder getPoliciesOrBuilder(
        int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);  } else {
        return policiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.unit.v1.PolicyOrBuilder> 
         getPoliciesOrBuilderList() {
      if (policiesBuilder_ != null) {
        return policiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policies_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.Policy.Builder addPoliciesBuilder() {
      return getPoliciesFieldBuilder().addBuilder(
          com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.Policy.Builder addPoliciesBuilder(
        int index) {
      return getPoliciesFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `policies` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.unit.v1.Policy policies = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.unit.v1.Policy.Builder> 
         getPoliciesBuilderList() {
      return getPoliciesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.unit.v1.Policy, com.saltoapis.nebula.unit.v1.Policy.Builder, com.saltoapis.nebula.unit.v1.PolicyOrBuilder> 
        getPoliciesFieldBuilder() {
      if (policiesBuilder_ == null) {
        policiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.unit.v1.Policy, com.saltoapis.nebula.unit.v1.Policy.Builder, com.saltoapis.nebula.unit.v1.PolicyOrBuilder>(
                policies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        policies_ = null;
      }
      return policiesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.unit.v1.ListPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.unit.v1.ListPoliciesResponse)
  private static final com.saltoapis.nebula.unit.v1.ListPoliciesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.unit.v1.ListPoliciesResponse();
  }

  public static com.saltoapis.nebula.unit.v1.ListPoliciesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPoliciesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPoliciesResponse>() {
    @java.lang.Override
    public ListPoliciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.ListPoliciesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

