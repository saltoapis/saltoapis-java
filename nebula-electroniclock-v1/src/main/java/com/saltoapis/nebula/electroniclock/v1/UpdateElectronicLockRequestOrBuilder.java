// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electroniclock/v1/electronic_lock.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.electroniclock.v1;

public interface UpdateElectronicLockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.UpdateElectronicLockRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The electronic lock resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.electroniclock.v1.ElectronicLock electronic_lock = 1;</code>
   * @return Whether the electronicLock field is set.
   */
  boolean hasElectronicLock();
  /**
   * <pre>
   * The electronic lock resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.electroniclock.v1.ElectronicLock electronic_lock = 1;</code>
   * @return The electronicLock.
   */
  com.saltoapis.nebula.electroniclock.v1.ElectronicLock getElectronicLock();

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
