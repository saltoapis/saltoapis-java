// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspointgroup/v1/access_point_group.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accesspointgroup.v1;

public interface DeleteAccessPointGroupAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the access point group's access point association to be
   * deleted. For example:
   * `installations/surelock-homes-hq/access-point-groups/common-accesses/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the access point group's access point association to be
   * deleted. For example:
   * `installations/surelock-homes-hq/access-point-groups/common-accesses/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}