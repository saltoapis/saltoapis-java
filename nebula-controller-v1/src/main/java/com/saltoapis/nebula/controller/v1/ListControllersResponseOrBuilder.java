// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/controller/v1/controller.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.controller.v1;

public interface ListControllersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.ListControllersResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.controller.v1.Controller> 
      getControllersList();
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  com.saltoapis.nebula.controller.v1.Controller getControllers(int index);
  /**
   * <pre>
   * The field name should match the noun `controllers` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.Controller controllers = 1;</code>
   */
  int getControllersCount();

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
