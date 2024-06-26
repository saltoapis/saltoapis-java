// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/gateway/v1/gateway.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.gateway.v1;

public interface ResetGatewayRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.gateway.v1.ResetGatewayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the gateway to be reset. For example:
   * `installations/surelock-homes-hq/gateways/conan-doyle`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the gateway to be reset. For example:
   * `installations/surelock-homes-hq/gateways/conan-doyle`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
