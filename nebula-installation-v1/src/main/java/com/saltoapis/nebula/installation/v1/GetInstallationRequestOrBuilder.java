// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.installation.v1;

public interface GetInstallationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.GetInstallationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested installation resource. For example:
   * `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested installation resource. For example:
   * `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}