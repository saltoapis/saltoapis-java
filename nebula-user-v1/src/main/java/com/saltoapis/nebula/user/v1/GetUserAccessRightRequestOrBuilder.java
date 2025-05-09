// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/user/v1/user.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.user.v1;

public interface GetUserAccessRightRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.GetUserAccessRightRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the requested user's access right association resource. For
   * example:
   * `installations/surelock-homes-hq/users/john-watson/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested user's access right association resource. For
   * example:
   * `installations/surelock-homes-hq/users/john-watson/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
