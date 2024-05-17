// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/calendar/v1/calendar.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.calendar.v1;

public interface GetEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.calendar.v1.GetEventRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The name of the requested calendar event resource. For example:
   * `installations/surelock-homes-hq/calendars/gmt/events/twelvetide`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the requested calendar event resource. For example:
   * `installations/surelock-homes-hq/calendars/gmt/events/twelvetide`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
