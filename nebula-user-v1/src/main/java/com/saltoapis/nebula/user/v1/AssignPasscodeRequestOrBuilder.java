// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.user.v1;

public interface AssignPasscodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.AssignPasscodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested user's passcode to be assigned. For example:
   * `installations/surelock-homes-hq/users/john-watson/passcode`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested user's passcode to be assigned. For example:
   * `installations/surelock-homes-hq/users/john-watson/passcode`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
