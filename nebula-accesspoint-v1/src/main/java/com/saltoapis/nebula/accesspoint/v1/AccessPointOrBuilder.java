// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/accesspoint/v1/access_point.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.accesspoint.v1;

public interface AccessPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accesspoint.v1.AccessPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the access point. It must have the format
   * `installations/&#42;&#47;access-points/&#42;`. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the access point. It must have the format
   * `installations/&#42;&#47;access-points/&#42;`. For example:
   * `installations/surelock-homes-hq/access-points/baker-street-entrance`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the access point.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the access point.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The opening mode to be used permanently.
   * </pre>
   *
   * <code>.salto.nebula.type.OpeningMode fixed = 3;</code>
   * @return Whether the fixed field is set.
   */
  boolean hasFixed();
  /**
   * <pre>
   * The opening mode to be used permanently.
   * </pre>
   *
   * <code>.salto.nebula.type.OpeningMode fixed = 3;</code>
   * @return The enum numeric value on the wire for fixed.
   */
  int getFixedValue();
  /**
   * <pre>
   * The opening mode to be used permanently.
   * </pre>
   *
   * <code>.salto.nebula.type.OpeningMode fixed = 3;</code>
   * @return The fixed.
   */
  com.saltoapis.nebula.type.OpeningMode getFixed();

  /**
   * <pre>
   * Reference to an opening mode schedule
   * </pre>
   *
   * <code>string schedule = 4;</code>
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   * <pre>
   * Reference to an opening mode schedule
   * </pre>
   *
   * <code>string schedule = 4;</code>
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   * <pre>
   * Reference to an opening mode schedule
   * </pre>
   *
   * <code>string schedule = 4;</code>
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString
      getScheduleBytes();

  /**
   * <pre>
   * Calendar reference assigned to this access point.
   * If not set, a calendar where all days are NORMAL will be used.
   * That's to say a regular calendar that doesn't have any
   * HOLIDAY or OTHER days added to it.
   * </pre>
   *
   * <code>optional string calendar = 5;</code>
   * @return Whether the calendar field is set.
   */
  boolean hasCalendar();
  /**
   * <pre>
   * Calendar reference assigned to this access point.
   * If not set, a calendar where all days are NORMAL will be used.
   * That's to say a regular calendar that doesn't have any
   * HOLIDAY or OTHER days added to it.
   * </pre>
   *
   * <code>optional string calendar = 5;</code>
   * @return The calendar.
   */
  java.lang.String getCalendar();
  /**
   * <pre>
   * Calendar reference assigned to this access point.
   * If not set, a calendar where all days are NORMAL will be used.
   * That's to say a regular calendar that doesn't have any
   * HOLIDAY or OTHER days added to it.
   * </pre>
   *
   * <code>optional string calendar = 5;</code>
   * @return The bytes for calendar.
   */
  com.google.protobuf.ByteString
      getCalendarBytes();

  /**
   * <pre>
   * Enables or disables card key updates. This parameter doesn't have any
   * effect on access points where its associated device is offline.
   * This field is optional to maintain backward compatibility. The server
   * checks for its presence to determine if clients are not updated and
   * assigns a default value if it's missing.
   * </pre>
   *
   * <code>optional bool card_key_updater = 6;</code>
   * @return Whether the cardKeyUpdater field is set.
   */
  boolean hasCardKeyUpdater();
  /**
   * <pre>
   * Enables or disables card key updates. This parameter doesn't have any
   * effect on access points where its associated device is offline.
   * This field is optional to maintain backward compatibility. The server
   * checks for its presence to determine if clients are not updated and
   * assigns a default value if it's missing.
   * </pre>
   *
   * <code>optional bool card_key_updater = 6;</code>
   * @return The cardKeyUpdater.
   */
  boolean getCardKeyUpdater();

  com.saltoapis.nebula.accesspoint.v1.AccessPoint.OpeningModeCase getOpeningModeCase();
}
