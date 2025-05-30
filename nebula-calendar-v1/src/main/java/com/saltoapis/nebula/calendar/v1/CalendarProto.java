// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/calendar/v1/calendar.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.calendar.v1;

public final class CalendarProto {
  private CalendarProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CalendarProto.class.getName());
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
    internal_static_salto_nebula_calendar_v1_Calendar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_Calendar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_CreateCalendarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_CreateCalendarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_GetCalendarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_GetCalendarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_ListCalendarsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_ListCalendarsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_UpdateCalendarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_UpdateCalendarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_DeleteCalendarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_DeleteCalendarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_CreateEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_CreateEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_GetEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_GetEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_ListEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_ListEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_ListEventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_ListEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_UpdateEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_UpdateEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_calendar_v1_DeleteEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_calendar_v1_DeleteEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'salto/nebula/calendar/v1/calendar.prot" +
      "o\022\030salto.nebula.calendar.v1\032\033google/prot" +
      "obuf/empty.proto\032 google/protobuf/field_" +
      "mask.proto\032 salto/nebula/type/day_type.p" +
      "roto\032\025salto/type/date.proto\".\n\010Calendar\022" +
      "\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\"\215\001\n\005" +
      "Event\022\014\n\004name\030\001 \001(\t\022,\n\010day_type\030\002 \001(\0162\032." +
      "salto.nebula.type.DayType\022$\n\nstart_date\030" +
      "\003 \001(\0132\020.salto.type.Date\022\"\n\010end_date\030\004 \001(" +
      "\0132\020.salto.type.Date\"\207\001\n\025CreateCalendarRe" +
      "quest\022\016\n\006parent\030\001 \001(\t\022\030\n\013calendar_id\030\002 \001" +
      "(\tH\000\210\001\001\0224\n\010calendar\030\003 \001(\0132\".salto.nebula" +
      ".calendar.v1.CalendarB\016\n\014_calendar_id\"\"\n" +
      "\022GetCalendarRequest\022\014\n\004name\030\001 \001(\t\"o\n\024Lis" +
      "tCalendarsRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpag" +
      "e_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filt" +
      "er\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"g\n\025ListCalend" +
      "arsResponse\0225\n\tcalendars\030\001 \003(\0132\".salto.n" +
      "ebula.calendar.v1.Calendar\022\027\n\017next_page_" +
      "token\030\002 \001(\t\"~\n\025UpdateCalendarRequest\0224\n\010" +
      "calendar\030\001 \001(\0132\".salto.nebula.calendar.v" +
      "1.Calendar\022/\n\013update_mask\030\002 \001(\0132\032.google" +
      ".protobuf.FieldMask\"%\n\025DeleteCalendarReq" +
      "uest\022\014\n\004name\030\001 \001(\t\"x\n\022CreateEventRequest" +
      "\022\016\n\006parent\030\001 \001(\t\022\025\n\010event_id\030\002 \001(\tH\000\210\001\001\022" +
      ".\n\005event\030\003 \001(\0132\037.salto.nebula.calendar.v" +
      "1.EventB\013\n\t_event_id\"\037\n\017GetEventRequest\022" +
      "\014\n\004name\030\001 \001(\t\"l\n\021ListEventsRequest\022\016\n\006pa" +
      "rent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to" +
      "ken\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 " +
      "\001(\t\"^\n\022ListEventsResponse\022/\n\006events\030\001 \003(" +
      "\0132\037.salto.nebula.calendar.v1.Event\022\027\n\017ne" +
      "xt_page_token\030\002 \001(\t\"u\n\022UpdateEventReques" +
      "t\022.\n\005event\030\001 \001(\0132\037.salto.nebula.calendar" +
      ".v1.Event\022/\n\013update_mask\030\002 \001(\0132\032.google." +
      "protobuf.FieldMask\"\"\n\022DeleteEventRequest" +
      "\022\014\n\004name\030\001 \001(\t2\337\007\n\017CalendarService\022e\n\016Cr" +
      "eateCalendar\022/.salto.nebula.calendar.v1." +
      "CreateCalendarRequest\032\".salto.nebula.cal" +
      "endar.v1.Calendar\022_\n\013GetCalendar\022,.salto" +
      ".nebula.calendar.v1.GetCalendarRequest\032\"" +
      ".salto.nebula.calendar.v1.Calendar\022p\n\rLi" +
      "stCalendars\022..salto.nebula.calendar.v1.L" +
      "istCalendarsRequest\032/.salto.nebula.calen" +
      "dar.v1.ListCalendarsResponse\022e\n\016UpdateCa" +
      "lendar\022/.salto.nebula.calendar.v1.Update" +
      "CalendarRequest\032\".salto.nebula.calendar." +
      "v1.Calendar\022Y\n\016DeleteCalendar\022/.salto.ne" +
      "bula.calendar.v1.DeleteCalendarRequest\032\026" +
      ".google.protobuf.Empty\022\\\n\013CreateEvent\022,." +
      "salto.nebula.calendar.v1.CreateEventRequ" +
      "est\032\037.salto.nebula.calendar.v1.Event\022V\n\010" +
      "GetEvent\022).salto.nebula.calendar.v1.GetE" +
      "ventRequest\032\037.salto.nebula.calendar.v1.E" +
      "vent\022g\n\nListEvents\022+.salto.nebula.calend" +
      "ar.v1.ListEventsRequest\032,.salto.nebula.c" +
      "alendar.v1.ListEventsResponse\022\\\n\013UpdateE" +
      "vent\022,.salto.nebula.calendar.v1.UpdateEv" +
      "entRequest\032\037.salto.nebula.calendar.v1.Ev" +
      "ent\022S\n\013DeleteEvent\022,.salto.nebula.calend" +
      "ar.v1.DeleteEventRequest\032\026.google.protob" +
      "uf.EmptyB\344\001\n com.saltoapis.nebula.calend" +
      "ar.v1B\rCalendarProtoP\001ZFgithub.com/salto" +
      "apis-internal/saltoapis-go/nebula/calend" +
      "ar/v1;calendar\252\002\034Saltoapis.Nebula.Calend" +
      "ar.V1\312\002\034Saltoapis\\Nebula\\Calendar\\V1\342\002(G" +
      "PBMetadata\\Saltoapis\\Nebula\\Calendar\\V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.saltoapis.nebula.type.DayTypeProto.getDescriptor(),
          com.saltoapis.type.DateProto.getDescriptor(),
        });
    internal_static_salto_nebula_calendar_v1_Calendar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_calendar_v1_Calendar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_Calendar_descriptor,
        new java.lang.String[] { "Name", "DisplayName", });
    internal_static_salto_nebula_calendar_v1_Event_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_salto_nebula_calendar_v1_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_Event_descriptor,
        new java.lang.String[] { "Name", "DayType", "StartDate", "EndDate", });
    internal_static_salto_nebula_calendar_v1_CreateCalendarRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_salto_nebula_calendar_v1_CreateCalendarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_CreateCalendarRequest_descriptor,
        new java.lang.String[] { "Parent", "CalendarId", "Calendar", });
    internal_static_salto_nebula_calendar_v1_GetCalendarRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_salto_nebula_calendar_v1_GetCalendarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_GetCalendarRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_calendar_v1_ListCalendarsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_salto_nebula_calendar_v1_ListCalendarsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_ListCalendarsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_descriptor,
        new java.lang.String[] { "Calendars", "NextPageToken", });
    internal_static_salto_nebula_calendar_v1_UpdateCalendarRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_salto_nebula_calendar_v1_UpdateCalendarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_UpdateCalendarRequest_descriptor,
        new java.lang.String[] { "Calendar", "UpdateMask", });
    internal_static_salto_nebula_calendar_v1_DeleteCalendarRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_salto_nebula_calendar_v1_DeleteCalendarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_DeleteCalendarRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_calendar_v1_CreateEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_salto_nebula_calendar_v1_CreateEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_CreateEventRequest_descriptor,
        new java.lang.String[] { "Parent", "EventId", "Event", });
    internal_static_salto_nebula_calendar_v1_GetEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_salto_nebula_calendar_v1_GetEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_GetEventRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_calendar_v1_ListEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_salto_nebula_calendar_v1_ListEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_ListEventsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_salto_nebula_calendar_v1_ListEventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_salto_nebula_calendar_v1_ListEventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_ListEventsResponse_descriptor,
        new java.lang.String[] { "Events", "NextPageToken", });
    internal_static_salto_nebula_calendar_v1_UpdateEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_salto_nebula_calendar_v1_UpdateEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_UpdateEventRequest_descriptor,
        new java.lang.String[] { "Event", "UpdateMask", });
    internal_static_salto_nebula_calendar_v1_DeleteEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_salto_nebula_calendar_v1_DeleteEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_calendar_v1_DeleteEventRequest_descriptor,
        new java.lang.String[] { "Name", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.saltoapis.nebula.type.DayTypeProto.getDescriptor();
    com.saltoapis.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
