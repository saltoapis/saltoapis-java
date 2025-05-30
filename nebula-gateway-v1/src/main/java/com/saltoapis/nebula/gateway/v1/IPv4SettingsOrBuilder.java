// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/gateway/v1/gateway.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.gateway.v1;

public interface IPv4SettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.gateway.v1.IPv4Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string ip_address = 1;</code>
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   * <pre>
   * IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string ip_address = 1;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <pre>
   * IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string ip_address = 1;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <pre>
   * Subnet mask is expressed in dot-decimal notation like an address.
   * For example: 255.255.255.0 is the subnet mask for the prefix
   * 198.51.100.0/24.
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string mask = 2;</code>
   * @return Whether the mask field is set.
   */
  boolean hasMask();
  /**
   * <pre>
   * Subnet mask is expressed in dot-decimal notation like an address.
   * For example: 255.255.255.0 is the subnet mask for the prefix
   * 198.51.100.0/24.
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string mask = 2;</code>
   * @return The mask.
   */
  java.lang.String getMask();
  /**
   * <pre>
   * Subnet mask is expressed in dot-decimal notation like an address.
   * For example: 255.255.255.0 is the subnet mask for the prefix
   * 198.51.100.0/24.
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string mask = 2;</code>
   * @return The bytes for mask.
   */
  com.google.protobuf.ByteString
      getMaskBytes();

  /**
   * <pre>
   * Default network router's IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string router_address = 3;</code>
   * @return Whether the routerAddress field is set.
   */
  boolean hasRouterAddress();
  /**
   * <pre>
   * Default network router's IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string router_address = 3;</code>
   * @return The routerAddress.
   */
  java.lang.String getRouterAddress();
  /**
   * <pre>
   * Default network router's IP address
   *
   * If unset, an automatic value given by the network will be used.
   * </pre>
   *
   * <code>optional string router_address = 3;</code>
   * @return The bytes for routerAddress.
   */
  com.google.protobuf.ByteString
      getRouterAddressBytes();
}
