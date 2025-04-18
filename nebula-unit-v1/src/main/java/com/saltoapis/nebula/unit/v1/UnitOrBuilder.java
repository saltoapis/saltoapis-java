// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/unit/v1/unit.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.unit.v1;

public interface UnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.unit.v1.Unit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the unit. It must have the format
   * `installations/&#42;&#47;units/&#42;`, for example:
   * `installations/surelock-homes-hq/units/101`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Time the unit was moved in.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp move_in_time = 3;</code>
   * @return Whether the moveInTime field is set.
   */
  boolean hasMoveInTime();
  /**
   * <pre>
   * Time the unit was moved in.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp move_in_time = 3;</code>
   * @return The moveInTime.
   */
  com.google.protobuf.Timestamp getMoveInTime();
  /**
   * <pre>
   * Time the unit was moved in.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp move_in_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMoveInTimeOrBuilder();

  /**
   * <pre>
   * Time the unit was moved out.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp move_out_time = 4;</code>
   * @return Whether the moveOutTime field is set.
   */
  boolean hasMoveOutTime();
  /**
   * <pre>
   * Time the unit was moved out.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp move_out_time = 4;</code>
   * @return The moveOutTime.
   */
  com.google.protobuf.Timestamp getMoveOutTime();
  /**
   * <pre>
   * Time the unit was moved out.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp move_out_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMoveOutTimeOrBuilder();

  /**
   * <pre>
   * The privacy settings of the unit. Can either be enabled or disabled.
   * If enabled, owners and installation managers can see neither events
   * nor users that belong to the unit.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Unit.PrivacySettings privacy_settings = 5;</code>
   * @return Whether the privacySettings field is set.
   */
  boolean hasPrivacySettings();
  /**
   * <pre>
   * The privacy settings of the unit. Can either be enabled or disabled.
   * If enabled, owners and installation managers can see neither events
   * nor users that belong to the unit.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Unit.PrivacySettings privacy_settings = 5;</code>
   * @return The privacySettings.
   */
  com.saltoapis.nebula.unit.v1.Unit.PrivacySettings getPrivacySettings();
  /**
   * <pre>
   * The privacy settings of the unit. Can either be enabled or disabled.
   * If enabled, owners and installation managers can see neither events
   * nor users that belong to the unit.
   * </pre>
   *
   * <code>.salto.nebula.unit.v1.Unit.PrivacySettings privacy_settings = 5;</code>
   */
  com.saltoapis.nebula.unit.v1.Unit.PrivacySettingsOrBuilder getPrivacySettingsOrBuilder();
}
