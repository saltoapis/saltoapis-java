// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

/**
 * <pre>
 * The response message for [ListControllers][salto.nebula.controllers.v1.ControllerService.ListControllers]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.controller.v1.ListControllersResponse}
 */
public final class ListControllersResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.controller.v1.ListControllersResponse)
    ListControllersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListControllersResponse.class.getName());
  }
  // Use ListControllersResponse.newBuilder() to construct.
  private ListControllersResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListControllersResponse() {
    controllers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ListControllersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ListControllersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.controller.v1.ListControllersResponse.class, com.saltoapis.nebula.controller.v1.ListControllersResponse.Builder.class);
  }

  public static final int CONTROLLERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.controller.v1.Controller> controllers_;
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.controller.v1.Controller> getControllersList() {
    return controllers_;
  }
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.controller.v1.ControllerOrBuilder> 
      getControllersOrBuilderList() {
    return controllers_;
  }
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  @java.lang.Override
  public int getControllersCount() {
    return controllers_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.controller.v1.Controller getControllers(int index) {
    return controllers_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.controller.v1.ControllerOrBuilder getControllersOrBuilder(
      int index) {
    return controllers_.get(index);
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
    for (int i = 0; i < controllers_.size(); i++) {
      output.writeMessage(1, controllers_.get(i));
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
    for (int i = 0; i < controllers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, controllers_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.controller.v1.ListControllersResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.controller.v1.ListControllersResponse other = (com.saltoapis.nebula.controller.v1.ListControllersResponse) obj;

    if (!getControllersList()
        .equals(other.getControllersList())) return false;
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
    if (getControllersCount() > 0) {
      hash = (37 * hash) + CONTROLLERS_FIELD_NUMBER;
      hash = (53 * hash) + getControllersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.controller.v1.ListControllersResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.controller.v1.ListControllersResponse prototype) {
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
   * The response message for [ListControllers][salto.nebula.controllers.v1.ControllerService.ListControllers]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.controller.v1.ListControllersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.controller.v1.ListControllersResponse)
      com.saltoapis.nebula.controller.v1.ListControllersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ListControllersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ListControllersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.controller.v1.ListControllersResponse.class, com.saltoapis.nebula.controller.v1.ListControllersResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.controller.v1.ListControllersResponse.newBuilder()
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
      if (controllersBuilder_ == null) {
        controllers_ = java.util.Collections.emptyList();
      } else {
        controllers_ = null;
        controllersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ListControllersResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.ListControllersResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.controller.v1.ListControllersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.ListControllersResponse build() {
      com.saltoapis.nebula.controller.v1.ListControllersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.ListControllersResponse buildPartial() {
      com.saltoapis.nebula.controller.v1.ListControllersResponse result = new com.saltoapis.nebula.controller.v1.ListControllersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.controller.v1.ListControllersResponse result) {
      if (controllersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          controllers_ = java.util.Collections.unmodifiableList(controllers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.controllers_ = controllers_;
      } else {
        result.controllers_ = controllersBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.controller.v1.ListControllersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.controller.v1.ListControllersResponse) {
        return mergeFrom((com.saltoapis.nebula.controller.v1.ListControllersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.controller.v1.ListControllersResponse other) {
      if (other == com.saltoapis.nebula.controller.v1.ListControllersResponse.getDefaultInstance()) return this;
      if (controllersBuilder_ == null) {
        if (!other.controllers_.isEmpty()) {
          if (controllers_.isEmpty()) {
            controllers_ = other.controllers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureControllersIsMutable();
            controllers_.addAll(other.controllers_);
          }
          onChanged();
        }
      } else {
        if (!other.controllers_.isEmpty()) {
          if (controllersBuilder_.isEmpty()) {
            controllersBuilder_.dispose();
            controllersBuilder_ = null;
            controllers_ = other.controllers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            controllersBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getControllersFieldBuilder() : null;
          } else {
            controllersBuilder_.addAllMessages(other.controllers_);
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
              com.saltoapis.nebula.controller.v1.Controller m =
                  input.readMessage(
                      com.saltoapis.nebula.controller.v1.Controller.parser(),
                      extensionRegistry);
              if (controllersBuilder_ == null) {
                ensureControllersIsMutable();
                controllers_.add(m);
              } else {
                controllersBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.nebula.controller.v1.Controller> controllers_ =
      java.util.Collections.emptyList();
    private void ensureControllersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        controllers_ = new java.util.ArrayList<com.saltoapis.nebula.controller.v1.Controller>(controllers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.controller.v1.Controller, com.saltoapis.nebula.controller.v1.Controller.Builder, com.saltoapis.nebula.controller.v1.ControllerOrBuilder> controllersBuilder_;

    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.controller.v1.Controller> getControllersList() {
      if (controllersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(controllers_);
      } else {
        return controllersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public int getControllersCount() {
      if (controllersBuilder_ == null) {
        return controllers_.size();
      } else {
        return controllersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public com.saltoapis.nebula.controller.v1.Controller getControllers(int index) {
      if (controllersBuilder_ == null) {
        return controllers_.get(index);
      } else {
        return controllersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder setControllers(
        int index, com.saltoapis.nebula.controller.v1.Controller value) {
      if (controllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllersIsMutable();
        controllers_.set(index, value);
        onChanged();
      } else {
        controllersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder setControllers(
        int index, com.saltoapis.nebula.controller.v1.Controller.Builder builderForValue) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.set(index, builderForValue.build());
        onChanged();
      } else {
        controllersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder addControllers(com.saltoapis.nebula.controller.v1.Controller value) {
      if (controllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllersIsMutable();
        controllers_.add(value);
        onChanged();
      } else {
        controllersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder addControllers(
        int index, com.saltoapis.nebula.controller.v1.Controller value) {
      if (controllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllersIsMutable();
        controllers_.add(index, value);
        onChanged();
      } else {
        controllersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder addControllers(
        com.saltoapis.nebula.controller.v1.Controller.Builder builderForValue) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.add(builderForValue.build());
        onChanged();
      } else {
        controllersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder addControllers(
        int index, com.saltoapis.nebula.controller.v1.Controller.Builder builderForValue) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.add(index, builderForValue.build());
        onChanged();
      } else {
        controllersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder addAllControllers(
        java.lang.Iterable<? extends com.saltoapis.nebula.controller.v1.Controller> values) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, controllers_);
        onChanged();
      } else {
        controllersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder clearControllers() {
      if (controllersBuilder_ == null) {
        controllers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        controllersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public Builder removeControllers(int index) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.remove(index);
        onChanged();
      } else {
        controllersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public com.saltoapis.nebula.controller.v1.Controller.Builder getControllersBuilder(
        int index) {
      return getControllersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public com.saltoapis.nebula.controller.v1.ControllerOrBuilder getControllersOrBuilder(
        int index) {
      if (controllersBuilder_ == null) {
        return controllers_.get(index);  } else {
        return controllersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.controller.v1.ControllerOrBuilder> 
         getControllersOrBuilderList() {
      if (controllersBuilder_ != null) {
        return controllersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(controllers_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public com.saltoapis.nebula.controller.v1.Controller.Builder addControllersBuilder() {
      return getControllersFieldBuilder().addBuilder(
          com.saltoapis.nebula.controller.v1.Controller.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public com.saltoapis.nebula.controller.v1.Controller.Builder addControllersBuilder(
        int index) {
      return getControllersFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.controller.v1.Controller.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `controllers` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.controller.v1.Controller.Builder> 
         getControllersBuilderList() {
      return getControllersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.controller.v1.Controller, com.saltoapis.nebula.controller.v1.Controller.Builder, com.saltoapis.nebula.controller.v1.ControllerOrBuilder> 
        getControllersFieldBuilder() {
      if (controllersBuilder_ == null) {
        controllersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.controller.v1.Controller, com.saltoapis.nebula.controller.v1.Controller.Builder, com.saltoapis.nebula.controller.v1.ControllerOrBuilder>(
                controllers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        controllers_ = null;
      }
      return controllersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.controller.v1.ListControllersResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.controller.v1.ListControllersResponse)
  private static final com.saltoapis.nebula.controller.v1.ListControllersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.controller.v1.ListControllersResponse();
  }

  public static com.saltoapis.nebula.controller.v1.ListControllersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListControllersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListControllersResponse>() {
    @java.lang.Override
    public ListControllersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListControllersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListControllersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.controller.v1.ListControllersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

