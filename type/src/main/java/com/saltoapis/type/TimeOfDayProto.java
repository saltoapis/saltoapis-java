// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/type/time_of_day.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.type;

public final class TimeOfDayProto {
  private TimeOfDayProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      TimeOfDayProto.class.getName());
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
    internal_static_salto_type_TimeOfDay_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_type_TimeOfDay_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034salto/type/time_of_day.proto\022\nsalto.ty" +
      "pe\"K\n\tTimeOfDay\022\r\n\005hours\030\001 \001(\005\022\017\n\007minute" +
      "s\030\002 \001(\005\022\017\n\007seconds\030\003 \001(\005\022\r\n\005nanos\030\004 \001(\005B" +
      "\252\001\n\022com.saltoapis.typeB\016TimeOfDayProtoP\001" +
      "ZCgithub.com/saltoapis-internal/saltoapi" +
      "s-go/type/timeofday;timeofday\252\002\016Saltoapi" +
      "s.Type\312\002\016Saltoapis\\Type\342\002\032GPBMetadata\\Sa" +
      "ltoapis\\Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_salto_type_TimeOfDay_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_type_TimeOfDay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_type_TimeOfDay_descriptor,
        new java.lang.String[] { "Hours", "Minutes", "Seconds", "Nanos", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
