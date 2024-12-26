// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electronickey/v1/electronic_key.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.electronickey.v1;

public interface ListElectronicKeysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electronickey.v1.ListElectronicKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.electronickey.v1.ElectronicKey> 
      getElectronicKeysList();
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  com.saltoapis.nebula.electronickey.v1.ElectronicKey getElectronicKeys(int index);
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  int getElectronicKeysCount();
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder> 
      getElectronicKeysOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `electronic_keys` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.electronickey.v1.ElectronicKey electronic_keys = 1;</code>
   */
  com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder getElectronicKeysOrBuilder(
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