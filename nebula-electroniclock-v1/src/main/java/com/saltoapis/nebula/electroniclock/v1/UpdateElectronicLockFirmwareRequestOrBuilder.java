// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/electroniclock/v1/electronic_lock.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.electroniclock.v1;

public interface UpdateElectronicLockFirmwareRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the electronic lock whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string electronic_lock = 1;</code>
   * @return The electronicLock.
   */
  java.lang.String getElectronicLock();
  /**
   * <pre>
   * The resource name of the electronic lock whose firmware will be updated. For
   * example:
   * `installations/surelock-homes-hq/electronic-locks/baker-street-entrance`.
   * </pre>
   *
   * <code>string electronic_lock = 1;</code>
   * @return The bytes for electronicLock.
   */
  com.google.protobuf.ByteString
      getElectronicLockBytes();
}
