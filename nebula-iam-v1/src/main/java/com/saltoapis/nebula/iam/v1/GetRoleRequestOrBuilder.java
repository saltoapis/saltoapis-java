// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/iam/v1/iam.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.iam.v1;

public interface GetRoleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.iam.v1.GetRoleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested role resource. For example: `iam-roles/admin`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested role resource. For example: `iam-roles/admin`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
