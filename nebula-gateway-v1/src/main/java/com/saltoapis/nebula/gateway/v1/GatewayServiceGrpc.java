package com.saltoapis.nebula.gateway.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Gateways are hardware devices intended to be used with access points where
 * online connectivity is needed. This service is responsible for managing
 * gateway resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/gateway/v1/gateway.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GatewayServiceGrpc {

  private GatewayServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.gateway.v1.GatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.CreateGatewayRequest,
      com.saltoapis.nebula.gateway.v1.Gateway> getCreateGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGateway",
      requestType = com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.Gateway.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.CreateGatewayRequest,
      com.saltoapis.nebula.gateway.v1.Gateway> getCreateGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.CreateGatewayRequest, com.saltoapis.nebula.gateway.v1.Gateway> getCreateGatewayMethod;
    if ((getCreateGatewayMethod = GatewayServiceGrpc.getCreateGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getCreateGatewayMethod = GatewayServiceGrpc.getCreateGatewayMethod) == null) {
          GatewayServiceGrpc.getCreateGatewayMethod = getCreateGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.CreateGatewayRequest, com.saltoapis.nebula.gateway.v1.Gateway>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.CreateGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("CreateGateway"))
              .build();
        }
      }
    }
    return getCreateGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.GetGatewayRequest,
      com.saltoapis.nebula.gateway.v1.Gateway> getGetGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGateway",
      requestType = com.saltoapis.nebula.gateway.v1.GetGatewayRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.Gateway.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.GetGatewayRequest,
      com.saltoapis.nebula.gateway.v1.Gateway> getGetGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.GetGatewayRequest, com.saltoapis.nebula.gateway.v1.Gateway> getGetGatewayMethod;
    if ((getGetGatewayMethod = GatewayServiceGrpc.getGetGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getGetGatewayMethod = GatewayServiceGrpc.getGetGatewayMethod) == null) {
          GatewayServiceGrpc.getGetGatewayMethod = getGetGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.GetGatewayRequest, com.saltoapis.nebula.gateway.v1.Gateway>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.GetGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("GetGateway"))
              .build();
        }
      }
    }
    return getGetGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ListGatewaysRequest,
      com.saltoapis.nebula.gateway.v1.ListGatewaysResponse> getListGatewaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGateways",
      requestType = com.saltoapis.nebula.gateway.v1.ListGatewaysRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.ListGatewaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ListGatewaysRequest,
      com.saltoapis.nebula.gateway.v1.ListGatewaysResponse> getListGatewaysMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ListGatewaysRequest, com.saltoapis.nebula.gateway.v1.ListGatewaysResponse> getListGatewaysMethod;
    if ((getListGatewaysMethod = GatewayServiceGrpc.getListGatewaysMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListGatewaysMethod = GatewayServiceGrpc.getListGatewaysMethod) == null) {
          GatewayServiceGrpc.getListGatewaysMethod = getListGatewaysMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.ListGatewaysRequest, com.saltoapis.nebula.gateway.v1.ListGatewaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGateways"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.ListGatewaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.ListGatewaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ListGateways"))
              .build();
        }
      }
    }
    return getListGatewaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest,
      com.saltoapis.nebula.gateway.v1.Gateway> getUpdateGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGateway",
      requestType = com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.Gateway.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest,
      com.saltoapis.nebula.gateway.v1.Gateway> getUpdateGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest, com.saltoapis.nebula.gateway.v1.Gateway> getUpdateGatewayMethod;
    if ((getUpdateGatewayMethod = GatewayServiceGrpc.getUpdateGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getUpdateGatewayMethod = GatewayServiceGrpc.getUpdateGatewayMethod) == null) {
          GatewayServiceGrpc.getUpdateGatewayMethod = getUpdateGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest, com.saltoapis.nebula.gateway.v1.Gateway>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.Gateway.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("UpdateGateway"))
              .build();
        }
      }
    }
    return getUpdateGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest,
      com.google.protobuf.Empty> getDeleteGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGateway",
      requestType = com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest,
      com.google.protobuf.Empty> getDeleteGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest, com.google.protobuf.Empty> getDeleteGatewayMethod;
    if ((getDeleteGatewayMethod = GatewayServiceGrpc.getDeleteGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getDeleteGatewayMethod = GatewayServiceGrpc.getDeleteGatewayMethod) == null) {
          GatewayServiceGrpc.getDeleteGatewayMethod = getDeleteGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("DeleteGateway"))
              .build();
        }
      }
    }
    return getDeleteGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.BindGatewayRequest,
      com.saltoapis.nebula.gateway.v1.BindGatewayResponse> getBindGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindGateway",
      requestType = com.saltoapis.nebula.gateway.v1.BindGatewayRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.BindGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.BindGatewayRequest,
      com.saltoapis.nebula.gateway.v1.BindGatewayResponse> getBindGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.BindGatewayRequest, com.saltoapis.nebula.gateway.v1.BindGatewayResponse> getBindGatewayMethod;
    if ((getBindGatewayMethod = GatewayServiceGrpc.getBindGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getBindGatewayMethod = GatewayServiceGrpc.getBindGatewayMethod) == null) {
          GatewayServiceGrpc.getBindGatewayMethod = getBindGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.BindGatewayRequest, com.saltoapis.nebula.gateway.v1.BindGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.BindGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.BindGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("BindGateway"))
              .build();
        }
      }
    }
    return getBindGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest,
      com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse> getUnbindGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindGateway",
      requestType = com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest,
      com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse> getUnbindGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest, com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse> getUnbindGatewayMethod;
    if ((getUnbindGatewayMethod = GatewayServiceGrpc.getUnbindGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getUnbindGatewayMethod = GatewayServiceGrpc.getUnbindGatewayMethod) == null) {
          GatewayServiceGrpc.getUnbindGatewayMethod = getUnbindGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest, com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("UnbindGateway"))
              .build();
        }
      }
    }
    return getUnbindGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeGateway",
      requestType = com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest, com.saltoapis.longrunning.v1.Operation> getInitializeGatewayMethod;
    if ((getInitializeGatewayMethod = GatewayServiceGrpc.getInitializeGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getInitializeGatewayMethod = GatewayServiceGrpc.getInitializeGatewayMethod) == null) {
          GatewayServiceGrpc.getInitializeGatewayMethod = getInitializeGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("InitializeGateway"))
              .build();
        }
      }
    }
    return getInitializeGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureGateway",
      requestType = com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest, com.saltoapis.longrunning.v1.Operation> getConfigureGatewayMethod;
    if ((getConfigureGatewayMethod = GatewayServiceGrpc.getConfigureGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getConfigureGatewayMethod = GatewayServiceGrpc.getConfigureGatewayMethod) == null) {
          GatewayServiceGrpc.getConfigureGatewayMethod = getConfigureGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ConfigureGateway"))
              .build();
        }
      }
    }
    return getConfigureGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ResetGatewayRequest,
      com.saltoapis.longrunning.v1.Operation> getResetGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetGateway",
      requestType = com.saltoapis.nebula.gateway.v1.ResetGatewayRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ResetGatewayRequest,
      com.saltoapis.longrunning.v1.Operation> getResetGatewayMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.ResetGatewayRequest, com.saltoapis.longrunning.v1.Operation> getResetGatewayMethod;
    if ((getResetGatewayMethod = GatewayServiceGrpc.getResetGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getResetGatewayMethod = GatewayServiceGrpc.getResetGatewayMethod) == null) {
          GatewayServiceGrpc.getResetGatewayMethod = getResetGatewayMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.ResetGatewayRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.ResetGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ResetGateway"))
              .build();
        }
      }
    }
    return getResetGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateGatewayFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGatewayFirmware",
      requestType = com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateGatewayFirmwareMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest, com.saltoapis.longrunning.v1.Operation> getUpdateGatewayFirmwareMethod;
    if ((getUpdateGatewayFirmwareMethod = GatewayServiceGrpc.getUpdateGatewayFirmwareMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getUpdateGatewayFirmwareMethod = GatewayServiceGrpc.getUpdateGatewayFirmwareMethod) == null) {
          GatewayServiceGrpc.getUpdateGatewayFirmwareMethod = getUpdateGatewayFirmwareMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGatewayFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("UpdateGatewayFirmware"))
              .build();
        }
      }
    }
    return getUpdateGatewayFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAuthorizationToken",
      requestType = com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest.class,
      responseType = com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;
    if ((getGenerateAuthorizationTokenMethod = GatewayServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getGenerateAuthorizationTokenMethod = GatewayServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
          GatewayServiceGrpc.getGenerateAuthorizationTokenMethod = getGenerateAuthorizationTokenMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAuthorizationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("GenerateAuthorizationToken"))
              .build();
        }
      }
    }
    return getGenerateAuthorizationTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GatewayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub>() {
        @java.lang.Override
        public GatewayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceStub(channel, callOptions);
        }
      };
    return GatewayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub>() {
        @java.lang.Override
        public GatewayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceBlockingStub(channel, callOptions);
        }
      };
    return GatewayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub>() {
        @java.lang.Override
        public GatewayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceFutureStub(channel, callOptions);
        }
      };
    return GatewayServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Gateways are hardware devices intended to be used with access points where
   * online connectivity is needed. This service is responsible for managing
   * gateway resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a gateway
     * Creates a new gateway
     * </pre>
     */
    default void createGateway(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a gateway
     * Gets an existing gateway.
     * </pre>
     */
    default void getGateway(com.saltoapis.nebula.gateway.v1.GetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * List gateways
     * Returns a list of gateways that have been previously created.
     * </pre>
     */
    default void listGateways(com.saltoapis.nebula.gateway.v1.ListGatewaysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.ListGatewaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGatewaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a gateway
     * Updates an existing gateway.
     * </pre>
     */
    default void updateGateway(com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a gateway
     * Permanently deletes a gateway. This cannot be undone.
     * </pre>
     */
    default void deleteGateway(com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind a gateway
     * Binds a gateway. Binding a gateway assigns a device
     * identifier to the gateway. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    default void bindGateway(com.saltoapis.nebula.gateway.v1.BindGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.BindGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind a gateway
     * Unbinds a gateway. Unbinding a gateway removes the
     * device identifier from the gateway. This may be required in some
     * cases where the gateway is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    default void unbindGateway(com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialize a gateway
     * Initializes a gateway. Gateways need to be initialized before
     * you can start to use them.
     * </pre>
     */
    default void initializeGateway(com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure a gateway
     * Configures a gateway. Configuring a gateway implies adding some
     * information to the gateway such as setting the time zone.
     * </pre>
     */
    default void configureGateway(com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset a gateway
     * Resetting a device such as a gateway means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    default void resetGateway(com.saltoapis.nebula.gateway.v1.ResetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update gateway firmware
     * Updates a gateway's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    default void updateGatewayFirmware(com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGatewayFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates an authorization token for a gateway
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against a gateway.
     * </pre>
     */
    default void generateAuthorizationToken(com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAuthorizationTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GatewayService.
   * <pre>
   * Gateways are hardware devices intended to be used with access points where
   * online connectivity is needed. This service is responsible for managing
   * gateway resources.
   * </pre>
   */
  public static abstract class GatewayServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GatewayServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GatewayService.
   * <pre>
   * Gateways are hardware devices intended to be used with access points where
   * online connectivity is needed. This service is responsible for managing
   * gateway resources.
   * </pre>
   */
  public static final class GatewayServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GatewayServiceStub> {
    private GatewayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a gateway
     * Creates a new gateway
     * </pre>
     */
    public void createGateway(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a gateway
     * Gets an existing gateway.
     * </pre>
     */
    public void getGateway(com.saltoapis.nebula.gateway.v1.GetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List gateways
     * Returns a list of gateways that have been previously created.
     * </pre>
     */
    public void listGateways(com.saltoapis.nebula.gateway.v1.ListGatewaysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.ListGatewaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGatewaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a gateway
     * Updates an existing gateway.
     * </pre>
     */
    public void updateGateway(com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a gateway
     * Permanently deletes a gateway. This cannot be undone.
     * </pre>
     */
    public void deleteGateway(com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind a gateway
     * Binds a gateway. Binding a gateway assigns a device
     * identifier to the gateway. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindGateway(com.saltoapis.nebula.gateway.v1.BindGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.BindGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind a gateway
     * Unbinds a gateway. Unbinding a gateway removes the
     * device identifier from the gateway. This may be required in some
     * cases where the gateway is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindGateway(com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initialize a gateway
     * Initializes a gateway. Gateways need to be initialized before
     * you can start to use them.
     * </pre>
     */
    public void initializeGateway(com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure a gateway
     * Configures a gateway. Configuring a gateway implies adding some
     * information to the gateway such as setting the time zone.
     * </pre>
     */
    public void configureGateway(com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset a gateway
     * Resetting a device such as a gateway means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetGateway(com.saltoapis.nebula.gateway.v1.ResetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update gateway firmware
     * Updates a gateway's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateGatewayFirmware(com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGatewayFirmwareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates an authorization token for a gateway
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against a gateway.
     * </pre>
     */
    public void generateAuthorizationToken(com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GatewayService.
   * <pre>
   * Gateways are hardware devices intended to be used with access points where
   * online connectivity is needed. This service is responsible for managing
   * gateway resources.
   * </pre>
   */
  public static final class GatewayServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GatewayServiceBlockingStub> {
    private GatewayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a gateway
     * Creates a new gateway
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.Gateway createGateway(com.saltoapis.nebula.gateway.v1.CreateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a gateway
     * Gets an existing gateway.
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.Gateway getGateway(com.saltoapis.nebula.gateway.v1.GetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List gateways
     * Returns a list of gateways that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.ListGatewaysResponse listGateways(com.saltoapis.nebula.gateway.v1.ListGatewaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGatewaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a gateway
     * Updates an existing gateway.
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.Gateway updateGateway(com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a gateway
     * Permanently deletes a gateway. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteGateway(com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind a gateway
     * Binds a gateway. Binding a gateway assigns a device
     * identifier to the gateway. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.BindGatewayResponse bindGateway(com.saltoapis.nebula.gateway.v1.BindGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind a gateway
     * Unbinds a gateway. Unbinding a gateway removes the
     * device identifier from the gateway. This may be required in some
     * cases where the gateway is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse unbindGateway(com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initialize a gateway
     * Initializes a gateway. Gateways need to be initialized before
     * you can start to use them.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation initializeGateway(com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure a gateway
     * Configures a gateway. Configuring a gateway implies adding some
     * information to the gateway such as setting the time zone.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation configureGateway(com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset a gateway
     * Resetting a device such as a gateway means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetGateway(com.saltoapis.nebula.gateway.v1.ResetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update gateway firmware
     * Updates a gateway's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation updateGatewayFirmware(com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGatewayFirmwareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an authorization token for a gateway
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against a gateway.
     * </pre>
     */
    public com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse generateAuthorizationToken(com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAuthorizationTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GatewayService.
   * <pre>
   * Gateways are hardware devices intended to be used with access points where
   * online connectivity is needed. This service is responsible for managing
   * gateway resources.
   * </pre>
   */
  public static final class GatewayServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GatewayServiceFutureStub> {
    private GatewayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a gateway
     * Creates a new gateway
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.Gateway> createGateway(
        com.saltoapis.nebula.gateway.v1.CreateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a gateway
     * Gets an existing gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.Gateway> getGateway(
        com.saltoapis.nebula.gateway.v1.GetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List gateways
     * Returns a list of gateways that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.ListGatewaysResponse> listGateways(
        com.saltoapis.nebula.gateway.v1.ListGatewaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGatewaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a gateway
     * Updates an existing gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.Gateway> updateGateway(
        com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a gateway
     * Permanently deletes a gateway. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteGateway(
        com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind a gateway
     * Binds a gateway. Binding a gateway assigns a device
     * identifier to the gateway. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.BindGatewayResponse> bindGateway(
        com.saltoapis.nebula.gateway.v1.BindGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind a gateway
     * Unbinds a gateway. Unbinding a gateway removes the
     * device identifier from the gateway. This may be required in some
     * cases where the gateway is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse> unbindGateway(
        com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initialize a gateway
     * Initializes a gateway. Gateways need to be initialized before
     * you can start to use them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> initializeGateway(
        com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure a gateway
     * Configures a gateway. Configuring a gateway implies adding some
     * information to the gateway such as setting the time zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> configureGateway(
        com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset a gateway
     * Resetting a device such as a gateway means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetGateway(
        com.saltoapis.nebula.gateway.v1.ResetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update gateway firmware
     * Updates a gateway's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> updateGatewayFirmware(
        com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGatewayFirmwareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates an authorization token for a gateway
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against a gateway.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse> generateAuthorizationToken(
        com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GATEWAY = 0;
  private static final int METHODID_GET_GATEWAY = 1;
  private static final int METHODID_LIST_GATEWAYS = 2;
  private static final int METHODID_UPDATE_GATEWAY = 3;
  private static final int METHODID_DELETE_GATEWAY = 4;
  private static final int METHODID_BIND_GATEWAY = 5;
  private static final int METHODID_UNBIND_GATEWAY = 6;
  private static final int METHODID_INITIALIZE_GATEWAY = 7;
  private static final int METHODID_CONFIGURE_GATEWAY = 8;
  private static final int METHODID_RESET_GATEWAY = 9;
  private static final int METHODID_UPDATE_GATEWAY_FIRMWARE = 10;
  private static final int METHODID_GENERATE_AUTHORIZATION_TOKEN = 11;

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
        case METHODID_CREATE_GATEWAY:
          serviceImpl.createGateway((com.saltoapis.nebula.gateway.v1.CreateGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway>) responseObserver);
          break;
        case METHODID_GET_GATEWAY:
          serviceImpl.getGateway((com.saltoapis.nebula.gateway.v1.GetGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway>) responseObserver);
          break;
        case METHODID_LIST_GATEWAYS:
          serviceImpl.listGateways((com.saltoapis.nebula.gateway.v1.ListGatewaysRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.ListGatewaysResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GATEWAY:
          serviceImpl.updateGateway((com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.Gateway>) responseObserver);
          break;
        case METHODID_DELETE_GATEWAY:
          serviceImpl.deleteGateway((com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BIND_GATEWAY:
          serviceImpl.bindGateway((com.saltoapis.nebula.gateway.v1.BindGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.BindGatewayResponse>) responseObserver);
          break;
        case METHODID_UNBIND_GATEWAY:
          serviceImpl.unbindGateway((com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_GATEWAY:
          serviceImpl.initializeGateway((com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_GATEWAY:
          serviceImpl.configureGateway((com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_GATEWAY:
          serviceImpl.resetGateway((com.saltoapis.nebula.gateway.v1.ResetGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_GATEWAY_FIRMWARE:
          serviceImpl.updateGatewayFirmware((com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_AUTHORIZATION_TOKEN:
          serviceImpl.generateAuthorizationToken((com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse>) responseObserver);
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
          getCreateGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.CreateGatewayRequest,
              com.saltoapis.nebula.gateway.v1.Gateway>(
                service, METHODID_CREATE_GATEWAY)))
        .addMethod(
          getGetGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.GetGatewayRequest,
              com.saltoapis.nebula.gateway.v1.Gateway>(
                service, METHODID_GET_GATEWAY)))
        .addMethod(
          getListGatewaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.ListGatewaysRequest,
              com.saltoapis.nebula.gateway.v1.ListGatewaysResponse>(
                service, METHODID_LIST_GATEWAYS)))
        .addMethod(
          getUpdateGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.UpdateGatewayRequest,
              com.saltoapis.nebula.gateway.v1.Gateway>(
                service, METHODID_UPDATE_GATEWAY)))
        .addMethod(
          getDeleteGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.DeleteGatewayRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_GATEWAY)))
        .addMethod(
          getBindGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.BindGatewayRequest,
              com.saltoapis.nebula.gateway.v1.BindGatewayResponse>(
                service, METHODID_BIND_GATEWAY)))
        .addMethod(
          getUnbindGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.UnbindGatewayRequest,
              com.saltoapis.nebula.gateway.v1.UnbindGatewayResponse>(
                service, METHODID_UNBIND_GATEWAY)))
        .addMethod(
          getInitializeGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.InitializeGatewayRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_INITIALIZE_GATEWAY)))
        .addMethod(
          getConfigureGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.ConfigureGatewayRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_CONFIGURE_GATEWAY)))
        .addMethod(
          getResetGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.ResetGatewayRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_RESET_GATEWAY)))
        .addMethod(
          getUpdateGatewayFirmwareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.UpdateGatewayFirmwareRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_UPDATE_GATEWAY_FIRMWARE)))
        .addMethod(
          getGenerateAuthorizationTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenRequest,
              com.saltoapis.nebula.gateway.v1.GenerateAuthorizationTokenResponse>(
                service, METHODID_GENERATE_AUTHORIZATION_TOKEN)))
        .build();
  }

  private static abstract class GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.gateway.v1.GatewayProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GatewayService");
    }
  }

  private static final class GatewayServiceFileDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier {
    GatewayServiceFileDescriptorSupplier() {}
  }

  private static final class GatewayServiceMethodDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GatewayServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GatewayServiceFileDescriptorSupplier())
              .addMethod(getCreateGatewayMethod())
              .addMethod(getGetGatewayMethod())
              .addMethod(getListGatewaysMethod())
              .addMethod(getUpdateGatewayMethod())
              .addMethod(getDeleteGatewayMethod())
              .addMethod(getBindGatewayMethod())
              .addMethod(getUnbindGatewayMethod())
              .addMethod(getInitializeGatewayMethod())
              .addMethod(getConfigureGatewayMethod())
              .addMethod(getResetGatewayMethod())
              .addMethod(getUpdateGatewayFirmwareMethod())
              .addMethod(getGenerateAuthorizationTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
