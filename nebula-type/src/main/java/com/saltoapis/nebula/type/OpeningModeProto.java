// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/type/opening_mode.proto
// Protobuf Java Version: 4.26.1

package com.saltoapis.nebula.type;

public final class OpeningModeProto {
  private OpeningModeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      OpeningModeProto.class.getName());
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
      "\n$salto/nebula/type/opening_mode.proto\022\021" +
      "salto.nebula.type*V\n\013OpeningMode\022\034\n\030OPEN" +
      "ING_MODE_UNSPECIFIED\020\000\022\n\n\006OFFICE\020\001\022\n\n\006TO" +
      "GGLE\020\002\022\021\n\rRING_AND_OPEN\020\rB\323\001\n\031com.saltoa" +
      "pis.nebula.typeB\020OpeningModeProtoP\001ZNgit" +
      "hub.com/saltoapis-internal/saltoapis-go/" +
      "nebula/type/openingmode;openingmode\252\002\025Sa" +
      "ltoapis.Nebula.Type\312\002\025Saltoapis\\Nebula\\T" +
      "ype\342\002!GPBMetadata\\Saltoapis\\Nebula\\Typeb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}