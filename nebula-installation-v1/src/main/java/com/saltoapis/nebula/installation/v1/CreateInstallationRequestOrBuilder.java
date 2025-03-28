// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/installation/v1/installation.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.installation.v1;

public interface CreateInstallationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.CreateInstallationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @return Whether the installationId field is set.
   */
  boolean hasInstallationId();
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @return The installationId.
   */
  java.lang.String getInstallationId();
  /**
   * <pre>
   * The installation ID to use for this installation. In case it's
   * empty the server will autogenerate a unique identifier.
   * </pre>
   *
   * <code>optional string installation_id = 1;</code>
   * @return The bytes for installationId.
   */
  com.google.protobuf.ByteString
      getInstallationIdBytes();

  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   * @return Whether the installation field is set.
   */
  boolean hasInstallation();
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   * @return The installation.
   */
  com.saltoapis.nebula.installation.v1.Installation getInstallation();
  /**
   * <pre>
   * The installation resource to be created. Client must not set the
   * `Installation.name` field.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.Installation installation = 2;</code>
   */
  com.saltoapis.nebula.installation.v1.InstallationOrBuilder getInstallationOrBuilder();

  /**
   * <pre>
   * If set, validate the request but do not actually create the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 5;</code>
   * @return Whether the validateOnly field is set.
   */
  boolean hasValidateOnly();
  /**
   * <pre>
   * If set, validate the request but do not actually create the installation.
   * </pre>
   *
   * <code>optional bool validate_only = 5;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
