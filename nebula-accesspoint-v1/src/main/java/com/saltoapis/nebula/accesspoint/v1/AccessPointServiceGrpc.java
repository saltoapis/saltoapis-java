package com.saltoapis.nebula.accesspoint.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An access point is a smart electronic locking device capable of granting or
 * denying access to a secured area. This service is responsible for managing
 * access point resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: salto/nebula/accesspoint/v1/access_point.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessPointServiceGrpc {

  private AccessPointServiceGrpc() {}

  public static final String SERVICE_NAME = "salto.nebula.accesspoint.v1.AccessPointService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest,
      com.saltoapis.nebula.accesspoint.v1.AccessPoint> getCreateAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessPoint",
      requestType = com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accesspoint.v1.AccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest,
      com.saltoapis.nebula.accesspoint.v1.AccessPoint> getCreateAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest, com.saltoapis.nebula.accesspoint.v1.AccessPoint> getCreateAccessPointMethod;
    if ((getCreateAccessPointMethod = AccessPointServiceGrpc.getCreateAccessPointMethod) == null) {
      synchronized (AccessPointServiceGrpc.class) {
        if ((getCreateAccessPointMethod = AccessPointServiceGrpc.getCreateAccessPointMethod) == null) {
          AccessPointServiceGrpc.getCreateAccessPointMethod = getCreateAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest, com.saltoapis.nebula.accesspoint.v1.AccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest,
      com.saltoapis.nebula.accesspoint.v1.AccessPoint> getGetAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessPoint",
      requestType = com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accesspoint.v1.AccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest,
      com.saltoapis.nebula.accesspoint.v1.AccessPoint> getGetAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest, com.saltoapis.nebula.accesspoint.v1.AccessPoint> getGetAccessPointMethod;
    if ((getGetAccessPointMethod = AccessPointServiceGrpc.getGetAccessPointMethod) == null) {
      synchronized (AccessPointServiceGrpc.class) {
        if ((getGetAccessPointMethod = AccessPointServiceGrpc.getGetAccessPointMethod) == null) {
          AccessPointServiceGrpc.getGetAccessPointMethod = getGetAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest, com.saltoapis.nebula.accesspoint.v1.AccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest,
      com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse> getListAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessPoints",
      requestType = com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest,
      com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse> getListAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest, com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse> getListAccessPointsMethod;
    if ((getListAccessPointsMethod = AccessPointServiceGrpc.getListAccessPointsMethod) == null) {
      synchronized (AccessPointServiceGrpc.class) {
        if ((getListAccessPointsMethod = AccessPointServiceGrpc.getListAccessPointsMethod) == null) {
          AccessPointServiceGrpc.getListAccessPointsMethod = getListAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest, com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListAccessPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest,
      com.saltoapis.nebula.accesspoint.v1.AccessPoint> getUpdateAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessPoint",
      requestType = com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accesspoint.v1.AccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest,
      com.saltoapis.nebula.accesspoint.v1.AccessPoint> getUpdateAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest, com.saltoapis.nebula.accesspoint.v1.AccessPoint> getUpdateAccessPointMethod;
    if ((getUpdateAccessPointMethod = AccessPointServiceGrpc.getUpdateAccessPointMethod) == null) {
      synchronized (AccessPointServiceGrpc.class) {
        if ((getUpdateAccessPointMethod = AccessPointServiceGrpc.getUpdateAccessPointMethod) == null) {
          AccessPointServiceGrpc.getUpdateAccessPointMethod = getUpdateAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest, com.saltoapis.nebula.accesspoint.v1.AccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.AccessPoint.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest,
      com.google.protobuf.Empty> getDeleteAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessPoint",
      requestType = com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest,
      com.google.protobuf.Empty> getDeleteAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest, com.google.protobuf.Empty> getDeleteAccessPointMethod;
    if ((getDeleteAccessPointMethod = AccessPointServiceGrpc.getDeleteAccessPointMethod) == null) {
      synchronized (AccessPointServiceGrpc.class) {
        if ((getDeleteAccessPointMethod = AccessPointServiceGrpc.getDeleteAccessPointMethod) == null) {
          AccessPointServiceGrpc.getDeleteAccessPointMethod = getDeleteAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest,
      com.saltoapis.longrunning.v1.Operation> getUnlockAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockAccessPoint",
      requestType = com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest,
      com.saltoapis.longrunning.v1.Operation> getUnlockAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest, com.saltoapis.longrunning.v1.Operation> getUnlockAccessPointMethod;
    if ((getUnlockAccessPointMethod = AccessPointServiceGrpc.getUnlockAccessPointMethod) == null) {
      synchronized (AccessPointServiceGrpc.class) {
        if ((getUnlockAccessPointMethod = AccessPointServiceGrpc.getUnlockAccessPointMethod) == null) {
          AccessPointServiceGrpc.getUnlockAccessPointMethod = getUnlockAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlockAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnlockAccessPointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessPointServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPointServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPointServiceStub>() {
        @java.lang.Override
        public AccessPointServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPointServiceStub(channel, callOptions);
        }
      };
    return AccessPointServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessPointServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPointServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPointServiceBlockingStub>() {
        @java.lang.Override
        public AccessPointServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPointServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessPointServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessPointServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPointServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPointServiceFutureStub>() {
        @java.lang.Override
        public AccessPointServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPointServiceFutureStub(channel, callOptions);
        }
      };
    return AccessPointServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An access point is a smart electronic locking device capable of granting or
   * denying access to a secured area. This service is responsible for managing
   * access point resources.
   * </pre>
   */
  public static abstract class AccessPointServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an access point
     * Creates a new access point.
     * </pre>
     */
    public void createAccessPoint(com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point.
     * </pre>
     */
    public void getAccessPoint(com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Returns a list of access points that have been previously created.
     * </pre>
     */
    public void listAccessPoints(com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point.
     * </pre>
     */
    public void updateAccessPoint(com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access point
     * Permanently deletes an access point. This cannot be undone.
     * </pre>
     */
    public void deleteAccessPoint(com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unlock an access point
     * Remotely unlocks an access point. This can be run against those access
     * points where their associated devices are online and connected.
     * </pre>
     */
    public void unlockAccessPoint(com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockAccessPointMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAccessPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest,
                com.saltoapis.nebula.accesspoint.v1.AccessPoint>(
                  this, METHODID_CREATE_ACCESS_POINT)))
          .addMethod(
            getGetAccessPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest,
                com.saltoapis.nebula.accesspoint.v1.AccessPoint>(
                  this, METHODID_GET_ACCESS_POINT)))
          .addMethod(
            getListAccessPointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest,
                com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse>(
                  this, METHODID_LIST_ACCESS_POINTS)))
          .addMethod(
            getUpdateAccessPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest,
                com.saltoapis.nebula.accesspoint.v1.AccessPoint>(
                  this, METHODID_UPDATE_ACCESS_POINT)))
          .addMethod(
            getDeleteAccessPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ACCESS_POINT)))
          .addMethod(
            getUnlockAccessPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest,
                com.saltoapis.longrunning.v1.Operation>(
                  this, METHODID_UNLOCK_ACCESS_POINT)))
          .build();
    }
  }

  /**
   * <pre>
   * An access point is a smart electronic locking device capable of granting or
   * denying access to a secured area. This service is responsible for managing
   * access point resources.
   * </pre>
   */
  public static final class AccessPointServiceStub extends io.grpc.stub.AbstractAsyncStub<AccessPointServiceStub> {
    private AccessPointServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPointServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPointServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access point
     * Creates a new access point.
     * </pre>
     */
    public void createAccessPoint(com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point.
     * </pre>
     */
    public void getAccessPoint(com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Returns a list of access points that have been previously created.
     * </pre>
     */
    public void listAccessPoints(com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point.
     * </pre>
     */
    public void updateAccessPoint(com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access point
     * Permanently deletes an access point. This cannot be undone.
     * </pre>
     */
    public void deleteAccessPoint(com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unlock an access point
     * Remotely unlocks an access point. This can be run against those access
     * points where their associated devices are online and connected.
     * </pre>
     */
    public void unlockAccessPoint(com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockAccessPointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An access point is a smart electronic locking device capable of granting or
   * denying access to a secured area. This service is responsible for managing
   * access point resources.
   * </pre>
   */
  public static final class AccessPointServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessPointServiceBlockingStub> {
    private AccessPointServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPointServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPointServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access point
     * Creates a new access point.
     * </pre>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint createAccessPoint(com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point.
     * </pre>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint getAccessPoint(com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access points
     * Returns a list of access points that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse listAccessPoints(com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point.
     * </pre>
     */
    public com.saltoapis.nebula.accesspoint.v1.AccessPoint updateAccessPoint(com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access point
     * Permanently deletes an access point. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccessPoint(com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unlock an access point
     * Remotely unlocks an access point. This can be run against those access
     * points where their associated devices are online and connected.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation unlockAccessPoint(com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockAccessPointMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An access point is a smart electronic locking device capable of granting or
   * denying access to a secured area. This service is responsible for managing
   * access point resources.
   * </pre>
   */
  public static final class AccessPointServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccessPointServiceFutureStub> {
    private AccessPointServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPointServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPointServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access point
     * Creates a new access point.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspoint.v1.AccessPoint> createAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspoint.v1.AccessPoint> getAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access points
     * Returns a list of access points that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse> listAccessPoints(
        com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspoint.v1.AccessPoint> updateAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access point
     * Permanently deletes an access point. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unlock an access point
     * Remotely unlocks an access point. This can be run against those access
     * points where their associated devices are online and connected.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> unlockAccessPoint(
        com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockAccessPointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCESS_POINT = 0;
  private static final int METHODID_GET_ACCESS_POINT = 1;
  private static final int METHODID_LIST_ACCESS_POINTS = 2;
  private static final int METHODID_UPDATE_ACCESS_POINT = 3;
  private static final int METHODID_DELETE_ACCESS_POINT = 4;
  private static final int METHODID_UNLOCK_ACCESS_POINT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessPointServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessPointServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ACCESS_POINT:
          serviceImpl.createAccessPoint((com.saltoapis.nebula.accesspoint.v1.CreateAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint>) responseObserver);
          break;
        case METHODID_GET_ACCESS_POINT:
          serviceImpl.getAccessPoint((com.saltoapis.nebula.accesspoint.v1.GetAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_POINTS:
          serviceImpl.listAccessPoints((com.saltoapis.nebula.accesspoint.v1.ListAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.ListAccessPointsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_POINT:
          serviceImpl.updateAccessPoint((com.saltoapis.nebula.accesspoint.v1.UpdateAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspoint.v1.AccessPoint>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_POINT:
          serviceImpl.deleteAccessPoint((com.saltoapis.nebula.accesspoint.v1.DeleteAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNLOCK_ACCESS_POINT:
          serviceImpl.unlockAccessPoint((com.saltoapis.nebula.accesspoint.v1.UnlockAccessPointRequest) request,
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccessPointServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateAccessPointMethod())
              .addMethod(getGetAccessPointMethod())
              .addMethod(getListAccessPointsMethod())
              .addMethod(getUpdateAccessPointMethod())
              .addMethod(getDeleteAccessPointMethod())
              .addMethod(getUnlockAccessPointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
