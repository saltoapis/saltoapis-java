// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/file/v1/file.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.file.v1;

public final class FileProto {
  private FileProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FileProto.class.getName());
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
    internal_static_salto_nebula_file_v1_File_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_file_v1_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_file_v1_CreateFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_file_v1_CreateFileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037salto/nebula/file/v1/file.proto\022\024salto" +
      ".nebula.file.v1\"(\n\004File\022\014\n\004name\030\001 \001(\t\022\022\n" +
      "\nupload_uri\030\002 \001(\t\"#\n\021CreateFileRequest\022\016" +
      "\n\006parent\030\001 \001(\t2`\n\013FileService\022Q\n\nCreateF" +
      "ile\022\'.salto.nebula.file.v1.CreateFileReq" +
      "uest\032\032.salto.nebula.file.v1.FileB\310\001\n\034com" +
      ".saltoapis.nebula.file.v1B\tFileProtoP\001Z>" +
      "github.com/saltoapis-internal/saltoapis-" +
      "go/nebula/file/v1;file\252\002\030Saltoapis.Nebul" +
      "a.File.V1\312\002\030Saltoapis\\Nebula\\File\\V1\342\002$G" +
      "PBMetadata\\Saltoapis\\Nebula\\File\\V1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_salto_nebula_file_v1_File_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_file_v1_File_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_file_v1_File_descriptor,
        new java.lang.String[] { "Name", "UploadUri", });
    internal_static_salto_nebula_file_v1_CreateFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_salto_nebula_file_v1_CreateFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_file_v1_CreateFileRequest_descriptor,
        new java.lang.String[] { "Parent", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
