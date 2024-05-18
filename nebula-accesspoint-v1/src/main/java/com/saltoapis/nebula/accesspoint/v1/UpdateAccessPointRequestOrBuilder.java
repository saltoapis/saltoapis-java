// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspoint/v1/access_point.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accesspoint.v1;

public interface UpdateAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspoint.v1.UpdateAccessPointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The access point resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <pre>
   * The access point resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return The accessPoint.
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint();
  /**
   * <pre>
   * The access point resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder();

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
