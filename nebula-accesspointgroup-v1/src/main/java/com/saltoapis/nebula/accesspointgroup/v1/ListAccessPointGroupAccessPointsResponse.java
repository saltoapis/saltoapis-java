// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.accesspointgroup.v1;

/**
 * <pre>
 * The request message for [`ListAccessPointGroupAccessPoints`][salto.nebula.accesspointgroup.v1.AccessPointGroupService.ListAccessPointGroupAccessPoints]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse}
 */
public  final class ListAccessPointGroupAccessPointsResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListAccessPointGroupAccessPointsResponse, ListAccessPointGroupAccessPointsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse)
    ListAccessPointGroupAccessPointsResponseOrBuilder {
  private ListAccessPointGroupAccessPointsResponse() {
    accessPointGroupAccessPoints_ = emptyProtobufList();
    nextPageToken_ = "";
  }
  public static final int ACCESS_POINT_GROUP_ACCESS_POINTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> accessPointGroupAccessPoints_;
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getAccessPointGroupAccessPointsList() {
    return accessPointGroupAccessPoints_;
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  public java.util.List<? extends com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder> 
      getAccessPointGroupAccessPointsOrBuilderList() {
    return accessPointGroupAccessPoints_;
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public int getAccessPointGroupAccessPointsCount() {
    return accessPointGroupAccessPoints_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoints(int index) {
    return accessPointGroupAccessPoints_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder getAccessPointGroupAccessPointsOrBuilder(
      int index) {
    return accessPointGroupAccessPoints_.get(index);
  }
  private void ensureAccessPointGroupAccessPointsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> tmp = accessPointGroupAccessPoints_;
    if (!tmp.isModifiable()) {
      accessPointGroupAccessPoints_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  private void setAccessPointGroupAccessPoints(
      int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
    value.getClass();
  ensureAccessPointGroupAccessPointsIsMutable();
    accessPointGroupAccessPoints_.set(index, value);
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  private void addAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
    value.getClass();
  ensureAccessPointGroupAccessPointsIsMutable();
    accessPointGroupAccessPoints_.add(value);
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  private void addAccessPointGroupAccessPoints(
      int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
    value.getClass();
  ensureAccessPointGroupAccessPointsIsMutable();
    accessPointGroupAccessPoints_.add(index, value);
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  private void addAllAccessPointGroupAccessPoints(
      java.lang.Iterable<? extends com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> values) {
    ensureAccessPointGroupAccessPointsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, accessPointGroupAccessPoints_);
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  private void clearAccessPointGroupAccessPoints() {
    accessPointGroupAccessPoints_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The field name should match the noun `access_point_group_access_points`
   * in the method name. There will be a maximum number of items returned
   * based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
   */
  private void removeAccessPointGroupAccessPoints(int index) {
    ensureAccessPointGroupAccessPointsIsMutable();
    accessPointGroupAccessPoints_.remove(index);
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

  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message for [`ListAccessPointGroupAccessPoints`][salto.nebula.accesspointgroup.v1.AccessPointGroupService.ListAccessPointGroupAccessPoints]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse)
      com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponseOrBuilder {
    // Construct using com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getAccessPointGroupAccessPointsList() {
      return java.util.Collections.unmodifiableList(
          instance.getAccessPointGroupAccessPointsList());
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    @java.lang.Override
    public int getAccessPointGroupAccessPointsCount() {
      return instance.getAccessPointGroupAccessPointsCount();
    }/**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoints(int index) {
      return instance.getAccessPointGroupAccessPoints(index);
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder setAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
      copyOnWrite();
      instance.setAccessPointGroupAccessPoints(index, value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder setAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder builderForValue) {
      copyOnWrite();
      instance.setAccessPointGroupAccessPoints(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
      copyOnWrite();
      instance.addAccessPointGroupAccessPoints(value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint value) {
      copyOnWrite();
      instance.addAccessPointGroupAccessPoints(index, value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(
        com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder builderForValue) {
      copyOnWrite();
      instance.addAccessPointGroupAccessPoints(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAccessPointGroupAccessPoints(
        int index, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.Builder builderForValue) {
      copyOnWrite();
      instance.addAccessPointGroupAccessPoints(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder addAllAccessPointGroupAccessPoints(
        java.lang.Iterable<? extends com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> values) {
      copyOnWrite();
      instance.addAllAccessPointGroupAccessPoints(values);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder clearAccessPointGroupAccessPoints() {
      copyOnWrite();
      instance.clearAccessPointGroupAccessPoints();
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `access_point_group_access_points`
     * in the method name. There will be a maximum number of items returned
     * based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_points = 1;</code>
     */
    public Builder removeAccessPointGroupAccessPoints(int index) {
      copyOnWrite();
      instance.removeAccessPointGroupAccessPoints(index);
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "accessPointGroupAccessPoints_",
            com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.class,
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
        com.google.protobuf.Parser<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse>(
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


  // @@protoc_insertion_point(class_scope:salto.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse)
  private static final com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse DEFAULT_INSTANCE;
  static {
    ListAccessPointGroupAccessPointsResponse defaultInstance = new ListAccessPointGroupAccessPointsResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListAccessPointGroupAccessPointsResponse.class, defaultInstance);
  }

  public static com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListAccessPointGroupAccessPointsResponse> PARSER;

  public static com.google.protobuf.Parser<ListAccessPointGroupAccessPointsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

