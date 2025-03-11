// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/openingmodeschedule/v1/opening_mode_schedule.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.openingmodeschedule.v1;

public interface OpeningModeScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.openingmodeschedule.v1.OpeningModeSchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the opening mode schedule. It must have the format of
   * `installations/&#42;&#47;opening-mode-schedules/&#42;`. For example:
   * `installations/surelock-homes-hq/opening-mode-schedules/office-24-7`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the opening mode schedule. It must have the format of
   * `installations/&#42;&#47;opening-mode-schedules/&#42;`. For example:
   * `installations/surelock-homes-hq/opening-mode-schedules/office-24-7`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the opening mode schedule.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the opening mode schedule.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Days when the opening mode schedule is valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day days = 3;</code>
   */
  java.util.List<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day> 
      getDaysList();
  /**
   * <pre>
   * Days when the opening mode schedule is valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day days = 3;</code>
   */
  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day getDays(int index);
  /**
   * <pre>
   * Days when the opening mode schedule is valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day days = 3;</code>
   */
  int getDaysCount();
  /**
   * <pre>
   * Days when the opening mode schedule is valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day days = 3;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.DayOrBuilder> 
      getDaysOrBuilderList();
  /**
   * <pre>
   * Days when the opening mode schedule is valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule.Day days = 3;</code>
   */
  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.DayOrBuilder getDaysOrBuilder(
      int index);
}
