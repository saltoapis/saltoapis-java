// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

/**
 * <pre>
 * The request message for [`BatchCreateAccessRightAccessPointsRequest`][salto.nebula.user.v1.AccessRightService.BatchCreateAccessRightAccessPoint]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest}
 */
public final class BatchCreateAccessRightAccessPointsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest)
    BatchCreateAccessRightAccessPointsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      BatchCreateAccessRightAccessPointsRequest.class.getName());
  }
  // Use BatchCreateAccessRightAccessPointsRequest.newBuilder() to construct.
  private BatchCreateAccessRightAccessPointsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateAccessRightAccessPointsRequest() {
    parent_ = "";
    requests_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.class, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Resource name of the parent resource where the access right's access points
   * associations are to be created. For example:
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
   * Resource name of the parent resource where the access right's access points
   * associations are to be created. For example:
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

  public static final int REQUESTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest> requests_;
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right access points can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest> getRequestsList() {
    return requests_;
  }
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right access points can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder> 
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right access points can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right access points can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right access points can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(2, requests_.get(i));
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
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, requests_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest other = (com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getRequestsList()
        .equals(other.getRequestsList())) return false;
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
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest prototype) {
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
   * The request message for [`BatchCreateAccessRightAccessPointsRequest`][salto.nebula.user.v1.AccessRightService.BatchCreateAccessRightAccessPoint]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest)
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.class, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.newBuilder()
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
      parent_ = "";
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
      } else {
        requests_ = null;
        requestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.internal_static_salto_nebula_accessright_v1_BatchCreateAccessRightAccessPointsRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest build() {
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest buildPartial() {
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest result = new com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest result) {
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest) {
        return mergeFrom((com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest other) {
      if (other == com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000002);
            requestsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRequestsFieldBuilder() : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
        }
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
              com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest m =
                  input.readMessage(
                      com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.parser(),
                      extensionRegistry);
              if (requestsBuilder_ == null) {
                ensureRequestsIsMutable();
                requests_.add(m);
              } else {
                requestsBuilder_.addMessage(m);
              }
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
     * Resource name of the parent resource where the access right's access points
     * associations are to be created. For example:
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
     * Resource name of the parent resource where the access right's access points
     * associations are to be created. For example:
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
     * Resource name of the parent resource where the access right's access points
     * associations are to be created. For example:
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
     * Resource name of the parent resource where the access right's access points
     * associations are to be created. For example:
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
     * Resource name of the parent resource where the access right's access points
     * associations are to be created. For example:
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

    private java.util.List<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest> requests_ =
      java.util.Collections.emptyList();
    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        requests_ = new java.util.ArrayList<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest>(requests_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder> requestsBuilder_;

    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public java.util.List<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest> getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder setRequests(
        int index, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder addRequests(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder addRequests(
        com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder addRequests(
        int index, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest> values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);  } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder> 
         getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder().addBuilder(
          com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.getDefaultInstance());
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.getDefaultInstance());
    }
    /**
     * <pre>
     * The request message specifying the resources to create.
     * A maximum of 100 access right access points can be created in a batch.
     * </pre>
     *
     * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest requests = 2;</code>
     */
    public java.util.List<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder> 
         getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder> 
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.Builder, com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequestOrBuilder>(
                requests_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        requests_ = null;
      }
      return requestsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest)
  private static final com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest();
  }

  public static com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateAccessRightAccessPointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateAccessRightAccessPointsRequest>() {
    @java.lang.Override
    public BatchCreateAccessRightAccessPointsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateAccessRightAccessPointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateAccessRightAccessPointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

