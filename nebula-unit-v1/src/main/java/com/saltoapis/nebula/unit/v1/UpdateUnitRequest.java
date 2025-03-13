// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/unit/v1/unit.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.unit.v1;

/**
 * <pre>
 * The request message for [`UpdateUnit`][salto.nebula.unit.v1.UnitService.UpdateUnit]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.unit.v1.UpdateUnitRequest}
 */
public final class UpdateUnitRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.unit.v1.UpdateUnitRequest)
    UpdateUnitRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateUnitRequest.class.getName());
  }
  // Use UpdateUnitRequest.newBuilder() to construct.
  private UpdateUnitRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateUnitRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_UpdateUnitRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_UpdateUnitRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.unit.v1.UpdateUnitRequest.class, com.saltoapis.nebula.unit.v1.UpdateUnitRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UNIT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.unit.v1.Unit unit_;
  /**
   * <pre>
   * The unit resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
   * @return Whether the unit field is set.
   */
  @java.lang.Override
  public boolean hasUnit() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The unit resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
   * @return The unit.
   */
  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.Unit getUnit() {
    return unit_ == null ? com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance() : unit_;
  }
  /**
   * <pre>
   * The unit resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.UnitOrBuilder getUnitOrBuilder() {
    return unit_ == null ? com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance() : unit_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUnit());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUnit());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.saltoapis.nebula.unit.v1.UpdateUnitRequest)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.unit.v1.UpdateUnitRequest other = (com.saltoapis.nebula.unit.v1.UpdateUnitRequest) obj;

    if (hasUnit() != other.hasUnit()) return false;
    if (hasUnit()) {
      if (!getUnit()
          .equals(other.getUnit())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasUnit()) {
      hash = (37 * hash) + UNIT_FIELD_NUMBER;
      hash = (53 * hash) + getUnit().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.unit.v1.UpdateUnitRequest prototype) {
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
   * The request message for [`UpdateUnit`][salto.nebula.unit.v1.UnitService.UpdateUnit]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.unit.v1.UpdateUnitRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.unit.v1.UpdateUnitRequest)
      com.saltoapis.nebula.unit.v1.UpdateUnitRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_UpdateUnitRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_UpdateUnitRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.unit.v1.UpdateUnitRequest.class, com.saltoapis.nebula.unit.v1.UpdateUnitRequest.Builder.class);
    }

    // Construct using com.saltoapis.nebula.unit.v1.UpdateUnitRequest.newBuilder()
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
        getUnitFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      unit_ = null;
      if (unitBuilder_ != null) {
        unitBuilder_.dispose();
        unitBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.unit.v1.UnitProto.internal_static_salto_nebula_unit_v1_UpdateUnitRequest_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.UpdateUnitRequest getDefaultInstanceForType() {
      return com.saltoapis.nebula.unit.v1.UpdateUnitRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.UpdateUnitRequest build() {
      com.saltoapis.nebula.unit.v1.UpdateUnitRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.unit.v1.UpdateUnitRequest buildPartial() {
      com.saltoapis.nebula.unit.v1.UpdateUnitRequest result = new com.saltoapis.nebula.unit.v1.UpdateUnitRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.unit.v1.UpdateUnitRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.unit_ = unitBuilder_ == null
            ? unit_
            : unitBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.unit.v1.UpdateUnitRequest) {
        return mergeFrom((com.saltoapis.nebula.unit.v1.UpdateUnitRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.unit.v1.UpdateUnitRequest other) {
      if (other == com.saltoapis.nebula.unit.v1.UpdateUnitRequest.getDefaultInstance()) return this;
      if (other.hasUnit()) {
        mergeUnit(other.getUnit());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getUnitFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.saltoapis.nebula.unit.v1.Unit unit_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.unit.v1.Unit, com.saltoapis.nebula.unit.v1.Unit.Builder, com.saltoapis.nebula.unit.v1.UnitOrBuilder> unitBuilder_;
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     * @return Whether the unit field is set.
     */
    public boolean hasUnit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     * @return The unit.
     */
    public com.saltoapis.nebula.unit.v1.Unit getUnit() {
      if (unitBuilder_ == null) {
        return unit_ == null ? com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance() : unit_;
      } else {
        return unitBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    public Builder setUnit(com.saltoapis.nebula.unit.v1.Unit value) {
      if (unitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        unit_ = value;
      } else {
        unitBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    public Builder setUnit(
        com.saltoapis.nebula.unit.v1.Unit.Builder builderForValue) {
      if (unitBuilder_ == null) {
        unit_ = builderForValue.build();
      } else {
        unitBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    public Builder mergeUnit(com.saltoapis.nebula.unit.v1.Unit value) {
      if (unitBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          unit_ != null &&
          unit_ != com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()) {
          getUnitBuilder().mergeFrom(value);
        } else {
          unit_ = value;
        }
      } else {
        unitBuilder_.mergeFrom(value);
      }
      if (unit_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    public Builder clearUnit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      unit_ = null;
      if (unitBuilder_ != null) {
        unitBuilder_.dispose();
        unitBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.Unit.Builder getUnitBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUnitFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    public com.saltoapis.nebula.unit.v1.UnitOrBuilder getUnitOrBuilder() {
      if (unitBuilder_ != null) {
        return unitBuilder_.getMessageOrBuilder();
      } else {
        return unit_ == null ?
            com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance() : unit_;
      }
    }
    /**
     * <pre>
     * The unit resource which replaces the resource on the server.
     * </pre>
     *
     * <code>.salto.nebula.unit.v1.Unit unit = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.unit.v1.Unit, com.saltoapis.nebula.unit.v1.Unit.Builder, com.saltoapis.nebula.unit.v1.UnitOrBuilder> 
        getUnitFieldBuilder() {
      if (unitBuilder_ == null) {
        unitBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.unit.v1.Unit, com.saltoapis.nebula.unit.v1.Unit.Builder, com.saltoapis.nebula.unit.v1.UnitOrBuilder>(
                getUnit(),
                getParentForChildren(),
                isClean());
        unit_ = null;
      }
      return unitBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The update mask applied to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.unit.v1.UpdateUnitRequest)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.unit.v1.UpdateUnitRequest)
  private static final com.saltoapis.nebula.unit.v1.UpdateUnitRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.unit.v1.UpdateUnitRequest();
  }

  public static com.saltoapis.nebula.unit.v1.UpdateUnitRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUnitRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUnitRequest>() {
    @java.lang.Override
    public UpdateUnitRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateUnitRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUnitRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.unit.v1.UpdateUnitRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

