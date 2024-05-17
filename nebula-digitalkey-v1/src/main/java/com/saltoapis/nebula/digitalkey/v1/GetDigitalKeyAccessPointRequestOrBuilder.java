// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/digitalkey/v1/digital_key.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.digitalkey.v1;

public interface GetDigitalKeyAccessPointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `digital-keys/baker-street-key/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested access point resource. For example:
   * `digital-keys/baker-street-key/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
