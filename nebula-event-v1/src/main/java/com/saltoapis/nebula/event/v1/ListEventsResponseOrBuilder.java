// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/event.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

public interface ListEventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.ListEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.event.v1.Event events = 1;</code>
   */
  java.util.List<com.saltoapis.nebula.event.v1.Event> 
      getEventsList();
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.event.v1.Event events = 1;</code>
   */
  com.saltoapis.nebula.event.v1.Event getEvents(int index);
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.event.v1.Event events = 1;</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.event.v1.Event events = 1;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.event.v1.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items returned based on the `page_size` field
   * in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.event.v1.Event events = 1;</code>
   */
  com.saltoapis.nebula.event.v1.EventOrBuilder getEventsOrBuilder(
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
