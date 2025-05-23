// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/digitalkey/v1/digital_key.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.digitalkey.v1;

public interface DigitalKeyAccessPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.digitalkey.v1.DigitalKeyAccessPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the access point. It must have the format
   * `digital-keys/{digital-key}/access-points/&#42;`. For example:
   * `digital-keys/baker-street-key/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the access point. It must have the format
   * `digital-keys/{digital-key}/access-points/&#42;`. For example:
   * `digital-keys/baker-street-key/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the access point.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the access point.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The device which gives coverage to the access point.
   * </pre>
   *
   * <code>string device_id = 3;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * The device which gives coverage to the access point.
   * </pre>
   *
   * <code>string device_id = 3;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();
}
