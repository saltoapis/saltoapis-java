package com.saltoapis.nebula.destination.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DestinationService is the service responsible for managing destination resources.
 * Destinations refer to feature where a controller with multiple relays can activate
 * different outputs based on keys and schedules. The primary use case is elevator control,
 * where presenting a credential at a reader would activate only the buttons for floors
 * the user has access to.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/destination/v1/destination.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DestinationServiceGrpc {

  private DestinationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.destination.v1.DestinationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.CreateDestinationRequest,
      com.saltoapis.nebula.destination.v1.Destination> getCreateDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDestination",
      requestType = com.saltoapis.nebula.destination.v1.CreateDestinationRequest.class,
      responseType = com.saltoapis.nebula.destination.v1.Destination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.CreateDestinationRequest,
      com.saltoapis.nebula.destination.v1.Destination> getCreateDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.CreateDestinationRequest, com.saltoapis.nebula.destination.v1.Destination> getCreateDestinationMethod;
    if ((getCreateDestinationMethod = DestinationServiceGrpc.getCreateDestinationMethod) == null) {
      synchronized (DestinationServiceGrpc.class) {
        if ((getCreateDestinationMethod = DestinationServiceGrpc.getCreateDestinationMethod) == null) {
          DestinationServiceGrpc.getCreateDestinationMethod = getCreateDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.destination.v1.CreateDestinationRequest, com.saltoapis.nebula.destination.v1.Destination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.CreateDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.Destination.getDefaultInstance()))
              .setSchemaDescriptor(new DestinationServiceMethodDescriptorSupplier("CreateDestination"))
              .build();
        }
      }
    }
    return getCreateDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.GetDestinationRequest,
      com.saltoapis.nebula.destination.v1.Destination> getGetDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDestination",
      requestType = com.saltoapis.nebula.destination.v1.GetDestinationRequest.class,
      responseType = com.saltoapis.nebula.destination.v1.Destination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.GetDestinationRequest,
      com.saltoapis.nebula.destination.v1.Destination> getGetDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.GetDestinationRequest, com.saltoapis.nebula.destination.v1.Destination> getGetDestinationMethod;
    if ((getGetDestinationMethod = DestinationServiceGrpc.getGetDestinationMethod) == null) {
      synchronized (DestinationServiceGrpc.class) {
        if ((getGetDestinationMethod = DestinationServiceGrpc.getGetDestinationMethod) == null) {
          DestinationServiceGrpc.getGetDestinationMethod = getGetDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.destination.v1.GetDestinationRequest, com.saltoapis.nebula.destination.v1.Destination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.GetDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.Destination.getDefaultInstance()))
              .setSchemaDescriptor(new DestinationServiceMethodDescriptorSupplier("GetDestination"))
              .build();
        }
      }
    }
    return getGetDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest,
      com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse> getBatchGetDestinationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetDestinations",
      requestType = com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest.class,
      responseType = com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest,
      com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse> getBatchGetDestinationsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest, com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse> getBatchGetDestinationsMethod;
    if ((getBatchGetDestinationsMethod = DestinationServiceGrpc.getBatchGetDestinationsMethod) == null) {
      synchronized (DestinationServiceGrpc.class) {
        if ((getBatchGetDestinationsMethod = DestinationServiceGrpc.getBatchGetDestinationsMethod) == null) {
          DestinationServiceGrpc.getBatchGetDestinationsMethod = getBatchGetDestinationsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest, com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetDestinations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DestinationServiceMethodDescriptorSupplier("BatchGetDestinations"))
              .build();
        }
      }
    }
    return getBatchGetDestinationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.UpdateDestinationRequest,
      com.saltoapis.nebula.destination.v1.Destination> getUpdateDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDestination",
      requestType = com.saltoapis.nebula.destination.v1.UpdateDestinationRequest.class,
      responseType = com.saltoapis.nebula.destination.v1.Destination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.UpdateDestinationRequest,
      com.saltoapis.nebula.destination.v1.Destination> getUpdateDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.UpdateDestinationRequest, com.saltoapis.nebula.destination.v1.Destination> getUpdateDestinationMethod;
    if ((getUpdateDestinationMethod = DestinationServiceGrpc.getUpdateDestinationMethod) == null) {
      synchronized (DestinationServiceGrpc.class) {
        if ((getUpdateDestinationMethod = DestinationServiceGrpc.getUpdateDestinationMethod) == null) {
          DestinationServiceGrpc.getUpdateDestinationMethod = getUpdateDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.destination.v1.UpdateDestinationRequest, com.saltoapis.nebula.destination.v1.Destination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.UpdateDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.Destination.getDefaultInstance()))
              .setSchemaDescriptor(new DestinationServiceMethodDescriptorSupplier("UpdateDestination"))
              .build();
        }
      }
    }
    return getUpdateDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.ListDestinationsRequest,
      com.saltoapis.nebula.destination.v1.ListDestinationsResponse> getListDestinationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDestinations",
      requestType = com.saltoapis.nebula.destination.v1.ListDestinationsRequest.class,
      responseType = com.saltoapis.nebula.destination.v1.ListDestinationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.ListDestinationsRequest,
      com.saltoapis.nebula.destination.v1.ListDestinationsResponse> getListDestinationsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.ListDestinationsRequest, com.saltoapis.nebula.destination.v1.ListDestinationsResponse> getListDestinationsMethod;
    if ((getListDestinationsMethod = DestinationServiceGrpc.getListDestinationsMethod) == null) {
      synchronized (DestinationServiceGrpc.class) {
        if ((getListDestinationsMethod = DestinationServiceGrpc.getListDestinationsMethod) == null) {
          DestinationServiceGrpc.getListDestinationsMethod = getListDestinationsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.destination.v1.ListDestinationsRequest, com.saltoapis.nebula.destination.v1.ListDestinationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDestinations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.ListDestinationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.ListDestinationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DestinationServiceMethodDescriptorSupplier("ListDestinations"))
              .build();
        }
      }
    }
    return getListDestinationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.DeleteDestinationRequest,
      com.google.protobuf.Empty> getDeleteDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDestination",
      requestType = com.saltoapis.nebula.destination.v1.DeleteDestinationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.DeleteDestinationRequest,
      com.google.protobuf.Empty> getDeleteDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.destination.v1.DeleteDestinationRequest, com.google.protobuf.Empty> getDeleteDestinationMethod;
    if ((getDeleteDestinationMethod = DestinationServiceGrpc.getDeleteDestinationMethod) == null) {
      synchronized (DestinationServiceGrpc.class) {
        if ((getDeleteDestinationMethod = DestinationServiceGrpc.getDeleteDestinationMethod) == null) {
          DestinationServiceGrpc.getDeleteDestinationMethod = getDeleteDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.destination.v1.DeleteDestinationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.destination.v1.DeleteDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DestinationServiceMethodDescriptorSupplier("DeleteDestination"))
              .build();
        }
      }
    }
    return getDeleteDestinationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DestinationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DestinationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DestinationServiceStub>() {
        @java.lang.Override
        public DestinationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DestinationServiceStub(channel, callOptions);
        }
      };
    return DestinationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DestinationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DestinationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DestinationServiceBlockingStub>() {
        @java.lang.Override
        public DestinationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DestinationServiceBlockingStub(channel, callOptions);
        }
      };
    return DestinationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DestinationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DestinationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DestinationServiceFutureStub>() {
        @java.lang.Override
        public DestinationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DestinationServiceFutureStub(channel, callOptions);
        }
      };
    return DestinationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DestinationService is the service responsible for managing destination resources.
   * Destinations refer to feature where a controller with multiple relays can activate
   * different outputs based on keys and schedules. The primary use case is elevator control,
   * where presenting a credential at a reader would activate only the buttons for floors
   * the user has access to.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a destination
     * Creates a new destination.
     * </pre>
     */
    default void createDestination(com.saltoapis.nebula.destination.v1.CreateDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDestinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an existing destination
     * Retrieves an existing destination.
     * </pre>
     */
    default void getDestination(com.saltoapis.nebula.destination.v1.GetDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDestinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a batch of destinations
     * Retrieves a batch of existing destinations.
     * </pre>
     */
    default void batchGetDestinations(com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetDestinationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing destination
     * Updates an existing destination.
     * </pre>
     */
    default void updateDestination(com.saltoapis.nebula.destination.v1.UpdateDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDestinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List destinations
     * Returns a list of destinations that have been previously created.
     * </pre>
     */
    default void listDestinations(com.saltoapis.nebula.destination.v1.ListDestinationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.ListDestinationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDestinationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a destination
     * Permanently deletes a destination. This cannot be undone.
     * </pre>
     */
    default void deleteDestination(com.saltoapis.nebula.destination.v1.DeleteDestinationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDestinationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DestinationService.
   * <pre>
   * DestinationService is the service responsible for managing destination resources.
   * Destinations refer to feature where a controller with multiple relays can activate
   * different outputs based on keys and schedules. The primary use case is elevator control,
   * where presenting a credential at a reader would activate only the buttons for floors
   * the user has access to.
   * </pre>
   */
  public static abstract class DestinationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DestinationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DestinationService.
   * <pre>
   * DestinationService is the service responsible for managing destination resources.
   * Destinations refer to feature where a controller with multiple relays can activate
   * different outputs based on keys and schedules. The primary use case is elevator control,
   * where presenting a credential at a reader would activate only the buttons for floors
   * the user has access to.
   * </pre>
   */
  public static final class DestinationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DestinationServiceStub> {
    private DestinationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DestinationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DestinationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a destination
     * Creates a new destination.
     * </pre>
     */
    public void createDestination(com.saltoapis.nebula.destination.v1.CreateDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an existing destination
     * Retrieves an existing destination.
     * </pre>
     */
    public void getDestination(com.saltoapis.nebula.destination.v1.GetDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a batch of destinations
     * Retrieves a batch of existing destinations.
     * </pre>
     */
    public void batchGetDestinations(com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetDestinationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing destination
     * Updates an existing destination.
     * </pre>
     */
    public void updateDestination(com.saltoapis.nebula.destination.v1.UpdateDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List destinations
     * Returns a list of destinations that have been previously created.
     * </pre>
     */
    public void listDestinations(com.saltoapis.nebula.destination.v1.ListDestinationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.ListDestinationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDestinationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a destination
     * Permanently deletes a destination. This cannot be undone.
     * </pre>
     */
    public void deleteDestination(com.saltoapis.nebula.destination.v1.DeleteDestinationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDestinationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DestinationService.
   * <pre>
   * DestinationService is the service responsible for managing destination resources.
   * Destinations refer to feature where a controller with multiple relays can activate
   * different outputs based on keys and schedules. The primary use case is elevator control,
   * where presenting a credential at a reader would activate only the buttons for floors
   * the user has access to.
   * </pre>
   */
  public static final class DestinationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DestinationServiceBlockingStub> {
    private DestinationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DestinationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DestinationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a destination
     * Creates a new destination.
     * </pre>
     */
    public com.saltoapis.nebula.destination.v1.Destination createDestination(com.saltoapis.nebula.destination.v1.CreateDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDestinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an existing destination
     * Retrieves an existing destination.
     * </pre>
     */
    public com.saltoapis.nebula.destination.v1.Destination getDestination(com.saltoapis.nebula.destination.v1.GetDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDestinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a batch of destinations
     * Retrieves a batch of existing destinations.
     * </pre>
     */
    public com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse batchGetDestinations(com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetDestinationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing destination
     * Updates an existing destination.
     * </pre>
     */
    public com.saltoapis.nebula.destination.v1.Destination updateDestination(com.saltoapis.nebula.destination.v1.UpdateDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDestinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List destinations
     * Returns a list of destinations that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.destination.v1.ListDestinationsResponse listDestinations(com.saltoapis.nebula.destination.v1.ListDestinationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDestinationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a destination
     * Permanently deletes a destination. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDestination(com.saltoapis.nebula.destination.v1.DeleteDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDestinationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DestinationService.
   * <pre>
   * DestinationService is the service responsible for managing destination resources.
   * Destinations refer to feature where a controller with multiple relays can activate
   * different outputs based on keys and schedules. The primary use case is elevator control,
   * where presenting a credential at a reader would activate only the buttons for floors
   * the user has access to.
   * </pre>
   */
  public static final class DestinationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DestinationServiceFutureStub> {
    private DestinationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DestinationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DestinationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a destination
     * Creates a new destination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.destination.v1.Destination> createDestination(
        com.saltoapis.nebula.destination.v1.CreateDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDestinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an existing destination
     * Retrieves an existing destination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.destination.v1.Destination> getDestination(
        com.saltoapis.nebula.destination.v1.GetDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDestinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a batch of destinations
     * Retrieves a batch of existing destinations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse> batchGetDestinations(
        com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetDestinationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing destination
     * Updates an existing destination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.destination.v1.Destination> updateDestination(
        com.saltoapis.nebula.destination.v1.UpdateDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDestinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List destinations
     * Returns a list of destinations that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.destination.v1.ListDestinationsResponse> listDestinations(
        com.saltoapis.nebula.destination.v1.ListDestinationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDestinationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a destination
     * Permanently deletes a destination. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDestination(
        com.saltoapis.nebula.destination.v1.DeleteDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDestinationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DESTINATION = 0;
  private static final int METHODID_GET_DESTINATION = 1;
  private static final int METHODID_BATCH_GET_DESTINATIONS = 2;
  private static final int METHODID_UPDATE_DESTINATION = 3;
  private static final int METHODID_LIST_DESTINATIONS = 4;
  private static final int METHODID_DELETE_DESTINATION = 5;

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
        case METHODID_CREATE_DESTINATION:
          serviceImpl.createDestination((com.saltoapis.nebula.destination.v1.CreateDestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination>) responseObserver);
          break;
        case METHODID_GET_DESTINATION:
          serviceImpl.getDestination((com.saltoapis.nebula.destination.v1.GetDestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination>) responseObserver);
          break;
        case METHODID_BATCH_GET_DESTINATIONS:
          serviceImpl.batchGetDestinations((com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DESTINATION:
          serviceImpl.updateDestination((com.saltoapis.nebula.destination.v1.UpdateDestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.Destination>) responseObserver);
          break;
        case METHODID_LIST_DESTINATIONS:
          serviceImpl.listDestinations((com.saltoapis.nebula.destination.v1.ListDestinationsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.destination.v1.ListDestinationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DESTINATION:
          serviceImpl.deleteDestination((com.saltoapis.nebula.destination.v1.DeleteDestinationRequest) request,
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
          getCreateDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.destination.v1.CreateDestinationRequest,
              com.saltoapis.nebula.destination.v1.Destination>(
                service, METHODID_CREATE_DESTINATION)))
        .addMethod(
          getGetDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.destination.v1.GetDestinationRequest,
              com.saltoapis.nebula.destination.v1.Destination>(
                service, METHODID_GET_DESTINATION)))
        .addMethod(
          getBatchGetDestinationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.destination.v1.BatchGetDestinationsRequest,
              com.saltoapis.nebula.destination.v1.BatchGetDestinationsResponse>(
                service, METHODID_BATCH_GET_DESTINATIONS)))
        .addMethod(
          getUpdateDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.destination.v1.UpdateDestinationRequest,
              com.saltoapis.nebula.destination.v1.Destination>(
                service, METHODID_UPDATE_DESTINATION)))
        .addMethod(
          getListDestinationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.destination.v1.ListDestinationsRequest,
              com.saltoapis.nebula.destination.v1.ListDestinationsResponse>(
                service, METHODID_LIST_DESTINATIONS)))
        .addMethod(
          getDeleteDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.destination.v1.DeleteDestinationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DESTINATION)))
        .build();
  }

  private static abstract class DestinationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DestinationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.destination.v1.DestinationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DestinationService");
    }
  }

  private static final class DestinationServiceFileDescriptorSupplier
      extends DestinationServiceBaseDescriptorSupplier {
    DestinationServiceFileDescriptorSupplier() {}
  }

  private static final class DestinationServiceMethodDescriptorSupplier
      extends DestinationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DestinationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DestinationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DestinationServiceFileDescriptorSupplier())
              .addMethod(getCreateDestinationMethod())
              .addMethod(getGetDestinationMethod())
              .addMethod(getBatchGetDestinationsMethod())
              .addMethod(getUpdateDestinationMethod())
              .addMethod(getListDestinationsMethod())
              .addMethod(getDeleteDestinationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
