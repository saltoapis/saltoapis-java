// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/electroniclock/v1/electronic_lock.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.electroniclock.v1;

public interface GenerateFirmwareDownloadUriResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.GenerateFirmwareDownloadUriResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI to download the firmware bundle. The URI will be valid for 15
   * minutes.
   * </pre>
   *
   * <code>string download_uri = 1;</code>
   * @return The downloadUri.
   */
  java.lang.String getDownloadUri();
  /**
   * <pre>
   * The URI to download the firmware bundle. The URI will be valid for 15
   * minutes.
   * </pre>
   *
   * <code>string download_uri = 1;</code>
   * @return The bytes for downloadUri.
   */
  com.google.protobuf.ByteString
      getDownloadUriBytes();

  /**
   * <pre>
   * Digest of the file to be download. This can be used to cache the file and
   * avoid downloading it multiple times.
   * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
   * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
   * </pre>
   *
   * <code>string digest = 2;</code>
   * @return The digest.
   */
  java.lang.String getDigest();
  /**
   * <pre>
   * Digest of the file to be download. This can be used to cache the file and
   * avoid downloading it multiple times.
   * The digest has the following format: `&lt;algorithm&gt;:&lt;digest&gt;`.
   * For example: `sha256:8ff2483f2fbaa6c8dfd4e3556dbde298eb5e342b5e46f84eabdccc8e1cbe2d5a`.
   * </pre>
   *
   * <code>string digest = 2;</code>
   * @return The bytes for digest.
   */
  com.google.protobuf.ByteString
      getDigestBytes();
}
