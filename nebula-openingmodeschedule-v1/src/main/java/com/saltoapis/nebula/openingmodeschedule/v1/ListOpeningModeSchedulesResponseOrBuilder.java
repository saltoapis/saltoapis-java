// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/openingmodeschedule/v1/opening_mode_schedule.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.openingmodeschedule.v1;

public interface ListOpeningModeSchedulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `opening_mode_schedules` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedules = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> 
      getOpeningModeSchedulesList();
  /**
   * <pre>
   * The field name should match the noun `opening_mode_schedules` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedules = 1;</code>
   */
  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule getOpeningModeSchedules(int index);
  /**
   * <pre>
   * The field name should match the noun `opening_mode_schedules` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedules = 1;</code>
   */
  int getOpeningModeSchedulesCount();
  /**
   * <pre>
   * The field name should match the noun `opening_mode_schedules` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedules = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder> 
      getOpeningModeSchedulesOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `opening_mode_schedules` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedules = 1;</code>
   */
  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder getOpeningModeSchedulesOrBuilder(
      int index);

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