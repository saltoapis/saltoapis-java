// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/gateway/v1/gateway.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.gateway.v1;

public interface WifiSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.gateway.v1.WifiSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IPv4 (Internet Protocol version 4) settings of a WiFi network.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.IPv4Settings ipv4_settings = 1;</code>
   * @return Whether the ipv4Settings field is set.
   */
  boolean hasIpv4Settings();
  /**
   * <pre>
   * IPv4 (Internet Protocol version 4) settings of a WiFi network.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.IPv4Settings ipv4_settings = 1;</code>
   * @return The ipv4Settings.
   */
  com.saltoapis.nebula.gateway.v1.IPv4Settings getIpv4Settings();
  /**
   * <pre>
   * IPv4 (Internet Protocol version 4) settings of a WiFi network.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.IPv4Settings ipv4_settings = 1;</code>
   */
  com.saltoapis.nebula.gateway.v1.IPv4SettingsOrBuilder getIpv4SettingsOrBuilder();

  /**
   * <pre>
   * DNS settings of a WiFi network.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.DNSSettings dns_settings = 2;</code>
   * @return Whether the dnsSettings field is set.
   */
  boolean hasDnsSettings();
  /**
   * <pre>
   * DNS settings of a WiFi network.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.DNSSettings dns_settings = 2;</code>
   * @return The dnsSettings.
   */
  com.saltoapis.nebula.gateway.v1.DNSSettings getDnsSettings();
  /**
   * <pre>
   * DNS settings of a WiFi network.
   * </pre>
   *
   * <code>.salto.nebula.gateway.v1.DNSSettings dns_settings = 2;</code>
   */
  com.saltoapis.nebula.gateway.v1.DNSSettingsOrBuilder getDnsSettingsOrBuilder();

  /**
   * <pre>
   * Service set identifier of a WiFi network. An SSID is a 32-character
   * unique identifier attached to the header of packets that are sent over a
   * Wireless Local Area Network. SSIDs serve as "network names" and are
   * typically human readable.
   * </pre>
   *
   * <code>string ssid = 3;</code>
   * @return The ssid.
   */
  java.lang.String getSsid();
  /**
   * <pre>
   * Service set identifier of a WiFi network. An SSID is a 32-character
   * unique identifier attached to the header of packets that are sent over a
   * Wireless Local Area Network. SSIDs serve as "network names" and are
   * typically human readable.
   * </pre>
   *
   * <code>string ssid = 3;</code>
   * @return The bytes for ssid.
   */
  com.google.protobuf.ByteString
      getSsidBytes();

  /**
   * <pre>
   * Password to be used to authenticate on a WiFi network.
   * </pre>
   *
   * <code>optional string password = 4;</code>
   * @return Whether the password field is set.
   */
  boolean hasPassword();
  /**
   * <pre>
   * Password to be used to authenticate on a WiFi network.
   * </pre>
   *
   * <code>optional string password = 4;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * Password to be used to authenticate on a WiFi network.
   * </pre>
   *
   * <code>optional string password = 4;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
