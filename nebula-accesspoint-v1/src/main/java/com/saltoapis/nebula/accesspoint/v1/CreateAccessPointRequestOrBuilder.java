// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspoint/v1/access_point.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.accesspoint.v1;

public interface CreateAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspoint.v1.CreateAccessPointRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource under which the access point is created.
   * For example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource under which the access point is created.
   * For example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The access point id to use for this access point. If it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_id = 2;</code>
   * @return Whether the accessPointId field is set.
   */
  boolean hasAccessPointId();
  /**
   * <pre>
   * The access point id to use for this access point. If it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_id = 2;</code>
   * @return The accessPointId.
   */
  java.lang.String getAccessPointId();
  /**
   * <pre>
   * The access point id to use for this access point. If it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string access_point_id = 2;</code>
   * @return The bytes for accessPointId.
   */
  com.google.protobuf.ByteString
      getAccessPointIdBytes();

  /**
   * <pre>
   * The access point resource to be created. Client must not set the
   * `AccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 3;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <pre>
   * The access point resource to be created. Client must not set the
   * `AccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 3;</code>
   * @return The accessPoint.
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint();
}
