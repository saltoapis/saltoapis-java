// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/extender/v1/extender.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.extender.v1;

public interface UnbindExtenderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.extender.v1.UnbindExtenderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the gateway to be unbound. For example:
   * `installations/surelock-homes-hq/extenders/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the gateway to be unbound. For example:
   * `installations/surelock-homes-hq/extenders/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
