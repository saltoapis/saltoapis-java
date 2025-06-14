// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

public interface BatchCreateControllerRelaysRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.BatchCreateControllerRelaysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where the controller relays are to be created.
   * For example: `installations/surelock-homes-hq/controllers/dancing-men`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where the controller relays are to be created.
   * For example: `installations/surelock-homes-hq/controllers/dancing-men`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 controller relays can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.CreateControllerRelayRequest requests = 2;</code>
   */
  java.util.List<com.saltoapis.nebula.controller.v1.CreateControllerRelayRequest> 
      getRequestsList();
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 controller relays can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.CreateControllerRelayRequest requests = 2;</code>
   */
  com.saltoapis.nebula.controller.v1.CreateControllerRelayRequest getRequests(int index);
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 controller relays can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.CreateControllerRelayRequest requests = 2;</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 controller relays can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.CreateControllerRelayRequest requests = 2;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.controller.v1.CreateControllerRelayRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 controller relays can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.controller.v1.CreateControllerRelayRequest requests = 2;</code>
   */
  com.saltoapis.nebula.controller.v1.CreateControllerRelayRequestOrBuilder getRequestsOrBuilder(
      int index);
}
