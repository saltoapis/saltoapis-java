// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/type/device_metadata.proto
// Protobuf Java Version: 4.26.1

package com.saltoapis.nebula.type;

public final class DeviceMetadataProto {
  private DeviceMetadataProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DeviceMetadataProto.class.getName());
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
    internal_static_salto_nebula_type_DeviceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_type_DeviceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_Firmware_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_Firmware_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'salto/nebula/type/device_metadata.prot" +
      "o\022\021salto.nebula.type\032\025salto/type/date.pr" +
      "oto\"\245\002\n\016DeviceMetadata\022F\n\016circuit_boards" +
      "\030\001 \003(\0132..salto.nebula.type.DeviceMetadat" +
      "a.CircuitBoard\032\312\001\n\014CircuitBoard\022*\n\020manuf" +
      "acture_date\030\002 \001(\0132\020.salto.type.Date\022\025\n\rs" +
      "erial_number\030\003 \001(\t\022J\n\tfirmwares\030\004 \003(\01327." +
      "salto.nebula.type.DeviceMetadata.Circuit" +
      "Board.Firmware\032+\n\010Firmware\022\016\n\006number\030\001 \001" +
      "(\t\022\017\n\007version\030\002 \001(\tB\334\001\n\031com.saltoapis.ne" +
      "bula.typeB\023DeviceMetadataProtoP\001ZTgithub" +
      ".com/saltoapis-internal/saltoapis-go/neb" +
      "ula/type/devicemetadata;devicemetadata\252\002" +
      "\025Saltoapis.Nebula.Type\312\002\025Saltoapis\\Nebul" +
      "a\\Type\342\002!GPBMetadata\\Saltoapis\\Nebula\\Ty" +
      "peb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.saltoapis.type.DateProto.getDescriptor(),
        });
    internal_static_salto_nebula_type_DeviceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_type_DeviceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_type_DeviceMetadata_descriptor,
        new java.lang.String[] { "CircuitBoards", });
    internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_descriptor =
      internal_static_salto_nebula_type_DeviceMetadata_descriptor.getNestedTypes().get(0);
    internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_descriptor,
        new java.lang.String[] { "ManufactureDate", "SerialNumber", "Firmwares", });
    internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_Firmware_descriptor =
      internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_descriptor.getNestedTypes().get(0);
    internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_Firmware_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_type_DeviceMetadata_CircuitBoard_Firmware_descriptor,
        new java.lang.String[] { "Number", "Version", });
    descriptor.resolveAllFeaturesImmutable();
    com.saltoapis.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
