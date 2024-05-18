// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/extender/v1/extender.proto
// Protobuf Java Version: 4.26.1

package com.saltoapis.nebula.extender.v1;

public final class ExtenderProto {
  private ExtenderProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ExtenderProto.class.getName());
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
    internal_static_salto_nebula_extender_v1_Extender_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_Extender_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_CreateExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_CreateExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_GetExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_GetExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_ListExtendersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_ListExtendersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_ListExtendersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_ListExtendersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_UpdateExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_UpdateExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_DeleteExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_DeleteExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_BindExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_BindExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_BindExtenderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_BindExtenderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_UnbindExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_UnbindExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_UnbindExtenderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_UnbindExtenderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_ResetExtenderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_ResetExtenderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_ResetExtenderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_ResetExtenderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_extender_v1_ResetExtenderMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_extender_v1_ResetExtenderMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'salto/nebula/extender/v1/extender.prot" +
      "o\022\030salto.nebula.extender.v1\032\033google/prot" +
      "obuf/empty.proto\032 google/protobuf/field_" +
      "mask.proto\032$salto/longrunning/v1/operati" +
      "on.proto\"\214\001\n\010Extender\022\014\n\004name\030\001 \001(\t\022\024\n\014d" +
      "isplay_name\030\002 \001(\t\022\026\n\tdevice_id\030\003 \001(\tH\001\210\001" +
      "\001\022\021\n\007gateway\030\004 \001(\tH\000\022\022\n\010extender\030\005 \001(\tH\000" +
      "B\017\n\rparent_deviceB\014\n\n_device_id\"\207\001\n\025Crea" +
      "teExtenderRequest\022\016\n\006parent\030\001 \001(\t\022\030\n\013ext" +
      "ender_id\030\002 \001(\tH\000\210\001\001\0224\n\010extender\030\003 \001(\0132\"." +
      "salto.nebula.extender.v1.ExtenderB\016\n\014_ex" +
      "tender_id\"\"\n\022GetExtenderRequest\022\014\n\004name\030" +
      "\001 \001(\t\"o\n\024ListExtendersRequest\022\016\n\006parent\030" +
      "\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003" +
      " \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"g" +
      "\n\025ListExtendersResponse\0225\n\textenders\030\001 \003" +
      "(\0132\".salto.nebula.extender.v1.Extender\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"~\n\025UpdateExtende" +
      "rRequest\0224\n\010extender\030\001 \001(\0132\".salto.nebul" +
      "a.extender.v1.Extender\022/\n\013update_mask\030\002 " +
      "\001(\0132\032.google.protobuf.FieldMask\"%\n\025Delet" +
      "eExtenderRequest\022\014\n\004name\030\001 \001(\t\"6\n\023BindEx" +
      "tenderRequest\022\014\n\004name\030\001 \001(\t\022\021\n\tdevice_id" +
      "\030\002 \001(\t\"\026\n\024BindExtenderResponse\"%\n\025Unbind" +
      "ExtenderRequest\022\014\n\004name\030\001 \001(\t\"\030\n\026UnbindE" +
      "xtenderResponse\"1\n\035UpdateExtenderFirmwar" +
      "eRequest\022\020\n\010extender\030\001 \001(\t\" \n\036UpdateExte" +
      "nderFirmwareResponse\":\n\036UpdateExtenderFi" +
      "rmwareMetadata\022\030\n\020progress_percent\030\001 \001(\005" +
      "\"$\n\024ResetExtenderRequest\022\014\n\004name\030\001 \001(\t\"\027" +
      "\n\025ResetExtenderResponse\"\027\n\025ResetExtender" +
      "Metadata2\307\007\n\017ExtenderService\022e\n\016CreateEx" +
      "tender\022/.salto.nebula.extender.v1.Create" +
      "ExtenderRequest\032\".salto.nebula.extender." +
      "v1.Extender\022_\n\013GetExtender\022,.salto.nebul" +
      "a.extender.v1.GetExtenderRequest\032\".salto" +
      ".nebula.extender.v1.Extender\022p\n\rListExte" +
      "nders\022..salto.nebula.extender.v1.ListExt" +
      "endersRequest\032/.salto.nebula.extender.v1" +
      ".ListExtendersResponse\022e\n\016UpdateExtender" +
      "\022/.salto.nebula.extender.v1.UpdateExtend" +
      "erRequest\032\".salto.nebula.extender.v1.Ext" +
      "ender\022Y\n\016DeleteExtender\022/.salto.nebula.e" +
      "xtender.v1.DeleteExtenderRequest\032\026.googl" +
      "e.protobuf.Empty\022m\n\014BindExtender\022-.salto" +
      ".nebula.extender.v1.BindExtenderRequest\032" +
      "..salto.nebula.extender.v1.BindExtenderR" +
      "esponse\022s\n\016UnbindExtender\022/.salto.nebula" +
      ".extender.v1.UnbindExtenderRequest\0320.sal" +
      "to.nebula.extender.v1.UnbindExtenderResp" +
      "onse\022r\n\026UpdateExtenderFirmware\0227.salto.n" +
      "ebula.extender.v1.UpdateExtenderFirmware" +
      "Request\032\037.salto.longrunning.v1.Operation" +
      "\022`\n\rResetExtender\022..salto.nebula.extende" +
      "r.v1.ResetExtenderRequest\032\037.salto.longru" +
      "nning.v1.OperationB\344\001\n com.saltoapis.neb" +
      "ula.extender.v1B\rExtenderProtoP\001ZFgithub" +
      ".com/saltoapis-internal/saltoapis-go/neb" +
      "ula/extender/v1;extender\252\002\034Saltoapis.Neb" +
      "ula.Extender.V1\312\002\034Saltoapis\\Nebula\\Exten" +
      "der\\V1\342\002(GPBMetadata\\Saltoapis\\Nebula\\Ex" +
      "tender\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.saltoapis.longrunning.v1.OperationProto.getDescriptor(),
        });
    internal_static_salto_nebula_extender_v1_Extender_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_extender_v1_Extender_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_Extender_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "DeviceId", "Gateway", "Extender", "ParentDevice", });
    internal_static_salto_nebula_extender_v1_CreateExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_salto_nebula_extender_v1_CreateExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_CreateExtenderRequest_descriptor,
        new java.lang.String[] { "Parent", "ExtenderId", "Extender", });
    internal_static_salto_nebula_extender_v1_GetExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_salto_nebula_extender_v1_GetExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_GetExtenderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_extender_v1_ListExtendersRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_salto_nebula_extender_v1_ListExtendersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_ListExtendersRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_salto_nebula_extender_v1_ListExtendersResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_salto_nebula_extender_v1_ListExtendersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_ListExtendersResponse_descriptor,
        new java.lang.String[] { "Extenders", "NextPageToken", });
    internal_static_salto_nebula_extender_v1_UpdateExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_salto_nebula_extender_v1_UpdateExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_UpdateExtenderRequest_descriptor,
        new java.lang.String[] { "Extender", "UpdateMask", });
    internal_static_salto_nebula_extender_v1_DeleteExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_salto_nebula_extender_v1_DeleteExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_DeleteExtenderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_extender_v1_BindExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_salto_nebula_extender_v1_BindExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_BindExtenderRequest_descriptor,
        new java.lang.String[] { "Name", "DeviceId", });
    internal_static_salto_nebula_extender_v1_BindExtenderResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_salto_nebula_extender_v1_BindExtenderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_BindExtenderResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_extender_v1_UnbindExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_salto_nebula_extender_v1_UnbindExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_UnbindExtenderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_extender_v1_UnbindExtenderResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_salto_nebula_extender_v1_UnbindExtenderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_UnbindExtenderResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareRequest_descriptor,
        new java.lang.String[] { "Extender", });
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_UpdateExtenderFirmwareMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", });
    internal_static_salto_nebula_extender_v1_ResetExtenderRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_salto_nebula_extender_v1_ResetExtenderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_ResetExtenderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_extender_v1_ResetExtenderResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_salto_nebula_extender_v1_ResetExtenderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_ResetExtenderResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_extender_v1_ResetExtenderMetadata_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_salto_nebula_extender_v1_ResetExtenderMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_extender_v1_ResetExtenderMetadata_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.saltoapis.longrunning.v1.OperationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}