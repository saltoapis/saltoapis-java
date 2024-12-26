package com.saltoapis.nebula.electronickey.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An electronic key is battery-powered device used to interact with electronic locks.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/electronickey/v1/electronic_key.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ElectronicKeyServiceGrpc {

  private ElectronicKeyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.electronickey.v1.ElectronicKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.ElectronicKey> getCreateElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.ElectronicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.ElectronicKey> getCreateElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.ElectronicKey> getCreateElectronicKeyMethod;
    if ((getCreateElectronicKeyMethod = ElectronicKeyServiceGrpc.getCreateElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getCreateElectronicKeyMethod = ElectronicKeyServiceGrpc.getCreateElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getCreateElectronicKeyMethod = getCreateElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.ElectronicKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ElectronicKey.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("CreateElectronicKey"))
              .build();
        }
      }
    }
    return getCreateElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.ElectronicKey> getGetElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.ElectronicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.ElectronicKey> getGetElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.ElectronicKey> getGetElectronicKeyMethod;
    if ((getGetElectronicKeyMethod = ElectronicKeyServiceGrpc.getGetElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getGetElectronicKeyMethod = ElectronicKeyServiceGrpc.getGetElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getGetElectronicKeyMethod = getGetElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.ElectronicKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ElectronicKey.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("GetElectronicKey"))
              .build();
        }
      }
    }
    return getGetElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest,
      com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse> getListElectronicKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListElectronicKeys",
      requestType = com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest,
      com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse> getListElectronicKeysMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest, com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse> getListElectronicKeysMethod;
    if ((getListElectronicKeysMethod = ElectronicKeyServiceGrpc.getListElectronicKeysMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getListElectronicKeysMethod = ElectronicKeyServiceGrpc.getListElectronicKeysMethod) == null) {
          ElectronicKeyServiceGrpc.getListElectronicKeysMethod = getListElectronicKeysMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest, com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListElectronicKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("ListElectronicKeys"))
              .build();
        }
      }
    }
    return getListElectronicKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.ElectronicKey> getUpdateElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.ElectronicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.ElectronicKey> getUpdateElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.ElectronicKey> getUpdateElectronicKeyMethod;
    if ((getUpdateElectronicKeyMethod = ElectronicKeyServiceGrpc.getUpdateElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getUpdateElectronicKeyMethod = ElectronicKeyServiceGrpc.getUpdateElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getUpdateElectronicKeyMethod = getUpdateElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.ElectronicKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ElectronicKey.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("UpdateElectronicKey"))
              .build();
        }
      }
    }
    return getUpdateElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest,
      com.google.protobuf.Empty> getDeleteElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest,
      com.google.protobuf.Empty> getDeleteElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest, com.google.protobuf.Empty> getDeleteElectronicKeyMethod;
    if ((getDeleteElectronicKeyMethod = ElectronicKeyServiceGrpc.getDeleteElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getDeleteElectronicKeyMethod = ElectronicKeyServiceGrpc.getDeleteElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getDeleteElectronicKeyMethod = getDeleteElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("DeleteElectronicKey"))
              .build();
        }
      }
    }
    return getDeleteElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse> getBindElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse> getBindElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse> getBindElectronicKeyMethod;
    if ((getBindElectronicKeyMethod = ElectronicKeyServiceGrpc.getBindElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getBindElectronicKeyMethod = ElectronicKeyServiceGrpc.getBindElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getBindElectronicKeyMethod = getBindElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("BindElectronicKey"))
              .build();
        }
      }
    }
    return getBindElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse> getUnbindElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest,
      com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse> getUnbindElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse> getUnbindElectronicKeyMethod;
    if ((getUnbindElectronicKeyMethod = ElectronicKeyServiceGrpc.getUnbindElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getUnbindElectronicKeyMethod = ElectronicKeyServiceGrpc.getUnbindElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getUnbindElectronicKeyMethod = getUnbindElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest, com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("UnbindElectronicKey"))
              .build();
        }
      }
    }
    return getUnbindElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getInitializeElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest, com.saltoapis.longrunning.v1.Operation> getInitializeElectronicKeyMethod;
    if ((getInitializeElectronicKeyMethod = ElectronicKeyServiceGrpc.getInitializeElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getInitializeElectronicKeyMethod = ElectronicKeyServiceGrpc.getInitializeElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getInitializeElectronicKeyMethod = getInitializeElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("InitializeElectronicKey"))
              .build();
        }
      }
    }
    return getInitializeElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getConfigureElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest, com.saltoapis.longrunning.v1.Operation> getConfigureElectronicKeyMethod;
    if ((getConfigureElectronicKeyMethod = ElectronicKeyServiceGrpc.getConfigureElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getConfigureElectronicKeyMethod = ElectronicKeyServiceGrpc.getConfigureElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getConfigureElectronicKeyMethod = getConfigureElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("ConfigureElectronicKey"))
              .build();
        }
      }
    }
    return getConfigureElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getResetElectronicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetElectronicKey",
      requestType = com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getResetElectronicKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest, com.saltoapis.longrunning.v1.Operation> getResetElectronicKeyMethod;
    if ((getResetElectronicKeyMethod = ElectronicKeyServiceGrpc.getResetElectronicKeyMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getResetElectronicKeyMethod = ElectronicKeyServiceGrpc.getResetElectronicKeyMethod) == null) {
          ElectronicKeyServiceGrpc.getResetElectronicKeyMethod = getResetElectronicKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetElectronicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("ResetElectronicKey"))
              .build();
        }
      }
    }
    return getResetElectronicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAuthorizationToken",
      requestType = com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest.class,
      responseType = com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest,
      com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse> getGenerateAuthorizationTokenMethod;
    if ((getGenerateAuthorizationTokenMethod = ElectronicKeyServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getGenerateAuthorizationTokenMethod = ElectronicKeyServiceGrpc.getGenerateAuthorizationTokenMethod) == null) {
          ElectronicKeyServiceGrpc.getGenerateAuthorizationTokenMethod = getGenerateAuthorizationTokenMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest, com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAuthorizationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("GenerateAuthorizationToken"))
              .build();
        }
      }
    }
    return getGenerateAuthorizationTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateFirmwareDownloadUri",
      requestType = com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;
    if ((getGenerateFirmwareDownloadUriMethod = ElectronicKeyServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
      synchronized (ElectronicKeyServiceGrpc.class) {
        if ((getGenerateFirmwareDownloadUriMethod = ElectronicKeyServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
          ElectronicKeyServiceGrpc.getGenerateFirmwareDownloadUriMethod = getGenerateFirmwareDownloadUriMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateFirmwareDownloadUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ElectronicKeyServiceMethodDescriptorSupplier("GenerateFirmwareDownloadUri"))
              .build();
        }
      }
    }
    return getGenerateFirmwareDownloadUriMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ElectronicKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ElectronicKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ElectronicKeyServiceStub>() {
        @java.lang.Override
        public ElectronicKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ElectronicKeyServiceStub(channel, callOptions);
        }
      };
    return ElectronicKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ElectronicKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ElectronicKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ElectronicKeyServiceBlockingStub>() {
        @java.lang.Override
        public ElectronicKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ElectronicKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return ElectronicKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ElectronicKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ElectronicKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ElectronicKeyServiceFutureStub>() {
        @java.lang.Override
        public ElectronicKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ElectronicKeyServiceFutureStub(channel, callOptions);
        }
      };
    return ElectronicKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An electronic key is battery-powered device used to interact with electronic locks.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a new electronic key
     * Creates a new electronic key
     * </pre>
     */
    default void createElectronicKey(com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an electronic key
     * Gets an existing electronic key.
     * </pre>
     */
    default void getElectronicKey(com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List electronic keys
     * Returns a list of electronic keys that have been previously created.
     * </pre>
     */
    default void listElectronicKeys(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListElectronicKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an electronic key
     * Updates an existing electronic key.
     * </pre>
     */
    default void updateElectronicKey(com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an electronic key
     * Permanently deletes an electronic key. This cannot be undone.
     * </pre>
     */
    default void deleteElectronicKey(com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind an electronic key
     * Binds an electronic key. Binding an electronic key assigns a device
     * identifier to the electronic key. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    default void bindElectronicKey(com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind an electronic key
     * Unbinds an electronic key. Unbinding an electronic key removes the
     * device identifier from the electronic key. This may be required in some
     * cases where the electronic key is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    default void unbindElectronicKey(com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialize an electronic key
     * Initializes an electronic key. Electronic keys need to be initialized
     * before you can start to use them.
     * </pre>
     */
    default void initializeElectronicKey(com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure an electronic key
     * Configures an electronic key. Configuring an electronic key implies
     * adding some information to the electronic key such as setting the time
     * zone.
     * </pre>
     */
    default void configureElectronicKey(com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset an electronic key
     * Resetting a device such as an electronic key means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    default void resetElectronicKey(com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetElectronicKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic key
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic key.
     * </pre>
     */
    default void generateAuthorizationToken(com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAuthorizationTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate electronic key firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * electronic key. The returned URI can be used to bring the electronic key
     * firmwares up to latest.
     * </pre>
     */
    default void generateFirmwareDownloadUri(com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateFirmwareDownloadUriMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ElectronicKeyService.
   * <pre>
   * An electronic key is battery-powered device used to interact with electronic locks.
   * </pre>
   */
  public static abstract class ElectronicKeyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ElectronicKeyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ElectronicKeyService.
   * <pre>
   * An electronic key is battery-powered device used to interact with electronic locks.
   * </pre>
   */
  public static final class ElectronicKeyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ElectronicKeyServiceStub> {
    private ElectronicKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElectronicKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ElectronicKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new electronic key
     * Creates a new electronic key
     * </pre>
     */
    public void createElectronicKey(com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an electronic key
     * Gets an existing electronic key.
     * </pre>
     */
    public void getElectronicKey(com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List electronic keys
     * Returns a list of electronic keys that have been previously created.
     * </pre>
     */
    public void listElectronicKeys(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListElectronicKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an electronic key
     * Updates an existing electronic key.
     * </pre>
     */
    public void updateElectronicKey(com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an electronic key
     * Permanently deletes an electronic key. This cannot be undone.
     * </pre>
     */
    public void deleteElectronicKey(com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind an electronic key
     * Binds an electronic key. Binding an electronic key assigns a device
     * identifier to the electronic key. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public void bindElectronicKey(com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind an electronic key
     * Unbinds an electronic key. Unbinding an electronic key removes the
     * device identifier from the electronic key. This may be required in some
     * cases where the electronic key is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public void unbindElectronicKey(com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initialize an electronic key
     * Initializes an electronic key. Electronic keys need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public void initializeElectronicKey(com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure an electronic key
     * Configures an electronic key. Configuring an electronic key implies
     * adding some information to the electronic key such as setting the time
     * zone.
     * </pre>
     */
    public void configureElectronicKey(com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset an electronic key
     * Resetting a device such as an electronic key means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public void resetElectronicKey(com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetElectronicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic key
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic key.
     * </pre>
     */
    public void generateAuthorizationToken(com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate electronic key firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * electronic key. The returned URI can be used to bring the electronic key
     * firmwares up to latest.
     * </pre>
     */
    public void generateFirmwareDownloadUri(com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ElectronicKeyService.
   * <pre>
   * An electronic key is battery-powered device used to interact with electronic locks.
   * </pre>
   */
  public static final class ElectronicKeyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ElectronicKeyServiceBlockingStub> {
    private ElectronicKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElectronicKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ElectronicKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new electronic key
     * Creates a new electronic key
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey createElectronicKey(com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an electronic key
     * Gets an existing electronic key.
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey getElectronicKey(com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List electronic keys
     * Returns a list of electronic keys that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse listElectronicKeys(com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListElectronicKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an electronic key
     * Updates an existing electronic key.
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.ElectronicKey updateElectronicKey(com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an electronic key
     * Permanently deletes an electronic key. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteElectronicKey(com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind an electronic key
     * Binds an electronic key. Binding an electronic key assigns a device
     * identifier to the electronic key. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse bindElectronicKey(com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind an electronic key
     * Unbinds an electronic key. Unbinding an electronic key removes the
     * device identifier from the electronic key. This may be required in some
     * cases where the electronic key is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse unbindElectronicKey(com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initialize an electronic key
     * Initializes an electronic key. Electronic keys need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation initializeElectronicKey(com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure an electronic key
     * Configures an electronic key. Configuring an electronic key implies
     * adding some information to the electronic key such as setting the time
     * zone.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation configureElectronicKey(com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset an electronic key
     * Resetting a device such as an electronic key means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetElectronicKey(com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetElectronicKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic key
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic key.
     * </pre>
     */
    public com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse generateAuthorizationToken(com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAuthorizationTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate electronic key firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * electronic key. The returned URI can be used to bring the electronic key
     * firmwares up to latest.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation generateFirmwareDownloadUri(com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateFirmwareDownloadUriMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ElectronicKeyService.
   * <pre>
   * An electronic key is battery-powered device used to interact with electronic locks.
   * </pre>
   */
  public static final class ElectronicKeyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ElectronicKeyServiceFutureStub> {
    private ElectronicKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ElectronicKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ElectronicKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new electronic key
     * Creates a new electronic key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.ElectronicKey> createElectronicKey(
        com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an electronic key
     * Gets an existing electronic key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.ElectronicKey> getElectronicKey(
        com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List electronic keys
     * Returns a list of electronic keys that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse> listElectronicKeys(
        com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListElectronicKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an electronic key
     * Updates an existing electronic key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.ElectronicKey> updateElectronicKey(
        com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an electronic key
     * Permanently deletes an electronic key. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteElectronicKey(
        com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind an electronic key
     * Binds an electronic key. Binding an electronic key assigns a device
     * identifier to the electronic key. After binding, the device can then be
     * initialized or configured.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse> bindElectronicKey(
        com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind an electronic key
     * Unbinds an electronic key. Unbinding an electronic key removes the
     * device identifier from the electronic key. This may be required in some
     * cases where the electronic key is not available anymore because, for
     * example, it's broken or damaged. Unbinding allows the initialization of
     * the replacement device without removing it from the installation. It also
     * means the device keeps all the information associated with it, such as
     * events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse> unbindElectronicKey(
        com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initialize an electronic key
     * Initializes an electronic key. Electronic keys need to be initialized
     * before you can start to use them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> initializeElectronicKey(
        com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure an electronic key
     * Configures an electronic key. Configuring an electronic key implies
     * adding some information to the electronic key such as setting the time
     * zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> configureElectronicKey(
        com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset an electronic key
     * Resetting a device such as an electronic key means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * Once a device has been reset, you need to reconfigure it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetElectronicKey(
        com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetElectronicKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate authorization token for an electronic key
     * Generates an authorization token that allows to connect to, authenticate and
     * authorize an electronic key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse> generateAuthorizationToken(
        com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAuthorizationTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate electronic key firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * electronic key. The returned URI can be used to bring the electronic key
     * firmwares up to latest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> generateFirmwareDownloadUri(
        com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ELECTRONIC_KEY = 0;
  private static final int METHODID_GET_ELECTRONIC_KEY = 1;
  private static final int METHODID_LIST_ELECTRONIC_KEYS = 2;
  private static final int METHODID_UPDATE_ELECTRONIC_KEY = 3;
  private static final int METHODID_DELETE_ELECTRONIC_KEY = 4;
  private static final int METHODID_BIND_ELECTRONIC_KEY = 5;
  private static final int METHODID_UNBIND_ELECTRONIC_KEY = 6;
  private static final int METHODID_INITIALIZE_ELECTRONIC_KEY = 7;
  private static final int METHODID_CONFIGURE_ELECTRONIC_KEY = 8;
  private static final int METHODID_RESET_ELECTRONIC_KEY = 9;
  private static final int METHODID_GENERATE_AUTHORIZATION_TOKEN = 10;
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
        case METHODID_CREATE_ELECTRONIC_KEY:
          serviceImpl.createElectronicKey((com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey>) responseObserver);
          break;
        case METHODID_GET_ELECTRONIC_KEY:
          serviceImpl.getElectronicKey((com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey>) responseObserver);
          break;
        case METHODID_LIST_ELECTRONIC_KEYS:
          serviceImpl.listElectronicKeys((com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ELECTRONIC_KEY:
          serviceImpl.updateElectronicKey((com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.ElectronicKey>) responseObserver);
          break;
        case METHODID_DELETE_ELECTRONIC_KEY:
          serviceImpl.deleteElectronicKey((com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BIND_ELECTRONIC_KEY:
          serviceImpl.bindElectronicKey((com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse>) responseObserver);
          break;
        case METHODID_UNBIND_ELECTRONIC_KEY:
          serviceImpl.unbindElectronicKey((com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse>) responseObserver);
          break;
        case METHODID_INITIALIZE_ELECTRONIC_KEY:
          serviceImpl.initializeElectronicKey((com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_CONFIGURE_ELECTRONIC_KEY:
          serviceImpl.configureElectronicKey((com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_ELECTRONIC_KEY:
          serviceImpl.resetElectronicKey((com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_AUTHORIZATION_TOKEN:
          serviceImpl.generateAuthorizationToken((com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse>) responseObserver);
          break;
        case METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI:
          serviceImpl.generateFirmwareDownloadUri((com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest) request,
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
          getCreateElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.CreateElectronicKeyRequest,
              com.saltoapis.nebula.electronickey.v1.ElectronicKey>(
                service, METHODID_CREATE_ELECTRONIC_KEY)))
        .addMethod(
          getGetElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.GetElectronicKeyRequest,
              com.saltoapis.nebula.electronickey.v1.ElectronicKey>(
                service, METHODID_GET_ELECTRONIC_KEY)))
        .addMethod(
          getListElectronicKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.ListElectronicKeysRequest,
              com.saltoapis.nebula.electronickey.v1.ListElectronicKeysResponse>(
                service, METHODID_LIST_ELECTRONIC_KEYS)))
        .addMethod(
          getUpdateElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.UpdateElectronicKeyRequest,
              com.saltoapis.nebula.electronickey.v1.ElectronicKey>(
                service, METHODID_UPDATE_ELECTRONIC_KEY)))
        .addMethod(
          getDeleteElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.DeleteElectronicKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ELECTRONIC_KEY)))
        .addMethod(
          getBindElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.BindElectronicKeyRequest,
              com.saltoapis.nebula.electronickey.v1.BindElectronicKeyResponse>(
                service, METHODID_BIND_ELECTRONIC_KEY)))
        .addMethod(
          getUnbindElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyRequest,
              com.saltoapis.nebula.electronickey.v1.UnbindElectronicKeyResponse>(
                service, METHODID_UNBIND_ELECTRONIC_KEY)))
        .addMethod(
          getInitializeElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.InitializeElectronicKeyRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_INITIALIZE_ELECTRONIC_KEY)))
        .addMethod(
          getConfigureElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.ConfigureElectronicKeyRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_CONFIGURE_ELECTRONIC_KEY)))
        .addMethod(
          getResetElectronicKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.ResetElectronicKeyRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_RESET_ELECTRONIC_KEY)))
        .addMethod(
          getGenerateAuthorizationTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenRequest,
              com.saltoapis.nebula.electronickey.v1.GenerateAuthorizationTokenResponse>(
                service, METHODID_GENERATE_AUTHORIZATION_TOKEN)))
        .addMethod(
          getGenerateFirmwareDownloadUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.electronickey.v1.GenerateFirmwareDownloadUriRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI)))
        .build();
  }

  private static abstract class ElectronicKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ElectronicKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.electronickey.v1.ElectronicKeyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ElectronicKeyService");
    }
  }

  private static final class ElectronicKeyServiceFileDescriptorSupplier
      extends ElectronicKeyServiceBaseDescriptorSupplier {
    ElectronicKeyServiceFileDescriptorSupplier() {}
  }

  private static final class ElectronicKeyServiceMethodDescriptorSupplier
      extends ElectronicKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ElectronicKeyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ElectronicKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ElectronicKeyServiceFileDescriptorSupplier())
              .addMethod(getCreateElectronicKeyMethod())
              .addMethod(getGetElectronicKeyMethod())
              .addMethod(getListElectronicKeysMethod())
              .addMethod(getUpdateElectronicKeyMethod())
              .addMethod(getDeleteElectronicKeyMethod())
              .addMethod(getBindElectronicKeyMethod())
              .addMethod(getUnbindElectronicKeyMethod())
              .addMethod(getInitializeElectronicKeyMethod())
              .addMethod(getConfigureElectronicKeyMethod())
              .addMethod(getResetElectronicKeyMethod())
              .addMethod(getGenerateAuthorizationTokenMethod())
              .addMethod(getGenerateFirmwareDownloadUriMethod())
              .build();
        }
      }
    }
    return result;
  }
}
