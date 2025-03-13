// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.encoder.v1;

public interface InitializeEncoderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.encoder.v1.InitializeEncoderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the encoder to be initialized. For example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the encoder to be initialized. For example:
   * `installations/surelock-homes-hq/encoders/conan-doyle`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
