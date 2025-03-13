// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/event/v1/types.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.event.v1;

public interface AccessRightAccessPointsBatchCreatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.AccessRightAccessPointsBatchCreated)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The access right to which the access points have been added.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   * @return Whether the accessRight field is set.
   */
  boolean hasAccessRight();
  /**
   * <pre>
   * The access right to which the access points have been added.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   * @return The accessRight.
   */
  com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight();
  /**
   * <pre>
   * The access right to which the access points have been added.
   * </pre>
   *
   * <code>.salto.nebula.accessright.v1.AccessRight access_right = 1;</code>
   */
  com.saltoapis.nebula.accessright.v1.AccessRightOrBuilder getAccessRightOrBuilder();

  /**
   * <pre>
   * The access points added to the access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspoint.v1.AccessPoint access_points = 2;</code>
   */
  java.util.List<com.saltoapis.nebula.accesspoint.v1.AccessPoint> 
      getAccessPointsList();
  /**
   * <pre>
   * The access points added to the access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspoint.v1.AccessPoint access_points = 2;</code>
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoints(int index);
  /**
   * <pre>
   * The access points added to the access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspoint.v1.AccessPoint access_points = 2;</code>
   */
  int getAccessPointsCount();
  /**
   * <pre>
   * The access points added to the access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspoint.v1.AccessPoint access_points = 2;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder> 
      getAccessPointsOrBuilderList();
  /**
   * <pre>
   * The access points added to the access right.
   * </pre>
   *
   * <code>repeated .salto.nebula.accesspoint.v1.AccessPoint access_points = 2;</code>
   */
  com.saltoapis.nebula.accesspoint.v1.AccessPointOrBuilder getAccessPointsOrBuilder(
      int index);
}
