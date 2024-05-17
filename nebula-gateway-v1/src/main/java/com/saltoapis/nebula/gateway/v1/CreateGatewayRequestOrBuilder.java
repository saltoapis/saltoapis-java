// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/gateway/v1/gateway.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.gateway.v1;

public interface CreateGatewayRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.gateway.v1.CreateGatewayRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where to create the gateway. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where to create the gateway. For
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
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @return Whether the gatewayId field is set.
   */
  boolean hasGatewayId();
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @return The gatewayId.
   */
  java.lang.String getGatewayId();
  /**
   * <pre>
   * The gateway ID to use for this gateway. In case it's empty the
   * server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string gateway_id = 2;</code>
   * @return The bytes for gatewayId.
   */
  com.google.protobuf.ByteString
      getGatewayIdBytes();

  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   * <pre>
   * The gateway resource to be created. Client must not set the
   * `Gateway.name` field.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.Gateway gateway = 3;</code>
   * @return The gateway.
   */
  com.saltoapis.nebula.gateway.v1.Gateway getGateway();
}
