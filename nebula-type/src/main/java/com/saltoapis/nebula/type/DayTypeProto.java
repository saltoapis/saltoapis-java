// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/type/day_type.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.type;

public final class DayTypeProto {
  private DayTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      DayTypeProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n salto/nebula/type/day_type.proto\022\021salt" +
      "o.nebula.type*Z\n\007DayType\022\030\n\024DAY_TYPE_UNS" +
      "PECIFIED\020\000\022\n\n\006NORMAL\020\001\022\013\n\007HOLIDAY\020\002\022\r\n\tS" +
      "PECIAL_1\020\003\022\r\n\tSPECIAL_2\020\004B\307\001\n\031com.saltoa" +
      "pis.nebula.typeB\014DayTypeProtoP\001ZFgithub." +
      "com/saltoapis-internal/saltoapis-go/nebu" +
      "la/type/daytype;daytype\252\002\025Saltoapis.Nebu" +
      "la.Type\312\002\025Saltoapis\\Nebula\\Type\342\002!GPBMet" +
      "adata\\Saltoapis\\Nebula\\Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
