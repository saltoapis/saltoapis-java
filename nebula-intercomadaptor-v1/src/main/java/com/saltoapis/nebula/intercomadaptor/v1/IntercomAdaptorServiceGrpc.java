package com.saltoapis.nebula.intercomadaptor.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An intercom adaptor is a device that can be connected to an existing intercom
 * system close to the telephone handset, without affecting its proper
 * functioning. Its main function is to convert the intercom system to become
 * part of the access control system.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/intercomadaptor/v1/intercom_adaptor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntercomAdaptorServiceGrpc {

  private IntercomAdaptorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.intercomadaptor.v1.IntercomAdaptorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getCreateIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getCreateIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getCreateIntercomAdaptorMethod;
    if ((getCreateIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getCreateIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getCreateIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getCreateIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getCreateIntercomAdaptorMethod = getCreateIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("CreateIntercomAdaptor"))
              .build();
        }
      }
    }
    return getCreateIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getGetIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getGetIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getGetIntercomAdaptorMethod;
    if ((getGetIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getGetIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getGetIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getGetIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getGetIntercomAdaptorMethod = getGetIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("GetIntercomAdaptor"))
              .build();
        }
      }
    }
    return getGetIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest,
      com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse> getListIntercomAdaptorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIntercomAdaptors",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest,
      com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse> getListIntercomAdaptorsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest, com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse> getListIntercomAdaptorsMethod;
    if ((getListIntercomAdaptorsMethod = IntercomAdaptorServiceGrpc.getListIntercomAdaptorsMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getListIntercomAdaptorsMethod = IntercomAdaptorServiceGrpc.getListIntercomAdaptorsMethod) == null) {
          IntercomAdaptorServiceGrpc.getListIntercomAdaptorsMethod = getListIntercomAdaptorsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest, com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIntercomAdaptors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("ListIntercomAdaptors"))
              .build();
        }
      }
    }
    return getListIntercomAdaptorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getUpdateIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getUpdateIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getUpdateIntercomAdaptorMethod;
    if ((getUpdateIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getUpdateIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getUpdateIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getUpdateIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getUpdateIntercomAdaptorMethod = getUpdateIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("UpdateIntercomAdaptor"))
              .build();
        }
      }
    }
    return getUpdateIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest,
      com.google.protobuf.Empty> getDeleteIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest,
      com.google.protobuf.Empty> getDeleteIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest, com.google.protobuf.Empty> getDeleteIntercomAdaptorMethod;
    if ((getDeleteIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getDeleteIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getDeleteIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getDeleteIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getDeleteIntercomAdaptorMethod = getDeleteIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("DeleteIntercomAdaptor"))
              .build();
        }
      }
    }
    return getDeleteIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse> getBindIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse> getBindIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse> getBindIntercomAdaptorMethod;
    if ((getBindIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getBindIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getBindIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getBindIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getBindIntercomAdaptorMethod = getBindIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("BindIntercomAdaptor"))
              .build();
        }
      }
    }
    return getBindIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse> getUnbindIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest,
      com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse> getUnbindIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse> getUnbindIntercomAdaptorMethod;
    if ((getUnbindIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getUnbindIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getUnbindIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getUnbindIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getUnbindIntercomAdaptorMethod = getUnbindIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest, com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("UnbindIntercomAdaptor"))
              .build();
        }
      }
    }
    return getUnbindIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest, com.saltoapis.longrunning.v1.Operation> getInitializeIntercomAdaptorMethod;
    if ((getInitializeIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getInitializeIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getInitializeIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getInitializeIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getInitializeIntercomAdaptorMethod = getInitializeIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("InitializeIntercomAdaptor"))
              .build();
        }
      }
    }
    return getInitializeIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest, com.saltoapis.longrunning.v1.Operation> getConfigureIntercomAdaptorMethod;
    if ((getConfigureIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getConfigureIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getConfigureIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getConfigureIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getConfigureIntercomAdaptorMethod = getConfigureIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("ConfigureIntercomAdaptor"))
              .build();
        }
      }
    }
    return getConfigureIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest,
      com.saltoapis.longrunning.v1.Operation> getResetIntercomAdaptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetIntercomAdaptor",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest,
      com.saltoapis.longrunning.v1.Operation> getResetIntercomAdaptorMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest, com.saltoapis.longrunning.v1.Operation> getResetIntercomAdaptorMethod;
    if ((getResetIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getResetIntercomAdaptorMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getResetIntercomAdaptorMethod = IntercomAdaptorServiceGrpc.getResetIntercomAdaptorMethod) == null) {
          IntercomAdaptorServiceGrpc.getResetIntercomAdaptorMethod = getResetIntercomAdaptorMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetIntercomAdaptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("ResetIntercomAdaptor"))
              .build();
        }
      }
    }
    return getResetIntercomAdaptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateIntercomAdaptorFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIntercomAdaptorFirmware",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateIntercomAdaptorFirmwareMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest, com.saltoapis.longrunning.v1.Operation> getUpdateIntercomAdaptorFirmwareMethod;
    if ((getUpdateIntercomAdaptorFirmwareMethod = IntercomAdaptorServiceGrpc.getUpdateIntercomAdaptorFirmwareMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getUpdateIntercomAdaptorFirmwareMethod = IntercomAdaptorServiceGrpc.getUpdateIntercomAdaptorFirmwareMethod) == null) {
          IntercomAdaptorServiceGrpc.getUpdateIntercomAdaptorFirmwareMethod = getUpdateIntercomAdaptorFirmwareMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIntercomAdaptorFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("UpdateIntercomAdaptorFirmware"))
              .build();
        }
      }
    }
    return getUpdateIntercomAdaptorFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAuthorizationToken",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest.class,
      responseType = com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;
    if ((getGenerateAuthorizationTokenMethod = IntercomAdaptorServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getGenerateAuthorizationTokenMethod = IntercomAdaptorServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
          IntercomAdaptorServiceGrpc.getGenerateAuthorizationTokenMethod = getGenerateAuthorizationTokenMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAuthorizationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("GenerateAuthorizationToken"))
              .build();
        }
      }
    }
    return getGenerateAuthorizationTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateFirmwareDownloadUri",
      requestType = com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;
    if ((getGenerateFirmwareDownloadUriMethod = IntercomAdaptorServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
      synchronized (IntercomAdaptorServiceGrpc.class) {
        if ((getGenerateFirmwareDownloadUriMethod = IntercomAdaptorServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
          IntercomAdaptorServiceGrpc.getGenerateFirmwareDownloadUriMethod = getGenerateFirmwareDownloadUriMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateFirmwareDownloadUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomAdaptorServiceMethodDescriptorSupplier("GenerateFirmwareDownloadUri"))
              .build();
        }
      }
    }
    return getGenerateFirmwareDownloadUriMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntercomAdaptorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntercomAdaptorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntercomAdaptorServiceStub>() {
        @java.lang.Override
        public IntercomAdaptorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntercomAdaptorServiceStub(channel, callOptions);
        }
      };
    return IntercomAdaptorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntercomAdaptorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntercomAdaptorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntercomAdaptorServiceBlockingStub>() {
        @java.lang.Override
        public IntercomAdaptorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntercomAdaptorServiceBlockingStub(channel, callOptions);
        }
      };
    return IntercomAdaptorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntercomAdaptorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntercomAdaptorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntercomAdaptorServiceFutureStub>() {
        @java.lang.Override
        public IntercomAdaptorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntercomAdaptorServiceFutureStub(channel, callOptions);
        }
      };
    return IntercomAdaptorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an intercom adaptor
     * Creates a new intercom adaptor
     * </pre>
     */
    default void createIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an intercom adaptor
     * Gets an existing intercom adaptor.
     * </pre>
     */
    default void getIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * List intercom adaptors
     * Returns a list of intercom adaptors that have been previously created.
     * </pre>
     */
    default void listIntercomAdaptors(com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIntercomAdaptorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an intercom adaptor
     * Updates an existing intercom adaptor.
     * </pre>
     */
    default void updateIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an intercom adaptor
     * Permanently deletes an intercom adaptor. This cannot be undone.
     * </pre>
     */
    default void deleteIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind an intercom adaptor
     * Binds an intercom adaptor. Binding an intercom adaptor assigns a device
     * identifier to the intercom adaptor. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    default void bindIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind an intercom adaptor
     * Unbinds an intercom adaptor. Unbinding an intercom adaptor removes the
     * device identifier from the intercom adaptor. This may be required in some
     * cases where the intercom adaptor is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    default void unbindIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialize an intercom adaptor
     * Initializes an intercom adaptor. Intercom adaptors need to be initialized
     * before you can start to use them.
     * </pre>
     */
    default void initializeIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure an intercom adaptor
     * Configures an intercom adaptor. Configuring an intercom adaptor implies
     * adding some information to the intercom adaptor such as setting the time
     * zone.
     * </pre>
     */
    default void configureIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset an intercom adaptor
     * Resetting a device such as an intercom adaptor means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    default void resetIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetIntercomAdaptorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update intercom adaptor firmware
     * Updates an intercom adaptor's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    default void updateIntercomAdaptorFirmware(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIntercomAdaptorFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates an authorization token for an intercom adaptor
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an intercom adaptor.
     * </pre>
     */
    default void generateAuthorizationToken(com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAuthorizationTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate intercom adaptor firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * intercom adaptor. The returned URI can be used to bring the intercom
     * adaptor firmwares up to latest.
     * </pre>
     */
    default void generateFirmwareDownloadUri(com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateFirmwareDownloadUriMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IntercomAdaptorService.
   * <pre>
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * </pre>
   */
  public static abstract class IntercomAdaptorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IntercomAdaptorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IntercomAdaptorService.
   * <pre>
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * </pre>
   */
  public static final class IntercomAdaptorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IntercomAdaptorServiceStub> {
    private IntercomAdaptorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntercomAdaptorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntercomAdaptorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an intercom adaptor
     * Creates a new intercom adaptor
     * </pre>
     */
    public void createIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an intercom adaptor
     * Gets an existing intercom adaptor.
     * </pre>
     */
    public void getIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List intercom adaptors
     * Returns a list of intercom adaptors that have been previously created.
     * </pre>
     */
    public void listIntercomAdaptors(com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIntercomAdaptorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an intercom adaptor
     * Updates an existing intercom adaptor.
     * </pre>
     */
    public void updateIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an intercom adaptor
     * Permanently deletes an intercom adaptor. This cannot be undone.
     * </pre>
     */
    public void deleteIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind an intercom adaptor
     * Binds an intercom adaptor. Binding an intercom adaptor assigns a device
     * identifier to the intercom adaptor. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind an intercom adaptor
     * Unbinds an intercom adaptor. Unbinding an intercom adaptor removes the
     * device identifier from the intercom adaptor. This may be required in some
     * cases where the intercom adaptor is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initialize an intercom adaptor
     * Initializes an intercom adaptor. Intercom adaptors need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public void initializeIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure an intercom adaptor
     * Configures an intercom adaptor. Configuring an intercom adaptor implies
     * adding some information to the intercom adaptor such as setting the time
     * zone.
     * </pre>
     */
    public void configureIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset an intercom adaptor
     * Resetting a device such as an intercom adaptor means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetIntercomAdaptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update intercom adaptor firmware
     * Updates an intercom adaptor's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateIntercomAdaptorFirmware(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIntercomAdaptorFirmwareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates an authorization token for an intercom adaptor
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an intercom adaptor.
     * </pre>
     */
    public void generateAuthorizationToken(com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate intercom adaptor firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * intercom adaptor. The returned URI can be used to bring the intercom
     * adaptor firmwares up to latest.
     * </pre>
     */
    public void generateFirmwareDownloadUri(com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IntercomAdaptorService.
   * <pre>
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * </pre>
   */
  public static final class IntercomAdaptorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IntercomAdaptorServiceBlockingStub> {
    private IntercomAdaptorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntercomAdaptorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntercomAdaptorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an intercom adaptor
     * Creates a new intercom adaptor
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor createIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an intercom adaptor
     * Gets an existing intercom adaptor.
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor getIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List intercom adaptors
     * Returns a list of intercom adaptors that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse listIntercomAdaptors(com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIntercomAdaptorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an intercom adaptor
     * Updates an existing intercom adaptor.
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor updateIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an intercom adaptor
     * Permanently deletes an intercom adaptor. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind an intercom adaptor
     * Binds an intercom adaptor. Binding an intercom adaptor assigns a device
     * identifier to the intercom adaptor. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse bindIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind an intercom adaptor
     * Unbinds an intercom adaptor. Unbinding an intercom adaptor removes the
     * device identifier from the intercom adaptor. This may be required in some
     * cases where the intercom adaptor is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse unbindIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initialize an intercom adaptor
     * Initializes an intercom adaptor. Intercom adaptors need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation initializeIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure an intercom adaptor
     * Configures an intercom adaptor. Configuring an intercom adaptor implies
     * adding some information to the intercom adaptor such as setting the time
     * zone.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation configureIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset an intercom adaptor
     * Resetting a device such as an intercom adaptor means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetIntercomAdaptor(com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetIntercomAdaptorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update intercom adaptor firmware
     * Updates an intercom adaptor's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation updateIntercomAdaptorFirmware(com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIntercomAdaptorFirmwareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an authorization token for an intercom adaptor
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an intercom adaptor.
     * </pre>
     */
    public com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse generateAuthorizationToken(com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAuthorizationTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate intercom adaptor firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * intercom adaptor. The returned URI can be used to bring the intercom
     * adaptor firmwares up to latest.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation generateFirmwareDownloadUri(com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateFirmwareDownloadUriMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IntercomAdaptorService.
   * <pre>
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * </pre>
   */
  public static final class IntercomAdaptorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IntercomAdaptorServiceFutureStub> {
    private IntercomAdaptorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntercomAdaptorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntercomAdaptorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an intercom adaptor
     * Creates a new intercom adaptor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> createIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an intercom adaptor
     * Gets an existing intercom adaptor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> getIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List intercom adaptors
     * Returns a list of intercom adaptors that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse> listIntercomAdaptors(
        com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIntercomAdaptorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an intercom adaptor
     * Updates an existing intercom adaptor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor> updateIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an intercom adaptor
     * Permanently deletes an intercom adaptor. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind an intercom adaptor
     * Binds an intercom adaptor. Binding an intercom adaptor assigns a device
     * identifier to the intercom adaptor. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse> bindIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind an intercom adaptor
     * Unbinds an intercom adaptor. Unbinding an intercom adaptor removes the
     * device identifier from the intercom adaptor. This may be required in some
     * cases where the intercom adaptor is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse> unbindIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initialize an intercom adaptor
     * Initializes an intercom adaptor. Intercom adaptors need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> initializeIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure an intercom adaptor
     * Configures an intercom adaptor. Configuring an intercom adaptor implies
     * adding some information to the intercom adaptor such as setting the time
     * zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> configureIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset an intercom adaptor
     * Resetting a device such as an intercom adaptor means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetIntercomAdaptor(
        com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetIntercomAdaptorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update intercom adaptor firmware
     * Updates an intercom adaptor's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> updateIntercomAdaptorFirmware(
        com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIntercomAdaptorFirmwareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates an authorization token for an intercom adaptor
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an intercom adaptor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse> generateAuthorizationToken(
        com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate intercom adaptor firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * intercom adaptor. The returned URI can be used to bring the intercom
     * adaptor firmwares up to latest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> generateFirmwareDownloadUri(
        com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INTERCOM_ADAPTOR = 0;
  private static final int METHODID_GET_INTERCOM_ADAPTOR = 1;
  private static final int METHODID_LIST_INTERCOM_ADAPTORS = 2;
  private static final int METHODID_UPDATE_INTERCOM_ADAPTOR = 3;
  private static final int METHODID_DELETE_INTERCOM_ADAPTOR = 4;
  private static final int METHODID_BIND_INTERCOM_ADAPTOR = 5;
  private static final int METHODID_UNBIND_INTERCOM_ADAPTOR = 6;
  private static final int METHODID_INITIALIZE_INTERCOM_ADAPTOR = 7;
  private static final int METHODID_CONFIGURE_INTERCOM_ADAPTOR = 8;
  private static final int METHODID_RESET_INTERCOM_ADAPTOR = 9;
  private static final int METHODID_UPDATE_INTERCOM_ADAPTOR_FIRMWARE = 10;
  private static final int METHODID_GENERATE_AUTHORIZATION_TOKEN = 11;
  private static final int METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI = 12;

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
        case METHODID_CREATE_INTERCOM_ADAPTOR:
          serviceImpl.createIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>) responseObserver);
          break;
        case METHODID_GET_INTERCOM_ADAPTOR:
          serviceImpl.getIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>) responseObserver);
          break;
        case METHODID_LIST_INTERCOM_ADAPTORS:
          serviceImpl.listIntercomAdaptors((com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INTERCOM_ADAPTOR:
          serviceImpl.updateIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>) responseObserver);
          break;
        case METHODID_DELETE_INTERCOM_ADAPTOR:
          serviceImpl.deleteIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BIND_INTERCOM_ADAPTOR:
          serviceImpl.bindIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse>) responseObserver);
          break;
        case METHODID_UNBIND_INTERCOM_ADAPTOR:
          serviceImpl.unbindIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_INTERCOM_ADAPTOR:
          serviceImpl.initializeIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_INTERCOM_ADAPTOR:
          serviceImpl.configureIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_INTERCOM_ADAPTOR:
          serviceImpl.resetIntercomAdaptor((com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_INTERCOM_ADAPTOR_FIRMWARE:
          serviceImpl.updateIntercomAdaptorFirmware((com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_AUTHORIZATION_TOKEN:
          serviceImpl.generateAuthorizationToken((com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI:
          serviceImpl.generateFirmwareDownloadUri((com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest) request,
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
          getCreateIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.CreateIntercomAdaptorRequest,
              com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>(
                service, METHODID_CREATE_INTERCOM_ADAPTOR)))
        .addMethod(
          getGetIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.GetIntercomAdaptorRequest,
              com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>(
                service, METHODID_GET_INTERCOM_ADAPTOR)))
        .addMethod(
          getListIntercomAdaptorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsRequest,
              com.saltoapis.nebula.intercomadaptor.v1.ListIntercomAdaptorsResponse>(
                service, METHODID_LIST_INTERCOM_ADAPTORS)))
        .addMethod(
          getUpdateIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorRequest,
              com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptor>(
                service, METHODID_UPDATE_INTERCOM_ADAPTOR)))
        .addMethod(
          getDeleteIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.DeleteIntercomAdaptorRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_INTERCOM_ADAPTOR)))
        .addMethod(
          getBindIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorRequest,
              com.saltoapis.nebula.intercomadaptor.v1.BindIntercomAdaptorResponse>(
                service, METHODID_BIND_INTERCOM_ADAPTOR)))
        .addMethod(
          getUnbindIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorRequest,
              com.saltoapis.nebula.intercomadaptor.v1.UnbindIntercomAdaptorResponse>(
                service, METHODID_UNBIND_INTERCOM_ADAPTOR)))
        .addMethod(
          getInitializeIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.InitializeIntercomAdaptorRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_INITIALIZE_INTERCOM_ADAPTOR)))
        .addMethod(
          getConfigureIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.ConfigureIntercomAdaptorRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_CONFIGURE_INTERCOM_ADAPTOR)))
        .addMethod(
          getResetIntercomAdaptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.ResetIntercomAdaptorRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_RESET_INTERCOM_ADAPTOR)))
        .addMethod(
          getUpdateIntercomAdaptorFirmwareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.UpdateIntercomAdaptorFirmwareRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_UPDATE_INTERCOM_ADAPTOR_FIRMWARE)))
        .addMethod(
          getGenerateAuthorizationTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenRequest,
              com.saltoapis.nebula.intercomadaptor.v1.GenerateAuthorizationTokenResponse>(
                service, METHODID_GENERATE_AUTHORIZATION_TOKEN)))
        .addMethod(
          getGenerateFirmwareDownloadUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.intercomadaptor.v1.GenerateFirmwareDownloadUriRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI)))
        .build();
  }

  private static abstract class IntercomAdaptorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntercomAdaptorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.intercomadaptor.v1.IntercomAdaptorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntercomAdaptorService");
    }
  }

  private static final class IntercomAdaptorServiceFileDescriptorSupplier
      extends IntercomAdaptorServiceBaseDescriptorSupplier {
    IntercomAdaptorServiceFileDescriptorSupplier() {}
  }

  private static final class IntercomAdaptorServiceMethodDescriptorSupplier
      extends IntercomAdaptorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IntercomAdaptorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IntercomAdaptorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntercomAdaptorServiceFileDescriptorSupplier())
              .addMethod(getCreateIntercomAdaptorMethod())
              .addMethod(getGetIntercomAdaptorMethod())
              .addMethod(getListIntercomAdaptorsMethod())
              .addMethod(getUpdateIntercomAdaptorMethod())
              .addMethod(getDeleteIntercomAdaptorMethod())
              .addMethod(getBindIntercomAdaptorMethod())
              .addMethod(getUnbindIntercomAdaptorMethod())
              .addMethod(getInitializeIntercomAdaptorMethod())
              .addMethod(getConfigureIntercomAdaptorMethod())
              .addMethod(getResetIntercomAdaptorMethod())
              .addMethod(getUpdateIntercomAdaptorFirmwareMethod())
              .addMethod(getGenerateAuthorizationTokenMethod())
              .addMethod(getGenerateFirmwareDownloadUriMethod())
              .build();
        }
      }
    }
    return result;
  }
}
