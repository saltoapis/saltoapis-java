// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.intercomadaptor.v1;

public interface IntercomAdaptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.intercomadaptor.v1.IntercomAdaptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the intercom adaptor. It must have the format of
   * `installations/&#42;&#47;intercom-adaptors/&#42;`. For example:
   * `installations/surelock-homes-hq/intercom-adaptors/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the intercom adaptor. It must have the format of
   * `installations/&#42;&#47;intercom-adaptors/&#42;`. For example:
   * `installations/surelock-homes-hq/intercom-adaptors/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the intercom adaptor.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the intercom adaptor.
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
   * by SALTO, including gateways, extenders, intercom adaptors and so on.
   * </pre>
   *
   * <code>optional string device_id = 3;</code>
   * @return Whether the deviceId field is set.
   */
  boolean hasDeviceId();
  /**
   * <pre>
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, intercom adaptors and so on.
   * </pre>
   *
   * <code>optional string device_id = 3;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <pre>
   * Globally unique identifier that is used across all devices manufactured
   * by SALTO, including gateways, extenders, intercom adaptors and so on.
   * </pre>
   *
   * <code>optional string device_id = 3;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <pre>
   * Parent name, when intercom adaptor is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   * <pre>
   * Parent name, when intercom adaptor is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return The gateway.
   */
  java.lang.String getGateway();
  /**
   * <pre>
   * Parent name, when intercom adaptor is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return The bytes for gateway.
   */
  com.google.protobuf.ByteString
      getGatewayBytes();

  /**
   * <pre>
   * Parent name, when intercom adaptor is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return Whether the extender field is set.
   */
  boolean hasExtender();
  /**
   * <pre>
   * Parent name, when intercom adaptor is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return The extender.
   */
  java.lang.String getExtender();
  /**
   * <pre>
   * Parent name, when intercom adaptor is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return The bytes for extender.
   */
  com.google.protobuf.ByteString
      getExtenderBytes();

  /**
   * <pre>
   * The access points that the intercom adaptor gives coverage to.
   * </pre>
   *
   * <code>repeated .salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint access_points = 6;</code>
   */
  java.util.List<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint> 
      getAccessPointsList();
  /**
   * <pre>
   * The access points that the intercom adaptor gives coverage to.
   * </pre>
   *
   * <code>repeated .salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint access_points = 6;</code>
   */
  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint getAccessPoints(int index);
  /**
   * <pre>
   * The access points that the intercom adaptor gives coverage to.
   * </pre>
   *
   * <code>repeated .salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint access_points = 6;</code>
   */
  int getAccessPointsCount();
  /**
   * <pre>
   * The access points that the intercom adaptor gives coverage to.
   * </pre>
   *
   * <code>repeated .salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint access_points = 6;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPointOrBuilder> 
      getAccessPointsOrBuilderList();
  /**
   * <pre>
   * The access points that the intercom adaptor gives coverage to.
   * </pre>
   *
   * <code>repeated .salto.nebula.intercomadaptor.v1.IntercomAdaptorAccessPoint access_points = 6;</code>
   */
  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorAccessPointOrBuilder getAccessPointsOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates whether this intercom adaptor has been initialized or not. This
   * field cannot be modified using a standard
   * [`UpdateIntercomAdaptor`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.UpdateIntercomAdaptor]
   * operation. To change the value of this field, you must call
   * [`InitializeIntercomAdaptor`][salto.nebula.intercomadaptor.v1.IntercomAdaptorService.InitializeIntercomAdaptor].
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
   * <code>.salto.nebula.type.DeviceMetadata device_metadata = 16;</code>
   * @return Whether the deviceMetadata field is set.
   */
  boolean hasDeviceMetadata();
  /**
   * <pre>
   * Device metadata contains information about a device hardware and firmware.
   * </pre>
   *
   * <code>.salto.nebula.type.DeviceMetadata device_metadata = 16;</code>
   * @return The deviceMetadata.
   */
  com.saltoapis.nebula.type.DeviceMetadata getDeviceMetadata();
  /**
   * <pre>
   * Device metadata contains information about a device hardware and firmware.
   * </pre>
   *
   * <code>.salto.nebula.type.DeviceMetadata device_metadata = 16;</code>
   */
  com.saltoapis.nebula.type.DeviceMetadataOrBuilder getDeviceMetadataOrBuilder();

  /**
   * <pre>
   * Indicates whether this intercom adaptor has pending updates or not. This
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
   * Indicates whether this intercom adaptor is connected or not. It's
   * considered connected if there has been at least one communication with it
   * within the last 10 minutes.
   * </pre>
   *
   * <code>bool connected = 9;</code>
   * @return The connected.
   */
  boolean getConnected();

  /**
   * <pre>
   * Indicates whether the battery of this intercom adaptor is low, and needs
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
   * Reference to intercom system model it is connected to. It will be used to
   * know which parametrization to apply when configuring it.
   * </pre>
   *
   * <code>optional string intercom = 12;</code>
   * @return Whether the intercom field is set.
   */
  boolean hasIntercom();
  /**
   * <pre>
   * Reference to intercom system model it is connected to. It will be used to
   * know which parametrization to apply when configuring it.
   * </pre>
   *
   * <code>optional string intercom = 12;</code>
   * @return The intercom.
   */
  java.lang.String getIntercom();
  /**
   * <pre>
   * Reference to intercom system model it is connected to. It will be used to
   * know which parametrization to apply when configuring it.
   * </pre>
   *
   * <code>optional string intercom = 12;</code>
   * @return The bytes for intercom.
   */
  com.google.protobuf.ByteString
      getIntercomBytes();

  /**
   * <pre>
   * The file resource names for the intercom adaptor photos. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string photos = 13;</code>
   * @return A list containing the photos.
   */
  java.util.List<java.lang.String>
      getPhotosList();
  /**
   * <pre>
   * The file resource names for the intercom adaptor photos. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string photos = 13;</code>
   * @return The count of photos.
   */
  int getPhotosCount();
  /**
   * <pre>
   * The file resource names for the intercom adaptor photos. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string photos = 13;</code>
   * @param index The index of the element to return.
   * @return The photos at the given index.
   */
  java.lang.String getPhotos(int index);
  /**
   * <pre>
   * The file resource names for the intercom adaptor photos. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string photos = 13;</code>
   * @param index The index of the value to return.
   * @return The bytes of the photos at the given index.
   */
  com.google.protobuf.ByteString
      getPhotosBytes(int index);

  /**
   * <pre>
   * The URIs to view the intercom adaptor photos.
   * </pre>
   *
   * <code>repeated string photo_uris = 14;</code>
   * @return A list containing the photoUris.
   */
  java.util.List<java.lang.String>
      getPhotoUrisList();
  /**
   * <pre>
   * The URIs to view the intercom adaptor photos.
   * </pre>
   *
   * <code>repeated string photo_uris = 14;</code>
   * @return The count of photoUris.
   */
  int getPhotoUrisCount();
  /**
   * <pre>
   * The URIs to view the intercom adaptor photos.
   * </pre>
   *
   * <code>repeated string photo_uris = 14;</code>
   * @param index The index of the element to return.
   * @return The photoUris at the given index.
   */
  java.lang.String getPhotoUris(int index);
  /**
   * <pre>
   * The URIs to view the intercom adaptor photos.
   * </pre>
   *
   * <code>repeated string photo_uris = 14;</code>
   * @param index The index of the value to return.
   * @return The bytes of the photoUris at the given index.
   */
  com.google.protobuf.ByteString
      getPhotoUrisBytes(int index);

  /**
   * <pre>
   * The file resource names for intercom adaptor readings retrieved from the device's bus.
   * It comes into play when the learning process encounters unexpected issues, prompting expert
   * analysis of the readings. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string readings = 15;</code>
   * @return A list containing the readings.
   */
  java.util.List<java.lang.String>
      getReadingsList();
  /**
   * <pre>
   * The file resource names for intercom adaptor readings retrieved from the device's bus.
   * It comes into play when the learning process encounters unexpected issues, prompting expert
   * analysis of the readings. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string readings = 15;</code>
   * @return The count of readings.
   */
  int getReadingsCount();
  /**
   * <pre>
   * The file resource names for intercom adaptor readings retrieved from the device's bus.
   * It comes into play when the learning process encounters unexpected issues, prompting expert
   * analysis of the readings. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string readings = 15;</code>
   * @param index The index of the element to return.
   * @return The readings at the given index.
   */
  java.lang.String getReadings(int index);
  /**
   * <pre>
   * The file resource names for intercom adaptor readings retrieved from the device's bus.
   * It comes into play when the learning process encounters unexpected issues, prompting expert
   * analysis of the readings. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>repeated string readings = 15;</code>
   * @param index The index of the value to return.
   * @return The bytes of the readings at the given index.
   */
  com.google.protobuf.ByteString
      getReadingsBytes(int index);

  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.ParentDeviceCase getParentDeviceCase();
}
