// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/calendar/v1/calendar.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.calendar.v1;

public interface DeleteCalendarRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.calendar.v1.DeleteCalendarRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the calendar to be deleted. For example:
   * `installations/surelock-homes-hq/calendars/gmt`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the calendar to be deleted. For example:
   * `installations/surelock-homes-hq/calendars/gmt`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}