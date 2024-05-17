// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.event.v1;

public interface UserAccessRightCreatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.UserAccessRightCreated)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Access right's user association created.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * Access right's user association created.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return The user.
   */
  com.saltoapis.nebula.user.v1.User getUser();

  /**
   * <pre>
   * User's access right association created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 2;</code>
   * @return Whether the accessRight field is set.
   */
  boolean hasAccessRight();
  /**
   * <pre>
   * User's access right association created.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 2;</code>
   * @return The accessRight.
   */
  com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight();
}
