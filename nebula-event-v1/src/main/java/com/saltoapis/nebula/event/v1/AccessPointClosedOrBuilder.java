// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.event.v1;

public interface AccessPointClosedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.AccessPointClosed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The access point that's been closed.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <pre>
   * The access point that's been closed.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   * @return The accessPoint.
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint();
  /**
   * <pre>
   * The access point that's been closed.
   * </pre>
   *
   * <code>.salto.nebula.accesspoint.v1.AccessPoint access_point = 1;</code>
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointOrBuilder();
}