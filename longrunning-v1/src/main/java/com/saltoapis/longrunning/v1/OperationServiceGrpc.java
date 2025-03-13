package com.saltoapis.longrunning.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages long-running operations with an API service.
 * When an API method normally takes long time to complete, it can be designed
 * to return [`Operation`][salto.longrunning.v1.Operation] to the client, and the
 * client can use this interface to receive the real response asynchronously by
 * polling the operation resource, or pass the operation resource to another API
 * to receive the response. Any API service that returns long-running operations
 * should implement the `OperationService` interface so developers can have a
 * consistent client experience.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/longrunning/v1/operation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OperationServiceGrpc {

  private OperationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.longrunning.v1.OperationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.GetOperationRequest,
      com.saltoapis.longrunning.v1.Operation> getGetOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOperation",
      requestType = com.saltoapis.longrunning.v1.GetOperationRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.GetOperationRequest,
      com.saltoapis.longrunning.v1.Operation> getGetOperationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.GetOperationRequest, com.saltoapis.longrunning.v1.Operation> getGetOperationMethod;
    if ((getGetOperationMethod = OperationServiceGrpc.getGetOperationMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getGetOperationMethod = OperationServiceGrpc.getGetOperationMethod) == null) {
          OperationServiceGrpc.getGetOperationMethod = getGetOperationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.longrunning.v1.GetOperationRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.GetOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("GetOperation"))
              .build();
        }
      }
    }
    return getGetOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.ListOperationsRequest,
      com.saltoapis.longrunning.v1.ListOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = com.saltoapis.longrunning.v1.ListOperationsRequest.class,
      responseType = com.saltoapis.longrunning.v1.ListOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.ListOperationsRequest,
      com.saltoapis.longrunning.v1.ListOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.ListOperationsRequest, com.saltoapis.longrunning.v1.ListOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = OperationServiceGrpc.getListOperationsMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getListOperationsMethod = OperationServiceGrpc.getListOperationsMethod) == null) {
          OperationServiceGrpc.getListOperationsMethod = getListOperationsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.longrunning.v1.ListOperationsRequest, com.saltoapis.longrunning.v1.ListOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.ListOperationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("ListOperations"))
              .build();
        }
      }
    }
    return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.DeleteOperationRequest,
      com.google.protobuf.Empty> getDeleteOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOperation",
      requestType = com.saltoapis.longrunning.v1.DeleteOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.DeleteOperationRequest,
      com.google.protobuf.Empty> getDeleteOperationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.DeleteOperationRequest, com.google.protobuf.Empty> getDeleteOperationMethod;
    if ((getDeleteOperationMethod = OperationServiceGrpc.getDeleteOperationMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getDeleteOperationMethod = OperationServiceGrpc.getDeleteOperationMethod) == null) {
          OperationServiceGrpc.getDeleteOperationMethod = getDeleteOperationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.longrunning.v1.DeleteOperationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.DeleteOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("DeleteOperation"))
              .build();
        }
      }
    }
    return getDeleteOperationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.CancelOperationRequest,
      com.google.protobuf.Empty> getCancelOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOperation",
      requestType = com.saltoapis.longrunning.v1.CancelOperationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.CancelOperationRequest,
      com.google.protobuf.Empty> getCancelOperationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.longrunning.v1.CancelOperationRequest, com.google.protobuf.Empty> getCancelOperationMethod;
    if ((getCancelOperationMethod = OperationServiceGrpc.getCancelOperationMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getCancelOperationMethod = OperationServiceGrpc.getCancelOperationMethod) == null) {
          OperationServiceGrpc.getCancelOperationMethod = getCancelOperationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.longrunning.v1.CancelOperationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("CancelOperation"))
              .build();
        }
      }
    }
    return getCancelOperationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceStub>() {
        @java.lang.Override
        public OperationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceStub(channel, callOptions);
        }
      };
    return OperationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceBlockingStub>() {
        @java.lang.Override
        public OperationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceBlockingStub(channel, callOptions);
        }
      };
    return OperationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceFutureStub>() {
        @java.lang.Override
        public OperationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceFutureStub(channel, callOptions);
        }
      };
    return OperationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed
   * to return [`Operation`][salto.longrunning.v1.Operation] to the client, and the
   * client can use this interface to receive the real response asynchronously by
   * polling the operation resource, or pass the operation resource to another API
   * to receive the response. Any API service that returns long-running operations
   * should implement the `OperationService` interface so developers can have a
   * consistent client experience.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get a operation
     * Retrieves an existing long-running operation.
     * </pre>
     */
    default void getOperation(com.saltoapis.longrunning.v1.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List operations
     * Returns a list of long-running operations that have been previously created.
     * </pre>
     */
    default void listOperations(com.saltoapis.longrunning.v1.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an operation
     * Permanently deletes a long-running operation. This cannot be undone.
     * </pre>
     */
    default void deleteOperation(com.saltoapis.longrunning.v1.DeleteOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOperationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an operation
     * Starts asynchronous cancellation on a long-running operation. The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed. Clients can use
     * [OperationService.GetOperation][salto.longrunning.v1.OperationService.GetOperation]
     * or other methods to check whether the cancellation succeeded or whether
     * the operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with an
     * [Operation.error][salto.longrunning.v1.Operation.error] value with a
     * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
     * `Code.CANCELLED`.
     * </pre>
     */
    default void cancelOperation(com.saltoapis.longrunning.v1.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOperationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OperationService.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed
   * to return [`Operation`][salto.longrunning.v1.Operation] to the client, and the
   * client can use this interface to receive the real response asynchronously by
   * polling the operation resource, or pass the operation resource to another API
   * to receive the response. Any API service that returns long-running operations
   * should implement the `OperationService` interface so developers can have a
   * consistent client experience.
   * </pre>
   */
  public static abstract class OperationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OperationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OperationService.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed
   * to return [`Operation`][salto.longrunning.v1.Operation] to the client, and the
   * client can use this interface to receive the real response asynchronously by
   * polling the operation resource, or pass the operation resource to another API
   * to receive the response. Any API service that returns long-running operations
   * should implement the `OperationService` interface so developers can have a
   * consistent client experience.
   * </pre>
   */
  public static final class OperationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OperationServiceStub> {
    private OperationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a operation
     * Retrieves an existing long-running operation.
     * </pre>
     */
    public void getOperation(com.saltoapis.longrunning.v1.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List operations
     * Returns a list of long-running operations that have been previously created.
     * </pre>
     */
    public void listOperations(com.saltoapis.longrunning.v1.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.ListOperationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an operation
     * Permanently deletes a long-running operation. This cannot be undone.
     * </pre>
     */
    public void deleteOperation(com.saltoapis.longrunning.v1.DeleteOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOperationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an operation
     * Starts asynchronous cancellation on a long-running operation. The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed. Clients can use
     * [OperationService.GetOperation][salto.longrunning.v1.OperationService.GetOperation]
     * or other methods to check whether the cancellation succeeded or whether
     * the operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with an
     * [Operation.error][salto.longrunning.v1.Operation.error] value with a
     * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
     * `Code.CANCELLED`.
     * </pre>
     */
    public void cancelOperation(com.saltoapis.longrunning.v1.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OperationService.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed
   * to return [`Operation`][salto.longrunning.v1.Operation] to the client, and the
   * client can use this interface to receive the real response asynchronously by
   * polling the operation resource, or pass the operation resource to another API
   * to receive the response. Any API service that returns long-running operations
   * should implement the `OperationService` interface so developers can have a
   * consistent client experience.
   * </pre>
   */
  public static final class OperationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OperationServiceBlockingStub> {
    private OperationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a operation
     * Retrieves an existing long-running operation.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation getOperation(com.saltoapis.longrunning.v1.GetOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List operations
     * Returns a list of long-running operations that have been previously created.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.ListOperationsResponse listOperations(com.saltoapis.longrunning.v1.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an operation
     * Permanently deletes a long-running operation. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteOperation(com.saltoapis.longrunning.v1.DeleteOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOperationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an operation
     * Starts asynchronous cancellation on a long-running operation. The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed. Clients can use
     * [OperationService.GetOperation][salto.longrunning.v1.OperationService.GetOperation]
     * or other methods to check whether the cancellation succeeded or whether
     * the operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with an
     * [Operation.error][salto.longrunning.v1.Operation.error] value with a
     * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
     * `Code.CANCELLED`.
     * </pre>
     */
    public com.google.protobuf.Empty cancelOperation(com.saltoapis.longrunning.v1.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOperationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OperationService.
   * <pre>
   * Manages long-running operations with an API service.
   * When an API method normally takes long time to complete, it can be designed
   * to return [`Operation`][salto.longrunning.v1.Operation] to the client, and the
   * client can use this interface to receive the real response asynchronously by
   * polling the operation resource, or pass the operation resource to another API
   * to receive the response. Any API service that returns long-running operations
   * should implement the `OperationService` interface so developers can have a
   * consistent client experience.
   * </pre>
   */
  public static final class OperationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OperationServiceFutureStub> {
    private OperationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a operation
     * Retrieves an existing long-running operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> getOperation(
        com.saltoapis.longrunning.v1.GetOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List operations
     * Returns a list of long-running operations that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.ListOperationsResponse> listOperations(
        com.saltoapis.longrunning.v1.ListOperationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an operation
     * Permanently deletes a long-running operation. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOperation(
        com.saltoapis.longrunning.v1.DeleteOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOperationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an operation
     * Starts asynchronous cancellation on a long-running operation. The server
     * makes a best effort to cancel the operation, but success is not
     * guaranteed. Clients can use
     * [OperationService.GetOperation][salto.longrunning.v1.OperationService.GetOperation]
     * or other methods to check whether the cancellation succeeded or whether
     * the operation completed despite cancellation. On successful cancellation,
     * the operation is not deleted; instead, it becomes an operation with an
     * [Operation.error][salto.longrunning.v1.Operation.error] value with a
     * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
     * `Code.CANCELLED`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelOperation(
        com.saltoapis.longrunning.v1.CancelOperationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOperationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OPERATION = 0;
  private static final int METHODID_LIST_OPERATIONS = 1;
  private static final int METHODID_DELETE_OPERATION = 2;
  private static final int METHODID_CANCEL_OPERATION = 3;

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
        case METHODID_GET_OPERATION:
          serviceImpl.getOperation((com.saltoapis.longrunning.v1.GetOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((com.saltoapis.longrunning.v1.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.ListOperationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_OPERATION:
          serviceImpl.deleteOperation((com.saltoapis.longrunning.v1.DeleteOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation((com.saltoapis.longrunning.v1.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getGetOperationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.longrunning.v1.GetOperationRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_GET_OPERATION)))
        .addMethod(
          getListOperationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.longrunning.v1.ListOperationsRequest,
              com.saltoapis.longrunning.v1.ListOperationsResponse>(
                service, METHODID_LIST_OPERATIONS)))
        .addMethod(
          getDeleteOperationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.longrunning.v1.DeleteOperationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_OPERATION)))
        .addMethod(
          getCancelOperationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.longrunning.v1.CancelOperationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_OPERATION)))
        .build();
  }

  private static abstract class OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.longrunning.v1.OperationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperationService");
    }
  }

  private static final class OperationServiceFileDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier {
    OperationServiceFileDescriptorSupplier() {}
  }

  private static final class OperationServiceMethodDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OperationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OperationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationServiceFileDescriptorSupplier())
              .addMethod(getGetOperationMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getDeleteOperationMethod())
              .addMethod(getCancelOperationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
