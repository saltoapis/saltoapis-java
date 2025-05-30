// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/user/v1/user.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.user.v1;

public interface AppKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.AppKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the user's app key. It must have the
   * format of `installations/&#42;&#47;users/&#42;&#47;app-key`. For example:
   * `installations/surelock-homes-hq/users/john-watson/app-key`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the user's app key. It must have the
   * format of `installations/&#42;&#47;users/&#42;&#47;app-key`. For example:
   * `installations/surelock-homes-hq/users/john-watson/app-key`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Indicates whether this app key has been assigned or not. This field
   * cannot be modified using a standard
   * [`UpdateAppKey`][salto.nebula.user.v1.UserService.UpdateAppKey]
   * operation. To change the value of this field, you must call
   * [`AssignAppKey`][salto.nebula.user.v1.UserService.AssignAppKey].
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey.State state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Indicates whether this app key has been assigned or not. This field
   * cannot be modified using a standard
   * [`UpdateAppKey`][salto.nebula.user.v1.UserService.UpdateAppKey]
   * operation. To change the value of this field, you must call
   * [`AssignAppKey`][salto.nebula.user.v1.UserService.AssignAppKey].
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey.State state = 2;</code>
   * @return The state.
   */
  com.saltoapis.nebula.user.v1.AppKey.State getState();

  /**
   * <pre>
   * Indicates whether this app key has pending updates or not.
   * This field cannot be modified using a standard
   * [`UpdateAppKey`][salto.nebula.user.v1.UserService.UpdateAppKey]
   * operation. To change the value of this field, you must call
   * [`OutdateAppKey`][salto.nebula.user.v1.UserService.OutdateAppKey].
   * </pre>
   *
   * <code>bool outdated = 3;</code>
   * @return The outdated.
   */
  boolean getOutdated();
}
