// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/electronickey/v1/electronic_key.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.electronickey.v1;

public interface UpdateElectronicKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electronickey.v1.UpdateElectronicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The electronic key resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.electronickey.v1.ElectronicKey electronic_key = 1;</code>
   * @return Whether the electronicKey field is set.
   */
  boolean hasElectronicKey();
  /**
   * <pre>
   * The electronic key resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.electronickey.v1.ElectronicKey electronic_key = 1;</code>
   * @return The electronicKey.
   */
  com.saltoapis.nebula.electronickey.v1.ElectronicKey getElectronicKey();
  /**
   * <pre>
   * The electronic key resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.electronickey.v1.ElectronicKey electronic_key = 1;</code>
   */
  com.saltoapis.nebula.electronickey.v1.ElectronicKeyOrBuilder getElectronicKeyOrBuilder();

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
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
