// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/digitalkey/v1/digital_key.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.digitalkey.v1;

/**
 * <pre>
 * The request message for [`ListDigitalKeyAccessPoints`][salto.nebula.digitalkey.v1.DigitalKeyService.ListDigitalKeyAccessPoints]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest}
 */
public  final class ListDigitalKeyAccessPointsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListDigitalKeyAccessPointsRequest, ListDigitalKeyAccessPointsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest)
    ListDigitalKeyAccessPointsRequestOrBuilder {
  private ListDigitalKeyAccessPointsRequest() {
    parent_ = "";
    filter_ = "";
    pageToken_ = "";
  }
  public static final int PARENT_FIELD_NUMBER = 1;
  private java.lang.String parent_;
  /**
   * <pre>
   * The parent resource name. For example, `digital-keys/baker-street-key`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    return parent_;
  }
  /**
   * <pre>
   * The parent resource name. For example, `digital-keys/baker-street-key`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(parent_);
  }
  /**
   * <pre>
   * The parent resource name. For example, `digital-keys/baker-street-key`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @param value The parent to set.
   */
  private void setParent(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    parent_ = value;
  }
  /**
   * <pre>
   * The parent resource name. For example, `digital-keys/baker-street-key`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  private void clearParent() {

    parent_ = getDefaultInstance().getParent();
  }
  /**
   * <pre>
   * The parent resource name. For example, `digital-keys/baker-street-key`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @param value The bytes for parent to set.
   */
  private void setParentBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    parent_ = value.toStringUtf8();

  }

  public static final int FILTER_FIELD_NUMBER = 2;
  private java.lang.String filter_;
  /**
   * <pre>
   * A filter that chooses which access points to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    return filter_;
  }
  /**
   * <pre>
   * A filter that chooses which access points to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(filter_);
  }
  /**
   * <pre>
   * A filter that chooses which access points to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @param value The filter to set.
   */
  private void setFilter(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    filter_ = value;
  }
  /**
   * <pre>
   * A filter that chooses which access points to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  private void clearFilter() {

    filter_ = getDefaultInstance().getFilter();
  }
  /**
   * <pre>
   * A filter that chooses which access points to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @param value The bytes for filter to set.
   */
  private void setFilterBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    filter_ = value.toStringUtf8();

  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   * The maximum number of items to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }
  /**
   * <pre>
   * The maximum number of items to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @param value The pageSize to set.
   */
  private void setPageSize(int value) {
    
    pageSize_ = value;
  }
  /**
   * <pre>
   * The maximum number of items to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  private void clearPageSize() {

    pageSize_ = 0;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  private java.lang.String pageToken_;
  /**
   * <pre>
   * The `next_page_token` value returned from a previous `List` request, if
   * any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    return pageToken_;
  }
  /**
   * <pre>
   * The `next_page_token` value returned from a previous `List` request, if
   * any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(pageToken_);
  }
  /**
   * <pre>
   * The `next_page_token` value returned from a previous `List` request, if
   * any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @param value The pageToken to set.
   */
  private void setPageToken(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    pageToken_ = value;
  }
  /**
   * <pre>
   * The `next_page_token` value returned from a previous `List` request, if
   * any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  private void clearPageToken() {

    pageToken_ = getDefaultInstance().getPageToken();
  }
  /**
   * <pre>
   * The `next_page_token` value returned from a previous `List` request, if
   * any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @param value The bytes for pageToken to set.
   */
  private void setPageTokenBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    pageToken_ = value.toStringUtf8();

  }

  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for [`ListDigitalKeyAccessPoints`][salto.nebula.digitalkey.v1.DigitalKeyService.ListDigitalKeyAccessPoints]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest)
      com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequestOrBuilder {
    // Construct using com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The parent resource name. For example, `digital-keys/baker-street-key`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    @java.lang.Override
    public java.lang.String getParent() {
      return instance.getParent();
    }
    /**
     * <pre>
     * The parent resource name. For example, `digital-keys/baker-street-key`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getParentBytes() {
      return instance.getParentBytes();
    }
    /**
     * <pre>
     * The parent resource name. For example, `digital-keys/baker-street-key`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      copyOnWrite();
      instance.setParent(value);
      return this;
    }
    /**
     * <pre>
     * The parent resource name. For example, `digital-keys/baker-street-key`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      copyOnWrite();
      instance.clearParent();
      return this;
    }
    /**
     * <pre>
     * The parent resource name. For example, `digital-keys/baker-street-key`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setParentBytes(value);
      return this;
    }

    /**
     * <pre>
     * A filter that chooses which access points to return.
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return The filter.
     */
    @java.lang.Override
    public java.lang.String getFilter() {
      return instance.getFilter();
    }
    /**
     * <pre>
     * A filter that chooses which access points to return.
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return The bytes for filter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFilterBytes() {
      return instance.getFilterBytes();
    }
    /**
     * <pre>
     * A filter that chooses which access points to return.
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      copyOnWrite();
      instance.setFilter(value);
      return this;
    }
    /**
     * <pre>
     * A filter that chooses which access points to return.
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      copyOnWrite();
      instance.clearFilter();
      return this;
    }
    /**
     * <pre>
     * A filter that chooses which access points to return.
     * </pre>
     *
     * <code>string filter = 2;</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFilterBytes(value);
      return this;
    }

    /**
     * <pre>
     * The maximum number of items to return.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return instance.getPageSize();
    }
    /**
     * <pre>
     * The maximum number of items to return.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      copyOnWrite();
      instance.setPageSize(value);
      return this;
    }
    /**
     * <pre>
     * The maximum number of items to return.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      copyOnWrite();
      instance.clearPageSize();
      return this;
    }

    /**
     * <pre>
     * The `next_page_token` value returned from a previous `List` request, if
     * any.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return The pageToken.
     */
    @java.lang.Override
    public java.lang.String getPageToken() {
      return instance.getPageToken();
    }
    /**
     * <pre>
     * The `next_page_token` value returned from a previous `List` request, if
     * any.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return The bytes for pageToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      return instance.getPageTokenBytes();
    }
    /**
     * <pre>
     * The `next_page_token` value returned from a previous `List` request, if
     * any.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setPageToken(value);
      return this;
    }
    /**
     * <pre>
     * The `next_page_token` value returned from a previous `List` request, if
     * any.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      copyOnWrite();
      instance.clearPageToken();
      return this;
    }
    /**
     * <pre>
     * The `next_page_token` value returned from a previous `List` request, if
     * any.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPageTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "parent_",
            "filter_",
            "pageSize_",
            "pageToken_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0004\u0004\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest)
  private static final com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest DEFAULT_INSTANCE;
  static {
    ListDigitalKeyAccessPointsRequest defaultInstance = new ListDigitalKeyAccessPointsRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListDigitalKeyAccessPointsRequest.class, defaultInstance);
  }

  public static com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListDigitalKeyAccessPointsRequest> PARSER;

  public static com.google.protobuf.Parser<ListDigitalKeyAccessPointsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

