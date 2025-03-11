// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/accessright/v1/access_right.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.accessright.v1;

public interface BatchCreateAccessRightAccessPointGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the parent resource where the access right's access point groups
   * associations are to be created. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the parent resource where the access right's access point groups
   * associations are to be created. For example:
   * `installations/surelock-homes-hq/access-rights/baskerville`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right's access point groups can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest requests = 2;</code>
   */
  java.util.List<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest> 
      getRequestsList();
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right's access point groups can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest requests = 2;</code>
   */
  com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest getRequests(int index);
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right's access point groups can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest requests = 2;</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right's access point groups can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest requests = 2;</code>
   */
  java.util.List<? extends com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * The request message specifying the resources to create.
   * A maximum of 100 access right's access point groups can be created in a batch.
   * </pre>
   *
   * <code>repeated .salto.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest requests = 2;</code>
   */
  com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequestOrBuilder getRequestsOrBuilder(
      int index);
}
