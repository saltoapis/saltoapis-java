// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/installation/v1/installation.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.installation.v1;

public interface PolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the policy. It must have the format of
   * `installations/&#42;&#47;iam-policies`. For example:
   * `installations/surelock-homes-hq/iam-policies/standard`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the policy. It must have the format of
   * `installations/&#42;&#47;iam-policies`. For example:
   * `installations/surelock-homes-hq/iam-policies/standard`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Specifies the identity requesting access to this resource.
   * </pre>
   *
   * <code>string member = 2;</code>
   * @return The member.
   */
  java.lang.String getMember();
  /**
   * <pre>
   * Specifies the identity requesting access to this resource.
   * </pre>
   *
   * <code>string member = 2;</code>
   * @return The bytes for member.
   */
  com.google.protobuf.ByteString
      getMemberBytes();

  /**
   * <pre>
   * The names of the roles this policy grants.
   * </pre>
   *
   * <code>repeated string roles = 3;</code>
   * @return A list containing the roles.
   */
  java.util.List<java.lang.String>
      getRolesList();
  /**
   * <pre>
   * The names of the roles this policy grants.
   * </pre>
   *
   * <code>repeated string roles = 3;</code>
   * @return The count of roles.
   */
  int getRolesCount();
  /**
   * <pre>
   * The names of the roles this policy grants.
   * </pre>
   *
   * <code>repeated string roles = 3;</code>
   * @param index The index of the element to return.
   * @return The roles at the given index.
   */
  java.lang.String getRoles(int index);
  /**
   * <pre>
   * The names of the roles this policy grants.
   * </pre>
   *
   * <code>repeated string roles = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the roles at the given index.
   */
  com.google.protobuf.ByteString
      getRolesBytes(int index);
}
