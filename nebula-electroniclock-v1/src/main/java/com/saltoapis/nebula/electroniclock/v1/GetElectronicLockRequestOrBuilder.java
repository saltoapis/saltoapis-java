// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electroniclock/v1/electronic_lock.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.electroniclock.v1;

public interface GetElectronicLockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.GetElectronicLockRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested electronic lock resource. For example:
   * `installations/surelock-homes-hq/electronic-locks/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested electronic lock resource. For example:
   * `installations/surelock-homes-hq/electronic-locks/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}