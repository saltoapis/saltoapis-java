// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.installation.v1;

public interface GetSubscriptionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.GetSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested subscription resource. For example:
   * `installations/surelock-homes-hq/subscription`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested subscription resource. For example:
   * `installations/surelock-homes-hq/subscription`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
