// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/device/v1/device.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.device.v1;

/**
 * <pre>
 * The response message for [ListDevices][salto.nebula.device.v1.DeviceService.ListDevices]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.device.v1.ListDevicesResponse}
 */
public final class ListDevicesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.device.v1.ListDevicesResponse)
    ListDevicesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListDevicesResponse.class.getName());
  }
  // Use ListDevicesResponse.newBuilder() to construct.
  private ListDevicesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListDevicesResponse() {
    devices_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.device.v1.DeviceProto.internal_static_salto_nebula_device_v1_ListDevicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.device.v1.DeviceProto.internal_static_salto_nebula_device_v1_ListDevicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.device.v1.ListDevicesResponse.class, com.saltoapis.nebula.device.v1.ListDevicesResponse.Builder.class);
  }

  public static final int DEVICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.device.v1.Device> devices_;
  /**
   * <pre>
   * The field name should match the noun `devices` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.device.v1.Device> getDevicesList() {
    return devices_;
  }
  /**
   * <pre>
   * The field name should match the noun `devices` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.device.v1.DeviceOrBuilder> 
      getDevicesOrBuilderList() {
    return devices_;
  }
  /**
   * <pre>
   * The field name should match the noun `devices` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
   */
  @java.lang.Override
  public int getDevicesCount() {
    return devices_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `devices` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.device.v1.Device getDevices(int index) {
    return devices_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `devices` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.device.v1.DeviceOrBuilder getDevicesOrBuilder(
      int index) {
    return devices_.get(index);
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

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_ = 0;
  /**
   * <pre>
   * The total number of devices in all pages, irrespective of any pagination.
   * This is an estimated number based on the requested filter, and it may change in
   * subsequent pages.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
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
    for (int i = 0; i < devices_.size(); i++) {
      output.writeMessage(1, devices_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, devices_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.saltoapis.nebula.device.v1.ListDevicesResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.device.v1.ListDevicesResponse other = (com.saltoapis.nebula.device.v1.ListDevicesResponse) obj;

    if (!getDevicesList()
        .equals(other.getDevicesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
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
    if (getDevicesCount() > 0) {
      hash = (37 * hash) + DEVICES_FIELD_NUMBER;
      hash = (53 * hash) + getDevicesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.device.v1.ListDevicesResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.device.v1.ListDevicesResponse prototype) {
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
   * The response message for [ListDevices][salto.nebula.device.v1.DeviceService.ListDevices]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.device.v1.ListDevicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.device.v1.ListDevicesResponse)
      com.saltoapis.nebula.device.v1.ListDevicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.device.v1.DeviceProto.internal_static_salto_nebula_device_v1_ListDevicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.device.v1.DeviceProto.internal_static_salto_nebula_device_v1_ListDevicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.device.v1.ListDevicesResponse.class, com.saltoapis.nebula.device.v1.ListDevicesResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.device.v1.ListDevicesResponse.newBuilder()
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
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
      } else {
        devices_ = null;
        devicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      totalSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.device.v1.DeviceProto.internal_static_salto_nebula_device_v1_ListDevicesResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.device.v1.ListDevicesResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.device.v1.ListDevicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.device.v1.ListDevicesResponse build() {
      com.saltoapis.nebula.device.v1.ListDevicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.device.v1.ListDevicesResponse buildPartial() {
      com.saltoapis.nebula.device.v1.ListDevicesResponse result = new com.saltoapis.nebula.device.v1.ListDevicesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.device.v1.ListDevicesResponse result) {
      if (devicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          devices_ = java.util.Collections.unmodifiableList(devices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devices_ = devices_;
      } else {
        result.devices_ = devicesBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.device.v1.ListDevicesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalSize_ = totalSize_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.device.v1.ListDevicesResponse) {
        return mergeFrom((com.saltoapis.nebula.device.v1.ListDevicesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.device.v1.ListDevicesResponse other) {
      if (other == com.saltoapis.nebula.device.v1.ListDevicesResponse.getDefaultInstance()) return this;
      if (devicesBuilder_ == null) {
        if (!other.devices_.isEmpty()) {
          if (devices_.isEmpty()) {
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevicesIsMutable();
            devices_.addAll(other.devices_);
          }
          onChanged();
        }
      } else {
        if (!other.devices_.isEmpty()) {
          if (devicesBuilder_.isEmpty()) {
            devicesBuilder_.dispose();
            devicesBuilder_ = null;
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devicesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getDevicesFieldBuilder() : null;
          } else {
            devicesBuilder_.addAllMessages(other.devices_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
              com.saltoapis.nebula.device.v1.Device m =
                  input.readMessage(
                      com.saltoapis.nebula.device.v1.Device.parser(),
                      extensionRegistry);
              if (devicesBuilder_ == null) {
                ensureDevicesIsMutable();
                devices_.add(m);
              } else {
                devicesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              totalSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.util.List<com.saltoapis.nebula.device.v1.Device> devices_ =
      java.util.Collections.emptyList();
    private void ensureDevicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        devices_ = new java.util.ArrayList<com.saltoapis.nebula.device.v1.Device>(devices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.device.v1.Device, com.saltoapis.nebula.device.v1.Device.Builder, com.saltoapis.nebula.device.v1.DeviceOrBuilder> devicesBuilder_;

    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.device.v1.Device> getDevicesList() {
      if (devicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devices_);
      } else {
        return devicesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public int getDevicesCount() {
      if (devicesBuilder_ == null) {
        return devices_.size();
      } else {
        return devicesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public com.saltoapis.nebula.device.v1.Device getDevices(int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);
      } else {
        return devicesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder setDevices(
        int index, com.saltoapis.nebula.device.v1.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.set(index, value);
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder setDevices(
        int index, com.saltoapis.nebula.device.v1.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.set(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder addDevices(com.saltoapis.nebula.device.v1.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder addDevices(
        int index, com.saltoapis.nebula.device.v1.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(index, value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder addDevices(
        com.saltoapis.nebula.device.v1.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder addDevices(
        int index, com.saltoapis.nebula.device.v1.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder addAllDevices(
        java.lang.Iterable<? extends com.saltoapis.nebula.device.v1.Device> values) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devices_);
        onChanged();
      } else {
        devicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder clearDevices() {
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public Builder removeDevices(int index) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.remove(index);
        onChanged();
      } else {
        devicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public com.saltoapis.nebula.device.v1.Device.Builder getDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public com.saltoapis.nebula.device.v1.DeviceOrBuilder getDevicesOrBuilder(
        int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);  } else {
        return devicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.device.v1.DeviceOrBuilder> 
         getDevicesOrBuilderList() {
      if (devicesBuilder_ != null) {
        return devicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devices_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public com.saltoapis.nebula.device.v1.Device.Builder addDevicesBuilder() {
      return getDevicesFieldBuilder().addBuilder(
          com.saltoapis.nebula.device.v1.Device.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public com.saltoapis.nebula.device.v1.Device.Builder addDevicesBuilder(
        int index) {
      return getDevicesFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.device.v1.Device.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `devices` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.device.v1.Device devices = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.device.v1.Device.Builder> 
         getDevicesBuilderList() {
      return getDevicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.device.v1.Device, com.saltoapis.nebula.device.v1.Device.Builder, com.saltoapis.nebula.device.v1.DeviceOrBuilder> 
        getDevicesFieldBuilder() {
      if (devicesBuilder_ == null) {
        devicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.device.v1.Device, com.saltoapis.nebula.device.v1.Device.Builder, com.saltoapis.nebula.device.v1.DeviceOrBuilder>(
                devices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        devices_ = null;
      }
      return devicesBuilder_;
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

    private int totalSize_ ;
    /**
     * <pre>
     * The total number of devices in all pages, irrespective of any pagination.
     * This is an estimated number based on the requested filter, and it may change in
     * subsequent pages.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <pre>
     * The total number of devices in all pages, irrespective of any pagination.
     * This is an estimated number based on the requested filter, and it may change in
     * subsequent pages.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {

      totalSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of devices in all pages, irrespective of any pagination.
     * This is an estimated number based on the requested filter, and it may change in
     * subsequent pages.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalSize_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.device.v1.ListDevicesResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.device.v1.ListDevicesResponse)
  private static final com.saltoapis.nebula.device.v1.ListDevicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.device.v1.ListDevicesResponse();
  }

  public static com.saltoapis.nebula.device.v1.ListDevicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDevicesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDevicesResponse>() {
    @java.lang.Override
    public ListDevicesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDevicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDevicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.device.v1.ListDevicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

