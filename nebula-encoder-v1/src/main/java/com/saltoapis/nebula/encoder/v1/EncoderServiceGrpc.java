package com.saltoapis.nebula.encoder.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A card encoder is an external device that reads and updates physical card
 * keys with access information. This service is responsible for managing
 * encoder resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/encoder/v1/encoder.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EncoderServiceGrpc {

  private EncoderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.encoder.v1.EncoderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.CreateEncoderRequest,
      com.saltoapis.nebula.encoder.v1.Encoder> getCreateEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.CreateEncoderRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.Encoder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.CreateEncoderRequest,
      com.saltoapis.nebula.encoder.v1.Encoder> getCreateEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.CreateEncoderRequest, com.saltoapis.nebula.encoder.v1.Encoder> getCreateEncoderMethod;
    if ((getCreateEncoderMethod = EncoderServiceGrpc.getCreateEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getCreateEncoderMethod = EncoderServiceGrpc.getCreateEncoderMethod) == null) {
          EncoderServiceGrpc.getCreateEncoderMethod = getCreateEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.CreateEncoderRequest, com.saltoapis.nebula.encoder.v1.Encoder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.CreateEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.Encoder.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("CreateEncoder"))
              .build();
        }
      }
    }
    return getCreateEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GetEncoderRequest,
      com.saltoapis.nebula.encoder.v1.Encoder> getGetEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.GetEncoderRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.Encoder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GetEncoderRequest,
      com.saltoapis.nebula.encoder.v1.Encoder> getGetEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GetEncoderRequest, com.saltoapis.nebula.encoder.v1.Encoder> getGetEncoderMethod;
    if ((getGetEncoderMethod = EncoderServiceGrpc.getGetEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getGetEncoderMethod = EncoderServiceGrpc.getGetEncoderMethod) == null) {
          EncoderServiceGrpc.getGetEncoderMethod = getGetEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.GetEncoderRequest, com.saltoapis.nebula.encoder.v1.Encoder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.GetEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.Encoder.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("GetEncoder"))
              .build();
        }
      }
    }
    return getGetEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ListEncodersRequest,
      com.saltoapis.nebula.encoder.v1.ListEncodersResponse> getListEncodersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEncoders",
      requestType = com.saltoapis.nebula.encoder.v1.ListEncodersRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.ListEncodersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ListEncodersRequest,
      com.saltoapis.nebula.encoder.v1.ListEncodersResponse> getListEncodersMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ListEncodersRequest, com.saltoapis.nebula.encoder.v1.ListEncodersResponse> getListEncodersMethod;
    if ((getListEncodersMethod = EncoderServiceGrpc.getListEncodersMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getListEncodersMethod = EncoderServiceGrpc.getListEncodersMethod) == null) {
          EncoderServiceGrpc.getListEncodersMethod = getListEncodersMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.ListEncodersRequest, com.saltoapis.nebula.encoder.v1.ListEncodersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEncoders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.ListEncodersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.ListEncodersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("ListEncoders"))
              .build();
        }
      }
    }
    return getListEncodersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest,
      com.saltoapis.nebula.encoder.v1.Encoder> getUpdateEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.Encoder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest,
      com.saltoapis.nebula.encoder.v1.Encoder> getUpdateEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest, com.saltoapis.nebula.encoder.v1.Encoder> getUpdateEncoderMethod;
    if ((getUpdateEncoderMethod = EncoderServiceGrpc.getUpdateEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getUpdateEncoderMethod = EncoderServiceGrpc.getUpdateEncoderMethod) == null) {
          EncoderServiceGrpc.getUpdateEncoderMethod = getUpdateEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest, com.saltoapis.nebula.encoder.v1.Encoder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.Encoder.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("UpdateEncoder"))
              .build();
        }
      }
    }
    return getUpdateEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest,
      com.google.protobuf.Empty> getDeleteEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest,
      com.google.protobuf.Empty> getDeleteEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest, com.google.protobuf.Empty> getDeleteEncoderMethod;
    if ((getDeleteEncoderMethod = EncoderServiceGrpc.getDeleteEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getDeleteEncoderMethod = EncoderServiceGrpc.getDeleteEncoderMethod) == null) {
          EncoderServiceGrpc.getDeleteEncoderMethod = getDeleteEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("DeleteEncoder"))
              .build();
        }
      }
    }
    return getDeleteEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest, com.saltoapis.longrunning.v1.Operation> getInitializeEncoderMethod;
    if ((getInitializeEncoderMethod = EncoderServiceGrpc.getInitializeEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getInitializeEncoderMethod = EncoderServiceGrpc.getInitializeEncoderMethod) == null) {
          EncoderServiceGrpc.getInitializeEncoderMethod = getInitializeEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("InitializeEncoder"))
              .build();
        }
      }
    }
    return getInitializeEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest, com.saltoapis.longrunning.v1.Operation> getConfigureEncoderMethod;
    if ((getConfigureEncoderMethod = EncoderServiceGrpc.getConfigureEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getConfigureEncoderMethod = EncoderServiceGrpc.getConfigureEncoderMethod) == null) {
          EncoderServiceGrpc.getConfigureEncoderMethod = getConfigureEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("ConfigureEncoder"))
              .build();
        }
      }
    }
    return getConfigureEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ResetEncoderRequest,
      com.saltoapis.longrunning.v1.Operation> getResetEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.ResetEncoderRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ResetEncoderRequest,
      com.saltoapis.longrunning.v1.Operation> getResetEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ResetEncoderRequest, com.saltoapis.longrunning.v1.Operation> getResetEncoderMethod;
    if ((getResetEncoderMethod = EncoderServiceGrpc.getResetEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getResetEncoderMethod = EncoderServiceGrpc.getResetEncoderMethod) == null) {
          EncoderServiceGrpc.getResetEncoderMethod = getResetEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.ResetEncoderRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.ResetEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("ResetEncoder"))
              .build();
        }
      }
    }
    return getResetEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateEncoderFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEncoderFirmware",
      requestType = com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateEncoderFirmwareMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest, com.saltoapis.longrunning.v1.Operation> getUpdateEncoderFirmwareMethod;
    if ((getUpdateEncoderFirmwareMethod = EncoderServiceGrpc.getUpdateEncoderFirmwareMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getUpdateEncoderFirmwareMethod = EncoderServiceGrpc.getUpdateEncoderFirmwareMethod) == null) {
          EncoderServiceGrpc.getUpdateEncoderFirmwareMethod = getUpdateEncoderFirmwareMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEncoderFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("UpdateEncoderFirmware"))
              .build();
        }
      }
    }
    return getUpdateEncoderFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.BindEncoderRequest,
      com.saltoapis.nebula.encoder.v1.BindEncoderResponse> getBindEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.BindEncoderRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.BindEncoderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.BindEncoderRequest,
      com.saltoapis.nebula.encoder.v1.BindEncoderResponse> getBindEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.BindEncoderRequest, com.saltoapis.nebula.encoder.v1.BindEncoderResponse> getBindEncoderMethod;
    if ((getBindEncoderMethod = EncoderServiceGrpc.getBindEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getBindEncoderMethod = EncoderServiceGrpc.getBindEncoderMethod) == null) {
          EncoderServiceGrpc.getBindEncoderMethod = getBindEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.BindEncoderRequest, com.saltoapis.nebula.encoder.v1.BindEncoderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.BindEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.BindEncoderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("BindEncoder"))
              .build();
        }
      }
    }
    return getBindEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest,
      com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse> getUnbindEncoderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindEncoder",
      requestType = com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest,
      com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse> getUnbindEncoderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest, com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse> getUnbindEncoderMethod;
    if ((getUnbindEncoderMethod = EncoderServiceGrpc.getUnbindEncoderMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getUnbindEncoderMethod = EncoderServiceGrpc.getUnbindEncoderMethod) == null) {
          EncoderServiceGrpc.getUnbindEncoderMethod = getUnbindEncoderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest, com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindEncoder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("UnbindEncoder"))
              .build();
        }
      }
    }
    return getUnbindEncoderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ReadKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getReadKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadKey",
      requestType = com.saltoapis.nebula.encoder.v1.ReadKeyRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ReadKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getReadKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.ReadKeyRequest, com.saltoapis.longrunning.v1.Operation> getReadKeyMethod;
    if ((getReadKeyMethod = EncoderServiceGrpc.getReadKeyMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getReadKeyMethod = EncoderServiceGrpc.getReadKeyMethod) == null) {
          EncoderServiceGrpc.getReadKeyMethod = getReadKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.ReadKeyRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.ReadKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("ReadKey"))
              .build();
        }
      }
    }
    return getReadKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAuthorizationToken",
      requestType = com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.class,
      responseType = com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;
    if ((getGenerateAuthorizationTokenMethod = EncoderServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getGenerateAuthorizationTokenMethod = EncoderServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
          EncoderServiceGrpc.getGenerateAuthorizationTokenMethod = getGenerateAuthorizationTokenMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAuthorizationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("GenerateAuthorizationToken"))
              .build();
        }
      }
    }
    return getGenerateAuthorizationTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateFirmwareDownloadUri",
      requestType = com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;
    if ((getGenerateFirmwareDownloadUriMethod = EncoderServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
      synchronized (EncoderServiceGrpc.class) {
        if ((getGenerateFirmwareDownloadUriMethod = EncoderServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
          EncoderServiceGrpc.getGenerateFirmwareDownloadUriMethod = getGenerateFirmwareDownloadUriMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateFirmwareDownloadUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new EncoderServiceMethodDescriptorSupplier("GenerateFirmwareDownloadUri"))
              .build();
        }
      }
    }
    return getGenerateFirmwareDownloadUriMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EncoderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncoderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncoderServiceStub>() {
        @java.lang.Override
        public EncoderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncoderServiceStub(channel, callOptions);
        }
      };
    return EncoderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EncoderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncoderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncoderServiceBlockingStub>() {
        @java.lang.Override
        public EncoderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncoderServiceBlockingStub(channel, callOptions);
        }
      };
    return EncoderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EncoderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncoderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncoderServiceFutureStub>() {
        @java.lang.Override
        public EncoderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncoderServiceFutureStub(channel, callOptions);
        }
      };
    return EncoderServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A card encoder is an external device that reads and updates physical card
   * keys with access information. This service is responsible for managing
   * encoder resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an encoder
     * Creates a new encoder.
     * </pre>
     */
    default void createEncoder(com.saltoapis.nebula.encoder.v1.CreateEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an encoder
     * Gets an existing encoder.
     * </pre>
     */
    default void getEncoder(com.saltoapis.nebula.encoder.v1.GetEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * List encoders
     * Returns a list of encoders that have been previously created.
     * </pre>
     */
    default void listEncoders(com.saltoapis.nebula.encoder.v1.ListEncodersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.ListEncodersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEncodersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an encoder
     * Updates an existing encoder.
     * </pre>
     */
    default void updateEncoder(com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an encoder
     * Permanently deletes an encoder. This cannot be undone.
     * </pre>
     */
    default void deleteEncoder(com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialize an encoder
     * Initializes an encoder. Encoders need to be initialized before
     * you can start to use them.
     * </pre>
     */
    default void initializeEncoder(com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure an encoder
     * Configures an encoder. Configuring an encoder implies adding some
     * information to the encoder based on the current settings.
     * </pre>
     */
    default void configureEncoder(com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset an encoder
     * Resetting a device such as an encoder means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    default void resetEncoder(com.saltoapis.nebula.encoder.v1.ResetEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update encoder firmware
     * Updates an encoder's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    default void updateEncoderFirmware(com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEncoderFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind an encoder
     * Binds an encoder. Binding an encoder assigns a device
     * identifier to the encoder. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    default void bindEncoder(com.saltoapis.nebula.encoder.v1.BindEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.BindEncoderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind an encoder
     * Unbinds an encoder. Unbinding an encoder removes the
     * device identifier from the encoder. This may be required in some
     * cases where the encoder is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    default void unbindEncoder(com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindEncoderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read a key
     * Reads a key presented on an encoder.
     * (-- api-linter: core::0131::synonyms=disabled  --)
     * </pre>
     */
    default void readKey(com.saltoapis.nebula.encoder.v1.ReadKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates an authorization token for an encoder
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an encoder.
     * </pre>
     */
    default void generateAuthorizationToken(com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAuthorizationTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate encoder firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * encoder. The returned URI can be used to bring the encoder
     * firmwares up to latest.
     * </pre>
     */
    default void generateFirmwareDownloadUri(com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateFirmwareDownloadUriMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EncoderService.
   * <pre>
   * A card encoder is an external device that reads and updates physical card
   * keys with access information. This service is responsible for managing
   * encoder resources.
   * </pre>
   */
  public static abstract class EncoderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EncoderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EncoderService.
   * <pre>
   * A card encoder is an external device that reads and updates physical card
   * keys with access information. This service is responsible for managing
   * encoder resources.
   * </pre>
   */
  public static final class EncoderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EncoderServiceStub> {
    private EncoderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncoderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncoderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an encoder
     * Creates a new encoder.
     * </pre>
     */
    public void createEncoder(com.saltoapis.nebula.encoder.v1.CreateEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an encoder
     * Gets an existing encoder.
     * </pre>
     */
    public void getEncoder(com.saltoapis.nebula.encoder.v1.GetEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List encoders
     * Returns a list of encoders that have been previously created.
     * </pre>
     */
    public void listEncoders(com.saltoapis.nebula.encoder.v1.ListEncodersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.ListEncodersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEncodersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an encoder
     * Updates an existing encoder.
     * </pre>
     */
    public void updateEncoder(com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an encoder
     * Permanently deletes an encoder. This cannot be undone.
     * </pre>
     */
    public void deleteEncoder(com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initialize an encoder
     * Initializes an encoder. Encoders need to be initialized before
     * you can start to use them.
     * </pre>
     */
    public void initializeEncoder(com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure an encoder
     * Configures an encoder. Configuring an encoder implies adding some
     * information to the encoder based on the current settings.
     * </pre>
     */
    public void configureEncoder(com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset an encoder
     * Resetting a device such as an encoder means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetEncoder(com.saltoapis.nebula.encoder.v1.ResetEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update encoder firmware
     * Updates an encoder's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateEncoderFirmware(com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEncoderFirmwareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind an encoder
     * Binds an encoder. Binding an encoder assigns a device
     * identifier to the encoder. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindEncoder(com.saltoapis.nebula.encoder.v1.BindEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.BindEncoderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind an encoder
     * Unbinds an encoder. Unbinding an encoder removes the
     * device identifier from the encoder. This may be required in some
     * cases where the encoder is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindEncoder(com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindEncoderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read a key
     * Reads a key presented on an encoder.
     * (-- api-linter: core::0131::synonyms=disabled  --)
     * </pre>
     */
    public void readKey(com.saltoapis.nebula.encoder.v1.ReadKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates an authorization token for an encoder
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an encoder.
     * </pre>
     */
    public void generateAuthorizationToken(com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate encoder firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * encoder. The returned URI can be used to bring the encoder
     * firmwares up to latest.
     * </pre>
     */
    public void generateFirmwareDownloadUri(com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EncoderService.
   * <pre>
   * A card encoder is an external device that reads and updates physical card
   * keys with access information. This service is responsible for managing
   * encoder resources.
   * </pre>
   */
  public static final class EncoderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EncoderServiceBlockingStub> {
    private EncoderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncoderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncoderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an encoder
     * Creates a new encoder.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.Encoder createEncoder(com.saltoapis.nebula.encoder.v1.CreateEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an encoder
     * Gets an existing encoder.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.Encoder getEncoder(com.saltoapis.nebula.encoder.v1.GetEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List encoders
     * Returns a list of encoders that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.ListEncodersResponse listEncoders(com.saltoapis.nebula.encoder.v1.ListEncodersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEncodersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an encoder
     * Updates an existing encoder.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.Encoder updateEncoder(com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an encoder
     * Permanently deletes an encoder. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEncoder(com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initialize an encoder
     * Initializes an encoder. Encoders need to be initialized before
     * you can start to use them.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation initializeEncoder(com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure an encoder
     * Configures an encoder. Configuring an encoder implies adding some
     * information to the encoder based on the current settings.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation configureEncoder(com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset an encoder
     * Resetting a device such as an encoder means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetEncoder(com.saltoapis.nebula.encoder.v1.ResetEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update encoder firmware
     * Updates an encoder's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation updateEncoderFirmware(com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEncoderFirmwareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind an encoder
     * Binds an encoder. Binding an encoder assigns a device
     * identifier to the encoder. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.BindEncoderResponse bindEncoder(com.saltoapis.nebula.encoder.v1.BindEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind an encoder
     * Unbinds an encoder. Unbinding an encoder removes the
     * device identifier from the encoder. This may be required in some
     * cases where the encoder is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse unbindEncoder(com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindEncoderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read a key
     * Reads a key presented on an encoder.
     * (-- api-linter: core::0131::synonyms=disabled  --)
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation readKey(com.saltoapis.nebula.encoder.v1.ReadKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates an authorization token for an encoder
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an encoder.
     * </pre>
     */
    public com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse generateAuthorizationToken(com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAuthorizationTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate encoder firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * encoder. The returned URI can be used to bring the encoder
     * firmwares up to latest.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation generateFirmwareDownloadUri(com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateFirmwareDownloadUriMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EncoderService.
   * <pre>
   * A card encoder is an external device that reads and updates physical card
   * keys with access information. This service is responsible for managing
   * encoder resources.
   * </pre>
   */
  public static final class EncoderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EncoderServiceFutureStub> {
    private EncoderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncoderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncoderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an encoder
     * Creates a new encoder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.Encoder> createEncoder(
        com.saltoapis.nebula.encoder.v1.CreateEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an encoder
     * Gets an existing encoder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.Encoder> getEncoder(
        com.saltoapis.nebula.encoder.v1.GetEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List encoders
     * Returns a list of encoders that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.ListEncodersResponse> listEncoders(
        com.saltoapis.nebula.encoder.v1.ListEncodersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEncodersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an encoder
     * Updates an existing encoder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.Encoder> updateEncoder(
        com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an encoder
     * Permanently deletes an encoder. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEncoder(
        com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initialize an encoder
     * Initializes an encoder. Encoders need to be initialized before
     * you can start to use them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> initializeEncoder(
        com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure an encoder
     * Configures an encoder. Configuring an encoder implies adding some
     * information to the encoder based on the current settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> configureEncoder(
        com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset an encoder
     * Resetting a device such as an encoder means returning it to its factory
     * settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetEncoder(
        com.saltoapis.nebula.encoder.v1.ResetEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update encoder firmware
     * Updates an encoder's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> updateEncoderFirmware(
        com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEncoderFirmwareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind an encoder
     * Binds an encoder. Binding an encoder assigns a device
     * identifier to the encoder. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.BindEncoderResponse> bindEncoder(
        com.saltoapis.nebula.encoder.v1.BindEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind an encoder
     * Unbinds an encoder. Unbinding an encoder removes the
     * device identifier from the encoder. This may be required in some
     * cases where the encoder is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse> unbindEncoder(
        com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindEncoderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read a key
     * Reads a key presented on an encoder.
     * (-- api-linter: core::0131::synonyms=disabled  --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> readKey(
        com.saltoapis.nebula.encoder.v1.ReadKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates an authorization token for an encoder
     * Generates an authorization token that allows to connect, authenticate and
     * authorize against an encoder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse> generateAuthorizationToken(
        com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate encoder firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * encoder. The returned URI can be used to bring the encoder
     * firmwares up to latest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> generateFirmwareDownloadUri(
        com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENCODER = 0;
  private static final int METHODID_GET_ENCODER = 1;
  private static final int METHODID_LIST_ENCODERS = 2;
  private static final int METHODID_UPDATE_ENCODER = 3;
  private static final int METHODID_DELETE_ENCODER = 4;
  private static final int METHODID_INITIALIZE_ENCODER = 5;
  private static final int METHODID_CONFIGURE_ENCODER = 6;
  private static final int METHODID_RESET_ENCODER = 7;
  private static final int METHODID_UPDATE_ENCODER_FIRMWARE = 8;
  private static final int METHODID_BIND_ENCODER = 9;
  private static final int METHODID_UNBIND_ENCODER = 10;
  private static final int METHODID_READ_KEY = 11;
  private static final int METHODID_GENERATE_AUTHORIZATION_TOKEN = 12;
  private static final int METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI = 13;

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
        case METHODID_CREATE_ENCODER:
          serviceImpl.createEncoder((com.saltoapis.nebula.encoder.v1.CreateEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder>) responseObserver);
          break;
        case METHODID_GET_ENCODER:
          serviceImpl.getEncoder((com.saltoapis.nebula.encoder.v1.GetEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder>) responseObserver);
          break;
        case METHODID_LIST_ENCODERS:
          serviceImpl.listEncoders((com.saltoapis.nebula.encoder.v1.ListEncodersRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.ListEncodersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENCODER:
          serviceImpl.updateEncoder((com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.Encoder>) responseObserver);
          break;
        case METHODID_DELETE_ENCODER:
          serviceImpl.deleteEncoder((com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INITIALIZE_ENCODER:
          serviceImpl.initializeEncoder((com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_ENCODER:
          serviceImpl.configureEncoder((com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_ENCODER:
          serviceImpl.resetEncoder((com.saltoapis.nebula.encoder.v1.ResetEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ENCODER_FIRMWARE:
          serviceImpl.updateEncoderFirmware((com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_BIND_ENCODER:
          serviceImpl.bindEncoder((com.saltoapis.nebula.encoder.v1.BindEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.BindEncoderResponse>) responseObserver);
          break;
        case METHODID_UNBIND_ENCODER:
          serviceImpl.unbindEncoder((com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse>) responseObserver);
          break;
        case METHODID_READ_KEY:
          serviceImpl.readKey((com.saltoapis.nebula.encoder.v1.ReadKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_AUTHORIZATION_TOKEN:
          serviceImpl.generateAuthorizationToken((com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI:
          serviceImpl.generateFirmwareDownloadUri((com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest) request,
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
          getCreateEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.CreateEncoderRequest,
              com.saltoapis.nebula.encoder.v1.Encoder>(
                service, METHODID_CREATE_ENCODER)))
        .addMethod(
          getGetEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.GetEncoderRequest,
              com.saltoapis.nebula.encoder.v1.Encoder>(
                service, METHODID_GET_ENCODER)))
        .addMethod(
          getListEncodersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.ListEncodersRequest,
              com.saltoapis.nebula.encoder.v1.ListEncodersResponse>(
                service, METHODID_LIST_ENCODERS)))
        .addMethod(
          getUpdateEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.UpdateEncoderRequest,
              com.saltoapis.nebula.encoder.v1.Encoder>(
                service, METHODID_UPDATE_ENCODER)))
        .addMethod(
          getDeleteEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.DeleteEncoderRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ENCODER)))
        .addMethod(
          getInitializeEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.InitializeEncoderRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_INITIALIZE_ENCODER)))
        .addMethod(
          getConfigureEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.ConfigureEncoderRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_CONFIGURE_ENCODER)))
        .addMethod(
          getResetEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.ResetEncoderRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_RESET_ENCODER)))
        .addMethod(
          getUpdateEncoderFirmwareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.UpdateEncoderFirmwareRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_UPDATE_ENCODER_FIRMWARE)))
        .addMethod(
          getBindEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.BindEncoderRequest,
              com.saltoapis.nebula.encoder.v1.BindEncoderResponse>(
                service, METHODID_BIND_ENCODER)))
        .addMethod(
          getUnbindEncoderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.UnbindEncoderRequest,
              com.saltoapis.nebula.encoder.v1.UnbindEncoderResponse>(
                service, METHODID_UNBIND_ENCODER)))
        .addMethod(
          getReadKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.ReadKeyRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_READ_KEY)))
        .addMethod(
          getGenerateAuthorizationTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenRequest,
              com.saltoapis.nebula.encoder.v1.GenerateAuthorizationTokenResponse>(
                service, METHODID_GENERATE_AUTHORIZATION_TOKEN)))
        .addMethod(
          getGenerateFirmwareDownloadUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.encoder.v1.GenerateFirmwareDownloadUriRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI)))
        .build();
  }

  private static abstract class EncoderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EncoderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.encoder.v1.EncoderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EncoderService");
    }
  }

  private static final class EncoderServiceFileDescriptorSupplier
      extends EncoderServiceBaseDescriptorSupplier {
    EncoderServiceFileDescriptorSupplier() {}
  }

  private static final class EncoderServiceMethodDescriptorSupplier
      extends EncoderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EncoderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EncoderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EncoderServiceFileDescriptorSupplier())
              .addMethod(getCreateEncoderMethod())
              .addMethod(getGetEncoderMethod())
              .addMethod(getListEncodersMethod())
              .addMethod(getUpdateEncoderMethod())
              .addMethod(getDeleteEncoderMethod())
              .addMethod(getInitializeEncoderMethod())
              .addMethod(getConfigureEncoderMethod())
              .addMethod(getResetEncoderMethod())
              .addMethod(getUpdateEncoderFirmwareMethod())
              .addMethod(getBindEncoderMethod())
              .addMethod(getUnbindEncoderMethod())
              .addMethod(getReadKeyMethod())
              .addMethod(getGenerateAuthorizationTokenMethod())
              .addMethod(getGenerateFirmwareDownloadUriMethod())
              .build();
        }
      }
    }
    return result;
  }
}
