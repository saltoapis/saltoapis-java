// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accesspointgroup.v1;

public interface UpdateAccessPointGroupAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The access point group's access point resource which replaces the resource on
   * the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_point = 1;</code>
   * @return Whether the accessPointGroupAccessPoint field is set.
   */
  boolean hasAccessPointGroupAccessPoint();
  /**
   * <pre>
   * The access point group's access point resource which replaces the resource on
   * the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_point = 1;</code>
   * @return The accessPointGroupAccessPoint.
   */
  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoint();
  /**
   * <pre>
   * The access point group's access point resource which replaces the resource on
   * the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint access_point_group_access_point = 1;</code>
   */
  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPointOrBuilder getAccessPointGroupAccessPointOrBuilder();

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
