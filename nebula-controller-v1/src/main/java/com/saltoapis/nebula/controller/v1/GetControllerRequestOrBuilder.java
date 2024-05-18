// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/controller/v1/controller.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.controller.v1;

public interface GetControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.GetControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested controller resource. For example:
   * `installations/surelock-homes-hq/controllers/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested controller resource. For example:
   * `installations/surelock-homes-hq/controllers/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}