// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/unit/v1/unit.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.unit.v1;

public interface DeletePolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.unit.v1.DeletePolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the policy to be deleted, for example:
   * `installations/surelock-homes-hq/units/101/iam-policies/standard`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the policy to be deleted, for example:
   * `installations/surelock-homes-hq/units/101/iam-policies/standard`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
