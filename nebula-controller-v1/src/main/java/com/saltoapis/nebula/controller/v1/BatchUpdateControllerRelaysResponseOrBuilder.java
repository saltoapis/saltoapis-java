// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

public interface BatchUpdateControllerRelaysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.BatchUpdateControllerRelaysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The controller relay resources updated.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.ControllerRelay controller_relays = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.controller.v1.ControllerRelay> 
      getControllerRelaysList();
  /**
   * <pre>
   * The controller relay resources updated.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.ControllerRelay controller_relays = 1;</code>
   */
  com.saltoapis.nebula.controller.v1.ControllerRelay getControllerRelays(int index);
  /**
   * <pre>
   * The controller relay resources updated.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.ControllerRelay controller_relays = 1;</code>
   */
  int getControllerRelaysCount();
  /**
   * <pre>
   * The controller relay resources updated.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.ControllerRelay controller_relays = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.controller.v1.ControllerRelayOrBuilder> 
      getControllerRelaysOrBuilderList();
  /**
   * <pre>
   * The controller relay resources updated.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.ControllerRelay controller_relays = 1;</code>
   */
  com.saltoapis.nebula.controller.v1.ControllerRelayOrBuilder getControllerRelaysOrBuilder(
      int index);
}
