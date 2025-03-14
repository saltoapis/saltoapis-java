// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

public interface CreateAccessRightAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.CreateAccessRightAccessPointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where the access right's access
   * point association is to be created. For example:
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
   * point association is to be created. For example:
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
   * The access right's access point association resource to be created.
   * Client must not set the `AccessRightAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
   * @return Whether the accessRightAccessPoint field is set.
   */
  boolean hasAccessRightAccessPoint();
  /**
   * <pre>
   * The access right's access point association resource to be created.
   * Client must not set the `AccessRightAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
   * @return The accessRightAccessPoint.
   */
  com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint getAccessRightAccessPoint();
  /**
   * <pre>
   * The access right's access point association resource to be created.
   * Client must not set the `AccessRightAccessPoint.name` field.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRightAccessPoint access_right_access_point = 2;</code>
   */
  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointOrBuilder getAccessRightAccessPointOrBuilder();
}
