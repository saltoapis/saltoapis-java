// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/types.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

public interface AppKeyCanceledOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.AppKeyCanceled)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * App key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * App key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return The user.
   */
  com.saltoapis.nebula.user.v1.User getUser();
  /**
   * <pre>
   * App key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   */
  com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder();

  /**
   * <pre>
   * App key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
   * @return Whether the appKey field is set.
   */
  boolean hasAppKey();
  /**
   * <pre>
   * App key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
   * @return The appKey.
   */
  com.saltoapis.nebula.user.v1.AppKey getAppKey();
  /**
   * <pre>
   * App key canceled.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 2;</code>
   */
  com.saltoapis.nebula.user.v1.AppKeyOrBuilder getAppKeyOrBuilder();
}
