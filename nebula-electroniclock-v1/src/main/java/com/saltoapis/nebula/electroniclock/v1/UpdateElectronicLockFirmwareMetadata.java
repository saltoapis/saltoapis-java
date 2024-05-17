// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electroniclock/v1/electronic_lock.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.electroniclock.v1;

/**
 * <pre>
 * The metadata message for [`UpdateElectronicLockFirmware`][salto.nebula.electroniclock.v1.ElectronicLockService.UpdateElectronicLockFirmware]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata}
 */
public  final class UpdateElectronicLockFirmwareMetadata extends
    com.google.protobuf.GeneratedMessageLite<
        UpdateElectronicLockFirmwareMetadata, UpdateElectronicLockFirmwareMetadata.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata)
    UpdateElectronicLockFirmwareMetadataOrBuilder {
  private UpdateElectronicLockFirmwareMetadata() {
  }
  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 1;
  private int progressPercent_;
  /**
   * <pre>
   * Progress of operation. Range: [0, 100].
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   * @return The progressPercent.
   */
  @java.lang.Override
  public int getProgressPercent() {
    return progressPercent_;
  }
  /**
   * <pre>
   * Progress of operation. Range: [0, 100].
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   * @param value The progressPercent to set.
   */
  private void setProgressPercent(int value) {
    
    progressPercent_ = value;
  }
  /**
   * <pre>
   * Progress of operation. Range: [0, 100].
   * </pre>
   *
   * <code>int32 progress_percent = 1;</code>
   */
  private void clearProgressPercent() {

    progressPercent_ = 0;
  }

  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The metadata message for [`UpdateElectronicLockFirmware`][salto.nebula.electroniclock.v1.ElectronicLockService.UpdateElectronicLockFirmware]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata)
      com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadataOrBuilder {
    // Construct using com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Progress of operation. Range: [0, 100].
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @return The progressPercent.
     */
    @java.lang.Override
    public int getProgressPercent() {
      return instance.getProgressPercent();
    }
    /**
     * <pre>
     * Progress of operation. Range: [0, 100].
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @param value The progressPercent to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercent(int value) {
      copyOnWrite();
      instance.setProgressPercent(value);
      return this;
    }
    /**
     * <pre>
     * Progress of operation. Range: [0, 100].
     * </pre>
     *
     * <code>int32 progress_percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgressPercent() {
      copyOnWrite();
      instance.clearProgressPercent();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "progressPercent_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata)
  private static final com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata DEFAULT_INSTANCE;
  static {
    UpdateElectronicLockFirmwareMetadata defaultInstance = new UpdateElectronicLockFirmwareMetadata();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UpdateElectronicLockFirmwareMetadata.class, defaultInstance);
  }

  public static com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UpdateElectronicLockFirmwareMetadata> PARSER;

  public static com.google.protobuf.Parser<UpdateElectronicLockFirmwareMetadata> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

