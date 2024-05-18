// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accessright/v1/access_right.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accessright.v1;

public interface CreateAccessRightAccessPointGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where the access right's access
   * point group association is to be created. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where the access right's access
   * point group association is to be created. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The access right's access point group association resource to be created.
   * Client must not set the `AccessRightAccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_group = 2;</code>
   * @return Whether the accessRightAccessPointGroup field is set.
   */
  boolean hasAccessRightAccessPointGroup();
  /**
   * <pre>
   * The access right's access point group association resource to be created.
   * Client must not set the `AccessRightAccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_group = 2;</code>
   * @return The accessRightAccessPointGroup.
   */
  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup getAccessRightAccessPointGroup();
  /**
   * <pre>
   * The access right's access point group association resource to be created.
   * Client must not set the `AccessRightAccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_group = 2;</code>
   */
  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder getAccessRightAccessPointGroupOrBuilder();
}