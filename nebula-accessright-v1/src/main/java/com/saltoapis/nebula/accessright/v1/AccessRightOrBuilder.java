// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accessright/v1/access_right.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.accessright.v1;

public interface AccessRightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.AccessRight)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the access right. It must have the format
   * of `installations/&#42;&#47;access-rights/&#42;`. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the access right. It must have the format
   * of `installations/&#42;&#47;access-rights/&#42;`. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the access right.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the access right.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Activation time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp activate_time = 3;</code>
   * @return Whether the activateTime field is set.
   */
  boolean hasActivateTime();
  /**
   * <pre>
   * Activation time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp activate_time = 3;</code>
   * @return The activateTime.
   */
  com.google.protobuf.Timestamp getActivateTime();

  /**
   * <pre>
   * Expiration time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4;</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * Expiration time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4;</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();

  /**
   * <pre>
   * Schedules in which this access right is applied.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 5;</code>
   */
  java.util.List<com.saltoapis.nebula.type.Schedule> 
      getSchedulesList();
  /**
   * <pre>
   * Schedules in which this access right is applied.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 5;</code>
   */
  com.saltoapis.nebula.type.Schedule getSchedules(int index);
  /**
   * <pre>
   * Schedules in which this access right is applied.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 5;</code>
   */
  int getSchedulesCount();
}
