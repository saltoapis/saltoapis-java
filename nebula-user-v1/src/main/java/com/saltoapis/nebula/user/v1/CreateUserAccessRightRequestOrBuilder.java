// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.user.v1;

public interface CreateUserAccessRightRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.CreateUserAccessRightRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where the users's access right
   * association is to be created. For example:
   * `installations/surelock-homes-hq/users/john-watson`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where the users's access right
   * association is to be created. For example:
   * `installations/surelock-homes-hq/users/john-watson`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The user's access right association resource to be created. Client must
   * not set the `UserAccessRight.name` field.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.UserAccessRight user_access_right = 2;</code>
   * @return Whether the userAccessRight field is set.
   */
  boolean hasUserAccessRight();
  /**
   * <pre>
   * The user's access right association resource to be created. Client must
   * not set the `UserAccessRight.name` field.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.UserAccessRight user_access_right = 2;</code>
   * @return The userAccessRight.
   */
  com.saltoapis.nebula.user.v1.UserAccessRight getUserAccessRight();
  /**
   * <pre>
   * The user's access right association resource to be created. Client must
   * not set the `UserAccessRight.name` field.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.UserAccessRight user_access_right = 2;</code>
   */
  com.saltoapis.nebula.user.v1.UserAccessRightOrBuilder getUserAccessRightOrBuilder();
}
