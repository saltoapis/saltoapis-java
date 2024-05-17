// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.intercomadaptor.v1;

public interface InitializeIntercomAdaptorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The resource name of the intercom adaptor to be initialized. For example:
   * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the intercom adaptor to be initialized. For example:
   * `installations/surelock-homes-hq/intercom-adaptors/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
