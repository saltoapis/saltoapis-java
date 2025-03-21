// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/openingmodeschedule/v1/opening_mode_schedule.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.openingmodeschedule.v1;

public interface DeleteOpeningModeScheduleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the opening mode schedule to be deleted. For example:
   * `installations/surelock-homes-hq/opening-mode-schedules/office-24-7`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the opening mode schedule to be deleted. For example:
   * `installations/surelock-homes-hq/opening-mode-schedules/office-24-7`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
