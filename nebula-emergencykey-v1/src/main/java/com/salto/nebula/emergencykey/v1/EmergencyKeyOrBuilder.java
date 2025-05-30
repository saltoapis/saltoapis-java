// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/emergencykey/v1/emergency_key.proto
// Protobuf Java Version: 4.29.2

package com.salto.nebula.emergencykey.v1;

public interface EmergencyKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.emergencykey.v1.EmergencyKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the emergency key. It must have the format
   * `installations/&#42;&#47;emergency-keys/&#42;`. For example:
   * `installations/surelock-homes-hq/emergency-keys/firefighters`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the emergency key. It must have the format
   * `installations/&#42;&#47;emergency-keys/&#42;`. For example:
   * `installations/surelock-homes-hq/emergency-keys/firefighters`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the emergency key.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the emergency key.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 3;</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 3;</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();
}
