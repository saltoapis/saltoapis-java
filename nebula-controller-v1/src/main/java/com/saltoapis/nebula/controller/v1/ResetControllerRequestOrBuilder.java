// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

public interface ResetControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.ResetControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the controller to be reset. For example:
   * `installations/surelock-homes-hq/controllers/main-controller`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the controller to be reset. For example:
   * `installations/surelock-homes-hq/controllers/main-controller`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
