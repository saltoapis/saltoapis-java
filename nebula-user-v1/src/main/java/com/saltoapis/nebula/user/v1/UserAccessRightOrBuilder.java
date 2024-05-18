// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.user.v1;

public interface UserAccessRightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.UserAccessRight)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the user's access right association. It
   * must have the format of `installations/&#42;&#47;users/&#42;&#47;access-rights/&#42;`. For
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
   * Resource name of the user's access right association. It
   * must have the format of `installations/&#42;&#47;users/&#42;&#47;access-rights/&#42;`. For
   * example:
   * `installations/surelock-homes-hq/users/john-watson/access-rights/baskerville`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The access right resource name to bind as an association to the parent
   * access point. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string access_right = 2;</code>
   * @return The accessRight.
   */
  java.lang.String getAccessRight();
  /**
   * <pre>
   * The access right resource name to bind as an association to the parent
   * access point. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string access_right = 2;</code>
   * @return The bytes for accessRight.
   */
  com.google.protobuf.ByteString
      getAccessRightBytes();

  /**
   * <pre>
   * Display name of the associated entity. In this case an access right.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the associated entity. In this case an access right.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The schedules for the user's access right. If set, this can only be more
   * restrictive than the schedules defined in the associated access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 4;</code>
   */
  java.util.List<com.saltoapis.nebula.type.Schedule> 
      getSchedulesList();
  /**
   * <pre>
   * The schedules for the user's access right. If set, this can only be more
   * restrictive than the schedules defined in the associated access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 4;</code>
   */
  com.saltoapis.nebula.type.Schedule getSchedules(int index);
  /**
   * <pre>
   * The schedules for the user's access right. If set, this can only be more
   * restrictive than the schedules defined in the associated access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 4;</code>
   */
  int getSchedulesCount();
  /**
   * <pre>
   * The schedules for the user's access right. If set, this can only be more
   * restrictive than the schedules defined in the associated access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 4;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.type.ScheduleOrBuilder> 
      getSchedulesOrBuilderList();
  /**
   * <pre>
   * The schedules for the user's access right. If set, this can only be more
   * restrictive than the schedules defined in the associated access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule schedules = 4;</code>
   */
  com.saltoapis.nebula.type.ScheduleOrBuilder getSchedulesOrBuilder(
      int index);

  /**
   * <pre>
   * The computed effective schedules for the user's access right based on the
   * given parent resource.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule effective_schedules = 5;</code>
   */
  java.util.List<com.saltoapis.nebula.type.Schedule> 
      getEffectiveSchedulesList();
  /**
   * <pre>
   * The computed effective schedules for the user's access right based on the
   * given parent resource.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule effective_schedules = 5;</code>
   */
  com.saltoapis.nebula.type.Schedule getEffectiveSchedules(int index);
  /**
   * <pre>
   * The computed effective schedules for the user's access right based on the
   * given parent resource.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule effective_schedules = 5;</code>
   */
  int getEffectiveSchedulesCount();
  /**
   * <pre>
   * The computed effective schedules for the user's access right based on the
   * given parent resource.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule effective_schedules = 5;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.type.ScheduleOrBuilder> 
      getEffectiveSchedulesOrBuilderList();
  /**
   * <pre>
   * The computed effective schedules for the user's access right based on the
   * given parent resource.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule effective_schedules = 5;</code>
   */
  com.saltoapis.nebula.type.ScheduleOrBuilder getEffectiveSchedulesOrBuilder(
      int index);
}