// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.encoder.v1;

/**
 * <pre>
 * The response message for [ListEncoders][salto.nebula.encoder.v1.EncoderService.ListEncoders]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.encoder.v1.ListEncodersResponse}
 */
public  final class ListEncodersResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListEncodersResponse, ListEncodersResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.encoder.v1.ListEncodersResponse)
    ListEncodersResponseOrBuilder {
  private ListEncodersResponse() {
    encoders_ = emptyProtobufList();
    nextPageToken_ = "";
  }
  public static final int ENCODERS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.saltoapis.nebula.encoder.v1.Encoder> encoders_;
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.encoder.v1.Encoder> getEncodersList() {
    return encoders_;
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  public java.util.List<? extends com.saltoapis.nebula.encoder.v1.EncoderOrBuilder> 
      getEncodersOrBuilderList() {
    return encoders_;
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  @java.lang.Override
  public int getEncodersCount() {
    return encoders_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.encoder.v1.Encoder getEncoders(int index) {
    return encoders_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  public com.saltoapis.nebula.encoder.v1.EncoderOrBuilder getEncodersOrBuilder(
      int index) {
    return encoders_.get(index);
  }
  private void ensureEncodersIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.saltoapis.nebula.encoder.v1.Encoder> tmp = encoders_;
    if (!tmp.isModifiable()) {
      encoders_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  private void setEncoders(
      int index, com.saltoapis.nebula.encoder.v1.Encoder value) {
    value.getClass();
  ensureEncodersIsMutable();
    encoders_.set(index, value);
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  private void addEncoders(com.saltoapis.nebula.encoder.v1.Encoder value) {
    value.getClass();
  ensureEncodersIsMutable();
    encoders_.add(value);
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  private void addEncoders(
      int index, com.saltoapis.nebula.encoder.v1.Encoder value) {
    value.getClass();
  ensureEncodersIsMutable();
    encoders_.add(index, value);
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  private void addAllEncoders(
      java.lang.Iterable<? extends com.saltoapis.nebula.encoder.v1.Encoder> values) {
    ensureEncodersIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, encoders_);
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  private void clearEncoders() {
    encoders_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  private void removeEncoders(int index) {
    ensureEncodersIsMutable();
    encoders_.remove(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.String nextPageToken_;
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
    return nextPageToken_;
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
    return com.google.protobuf.ByteString.copyFromUtf8(nextPageToken_);
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @param value The nextPageToken to set.
   */
  private void setNextPageToken(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    nextPageToken_ = value;
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  private void clearNextPageToken() {

    nextPageToken_ = getDefaultInstance().getNextPageToken();
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @param value The bytes for nextPageToken to set.
   */
  private void setNextPageTokenBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    nextPageToken_ = value.toStringUtf8();

  }

  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.encoder.v1.ListEncodersResponse prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The response message for [ListEncoders][salto.nebula.encoder.v1.EncoderService.ListEncoders]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.encoder.v1.ListEncodersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.encoder.v1.ListEncodersResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.encoder.v1.ListEncodersResponse)
      com.saltoapis.nebula.encoder.v1.ListEncodersResponseOrBuilder {
    // Construct using com.saltoapis.nebula.encoder.v1.ListEncodersResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.saltoapis.nebula.encoder.v1.Encoder> getEncodersList() {
      return java.util.Collections.unmodifiableList(
          instance.getEncodersList());
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    @java.lang.Override
    public int getEncodersCount() {
      return instance.getEncodersCount();
    }/**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.encoder.v1.Encoder getEncoders(int index) {
      return instance.getEncoders(index);
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder setEncoders(
        int index, com.saltoapis.nebula.encoder.v1.Encoder value) {
      copyOnWrite();
      instance.setEncoders(index, value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder setEncoders(
        int index, com.saltoapis.nebula.encoder.v1.Encoder.Builder builderForValue) {
      copyOnWrite();
      instance.setEncoders(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder addEncoders(com.saltoapis.nebula.encoder.v1.Encoder value) {
      copyOnWrite();
      instance.addEncoders(value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder addEncoders(
        int index, com.saltoapis.nebula.encoder.v1.Encoder value) {
      copyOnWrite();
      instance.addEncoders(index, value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder addEncoders(
        com.saltoapis.nebula.encoder.v1.Encoder.Builder builderForValue) {
      copyOnWrite();
      instance.addEncoders(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder addEncoders(
        int index, com.saltoapis.nebula.encoder.v1.Encoder.Builder builderForValue) {
      copyOnWrite();
      instance.addEncoders(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder addAllEncoders(
        java.lang.Iterable<? extends com.saltoapis.nebula.encoder.v1.Encoder> values) {
      copyOnWrite();
      instance.addAllEncoders(values);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder clearEncoders() {
      copyOnWrite();
      instance.clearEncoders();
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `encoders` in the method name. There
     * will be a maximum number of items returned based on the `page_size` field
     * in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
     */
    public Builder removeEncoders(int index) {
      copyOnWrite();
      instance.removeEncoders(index);
      return this;
    }

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
      return instance.getNextPageToken();
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
      return instance.getNextPageTokenBytes();
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
      copyOnWrite();
      instance.setNextPageToken(value);
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
      copyOnWrite();
      instance.clearNextPageToken();
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
      copyOnWrite();
      instance.setNextPageTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.encoder.v1.ListEncodersResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.encoder.v1.ListEncodersResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "encoders_",
            com.saltoapis.nebula.encoder.v1.Encoder.class,
            "nextPageToken_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.encoder.v1.ListEncodersResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.encoder.v1.ListEncodersResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.encoder.v1.ListEncodersResponse>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.encoder.v1.ListEncodersResponse)
  private static final com.saltoapis.nebula.encoder.v1.ListEncodersResponse DEFAULT_INSTANCE;
  static {
    ListEncodersResponse defaultInstance = new ListEncodersResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListEncodersResponse.class, defaultInstance);
  }

  public static com.saltoapis.nebula.encoder.v1.ListEncodersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListEncodersResponse> PARSER;

  public static com.google.protobuf.Parser<ListEncodersResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

