// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/calendar/v1/calendar.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.calendar.v1;

public interface UpdateCalendarRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.calendar.v1.UpdateCalendarRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The calendar resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.calendar.v1.Calendar calendar = 1;</code>
   * @return Whether the calendar field is set.
   */
  boolean hasCalendar();
  /**
   * <pre>
   * The calendar resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.calendar.v1.Calendar calendar = 1;</code>
   * @return The calendar.
   */
  com.saltoapis.nebula.calendar.v1.Calendar getCalendar();
  /**
   * <pre>
   * The calendar resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.calendar.v1.Calendar calendar = 1;</code>
   */
  com.saltoapis.nebula.calendar.v1.CalendarOrBuilder getCalendarOrBuilder();

  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}