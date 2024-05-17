// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.user.v1;

public interface ListUserAccessRightsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.ListUserAccessRightsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.user.v1.UserAccessRight> 
      getUserAccessRightsList();
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  com.saltoapis.nebula.user.v1.UserAccessRight getUserAccessRights(int index);
  /**
   * <pre>
   * The field name should match the noun `user_access_rights` in the method
   * name. There will be a maximum number of items returned based on the
   * `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.user.v1.UserAccessRight user_access_rights = 1;</code>
   */
  int getUserAccessRightsCount();

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
