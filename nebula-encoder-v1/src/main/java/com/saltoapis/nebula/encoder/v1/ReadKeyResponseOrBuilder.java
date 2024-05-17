// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/encoder/v1/encoder.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.encoder.v1;

public interface ReadKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.encoder.v1.ReadKeyResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Card key reference, belonging to a user.
   * </pre>
   *
   * <code>string card_key = 1;</code>
   * @return Whether the cardKey field is set.
   */
  boolean hasCardKey();
  /**
   * <pre>
   * Card key reference, belonging to a user.
   * </pre>
   *
   * <code>string card_key = 1;</code>
   * @return The cardKey.
   */
  java.lang.String getCardKey();
  /**
   * <pre>
   * Card key reference, belonging to a user.
   * </pre>
   *
   * <code>string card_key = 1;</code>
   * @return The bytes for cardKey.
   */
  com.google.protobuf.ByteString
      getCardKeyBytes();

  public com.saltoapis.nebula.encoder.v1.ReadKeyResponse.KeyCase getKeyCase();
}
