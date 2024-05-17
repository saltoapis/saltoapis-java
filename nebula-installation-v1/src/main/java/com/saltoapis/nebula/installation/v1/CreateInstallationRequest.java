// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.installation.v1;

/**
 * <pre>
 * The request message for [`CreateInstallation`][salto.nebula.installation.v1.InstallationService.CreateInstallation]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.installation.v1.CreateInstallationRequest}
 */
public  final class CreateInstallationRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateInstallationRequest, CreateInstallationRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.installation.v1.CreateInstallationRequest)
    CreateInstallationRequestOrBuilder {
  private CreateInstallationRequest() {
    installationId_ = "";
  }
  private int bitField0_;
  public static final int INSTALLATION_ID_FIELD_NUMBER = 1;
  private java.lang.String installationId_;
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @return Whether the installationId field is set.
   */
  @java.lang.Override
  public boolean hasInstallationId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @return The installationId.
   */
  @java.lang.Override
  public java.lang.String getInstallationId() {
    return installationId_;
  }
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @return The bytes for installationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstallationIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(installationId_);
  }
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @param value The installationId to set.
   */
  private void setInstallationId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  bitField0_ |= 0x00000001;
    installationId_ = value;
  }
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   */
  private void clearInstallationId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    installationId_ = getDefaultInstance().getInstallationId();
  }
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @param value The bytes for installationId to set.
   */
  private void setInstallationIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    installationId_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int INSTALLATION_FIELD_NUMBER = 2;
  private com.saltoapis.nebula.installation.v1.Installation installation_;
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   */
  @java.lang.Override
  public boolean hasInstallation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.installation.v1.Installation getInstallation() {
    return installation_ == null ? com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance() : installation_;
  }
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   */
  private void setInstallation(com.saltoapis.nebula.installation.v1.Installation value) {
    value.getClass();
  installation_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeInstallation(com.saltoapis.nebula.installation.v1.Installation value) {
    value.getClass();
  if (installation_ != null &&
        installation_ != com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance()) {
      installation_ =
        com.saltoapis.nebula.installation.v1.Installation.newBuilder(installation_).mergeFrom(value).buildPartial();
    } else {
      installation_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   */
  private void clearInstallation() {  installation_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 5;
  private boolean validateOnly_;
  /**
   * <pre>
   * If set, validate the request but do not actually create the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 5;</code>
   * @return Whether the validateOnly field is set.
   */
  @java.lang.Override
  public boolean hasValidateOnly() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * If set, validate the request but do not actually create the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 5;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }
  /**
   * <pre>
   * If set, validate the request but do not actually create the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 5;</code>
   * @param value The validateOnly to set.
   */
  private void setValidateOnly(boolean value) {
    bitField0_ |= 0x00000004;
    validateOnly_ = value;
  }
  /**
   * <pre>
   * If set, validate the request but do not actually create the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 5;</code>
   */
  private void clearValidateOnly() {
    bitField0_ = (bitField0_ & ~0x00000004);
    validateOnly_ = false;
  }

  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.installation.v1.CreateInstallationRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for [`CreateInstallation`][salto.nebula.installation.v1.InstallationService.CreateInstallation]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.installation.v1.CreateInstallationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.installation.v1.CreateInstallationRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.installation.v1.CreateInstallationRequest)
      com.saltoapis.nebula.installation.v1.CreateInstallationRequestOrBuilder {
    // Construct using com.saltoapis.nebula.installation.v1.CreateInstallationRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The installation ID to use for this installation. In case it's
     * empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string installation_id = 1;</code>
     * @return Whether the installationId field is set.
     */
    @java.lang.Override
    public boolean hasInstallationId() {
      return instance.hasInstallationId();
    }
    /**
     * <pre>
     * The installation ID to use for this installation. In case it's
     * empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string installation_id = 1;</code>
     * @return The installationId.
     */
    @java.lang.Override
    public java.lang.String getInstallationId() {
      return instance.getInstallationId();
    }
    /**
     * <pre>
     * The installation ID to use for this installation. In case it's
     * empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string installation_id = 1;</code>
     * @return The bytes for installationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInstallationIdBytes() {
      return instance.getInstallationIdBytes();
    }
    /**
     * <pre>
     * The installation ID to use for this installation. In case it's
     * empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string installation_id = 1;</code>
     * @param value The installationId to set.
     * @return This builder for chaining.
     */
    public Builder setInstallationId(
        java.lang.String value) {
      copyOnWrite();
      instance.setInstallationId(value);
      return this;
    }
    /**
     * <pre>
     * The installation ID to use for this installation. In case it's
     * empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string installation_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstallationId() {
      copyOnWrite();
      instance.clearInstallationId();
      return this;
    }
    /**
     * <pre>
     * The installation ID to use for this installation. In case it's
     * empty the server will autogenerate a unique identifier.
     * </pre>
     *
     * <code>optional string installation_id = 1;</code>
     * @param value The bytes for installationId to set.
     * @return This builder for chaining.
     */
    public Builder setInstallationIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setInstallationIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The installation resource to be created. Client must not set the
     * `Installation.name` field.
     * </pre>
     *
     * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
     */
    @java.lang.Override
    public boolean hasInstallation() {
      return instance.hasInstallation();
    }
    /**
     * <pre>
     * The installation resource to be created. Client must not set the
     * `Installation.name` field.
     * </pre>
     *
     * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.Installation getInstallation() {
      return instance.getInstallation();
    }
    /**
     * <pre>
     * The installation resource to be created. Client must not set the
     * `Installation.name` field.
     * </pre>
     *
     * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
     */
    public Builder setInstallation(com.saltoapis.nebula.installation.v1.Installation value) {
      copyOnWrite();
      instance.setInstallation(value);
      return this;
      }
    /**
     * <pre>
     * The installation resource to be created. Client must not set the
     * `Installation.name` field.
     * </pre>
     *
     * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
     */
    public Builder setInstallation(
        com.saltoapis.nebula.installation.v1.Installation.Builder builderForValue) {
      copyOnWrite();
      instance.setInstallation(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The installation resource to be created. Client must not set the
     * `Installation.name` field.
     * </pre>
     *
     * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
     */
    public Builder mergeInstallation(com.saltoapis.nebula.installation.v1.Installation value) {
      copyOnWrite();
      instance.mergeInstallation(value);
      return this;
    }
    /**
     * <pre>
     * The installation resource to be created. Client must not set the
     * `Installation.name` field.
     * </pre>
     *
     * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
     */
    public Builder clearInstallation() {  copyOnWrite();
      instance.clearInstallation();
      return this;
    }

    /**
     * <pre>
     * If set, validate the request but do not actually create the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 5;</code>
     * @return Whether the validateOnly field is set.
     */
    @java.lang.Override
    public boolean hasValidateOnly() {
      return instance.hasValidateOnly();
    }
    /**
     * <pre>
     * If set, validate the request but do not actually create the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 5;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return instance.getValidateOnly();
    }
    /**
     * <pre>
     * If set, validate the request but do not actually create the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 5;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      copyOnWrite();
      instance.setValidateOnly(value);
      return this;
    }
    /**
     * <pre>
     * If set, validate the request but do not actually create the installation.
     * </pre>
     *
     * <code>optional bool validate_only = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      copyOnWrite();
      instance.clearValidateOnly();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.installation.v1.CreateInstallationRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.installation.v1.CreateInstallationRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "installationId_",
            "installation_",
            "validateOnly_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u1208\u0000\u0002" +
              "\u1009\u0001\u0005\u1007\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.installation.v1.CreateInstallationRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.installation.v1.CreateInstallationRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.installation.v1.CreateInstallationRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:salto.nebula.installation.v1.CreateInstallationRequest)
  private static final com.saltoapis.nebula.installation.v1.CreateInstallationRequest DEFAULT_INSTANCE;
  static {
    CreateInstallationRequest defaultInstance = new CreateInstallationRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateInstallationRequest.class, defaultInstance);
  }

  public static com.saltoapis.nebula.installation.v1.CreateInstallationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateInstallationRequest> PARSER;

  public static com.google.protobuf.Parser<CreateInstallationRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

