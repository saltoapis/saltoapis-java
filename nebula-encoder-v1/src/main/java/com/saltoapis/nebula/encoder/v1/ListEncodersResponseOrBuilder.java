// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.encoder.v1;

public interface ListEncodersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.encoder.v1.ListEncodersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.encoder.v1.Encoder> 
      getEncodersList();
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  com.saltoapis.nebula.encoder.v1.Encoder getEncoders(int index);
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  int getEncodersCount();
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.encoder.v1.EncoderOrBuilder> 
      getEncodersOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `encoders` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.encoder.v1.Encoder encoders = 1;</code>
   */
  com.saltoapis.nebula.encoder.v1.EncoderOrBuilder getEncodersOrBuilder(
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
