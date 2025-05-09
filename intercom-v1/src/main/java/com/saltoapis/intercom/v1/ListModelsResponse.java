// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/intercom/v1/intercom.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.intercom.v1;

/**
 * <pre>
 * The request message for [`ListModels`][salto.intercom.v1.IntercomService.ListModels]
 * </pre>
 *
 * Protobuf type {@code salto.intercom.v1.ListModelsResponse}
 */
public final class ListModelsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.intercom.v1.ListModelsResponse)
    ListModelsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListModelsResponse.class.getName());
  }
  // Use ListModelsResponse.newBuilder() to construct.
  private ListModelsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListModelsResponse() {
    models_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_ListModelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_ListModelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.intercom.v1.ListModelsResponse.class, com.saltoapis.intercom.v1.ListModelsResponse.Builder.class);
  }

  public static final int MODELS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.intercom.v1.Model> models_;
  /**
   * <pre>
   * The field name should match the noun `models` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.intercom.v1.Model models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.intercom.v1.Model> getModelsList() {
    return models_;
  }
  /**
   * <pre>
   * The field name should match the noun `models` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.intercom.v1.Model models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.intercom.v1.ModelOrBuilder> 
      getModelsOrBuilderList() {
    return models_;
  }
  /**
   * <pre>
   * The field name should match the noun `models` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.intercom.v1.Model models = 1;</code>
   */
  @java.lang.Override
  public int getModelsCount() {
    return models_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `models` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.intercom.v1.Model models = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.intercom.v1.Model getModels(int index) {
    return models_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `models` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.intercom.v1.Model models = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.intercom.v1.ModelOrBuilder getModelsOrBuilder(
      int index) {
    return models_.get(index);
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
    for (int i = 0; i < models_.size(); i++) {
      output.writeMessage(1, models_.get(i));
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
    for (int i = 0; i < models_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, models_.get(i));
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
    if (!(obj instanceof com.saltoapis.intercom.v1.ListModelsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.intercom.v1.ListModelsResponse other = (com.saltoapis.intercom.v1.ListModelsResponse) obj;

    if (!getModelsList()
        .equals(other.getModelsList())) return false;
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
    if (getModelsCount() > 0) {
      hash = (37 * hash) + MODELS_FIELD_NUMBER;
      hash = (53 * hash) + getModelsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.intercom.v1.ListModelsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.intercom.v1.ListModelsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.intercom.v1.ListModelsResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.intercom.v1.ListModelsResponse prototype) {
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
   * The request message for [`ListModels`][salto.intercom.v1.IntercomService.ListModels]
   * </pre>
   *
   * Protobuf type {@code salto.intercom.v1.ListModelsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.intercom.v1.ListModelsResponse)
      com.saltoapis.intercom.v1.ListModelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_ListModelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_ListModelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.intercom.v1.ListModelsResponse.class, com.saltoapis.intercom.v1.ListModelsResponse.Builder.class);
    }

    // Construct using com.saltoapis.intercom.v1.ListModelsResponse.newBuilder()
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
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
      } else {
        models_ = null;
        modelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.intercom.v1.IntercomProto.internal_static_salto_intercom_v1_ListModelsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.intercom.v1.ListModelsResponse getDefaultInstanceForType() {
      return com.saltoapis.intercom.v1.ListModelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.intercom.v1.ListModelsResponse build() {
      com.saltoapis.intercom.v1.ListModelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.intercom.v1.ListModelsResponse buildPartial() {
      com.saltoapis.intercom.v1.ListModelsResponse result = new com.saltoapis.intercom.v1.ListModelsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.intercom.v1.ListModelsResponse result) {
      if (modelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          models_ = java.util.Collections.unmodifiableList(models_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.models_ = models_;
      } else {
        result.models_ = modelsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.intercom.v1.ListModelsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.intercom.v1.ListModelsResponse) {
        return mergeFrom((com.saltoapis.intercom.v1.ListModelsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.intercom.v1.ListModelsResponse other) {
      if (other == com.saltoapis.intercom.v1.ListModelsResponse.getDefaultInstance()) return this;
      if (modelsBuilder_ == null) {
        if (!other.models_.isEmpty()) {
          if (models_.isEmpty()) {
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelsIsMutable();
            models_.addAll(other.models_);
          }
          onChanged();
        }
      } else {
        if (!other.models_.isEmpty()) {
          if (modelsBuilder_.isEmpty()) {
            modelsBuilder_.dispose();
            modelsBuilder_ = null;
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getModelsFieldBuilder() : null;
          } else {
            modelsBuilder_.addAllMessages(other.models_);
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
              com.saltoapis.intercom.v1.Model m =
                  input.readMessage(
                      com.saltoapis.intercom.v1.Model.parser(),
                      extensionRegistry);
              if (modelsBuilder_ == null) {
                ensureModelsIsMutable();
                models_.add(m);
              } else {
                modelsBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.intercom.v1.Model> models_ =
      java.util.Collections.emptyList();
    private void ensureModelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        models_ = new java.util.ArrayList<com.saltoapis.intercom.v1.Model>(models_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.intercom.v1.Model, com.saltoapis.intercom.v1.Model.Builder, com.saltoapis.intercom.v1.ModelOrBuilder> modelsBuilder_;

    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public java.util.List<com.saltoapis.intercom.v1.Model> getModelsList() {
      if (modelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(models_);
      } else {
        return modelsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public int getModelsCount() {
      if (modelsBuilder_ == null) {
        return models_.size();
      } else {
        return modelsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public com.saltoapis.intercom.v1.Model getModels(int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);
      } else {
        return modelsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder setModels(
        int index, com.saltoapis.intercom.v1.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.set(index, value);
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder setModels(
        int index, com.saltoapis.intercom.v1.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder addModels(com.saltoapis.intercom.v1.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder addModels(
        int index, com.saltoapis.intercom.v1.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(index, value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder addModels(
        com.saltoapis.intercom.v1.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder addModels(
        int index, com.saltoapis.intercom.v1.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder addAllModels(
        java.lang.Iterable<? extends com.saltoapis.intercom.v1.Model> values) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, models_);
        onChanged();
      } else {
        modelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder clearModels() {
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public Builder removeModels(int index) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.remove(index);
        onChanged();
      } else {
        modelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public com.saltoapis.intercom.v1.Model.Builder getModelsBuilder(
        int index) {
      return getModelsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public com.saltoapis.intercom.v1.ModelOrBuilder getModelsOrBuilder(
        int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);  } else {
        return modelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.intercom.v1.ModelOrBuilder> 
         getModelsOrBuilderList() {
      if (modelsBuilder_ != null) {
        return modelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(models_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public com.saltoapis.intercom.v1.Model.Builder addModelsBuilder() {
      return getModelsFieldBuilder().addBuilder(
          com.saltoapis.intercom.v1.Model.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public com.saltoapis.intercom.v1.Model.Builder addModelsBuilder(
        int index) {
      return getModelsFieldBuilder().addBuilder(
          index, com.saltoapis.intercom.v1.Model.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `models` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.intercom.v1.Model models = 1;</code>
     */
    public java.util.List<com.saltoapis.intercom.v1.Model.Builder> 
         getModelsBuilderList() {
      return getModelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.intercom.v1.Model, com.saltoapis.intercom.v1.Model.Builder, com.saltoapis.intercom.v1.ModelOrBuilder> 
        getModelsFieldBuilder() {
      if (modelsBuilder_ == null) {
        modelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.intercom.v1.Model, com.saltoapis.intercom.v1.Model.Builder, com.saltoapis.intercom.v1.ModelOrBuilder>(
                models_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        models_ = null;
      }
      return modelsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:salto.intercom.v1.ListModelsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.intercom.v1.ListModelsResponse)
  private static final com.saltoapis.intercom.v1.ListModelsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.intercom.v1.ListModelsResponse();
  }

  public static com.saltoapis.intercom.v1.ListModelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListModelsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListModelsResponse>() {
    @java.lang.Override
    public ListModelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListModelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListModelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.intercom.v1.ListModelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

