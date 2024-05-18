// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/controller/v1/controller.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.controller.v1;

public interface ControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.controller.v1.Controller)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the controller. It must have the format of
   * `installations/&#42;&#47;controllers/&#42;`. For example:
   * `installations/surelock-homes-hq/controller/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the controller. It must have the format of
   * `installations/&#42;&#47;controllers/&#42;`. For example:
   * `installations/surelock-homes-hq/controller/dancing-men`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Display name of the controller.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the controller.
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
   * Parent name, when controller is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   * <pre>
   * Parent name, when controller is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return The gateway.
   */
  java.lang.String getGateway();
  /**
   * <pre>
   * Parent name, when controller is connected to a gateway
   * </pre>
   *
   * <code>string gateway = 4;</code>
   * @return The bytes for gateway.
   */
  com.google.protobuf.ByteString
      getGatewayBytes();

  /**
   * <pre>
   * Parent name, when controller is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return Whether the extender field is set.
   */
  boolean hasExtender();
  /**
   * <pre>
   * Parent name, when controller is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return The extender.
   */
  java.lang.String getExtender();
  /**
   * <pre>
   * Parent name, when controller is connected to an extender
   * </pre>
   *
   * <code>string extender = 5;</code>
   * @return The bytes for extender.
   */
  com.google.protobuf.ByteString
      getExtenderBytes();

  /**
   * <pre>
   * The access points that the controller gives coverage to.
   * </pre>
   *
   * <code>repeated string access_points = 6;</code>
   * @return A list containing the accessPoints.
   */
  java.util.List<java.lang.String>
      getAccessPointsList();
  /**
   * <pre>
   * The access points that the controller gives coverage to.
   * </pre>
   *
   * <code>repeated string access_points = 6;</code>
   * @return The count of accessPoints.
   */
  int getAccessPointsCount();
  /**
   * <pre>
   * The access points that the controller gives coverage to.
   * </pre>
   *
   * <code>repeated string access_points = 6;</code>
   * @param index The index of the element to return.
   * @return The accessPoints at the given index.
   */
  java.lang.String getAccessPoints(int index);
  /**
   * <pre>
   * The access points that the controller gives coverage to.
   * </pre>
   *
   * <code>repeated string access_points = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the accessPoints at the given index.
   */
  com.google.protobuf.ByteString
      getAccessPointsBytes(int index);

  /**
   * <pre>
   * Indicates whether this controller has been initialized or not. This
   * field cannot be modified using a standard
   * [`UpdateController`][salto.nebula.controller.v1.ControllerService.UpdateController]
   * operation. To change the value of this field, you must call
   * [`InitializeController`][salto.nebula.controller.v1.ControllerService.InitializeController].
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
   * Indicates whether this controller has pending updates or not. This
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
   * Indicates whether this controller is connected or not. It's
   * considered connected if there has been at least one communication with it
   * within the last 10 minutes. The property is left unset if it is an
   * offline controller.
   * </pre>
   *
   * <code>optional bool connected = 9;</code>
   * @return Whether the connected field is set.
   */
  boolean hasConnected();
  /**
   * <pre>
   * Indicates whether this controller is connected or not. It's
   * considered connected if there has been at least one communication with it
   * within the last 10 minutes. The property is left unset if it is an
   * offline controller.
   * </pre>
   *
   * <code>optional bool connected = 9;</code>
   * @return The connected.
   */
  boolean getConnected();

  /**
   * <pre>
   * The last time an event was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 10;</code>
   * @return Whether the lastEventTime field is set.
   */
  boolean hasLastEventTime();
  /**
   * <pre>
   * The last time an event was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 10;</code>
   * @return The lastEventTime.
   */
  com.google.protobuf.Timestamp getLastEventTime();
  /**
   * <pre>
   * The last time an event was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEventTimeOrBuilder();

  com.saltoapis.nebula.controller.v1.Controller.ParentDeviceCase getParentDeviceCase();
}
