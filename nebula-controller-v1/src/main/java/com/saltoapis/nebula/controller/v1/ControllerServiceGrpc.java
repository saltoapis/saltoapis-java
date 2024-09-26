package com.saltoapis.nebula.controller.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Controllers are mains-wired hardware devices that can be used to control access where
 * a standalone lock cannot be fitted. For example, on car park barriers, turnstiles or
 * sliding doors. They allow the management of multiple accesses from a single device.
 * For example, one single controller could control access to both the entrance and exit
 * of a building via a turnstile. This service is responsible for managing controllers
 * resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/controller/v1/controller.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ControllerServiceGrpc {

  private ControllerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.controller.v1.ControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.CreateControllerRequest,
      com.saltoapis.nebula.controller.v1.Controller> getCreateControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateController",
      requestType = com.saltoapis.nebula.controller.v1.CreateControllerRequest.class,
      responseType = com.saltoapis.nebula.controller.v1.Controller.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.CreateControllerRequest,
      com.saltoapis.nebula.controller.v1.Controller> getCreateControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.CreateControllerRequest, com.saltoapis.nebula.controller.v1.Controller> getCreateControllerMethod;
    if ((getCreateControllerMethod = ControllerServiceGrpc.getCreateControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getCreateControllerMethod = ControllerServiceGrpc.getCreateControllerMethod) == null) {
          ControllerServiceGrpc.getCreateControllerMethod = getCreateControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.CreateControllerRequest, com.saltoapis.nebula.controller.v1.Controller>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.CreateControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.Controller.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("CreateController"))
              .build();
        }
      }
    }
    return getCreateControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.GetControllerRequest,
      com.saltoapis.nebula.controller.v1.Controller> getGetControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetController",
      requestType = com.saltoapis.nebula.controller.v1.GetControllerRequest.class,
      responseType = com.saltoapis.nebula.controller.v1.Controller.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.GetControllerRequest,
      com.saltoapis.nebula.controller.v1.Controller> getGetControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.GetControllerRequest, com.saltoapis.nebula.controller.v1.Controller> getGetControllerMethod;
    if ((getGetControllerMethod = ControllerServiceGrpc.getGetControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getGetControllerMethod = ControllerServiceGrpc.getGetControllerMethod) == null) {
          ControllerServiceGrpc.getGetControllerMethod = getGetControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.GetControllerRequest, com.saltoapis.nebula.controller.v1.Controller>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.GetControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.Controller.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("GetController"))
              .build();
        }
      }
    }
    return getGetControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ListControllersRequest,
      com.saltoapis.nebula.controller.v1.ListControllersResponse> getListControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListControllers",
      requestType = com.saltoapis.nebula.controller.v1.ListControllersRequest.class,
      responseType = com.saltoapis.nebula.controller.v1.ListControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ListControllersRequest,
      com.saltoapis.nebula.controller.v1.ListControllersResponse> getListControllersMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ListControllersRequest, com.saltoapis.nebula.controller.v1.ListControllersResponse> getListControllersMethod;
    if ((getListControllersMethod = ControllerServiceGrpc.getListControllersMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getListControllersMethod = ControllerServiceGrpc.getListControllersMethod) == null) {
          ControllerServiceGrpc.getListControllersMethod = getListControllersMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.ListControllersRequest, com.saltoapis.nebula.controller.v1.ListControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.ListControllersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.ListControllersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("ListControllers"))
              .build();
        }
      }
    }
    return getListControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UpdateControllerRequest,
      com.saltoapis.nebula.controller.v1.Controller> getUpdateControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateController",
      requestType = com.saltoapis.nebula.controller.v1.UpdateControllerRequest.class,
      responseType = com.saltoapis.nebula.controller.v1.Controller.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UpdateControllerRequest,
      com.saltoapis.nebula.controller.v1.Controller> getUpdateControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UpdateControllerRequest, com.saltoapis.nebula.controller.v1.Controller> getUpdateControllerMethod;
    if ((getUpdateControllerMethod = ControllerServiceGrpc.getUpdateControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getUpdateControllerMethod = ControllerServiceGrpc.getUpdateControllerMethod) == null) {
          ControllerServiceGrpc.getUpdateControllerMethod = getUpdateControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.UpdateControllerRequest, com.saltoapis.nebula.controller.v1.Controller>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.UpdateControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.Controller.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("UpdateController"))
              .build();
        }
      }
    }
    return getUpdateControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.DeleteControllerRequest,
      com.google.protobuf.Empty> getDeleteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteController",
      requestType = com.saltoapis.nebula.controller.v1.DeleteControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.DeleteControllerRequest,
      com.google.protobuf.Empty> getDeleteControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.DeleteControllerRequest, com.google.protobuf.Empty> getDeleteControllerMethod;
    if ((getDeleteControllerMethod = ControllerServiceGrpc.getDeleteControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getDeleteControllerMethod = ControllerServiceGrpc.getDeleteControllerMethod) == null) {
          ControllerServiceGrpc.getDeleteControllerMethod = getDeleteControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.DeleteControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.DeleteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("DeleteController"))
              .build();
        }
      }
    }
    return getDeleteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.BindControllerRequest,
      com.saltoapis.nebula.controller.v1.BindControllerResponse> getBindControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindController",
      requestType = com.saltoapis.nebula.controller.v1.BindControllerRequest.class,
      responseType = com.saltoapis.nebula.controller.v1.BindControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.BindControllerRequest,
      com.saltoapis.nebula.controller.v1.BindControllerResponse> getBindControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.BindControllerRequest, com.saltoapis.nebula.controller.v1.BindControllerResponse> getBindControllerMethod;
    if ((getBindControllerMethod = ControllerServiceGrpc.getBindControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getBindControllerMethod = ControllerServiceGrpc.getBindControllerMethod) == null) {
          ControllerServiceGrpc.getBindControllerMethod = getBindControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.BindControllerRequest, com.saltoapis.nebula.controller.v1.BindControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.BindControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.BindControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("BindController"))
              .build();
        }
      }
    }
    return getBindControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UnbindControllerRequest,
      com.saltoapis.nebula.controller.v1.UnbindControllerResponse> getUnbindControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindController",
      requestType = com.saltoapis.nebula.controller.v1.UnbindControllerRequest.class,
      responseType = com.saltoapis.nebula.controller.v1.UnbindControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UnbindControllerRequest,
      com.saltoapis.nebula.controller.v1.UnbindControllerResponse> getUnbindControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UnbindControllerRequest, com.saltoapis.nebula.controller.v1.UnbindControllerResponse> getUnbindControllerMethod;
    if ((getUnbindControllerMethod = ControllerServiceGrpc.getUnbindControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getUnbindControllerMethod = ControllerServiceGrpc.getUnbindControllerMethod) == null) {
          ControllerServiceGrpc.getUnbindControllerMethod = getUnbindControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.UnbindControllerRequest, com.saltoapis.nebula.controller.v1.UnbindControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.UnbindControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.UnbindControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("UnbindController"))
              .build();
        }
      }
    }
    return getUnbindControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.InitializeControllerRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeController",
      requestType = com.saltoapis.nebula.controller.v1.InitializeControllerRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.InitializeControllerRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.InitializeControllerRequest, com.saltoapis.longrunning.v1.Operation> getInitializeControllerMethod;
    if ((getInitializeControllerMethod = ControllerServiceGrpc.getInitializeControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getInitializeControllerMethod = ControllerServiceGrpc.getInitializeControllerMethod) == null) {
          ControllerServiceGrpc.getInitializeControllerMethod = getInitializeControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.InitializeControllerRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.InitializeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("InitializeController"))
              .build();
        }
      }
    }
    return getInitializeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ConfigureControllerRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureController",
      requestType = com.saltoapis.nebula.controller.v1.ConfigureControllerRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ConfigureControllerRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ConfigureControllerRequest, com.saltoapis.longrunning.v1.Operation> getConfigureControllerMethod;
    if ((getConfigureControllerMethod = ControllerServiceGrpc.getConfigureControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getConfigureControllerMethod = ControllerServiceGrpc.getConfigureControllerMethod) == null) {
          ControllerServiceGrpc.getConfigureControllerMethod = getConfigureControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.ConfigureControllerRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.ConfigureControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("ConfigureController"))
              .build();
        }
      }
    }
    return getConfigureControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ResetControllerRequest,
      com.saltoapis.longrunning.v1.Operation> getResetControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetController",
      requestType = com.saltoapis.nebula.controller.v1.ResetControllerRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ResetControllerRequest,
      com.saltoapis.longrunning.v1.Operation> getResetControllerMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.ResetControllerRequest, com.saltoapis.longrunning.v1.Operation> getResetControllerMethod;
    if ((getResetControllerMethod = ControllerServiceGrpc.getResetControllerMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getResetControllerMethod = ControllerServiceGrpc.getResetControllerMethod) == null) {
          ControllerServiceGrpc.getResetControllerMethod = getResetControllerMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.ResetControllerRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.ResetControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("ResetController"))
              .build();
        }
      }
    }
    return getResetControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateControllerFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateControllerFirmware",
      requestType = com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateControllerFirmwareMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest, com.saltoapis.longrunning.v1.Operation> getUpdateControllerFirmwareMethod;
    if ((getUpdateControllerFirmwareMethod = ControllerServiceGrpc.getUpdateControllerFirmwareMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getUpdateControllerFirmwareMethod = ControllerServiceGrpc.getUpdateControllerFirmwareMethod) == null) {
          ControllerServiceGrpc.getUpdateControllerFirmwareMethod = getUpdateControllerFirmwareMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateControllerFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("UpdateControllerFirmware"))
              .build();
        }
      }
    }
    return getUpdateControllerFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateFirmwareDownloadUri",
      requestType = com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;
    if ((getGenerateFirmwareDownloadUriMethod = ControllerServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
      synchronized (ControllerServiceGrpc.class) {
        if ((getGenerateFirmwareDownloadUriMethod = ControllerServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
          ControllerServiceGrpc.getGenerateFirmwareDownloadUriMethod = getGenerateFirmwareDownloadUriMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateFirmwareDownloadUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ControllerServiceMethodDescriptorSupplier("GenerateFirmwareDownloadUri"))
              .build();
        }
      }
    }
    return getGenerateFirmwareDownloadUriMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControllerServiceStub>() {
        @java.lang.Override
        public ControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControllerServiceStub(channel, callOptions);
        }
      };
    return ControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControllerServiceBlockingStub>() {
        @java.lang.Override
        public ControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return ControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ControllerServiceFutureStub>() {
        @java.lang.Override
        public ControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ControllerServiceFutureStub(channel, callOptions);
        }
      };
    return ControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Controllers are mains-wired hardware devices that can be used to control access where
   * a standalone lock cannot be fitted. For example, on car park barriers, turnstiles or
   * sliding doors. They allow the management of multiple accesses from a single device.
   * For example, one single controller could control access to both the entrance and exit
   * of a building via a turnstile. This service is responsible for managing controllers
   * resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a controller
     * Creates a new controller
     * </pre>
     */
    default void createController(com.saltoapis.nebula.controller.v1.CreateControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a controller
     * Gets an existing controller.
     * </pre>
     */
    default void getController(com.saltoapis.nebula.controller.v1.GetControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List controllers
     * Returns a list of controllers that have been previously created.
     * </pre>
     */
    default void listControllers(com.saltoapis.nebula.controller.v1.ListControllersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.ListControllersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListControllersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a controller
     * Updates an existing controller.
     * </pre>
     */
    default void updateController(com.saltoapis.nebula.controller.v1.UpdateControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a controller
     * Permanently deletes a controller. This cannot be undone.
     * </pre>
     */
    default void deleteController(com.saltoapis.nebula.controller.v1.DeleteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind a controller
     * Binds a controller. Binding a controller assigns a device
     * identifier to the controller. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    default void bindController(com.saltoapis.nebula.controller.v1.BindControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.BindControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind a controller
     * Unbinds a controller. Unbinding a controller removes the
     * device identifier from the controller. This may be required in some
     * cases where the controller is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    default void unbindController(com.saltoapis.nebula.controller.v1.UnbindControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.UnbindControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialize a controller
     * Initializes a controller. Controllers need to be initialized
     * before you can start to use them.
     * </pre>
     */
    default void initializeController(com.saltoapis.nebula.controller.v1.InitializeControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure a controller
     * Configures a controller. Configuring a controller implies
     * adding some information to the controller such as setting the time
     * zone.
     * </pre>
     */
    default void configureController(com.saltoapis.nebula.controller.v1.ConfigureControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset a controller
     * Resetting a device such as a controller means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    default void resetController(com.saltoapis.nebula.controller.v1.ResetControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update controller firmware
     * Updates a controller's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    default void updateControllerFirmware(com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateControllerFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate controller firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * controller. The returned URI can be used to bring the controller
     * firmwares up to latest.
     * </pre>
     */
    default void generateFirmwareDownloadUri(com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateFirmwareDownloadUriMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ControllerService.
   * <pre>
   * Controllers are mains-wired hardware devices that can be used to control access where
   * a standalone lock cannot be fitted. For example, on car park barriers, turnstiles or
   * sliding doors. They allow the management of multiple accesses from a single device.
   * For example, one single controller could control access to both the entrance and exit
   * of a building via a turnstile. This service is responsible for managing controllers
   * resources.
   * </pre>
   */
  public static abstract class ControllerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ControllerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ControllerService.
   * <pre>
   * Controllers are mains-wired hardware devices that can be used to control access where
   * a standalone lock cannot be fitted. For example, on car park barriers, turnstiles or
   * sliding doors. They allow the management of multiple accesses from a single device.
   * For example, one single controller could control access to both the entrance and exit
   * of a building via a turnstile. This service is responsible for managing controllers
   * resources.
   * </pre>
   */
  public static final class ControllerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ControllerServiceStub> {
    private ControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControllerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a controller
     * Creates a new controller
     * </pre>
     */
    public void createController(com.saltoapis.nebula.controller.v1.CreateControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a controller
     * Gets an existing controller.
     * </pre>
     */
    public void getController(com.saltoapis.nebula.controller.v1.GetControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List controllers
     * Returns a list of controllers that have been previously created.
     * </pre>
     */
    public void listControllers(com.saltoapis.nebula.controller.v1.ListControllersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.ListControllersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a controller
     * Updates an existing controller.
     * </pre>
     */
    public void updateController(com.saltoapis.nebula.controller.v1.UpdateControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a controller
     * Permanently deletes a controller. This cannot be undone.
     * </pre>
     */
    public void deleteController(com.saltoapis.nebula.controller.v1.DeleteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind a controller
     * Binds a controller. Binding a controller assigns a device
     * identifier to the controller. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindController(com.saltoapis.nebula.controller.v1.BindControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.BindControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind a controller
     * Unbinds a controller. Unbinding a controller removes the
     * device identifier from the controller. This may be required in some
     * cases where the controller is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindController(com.saltoapis.nebula.controller.v1.UnbindControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.UnbindControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initialize a controller
     * Initializes a controller. Controllers need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public void initializeController(com.saltoapis.nebula.controller.v1.InitializeControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure a controller
     * Configures a controller. Configuring a controller implies
     * adding some information to the controller such as setting the time
     * zone.
     * </pre>
     */
    public void configureController(com.saltoapis.nebula.controller.v1.ConfigureControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset a controller
     * Resetting a device such as a controller means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetController(com.saltoapis.nebula.controller.v1.ResetControllerRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update controller firmware
     * Updates a controller's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateControllerFirmware(com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateControllerFirmwareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate controller firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * controller. The returned URI can be used to bring the controller
     * firmwares up to latest.
     * </pre>
     */
    public void generateFirmwareDownloadUri(com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ControllerService.
   * <pre>
   * Controllers are mains-wired hardware devices that can be used to control access where
   * a standalone lock cannot be fitted. For example, on car park barriers, turnstiles or
   * sliding doors. They allow the management of multiple accesses from a single device.
   * For example, one single controller could control access to both the entrance and exit
   * of a building via a turnstile. This service is responsible for managing controllers
   * resources.
   * </pre>
   */
  public static final class ControllerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ControllerServiceBlockingStub> {
    private ControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a controller
     * Creates a new controller
     * </pre>
     */
    public com.saltoapis.nebula.controller.v1.Controller createController(com.saltoapis.nebula.controller.v1.CreateControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a controller
     * Gets an existing controller.
     * </pre>
     */
    public com.saltoapis.nebula.controller.v1.Controller getController(com.saltoapis.nebula.controller.v1.GetControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List controllers
     * Returns a list of controllers that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.controller.v1.ListControllersResponse listControllers(com.saltoapis.nebula.controller.v1.ListControllersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListControllersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a controller
     * Updates an existing controller.
     * </pre>
     */
    public com.saltoapis.nebula.controller.v1.Controller updateController(com.saltoapis.nebula.controller.v1.UpdateControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a controller
     * Permanently deletes a controller. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteController(com.saltoapis.nebula.controller.v1.DeleteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind a controller
     * Binds a controller. Binding a controller assigns a device
     * identifier to the controller. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.saltoapis.nebula.controller.v1.BindControllerResponse bindController(com.saltoapis.nebula.controller.v1.BindControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind a controller
     * Unbinds a controller. Unbinding a controller removes the
     * device identifier from the controller. This may be required in some
     * cases where the controller is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.saltoapis.nebula.controller.v1.UnbindControllerResponse unbindController(com.saltoapis.nebula.controller.v1.UnbindControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initialize a controller
     * Initializes a controller. Controllers need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation initializeController(com.saltoapis.nebula.controller.v1.InitializeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure a controller
     * Configures a controller. Configuring a controller implies
     * adding some information to the controller such as setting the time
     * zone.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation configureController(com.saltoapis.nebula.controller.v1.ConfigureControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset a controller
     * Resetting a device such as a controller means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetController(com.saltoapis.nebula.controller.v1.ResetControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update controller firmware
     * Updates a controller's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation updateControllerFirmware(com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateControllerFirmwareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate controller firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * controller. The returned URI can be used to bring the controller
     * firmwares up to latest.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation generateFirmwareDownloadUri(com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateFirmwareDownloadUriMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ControllerService.
   * <pre>
   * Controllers are mains-wired hardware devices that can be used to control access where
   * a standalone lock cannot be fitted. For example, on car park barriers, turnstiles or
   * sliding doors. They allow the management of multiple accesses from a single device.
   * For example, one single controller could control access to both the entrance and exit
   * of a building via a turnstile. This service is responsible for managing controllers
   * resources.
   * </pre>
   */
  public static final class ControllerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ControllerServiceFutureStub> {
    private ControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ControllerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a controller
     * Creates a new controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.controller.v1.Controller> createController(
        com.saltoapis.nebula.controller.v1.CreateControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a controller
     * Gets an existing controller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.controller.v1.Controller> getController(
        com.saltoapis.nebula.controller.v1.GetControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List controllers
     * Returns a list of controllers that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.controller.v1.ListControllersResponse> listControllers(
        com.saltoapis.nebula.controller.v1.ListControllersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListControllersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a controller
     * Updates an existing controller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.controller.v1.Controller> updateController(
        com.saltoapis.nebula.controller.v1.UpdateControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a controller
     * Permanently deletes a controller. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteController(
        com.saltoapis.nebula.controller.v1.DeleteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind a controller
     * Binds a controller. Binding a controller assigns a device
     * identifier to the controller. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.controller.v1.BindControllerResponse> bindController(
        com.saltoapis.nebula.controller.v1.BindControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind a controller
     * Unbinds a controller. Unbinding a controller removes the
     * device identifier from the controller. This may be required in some
     * cases where the controller is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.controller.v1.UnbindControllerResponse> unbindController(
        com.saltoapis.nebula.controller.v1.UnbindControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initialize a controller
     * Initializes a controller. Controllers need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> initializeController(
        com.saltoapis.nebula.controller.v1.InitializeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure a controller
     * Configures a controller. Configuring a controller implies
     * adding some information to the controller such as setting the time
     * zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> configureController(
        com.saltoapis.nebula.controller.v1.ConfigureControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset a controller
     * Resetting a device such as a controller means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetController(
        com.saltoapis.nebula.controller.v1.ResetControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update controller firmware
     * Updates a controller's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> updateControllerFirmware(
        com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateControllerFirmwareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate controller firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * controller. The returned URI can be used to bring the controller
     * firmwares up to latest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> generateFirmwareDownloadUri(
        com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONTROLLER = 0;
  private static final int METHODID_GET_CONTROLLER = 1;
  private static final int METHODID_LIST_CONTROLLERS = 2;
  private static final int METHODID_UPDATE_CONTROLLER = 3;
  private static final int METHODID_DELETE_CONTROLLER = 4;
  private static final int METHODID_BIND_CONTROLLER = 5;
  private static final int METHODID_UNBIND_CONTROLLER = 6;
  private static final int METHODID_INITIALIZE_CONTROLLER = 7;
  private static final int METHODID_CONFIGURE_CONTROLLER = 8;
  private static final int METHODID_RESET_CONTROLLER = 9;
  private static final int METHODID_UPDATE_CONTROLLER_FIRMWARE = 10;
  private static final int METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CONTROLLER:
          serviceImpl.createController((com.saltoapis.nebula.controller.v1.CreateControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller>) responseObserver);
          break;
        case METHODID_GET_CONTROLLER:
          serviceImpl.getController((com.saltoapis.nebula.controller.v1.GetControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller>) responseObserver);
          break;
        case METHODID_LIST_CONTROLLERS:
          serviceImpl.listControllers((com.saltoapis.nebula.controller.v1.ListControllersRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.ListControllersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTROLLER:
          serviceImpl.updateController((com.saltoapis.nebula.controller.v1.UpdateControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.Controller>) responseObserver);
          break;
        case METHODID_DELETE_CONTROLLER:
          serviceImpl.deleteController((com.saltoapis.nebula.controller.v1.DeleteControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BIND_CONTROLLER:
          serviceImpl.bindController((com.saltoapis.nebula.controller.v1.BindControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.BindControllerResponse>) responseObserver);
          break;
        case METHODID_UNBIND_CONTROLLER:
          serviceImpl.unbindController((com.saltoapis.nebula.controller.v1.UnbindControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.controller.v1.UnbindControllerResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_CONTROLLER:
          serviceImpl.initializeController((com.saltoapis.nebula.controller.v1.InitializeControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_CONTROLLER:
          serviceImpl.configureController((com.saltoapis.nebula.controller.v1.ConfigureControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_CONTROLLER:
          serviceImpl.resetController((com.saltoapis.nebula.controller.v1.ResetControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_CONTROLLER_FIRMWARE:
          serviceImpl.updateControllerFirmware((com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI:
          serviceImpl.generateFirmwareDownloadUri((com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.CreateControllerRequest,
              com.saltoapis.nebula.controller.v1.Controller>(
                service, METHODID_CREATE_CONTROLLER)))
        .addMethod(
          getGetControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.GetControllerRequest,
              com.saltoapis.nebula.controller.v1.Controller>(
                service, METHODID_GET_CONTROLLER)))
        .addMethod(
          getListControllersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.ListControllersRequest,
              com.saltoapis.nebula.controller.v1.ListControllersResponse>(
                service, METHODID_LIST_CONTROLLERS)))
        .addMethod(
          getUpdateControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.UpdateControllerRequest,
              com.saltoapis.nebula.controller.v1.Controller>(
                service, METHODID_UPDATE_CONTROLLER)))
        .addMethod(
          getDeleteControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.DeleteControllerRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CONTROLLER)))
        .addMethod(
          getBindControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.BindControllerRequest,
              com.saltoapis.nebula.controller.v1.BindControllerResponse>(
                service, METHODID_BIND_CONTROLLER)))
        .addMethod(
          getUnbindControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.UnbindControllerRequest,
              com.saltoapis.nebula.controller.v1.UnbindControllerResponse>(
                service, METHODID_UNBIND_CONTROLLER)))
        .addMethod(
          getInitializeControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.InitializeControllerRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_INITIALIZE_CONTROLLER)))
        .addMethod(
          getConfigureControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.ConfigureControllerRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_CONFIGURE_CONTROLLER)))
        .addMethod(
          getResetControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.ResetControllerRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_RESET_CONTROLLER)))
        .addMethod(
          getUpdateControllerFirmwareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.UpdateControllerFirmwareRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_UPDATE_CONTROLLER_FIRMWARE)))
        .addMethod(
          getGenerateFirmwareDownloadUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.controller.v1.GenerateFirmwareDownloadUriRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI)))
        .build();
  }

  private static abstract class ControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ControllerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.controller.v1.ControllerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ControllerService");
    }
  }

  private static final class ControllerServiceFileDescriptorSupplier
      extends ControllerServiceBaseDescriptorSupplier {
    ControllerServiceFileDescriptorSupplier() {}
  }

  private static final class ControllerServiceMethodDescriptorSupplier
      extends ControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ControllerServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ControllerServiceFileDescriptorSupplier())
              .addMethod(getCreateControllerMethod())
              .addMethod(getGetControllerMethod())
              .addMethod(getListControllersMethod())
              .addMethod(getUpdateControllerMethod())
              .addMethod(getDeleteControllerMethod())
              .addMethod(getBindControllerMethod())
              .addMethod(getUnbindControllerMethod())
              .addMethod(getInitializeControllerMethod())
              .addMethod(getConfigureControllerMethod())
              .addMethod(getResetControllerMethod())
              .addMethod(getUpdateControllerFirmwareMethod())
              .addMethod(getGenerateFirmwareDownloadUriMethod())
              .build();
        }
      }
    }
    return result;
  }
}
