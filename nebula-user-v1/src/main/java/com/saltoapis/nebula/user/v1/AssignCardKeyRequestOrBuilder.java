// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.user.v1;

public interface AssignCardKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.AssignCardKeyRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The name of the requested user's card key to be assigned. For example:
   * `installations/surelock-homes-hq/users/john-watson/card-key`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested user's card key to be assigned. For example:
   * `installations/surelock-homes-hq/users/john-watson/card-key`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();
}
