// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.installation.v1;

public interface DeleteInstallationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.DeleteInstallationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the installation to be soft deleted. For example:
   * `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the installation to be soft deleted. For example:
   * `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set, validate the request but do not actually delete the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 2;</code>
   * @return Whether the validateOnly field is set.
   */
  boolean hasValidateOnly();
  /**
   * <pre>
   * If set, validate the request but do not actually delete the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * The number of hours to wait before permanently deleting the installation.
   * </pre>
   *
   * <code>optional int32 delay_hours = 3;</code>
   * @return Whether the delayHours field is set.
   */
  boolean hasDelayHours();
  /**
   * <pre>
   * The number of hours to wait before permanently deleting the installation.
   * </pre>
   *
   * <code>optional int32 delay_hours = 3;</code>
   * @return The delayHours.
   */
  int getDelayHours();
}
