// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.event.v1;

public interface AccessPointLockedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.AccessPointLocked)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return The accessPoint.
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint();
  /**
   * <pre>
   * The access point that's been locked.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder();

  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   * @return The user.
   */
  com.saltoapis.nebula.user.v1.User getUser();
  /**
   * <pre>
   * The user who locked the access point.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 2;</code>
   */
  com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder();
}
