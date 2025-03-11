// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

public interface DeleteAccessRightRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.DeleteAccessRightRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the access point to be deleted. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the access point to be deleted. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
