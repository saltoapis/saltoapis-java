// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/type/day_of_week.proto
// Protobuf Java Version: 4.26.1

package com.saltoapis.type;

public final class DayOfWeekProto {
  private DayOfWeekProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DayOfWeekProto.class.getName());
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
      "\n\034salto/type/day_of_week.proto\022\nsalto.ty" +
      "pe*\204\001\n\tDayOfWeek\022\033\n\027DAY_OF_WEEK_UNSPECIF" +
      "IED\020\000\022\n\n\006MONDAY\020\001\022\013\n\007TUESDAY\020\002\022\r\n\tWEDNES" +
      "DAY\020\003\022\014\n\010THURSDAY\020\004\022\n\n\006FRIDAY\020\005\022\014\n\010SATUR" +
      "DAY\020\006\022\n\n\006SUNDAY\020\007B\252\001\n\022com.saltoapis.type" +
      "B\016DayOfWeekProtoP\001ZCgithub.com/saltoapis" +
      "-internal/saltoapis-go/type/dayofweek;da" +
      "yofweek\252\002\016Saltoapis.Type\312\002\016Saltoapis\\Typ" +
      "e\342\002\032GPBMetadata\\Saltoapis\\Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
