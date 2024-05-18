// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.encoder.v1;

public interface UnbindEncoderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.encoder.v1.UnbindEncoderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the encoder to be unbound. For example:
   * `installations/surelock-homes-hq/encoders/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the encoder to be unbound. For example:
   * `installations/surelock-homes-hq/encoders/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, the device identifier is removed (unbound) from the
   * encoder. Otherwise, the request will only work if the encoder
   * isn't bound to any previous device identifier.
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}