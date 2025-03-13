// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.installation.v1;

public interface ListInstallationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.ListInstallationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `installations` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Installation installations = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.installation.v1.Installation> 
      getInstallationsList();
  /**
   * <pre>
   * The field name should match the noun `installations` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Installation installations = 1;</code>
   */
  com.saltoapis.nebula.installation.v1.Installation getInstallations(int index);
  /**
   * <pre>
   * The field name should match the noun `installations` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Installation installations = 1;</code>
   */
  int getInstallationsCount();
  /**
   * <pre>
   * The field name should match the noun `installations` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Installation installations = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.installation.v1.InstallationOrBuilder> 
      getInstallationsOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `installations` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Installation installations = 1;</code>
   */
  com.saltoapis.nebula.installation.v1.InstallationOrBuilder getInstallationsOrBuilder(
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
