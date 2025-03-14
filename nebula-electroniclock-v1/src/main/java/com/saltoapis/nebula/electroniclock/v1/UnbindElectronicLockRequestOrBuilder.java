// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/electroniclock/v1/electronic_lock.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.electroniclock.v1;

public interface UnbindElectronicLockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.UnbindElectronicLockRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the electronic lock to be bound. For example:
   * `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the electronic lock to be bound. For example:
   * `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, the device identifier is removed (unbound) from the
   * electronic lock. Otherwise, the request will only work if the electronic
   * lock isn't bound to any previous device identifier.
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
