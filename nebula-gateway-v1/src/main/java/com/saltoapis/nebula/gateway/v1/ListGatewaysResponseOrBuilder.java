// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/gateway/v1/gateway.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.gateway.v1;

public interface ListGatewaysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.gateway.v1.ListGatewaysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `gateways` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.gateway.v1.Gateway gateways = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.gateway.v1.Gateway> 
      getGatewaysList();
  /**
   * <pre>
   * The field name should match the noun `gateways` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.gateway.v1.Gateway gateways = 1;</code>
   */
  com.saltoapis.nebula.gateway.v1.Gateway getGateways(int index);
  /**
   * <pre>
   * The field name should match the noun `gateways` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.gateway.v1.Gateway gateways = 1;</code>
   */
  int getGatewaysCount();
  /**
   * <pre>
   * The field name should match the noun `gateways` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.gateway.v1.Gateway gateways = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.gateway.v1.GatewayOrBuilder> 
      getGatewaysOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `gateways` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.gateway.v1.Gateway gateways = 1;</code>
   */
  com.saltoapis.nebula.gateway.v1.GatewayOrBuilder getGatewaysOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
