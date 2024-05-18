// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/openingmodeschedule/v1/opening_mode_schedule.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.openingmodeschedule.v1;

public interface CreateOpeningModeScheduleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where to create the opening mode
   * schedule. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where to create the opening mode
   * schedule. For example: `installations/surelock-homes-hq`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The opening mode schedule ID to use for this opening mode schedule. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string opening_mode_schedule_id = 2;</code>
   * @return The openingModeScheduleId.
   */
  java.lang.String getOpeningModeScheduleId();
  /**
   * <pre>
   * The opening mode schedule ID to use for this opening mode schedule. In
   * case it's empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>string opening_mode_schedule_id = 2;</code>
   * @return The bytes for openingModeScheduleId.
   */
  com.google.protobuf.ByteString
      getOpeningModeScheduleIdBytes();

  /**
   * <pre>
   * The opening mode schedule resource to be created. Client must not set the
   * `OpeningModeSchedule.name` field.
   * </pre>
   *
   * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
   * @return Whether the openingModeSchedule field is set.
   */
  boolean hasOpeningModeSchedule();
  /**
   * <pre>
   * The opening mode schedule resource to be created. Client must not set the
   * `OpeningModeSchedule.name` field.
   * </pre>
   *
   * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
   * @return The openingModeSchedule.
   */
  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule getOpeningModeSchedule();
  /**
   * <pre>
   * The opening mode schedule resource to be created. Client must not set the
   * `OpeningModeSchedule.name` field.
   * </pre>
   *
   * <code>.salto.nebula.openingmodeschedule.v1.OpeningModeSchedule opening_mode_schedule = 3;</code>
   */
  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleOrBuilder getOpeningModeScheduleOrBuilder();
}