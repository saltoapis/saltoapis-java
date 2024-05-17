// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/intercom/v1/intercom.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.intercom.v1;

public interface ModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.intercom.v1.Model)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the model. It must have the format `brands/&#42;&#47;models/&#42;`.
   * For example: `brands/bticino/models/344400`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the model. It must have the format `brands/&#42;&#47;models/&#42;`.
   * For example: `brands/bticino/models/344400`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Model display name. For example: 344400.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Model display name. For example: 344400.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Intercom supports ring to open opening mode.
   * </pre>
   *
   * <code>bool ring_to_open = 4;</code>
   * @return The ringToOpen.
   */
  boolean getRingToOpen();

  /**
   * <pre>
   * Intercom supports do not disturb opening mode.
   * </pre>
   *
   * <code>bool do_not_disturb = 5;</code>
   * @return The doNotDisturb.
   */
  boolean getDoNotDisturb();

  /**
   * <pre>
   * Time in which an opening is allowed after a call is received.
   * </pre>
   *
   * <code>int32 call_deadline_seconds = 6;</code>
   * @return The callDeadlineSeconds.
   */
  int getCallDeadlineSeconds();

  /**
   * <pre>
   * Time needed to wait after receiving a call before opening is permitted.
   * </pre>
   *
   * <code>int32 open_delay_seconds = 7;</code>
   * @return The openDelaySeconds.
   */
  int getOpenDelaySeconds();

  /**
   * <pre>
   * Settings for each colored wire inside the intercom casing.
   * </pre>
   *
   * <code>.salto.intercom.v1.Model.WireSettings wire_settings = 8;</code>
   * @return Whether the wireSettings field is set.
   */
  boolean hasWireSettings();
  /**
   * <pre>
   * Settings for each colored wire inside the intercom casing.
   * </pre>
   *
   * <code>.salto.intercom.v1.Model.WireSettings wire_settings = 8;</code>
   * @return The wireSettings.
   */
  com.saltoapis.intercom.v1.Model.WireSettings getWireSettings();

  /**
   * <pre>
   * Settings for each jumper inside the intercom casing.
   * </pre>
   *
   * <code>.salto.intercom.v1.Model.JumperSettings jumper_settings = 9;</code>
   * @return Whether the jumperSettings field is set.
   */
  boolean hasJumperSettings();
  /**
   * <pre>
   * Settings for each jumper inside the intercom casing.
   * </pre>
   *
   * <code>.salto.intercom.v1.Model.JumperSettings jumper_settings = 9;</code>
   * @return The jumperSettings.
   */
  com.saltoapis.intercom.v1.Model.JumperSettings getJumperSettings();

  /**
   * <pre>
   * Settings for the DIP switch inside the intercom casing.
   * </pre>
   *
   * <code>repeated bool dipswitch_settings = 10;</code>
   * @return A list containing the dipswitchSettings.
   */
  java.util.List<java.lang.Boolean> getDipswitchSettingsList();
  /**
   * <pre>
   * Settings for the DIP switch inside the intercom casing.
   * </pre>
   *
   * <code>repeated bool dipswitch_settings = 10;</code>
   * @return The count of dipswitchSettings.
   */
  int getDipswitchSettingsCount();
  /**
   * <pre>
   * Settings for the DIP switch inside the intercom casing.
   * </pre>
   *
   * <code>repeated bool dipswitch_settings = 10;</code>
   * @param index The index of the element to return.
   * @return The dipswitchSettings at the given index.
   */
  boolean getDipswitchSettings(int index);
}
