// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.user.v1;

/**
 * <pre>
 * The response message for [`EncodeCardKey`][salto.nebula.user.v1.UserService.EncodeCardKey]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.user.v1.EncodeCardKeyResponse}
 */
public  final class EncodeCardKeyResponse extends
    com.google.protobuf.GeneratedMessageLite<
        EncodeCardKeyResponse, EncodeCardKeyResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.user.v1.EncodeCardKeyResponse)
    EncodeCardKeyResponseOrBuilder {
  private EncodeCardKeyResponse() {
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.user.v1.EncodeCardKeyResponse prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The response message for [`EncodeCardKey`][salto.nebula.user.v1.UserService.EncodeCardKey]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.user.v1.EncodeCardKeyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.user.v1.EncodeCardKeyResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.user.v1.EncodeCardKeyResponse)
      com.saltoapis.nebula.user.v1.EncodeCardKeyResponseOrBuilder {
    // Construct using com.saltoapis.nebula.user.v1.EncodeCardKeyResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    // @@protoc_insertion_point(builder_scope:salto.nebula.user.v1.EncodeCardKeyResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.user.v1.EncodeCardKeyResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = null;java.lang.String info =
              "\u0000\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.user.v1.EncodeCardKeyResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.user.v1.EncodeCardKeyResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.user.v1.EncodeCardKeyResponse>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.user.v1.EncodeCardKeyResponse)
  private static final com.saltoapis.nebula.user.v1.EncodeCardKeyResponse DEFAULT_INSTANCE;
  static {
    EncodeCardKeyResponse defaultInstance = new EncodeCardKeyResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      EncodeCardKeyResponse.class, defaultInstance);
  }

  public static com.saltoapis.nebula.user.v1.EncodeCardKeyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<EncodeCardKeyResponse> PARSER;

  public static com.google.protobuf.Parser<EncodeCardKeyResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

