// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.intercomadaptor.v1;

public interface UpdateIntercomAdaptorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The intercom adaptor resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.intercomadaptor.v1.IntercomAdaptor intercom_adaptor = 1;</code>
   * @return Whether the intercomAdaptor field is set.
   */
  boolean hasIntercomAdaptor();
  /**
   * <pre>
   * The intercom adaptor resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.intercomadaptor.v1.IntercomAdaptor intercom_adaptor = 1;</code>
   * @return The intercomAdaptor.
   */
  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor getIntercomAdaptor();
  /**
   * <pre>
   * The intercom adaptor resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.intercomadaptor.v1.IntercomAdaptor intercom_adaptor = 1;</code>
   */
  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorOrBuilder getIntercomAdaptorOrBuilder();

  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The update mask applied to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
