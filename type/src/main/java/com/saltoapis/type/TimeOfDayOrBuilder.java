// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/type/time_of_day.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.type;

public interface TimeOfDayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.type.TimeOfDay)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23.
   * </pre>
   *
   * <code>int32 hours = 1;</code>
   * @return The hours.
   */
  int getHours();

  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2;</code>
   * @return The minutes.
   */
  int getMinutes();

  /**
   * <pre>
   * Seconds of minutes of the time. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 seconds = 3;</code>
   * @return The seconds.
   */
  int getSeconds();

  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4;</code>
   * @return The nanos.
   */
  int getNanos();
}
