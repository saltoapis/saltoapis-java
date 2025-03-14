// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

public interface CreateControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.CreateControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where to create the controller. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where to create the controller. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The controller ID to use for this controller. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string controller_id = 2;</code>
   * @return Whether the controllerId field is set.
   */
  boolean hasControllerId();
  /**
   * <pre>
   * The controller ID to use for this controller. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string controller_id = 2;</code>
   * @return The controllerId.
   */
  java.lang.String getControllerId();
  /**
   * <pre>
   * The controller ID to use for this controller. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string controller_id = 2;</code>
   * @return The bytes for controllerId.
   */
  com.google.protobuf.ByteString
      getControllerIdBytes();

  /**
   * <pre>
   * The controller resource to be created. Client must not set the
   * `Controller.name` field.
   * </pre>
   *
   * <code>.salto.nebula.controller.v1.Controller controller = 3;</code>
   * @return Whether the controller field is set.
   */
  boolean hasController();
  /**
   * <pre>
   * The controller resource to be created. Client must not set the
   * `Controller.name` field.
   * </pre>
   *
   * <code>.salto.nebula.controller.v1.Controller controller = 3;</code>
   * @return The controller.
   */
  com.saltoapis.nebula.controller.v1.Controller getController();
  /**
   * <pre>
   * The controller resource to be created. Client must not set the
   * `Controller.name` field.
   * </pre>
   *
   * <code>.salto.nebula.controller.v1.Controller controller = 3;</code>
   */
  com.saltoapis.nebula.controller.v1.ControllerOrBuilder getControllerOrBuilder();
}
