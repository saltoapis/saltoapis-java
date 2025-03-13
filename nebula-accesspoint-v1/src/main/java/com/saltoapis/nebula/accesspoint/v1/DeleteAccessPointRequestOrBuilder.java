// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspoint/v1/access_point.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accesspoint.v1;

public interface DeleteAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspoint.v1.DeleteAccessPointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the access point to be deleted. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the access point to be deleted. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
