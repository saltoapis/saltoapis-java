// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/type/schedule.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.type;

public final class ScheduleProto {
  private ScheduleProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ScheduleProto.class.getName());
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
    internal_static_salto_nebula_type_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_type_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_type_Schedule_Day_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_type_Schedule_Day_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n salto/nebula/type/schedule.proto\022\021salt" +
      "o.nebula.type\032 salto/nebula/type/day_typ" +
      "e.proto\032\034salto/type/day_of_week.proto\032\034s" +
      "alto/type/time_of_day.proto\"\356\001\n\010Schedule" +
      "\022-\n\004days\030\001 \003(\0132\037.salto.nebula.type.Sched" +
      "ule.Day\022)\n\nstart_time\030\002 \001(\0132\025.salto.type" +
      ".TimeOfDay\022\'\n\010end_time\030\003 \001(\0132\025.salto.typ" +
      "e.TimeOfDay\032_\n\003Day\022,\n\010day_type\030\001 \001(\0162\032.s" +
      "alto.nebula.type.DayType\022*\n\013day_of_week\030" +
      "\002 \001(\0162\025.salto.type.DayOfWeekB\312\001\n\031com.sal" +
      "toapis.nebula.typeB\rScheduleProtoP\001ZHgit" +
      "hub.com/saltoapis-internal/saltoapis-go/" +
      "nebula/type/schedule;schedule\252\002\025Saltoapi" +
      "s.Nebula.Type\312\002\025Saltoapis\\Nebula\\Type\342\002!" +
      "GPBMetadata\\Saltoapis\\Nebula\\Typeb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.saltoapis.nebula.type.DayTypeProto.getDescriptor(),
          com.saltoapis.type.DayOfWeekProto.getDescriptor(),
          com.saltoapis.type.TimeOfDayProto.getDescriptor(),
        });
    internal_static_salto_nebula_type_Schedule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_type_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_type_Schedule_descriptor,
        new java.lang.String[] { "Days", "StartTime", "EndTime", });
    internal_static_salto_nebula_type_Schedule_Day_descriptor =
      internal_static_salto_nebula_type_Schedule_descriptor.getNestedTypes().get(0);
    internal_static_salto_nebula_type_Schedule_Day_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_type_Schedule_Day_descriptor,
        new java.lang.String[] { "DayType", "DayOfWeek", });
    descriptor.resolveAllFeaturesImmutable();
    com.saltoapis.nebula.type.DayTypeProto.getDescriptor();
    com.saltoapis.type.DayOfWeekProto.getDescriptor();
    com.saltoapis.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
