// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.installation.v1;

public interface UpdatePolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.UpdatePolicyRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The policy resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Policy policy = 1;</code>
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   * <pre>
   * The policy resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Policy policy = 1;</code>
   * @return The policy.
   */
  com.saltoapis.nebula.installation.v1.Policy getPolicy();

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
}
