// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/type/device_type.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.type;

public final class DeviceTypeProto {
  private DeviceTypeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      DeviceTypeProto.class.getName());
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
      "\n#salto/nebula/type/device_type.proto\022\021s" +
      "alto.nebula.type*\240\001\n\nDeviceType\022\033\n\027DEVIC" +
      "E_TYPE_UNSPECIFIED\020\000\022\023\n\017ELECTRONIC_LOCK\020" +
      "\001\022\013\n\007GATEWAY\020\002\022\014\n\010EXTENDER\020\003\022\013\n\007ENCODER\020" +
      "\004\022\016\n\nCONTROLLER\020\005\022\024\n\020INTERCOM_ADAPTOR\020\006\022" +
      "\022\n\016ELECTRONIC_KEY\020\007B\320\001\n\031com.saltoapis.ne" +
      "bula.typeB\017DeviceTypeProtoP\001ZLgithub.com" +
      "/saltoapis-internal/saltoapis-go/nebula/" +
      "type/devicetype;devicetype\252\002\025Saltoapis.N" +
      "ebula.Type\312\002\025Saltoapis\\Nebula\\Type\342\002!GPB" +
      "Metadata\\Saltoapis\\Nebula\\Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
