// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/unit/v1/unit.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.unit.v1;

public interface GetPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.unit.v1.GetPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested policy resource. For example:
   * `installations/surelock-homes-hq/units/101/iam-policies/standard`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested policy resource. For example:
   * `installations/surelock-homes-hq/units/101/iam-policies/standard`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
