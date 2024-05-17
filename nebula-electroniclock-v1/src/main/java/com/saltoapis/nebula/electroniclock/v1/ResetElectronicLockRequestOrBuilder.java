// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electroniclock/v1/electronic_lock.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.electroniclock.v1;

public interface ResetElectronicLockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.ResetElectronicLockRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The resource name of the electronic lock to be reset. For example:
   * `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the electronic lock to be reset. For example:
   * `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
