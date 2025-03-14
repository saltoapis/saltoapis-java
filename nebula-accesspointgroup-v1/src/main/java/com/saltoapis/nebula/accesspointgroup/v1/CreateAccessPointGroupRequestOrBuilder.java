// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accesspointgroup.v1;

public interface CreateAccessPointGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where to create the access point
   * group. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where to create the access point
   * group. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The access point group ID to use for this access point group. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_group_id = 2;</code>
   * @return Whether the accessPointGroupId field is set.
   */
  boolean hasAccessPointGroupId();
  /**
   * <pre>
   * The access point group ID to use for this access point group. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_group_id = 2;</code>
   * @return The accessPointGroupId.
   */
  java.lang.String getAccessPointGroupId();
  /**
   * <pre>
   * The access point group ID to use for this access point group. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_group_id = 2;</code>
   * @return The bytes for accessPointGroupId.
   */
  com.google.protobuf.ByteString
      getAccessPointGroupIdBytes();

  /**
   * <pre>
   * The access point group resource to be created. Client must not set the
   * `AccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
   * @return Whether the accessPointGroup field is set.
   */
  boolean hasAccessPointGroup();
  /**
   * <pre>
   * The access point group resource to be created. Client must not set the
   * `AccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
   * @return The accessPointGroup.
   */
  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup getAccessPointGroup();
  /**
   * <pre>
   * The access point group resource to be created. Client must not set the
   * `AccessPointGroup.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroup access_point_group = 3;</code>
   */
  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupOrBuilder getAccessPointGroupOrBuilder();
}
