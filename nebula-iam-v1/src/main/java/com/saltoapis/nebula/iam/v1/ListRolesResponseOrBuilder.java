// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/iam/v1/iam.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.iam.v1;

public interface ListRolesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.iam.v1.ListRolesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `roles` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.iam.v1.Role roles = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.iam.v1.Role> 
      getRolesList();
  /**
   * <pre>
   * The field name should match the noun `roles` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.iam.v1.Role roles = 1;</code>
   */
  com.saltoapis.nebula.iam.v1.Role getRoles(int index);
  /**
   * <pre>
   * The field name should match the noun `roles` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.iam.v1.Role roles = 1;</code>
   */
  int getRolesCount();
  /**
   * <pre>
   * The field name should match the noun `roles` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.iam.v1.Role roles = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.iam.v1.RoleOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `roles` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.iam.v1.Role roles = 1;</code>
   */
  com.saltoapis.nebula.iam.v1.RoleOrBuilder getRolesOrBuilder(
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