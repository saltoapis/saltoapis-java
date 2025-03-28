// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/user/v1/user.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.user.v1;

public interface UpdateUserAccessRightRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.UpdateUserAccessRightRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user's access right resource which replaces the resource on the
   * server.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.UserAccessRight user_access_right = 1;</code>
   * @return Whether the userAccessRight field is set.
   */
  boolean hasUserAccessRight();
  /**
   * <pre>
   * The user's access right resource which replaces the resource on the
   * server.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.UserAccessRight user_access_right = 1;</code>
   * @return The userAccessRight.
   */
  com.saltoapis.nebula.user.v1.UserAccessRight getUserAccessRight();
  /**
   * <pre>
   * The user's access right resource which replaces the resource on the
   * server.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.UserAccessRight user_access_right = 1;</code>
   */
  com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder getUserAccessRightOrBuilder();

  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
