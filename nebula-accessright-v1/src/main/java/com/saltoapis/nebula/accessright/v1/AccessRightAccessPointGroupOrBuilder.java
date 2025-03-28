// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

public interface AccessRightAccessPointGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.AccessRightAccessPointGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the access right's access point group association. It
   * must have the format of
   * `installations/&#42;&#47;access-rights/&#42;&#47;access-point-groups/&#42;`. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville/access-point-groups/common-accesses`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the access right's access point group association. It
   * must have the format of
   * `installations/&#42;&#47;access-rights/&#42;&#47;access-point-groups/&#42;`. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville/access-point-groups/common-accesses`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The access point group resource name to bind as an association to the
   * parent access right. For example:
   * `installations/surelock-homes-hq/access-point-groups/common-accesses`.
   * </pre>
   *
   * <code>string access_point_group = 2;</code>
   * @return The accessPointGroup.
   */
  java.lang.String getAccessPointGroup();
  /**
   * <pre>
   * The access point group resource name to bind as an association to the
   * parent access right. For example:
   * `installations/surelock-homes-hq/access-point-groups/common-accesses`.
   * </pre>
   *
   * <code>string access_point_group = 2;</code>
   * @return The bytes for accessPointGroup.
   */
  com.google.protobuf.ByteString
      getAccessPointGroupBytes();

  /**
   * <pre>
   * Display name of the associated entity. In this case an access point group.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name of the associated entity. In this case an access point group.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
