// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/unit/v1/unit.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.unit.v1;

public interface CreatePolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.unit.v1.CreatePolicyRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where to create the policy. For
   * example: `installations/salto-hq/units/101`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where to create the policy. For
   * example: `installations/salto-hq/units/101`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The policy ID to use for policy. In case it's empty the server
   * will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string policy_id = 2;</code>
   * @return The policyId.
   */
  java.lang.String getPolicyId();
  /**
   * <pre>
   * The policy ID to use for policy. In case it's empty the server
   * will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string policy_id = 2;</code>
   * @return The bytes for policyId.
   */
  com.google.protobuf.ByteString
      getPolicyIdBytes();

  /**
   * <pre>
   * The policy resource to be created. Client must not set the `Policy.name`
   * field.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   * <pre>
   * The policy resource to be created. Client must not set the `Policy.name`
   * field.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Policy policy = 3;</code>
   * @return The policy.
   */
  com.saltoapis.nebula.unit.v1.Policy getPolicy();
}
