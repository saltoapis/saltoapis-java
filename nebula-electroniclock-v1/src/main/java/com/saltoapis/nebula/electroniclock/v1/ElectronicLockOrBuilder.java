// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/electroniclock/v1/electronic_lock.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.electroniclock.v1;

public interface ElectronicLockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.electroniclock.v1.ElectronicLock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the electronic lock. It must have the format of
   * `installations/&#42;&#47;electronic-locks/&#42;`. For example:
   * `installations/surelock-homes-hq/electronic-locks/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the electronic lock. It must have the format of
   * `installations/&#42;&#47;electronic-locks/&#42;`. For example:
   * `installations/surelock-homes-hq/electronic-locks/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the electronic lock.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the electronic lock.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, electronic locks and so on.
   * </pre>
   *
   * <code>optional string device_id = 3;</code>
   * @return Whether the deviceId field is set.
   */
  boolean hasDeviceId();
  /**
   * <pre>
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, electronic locks and so on.
   * </pre>
   *
   * <code>optional string device_id = 3;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, electronic locks and so on.
   * </pre>
   *
   * <code>optional string device_id = 3;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <pre>
   * Parent name, when electronic lock is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   * <pre>
   * Parent name, when electronic lock is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return The gateway.
   */
  java.lang.String getGateway();
  /**
   * <pre>
   * Parent name, when electronic lock is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return The bytes for gateway.
   */
  com.google.protobuf.ByteString
      getGatewayBytes();

  /**
   * <pre>
   * Parent name, when electronic lock is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return Whether the extender field is set.
   */
  boolean hasExtender();
  /**
   * <pre>
   * Parent name, when electronic lock is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return The extender.
   */
  java.lang.String getExtender();
  /**
   * <pre>
   * Parent name, when electronic lock is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return The bytes for extender.
   */
  com.google.protobuf.ByteString
      getExtenderBytes();

  /**
   * <pre>
   * The access point that the electronic lock gives coverage to.
   * </pre>
   *
   * <code>string access_point = 6;</code>
   * @return The accessPoint.
   */
  java.lang.String getAccessPoint();
  /**
   * <pre>
   * The access point that the electronic lock gives coverage to.
   * </pre>
   *
   * <code>string access_point = 6;</code>
   * @return The bytes for accessPoint.
   */
  com.google.protobuf.ByteString
      getAccessPointBytes();

  /**
   * <pre>
   * Indicates whether this electronic lock has been initialized or not. This
   * field cannot be modified using a standard
   * [`UpdateElectronicLock`][salto.nebula.electroniclock.v1.ElectronicLockService.UpdateElectronicLock]
   * operation. To change the value of this field, you must call
   * [`InitializeElectronicLock`][salto.nebula.electroniclock.v1.ElectronicLockService.InitializeElectronicLock].
   *
   * If the value is `false` also applies to the case where the
   * initialization process has been initiated but where it has not finished.
   * </pre>
   *
   * <code>bool initialized = 7;</code>
   * @return The initialized.
   */
  boolean getInitialized();

  /**
   * <pre>
   * Device metadata contains information about a device hardware and firmware.
   * </pre>
   *
   * <code>.salto.nebula.type.DeviceMetadata device_metadata = 15;</code>
   * @return Whether the deviceMetadata field is set.
   */
  boolean hasDeviceMetadata();
  /**
   * <pre>
   * Device metadata contains information about a device hardware and firmware.
   * </pre>
   *
   * <code>.salto.nebula.type.DeviceMetadata device_metadata = 15;</code>
   * @return The deviceMetadata.
   */
  com.saltoapis.nebula.type.DeviceMetadata getDeviceMetadata();
  /**
   * <pre>
   * Device metadata contains information about a device hardware and firmware.
   * </pre>
   *
   * <code>.salto.nebula.type.DeviceMetadata device_metadata = 15;</code>
   */
  com.saltoapis.nebula.type.DeviceMetadataOrBuilder getDeviceMetadataOrBuilder();

  /**
   * <pre>
   * Indicates whether this electronic lock has pending updates or not. This
   * could be because there was a pending configuration or a firmware update
   * and is conditionally set based on the current installation settings.
   * </pre>
   *
   * <code>bool outdated = 8;</code>
   * @return The outdated.
   */
  boolean getOutdated();

  /**
   * <pre>
   * Indicates whether this electronic lock is connected or not. It's
   * considered connected if there has been at least one communication with it
   * within the last 10 minutes. The property is left unset if it is an
   * offline electronic lock.
   * </pre>
   *
   * <code>optional bool connected = 9;</code>
   * @return Whether the connected field is set.
   */
  boolean hasConnected();
  /**
   * <pre>
   * Indicates whether this electronic lock is connected or not. It's
   * considered connected if there has been at least one communication with it
   * within the last 10 minutes. The property is left unset if it is an
   * offline electronic lock.
   * </pre>
   *
   * <code>optional bool connected = 9;</code>
   * @return The connected.
   */
  boolean getConnected();

  /**
   * <pre>
   * Indicates whether the battery of this electronic lock is low, and needs
   * replacing, or is normal and doesn't need replacing.
   * </pre>
   *
   * <code>bool low_battery = 10;</code>
   * @return The lowBattery.
   */
  boolean getLowBattery();

  /**
   * <pre>
   * The last time an event was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 11;</code>
   * @return Whether the lastEventTime field is set.
   */
  boolean hasLastEventTime();
  /**
   * <pre>
   * The last time an event was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 11;</code>
   * @return The lastEventTime.
   */
  com.google.protobuf.Timestamp getLastEventTime();
  /**
   * <pre>
   * The last time an event was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEventTimeOrBuilder();

  /**
   * <pre>
   * Calibration settings of an electronic lock. This only applies to
   * electronic locks that must be calibrated once mounted to adapt to the
   * door's specific characteristics. For example, certain motorized
   * electronic locks need to be calibrated so they can learn the different
   * positions of a door.
   * </pre>
   *
   * <code>optional bytes calibration_settings = 12;</code>
   * @return Whether the calibrationSettings field is set.
   */
  boolean hasCalibrationSettings();
  /**
   * <pre>
   * Calibration settings of an electronic lock. This only applies to
   * electronic locks that must be calibrated once mounted to adapt to the
   * door's specific characteristics. For example, certain motorized
   * electronic locks need to be calibrated so they can learn the different
   * positions of a door.
   * </pre>
   *
   * <code>optional bytes calibration_settings = 12;</code>
   * @return The calibrationSettings.
   */
  com.google.protobuf.ByteString getCalibrationSettings();

  /**
   * <pre>
   * Indicates whether the electronic lock operates by turning in one
   * direction until it reaches the carriage end, or not.
   * For example, this could apply to electronic locks that are unaware of the
   * carriage's endpoint or those that can lose their position, as seen in
   * double clutch cylinders.
   * </pre>
   *
   * <code>optional bool force_rotate_carriage_end = 13;</code>
   * @return Whether the forceRotateCarriageEnd field is set.
   */
  boolean hasForceRotateCarriageEnd();
  /**
   * <pre>
   * Indicates whether the electronic lock operates by turning in one
   * direction until it reaches the carriage end, or not.
   * For example, this could apply to electronic locks that are unaware of the
   * carriage's endpoint or those that can lose their position, as seen in
   * double clutch cylinders.
   * </pre>
   *
   * <code>optional bool force_rotate_carriage_end = 13;</code>
   * @return The forceRotateCarriageEnd.
   */
  boolean getForceRotateCarriageEnd();

  /**
   * <pre>
   * If applicable, the duration the motorized lock's hold-back latch remains
   * engaged before the latch closes.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration hold_back_latch_duration = 14;</code>
   * @return Whether the holdBackLatchDuration field is set.
   */
  boolean hasHoldBackLatchDuration();
  /**
   * <pre>
   * If applicable, the duration the motorized lock's hold-back latch remains
   * engaged before the latch closes.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration hold_back_latch_duration = 14;</code>
   * @return The holdBackLatchDuration.
   */
  com.google.protobuf.Duration getHoldBackLatchDuration();
  /**
   * <pre>
   * If applicable, the duration the motorized lock's hold-back latch remains
   * engaged before the latch closes.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration hold_back_latch_duration = 14;</code>
   */
  com.google.protobuf.DurationOrBuilder getHoldBackLatchDurationOrBuilder();

  com.saltoapis.nebula.electroniclock.v1.ElectronicLock.ParentDeviceCase getParentDeviceCase();
}
