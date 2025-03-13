package com.salto.nebula.emergencykey.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Emergency keys are a credential type in Nebula, based on allowlisting,
 * that grant access to designated access points within an installation.
 * They do not expire and do not require any form of revalidation.
 * This service is responsible for managing Emergency Key resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/emergencykey/v1/emergency_key.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmergencyKeyServiceGrpc {

  private EmergencyKeyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.emergencykey.v1.EmergencyKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest,
      com.salto.nebula.emergencykey.v1.EmergencyKey> getCreateEmergencyKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmergencyKey",
      requestType = com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest.class,
      responseType = com.salto.nebula.emergencykey.v1.EmergencyKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest,
      com.salto.nebula.emergencykey.v1.EmergencyKey> getCreateEmergencyKeyMethod() {
    io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest, com.salto.nebula.emergencykey.v1.EmergencyKey> getCreateEmergencyKeyMethod;
    if ((getCreateEmergencyKeyMethod = EmergencyKeyServiceGrpc.getCreateEmergencyKeyMethod) == null) {
      synchronized (EmergencyKeyServiceGrpc.class) {
        if ((getCreateEmergencyKeyMethod = EmergencyKeyServiceGrpc.getCreateEmergencyKeyMethod) == null) {
          EmergencyKeyServiceGrpc.getCreateEmergencyKeyMethod = getCreateEmergencyKeyMethod =
              io.grpc.MethodDescriptor.<com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest, com.salto.nebula.emergencykey.v1.EmergencyKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmergencyKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyKeyServiceMethodDescriptorSupplier("CreateEmergencyKey"))
              .build();
        }
      }
    }
    return getCreateEmergencyKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest,
      com.salto.nebula.emergencykey.v1.EmergencyKey> getGetEmergencyKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmergencyKey",
      requestType = com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest.class,
      responseType = com.salto.nebula.emergencykey.v1.EmergencyKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest,
      com.salto.nebula.emergencykey.v1.EmergencyKey> getGetEmergencyKeyMethod() {
    io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest, com.salto.nebula.emergencykey.v1.EmergencyKey> getGetEmergencyKeyMethod;
    if ((getGetEmergencyKeyMethod = EmergencyKeyServiceGrpc.getGetEmergencyKeyMethod) == null) {
      synchronized (EmergencyKeyServiceGrpc.class) {
        if ((getGetEmergencyKeyMethod = EmergencyKeyServiceGrpc.getGetEmergencyKeyMethod) == null) {
          EmergencyKeyServiceGrpc.getGetEmergencyKeyMethod = getGetEmergencyKeyMethod =
              io.grpc.MethodDescriptor.<com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest, com.salto.nebula.emergencykey.v1.EmergencyKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmergencyKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyKeyServiceMethodDescriptorSupplier("GetEmergencyKey"))
              .build();
        }
      }
    }
    return getGetEmergencyKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest,
      com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse> getListEmergencyKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEmergencyKeys",
      requestType = com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest.class,
      responseType = com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest,
      com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse> getListEmergencyKeysMethod() {
    io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest, com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse> getListEmergencyKeysMethod;
    if ((getListEmergencyKeysMethod = EmergencyKeyServiceGrpc.getListEmergencyKeysMethod) == null) {
      synchronized (EmergencyKeyServiceGrpc.class) {
        if ((getListEmergencyKeysMethod = EmergencyKeyServiceGrpc.getListEmergencyKeysMethod) == null) {
          EmergencyKeyServiceGrpc.getListEmergencyKeysMethod = getListEmergencyKeysMethod =
              io.grpc.MethodDescriptor.<com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest, com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEmergencyKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyKeyServiceMethodDescriptorSupplier("ListEmergencyKeys"))
              .build();
        }
      }
    }
    return getListEmergencyKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest,
      com.salto.nebula.emergencykey.v1.EmergencyKey> getUpdateEmergencyKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmergencyKey",
      requestType = com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest.class,
      responseType = com.salto.nebula.emergencykey.v1.EmergencyKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest,
      com.salto.nebula.emergencykey.v1.EmergencyKey> getUpdateEmergencyKeyMethod() {
    io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest, com.salto.nebula.emergencykey.v1.EmergencyKey> getUpdateEmergencyKeyMethod;
    if ((getUpdateEmergencyKeyMethod = EmergencyKeyServiceGrpc.getUpdateEmergencyKeyMethod) == null) {
      synchronized (EmergencyKeyServiceGrpc.class) {
        if ((getUpdateEmergencyKeyMethod = EmergencyKeyServiceGrpc.getUpdateEmergencyKeyMethod) == null) {
          EmergencyKeyServiceGrpc.getUpdateEmergencyKeyMethod = getUpdateEmergencyKeyMethod =
              io.grpc.MethodDescriptor.<com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest, com.salto.nebula.emergencykey.v1.EmergencyKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmergencyKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.EmergencyKey.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyKeyServiceMethodDescriptorSupplier("UpdateEmergencyKey"))
              .build();
        }
      }
    }
    return getUpdateEmergencyKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest,
      com.google.protobuf.Empty> getDeleteEmergencyKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmergencyKey",
      requestType = com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest,
      com.google.protobuf.Empty> getDeleteEmergencyKeyMethod() {
    io.grpc.MethodDescriptor<com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest, com.google.protobuf.Empty> getDeleteEmergencyKeyMethod;
    if ((getDeleteEmergencyKeyMethod = EmergencyKeyServiceGrpc.getDeleteEmergencyKeyMethod) == null) {
      synchronized (EmergencyKeyServiceGrpc.class) {
        if ((getDeleteEmergencyKeyMethod = EmergencyKeyServiceGrpc.getDeleteEmergencyKeyMethod) == null) {
          EmergencyKeyServiceGrpc.getDeleteEmergencyKeyMethod = getDeleteEmergencyKeyMethod =
              io.grpc.MethodDescriptor.<com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmergencyKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmergencyKeyServiceMethodDescriptorSupplier("DeleteEmergencyKey"))
              .build();
        }
      }
    }
    return getDeleteEmergencyKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyKeyServiceStub>() {
        @java.lang.Override
        public EmergencyKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyKeyServiceStub(channel, callOptions);
        }
      };
    return EmergencyKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyKeyServiceBlockingStub>() {
        @java.lang.Override
        public EmergencyKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return EmergencyKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmergencyKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmergencyKeyServiceFutureStub>() {
        @java.lang.Override
        public EmergencyKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmergencyKeyServiceFutureStub(channel, callOptions);
        }
      };
    return EmergencyKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Emergency keys are a credential type in Nebula, based on allowlisting,
   * that grant access to designated access points within an installation.
   * They do not expire and do not require any form of revalidation.
   * This service is responsible for managing Emergency Key resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an emergency key
     * Creates a new emergency key.
     * </pre>
     */
    default void createEmergencyKey(com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmergencyKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an emergency key
     * Retrieves an existing emergency key.
     * </pre>
     */
    default void getEmergencyKey(com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmergencyKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List emergency keys
     * Returns a list of emergency keys that have been previously created.
     * </pre>
     */
    default void listEmergencyKeys(com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEmergencyKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an emergency key
     * Updates an existing emergency key.
     * </pre>
     */
    default void updateEmergencyKey(com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmergencyKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an emergency key
     * Deletes an existing emergency key.
     * </pre>
     */
    default void deleteEmergencyKey(com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmergencyKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmergencyKeyService.
   * <pre>
   * Emergency keys are a credential type in Nebula, based on allowlisting,
   * that grant access to designated access points within an installation.
   * They do not expire and do not require any form of revalidation.
   * This service is responsible for managing Emergency Key resources.
   * </pre>
   */
  public static abstract class EmergencyKeyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmergencyKeyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmergencyKeyService.
   * <pre>
   * Emergency keys are a credential type in Nebula, based on allowlisting,
   * that grant access to designated access points within an installation.
   * They do not expire and do not require any form of revalidation.
   * This service is responsible for managing Emergency Key resources.
   * </pre>
   */
  public static final class EmergencyKeyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmergencyKeyServiceStub> {
    private EmergencyKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an emergency key
     * Creates a new emergency key.
     * </pre>
     */
    public void createEmergencyKey(com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmergencyKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an emergency key
     * Retrieves an existing emergency key.
     * </pre>
     */
    public void getEmergencyKey(com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmergencyKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List emergency keys
     * Returns a list of emergency keys that have been previously created.
     * </pre>
     */
    public void listEmergencyKeys(com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEmergencyKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an emergency key
     * Updates an existing emergency key.
     * </pre>
     */
    public void updateEmergencyKey(com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmergencyKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an emergency key
     * Deletes an existing emergency key.
     * </pre>
     */
    public void deleteEmergencyKey(com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmergencyKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmergencyKeyService.
   * <pre>
   * Emergency keys are a credential type in Nebula, based on allowlisting,
   * that grant access to designated access points within an installation.
   * They do not expire and do not require any form of revalidation.
   * This service is responsible for managing Emergency Key resources.
   * </pre>
   */
  public static final class EmergencyKeyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmergencyKeyServiceBlockingStub> {
    private EmergencyKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an emergency key
     * Creates a new emergency key.
     * </pre>
     */
    public com.salto.nebula.emergencykey.v1.EmergencyKey createEmergencyKey(com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmergencyKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an emergency key
     * Retrieves an existing emergency key.
     * </pre>
     */
    public com.salto.nebula.emergencykey.v1.EmergencyKey getEmergencyKey(com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmergencyKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List emergency keys
     * Returns a list of emergency keys that have been previously created.
     * </pre>
     */
    public com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse listEmergencyKeys(com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEmergencyKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an emergency key
     * Updates an existing emergency key.
     * </pre>
     */
    public com.salto.nebula.emergencykey.v1.EmergencyKey updateEmergencyKey(com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmergencyKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an emergency key
     * Deletes an existing emergency key.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEmergencyKey(com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmergencyKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmergencyKeyService.
   * <pre>
   * Emergency keys are a credential type in Nebula, based on allowlisting,
   * that grant access to designated access points within an installation.
   * They do not expire and do not require any form of revalidation.
   * This service is responsible for managing Emergency Key resources.
   * </pre>
   */
  public static final class EmergencyKeyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmergencyKeyServiceFutureStub> {
    private EmergencyKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmergencyKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an emergency key
     * Creates a new emergency key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.salto.nebula.emergencykey.v1.EmergencyKey> createEmergencyKey(
        com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmergencyKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an emergency key
     * Retrieves an existing emergency key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.salto.nebula.emergencykey.v1.EmergencyKey> getEmergencyKey(
        com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmergencyKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List emergency keys
     * Returns a list of emergency keys that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse> listEmergencyKeys(
        com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEmergencyKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an emergency key
     * Updates an existing emergency key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.salto.nebula.emergencykey.v1.EmergencyKey> updateEmergencyKey(
        com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmergencyKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an emergency key
     * Deletes an existing emergency key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEmergencyKey(
        com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmergencyKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EMERGENCY_KEY = 0;
  private static final int METHODID_GET_EMERGENCY_KEY = 1;
  private static final int METHODID_LIST_EMERGENCY_KEYS = 2;
  private static final int METHODID_UPDATE_EMERGENCY_KEY = 3;
  private static final int METHODID_DELETE_EMERGENCY_KEY = 4;

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
        case METHODID_CREATE_EMERGENCY_KEY:
          serviceImpl.createEmergencyKey((com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey>) responseObserver);
          break;
        case METHODID_GET_EMERGENCY_KEY:
          serviceImpl.getEmergencyKey((com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey>) responseObserver);
          break;
        case METHODID_LIST_EMERGENCY_KEYS:
          serviceImpl.listEmergencyKeys((com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMERGENCY_KEY:
          serviceImpl.updateEmergencyKey((com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.salto.nebula.emergencykey.v1.EmergencyKey>) responseObserver);
          break;
        case METHODID_DELETE_EMERGENCY_KEY:
          serviceImpl.deleteEmergencyKey((com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest) request,
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
          getCreateEmergencyKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.salto.nebula.emergencykey.v1.CreateEmergencyKeyRequest,
              com.salto.nebula.emergencykey.v1.EmergencyKey>(
                service, METHODID_CREATE_EMERGENCY_KEY)))
        .addMethod(
          getGetEmergencyKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.salto.nebula.emergencykey.v1.GetEmergencyKeyRequest,
              com.salto.nebula.emergencykey.v1.EmergencyKey>(
                service, METHODID_GET_EMERGENCY_KEY)))
        .addMethod(
          getListEmergencyKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.salto.nebula.emergencykey.v1.ListEmergencyKeysRequest,
              com.salto.nebula.emergencykey.v1.ListEmergencyKeysResponse>(
                service, METHODID_LIST_EMERGENCY_KEYS)))
        .addMethod(
          getUpdateEmergencyKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.salto.nebula.emergencykey.v1.UpdateEmergencyKeyRequest,
              com.salto.nebula.emergencykey.v1.EmergencyKey>(
                service, METHODID_UPDATE_EMERGENCY_KEY)))
        .addMethod(
          getDeleteEmergencyKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.salto.nebula.emergencykey.v1.DeleteEmergencyKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EMERGENCY_KEY)))
        .build();
  }

  private static abstract class EmergencyKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.salto.nebula.emergencykey.v1.EmergencyKeyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyKeyService");
    }
  }

  private static final class EmergencyKeyServiceFileDescriptorSupplier
      extends EmergencyKeyServiceBaseDescriptorSupplier {
    EmergencyKeyServiceFileDescriptorSupplier() {}
  }

  private static final class EmergencyKeyServiceMethodDescriptorSupplier
      extends EmergencyKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmergencyKeyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmergencyKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyKeyServiceFileDescriptorSupplier())
              .addMethod(getCreateEmergencyKeyMethod())
              .addMethod(getGetEmergencyKeyMethod())
              .addMethod(getListEmergencyKeysMethod())
              .addMethod(getUpdateEmergencyKeyMethod())
              .addMethod(getDeleteEmergencyKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
