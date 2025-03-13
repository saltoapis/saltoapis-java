package com.saltoapis.nebula.extender.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An extender allows the distance between the a gateway and an electronic lock
 * to be extended. It forwards signals between an access point (lock) and a
 * gateway. This service is responsible for managing extender resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/extender/v1/extender.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExtenderServiceGrpc {

  private ExtenderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.extender.v1.ExtenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.CreateExtenderRequest,
      com.saltoapis.nebula.extender.v1.Extender> getCreateExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExtender",
      requestType = com.saltoapis.nebula.extender.v1.CreateExtenderRequest.class,
      responseType = com.saltoapis.nebula.extender.v1.Extender.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.CreateExtenderRequest,
      com.saltoapis.nebula.extender.v1.Extender> getCreateExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.CreateExtenderRequest, com.saltoapis.nebula.extender.v1.Extender> getCreateExtenderMethod;
    if ((getCreateExtenderMethod = ExtenderServiceGrpc.getCreateExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getCreateExtenderMethod = ExtenderServiceGrpc.getCreateExtenderMethod) == null) {
          ExtenderServiceGrpc.getCreateExtenderMethod = getCreateExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.CreateExtenderRequest, com.saltoapis.nebula.extender.v1.Extender>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.CreateExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("CreateExtender"))
              .build();
        }
      }
    }
    return getCreateExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.GetExtenderRequest,
      com.saltoapis.nebula.extender.v1.Extender> getGetExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExtender",
      requestType = com.saltoapis.nebula.extender.v1.GetExtenderRequest.class,
      responseType = com.saltoapis.nebula.extender.v1.Extender.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.GetExtenderRequest,
      com.saltoapis.nebula.extender.v1.Extender> getGetExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.GetExtenderRequest, com.saltoapis.nebula.extender.v1.Extender> getGetExtenderMethod;
    if ((getGetExtenderMethod = ExtenderServiceGrpc.getGetExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getGetExtenderMethod = ExtenderServiceGrpc.getGetExtenderMethod) == null) {
          ExtenderServiceGrpc.getGetExtenderMethod = getGetExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.GetExtenderRequest, com.saltoapis.nebula.extender.v1.Extender>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.GetExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("GetExtender"))
              .build();
        }
      }
    }
    return getGetExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.ListExtendersRequest,
      com.saltoapis.nebula.extender.v1.ListExtendersResponse> getListExtendersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExtenders",
      requestType = com.saltoapis.nebula.extender.v1.ListExtendersRequest.class,
      responseType = com.saltoapis.nebula.extender.v1.ListExtendersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.ListExtendersRequest,
      com.saltoapis.nebula.extender.v1.ListExtendersResponse> getListExtendersMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.ListExtendersRequest, com.saltoapis.nebula.extender.v1.ListExtendersResponse> getListExtendersMethod;
    if ((getListExtendersMethod = ExtenderServiceGrpc.getListExtendersMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getListExtendersMethod = ExtenderServiceGrpc.getListExtendersMethod) == null) {
          ExtenderServiceGrpc.getListExtendersMethod = getListExtendersMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.ListExtendersRequest, com.saltoapis.nebula.extender.v1.ListExtendersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExtenders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.ListExtendersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.ListExtendersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("ListExtenders"))
              .build();
        }
      }
    }
    return getListExtendersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UpdateExtenderRequest,
      com.saltoapis.nebula.extender.v1.Extender> getUpdateExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExtender",
      requestType = com.saltoapis.nebula.extender.v1.UpdateExtenderRequest.class,
      responseType = com.saltoapis.nebula.extender.v1.Extender.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UpdateExtenderRequest,
      com.saltoapis.nebula.extender.v1.Extender> getUpdateExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UpdateExtenderRequest, com.saltoapis.nebula.extender.v1.Extender> getUpdateExtenderMethod;
    if ((getUpdateExtenderMethod = ExtenderServiceGrpc.getUpdateExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getUpdateExtenderMethod = ExtenderServiceGrpc.getUpdateExtenderMethod) == null) {
          ExtenderServiceGrpc.getUpdateExtenderMethod = getUpdateExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.UpdateExtenderRequest, com.saltoapis.nebula.extender.v1.Extender>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.UpdateExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.Extender.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("UpdateExtender"))
              .build();
        }
      }
    }
    return getUpdateExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.DeleteExtenderRequest,
      com.google.protobuf.Empty> getDeleteExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExtender",
      requestType = com.saltoapis.nebula.extender.v1.DeleteExtenderRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.DeleteExtenderRequest,
      com.google.protobuf.Empty> getDeleteExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.DeleteExtenderRequest, com.google.protobuf.Empty> getDeleteExtenderMethod;
    if ((getDeleteExtenderMethod = ExtenderServiceGrpc.getDeleteExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getDeleteExtenderMethod = ExtenderServiceGrpc.getDeleteExtenderMethod) == null) {
          ExtenderServiceGrpc.getDeleteExtenderMethod = getDeleteExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.DeleteExtenderRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.DeleteExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("DeleteExtender"))
              .build();
        }
      }
    }
    return getDeleteExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.BindExtenderRequest,
      com.saltoapis.nebula.extender.v1.BindExtenderResponse> getBindExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindExtender",
      requestType = com.saltoapis.nebula.extender.v1.BindExtenderRequest.class,
      responseType = com.saltoapis.nebula.extender.v1.BindExtenderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.BindExtenderRequest,
      com.saltoapis.nebula.extender.v1.BindExtenderResponse> getBindExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.BindExtenderRequest, com.saltoapis.nebula.extender.v1.BindExtenderResponse> getBindExtenderMethod;
    if ((getBindExtenderMethod = ExtenderServiceGrpc.getBindExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getBindExtenderMethod = ExtenderServiceGrpc.getBindExtenderMethod) == null) {
          ExtenderServiceGrpc.getBindExtenderMethod = getBindExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.BindExtenderRequest, com.saltoapis.nebula.extender.v1.BindExtenderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.BindExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.BindExtenderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("BindExtender"))
              .build();
        }
      }
    }
    return getBindExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UnbindExtenderRequest,
      com.saltoapis.nebula.extender.v1.UnbindExtenderResponse> getUnbindExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindExtender",
      requestType = com.saltoapis.nebula.extender.v1.UnbindExtenderRequest.class,
      responseType = com.saltoapis.nebula.extender.v1.UnbindExtenderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UnbindExtenderRequest,
      com.saltoapis.nebula.extender.v1.UnbindExtenderResponse> getUnbindExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UnbindExtenderRequest, com.saltoapis.nebula.extender.v1.UnbindExtenderResponse> getUnbindExtenderMethod;
    if ((getUnbindExtenderMethod = ExtenderServiceGrpc.getUnbindExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getUnbindExtenderMethod = ExtenderServiceGrpc.getUnbindExtenderMethod) == null) {
          ExtenderServiceGrpc.getUnbindExtenderMethod = getUnbindExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.UnbindExtenderRequest, com.saltoapis.nebula.extender.v1.UnbindExtenderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.UnbindExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.UnbindExtenderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("UnbindExtender"))
              .build();
        }
      }
    }
    return getUnbindExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateExtenderFirmwareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExtenderFirmware",
      requestType = com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest,
      com.saltoapis.longrunning.v1.Operation> getUpdateExtenderFirmwareMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest, com.saltoapis.longrunning.v1.Operation> getUpdateExtenderFirmwareMethod;
    if ((getUpdateExtenderFirmwareMethod = ExtenderServiceGrpc.getUpdateExtenderFirmwareMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getUpdateExtenderFirmwareMethod = ExtenderServiceGrpc.getUpdateExtenderFirmwareMethod) == null) {
          ExtenderServiceGrpc.getUpdateExtenderFirmwareMethod = getUpdateExtenderFirmwareMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExtenderFirmware"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("UpdateExtenderFirmware"))
              .build();
        }
      }
    }
    return getUpdateExtenderFirmwareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.ResetExtenderRequest,
      com.saltoapis.longrunning.v1.Operation> getResetExtenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetExtender",
      requestType = com.saltoapis.nebula.extender.v1.ResetExtenderRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.ResetExtenderRequest,
      com.saltoapis.longrunning.v1.Operation> getResetExtenderMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.ResetExtenderRequest, com.saltoapis.longrunning.v1.Operation> getResetExtenderMethod;
    if ((getResetExtenderMethod = ExtenderServiceGrpc.getResetExtenderMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getResetExtenderMethod = ExtenderServiceGrpc.getResetExtenderMethod) == null) {
          ExtenderServiceGrpc.getResetExtenderMethod = getResetExtenderMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.ResetExtenderRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetExtender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.ResetExtenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("ResetExtender"))
              .build();
        }
      }
    }
    return getResetExtenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateFirmwareDownloadUri",
      requestType = com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest,
      com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation> getGenerateFirmwareDownloadUriMethod;
    if ((getGenerateFirmwareDownloadUriMethod = ExtenderServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
      synchronized (ExtenderServiceGrpc.class) {
        if ((getGenerateFirmwareDownloadUriMethod = ExtenderServiceGrpc.getGenerateFirmwareDownloadUriMethod) == null) {
          ExtenderServiceGrpc.getGenerateFirmwareDownloadUriMethod = getGenerateFirmwareDownloadUriMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateFirmwareDownloadUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ExtenderServiceMethodDescriptorSupplier("GenerateFirmwareDownloadUri"))
              .build();
        }
      }
    }
    return getGenerateFirmwareDownloadUriMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExtenderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtenderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtenderServiceStub>() {
        @java.lang.Override
        public ExtenderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtenderServiceStub(channel, callOptions);
        }
      };
    return ExtenderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExtenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtenderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtenderServiceBlockingStub>() {
        @java.lang.Override
        public ExtenderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtenderServiceBlockingStub(channel, callOptions);
        }
      };
    return ExtenderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExtenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtenderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtenderServiceFutureStub>() {
        @java.lang.Override
        public ExtenderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtenderServiceFutureStub(channel, callOptions);
        }
      };
    return ExtenderServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An extender allows the distance between the a gateway and an electronic lock
   * to be extended. It forwards signals between an access point (lock) and a
   * gateway. This service is responsible for managing extender resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an extender
     * Creates a new extender
     * </pre>
     */
    default void createExtender(com.saltoapis.nebula.extender.v1.CreateExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an extender
     * Gets an existing extender.
     * </pre>
     */
    default void getExtender(com.saltoapis.nebula.extender.v1.GetExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * List extenders
     * Returns a list of extenders that have been previously created.
     * </pre>
     */
    default void listExtenders(com.saltoapis.nebula.extender.v1.ListExtendersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.ListExtendersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExtendersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an extender
     * Updates an existing extender.
     * </pre>
     */
    default void updateExtender(com.saltoapis.nebula.extender.v1.UpdateExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an extender
     * Permanently deletes an extender. This cannot be undone.
     * </pre>
     */
    default void deleteExtender(com.saltoapis.nebula.extender.v1.DeleteExtenderRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bind an extender
     * Binds an extender. Binding an extender assigns a device
     * identifier to the extender.
     * </pre>
     */
    default void bindExtender(com.saltoapis.nebula.extender.v1.BindExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.BindExtenderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unbind an extender
     * Unbinds an extender. Unbinding an extender removes the
     * device identifier from the extender.
     * </pre>
     */
    default void unbindExtender(com.saltoapis.nebula.extender.v1.UnbindExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.UnbindExtenderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update extender firmware
     * Updates an extender's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    default void updateExtenderFirmware(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExtenderFirmwareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset an extender
     * Resetting a device such as an extender means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * </pre>
     */
    default void resetExtender(com.saltoapis.nebula.extender.v1.ResetExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetExtenderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate extender firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * extender. The returned URI can be used to bring the extender firmwares up
     * to latest.
     * </pre>
     */
    default void generateFirmwareDownloadUri(com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateFirmwareDownloadUriMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExtenderService.
   * <pre>
   * An extender allows the distance between the a gateway and an electronic lock
   * to be extended. It forwards signals between an access point (lock) and a
   * gateway. This service is responsible for managing extender resources.
   * </pre>
   */
  public static abstract class ExtenderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExtenderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExtenderService.
   * <pre>
   * An extender allows the distance between the a gateway and an electronic lock
   * to be extended. It forwards signals between an access point (lock) and a
   * gateway. This service is responsible for managing extender resources.
   * </pre>
   */
  public static final class ExtenderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExtenderServiceStub> {
    private ExtenderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtenderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtenderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an extender
     * Creates a new extender
     * </pre>
     */
    public void createExtender(com.saltoapis.nebula.extender.v1.CreateExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an extender
     * Gets an existing extender.
     * </pre>
     */
    public void getExtender(com.saltoapis.nebula.extender.v1.GetExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List extenders
     * Returns a list of extenders that have been previously created.
     * </pre>
     */
    public void listExtenders(com.saltoapis.nebula.extender.v1.ListExtendersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.ListExtendersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExtendersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an extender
     * Updates an existing extender.
     * </pre>
     */
    public void updateExtender(com.saltoapis.nebula.extender.v1.UpdateExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an extender
     * Permanently deletes an extender. This cannot be undone.
     * </pre>
     */
    public void deleteExtender(com.saltoapis.nebula.extender.v1.DeleteExtenderRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bind an extender
     * Binds an extender. Binding an extender assigns a device
     * identifier to the extender.
     * </pre>
     */
    public void bindExtender(com.saltoapis.nebula.extender.v1.BindExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.BindExtenderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unbind an extender
     * Unbinds an extender. Unbinding an extender removes the
     * device identifier from the extender.
     * </pre>
     */
    public void unbindExtender(com.saltoapis.nebula.extender.v1.UnbindExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.UnbindExtenderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update extender firmware
     * Updates an extender's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    public void updateExtenderFirmware(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExtenderFirmwareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset an extender
     * Resetting a device such as an extender means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * </pre>
     */
    public void resetExtender(com.saltoapis.nebula.extender.v1.ResetExtenderRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetExtenderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate extender firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * extender. The returned URI can be used to bring the extender firmwares up
     * to latest.
     * </pre>
     */
    public void generateFirmwareDownloadUri(com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExtenderService.
   * <pre>
   * An extender allows the distance between the a gateway and an electronic lock
   * to be extended. It forwards signals between an access point (lock) and a
   * gateway. This service is responsible for managing extender resources.
   * </pre>
   */
  public static final class ExtenderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExtenderServiceBlockingStub> {
    private ExtenderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtenderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtenderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an extender
     * Creates a new extender
     * </pre>
     */
    public com.saltoapis.nebula.extender.v1.Extender createExtender(com.saltoapis.nebula.extender.v1.CreateExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an extender
     * Gets an existing extender.
     * </pre>
     */
    public com.saltoapis.nebula.extender.v1.Extender getExtender(com.saltoapis.nebula.extender.v1.GetExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List extenders
     * Returns a list of extenders that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.extender.v1.ListExtendersResponse listExtenders(com.saltoapis.nebula.extender.v1.ListExtendersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExtendersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an extender
     * Updates an existing extender.
     * </pre>
     */
    public com.saltoapis.nebula.extender.v1.Extender updateExtender(com.saltoapis.nebula.extender.v1.UpdateExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an extender
     * Permanently deletes an extender. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteExtender(com.saltoapis.nebula.extender.v1.DeleteExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bind an extender
     * Binds an extender. Binding an extender assigns a device
     * identifier to the extender.
     * </pre>
     */
    public com.saltoapis.nebula.extender.v1.BindExtenderResponse bindExtender(com.saltoapis.nebula.extender.v1.BindExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unbind an extender
     * Unbinds an extender. Unbinding an extender removes the
     * device identifier from the extender.
     * </pre>
     */
    public com.saltoapis.nebula.extender.v1.UnbindExtenderResponse unbindExtender(com.saltoapis.nebula.extender.v1.UnbindExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update extender firmware
     * Updates an extender's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation updateExtenderFirmware(com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExtenderFirmwareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset an extender
     * Resetting a device such as an extender means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation resetExtender(com.saltoapis.nebula.extender.v1.ResetExtenderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetExtenderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate extender firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * extender. The returned URI can be used to bring the extender firmwares up
     * to latest.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation generateFirmwareDownloadUri(com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateFirmwareDownloadUriMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExtenderService.
   * <pre>
   * An extender allows the distance between the a gateway and an electronic lock
   * to be extended. It forwards signals between an access point (lock) and a
   * gateway. This service is responsible for managing extender resources.
   * </pre>
   */
  public static final class ExtenderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExtenderServiceFutureStub> {
    private ExtenderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtenderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtenderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an extender
     * Creates a new extender
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.extender.v1.Extender> createExtender(
        com.saltoapis.nebula.extender.v1.CreateExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an extender
     * Gets an existing extender.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.extender.v1.Extender> getExtender(
        com.saltoapis.nebula.extender.v1.GetExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List extenders
     * Returns a list of extenders that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.extender.v1.ListExtendersResponse> listExtenders(
        com.saltoapis.nebula.extender.v1.ListExtendersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExtendersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an extender
     * Updates an existing extender.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.extender.v1.Extender> updateExtender(
        com.saltoapis.nebula.extender.v1.UpdateExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an extender
     * Permanently deletes an extender. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteExtender(
        com.saltoapis.nebula.extender.v1.DeleteExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bind an extender
     * Binds an extender. Binding an extender assigns a device
     * identifier to the extender.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.extender.v1.BindExtenderResponse> bindExtender(
        com.saltoapis.nebula.extender.v1.BindExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unbind an extender
     * Unbinds an extender. Unbinding an extender removes the
     * device identifier from the extender.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.extender.v1.UnbindExtenderResponse> unbindExtender(
        com.saltoapis.nebula.extender.v1.UnbindExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update extender firmware
     * Updates an extender's firmware. SALTO provides firmware updates when
     * new functionality is available or when we fix a bug.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> updateExtenderFirmware(
        com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExtenderFirmwareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset an extender
     * Resetting a device such as an extender means returning it to its
     * factory settings. Resetting is the process of removing the identity as
     * well as all the associated information of an already configured device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> resetExtender(
        com.saltoapis.nebula.extender.v1.ResetExtenderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetExtenderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate extender firmware download URI
     * Provides the download URI for the latest firmware bundle for the
     * extender. The returned URI can be used to bring the extender firmwares up
     * to latest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> generateFirmwareDownloadUri(
        com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateFirmwareDownloadUriMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EXTENDER = 0;
  private static final int METHODID_GET_EXTENDER = 1;
  private static final int METHODID_LIST_EXTENDERS = 2;
  private static final int METHODID_UPDATE_EXTENDER = 3;
  private static final int METHODID_DELETE_EXTENDER = 4;
  private static final int METHODID_BIND_EXTENDER = 5;
  private static final int METHODID_UNBIND_EXTENDER = 6;
  private static final int METHODID_UPDATE_EXTENDER_FIRMWARE = 7;
  private static final int METHODID_RESET_EXTENDER = 8;
  private static final int METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI = 9;

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
        case METHODID_CREATE_EXTENDER:
          serviceImpl.createExtender((com.saltoapis.nebula.extender.v1.CreateExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender>) responseObserver);
          break;
        case METHODID_GET_EXTENDER:
          serviceImpl.getExtender((com.saltoapis.nebula.extender.v1.GetExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender>) responseObserver);
          break;
        case METHODID_LIST_EXTENDERS:
          serviceImpl.listExtenders((com.saltoapis.nebula.extender.v1.ListExtendersRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.ListExtendersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EXTENDER:
          serviceImpl.updateExtender((com.saltoapis.nebula.extender.v1.UpdateExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.Extender>) responseObserver);
          break;
        case METHODID_DELETE_EXTENDER:
          serviceImpl.deleteExtender((com.saltoapis.nebula.extender.v1.DeleteExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BIND_EXTENDER:
          serviceImpl.bindExtender((com.saltoapis.nebula.extender.v1.BindExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.BindExtenderResponse>) responseObserver);
          break;
        case METHODID_UNBIND_EXTENDER:
          serviceImpl.unbindExtender((com.saltoapis.nebula.extender.v1.UnbindExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.extender.v1.UnbindExtenderResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EXTENDER_FIRMWARE:
          serviceImpl.updateExtenderFirmware((com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_RESET_EXTENDER:
          serviceImpl.resetExtender((com.saltoapis.nebula.extender.v1.ResetExtenderRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI:
          serviceImpl.generateFirmwareDownloadUri((com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest) request,
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
          getCreateExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.CreateExtenderRequest,
              com.saltoapis.nebula.extender.v1.Extender>(
                service, METHODID_CREATE_EXTENDER)))
        .addMethod(
          getGetExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.GetExtenderRequest,
              com.saltoapis.nebula.extender.v1.Extender>(
                service, METHODID_GET_EXTENDER)))
        .addMethod(
          getListExtendersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.ListExtendersRequest,
              com.saltoapis.nebula.extender.v1.ListExtendersResponse>(
                service, METHODID_LIST_EXTENDERS)))
        .addMethod(
          getUpdateExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.UpdateExtenderRequest,
              com.saltoapis.nebula.extender.v1.Extender>(
                service, METHODID_UPDATE_EXTENDER)))
        .addMethod(
          getDeleteExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.DeleteExtenderRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EXTENDER)))
        .addMethod(
          getBindExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.BindExtenderRequest,
              com.saltoapis.nebula.extender.v1.BindExtenderResponse>(
                service, METHODID_BIND_EXTENDER)))
        .addMethod(
          getUnbindExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.UnbindExtenderRequest,
              com.saltoapis.nebula.extender.v1.UnbindExtenderResponse>(
                service, METHODID_UNBIND_EXTENDER)))
        .addMethod(
          getUpdateExtenderFirmwareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.UpdateExtenderFirmwareRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_UPDATE_EXTENDER_FIRMWARE)))
        .addMethod(
          getResetExtenderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.ResetExtenderRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_RESET_EXTENDER)))
        .addMethod(
          getGenerateFirmwareDownloadUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.extender.v1.GenerateFirmwareDownloadUriRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_GENERATE_FIRMWARE_DOWNLOAD_URI)))
        .build();
  }

  private static abstract class ExtenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExtenderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.extender.v1.ExtenderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExtenderService");
    }
  }

  private static final class ExtenderServiceFileDescriptorSupplier
      extends ExtenderServiceBaseDescriptorSupplier {
    ExtenderServiceFileDescriptorSupplier() {}
  }

  private static final class ExtenderServiceMethodDescriptorSupplier
      extends ExtenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExtenderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExtenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExtenderServiceFileDescriptorSupplier())
              .addMethod(getCreateExtenderMethod())
              .addMethod(getGetExtenderMethod())
              .addMethod(getListExtendersMethod())
              .addMethod(getUpdateExtenderMethod())
              .addMethod(getDeleteExtenderMethod())
              .addMethod(getBindExtenderMethod())
              .addMethod(getUnbindExtenderMethod())
              .addMethod(getUpdateExtenderFirmwareMethod())
              .addMethod(getResetExtenderMethod())
              .addMethod(getGenerateFirmwareDownloadUriMethod())
              .build();
        }
      }
    }
    return result;
  }
}
