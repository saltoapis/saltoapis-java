// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/rpc/error_details.proto
// Protobuf Java Version: 4.29.2

package com.google.rpc;

public interface LocalizedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.LocalizedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The locale used following the specification defined at
   * http://www.rfc-editor.org/rfc/bcp/bcp47.txt.
   * Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>string locale = 1;</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * The locale used following the specification defined at
   * http://www.rfc-editor.org/rfc/bcp/bcp47.txt.
   * Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>string locale = 1;</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
