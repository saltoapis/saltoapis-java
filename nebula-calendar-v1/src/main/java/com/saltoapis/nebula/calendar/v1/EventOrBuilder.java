// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/calendar/v1/calendar.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.calendar.v1;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.calendar.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the calendar event. It must have the
   * format of `installations/&#42;&#47;calendars/&#42;&#47;events/&#42;`. For example:
   * `installations/surelock-homes-hq/calendars/gmt/events/twelvetide`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the calendar event. It must have the
   * format of `installations/&#42;&#47;calendars/&#42;&#47;events/&#42;`. For example:
   * `installations/surelock-homes-hq/calendars/gmt/events/twelvetide`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Day type.
   * </pre>
   *
   * <code>.salto.nebula.type.DayType day_type = 2;</code>
   * @return The enum numeric value on the wire for dayType.
   */
  int getDayTypeValue();
  /**
   * <pre>
   * Day type.
   * </pre>
   *
   * <code>.salto.nebula.type.DayType day_type = 2;</code>
   * @return The dayType.
   */
  com.saltoapis.nebula.type.DayType getDayType();

  /**
   * <pre>
   * Start date.
   * </pre>
   *
   * <code>.salto.type.Date start_date = 3;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Start date.
   * </pre>
   *
   * <code>.salto.type.Date start_date = 3;</code>
   * @return The startDate.
   */
  com.saltoapis.type.Date getStartDate();
  /**
   * <pre>
   * Start date.
   * </pre>
   *
   * <code>.salto.type.Date start_date = 3;</code>
   */
  com.saltoapis.type.DateOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * End date.
   * </pre>
   *
   * <code>.salto.type.Date end_date = 4;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * End date.
   * </pre>
   *
   * <code>.salto.type.Date end_date = 4;</code>
   * @return The endDate.
   */
  com.saltoapis.type.Date getEndDate();
  /**
   * <pre>
   * End date.
   * </pre>
   *
   * <code>.salto.type.Date end_date = 4;</code>
   */
  com.saltoapis.type.DateOrBuilder getEndDateOrBuilder();
}
