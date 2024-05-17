// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/file/v1/file.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.file.v1;

public interface CreateFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.file.v1.CreateFileRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where to create the file. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where to create the file. For
   * example, `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
