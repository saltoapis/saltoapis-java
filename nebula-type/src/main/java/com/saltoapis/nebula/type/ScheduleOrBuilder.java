// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/type/schedule.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.type;

public interface ScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.type.Schedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Days when it's valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule.Day days = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.type.Schedule.Day> 
      getDaysList();
  /**
   * <pre>
   * Days when it's valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule.Day days = 1;</code>
   */
  com.saltoapis.nebula.type.Schedule.Day getDays(int index);
  /**
   * <pre>
   * Days when it's valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule.Day days = 1;</code>
   */
  int getDaysCount();
  /**
   * <pre>
   * Days when it's valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule.Day days = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.type.Schedule.DayOrBuilder> 
      getDaysOrBuilderList();
  /**
   * <pre>
   * Days when it's valid.
   * </pre>
   *
   * <code>repeated .salto.nebula.type.Schedule.Day days = 1;</code>
   */
  com.saltoapis.nebula.type.Schedule.DayOrBuilder getDaysOrBuilder(
      int index);

  /**
   * <pre>
   * Start time of day when schedule starts being valid.
   * </pre>
   *
   * <code>.salto.type.TimeOfDay start_time = 2;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Start time of day when schedule starts being valid.
   * </pre>
   *
   * <code>.salto.type.TimeOfDay start_time = 2;</code>
   * @return The startTime.
   */
  com.saltoapis.type.TimeOfDay getStartTime();
  /**
   * <pre>
   * Start time of day when schedule starts being valid.
   * </pre>
   *
   * <code>.salto.type.TimeOfDay start_time = 2;</code>
   */
  com.saltoapis.type.TimeOfDayOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * End time of day when schedule ends being valid.
   * </pre>
   *
   * <code>.salto.type.TimeOfDay end_time = 3;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * End time of day when schedule ends being valid.
   * </pre>
   *
   * <code>.salto.type.TimeOfDay end_time = 3;</code>
   * @return The endTime.
   */
  com.saltoapis.type.TimeOfDay getEndTime();
  /**
   * <pre>
   * End time of day when schedule ends being valid.
   * </pre>
   *
   * <code>.salto.type.TimeOfDay end_time = 3;</code>
   */
  com.saltoapis.type.TimeOfDayOrBuilder getEndTimeOrBuilder();
}
