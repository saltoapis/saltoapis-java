package com.saltoapis.nebula.device.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A device could be an electronic lock, gateway, extender or any piece of
 * hardware manufactured by SALTO. This service provides access to an aggregated
 * view of all of them in an eventual consistent way.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: salto/nebula/device/v1/device.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "salto.nebula.device.v1.DeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.device.v1.GetDeviceRequest,
      com.saltoapis.nebula.device.v1.Device> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevice",
      requestType = com.saltoapis.nebula.device.v1.GetDeviceRequest.class,
      responseType = com.saltoapis.nebula.device.v1.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.device.v1.GetDeviceRequest,
      com.saltoapis.nebula.device.v1.Device> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.device.v1.GetDeviceRequest, com.saltoapis.nebula.device.v1.Device> getGetDeviceMethod;
    if ((getGetDeviceMethod = DeviceServiceGrpc.getGetDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceMethod = DeviceServiceGrpc.getGetDeviceMethod) == null) {
          DeviceServiceGrpc.getGetDeviceMethod = getGetDeviceMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.device.v1.GetDeviceRequest, com.saltoapis.nebula.device.v1.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.device.v1.GetDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.device.v1.Device.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.device.v1.ListDevicesRequest,
      com.saltoapis.nebula.device.v1.ListDevicesResponse> getListDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevices",
      requestType = com.saltoapis.nebula.device.v1.ListDevicesRequest.class,
      responseType = com.saltoapis.nebula.device.v1.ListDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.device.v1.ListDevicesRequest,
      com.saltoapis.nebula.device.v1.ListDevicesResponse> getListDevicesMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.device.v1.ListDevicesRequest, com.saltoapis.nebula.device.v1.ListDevicesResponse> getListDevicesMethod;
    if ((getListDevicesMethod = DeviceServiceGrpc.getListDevicesMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getListDevicesMethod = DeviceServiceGrpc.getListDevicesMethod) == null) {
          DeviceServiceGrpc.getListDevicesMethod = getListDevicesMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.device.v1.ListDevicesRequest, com.saltoapis.nebula.device.v1.ListDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.device.v1.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.device.v1.ListDevicesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListDevicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub>() {
        @java.lang.Override
        public DeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceStub(channel, callOptions);
        }
      };
    return DeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub>() {
        @java.lang.Override
        public DeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return DeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub>() {
        @java.lang.Override
        public DeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceFutureStub(channel, callOptions);
        }
      };
    return DeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A device could be an electronic lock, gateway, extender or any piece of
   * hardware manufactured by SALTO. This service provides access to an aggregated
   * view of all of them in an eventual consistent way.
   * </pre>
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get a device
     * Gets an existing device.
     * </pre>
     */
    public void getDevice(com.saltoapis.nebula.device.v1.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.device.v1.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * List devices
     * Returns a list of devices that have been previously created.
     * </pre>
     */
    public void listDevices(com.saltoapis.nebula.device.v1.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.device.v1.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDevicesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.device.v1.GetDeviceRequest,
                com.saltoapis.nebula.device.v1.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            getListDevicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.device.v1.ListDevicesRequest,
                com.saltoapis.nebula.device.v1.ListDevicesResponse>(
                  this, METHODID_LIST_DEVICES)))
          .build();
    }
  }

  /**
   * <pre>
   * A device could be an electronic lock, gateway, extender or any piece of
   * hardware manufactured by SALTO. This service provides access to an aggregated
   * view of all of them in an eventual consistent way.
   * </pre>
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractAsyncStub<DeviceServiceStub> {
    private DeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a device
     * Gets an existing device.
     * </pre>
     */
    public void getDevice(com.saltoapis.nebula.device.v1.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.device.v1.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List devices
     * Returns a list of devices that have been previously created.
     * </pre>
     */
    public void listDevices(com.saltoapis.nebula.device.v1.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.device.v1.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A device could be an electronic lock, gateway, extender or any piece of
   * hardware manufactured by SALTO. This service provides access to an aggregated
   * view of all of them in an eventual consistent way.
   * </pre>
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a device
     * Gets an existing device.
     * </pre>
     */
    public com.saltoapis.nebula.device.v1.Device getDevice(com.saltoapis.nebula.device.v1.GetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List devices
     * Returns a list of devices that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.device.v1.ListDevicesResponse listDevices(com.saltoapis.nebula.device.v1.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDevicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A device could be an electronic lock, gateway, extender or any piece of
   * hardware manufactured by SALTO. This service provides access to an aggregated
   * view of all of them in an eventual consistent way.
   * </pre>
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a device
     * Gets an existing device.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.device.v1.Device> getDevice(
        com.saltoapis.nebula.device.v1.GetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List devices
     * Returns a list of devices that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.device.v1.ListDevicesResponse> listDevices(
        com.saltoapis.nebula.device.v1.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICE = 0;
  private static final int METHODID_LIST_DEVICES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((com.saltoapis.nebula.device.v1.GetDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.device.v1.Device>) responseObserver);
          break;
        case METHODID_LIST_DEVICES:
          serviceImpl.listDevices((com.saltoapis.nebula.device.v1.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.device.v1.ListDevicesResponse>) responseObserver);
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
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetDeviceMethod())
              .addMethod(getListDevicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
