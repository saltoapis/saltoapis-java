// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.encoder.v1;

public interface BindEncoderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.encoder.v1.BindEncoderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the encoder to be bound. For example:
   * `installations/surelock-homes-hq/encoders/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the encoder to be bound. For example:
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
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, electronic locks and so on.
   * </pre>
   *
   * <code>string device_id = 2;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, electronic locks and so on.
   * </pre>
   *
   * <code>string device_id = 2;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();
}