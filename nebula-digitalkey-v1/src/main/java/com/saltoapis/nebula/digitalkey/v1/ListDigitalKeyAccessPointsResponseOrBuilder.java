// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/digitalkey/v1/digital_key.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.digitalkey.v1;

public interface ListDigitalKeyAccessPointsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `digital_key_access_points` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.digitalkey.v1.DigitalKeyAccessPoint digital_key_access_points = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> 
      getDigitalKeyAccessPointsList();
  /**
   * <pre>
   * The field name should match the noun `digital_key_access_points` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.digitalkey.v1.DigitalKeyAccessPoint digital_key_access_points = 1;</code>
   */
  com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint getDigitalKeyAccessPoints(int index);
  /**
   * <pre>
   * The field name should match the noun `digital_key_access_points` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.digitalkey.v1.DigitalKeyAccessPoint digital_key_access_points = 1;</code>
   */
  int getDigitalKeyAccessPointsCount();
  /**
   * <pre>
   * The field name should match the noun `digital_key_access_points` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.digitalkey.v1.DigitalKeyAccessPoint digital_key_access_points = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPointOrBuilder> 
      getDigitalKeyAccessPointsOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `digital_key_access_points` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.digitalkey.v1.DigitalKeyAccessPoint digital_key_access_points = 1;</code>
   */
  com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPointOrBuilder getDigitalKeyAccessPointsOrBuilder(
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