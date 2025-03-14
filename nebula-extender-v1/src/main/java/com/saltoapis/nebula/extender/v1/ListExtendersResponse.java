// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/extender/v1/extender.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.extender.v1;

/**
 * <pre>
 * The response message for [ListExtenders][salto.nebula.extender.v1.ExtenderService.ListExtenders]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.extender.v1.ListExtendersResponse}
 */
public final class ListExtendersResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.extender.v1.ListExtendersResponse)
    ListExtendersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListExtendersResponse.class.getName());
  }
  // Use ListExtendersResponse.newBuilder() to construct.
  private ListExtendersResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListExtendersResponse() {
    extenders_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_ListExtendersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_ListExtendersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.extender.v1.ListExtendersResponse.class, com.saltoapis.nebula.extender.v1.ListExtendersResponse.Builder.class);
  }

  public static final int EXTENDERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.extender.v1.Extender> extenders_;
  /**
   * <pre>
   * The field name should match the noun `extenders` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.extender.v1.Extender> getExtendersList() {
    return extenders_;
  }
  /**
   * <pre>
   * The field name should match the noun `extenders` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.extender.v1.ExtenderOrBuilder> 
      getExtendersOrBuilderList() {
    return extenders_;
  }
  /**
   * <pre>
   * The field name should match the noun `extenders` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
   */
  @java.lang.Override
  public int getExtendersCount() {
    return extenders_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `extenders` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.Extender getExtenders(int index) {
    return extenders_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `extenders` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.ExtenderOrBuilder getExtendersOrBuilder(
      int index) {
    return extenders_.get(index);
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
    for (int i = 0; i < extenders_.size(); i++) {
      output.writeMessage(1, extenders_.get(i));
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
    for (int i = 0; i < extenders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, extenders_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.extender.v1.ListExtendersResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.extender.v1.ListExtendersResponse other = (com.saltoapis.nebula.extender.v1.ListExtendersResponse) obj;

    if (!getExtendersList()
        .equals(other.getExtendersList())) return false;
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
    if (getExtendersCount() > 0) {
      hash = (37 * hash) + EXTENDERS_FIELD_NUMBER;
      hash = (53 * hash) + getExtendersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.extender.v1.ListExtendersResponse prototype) {
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
   * The response message for [ListExtenders][salto.nebula.extender.v1.ExtenderService.ListExtenders]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.extender.v1.ListExtendersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.extender.v1.ListExtendersResponse)
      com.saltoapis.nebula.extender.v1.ListExtendersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_ListExtendersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_ListExtendersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.extender.v1.ListExtendersResponse.class, com.saltoapis.nebula.extender.v1.ListExtendersResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.extender.v1.ListExtendersResponse.newBuilder()
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
      if (extendersBuilder_ == null) {
        extenders_ = java.util.Collections.emptyList();
      } else {
        extenders_ = null;
        extendersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.internal_static_salto_nebula_extender_v1_ListExtendersResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.ListExtendersResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.extender.v1.ListExtendersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.ListExtendersResponse build() {
      com.saltoapis.nebula.extender.v1.ListExtendersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.extender.v1.ListExtendersResponse buildPartial() {
      com.saltoapis.nebula.extender.v1.ListExtendersResponse result = new com.saltoapis.nebula.extender.v1.ListExtendersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.extender.v1.ListExtendersResponse result) {
      if (extendersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          extenders_ = java.util.Collections.unmodifiableList(extenders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.extenders_ = extenders_;
      } else {
        result.extenders_ = extendersBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.extender.v1.ListExtendersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.extender.v1.ListExtendersResponse) {
        return mergeFrom((com.saltoapis.nebula.extender.v1.ListExtendersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.extender.v1.ListExtendersResponse other) {
      if (other == com.saltoapis.nebula.extender.v1.ListExtendersResponse.getDefaultInstance()) return this;
      if (extendersBuilder_ == null) {
        if (!other.extenders_.isEmpty()) {
          if (extenders_.isEmpty()) {
            extenders_ = other.extenders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExtendersIsMutable();
            extenders_.addAll(other.extenders_);
          }
          onChanged();
        }
      } else {
        if (!other.extenders_.isEmpty()) {
          if (extendersBuilder_.isEmpty()) {
            extendersBuilder_.dispose();
            extendersBuilder_ = null;
            extenders_ = other.extenders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            extendersBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getExtendersFieldBuilder() : null;
          } else {
            extendersBuilder_.addAllMessages(other.extenders_);
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
              com.saltoapis.nebula.extender.v1.Extender m =
                  input.readMessage(
                      com.saltoapis.nebula.extender.v1.Extender.parser(),
                      extensionRegistry);
              if (extendersBuilder_ == null) {
                ensureExtendersIsMutable();
                extenders_.add(m);
              } else {
                extendersBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.nebula.extender.v1.Extender> extenders_ =
      java.util.Collections.emptyList();
    private void ensureExtendersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        extenders_ = new java.util.ArrayList<com.saltoapis.nebula.extender.v1.Extender>(extenders_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.extender.v1.Extender, com.saltoapis.nebula.extender.v1.Extender.Builder, com.saltoapis.nebula.extender.v1.ExtenderOrBuilder> extendersBuilder_;

    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.extender.v1.Extender> getExtendersList() {
      if (extendersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(extenders_);
      } else {
        return extendersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public int getExtendersCount() {
      if (extendersBuilder_ == null) {
        return extenders_.size();
      } else {
        return extendersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public com.saltoapis.nebula.extender.v1.Extender getExtenders(int index) {
      if (extendersBuilder_ == null) {
        return extenders_.get(index);
      } else {
        return extendersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder setExtenders(
        int index, com.saltoapis.nebula.extender.v1.Extender value) {
      if (extendersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtendersIsMutable();
        extenders_.set(index, value);
        onChanged();
      } else {
        extendersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder setExtenders(
        int index, com.saltoapis.nebula.extender.v1.Extender.Builder builderForValue) {
      if (extendersBuilder_ == null) {
        ensureExtendersIsMutable();
        extenders_.set(index, builderForValue.build());
        onChanged();
      } else {
        extendersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder addExtenders(com.saltoapis.nebula.extender.v1.Extender value) {
      if (extendersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtendersIsMutable();
        extenders_.add(value);
        onChanged();
      } else {
        extendersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder addExtenders(
        int index, com.saltoapis.nebula.extender.v1.Extender value) {
      if (extendersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtendersIsMutable();
        extenders_.add(index, value);
        onChanged();
      } else {
        extendersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder addExtenders(
        com.saltoapis.nebula.extender.v1.Extender.Builder builderForValue) {
      if (extendersBuilder_ == null) {
        ensureExtendersIsMutable();
        extenders_.add(builderForValue.build());
        onChanged();
      } else {
        extendersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder addExtenders(
        int index, com.saltoapis.nebula.extender.v1.Extender.Builder builderForValue) {
      if (extendersBuilder_ == null) {
        ensureExtendersIsMutable();
        extenders_.add(index, builderForValue.build());
        onChanged();
      } else {
        extendersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder addAllExtenders(
        java.lang.Iterable<? extends com.saltoapis.nebula.extender.v1.Extender> values) {
      if (extendersBuilder_ == null) {
        ensureExtendersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, extenders_);
        onChanged();
      } else {
        extendersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder clearExtenders() {
      if (extendersBuilder_ == null) {
        extenders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        extendersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public Builder removeExtenders(int index) {
      if (extendersBuilder_ == null) {
        ensureExtendersIsMutable();
        extenders_.remove(index);
        onChanged();
      } else {
        extendersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public com.saltoapis.nebula.extender.v1.Extender.Builder getExtendersBuilder(
        int index) {
      return getExtendersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public com.saltoapis.nebula.extender.v1.ExtenderOrBuilder getExtendersOrBuilder(
        int index) {
      if (extendersBuilder_ == null) {
        return extenders_.get(index);  } else {
        return extendersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.extender.v1.ExtenderOrBuilder> 
         getExtendersOrBuilderList() {
      if (extendersBuilder_ != null) {
        return extendersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(extenders_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public com.saltoapis.nebula.extender.v1.Extender.Builder addExtendersBuilder() {
      return getExtendersFieldBuilder().addBuilder(
          com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public com.saltoapis.nebula.extender.v1.Extender.Builder addExtendersBuilder(
        int index) {
      return getExtendersFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `extenders` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.extender.v1.Extender extenders = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.extender.v1.Extender.Builder> 
         getExtendersBuilderList() {
      return getExtendersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.extender.v1.Extender, com.saltoapis.nebula.extender.v1.Extender.Builder, com.saltoapis.nebula.extender.v1.ExtenderOrBuilder> 
        getExtendersFieldBuilder() {
      if (extendersBuilder_ == null) {
        extendersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.extender.v1.Extender, com.saltoapis.nebula.extender.v1.Extender.Builder, com.saltoapis.nebula.extender.v1.ExtenderOrBuilder>(
                extenders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        extenders_ = null;
      }
      return extendersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.extender.v1.ListExtendersResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.extender.v1.ListExtendersResponse)
  private static final com.saltoapis.nebula.extender.v1.ListExtendersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.extender.v1.ListExtendersResponse();
  }

  public static com.saltoapis.nebula.extender.v1.ListExtendersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListExtendersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListExtendersResponse>() {
    @java.lang.Override
    public ListExtendersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListExtendersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListExtendersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.extender.v1.ListExtendersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

