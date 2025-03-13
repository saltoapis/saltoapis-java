// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/iam/v1/iam.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.iam.v1;

public interface RoleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.iam.v1.Role)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the role.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the role.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A human-readable display name for the role.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A human-readable display name for the role.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The names of the permissions this role grants.
   * </pre>
   *
   * <code>repeated string permissions = 3;</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <pre>
   * The names of the permissions this role grants.
   * </pre>
   *
   * <code>repeated string permissions = 3;</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * The names of the permissions this role grants.
   * </pre>
   *
   * <code>repeated string permissions = 3;</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <pre>
   * The names of the permissions this role grants.
   * </pre>
   *
   * <code>repeated string permissions = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
