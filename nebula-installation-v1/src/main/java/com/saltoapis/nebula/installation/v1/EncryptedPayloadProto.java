// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/installation/v1/encrypted_payload.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.installation.v1;

public final class EncryptedPayloadProto {
  private EncryptedPayloadProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      EncryptedPayloadProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4salto/nebula/installation/v1/encrypted" +
      "_payload.proto\022\034salto.nebula.installatio" +
      "n.v1\"R\n\036IngestEncryptedPayloadsRequest\022\024" +
      "\n\014installation\030\001 \001(\t\022\032\n\022encrypted_payloa" +
      "ds\030\002 \003(\014\"!\n\037IngestEncryptedPayloadsRespo" +
      "nse2\262\001\n\027EncryptedPayloadService\022\226\001\n\027Inge" +
      "stEncryptedPayloads\022<.salto.nebula.insta" +
      "llation.v1.IngestEncryptedPayloadsReques" +
      "t\032=.salto.nebula.installation.v1.IngestE" +
      "ncryptedPayloadsResponseB\204\002\n$com.saltoap" +
      "is.nebula.installation.v1B\025EncryptedPayl" +
      "oadProtoP\001ZNgithub.com/saltoapis-interna" +
      "l/saltoapis-go/nebula/installation/v1;in" +
      "stallation\252\002 Saltoapis.Nebula.Installati" +
      "on.V1\312\002 Saltoapis\\Nebula\\Installation\\V1" +
      "\342\002,GPBMetadata\\Saltoapis\\Nebula\\Installa" +
      "tion\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsRequest_descriptor,
        new java.lang.String[] { "Installation", "EncryptedPayloads", });
    internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_installation_v1_IngestEncryptedPayloadsResponse_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
