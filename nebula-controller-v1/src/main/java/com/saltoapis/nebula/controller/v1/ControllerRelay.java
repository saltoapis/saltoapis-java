// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

/**
 * <pre>
 * Relay represents a configurable output from a controller that can be used to control
 * external devices such as doors or other electrical systems. Relays can be
 * located on the main controller board or on extension boards, with addressing
 * determined by dipswitch settings.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.controller.v1.ControllerRelay}
 */
public final class ControllerRelay extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.controller.v1.ControllerRelay)
    ControllerRelayOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ControllerRelay.class.getName());
  }
  // Use ControllerRelay.newBuilder() to construct.
  private ControllerRelay(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ControllerRelay() {
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ControllerRelay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ControllerRelay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.controller.v1.ControllerRelay.class, com.saltoapis.nebula.controller.v1.ControllerRelay.Builder.class);
  }

  private int typeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DESTINATION_OUTPUT(4),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 4: return DESTINATION_OUTPUT;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Output only. Resource name of the controller relay. It must have the format of
   * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
   * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Resource name of the controller relay. It must have the format of
   * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
   * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELAY_ID_FIELD_NUMBER = 3;
  private int relayId_ = 0;
  /**
   * <pre>
   * Identifies the specific controller relay on the board (1-4). Board type determines
   * which controller relay IDs are actually available for configuration and use.
   * </pre>
   *
   * <code>int32 relay_id = 3;</code>
   * @return The relayId.
   */
  @java.lang.Override
  public int getRelayId() {
    return relayId_;
  }

  public static final int DESTINATION_OUTPUT_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Destination output configuration for this controller relay.
   * </pre>
   *
   * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
   * @return Whether the destinationOutput field is set.
   */
  @java.lang.Override
  public boolean hasDestinationOutput() {
    return typeCase_ == 4;
  }
  /**
   * <pre>
   * Destination output configuration for this controller relay.
   * </pre>
   *
   * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
   * @return The destinationOutput.
   */
  @java.lang.Override
  public com.saltoapis.nebula.controller.v1.DestinationOutput getDestinationOutput() {
    if (typeCase_ == 4) {
       return (com.saltoapis.nebula.controller.v1.DestinationOutput) type_;
    }
    return com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance();
  }
  /**
   * <pre>
   * Destination output configuration for this controller relay.
   * </pre>
   *
   * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.controller.v1.DestinationOutputOrBuilder getDestinationOutputOrBuilder() {
    if (typeCase_ == 4) {
       return (com.saltoapis.nebula.controller.v1.DestinationOutput) type_;
    }
    return com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance();
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (relayId_ != 0) {
      output.writeInt32(3, relayId_);
    }
    if (typeCase_ == 4) {
      output.writeMessage(4, (com.saltoapis.nebula.controller.v1.DestinationOutput) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    if (relayId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, relayId_);
    }
    if (typeCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (com.saltoapis.nebula.controller.v1.DestinationOutput) type_);
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
    if (!(obj instanceof com.saltoapis.nebula.controller.v1.ControllerRelay)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.controller.v1.ControllerRelay other = (com.saltoapis.nebula.controller.v1.ControllerRelay) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getRelayId()
        != other.getRelayId()) return false;
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 4:
        if (!getDestinationOutput()
            .equals(other.getDestinationOutput())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RELAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRelayId();
    switch (typeCase_) {
      case 4:
        hash = (37 * hash) + DESTINATION_OUTPUT_FIELD_NUMBER;
        hash = (53 * hash) + getDestinationOutput().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.controller.v1.ControllerRelay parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.controller.v1.ControllerRelay prototype) {
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
   * Relay represents a configurable output from a controller that can be used to control
   * external devices such as doors or other electrical systems. Relays can be
   * located on the main controller board or on extension boards, with addressing
   * determined by dipswitch settings.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.controller.v1.ControllerRelay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.controller.v1.ControllerRelay)
      com.saltoapis.nebula.controller.v1.ControllerRelayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ControllerRelay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ControllerRelay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.controller.v1.ControllerRelay.class, com.saltoapis.nebula.controller.v1.ControllerRelay.Builder.class);
    }

    // Construct using com.saltoapis.nebula.controller.v1.ControllerRelay.newBuilder()
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
      name_ = "";
      relayId_ = 0;
      if (destinationOutputBuilder_ != null) {
        destinationOutputBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.internal_static_salto_nebula_controller_v1_ControllerRelay_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.ControllerRelay getDefaultInstanceForType() {
      return com.saltoapis.nebula.controller.v1.ControllerRelay.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.ControllerRelay build() {
      com.saltoapis.nebula.controller.v1.ControllerRelay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.ControllerRelay buildPartial() {
      com.saltoapis.nebula.controller.v1.ControllerRelay result = new com.saltoapis.nebula.controller.v1.ControllerRelay(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.controller.v1.ControllerRelay result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relayId_ = relayId_;
      }
    }

    private void buildPartialOneofs(com.saltoapis.nebula.controller.v1.ControllerRelay result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 4 &&
          destinationOutputBuilder_ != null) {
        result.type_ = destinationOutputBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.controller.v1.ControllerRelay) {
        return mergeFrom((com.saltoapis.nebula.controller.v1.ControllerRelay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.controller.v1.ControllerRelay other) {
      if (other == com.saltoapis.nebula.controller.v1.ControllerRelay.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRelayId() != 0) {
        setRelayId(other.getRelayId());
      }
      switch (other.getTypeCase()) {
        case DESTINATION_OUTPUT: {
          mergeDestinationOutput(other.getDestinationOutput());
          break;
        }
        case TYPE_NOT_SET: {
          break;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              relayId_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getDestinationOutputFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 4;
              break;
            } // case 34
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. Resource name of the controller relay. It must have the format of
     * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
     * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Resource name of the controller relay. It must have the format of
     * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
     * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Resource name of the controller relay. It must have the format of
     * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
     * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Resource name of the controller relay. It must have the format of
     * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
     * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Resource name of the controller relay. It must have the format of
     * `installations/&#42;&#47;controllers/&#42;&#47;relays/&#42;`. For example:
     * `installations/surelock-homes-hq/controller/dancing-men/relays/first-floor`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int relayId_ ;
    /**
     * <pre>
     * Identifies the specific controller relay on the board (1-4). Board type determines
     * which controller relay IDs are actually available for configuration and use.
     * </pre>
     *
     * <code>int32 relay_id = 3;</code>
     * @return The relayId.
     */
    @java.lang.Override
    public int getRelayId() {
      return relayId_;
    }
    /**
     * <pre>
     * Identifies the specific controller relay on the board (1-4). Board type determines
     * which controller relay IDs are actually available for configuration and use.
     * </pre>
     *
     * <code>int32 relay_id = 3;</code>
     * @param value The relayId to set.
     * @return This builder for chaining.
     */
    public Builder setRelayId(int value) {

      relayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifies the specific controller relay on the board (1-4). Board type determines
     * which controller relay IDs are actually available for configuration and use.
     * </pre>
     *
     * <code>int32 relay_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelayId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      relayId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.controller.v1.DestinationOutput, com.saltoapis.nebula.controller.v1.DestinationOutput.Builder, com.saltoapis.nebula.controller.v1.DestinationOutputOrBuilder> destinationOutputBuilder_;
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     * @return Whether the destinationOutput field is set.
     */
    @java.lang.Override
    public boolean hasDestinationOutput() {
      return typeCase_ == 4;
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     * @return The destinationOutput.
     */
    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.DestinationOutput getDestinationOutput() {
      if (destinationOutputBuilder_ == null) {
        if (typeCase_ == 4) {
          return (com.saltoapis.nebula.controller.v1.DestinationOutput) type_;
        }
        return com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance();
      } else {
        if (typeCase_ == 4) {
          return destinationOutputBuilder_.getMessage();
        }
        return com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    public Builder setDestinationOutput(com.saltoapis.nebula.controller.v1.DestinationOutput value) {
      if (destinationOutputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        destinationOutputBuilder_.setMessage(value);
      }
      typeCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    public Builder setDestinationOutput(
        com.saltoapis.nebula.controller.v1.DestinationOutput.Builder builderForValue) {
      if (destinationOutputBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        destinationOutputBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    public Builder mergeDestinationOutput(com.saltoapis.nebula.controller.v1.DestinationOutput value) {
      if (destinationOutputBuilder_ == null) {
        if (typeCase_ == 4 &&
            type_ != com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance()) {
          type_ = com.saltoapis.nebula.controller.v1.DestinationOutput.newBuilder((com.saltoapis.nebula.controller.v1.DestinationOutput) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 4) {
          destinationOutputBuilder_.mergeFrom(value);
        } else {
          destinationOutputBuilder_.setMessage(value);
        }
      }
      typeCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    public Builder clearDestinationOutput() {
      if (destinationOutputBuilder_ == null) {
        if (typeCase_ == 4) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 4) {
          typeCase_ = 0;
          type_ = null;
        }
        destinationOutputBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    public com.saltoapis.nebula.controller.v1.DestinationOutput.Builder getDestinationOutputBuilder() {
      return getDestinationOutputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.controller.v1.DestinationOutputOrBuilder getDestinationOutputOrBuilder() {
      if ((typeCase_ == 4) && (destinationOutputBuilder_ != null)) {
        return destinationOutputBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 4) {
          return (com.saltoapis.nebula.controller.v1.DestinationOutput) type_;
        }
        return com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Destination output configuration for this controller relay.
     * </pre>
     *
     * <code>.salto.nebula.controller.v1.DestinationOutput destination_output = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.controller.v1.DestinationOutput, com.saltoapis.nebula.controller.v1.DestinationOutput.Builder, com.saltoapis.nebula.controller.v1.DestinationOutputOrBuilder> 
        getDestinationOutputFieldBuilder() {
      if (destinationOutputBuilder_ == null) {
        if (!(typeCase_ == 4)) {
          type_ = com.saltoapis.nebula.controller.v1.DestinationOutput.getDefaultInstance();
        }
        destinationOutputBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.controller.v1.DestinationOutput, com.saltoapis.nebula.controller.v1.DestinationOutput.Builder, com.saltoapis.nebula.controller.v1.DestinationOutputOrBuilder>(
                (com.saltoapis.nebula.controller.v1.DestinationOutput) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 4;
      onChanged();
      return destinationOutputBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.controller.v1.ControllerRelay)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.controller.v1.ControllerRelay)
  private static final com.saltoapis.nebula.controller.v1.ControllerRelay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.controller.v1.ControllerRelay();
  }

  public static com.saltoapis.nebula.controller.v1.ControllerRelay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ControllerRelay>
      PARSER = new com.google.protobuf.AbstractParser<ControllerRelay>() {
    @java.lang.Override
    public ControllerRelay parsePartialFrom(
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

  public static com.google.protobuf.Parser<ControllerRelay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControllerRelay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.controller.v1.ControllerRelay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

