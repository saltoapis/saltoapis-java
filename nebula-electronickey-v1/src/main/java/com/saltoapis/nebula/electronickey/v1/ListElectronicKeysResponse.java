// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/electronickey/v1/electronic_key.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.electronickey.v1;

/**
 * <pre>
 * The response message for [ListElectronicKeys][salto.nebula.electronickey.v1.ElectronicKeyService.ListElectronicKeys]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.electronickey.v1.ListElectronicKeysResponse}
 */
public final class ListElectronicKeysResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.electronickey.v1.ListElectronicKeysResponse)
    ListElectronicKeysResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListElectronicKeysResponse.class.getName());
  }
  // Use ListElectronicKeysResponse.newBuilder() to construct.
  private ListElectronicKeysResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListElectronicKeysResponse() {
    electronicKeys_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_ListElectronicKeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_ListElectronicKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.class, com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.Builder.class);
  }

  public static final int ELECTRONIC_KEYS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.electronickey.v1.ElectronicKey> electronicKeys_;
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.electronickey.v1.ElectronicKey> getElectronicKeysList() {
    return electronicKeys_;
  }
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder> 
      getElectronicKeysOrBuilderList() {
    return electronicKeys_;
  }
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  @java.lang.Override
  public int getElectronicKeysCount() {
    return electronicKeys_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.electronickey.v1.ElectronicKey getElectronicKeys(int index) {
    return electronicKeys_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder getElectronicKeysOrBuilder(
      int index) {
    return electronicKeys_.get(index);
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
    for (int i = 0; i < electronicKeys_.size(); i++) {
      output.writeMessage(1, electronicKeys_.get(i));
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
    for (int i = 0; i < electronicKeys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, electronicKeys_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse other = (com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse) obj;

    if (!getElectronicKeysList()
        .equals(other.getElectronicKeysList())) return false;
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
    if (getElectronicKeysCount() > 0) {
      hash = (37 * hash) + ELECTRONIC_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getElectronicKeysList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse prototype) {
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
   * The response message for [ListElectronicKeys][salto.nebula.electronickey.v1.ElectronicKeyService.ListElectronicKeys]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.electronickey.v1.ListElectronicKeysResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.electronickey.v1.ListElectronicKeysResponse)
      com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_ListElectronicKeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_ListElectronicKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.class, com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.newBuilder()
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
      if (electronicKeysBuilder_ == null) {
        electronicKeys_ = java.util.Collections.emptyList();
      } else {
        electronicKeys_ = null;
        electronicKeysBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.internal_static_salto_nebula_electronickey_v1_ListElectronicKeysResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse build() {
      com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse buildPartial() {
      com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse result = new com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse result) {
      if (electronicKeysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          electronicKeys_ = java.util.Collections.unmodifiableList(electronicKeys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.electronicKeys_ = electronicKeys_;
      } else {
        result.electronicKeys_ = electronicKeysBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse) {
        return mergeFrom((com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse other) {
      if (other == com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.getDefaultInstance()) return this;
      if (electronicKeysBuilder_ == null) {
        if (!other.electronicKeys_.isEmpty()) {
          if (electronicKeys_.isEmpty()) {
            electronicKeys_ = other.electronicKeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElectronicKeysIsMutable();
            electronicKeys_.addAll(other.electronicKeys_);
          }
          onChanged();
        }
      } else {
        if (!other.electronicKeys_.isEmpty()) {
          if (electronicKeysBuilder_.isEmpty()) {
            electronicKeysBuilder_.dispose();
            electronicKeysBuilder_ = null;
            electronicKeys_ = other.electronicKeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            electronicKeysBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getElectronicKeysFieldBuilder() : null;
          } else {
            electronicKeysBuilder_.addAllMessages(other.electronicKeys_);
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
              com.saltoapis.nebula.electronickey.v1.ElectronicKey m =
                  input.readMessage(
                      com.saltoapis.nebula.electronickey.v1.ElectronicKey.parser(),
                      extensionRegistry);
              if (electronicKeysBuilder_ == null) {
                ensureElectronicKeysIsMutable();
                electronicKeys_.add(m);
              } else {
                electronicKeysBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.nebula.electronickey.v1.ElectronicKey> electronicKeys_ =
      java.util.Collections.emptyList();
    private void ensureElectronicKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        electronicKeys_ = new java.util.ArrayList<com.saltoapis.nebula.electronickey.v1.ElectronicKey>(electronicKeys_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.electronickey.v1.ElectronicKey, com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder, com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder> electronicKeysBuilder_;

    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.electronickey.v1.ElectronicKey> getElectronicKeysList() {
      if (electronicKeysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(electronicKeys_);
      } else {
        return electronicKeysBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public int getElectronicKeysCount() {
      if (electronicKeysBuilder_ == null) {
        return electronicKeys_.size();
      } else {
        return electronicKeysBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey getElectronicKeys(int index) {
      if (electronicKeysBuilder_ == null) {
        return electronicKeys_.get(index);
      } else {
        return electronicKeysBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder setElectronicKeys(
        int index, com.saltoapis.nebula.electronickey.v1.ElectronicKey value) {
      if (electronicKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElectronicKeysIsMutable();
        electronicKeys_.set(index, value);
        onChanged();
      } else {
        electronicKeysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder setElectronicKeys(
        int index, com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder builderForValue) {
      if (electronicKeysBuilder_ == null) {
        ensureElectronicKeysIsMutable();
        electronicKeys_.set(index, builderForValue.build());
        onChanged();
      } else {
        electronicKeysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder addElectronicKeys(com.saltoapis.nebula.electronickey.v1.ElectronicKey value) {
      if (electronicKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElectronicKeysIsMutable();
        electronicKeys_.add(value);
        onChanged();
      } else {
        electronicKeysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder addElectronicKeys(
        int index, com.saltoapis.nebula.electronickey.v1.ElectronicKey value) {
      if (electronicKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElectronicKeysIsMutable();
        electronicKeys_.add(index, value);
        onChanged();
      } else {
        electronicKeysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder addElectronicKeys(
        com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder builderForValue) {
      if (electronicKeysBuilder_ == null) {
        ensureElectronicKeysIsMutable();
        electronicKeys_.add(builderForValue.build());
        onChanged();
      } else {
        electronicKeysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder addElectronicKeys(
        int index, com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder builderForValue) {
      if (electronicKeysBuilder_ == null) {
        ensureElectronicKeysIsMutable();
        electronicKeys_.add(index, builderForValue.build());
        onChanged();
      } else {
        electronicKeysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder addAllElectronicKeys(
        java.lang.Iterable<? extends com.saltoapis.nebula.electronickey.v1.ElectronicKey> values) {
      if (electronicKeysBuilder_ == null) {
        ensureElectronicKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, electronicKeys_);
        onChanged();
      } else {
        electronicKeysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder clearElectronicKeys() {
      if (electronicKeysBuilder_ == null) {
        electronicKeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        electronicKeysBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public Builder removeElectronicKeys(int index) {
      if (electronicKeysBuilder_ == null) {
        ensureElectronicKeysIsMutable();
        electronicKeys_.remove(index);
        onChanged();
      } else {
        electronicKeysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder getElectronicKeysBuilder(
        int index) {
      return getElectronicKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder getElectronicKeysOrBuilder(
        int index) {
      if (electronicKeysBuilder_ == null) {
        return electronicKeys_.get(index);  } else {
        return electronicKeysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder> 
         getElectronicKeysOrBuilderList() {
      if (electronicKeysBuilder_ != null) {
        return electronicKeysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(electronicKeys_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder addElectronicKeysBuilder() {
      return getElectronicKeysFieldBuilder().addBuilder(
          com.saltoapis.nebula.electronickey.v1.ElectronicKey.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder addElectronicKeysBuilder(
        int index) {
      return getElectronicKeysFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.electronickey.v1.ElectronicKey.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `electronic_keys` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder> 
         getElectronicKeysBuilderList() {
      return getElectronicKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.electronickey.v1.ElectronicKey, com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder, com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder> 
        getElectronicKeysFieldBuilder() {
      if (electronicKeysBuilder_ == null) {
        electronicKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.electronickey.v1.ElectronicKey, com.saltoapis.nebula.electronickey.v1.ElectronicKey.Builder, com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder>(
                electronicKeys_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        electronicKeys_ = null;
      }
      return electronicKeysBuilder_;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.electronickey.v1.ListElectronicKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.electronickey.v1.ListElectronicKeysResponse)
  private static final com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse();
  }

  public static com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListElectronicKeysResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListElectronicKeysResponse>() {
    @java.lang.Override
    public ListElectronicKeysResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListElectronicKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListElectronicKeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

