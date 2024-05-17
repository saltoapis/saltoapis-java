// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/calendar/v1/calendar.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.calendar.v1;

public interface ListCalendarsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.calendar.v1.ListCalendarsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.calendar.v1.Calendar> 
      getCalendarsList();
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  com.saltoapis.nebula.calendar.v1.Calendar getCalendars(int index);
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  int getCalendarsCount();

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
