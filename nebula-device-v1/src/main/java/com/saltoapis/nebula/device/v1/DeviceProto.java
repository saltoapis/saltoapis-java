// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/device/v1/device.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.device.v1;

public final class DeviceProto {
  private DeviceProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      DeviceProto.class.getName());
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
    internal_static_salto_nebula_device_v1_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_device_v1_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_device_v1_GetDeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_device_v1_GetDeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_device_v1_ListDevicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_device_v1_ListDevicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_device_v1_ListDevicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_device_v1_ListDevicesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#salto/nebula/device/v1/device.proto\022\026s" +
      "alto.nebula.device.v1\032\037google/protobuf/t" +
      "imestamp.proto\032#salto/nebula/type/device" +
      "_type.proto\"\345\002\n\006Device\022\014\n\004name\030\001 \001(\t\022\024\n\014" +
      "display_name\030\002 \001(\t\022\026\n\tdevice_id\030\003 \001(\tH\001\210" +
      "\001\001\0222\n\013device_type\030\004 \001(\0162\035.salto.nebula.t" +
      "ype.DeviceType\022\016\n\006source\030\005 \001(\t\022\021\n\007gatewa" +
      "y\030\006 \001(\tH\000\022\022\n\010extender\030\007 \001(\tH\000\022\020\n\010outdate" +
      "d\030\010 \001(\010\022\026\n\tconnected\030\t \001(\010H\002\210\001\001\022\030\n\013low_b" +
      "attery\030\n \001(\010H\003\210\001\001\0223\n\017last_event_time\030\013 \001" +
      "(\0132\032.google.protobuf.TimestampB\017\n\rparent" +
      "_deviceB\014\n\n_device_idB\014\n\n_connectedB\016\n\014_" +
      "low_battery\" \n\020GetDeviceRequest\022\014\n\004name\030" +
      "\001 \001(\t\"m\n\022ListDevicesRequest\022\016\n\006parent\030\001 " +
      "\001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001" +
      "(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"s\n\023" +
      "ListDevicesResponse\022/\n\007devices\030\001 \003(\0132\036.s" +
      "alto.nebula.device.v1.Device\022\027\n\017next_pag" +
      "e_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\0052\316\001\n\rDe" +
      "viceService\022U\n\tGetDevice\022(.salto.nebula." +
      "device.v1.GetDeviceRequest\032\036.salto.nebul" +
      "a.device.v1.Device\022f\n\013ListDevices\022*.salt" +
      "o.nebula.device.v1.ListDevicesRequest\032+." +
      "salto.nebula.device.v1.ListDevicesRespon" +
      "seB\326\001\n\036com.saltoapis.nebula.device.v1B\013D" +
      "eviceProtoP\001ZBgithub.com/saltoapis-inter" +
      "nal/saltoapis-go/nebula/device/v1;device" +
      "\252\002\032Saltoapis.Nebula.Device.V1\312\002\032Saltoapi" +
      "s\\Nebula\\Device\\V1\342\002&GPBMetadata\\Saltoap" +
      "is\\Nebula\\Device\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.saltoapis.nebula.type.DeviceTypeProto.getDescriptor(),
        });
    internal_static_salto_nebula_device_v1_Device_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_device_v1_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_device_v1_Device_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "DeviceId", "DeviceType", "Source", "Gateway", "Extender", "Outdated", "Connected", "LowBattery", "LastEventTime", "ParentDevice", });
    internal_static_salto_nebula_device_v1_GetDeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_salto_nebula_device_v1_GetDeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_device_v1_GetDeviceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_device_v1_ListDevicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_salto_nebula_device_v1_ListDevicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_device_v1_ListDevicesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_salto_nebula_device_v1_ListDevicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_salto_nebula_device_v1_ListDevicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_device_v1_ListDevicesResponse_descriptor,
        new java.lang.String[] { "Devices", "NextPageToken", "TotalSize", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.saltoapis.nebula.type.DeviceTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
