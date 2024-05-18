// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accesspointgroup.v1;

public interface CreateAccessPointGroupAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where the access point group's
   * access point association is to be created. For example:
   * `installations/surelock-homes-hq/access-point-groups/common-accesses`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where the access point group's
   * access point association is to be created. For example:
   * `installations/surelock-homes-hq/access-point-groups/common-accesses`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The access point group's access point association resource to be created.
   * Client must not set the `AccessPointGroupAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_point = 2;</code>
   * @return Whether the accessPointGroupAccessPoint field is set.
   */
  boolean hasAccessPointGroupAccessPoint();
  /**
   * <pre>
   * The access point group's access point association resource to be created.
   * Client must not set the `AccessPointGroupAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_point = 2;</code>
   * @return The accessPointGroupAccessPoint.
   */
  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoint();
  /**
   * <pre>
   * The access point group's access point association resource to be created.
   * Client must not set the `AccessPointGroupAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_point = 2;</code>
   */
  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder getAccessPointGroupAccessPointOrBuilder();
}