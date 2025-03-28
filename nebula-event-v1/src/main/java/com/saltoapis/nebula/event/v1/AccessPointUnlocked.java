// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/types.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

/**
 * <pre>
 * Event representing the unlocking of an access point.
 * </pre>
 *
 * Protobuf type {@code salto.nebula.event.v1.AccessPointUnlocked}
 */
public final class AccessPointUnlocked extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.event.v1.AccessPointUnlocked)
    AccessPointUnlockedOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      AccessPointUnlocked.class.getName());
  }
  // Use AccessPointUnlocked.newBuilder() to construct.
  private AccessPointUnlocked(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccessPointUnlocked() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointUnlocked_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointUnlocked_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.event.v1.AccessPointUnlocked.class, com.saltoapis.nebula.event.v1.AccessPointUnlocked.Builder.class);
  }

  private int bitField0_;
  private int credentialCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object credential_;
  public enum CredentialCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EMERGENCY_KEY(3),
    CREDENTIAL_NOT_SET(0);
    private final int value;
    private CredentialCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CredentialCase valueOf(int value) {
      return forNumber(value);
    }

    public static CredentialCase forNumber(int value) {
      switch (value) {
        case 3: return EMERGENCY_KEY;
        case 0: return CREDENTIAL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CredentialCase
  getCredentialCase() {
    return CredentialCase.forNumber(
        credentialCase_);
  }

  public static final int ACCESS_POINT_FIELD_NUMBER = 1;
  private com.saltoapis.nebula.accesspoint.v1.AccessPoint accessPoint_;
  /**
   * <pre>
   * The access point that's been unlocked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return Whether the accessPoint field is set.
   */
  @java.lang.Override
  public boolean hasAccessPoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The access point that's been unlocked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return The accessPoint.
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint() {
    return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
  }
  /**
   * <pre>
   * The access point that's been unlocked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder() {
    return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
  }

  public static final int USER_FIELD_NUMBER = 2;
  private com.saltoapis.nebula.user.v1.User user_;
  /**
   * <pre>
   * The user who unlocked the access point, if any.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The user who unlocked the access point, if any.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   * @return The user.
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.User getUser() {
    return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * The user who unlocked the access point, if any.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
  }

  public static final int EMERGENCY_KEY_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The emergency key used to unlock the access point.
   * </pre>
   *
   * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
   * @return Whether the emergencyKey field is set.
   */
  @java.lang.Override
  public boolean hasEmergencyKey() {
    return credentialCase_ == 3;
  }
  /**
   * <pre>
   * The emergency key used to unlock the access point.
   * </pre>
   *
   * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
   * @return The emergencyKey.
   */
  @java.lang.Override
  public com.salto.nebula.emergencykey.v1.EmergencyKey getEmergencyKey() {
    if (credentialCase_ == 3) {
       return (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_;
    }
    return com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance();
  }
  /**
   * <pre>
   * The emergency key used to unlock the access point.
   * </pre>
   *
   * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
   */
  @java.lang.Override
  public com.salto.nebula.emergencykey.v1.EmergencyKeyOrBuilder getEmergencyKeyOrBuilder() {
    if (credentialCase_ == 3) {
       return (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_;
    }
    return com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance();
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
      output.writeMessage(1, getAccessPoint());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUser());
    }
    if (credentialCase_ == 3) {
      output.writeMessage(3, (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_);
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
        .computeMessageSize(1, getAccessPoint());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUser());
    }
    if (credentialCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_);
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
    if (!(obj instanceof com.saltoapis.nebula.event.v1.AccessPointUnlocked)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.event.v1.AccessPointUnlocked other = (com.saltoapis.nebula.event.v1.AccessPointUnlocked) obj;

    if (hasAccessPoint() != other.hasAccessPoint()) return false;
    if (hasAccessPoint()) {
      if (!getAccessPoint()
          .equals(other.getAccessPoint())) return false;
    }
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getCredentialCase().equals(other.getCredentialCase())) return false;
    switch (credentialCase_) {
      case 3:
        if (!getEmergencyKey()
            .equals(other.getEmergencyKey())) return false;
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
    if (hasAccessPoint()) {
      hash = (37 * hash) + ACCESS_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getAccessPoint().hashCode();
    }
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    switch (credentialCase_) {
      case 3:
        hash = (37 * hash) + EMERGENCY_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getEmergencyKey().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.event.v1.AccessPointUnlocked prototype) {
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
   * Event representing the unlocking of an access point.
   * </pre>
   *
   * Protobuf type {@code salto.nebula.event.v1.AccessPointUnlocked}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.event.v1.AccessPointUnlocked)
      com.saltoapis.nebula.event.v1.AccessPointUnlockedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointUnlocked_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointUnlocked_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.event.v1.AccessPointUnlocked.class, com.saltoapis.nebula.event.v1.AccessPointUnlocked.Builder.class);
    }

    // Construct using com.saltoapis.nebula.event.v1.AccessPointUnlocked.newBuilder()
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
        getAccessPointFieldBuilder();
        getUserFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessPoint_ = null;
      if (accessPointBuilder_ != null) {
        accessPointBuilder_.dispose();
        accessPointBuilder_ = null;
      }
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      if (emergencyKeyBuilder_ != null) {
        emergencyKeyBuilder_.clear();
      }
      credentialCase_ = 0;
      credential_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.event.v1.TypesProto.internal_static_salto_nebula_event_v1_AccessPointUnlocked_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessPointUnlocked getDefaultInstanceForType() {
      return com.saltoapis.nebula.event.v1.AccessPointUnlocked.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessPointUnlocked build() {
      com.saltoapis.nebula.event.v1.AccessPointUnlocked result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.event.v1.AccessPointUnlocked buildPartial() {
      com.saltoapis.nebula.event.v1.AccessPointUnlocked result = new com.saltoapis.nebula.event.v1.AccessPointUnlocked(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.saltoapis.nebula.event.v1.AccessPointUnlocked result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessPoint_ = accessPointBuilder_ == null
            ? accessPoint_
            : accessPointBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.saltoapis.nebula.event.v1.AccessPointUnlocked result) {
      result.credentialCase_ = credentialCase_;
      result.credential_ = this.credential_;
      if (credentialCase_ == 3 &&
          emergencyKeyBuilder_ != null) {
        result.credential_ = emergencyKeyBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.event.v1.AccessPointUnlocked) {
        return mergeFrom((com.saltoapis.nebula.event.v1.AccessPointUnlocked)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.event.v1.AccessPointUnlocked other) {
      if (other == com.saltoapis.nebula.event.v1.AccessPointUnlocked.getDefaultInstance()) return this;
      if (other.hasAccessPoint()) {
        mergeAccessPoint(other.getAccessPoint());
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      switch (other.getCredentialCase()) {
        case EMERGENCY_KEY: {
          mergeEmergencyKey(other.getEmergencyKey());
          break;
        }
        case CREDENTIAL_NOT_SET: {
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
              input.readMessage(
                  getAccessPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEmergencyKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              credentialCase_ = 3;
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
    private int credentialCase_ = 0;
    private java.lang.Object credential_;
    public CredentialCase
        getCredentialCase() {
      return CredentialCase.forNumber(
          credentialCase_);
    }

    public Builder clearCredential() {
      credentialCase_ = 0;
      credential_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.saltoapis.nebula.accesspoint.v1.AccessPoint accessPoint_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspoint.v1.AccessPoint, com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder, com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder> accessPointBuilder_;
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     * @return Whether the accessPoint field is set.
     */
    public boolean hasAccessPoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     * @return The accessPoint.
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint() {
      if (accessPointBuilder_ == null) {
        return accessPoint_ == null ? com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
      } else {
        return accessPointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder setAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
      if (accessPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessPoint_ = value;
      } else {
        accessPointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder setAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder builderForValue) {
      if (accessPointBuilder_ == null) {
        accessPoint_ = builderForValue.build();
      } else {
        accessPointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder mergeAccessPoint(com.saltoapis.nebula.accesspoint.v1.AccessPoint value) {
      if (accessPointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          accessPoint_ != null &&
          accessPoint_ != com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance()) {
          getAccessPointBuilder().mergeFrom(value);
        } else {
          accessPoint_ = value;
        }
      } else {
        accessPointBuilder_.mergeFrom(value);
      }
      if (accessPoint_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public Builder clearAccessPoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessPoint_ = null;
      if (accessPointBuilder_ != null) {
        accessPointBuilder_.dispose();
        accessPointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder getAccessPointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessPointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder() {
      if (accessPointBuilder_ != null) {
        return accessPointBuilder_.getMessageOrBuilder();
      } else {
        return accessPoint_ == null ?
            com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance() : accessPoint_;
      }
    }
    /**
     * <pre>
     * The access point that's been unlocked.
     * </pre>
     *
     * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.accesspoint.v1.AccessPoint, com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder, com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder> 
        getAccessPointFieldBuilder() {
      if (accessPointBuilder_ == null) {
        accessPointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.accesspoint.v1.AccessPoint, com.saltoapis.nebula.accesspoint.v1.AccessPoint.Builder, com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder>(
                getAccessPoint(),
                getParentForChildren(),
                isClean());
        accessPoint_ = null;
      }
      return accessPointBuilder_;
    }

    private com.saltoapis.nebula.user.v1.User user_;
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.User, com.saltoapis.nebula.user.v1.User.Builder, com.saltoapis.nebula.user.v1.UserOrBuilder> userBuilder_;
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     * @return The user.
     */
    public com.saltoapis.nebula.user.v1.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder setUser(com.saltoapis.nebula.user.v1.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder setUser(
        com.saltoapis.nebula.user.v1.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder mergeUser(com.saltoapis.nebula.user.v1.User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          user_ != null &&
          user_ != com.saltoapis.nebula.user.v1.User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000002);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public com.saltoapis.nebula.user.v1.User.Builder getUserBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    public com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.saltoapis.nebula.user.v1.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * The user who unlocked the access point, if any.
     * </pre>
     *
     * <code>.salto.nebula.user.v1.User user = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.saltoapis.nebula.user.v1.User, com.saltoapis.nebula.user.v1.User.Builder, com.saltoapis.nebula.user.v1.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.saltoapis.nebula.user.v1.User, com.saltoapis.nebula.user.v1.User.Builder, com.saltoapis.nebula.user.v1.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.salto.nebula.emergencykey.v1.EmergencyKey, com.salto.nebula.emergencykey.v1.EmergencyKey.Builder, com.salto.nebula.emergencykey.v1.EmergencyKeyOrBuilder> emergencyKeyBuilder_;
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     * @return Whether the emergencyKey field is set.
     */
    @java.lang.Override
    public boolean hasEmergencyKey() {
      return credentialCase_ == 3;
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     * @return The emergencyKey.
     */
    @java.lang.Override
    public com.salto.nebula.emergencykey.v1.EmergencyKey getEmergencyKey() {
      if (emergencyKeyBuilder_ == null) {
        if (credentialCase_ == 3) {
          return (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_;
        }
        return com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance();
      } else {
        if (credentialCase_ == 3) {
          return emergencyKeyBuilder_.getMessage();
        }
        return com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    public Builder setEmergencyKey(com.salto.nebula.emergencykey.v1.EmergencyKey value) {
      if (emergencyKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        credential_ = value;
        onChanged();
      } else {
        emergencyKeyBuilder_.setMessage(value);
      }
      credentialCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    public Builder setEmergencyKey(
        com.salto.nebula.emergencykey.v1.EmergencyKey.Builder builderForValue) {
      if (emergencyKeyBuilder_ == null) {
        credential_ = builderForValue.build();
        onChanged();
      } else {
        emergencyKeyBuilder_.setMessage(builderForValue.build());
      }
      credentialCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    public Builder mergeEmergencyKey(com.salto.nebula.emergencykey.v1.EmergencyKey value) {
      if (emergencyKeyBuilder_ == null) {
        if (credentialCase_ == 3 &&
            credential_ != com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance()) {
          credential_ = com.salto.nebula.emergencykey.v1.EmergencyKey.newBuilder((com.salto.nebula.emergencykey.v1.EmergencyKey) credential_)
              .mergeFrom(value).buildPartial();
        } else {
          credential_ = value;
        }
        onChanged();
      } else {
        if (credentialCase_ == 3) {
          emergencyKeyBuilder_.mergeFrom(value);
        } else {
          emergencyKeyBuilder_.setMessage(value);
        }
      }
      credentialCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    public Builder clearEmergencyKey() {
      if (emergencyKeyBuilder_ == null) {
        if (credentialCase_ == 3) {
          credentialCase_ = 0;
          credential_ = null;
          onChanged();
        }
      } else {
        if (credentialCase_ == 3) {
          credentialCase_ = 0;
          credential_ = null;
        }
        emergencyKeyBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    public com.salto.nebula.emergencykey.v1.EmergencyKey.Builder getEmergencyKeyBuilder() {
      return getEmergencyKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    @java.lang.Override
    public com.salto.nebula.emergencykey.v1.EmergencyKeyOrBuilder getEmergencyKeyOrBuilder() {
      if ((credentialCase_ == 3) && (emergencyKeyBuilder_ != null)) {
        return emergencyKeyBuilder_.getMessageOrBuilder();
      } else {
        if (credentialCase_ == 3) {
          return (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_;
        }
        return com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The emergency key used to unlock the access point.
     * </pre>
     *
     * <code>.salto.nebula.emergencykey.v1.EmergencyKey emergency_key = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.salto.nebula.emergencykey.v1.EmergencyKey, com.salto.nebula.emergencykey.v1.EmergencyKey.Builder, com.salto.nebula.emergencykey.v1.EmergencyKeyOrBuilder> 
        getEmergencyKeyFieldBuilder() {
      if (emergencyKeyBuilder_ == null) {
        if (!(credentialCase_ == 3)) {
          credential_ = com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance();
        }
        emergencyKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.salto.nebula.emergencykey.v1.EmergencyKey, com.salto.nebula.emergencykey.v1.EmergencyKey.Builder, com.salto.nebula.emergencykey.v1.EmergencyKeyOrBuilder>(
                (com.salto.nebula.emergencykey.v1.EmergencyKey) credential_,
                getParentForChildren(),
                isClean());
        credential_ = null;
      }
      credentialCase_ = 3;
      onChanged();
      return emergencyKeyBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.event.v1.AccessPointUnlocked)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.event.v1.AccessPointUnlocked)
  private static final com.saltoapis.nebula.event.v1.AccessPointUnlocked DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.event.v1.AccessPointUnlocked();
  }

  public static com.saltoapis.nebula.event.v1.AccessPointUnlocked getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessPointUnlocked>
      PARSER = new com.google.protobuf.AbstractParser<AccessPointUnlocked>() {
    @java.lang.Override
    public AccessPointUnlocked parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessPointUnlocked> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessPointUnlocked> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.event.v1.AccessPointUnlocked getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

