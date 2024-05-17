package com.saltoapis.nebula.electroniclock.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An electronic lock is a physical electronic device such as an electronic
 * escutcheon or cylinder, or a door controller with an electric strike. It
 * differs from an access point in that, an electronic lock could be a
 * particular model of a device such as a SALTO Neo cylinder, a door controller
 * with an electric strike or a Danalock V3 smartlock, for example. An
 * electronic lock is a single device whereas an access point could be made up
 * of several devices. An access point could be composed of an electronic lock
 * plus a door detector, a door controller and a keypad, or an intercom adaptor
 * which is connected to multiple electronic locks. This service is responsible
 * for managing electronic lock resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: salto/nebula/electroniclock/v1/electronic_lock.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ElectronicLockServiceGrpc {

  private ElectronicLockServiceGrpc() {}

  public static final String SERVICE_NAME = "salto.nebula.electroniclock.v1.ElectronicLockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getCreateElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.ElectronicLock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getCreateElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getCreateElectronicLockMethod;
    if ((getCreateElectronicLockMethod = ElectronicLockServiceGrpc.getCreateElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getCreateElectronicLockMethod = ElectronicLockServiceGrpc.getCreateElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getCreateElectronicLockMethod = getCreateElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.ElectronicLock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ElectronicLock.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getGetElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.ElectronicLock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getGetElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getGetElectronicLockMethod;
    if ((getGetElectronicLockMethod = ElectronicLockServiceGrpc.getGetElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getGetElectronicLockMethod = ElectronicLockServiceGrpc.getGetElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getGetElectronicLockMethod = getGetElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.ElectronicLock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ElectronicLock.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest,
      com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse> getListElectronicLocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListElectronicLocks",
      requestType = com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest,
      com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse> getListElectronicLocksMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest, com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse> getListElectronicLocksMethod;
    if ((getListElectronicLocksMethod = ElectronicLockServiceGrpc.getListElectronicLocksMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getListElectronicLocksMethod = ElectronicLockServiceGrpc.getListElectronicLocksMethod) == null) {
          ElectronicLockServiceGrpc.getListElectronicLocksMethod = getListElectronicLocksMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest, com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListElectronicLocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListElectronicLocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getUpdateElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.ElectronicLock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getUpdateElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getUpdateElectronicLockMethod;
    if ((getUpdateElectronicLockMethod = ElectronicLockServiceGrpc.getUpdateElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getUpdateElectronicLockMethod = ElectronicLockServiceGrpc.getUpdateElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getUpdateElectronicLockMethod = getUpdateElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.ElectronicLock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ElectronicLock.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest,
      com.google.protobuf.Empty> getDeleteElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest,
      com.google.protobuf.Empty> getDeleteElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest, com.google.protobuf.Empty> getDeleteElectronicLockMethod;
    if ((getDeleteElectronicLockMethod = ElectronicLockServiceGrpc.getDeleteElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getDeleteElectronicLockMethod = ElectronicLockServiceGrpc.getDeleteElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getDeleteElectronicLockMethod = getDeleteElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse> getBindElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse> getBindElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse> getBindElectronicLockMethod;
    if ((getBindElectronicLockMethod = ElectronicLockServiceGrpc.getBindElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getBindElectronicLockMethod = ElectronicLockServiceGrpc.getBindElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getBindElectronicLockMethod = getBindElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getBindElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse> getUnbindElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest,
      com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse> getUnbindElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse> getUnbindElectronicLockMethod;
    if ((getUnbindElectronicLockMethod = ElectronicLockServiceGrpc.getUnbindElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getUnbindElectronicLockMethod = ElectronicLockServiceGrpc.getUnbindElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getUnbindElectronicLockMethod = getUnbindElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest, com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnbindElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest, com.saltoapis.longrunning.v1.Operation> getInitializeElectronicLockMethod;
    if ((getInitializeElectronicLockMethod = ElectronicLockServiceGrpc.getInitializeElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getInitializeElectronicLockMethod = ElectronicLockServiceGrpc.getInitializeElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getInitializeElectronicLockMethod = getInitializeElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .build();
        }
      }
    }
    return getInitializeElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest, com.saltoapis.longrunning.v1.Operation> getConfigureElectronicLockMethod;
    if ((getConfigureElectronicLockMethod = ElectronicLockServiceGrpc.getConfigureElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getConfigureElectronicLockMethod = ElectronicLockServiceGrpc.getConfigureElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getConfigureElectronicLockMethod = getConfigureElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .build();
        }
      }
    }
    return getConfigureElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest,
      com.saltoapis.longrunning.v1.Operation> getResetElectronicLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetElectronicLock",
      requestType = com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest,
      com.saltoapis.longrunning.v1.Operation> getResetElectronicLockMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest, com.saltoapis.longrunning.v1.Operation> getResetElectronicLockMethod;
    if ((getResetElectronicLockMethod = ElectronicLockServiceGrpc.getResetElectronicLockMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getResetElectronicLockMethod = ElectronicLockServiceGrpc.getResetElectronicLockMethod) == null) {
          ElectronicLockServiceGrpc.getResetElectronicLockMethod = getResetElectronicLockMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetElectronicLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .build();
        }
      }
    }
    return getResetElectronicLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateElectronicLockFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElectronicLockFirmware",
      requestType = com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateElectronicLockFirmwareMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest, com.saltoapis.longrunning.v1.Operation> getUpdateElectronicLockFirmwareMethod;
    if ((getUpdateElectronicLockFirmwareMethod = ElectronicLockServiceGrpc.getUpdateElectronicLockFirmwareMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getUpdateElectronicLockFirmwareMethod = ElectronicLockServiceGrpc.getUpdateElectronicLockFirmwareMethod) == null) {
          ElectronicLockServiceGrpc.getUpdateElectronicLockFirmwareMethod = getUpdateElectronicLockFirmwareMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateElectronicLockFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateElectronicLockFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAuthorizationToken",
      requestType = com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest.class,
      responseType = com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;
    if ((getGenerateAuthorizationTokenMethod = ElectronicLockServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        if ((getGenerateAuthorizationTokenMethod = ElectronicLockServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
          ElectronicLockServiceGrpc.getGenerateAuthorizationTokenMethod = getGenerateAuthorizationTokenMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAuthorizationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGenerateAuthorizationTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ElectronicLockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ElectronicLockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ElectronicLockServiceStub>() {
        @java.lang.Override
        public ElectronicLockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ElectronicLockServiceStub(channel, callOptions);
        }
      };
    return ElectronicLockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ElectronicLockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ElectronicLockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ElectronicLockServiceBlockingStub>() {
        @java.lang.Override
        public ElectronicLockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ElectronicLockServiceBlockingStub(channel, callOptions);
        }
      };
    return ElectronicLockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ElectronicLockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ElectronicLockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ElectronicLockServiceFutureStub>() {
        @java.lang.Override
        public ElectronicLockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ElectronicLockServiceFutureStub(channel, callOptions);
        }
      };
    return ElectronicLockServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An electronic lock is a physical electronic device such as an electronic
   * escutcheon or cylinder, or a door controller with an electric strike. It
   * differs from an access point in that, an electronic lock could be a
   * particular model of a device such as a SALTO Neo cylinder, a door controller
   * with an electric strike or a Danalock V3 smartlock, for example. An
   * electronic lock is a single device whereas an access point could be made up
   * of several devices. An access point could be composed of an electronic lock
   * plus a door detector, a door controller and a keypad, or an intercom adaptor
   * which is connected to multiple electronic locks. This service is responsible
   * for managing electronic lock resources.
   * </pre>
   */
  public static abstract class ElectronicLockServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an electronic lock
     * Creates a new electronic lock
     * </pre>
     */
    public void createElectronicLock(com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an electronic lock
     * Gets an existing electronic lock.
     * </pre>
     */
    public void getElectronicLock(com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * List electronic locks
     * Returns a list of electronic locks that have been previously created.
     * </pre>
     */
    public void listElectronicLocks(com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListElectronicLocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an electronic lock
     * Updates an existing electronic lock.
     * </pre>
     */
    public void updateElectronicLock(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an electronic lock
     * Permanently deletes an electronic lock. This cannot be undone.
     * </pre>
     */
    public void deleteElectronicLock(com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind an electronic lock
     * Binds an electronic lock. Binding an electronic lock assigns a device
     * identifier to the electronic lock. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindElectronicLock(com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind an electronic lock
     * Unbinds an electronic lock. Unbinding an electronic lock removes the
     * device identifier from the electronic lock. This may be required in some
     * cases where the electronic lock is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindElectronicLock(com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialize an electronic lock
     * Initializes an electronic lock. Electronic locks need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public void initializeElectronicLock(com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure an electronic lock
     * Configures an electronic lock. Configuring an electronic lock implies
     * adding some information to the electronic lock such as setting the time
     * zone.
     * </pre>
     */
    public void configureElectronicLock(com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset an electronic lock
     * Resetting a device such as an electronic lock means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetElectronicLock(com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetElectronicLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update electronic lock firmware
     * Updates an electronic lock's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateElectronicLockFirmware(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateElectronicLockFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic lock
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic lock.
     * </pre>
     */
    public void generateAuthorizationToken(com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAuthorizationTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest,
                com.saltoapis.nebula.electroniclock.v1.ElectronicLock>(
                  this, METHODID_CREATE_ELECTRONIC_LOCK)))
          .addMethod(
            getGetElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest,
                com.saltoapis.nebula.electroniclock.v1.ElectronicLock>(
                  this, METHODID_GET_ELECTRONIC_LOCK)))
          .addMethod(
            getListElectronicLocksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest,
                com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse>(
                  this, METHODID_LIST_ELECTRONIC_LOCKS)))
          .addMethod(
            getUpdateElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest,
                com.saltoapis.nebula.electroniclock.v1.ElectronicLock>(
                  this, METHODID_UPDATE_ELECTRONIC_LOCK)))
          .addMethod(
            getDeleteElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ELECTRONIC_LOCK)))
          .addMethod(
            getBindElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest,
                com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse>(
                  this, METHODID_BIND_ELECTRONIC_LOCK)))
          .addMethod(
            getUnbindElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest,
                com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse>(
                  this, METHODID_UNBIND_ELECTRONIC_LOCK)))
          .addMethod(
            getInitializeElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest,
                com.saltoapis.longrunning.v1.Operation>(
                  this, METHODID_INITIALIZE_ELECTRONIC_LOCK)))
          .addMethod(
            getConfigureElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest,
                com.saltoapis.longrunning.v1.Operation>(
                  this, METHODID_CONFIGURE_ELECTRONIC_LOCK)))
          .addMethod(
            getResetElectronicLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest,
                com.saltoapis.longrunning.v1.Operation>(
                  this, METHODID_RESET_ELECTRONIC_LOCK)))
          .addMethod(
            getUpdateElectronicLockFirmwareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest,
                com.saltoapis.longrunning.v1.Operation>(
                  this, METHODID_UPDATE_ELECTRONIC_LOCK_FIRMWARE)))
          .addMethod(
            getGenerateAuthorizationTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest,
                com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse>(
                  this, METHODID_GENERATE_AUTHORIZATION_TOKEN)))
          .build();
    }
  }

  /**
   * <pre>
   * An electronic lock is a physical electronic device such as an electronic
   * escutcheon or cylinder, or a door controller with an electric strike. It
   * differs from an access point in that, an electronic lock could be a
   * particular model of a device such as a SALTO Neo cylinder, a door controller
   * with an electric strike or a Danalock V3 smartlock, for example. An
   * electronic lock is a single device whereas an access point could be made up
   * of several devices. An access point could be composed of an electronic lock
   * plus a door detector, a door controller and a keypad, or an intercom adaptor
   * which is connected to multiple electronic locks. This service is responsible
   * for managing electronic lock resources.
   * </pre>
   */
  public static final class ElectronicLockServiceStub extends io.grpc.stub.AbstractAsyncStub<ElectronicLockServiceStub> {
    private ElectronicLockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElectronicLockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ElectronicLockServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an electronic lock
     * Creates a new electronic lock
     * </pre>
     */
    public void createElectronicLock(com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an electronic lock
     * Gets an existing electronic lock.
     * </pre>
     */
    public void getElectronicLock(com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List electronic locks
     * Returns a list of electronic locks that have been previously created.
     * </pre>
     */
    public void listElectronicLocks(com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListElectronicLocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an electronic lock
     * Updates an existing electronic lock.
     * </pre>
     */
    public void updateElectronicLock(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an electronic lock
     * Permanently deletes an electronic lock. This cannot be undone.
     * </pre>
     */
    public void deleteElectronicLock(com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind an electronic lock
     * Binds an electronic lock. Binding an electronic lock assigns a device
     * identifier to the electronic lock. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindElectronicLock(com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind an electronic lock
     * Unbinds an electronic lock. Unbinding an electronic lock removes the
     * device identifier from the electronic lock. This may be required in some
     * cases where the electronic lock is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindElectronicLock(com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initialize an electronic lock
     * Initializes an electronic lock. Electronic locks need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public void initializeElectronicLock(com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure an electronic lock
     * Configures an electronic lock. Configuring an electronic lock implies
     * adding some information to the electronic lock such as setting the time
     * zone.
     * </pre>
     */
    public void configureElectronicLock(com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset an electronic lock
     * Resetting a device such as an electronic lock means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetElectronicLock(com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetElectronicLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update electronic lock firmware
     * Updates an electronic lock's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateElectronicLockFirmware(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateElectronicLockFirmwareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic lock
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic lock.
     * </pre>
     */
    public void generateAuthorizationToken(com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An electronic lock is a physical electronic device such as an electronic
   * escutcheon or cylinder, or a door controller with an electric strike. It
   * differs from an access point in that, an electronic lock could be a
   * particular model of a device such as a SALTO Neo cylinder, a door controller
   * with an electric strike or a Danalock V3 smartlock, for example. An
   * electronic lock is a single device whereas an access point could be made up
   * of several devices. An access point could be composed of an electronic lock
   * plus a door detector, a door controller and a keypad, or an intercom adaptor
   * which is connected to multiple electronic locks. This service is responsible
   * for managing electronic lock resources.
   * </pre>
   */
  public static final class ElectronicLockServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ElectronicLockServiceBlockingStub> {
    private ElectronicLockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElectronicLockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ElectronicLockServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an electronic lock
     * Creates a new electronic lock
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.ElectronicLock createElectronicLock(com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an electronic lock
     * Gets an existing electronic lock.
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.ElectronicLock getElectronicLock(com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List electronic locks
     * Returns a list of electronic locks that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse listElectronicLocks(com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListElectronicLocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an electronic lock
     * Updates an existing electronic lock.
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.ElectronicLock updateElectronicLock(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an electronic lock
     * Permanently deletes an electronic lock. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteElectronicLock(com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind an electronic lock
     * Binds an electronic lock. Binding an electronic lock assigns a device
     * identifier to the electronic lock. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse bindElectronicLock(com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind an electronic lock
     * Unbinds an electronic lock. Unbinding an electronic lock removes the
     * device identifier from the electronic lock. This may be required in some
     * cases where the electronic lock is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse unbindElectronicLock(com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initialize an electronic lock
     * Initializes an electronic lock. Electronic locks need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation initializeElectronicLock(com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure an electronic lock
     * Configures an electronic lock. Configuring an electronic lock implies
     * adding some information to the electronic lock such as setting the time
     * zone.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation configureElectronicLock(com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset an electronic lock
     * Resetting a device such as an electronic lock means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetElectronicLock(com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetElectronicLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update electronic lock firmware
     * Updates an electronic lock's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation updateElectronicLockFirmware(com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateElectronicLockFirmwareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic lock
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic lock.
     * </pre>
     */
    public com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse generateAuthorizationToken(com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAuthorizationTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An electronic lock is a physical electronic device such as an electronic
   * escutcheon or cylinder, or a door controller with an electric strike. It
   * differs from an access point in that, an electronic lock could be a
   * particular model of a device such as a SALTO Neo cylinder, a door controller
   * with an electric strike or a Danalock V3 smartlock, for example. An
   * electronic lock is a single device whereas an access point could be made up
   * of several devices. An access point could be composed of an electronic lock
   * plus a door detector, a door controller and a keypad, or an intercom adaptor
   * which is connected to multiple electronic locks. This service is responsible
   * for managing electronic lock resources.
   * </pre>
   */
  public static final class ElectronicLockServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ElectronicLockServiceFutureStub> {
    private ElectronicLockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElectronicLockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ElectronicLockServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an electronic lock
     * Creates a new electronic lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> createElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an electronic lock
     * Gets an existing electronic lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> getElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List electronic locks
     * Returns a list of electronic locks that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse> listElectronicLocks(
        com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListElectronicLocksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an electronic lock
     * Updates an existing electronic lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.ElectronicLock> updateElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an electronic lock
     * Permanently deletes an electronic lock. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind an electronic lock
     * Binds an electronic lock. Binding an electronic lock assigns a device
     * identifier to the electronic lock. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse> bindElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind an electronic lock
     * Unbinds an electronic lock. Unbinding an electronic lock removes the
     * device identifier from the electronic lock. This may be required in some
     * cases where the electronic lock is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse> unbindElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initialize an electronic lock
     * Initializes an electronic lock. Electronic locks need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> initializeElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure an electronic lock
     * Configures an electronic lock. Configuring an electronic lock implies
     * adding some information to the electronic lock such as setting the time
     * zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> configureElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset an electronic lock
     * Resetting a device such as an electronic lock means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetElectronicLock(
        com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetElectronicLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update electronic lock firmware
     * Updates an electronic lock's firmware. SALTO provides firmware updates
     * when new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> updateElectronicLockFirmware(
        com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateElectronicLockFirmwareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic lock
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse> generateAuthorizationToken(
        com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ELECTRONIC_LOCK = 0;
  private static final int METHODID_GET_ELECTRONIC_LOCK = 1;
  private static final int METHODID_LIST_ELECTRONIC_LOCKS = 2;
  private static final int METHODID_UPDATE_ELECTRONIC_LOCK = 3;
  private static final int METHODID_DELETE_ELECTRONIC_LOCK = 4;
  private static final int METHODID_BIND_ELECTRONIC_LOCK = 5;
  private static final int METHODID_UNBIND_ELECTRONIC_LOCK = 6;
  private static final int METHODID_INITIALIZE_ELECTRONIC_LOCK = 7;
  private static final int METHODID_CONFIGURE_ELECTRONIC_LOCK = 8;
  private static final int METHODID_RESET_ELECTRONIC_LOCK = 9;
  private static final int METHODID_UPDATE_ELECTRONIC_LOCK_FIRMWARE = 10;
  private static final int METHODID_GENERATE_AUTHORIZATION_TOKEN = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ElectronicLockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ElectronicLockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ELECTRONIC_LOCK:
          serviceImpl.createElectronicLock((com.saltoapis.nebula.electroniclock.v1.CreateElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock>) responseObserver);
          break;
        case METHODID_GET_ELECTRONIC_LOCK:
          serviceImpl.getElectronicLock((com.saltoapis.nebula.electroniclock.v1.GetElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock>) responseObserver);
          break;
        case METHODID_LIST_ELECTRONIC_LOCKS:
          serviceImpl.listElectronicLocks((com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ListElectronicLocksResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ELECTRONIC_LOCK:
          serviceImpl.updateElectronicLock((com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.ElectronicLock>) responseObserver);
          break;
        case METHODID_DELETE_ELECTRONIC_LOCK:
          serviceImpl.deleteElectronicLock((com.saltoapis.nebula.electroniclock.v1.DeleteElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BIND_ELECTRONIC_LOCK:
          serviceImpl.bindElectronicLock((com.saltoapis.nebula.electroniclock.v1.BindElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.BindElectronicLockResponse>) responseObserver);
          break;
        case METHODID_UNBIND_ELECTRONIC_LOCK:
          serviceImpl.unbindElectronicLock((com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.UnbindElectronicLockResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_ELECTRONIC_LOCK:
          serviceImpl.initializeElectronicLock((com.saltoapis.nebula.electroniclock.v1.InitializeElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_ELECTRONIC_LOCK:
          serviceImpl.configureElectronicLock((com.saltoapis.nebula.electroniclock.v1.ConfigureElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_ELECTRONIC_LOCK:
          serviceImpl.resetElectronicLock((com.saltoapis.nebula.electroniclock.v1.ResetElectronicLockRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_ELECTRONIC_LOCK_FIRMWARE:
          serviceImpl.updateElectronicLockFirmware((com.saltoapis.nebula.electroniclock.v1.UpdateElectronicLockFirmwareRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_AUTHORIZATION_TOKEN:
          serviceImpl.generateAuthorizationToken((com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electroniclock.v1.GenerateAuthorizationTokenResponse>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ElectronicLockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateElectronicLockMethod())
              .addMethod(getGetElectronicLockMethod())
              .addMethod(getListElectronicLocksMethod())
              .addMethod(getUpdateElectronicLockMethod())
              .addMethod(getDeleteElectronicLockMethod())
              .addMethod(getBindElectronicLockMethod())
              .addMethod(getUnbindElectronicLockMethod())
              .addMethod(getInitializeElectronicLockMethod())
              .addMethod(getConfigureElectronicLockMethod())
              .addMethod(getResetElectronicLockMethod())
              .addMethod(getUpdateElectronicLockFirmwareMethod())
              .addMethod(getGenerateAuthorizationTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
