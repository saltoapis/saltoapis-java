package com.saltoapis.intercom.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An intercom is a stand-alone voice communications system for use within a
 * building or small collection of buildings. Intercoms are used on houses that
 * require one connection between a resident and the property's entrance. Its
 * wiring can be connected to the outside with a few pairs (4-6 pairs) while
 * controlling an electric strike. The latest generations are even compatible
 * TCP/IP and VoIP protocols.
 * An intercom adaptor is a device that can be connected to an existing intercom
 * system close to the telephone handset, without affecting its proper
 * functioning. Its main function is to convert the intercom system to become
 * part of the access control system.
 * This service defines those intercoms that are supported by our adaptor and
 * the settings they require to convert them into connected devices for the
 * aforementioned access control system.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/intercom/v1/intercom.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntercomServiceGrpc {

  private IntercomServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.intercom.v1.IntercomService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.GetBrandRequest,
      com.saltoapis.intercom.v1.Brand> getGetBrandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrand",
      requestType = com.saltoapis.intercom.v1.GetBrandRequest.class,
      responseType = com.saltoapis.intercom.v1.Brand.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.GetBrandRequest,
      com.saltoapis.intercom.v1.Brand> getGetBrandMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.GetBrandRequest, com.saltoapis.intercom.v1.Brand> getGetBrandMethod;
    if ((getGetBrandMethod = IntercomServiceGrpc.getGetBrandMethod) == null) {
      synchronized (IntercomServiceGrpc.class) {
        if ((getGetBrandMethod = IntercomServiceGrpc.getGetBrandMethod) == null) {
          IntercomServiceGrpc.getGetBrandMethod = getGetBrandMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.intercom.v1.GetBrandRequest, com.saltoapis.intercom.v1.Brand>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.GetBrandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.Brand.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomServiceMethodDescriptorSupplier("GetBrand"))
              .build();
        }
      }
    }
    return getGetBrandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.ListBrandsRequest,
      com.saltoapis.intercom.v1.ListBrandsResponse> getListBrandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBrands",
      requestType = com.saltoapis.intercom.v1.ListBrandsRequest.class,
      responseType = com.saltoapis.intercom.v1.ListBrandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.ListBrandsRequest,
      com.saltoapis.intercom.v1.ListBrandsResponse> getListBrandsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.ListBrandsRequest, com.saltoapis.intercom.v1.ListBrandsResponse> getListBrandsMethod;
    if ((getListBrandsMethod = IntercomServiceGrpc.getListBrandsMethod) == null) {
      synchronized (IntercomServiceGrpc.class) {
        if ((getListBrandsMethod = IntercomServiceGrpc.getListBrandsMethod) == null) {
          IntercomServiceGrpc.getListBrandsMethod = getListBrandsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.intercom.v1.ListBrandsRequest, com.saltoapis.intercom.v1.ListBrandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBrands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.ListBrandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.ListBrandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomServiceMethodDescriptorSupplier("ListBrands"))
              .build();
        }
      }
    }
    return getListBrandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.GetModelRequest,
      com.saltoapis.intercom.v1.Model> getGetModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModel",
      requestType = com.saltoapis.intercom.v1.GetModelRequest.class,
      responseType = com.saltoapis.intercom.v1.Model.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.GetModelRequest,
      com.saltoapis.intercom.v1.Model> getGetModelMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.GetModelRequest, com.saltoapis.intercom.v1.Model> getGetModelMethod;
    if ((getGetModelMethod = IntercomServiceGrpc.getGetModelMethod) == null) {
      synchronized (IntercomServiceGrpc.class) {
        if ((getGetModelMethod = IntercomServiceGrpc.getGetModelMethod) == null) {
          IntercomServiceGrpc.getGetModelMethod = getGetModelMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.intercom.v1.GetModelRequest, com.saltoapis.intercom.v1.Model>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.GetModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.Model.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomServiceMethodDescriptorSupplier("GetModel"))
              .build();
        }
      }
    }
    return getGetModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.ListModelsRequest,
      com.saltoapis.intercom.v1.ListModelsResponse> getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = com.saltoapis.intercom.v1.ListModelsRequest.class,
      responseType = com.saltoapis.intercom.v1.ListModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.ListModelsRequest,
      com.saltoapis.intercom.v1.ListModelsResponse> getListModelsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.intercom.v1.ListModelsRequest, com.saltoapis.intercom.v1.ListModelsResponse> getListModelsMethod;
    if ((getListModelsMethod = IntercomServiceGrpc.getListModelsMethod) == null) {
      synchronized (IntercomServiceGrpc.class) {
        if ((getListModelsMethod = IntercomServiceGrpc.getListModelsMethod) == null) {
          IntercomServiceGrpc.getListModelsMethod = getListModelsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.intercom.v1.ListModelsRequest, com.saltoapis.intercom.v1.ListModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.ListModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.intercom.v1.ListModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntercomServiceMethodDescriptorSupplier("ListModels"))
              .build();
        }
      }
    }
    return getListModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntercomServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntercomServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntercomServiceStub>() {
        @java.lang.Override
        public IntercomServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntercomServiceStub(channel, callOptions);
        }
      };
    return IntercomServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntercomServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntercomServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntercomServiceBlockingStub>() {
        @java.lang.Override
        public IntercomServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntercomServiceBlockingStub(channel, callOptions);
        }
      };
    return IntercomServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntercomServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntercomServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntercomServiceFutureStub>() {
        @java.lang.Override
        public IntercomServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntercomServiceFutureStub(channel, callOptions);
        }
      };
    return IntercomServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An intercom is a stand-alone voice communications system for use within a
   * building or small collection of buildings. Intercoms are used on houses that
   * require one connection between a resident and the property's entrance. Its
   * wiring can be connected to the outside with a few pairs (4-6 pairs) while
   * controlling an electric strike. The latest generations are even compatible
   * TCP/IP and VoIP protocols.
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * This service defines those intercoms that are supported by our adaptor and
   * the settings they require to convert them into connected devices for the
   * aforementioned access control system.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get a brand
     * Retrieves an existing brand.
     * </pre>
     */
    default void getBrand(com.saltoapis.intercom.v1.GetBrandRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.Brand> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrandMethod(), responseObserver);
    }

    /**
     * <pre>
     * List brands
     * Returns a list of brands that have been previously created.
     * </pre>
     */
    default void listBrands(com.saltoapis.intercom.v1.ListBrandsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.ListBrandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBrandsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a model
     * Retrieves an existing model.
     * </pre>
     */
    default void getModel(com.saltoapis.intercom.v1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.Model> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * List models
     * Returns a list of models that have been previously created.
     * </pre>
     */
    default void listModels(com.saltoapis.intercom.v1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.ListModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IntercomService.
   * <pre>
   * An intercom is a stand-alone voice communications system for use within a
   * building or small collection of buildings. Intercoms are used on houses that
   * require one connection between a resident and the property's entrance. Its
   * wiring can be connected to the outside with a few pairs (4-6 pairs) while
   * controlling an electric strike. The latest generations are even compatible
   * TCP/IP and VoIP protocols.
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * This service defines those intercoms that are supported by our adaptor and
   * the settings they require to convert them into connected devices for the
   * aforementioned access control system.
   * </pre>
   */
  public static abstract class IntercomServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IntercomServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IntercomService.
   * <pre>
   * An intercom is a stand-alone voice communications system for use within a
   * building or small collection of buildings. Intercoms are used on houses that
   * require one connection between a resident and the property's entrance. Its
   * wiring can be connected to the outside with a few pairs (4-6 pairs) while
   * controlling an electric strike. The latest generations are even compatible
   * TCP/IP and VoIP protocols.
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * This service defines those intercoms that are supported by our adaptor and
   * the settings they require to convert them into connected devices for the
   * aforementioned access control system.
   * </pre>
   */
  public static final class IntercomServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IntercomServiceStub> {
    private IntercomServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntercomServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntercomServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a brand
     * Retrieves an existing brand.
     * </pre>
     */
    public void getBrand(com.saltoapis.intercom.v1.GetBrandRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.Brand> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List brands
     * Returns a list of brands that have been previously created.
     * </pre>
     */
    public void listBrands(com.saltoapis.intercom.v1.ListBrandsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.ListBrandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBrandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a model
     * Retrieves an existing model.
     * </pre>
     */
    public void getModel(com.saltoapis.intercom.v1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.Model> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List models
     * Returns a list of models that have been previously created.
     * </pre>
     */
    public void listModels(com.saltoapis.intercom.v1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.ListModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IntercomService.
   * <pre>
   * An intercom is a stand-alone voice communications system for use within a
   * building or small collection of buildings. Intercoms are used on houses that
   * require one connection between a resident and the property's entrance. Its
   * wiring can be connected to the outside with a few pairs (4-6 pairs) while
   * controlling an electric strike. The latest generations are even compatible
   * TCP/IP and VoIP protocols.
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * This service defines those intercoms that are supported by our adaptor and
   * the settings they require to convert them into connected devices for the
   * aforementioned access control system.
   * </pre>
   */
  public static final class IntercomServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IntercomServiceBlockingStub> {
    private IntercomServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntercomServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntercomServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a brand
     * Retrieves an existing brand.
     * </pre>
     */
    public com.saltoapis.intercom.v1.Brand getBrand(com.saltoapis.intercom.v1.GetBrandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List brands
     * Returns a list of brands that have been previously created.
     * </pre>
     */
    public com.saltoapis.intercom.v1.ListBrandsResponse listBrands(com.saltoapis.intercom.v1.ListBrandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBrandsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a model
     * Retrieves an existing model.
     * </pre>
     */
    public com.saltoapis.intercom.v1.Model getModel(com.saltoapis.intercom.v1.GetModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List models
     * Returns a list of models that have been previously created.
     * </pre>
     */
    public com.saltoapis.intercom.v1.ListModelsResponse listModels(com.saltoapis.intercom.v1.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IntercomService.
   * <pre>
   * An intercom is a stand-alone voice communications system for use within a
   * building or small collection of buildings. Intercoms are used on houses that
   * require one connection between a resident and the property's entrance. Its
   * wiring can be connected to the outside with a few pairs (4-6 pairs) while
   * controlling an electric strike. The latest generations are even compatible
   * TCP/IP and VoIP protocols.
   * An intercom adaptor is a device that can be connected to an existing intercom
   * system close to the telephone handset, without affecting its proper
   * functioning. Its main function is to convert the intercom system to become
   * part of the access control system.
   * This service defines those intercoms that are supported by our adaptor and
   * the settings they require to convert them into connected devices for the
   * aforementioned access control system.
   * </pre>
   */
  public static final class IntercomServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IntercomServiceFutureStub> {
    private IntercomServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntercomServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntercomServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a brand
     * Retrieves an existing brand.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.intercom.v1.Brand> getBrand(
        com.saltoapis.intercom.v1.GetBrandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List brands
     * Returns a list of brands that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.intercom.v1.ListBrandsResponse> listBrands(
        com.saltoapis.intercom.v1.ListBrandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBrandsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a model
     * Retrieves an existing model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.intercom.v1.Model> getModel(
        com.saltoapis.intercom.v1.GetModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List models
     * Returns a list of models that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.intercom.v1.ListModelsResponse> listModels(
        com.saltoapis.intercom.v1.ListModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BRAND = 0;
  private static final int METHODID_LIST_BRANDS = 1;
  private static final int METHODID_GET_MODEL = 2;
  private static final int METHODID_LIST_MODELS = 3;

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
        case METHODID_GET_BRAND:
          serviceImpl.getBrand((com.saltoapis.intercom.v1.GetBrandRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.Brand>) responseObserver);
          break;
        case METHODID_LIST_BRANDS:
          serviceImpl.listBrands((com.saltoapis.intercom.v1.ListBrandsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.ListBrandsResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL:
          serviceImpl.getModel((com.saltoapis.intercom.v1.GetModelRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.Model>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels((com.saltoapis.intercom.v1.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.intercom.v1.ListModelsResponse>) responseObserver);
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
          getGetBrandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.intercom.v1.GetBrandRequest,
              com.saltoapis.intercom.v1.Brand>(
                service, METHODID_GET_BRAND)))
        .addMethod(
          getListBrandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.intercom.v1.ListBrandsRequest,
              com.saltoapis.intercom.v1.ListBrandsResponse>(
                service, METHODID_LIST_BRANDS)))
        .addMethod(
          getGetModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.intercom.v1.GetModelRequest,
              com.saltoapis.intercom.v1.Model>(
                service, METHODID_GET_MODEL)))
        .addMethod(
          getListModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.intercom.v1.ListModelsRequest,
              com.saltoapis.intercom.v1.ListModelsResponse>(
                service, METHODID_LIST_MODELS)))
        .build();
  }

  private static abstract class IntercomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntercomServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.intercom.v1.IntercomProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntercomService");
    }
  }

  private static final class IntercomServiceFileDescriptorSupplier
      extends IntercomServiceBaseDescriptorSupplier {
    IntercomServiceFileDescriptorSupplier() {}
  }

  private static final class IntercomServiceMethodDescriptorSupplier
      extends IntercomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IntercomServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IntercomServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntercomServiceFileDescriptorSupplier())
              .addMethod(getGetBrandMethod())
              .addMethod(getListBrandsMethod())
              .addMethod(getGetModelMethod())
              .addMethod(getListModelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
