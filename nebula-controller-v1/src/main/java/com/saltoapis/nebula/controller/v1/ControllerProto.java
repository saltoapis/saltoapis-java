// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/controller/v1/controller.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.controller.v1;

public final class ControllerProto {
  private ControllerProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ControllerProto.class.getName());
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
    internal_static_salto_nebula_controller_v1_Controller_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_Controller_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_CreateControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_CreateControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_GetControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_GetControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ListControllersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ListControllersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ListControllersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ListControllersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_UpdateControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_UpdateControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_DeleteControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_DeleteControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_BindControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_BindControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_BindControllerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_BindControllerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_UnbindControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_UnbindControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_UnbindControllerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_UnbindControllerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_InitializeControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_InitializeControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_InitializeControllerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_InitializeControllerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_InitializeControllerMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_InitializeControllerMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ConfigureControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ConfigureControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ConfigureControllerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ConfigureControllerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ConfigureControllerMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ConfigureControllerMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ResetControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ResetControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ResetControllerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ResetControllerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_ResetControllerMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_ResetControllerMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+salto/nebula/controller/v1/controller." +
      "proto\022\032salto.nebula.controller.v1\032\033googl" +
      "e/protobuf/empty.proto\032 google/protobuf/" +
      "field_mask.proto\032\037google/protobuf/timest" +
      "amp.proto\032$salto/longrunning/v1/operatio" +
      "n.proto\"\247\002\n\nController\022\014\n\004name\030\001 \001(\t\022\024\n\014" +
      "display_name\030\002 \001(\t\022\026\n\tdevice_id\030\003 \001(\tH\001\210" +
      "\001\001\022\021\n\007gateway\030\004 \001(\tH\000\022\022\n\010extender\030\005 \001(\tH" +
      "\000\022\025\n\raccess_points\030\006 \003(\t\022\023\n\013initialized\030" +
      "\007 \001(\010\022\020\n\010outdated\030\010 \001(\010\022\026\n\tconnected\030\t \001" +
      "(\010H\002\210\001\001\0223\n\017last_event_time\030\n \001(\0132\032.googl" +
      "e.protobuf.TimestampB\017\n\rparent_deviceB\014\n" +
      "\n_device_idB\014\n\n_connected\"\223\001\n\027CreateCont" +
      "rollerRequest\022\016\n\006parent\030\001 \001(\t\022\032\n\rcontrol" +
      "ler_id\030\002 \001(\tH\000\210\001\001\022:\n\ncontroller\030\003 \001(\0132&." +
      "salto.nebula.controller.v1.ControllerB\020\n" +
      "\016_controller_id\"$\n\024GetControllerRequest\022" +
      "\014\n\004name\030\001 \001(\t\"q\n\026ListControllersRequest\022" +
      "\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npa" +
      "ge_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_" +
      "by\030\005 \001(\t\"o\n\027ListControllersResponse\022;\n\013c" +
      "ontrollers\030\001 \003(\0132&.salto.nebula.controll" +
      "er.v1.Controller\022\027\n\017next_page_token\030\002 \001(" +
      "\t\"\206\001\n\027UpdateControllerRequest\022:\n\ncontrol" +
      "ler\030\001 \001(\0132&.salto.nebula.controller.v1.C" +
      "ontroller\022/\n\013update_mask\030\002 \001(\0132\032.google." +
      "protobuf.FieldMask\"\'\n\027DeleteControllerRe" +
      "quest\022\014\n\004name\030\001 \001(\t\"8\n\025BindControllerReq" +
      "uest\022\014\n\004name\030\001 \001(\t\022\021\n\tdevice_id\030\002 \001(\t\"\030\n" +
      "\026BindControllerResponse\"6\n\027UnbindControl" +
      "lerRequest\022\014\n\004name\030\001 \001(\t\022\r\n\005force\030\002 \001(\010\"" +
      "\032\n\030UnbindControllerResponse\"+\n\033Initializ" +
      "eControllerRequest\022\014\n\004name\030\001 \001(\t\"\036\n\034Init" +
      "ializeControllerResponse\"8\n\034InitializeCo" +
      "ntrollerMetadata\022\030\n\020progress_percent\030\001 \001" +
      "(\005\"*\n\032ConfigureControllerRequest\022\014\n\004name" +
      "\030\001 \001(\t\"\035\n\033ConfigureControllerResponse\"7\n" +
      "\033ConfigureControllerMetadata\022\030\n\020progress" +
      "_percent\030\001 \001(\005\"&\n\026ResetControllerRequest" +
      "\022\014\n\004name\030\001 \001(\t\"\031\n\027ResetControllerRespons" +
      "e\"\031\n\027ResetControllerMetadata\"5\n\037UpdateCo" +
      "ntrollerFirmwareRequest\022\022\n\ncontroller\030\001 " +
      "\001(\t\"\"\n UpdateControllerFirmwareResponse\"" +
      "<\n UpdateControllerFirmwareMetadata\022\030\n\020p" +
      "rogress_percent\030\001 \001(\005\"7\n!GenerateAuthori" +
      "zationTokenRequest\022\022\n\ncontroller\030\001 \001(\t\"A" +
      "\n\"GenerateAuthorizationTokenResponse\022\033\n\023" +
      "authorization_token\030\001 \001(\014\"8\n\"GenerateFir" +
      "mwareDownloadUriRequest\022\022\n\ncontroller\030\001 " +
      "\001(\t\"K\n#GenerateFirmwareDownloadUriRespon" +
      "se\022\024\n\014download_uri\030\001 \001(\t\022\016\n\006digest\030\002 \001(\t" +
      "\"%\n#GenerateFirmwareDownloadUriMetadata2" +
      "\227\014\n\021ControllerService\022o\n\020CreateControlle" +
      "r\0223.salto.nebula.controller.v1.CreateCon" +
      "trollerRequest\032&.salto.nebula.controller" +
      ".v1.Controller\022i\n\rGetController\0220.salto." +
      "nebula.controller.v1.GetControllerReques" +
      "t\032&.salto.nebula.controller.v1.Controlle" +
      "r\022z\n\017ListControllers\0222.salto.nebula.cont" +
      "roller.v1.ListControllersRequest\0323.salto" +
      ".nebula.controller.v1.ListControllersRes" +
      "ponse\022o\n\020UpdateController\0223.salto.nebula" +
      ".controller.v1.UpdateControllerRequest\032&" +
      ".salto.nebula.controller.v1.Controller\022_" +
      "\n\020DeleteController\0223.salto.nebula.contro" +
      "ller.v1.DeleteControllerRequest\032\026.google" +
      ".protobuf.Empty\022w\n\016BindController\0221.salt" +
      "o.nebula.controller.v1.BindControllerReq" +
      "uest\0322.salto.nebula.controller.v1.BindCo" +
      "ntrollerResponse\022}\n\020UnbindController\0223.s" +
      "alto.nebula.controller.v1.UnbindControll" +
      "erRequest\0324.salto.nebula.controller.v1.U" +
      "nbindControllerResponse\022p\n\024InitializeCon" +
      "troller\0227.salto.nebula.controller.v1.Ini" +
      "tializeControllerRequest\032\037.salto.longrun" +
      "ning.v1.Operation\022n\n\023ConfigureController" +
      "\0226.salto.nebula.controller.v1.ConfigureC" +
      "ontrollerRequest\032\037.salto.longrunning.v1." +
      "Operation\022f\n\017ResetController\0222.salto.neb" +
      "ula.controller.v1.ResetControllerRequest" +
      "\032\037.salto.longrunning.v1.Operation\022x\n\030Upd" +
      "ateControllerFirmware\022;.salto.nebula.con" +
      "troller.v1.UpdateControllerFirmwareReque" +
      "st\032\037.salto.longrunning.v1.Operation\022\233\001\n\032" +
      "GenerateAuthorizationToken\022=.salto.nebul" +
      "a.controller.v1.GenerateAuthorizationTok" +
      "enRequest\032>.salto.nebula.controller.v1.G" +
      "enerateAuthorizationTokenResponse\022~\n\033Gen" +
      "erateFirmwareDownloadUri\022>.salto.nebula." +
      "controller.v1.GenerateFirmwareDownloadUr" +
      "iRequest\032\037.salto.longrunning.v1.Operatio" +
      "nB\362\001\n\"com.saltoapis.nebula.controller.v1" +
      "B\017ControllerProtoP\001ZJgithub.com/saltoapi" +
      "s-internal/saltoapis-go/nebula/controlle" +
      "r/v1;controller\252\002\036Saltoapis.Nebula.Contr" +
      "oller.V1\312\002\036Saltoapis\\Nebula\\Controller\\V" +
      "1\342\002*GPBMetadata\\Saltoapis\\Nebula\\Control" +
      "ler\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.saltoapis.longrunning.v1.OperationProto.getDescriptor(),
        });
    internal_static_salto_nebula_controller_v1_Controller_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_salto_nebula_controller_v1_Controller_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_Controller_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "DeviceId", "Gateway", "Extender", "AccessPoints", "Initialized", "Outdated", "Connected", "LastEventTime", "ParentDevice", });
    internal_static_salto_nebula_controller_v1_CreateControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_salto_nebula_controller_v1_CreateControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_CreateControllerRequest_descriptor,
        new java.lang.String[] { "Parent", "ControllerId", "Controller", });
    internal_static_salto_nebula_controller_v1_GetControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_salto_nebula_controller_v1_GetControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_GetControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_controller_v1_ListControllersRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_salto_nebula_controller_v1_ListControllersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ListControllersRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_salto_nebula_controller_v1_ListControllersResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_salto_nebula_controller_v1_ListControllersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ListControllersResponse_descriptor,
        new java.lang.String[] { "Controllers", "NextPageToken", });
    internal_static_salto_nebula_controller_v1_UpdateControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_salto_nebula_controller_v1_UpdateControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_UpdateControllerRequest_descriptor,
        new java.lang.String[] { "Controller", "UpdateMask", });
    internal_static_salto_nebula_controller_v1_DeleteControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_salto_nebula_controller_v1_DeleteControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_DeleteControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_controller_v1_BindControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_salto_nebula_controller_v1_BindControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_BindControllerRequest_descriptor,
        new java.lang.String[] { "Name", "DeviceId", });
    internal_static_salto_nebula_controller_v1_BindControllerResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_salto_nebula_controller_v1_BindControllerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_BindControllerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_UnbindControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_salto_nebula_controller_v1_UnbindControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_UnbindControllerRequest_descriptor,
        new java.lang.String[] { "Name", "Force", });
    internal_static_salto_nebula_controller_v1_UnbindControllerResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_salto_nebula_controller_v1_UnbindControllerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_UnbindControllerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_InitializeControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_salto_nebula_controller_v1_InitializeControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_InitializeControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_controller_v1_InitializeControllerResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_salto_nebula_controller_v1_InitializeControllerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_InitializeControllerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_InitializeControllerMetadata_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_salto_nebula_controller_v1_InitializeControllerMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_InitializeControllerMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", });
    internal_static_salto_nebula_controller_v1_ConfigureControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_salto_nebula_controller_v1_ConfigureControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ConfigureControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_controller_v1_ConfigureControllerResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_salto_nebula_controller_v1_ConfigureControllerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ConfigureControllerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_ConfigureControllerMetadata_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_salto_nebula_controller_v1_ConfigureControllerMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ConfigureControllerMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", });
    internal_static_salto_nebula_controller_v1_ResetControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_salto_nebula_controller_v1_ResetControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ResetControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_salto_nebula_controller_v1_ResetControllerResponse_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_salto_nebula_controller_v1_ResetControllerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ResetControllerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_ResetControllerMetadata_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_salto_nebula_controller_v1_ResetControllerMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_ResetControllerMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareRequest_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareResponse_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareResponse_descriptor,
        new java.lang.String[] { });
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareMetadata_descriptor =
      getDescriptor().getMessageTypes().get(22);
    internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_UpdateControllerFirmwareMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", });
    internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(23);
    internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(24);
    internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_GenerateAuthorizationTokenResponse_descriptor,
        new java.lang.String[] { "AuthorizationToken", });
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriRequest_descriptor =
      getDescriptor().getMessageTypes().get(25);
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriResponse_descriptor =
      getDescriptor().getMessageTypes().get(26);
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriResponse_descriptor,
        new java.lang.String[] { "DownloadUri", "Digest", });
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriMetadata_descriptor =
      getDescriptor().getMessageTypes().get(27);
    internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_salto_nebula_controller_v1_GenerateFirmwareDownloadUriMetadata_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.saltoapis.longrunning.v1.OperationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
