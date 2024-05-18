// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accessright/v1/access_right.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accessright.v1;

public interface UpdateAccessRightAccessPointGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The access right's access point group resource which replaces the
   * resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_group = 1;</code>
   * @return Whether the accessRightAccessPointGroup field is set.
   */
  boolean hasAccessRightAccessPointGroup();
  /**
   * <pre>
   * The access right's access point group resource which replaces the
   * resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_group = 1;</code>
   * @return The accessRightAccessPointGroup.
   */
  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup getAccessRightAccessPointGroup();
  /**
   * <pre>
   * The access right's access point group resource which replaces the
   * resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPointGroup access_right_access_point_group = 1;</code>
   */
  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroupOrBuilder getAccessRightAccessPointGroupOrBuilder();

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