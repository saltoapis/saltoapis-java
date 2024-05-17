package com.saltoapis.nebula.digitalkey.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DigitalKeyService is the service responsible for managing digital key
 * resources. This service manages resources for the different types of keys
 * that exist on mobile devices, such as app keys or wallet keys.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: salto/nebula/digitalkey/v1/digital_key.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DigitalKeyServiceGrpc {

  private DigitalKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "salto.nebula.digitalkey.v1.DigitalKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest,
      com.saltoapis.nebula.digitalkey.v1.DigitalKey> getGetDigitalKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDigitalKey",
      requestType = com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest.class,
      responseType = com.saltoapis.nebula.digitalkey.v1.DigitalKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest,
      com.saltoapis.nebula.digitalkey.v1.DigitalKey> getGetDigitalKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest, com.saltoapis.nebula.digitalkey.v1.DigitalKey> getGetDigitalKeyMethod;
    if ((getGetDigitalKeyMethod = DigitalKeyServiceGrpc.getGetDigitalKeyMethod) == null) {
      synchronized (DigitalKeyServiceGrpc.class) {
        if ((getGetDigitalKeyMethod = DigitalKeyServiceGrpc.getGetDigitalKeyMethod) == null) {
          DigitalKeyServiceGrpc.getGetDigitalKeyMethod = getGetDigitalKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest, com.saltoapis.nebula.digitalkey.v1.DigitalKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDigitalKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.DigitalKey.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDigitalKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest,
      com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse> getListDigitalKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDigitalKeys",
      requestType = com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest.class,
      responseType = com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest,
      com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse> getListDigitalKeysMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest, com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse> getListDigitalKeysMethod;
    if ((getListDigitalKeysMethod = DigitalKeyServiceGrpc.getListDigitalKeysMethod) == null) {
      synchronized (DigitalKeyServiceGrpc.class) {
        if ((getListDigitalKeysMethod = DigitalKeyServiceGrpc.getListDigitalKeysMethod) == null) {
          DigitalKeyServiceGrpc.getListDigitalKeysMethod = getListDigitalKeysMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest, com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDigitalKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListDigitalKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest,
      com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> getGetDigitalKeyAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDigitalKeyAccessPoint",
      requestType = com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest.class,
      responseType = com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest,
      com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> getGetDigitalKeyAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest, com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> getGetDigitalKeyAccessPointMethod;
    if ((getGetDigitalKeyAccessPointMethod = DigitalKeyServiceGrpc.getGetDigitalKeyAccessPointMethod) == null) {
      synchronized (DigitalKeyServiceGrpc.class) {
        if ((getGetDigitalKeyAccessPointMethod = DigitalKeyServiceGrpc.getGetDigitalKeyAccessPointMethod) == null) {
          DigitalKeyServiceGrpc.getGetDigitalKeyAccessPointMethod = getGetDigitalKeyAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest, com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDigitalKeyAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDigitalKeyAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest,
      com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse> getListDigitalKeyAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDigitalKeyAccessPoints",
      requestType = com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest,
      com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse> getListDigitalKeyAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest, com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse> getListDigitalKeyAccessPointsMethod;
    if ((getListDigitalKeyAccessPointsMethod = DigitalKeyServiceGrpc.getListDigitalKeyAccessPointsMethod) == null) {
      synchronized (DigitalKeyServiceGrpc.class) {
        if ((getListDigitalKeyAccessPointsMethod = DigitalKeyServiceGrpc.getListDigitalKeyAccessPointsMethod) == null) {
          DigitalKeyServiceGrpc.getListDigitalKeyAccessPointsMethod = getListDigitalKeyAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest, com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDigitalKeyAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListDigitalKeyAccessPointsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DigitalKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DigitalKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DigitalKeyServiceStub>() {
        @java.lang.Override
        public DigitalKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DigitalKeyServiceStub(channel, callOptions);
        }
      };
    return DigitalKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DigitalKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DigitalKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DigitalKeyServiceBlockingStub>() {
        @java.lang.Override
        public DigitalKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DigitalKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return DigitalKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DigitalKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DigitalKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DigitalKeyServiceFutureStub>() {
        @java.lang.Override
        public DigitalKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DigitalKeyServiceFutureStub(channel, callOptions);
        }
      };
    return DigitalKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DigitalKeyService is the service responsible for managing digital key
   * resources. This service manages resources for the different types of keys
   * that exist on mobile devices, such as app keys or wallet keys.
   * </pre>
   */
  public static abstract class DigitalKeyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get a digital key
     * Gets an existing digital key.
     * </pre>
     */
    public void getDigitalKey(com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.DigitalKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDigitalKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List digital keys
     * Returns a list of digital keys that have been previously created.
     * </pre>
     */
    public void listDigitalKeys(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDigitalKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Gets an existing digital key's access point association.
     * </pre>
     */
    public void getDigitalKeyAccessPoint(com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDigitalKeyAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing digital key's access point associations.
     * </pre>
     */
    public void listDigitalKeyAccessPoints(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDigitalKeyAccessPointsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDigitalKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest,
                com.saltoapis.nebula.digitalkey.v1.DigitalKey>(
                  this, METHODID_GET_DIGITAL_KEY)))
          .addMethod(
            getListDigitalKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest,
                com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse>(
                  this, METHODID_LIST_DIGITAL_KEYS)))
          .addMethod(
            getGetDigitalKeyAccessPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest,
                com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint>(
                  this, METHODID_GET_DIGITAL_KEY_ACCESS_POINT)))
          .addMethod(
            getListDigitalKeyAccessPointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest,
                com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse>(
                  this, METHODID_LIST_DIGITAL_KEY_ACCESS_POINTS)))
          .build();
    }
  }

  /**
   * <pre>
   * DigitalKeyService is the service responsible for managing digital key
   * resources. This service manages resources for the different types of keys
   * that exist on mobile devices, such as app keys or wallet keys.
   * </pre>
   */
  public static final class DigitalKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<DigitalKeyServiceStub> {
    private DigitalKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DigitalKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DigitalKeyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a digital key
     * Gets an existing digital key.
     * </pre>
     */
    public void getDigitalKey(com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.DigitalKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDigitalKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List digital keys
     * Returns a list of digital keys that have been previously created.
     * </pre>
     */
    public void listDigitalKeys(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDigitalKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Gets an existing digital key's access point association.
     * </pre>
     */
    public void getDigitalKeyAccessPoint(com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDigitalKeyAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing digital key's access point associations.
     * </pre>
     */
    public void listDigitalKeyAccessPoints(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDigitalKeyAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DigitalKeyService is the service responsible for managing digital key
   * resources. This service manages resources for the different types of keys
   * that exist on mobile devices, such as app keys or wallet keys.
   * </pre>
   */
  public static final class DigitalKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DigitalKeyServiceBlockingStub> {
    private DigitalKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DigitalKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DigitalKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a digital key
     * Gets an existing digital key.
     * </pre>
     */
    public com.saltoapis.nebula.digitalkey.v1.DigitalKey getDigitalKey(com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDigitalKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List digital keys
     * Returns a list of digital keys that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse listDigitalKeys(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDigitalKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access point
     * Gets an existing digital key's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint getDigitalKeyAccessPoint(com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDigitalKeyAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing digital key's access point associations.
     * </pre>
     */
    public com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse listDigitalKeyAccessPoints(com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDigitalKeyAccessPointsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DigitalKeyService is the service responsible for managing digital key
   * resources. This service manages resources for the different types of keys
   * that exist on mobile devices, such as app keys or wallet keys.
   * </pre>
   */
  public static final class DigitalKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DigitalKeyServiceFutureStub> {
    private DigitalKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DigitalKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DigitalKeyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a digital key
     * Gets an existing digital key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.digitalkey.v1.DigitalKey> getDigitalKey(
        com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDigitalKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List digital keys
     * Returns a list of digital keys that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse> listDigitalKeys(
        com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDigitalKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access point
     * Gets an existing digital key's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint> getDigitalKeyAccessPoint(
        com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDigitalKeyAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing digital key's access point associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse> listDigitalKeyAccessPoints(
        com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDigitalKeyAccessPointsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DIGITAL_KEY = 0;
  private static final int METHODID_LIST_DIGITAL_KEYS = 1;
  private static final int METHODID_GET_DIGITAL_KEY_ACCESS_POINT = 2;
  private static final int METHODID_LIST_DIGITAL_KEY_ACCESS_POINTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DigitalKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DigitalKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DIGITAL_KEY:
          serviceImpl.getDigitalKey((com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.DigitalKey>) responseObserver);
          break;
        case METHODID_LIST_DIGITAL_KEYS:
          serviceImpl.listDigitalKeys((com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeysResponse>) responseObserver);
          break;
        case METHODID_GET_DIGITAL_KEY_ACCESS_POINT:
          serviceImpl.getDigitalKeyAccessPoint((com.saltoapis.nebula.digitalkey.v1.GetDigitalKeyAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.DigitalKeyAccessPoint>) responseObserver);
          break;
        case METHODID_LIST_DIGITAL_KEY_ACCESS_POINTS:
          serviceImpl.listDigitalKeyAccessPoints((com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.digitalkey.v1.ListDigitalKeyAccessPointsResponse>) responseObserver);
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
      synchronized (DigitalKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetDigitalKeyMethod())
              .addMethod(getListDigitalKeysMethod())
              .addMethod(getGetDigitalKeyAccessPointMethod())
              .addMethod(getListDigitalKeyAccessPointsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
