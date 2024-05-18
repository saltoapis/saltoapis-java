package com.saltoapis.nebula.openingmodeschedule.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An opening mode is a type of behavior which can be applied to a specific
 * access point or collection of access points. For example: Office or Toggle.
 * This service allows you to make a number of different opening modes switch
 * automatically and vary across different time periods.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/openingmodeschedule/v1/opening_mode_schedule.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OpeningModeScheduleServiceGrpc {

  private OpeningModeScheduleServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.openingmodeschedule.v1.OpeningModeScheduleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getCreateOpeningModeScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOpeningModeSchedule",
      requestType = com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.class,
      responseType = com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getCreateOpeningModeScheduleMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getCreateOpeningModeScheduleMethod;
    if ((getCreateOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getCreateOpeningModeScheduleMethod) == null) {
      synchronized (OpeningModeScheduleServiceGrpc.class) {
        if ((getCreateOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getCreateOpeningModeScheduleMethod) == null) {
          OpeningModeScheduleServiceGrpc.getCreateOpeningModeScheduleMethod = getCreateOpeningModeScheduleMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOpeningModeSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new OpeningModeScheduleServiceMethodDescriptorSupplier("CreateOpeningModeSchedule"))
              .build();
        }
      }
    }
    return getCreateOpeningModeScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getGetOpeningModeScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOpeningModeSchedule",
      requestType = com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest.class,
      responseType = com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getGetOpeningModeScheduleMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getGetOpeningModeScheduleMethod;
    if ((getGetOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getGetOpeningModeScheduleMethod) == null) {
      synchronized (OpeningModeScheduleServiceGrpc.class) {
        if ((getGetOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getGetOpeningModeScheduleMethod) == null) {
          OpeningModeScheduleServiceGrpc.getGetOpeningModeScheduleMethod = getGetOpeningModeScheduleMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOpeningModeSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new OpeningModeScheduleServiceMethodDescriptorSupplier("GetOpeningModeSchedule"))
              .build();
        }
      }
    }
    return getGetOpeningModeScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse> getListOpeningModeSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOpeningModeSchedules",
      requestType = com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest.class,
      responseType = com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse> getListOpeningModeSchedulesMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest, com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse> getListOpeningModeSchedulesMethod;
    if ((getListOpeningModeSchedulesMethod = OpeningModeScheduleServiceGrpc.getListOpeningModeSchedulesMethod) == null) {
      synchronized (OpeningModeScheduleServiceGrpc.class) {
        if ((getListOpeningModeSchedulesMethod = OpeningModeScheduleServiceGrpc.getListOpeningModeSchedulesMethod) == null) {
          OpeningModeScheduleServiceGrpc.getListOpeningModeSchedulesMethod = getListOpeningModeSchedulesMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest, com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOpeningModeSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OpeningModeScheduleServiceMethodDescriptorSupplier("ListOpeningModeSchedules"))
              .build();
        }
      }
    }
    return getListOpeningModeSchedulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getUpdateOpeningModeScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOpeningModeSchedule",
      requestType = com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest.class,
      responseType = com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest,
      com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getUpdateOpeningModeScheduleMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getUpdateOpeningModeScheduleMethod;
    if ((getUpdateOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getUpdateOpeningModeScheduleMethod) == null) {
      synchronized (OpeningModeScheduleServiceGrpc.class) {
        if ((getUpdateOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getUpdateOpeningModeScheduleMethod) == null) {
          OpeningModeScheduleServiceGrpc.getUpdateOpeningModeScheduleMethod = getUpdateOpeningModeScheduleMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest, com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOpeningModeSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new OpeningModeScheduleServiceMethodDescriptorSupplier("UpdateOpeningModeSchedule"))
              .build();
        }
      }
    }
    return getUpdateOpeningModeScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest,
      com.google.protobuf.Empty> getDeleteOpeningModeScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOpeningModeSchedule",
      requestType = com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest,
      com.google.protobuf.Empty> getDeleteOpeningModeScheduleMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest, com.google.protobuf.Empty> getDeleteOpeningModeScheduleMethod;
    if ((getDeleteOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getDeleteOpeningModeScheduleMethod) == null) {
      synchronized (OpeningModeScheduleServiceGrpc.class) {
        if ((getDeleteOpeningModeScheduleMethod = OpeningModeScheduleServiceGrpc.getDeleteOpeningModeScheduleMethod) == null) {
          OpeningModeScheduleServiceGrpc.getDeleteOpeningModeScheduleMethod = getDeleteOpeningModeScheduleMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOpeningModeSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OpeningModeScheduleServiceMethodDescriptorSupplier("DeleteOpeningModeSchedule"))
              .build();
        }
      }
    }
    return getDeleteOpeningModeScheduleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OpeningModeScheduleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpeningModeScheduleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpeningModeScheduleServiceStub>() {
        @java.lang.Override
        public OpeningModeScheduleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpeningModeScheduleServiceStub(channel, callOptions);
        }
      };
    return OpeningModeScheduleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OpeningModeScheduleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpeningModeScheduleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpeningModeScheduleServiceBlockingStub>() {
        @java.lang.Override
        public OpeningModeScheduleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpeningModeScheduleServiceBlockingStub(channel, callOptions);
        }
      };
    return OpeningModeScheduleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OpeningModeScheduleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpeningModeScheduleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpeningModeScheduleServiceFutureStub>() {
        @java.lang.Override
        public OpeningModeScheduleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpeningModeScheduleServiceFutureStub(channel, callOptions);
        }
      };
    return OpeningModeScheduleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An opening mode is a type of behavior which can be applied to a specific
   * access point or collection of access points. For example: Office or Toggle.
   * This service allows you to make a number of different opening modes switch
   * automatically and vary across different time periods.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an opening mode schedule
     * Creates an opening mode schedule.
     * </pre>
     */
    default void createOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOpeningModeScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an opening mode schedule
     * Gets an existing opening mode schedule.
     * </pre>
     */
    default void getOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOpeningModeScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * List opening mode schedules
     * Returns a list of opening mode schedules that have been previously
     * created.
     * </pre>
     */
    default void listOpeningModeSchedules(com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOpeningModeSchedulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an opening mode schedule
     * Updates an existing opening mode schedule.
     * </pre>
     */
    default void updateOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOpeningModeScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an opening mode schedule
     * Permanently deletes an opening mode schedule. This cannot be undone.
     * </pre>
     */
    default void deleteOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOpeningModeScheduleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OpeningModeScheduleService.
   * <pre>
   * An opening mode is a type of behavior which can be applied to a specific
   * access point or collection of access points. For example: Office or Toggle.
   * This service allows you to make a number of different opening modes switch
   * automatically and vary across different time periods.
   * </pre>
   */
  public static abstract class OpeningModeScheduleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OpeningModeScheduleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OpeningModeScheduleService.
   * <pre>
   * An opening mode is a type of behavior which can be applied to a specific
   * access point or collection of access points. For example: Office or Toggle.
   * This service allows you to make a number of different opening modes switch
   * automatically and vary across different time periods.
   * </pre>
   */
  public static final class OpeningModeScheduleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OpeningModeScheduleServiceStub> {
    private OpeningModeScheduleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpeningModeScheduleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpeningModeScheduleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an opening mode schedule
     * Creates an opening mode schedule.
     * </pre>
     */
    public void createOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOpeningModeScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an opening mode schedule
     * Gets an existing opening mode schedule.
     * </pre>
     */
    public void getOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOpeningModeScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List opening mode schedules
     * Returns a list of opening mode schedules that have been previously
     * created.
     * </pre>
     */
    public void listOpeningModeSchedules(com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOpeningModeSchedulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an opening mode schedule
     * Updates an existing opening mode schedule.
     * </pre>
     */
    public void updateOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOpeningModeScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an opening mode schedule
     * Permanently deletes an opening mode schedule. This cannot be undone.
     * </pre>
     */
    public void deleteOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOpeningModeScheduleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OpeningModeScheduleService.
   * <pre>
   * An opening mode is a type of behavior which can be applied to a specific
   * access point or collection of access points. For example: Office or Toggle.
   * This service allows you to make a number of different opening modes switch
   * automatically and vary across different time periods.
   * </pre>
   */
  public static final class OpeningModeScheduleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OpeningModeScheduleServiceBlockingStub> {
    private OpeningModeScheduleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpeningModeScheduleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpeningModeScheduleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an opening mode schedule
     * Creates an opening mode schedule.
     * </pre>
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule createOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOpeningModeScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an opening mode schedule
     * Gets an existing opening mode schedule.
     * </pre>
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule getOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOpeningModeScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List opening mode schedules
     * Returns a list of opening mode schedules that have been previously
     * created.
     * </pre>
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse listOpeningModeSchedules(com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOpeningModeSchedulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an opening mode schedule
     * Updates an existing opening mode schedule.
     * </pre>
     */
    public com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule updateOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOpeningModeScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an opening mode schedule
     * Permanently deletes an opening mode schedule. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteOpeningModeSchedule(com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOpeningModeScheduleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OpeningModeScheduleService.
   * <pre>
   * An opening mode is a type of behavior which can be applied to a specific
   * access point or collection of access points. For example: Office or Toggle.
   * This service allows you to make a number of different opening modes switch
   * automatically and vary across different time periods.
   * </pre>
   */
  public static final class OpeningModeScheduleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OpeningModeScheduleServiceFutureStub> {
    private OpeningModeScheduleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpeningModeScheduleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpeningModeScheduleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an opening mode schedule
     * Creates an opening mode schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> createOpeningModeSchedule(
        com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOpeningModeScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an opening mode schedule
     * Gets an existing opening mode schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> getOpeningModeSchedule(
        com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOpeningModeScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List opening mode schedules
     * Returns a list of opening mode schedules that have been previously
     * created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse> listOpeningModeSchedules(
        com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOpeningModeSchedulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an opening mode schedule
     * Updates an existing opening mode schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule> updateOpeningModeSchedule(
        com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOpeningModeScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an opening mode schedule
     * Permanently deletes an opening mode schedule. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOpeningModeSchedule(
        com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOpeningModeScheduleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OPENING_MODE_SCHEDULE = 0;
  private static final int METHODID_GET_OPENING_MODE_SCHEDULE = 1;
  private static final int METHODID_LIST_OPENING_MODE_SCHEDULES = 2;
  private static final int METHODID_UPDATE_OPENING_MODE_SCHEDULE = 3;
  private static final int METHODID_DELETE_OPENING_MODE_SCHEDULE = 4;

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
        case METHODID_CREATE_OPENING_MODE_SCHEDULE:
          serviceImpl.createOpeningModeSchedule((com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>) responseObserver);
          break;
        case METHODID_GET_OPENING_MODE_SCHEDULE:
          serviceImpl.getOpeningModeSchedule((com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>) responseObserver);
          break;
        case METHODID_LIST_OPENING_MODE_SCHEDULES:
          serviceImpl.listOpeningModeSchedules((com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OPENING_MODE_SCHEDULE:
          serviceImpl.updateOpeningModeSchedule((com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>) responseObserver);
          break;
        case METHODID_DELETE_OPENING_MODE_SCHEDULE:
          serviceImpl.deleteOpeningModeSchedule((com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest) request,
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
          getCreateOpeningModeScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.openingmodeschedule.v1.CreateOpeningModeScheduleRequest,
              com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>(
                service, METHODID_CREATE_OPENING_MODE_SCHEDULE)))
        .addMethod(
          getGetOpeningModeScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.openingmodeschedule.v1.GetOpeningModeScheduleRequest,
              com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>(
                service, METHODID_GET_OPENING_MODE_SCHEDULE)))
        .addMethod(
          getListOpeningModeSchedulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesRequest,
              com.saltoapis.nebula.openingmodeschedule.v1.ListOpeningModeSchedulesResponse>(
                service, METHODID_LIST_OPENING_MODE_SCHEDULES)))
        .addMethod(
          getUpdateOpeningModeScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.openingmodeschedule.v1.UpdateOpeningModeScheduleRequest,
              com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeSchedule>(
                service, METHODID_UPDATE_OPENING_MODE_SCHEDULE)))
        .addMethod(
          getDeleteOpeningModeScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.openingmodeschedule.v1.DeleteOpeningModeScheduleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_OPENING_MODE_SCHEDULE)))
        .build();
  }

  private static abstract class OpeningModeScheduleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OpeningModeScheduleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.openingmodeschedule.v1.OpeningModeScheduleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OpeningModeScheduleService");
    }
  }

  private static final class OpeningModeScheduleServiceFileDescriptorSupplier
      extends OpeningModeScheduleServiceBaseDescriptorSupplier {
    OpeningModeScheduleServiceFileDescriptorSupplier() {}
  }

  private static final class OpeningModeScheduleServiceMethodDescriptorSupplier
      extends OpeningModeScheduleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OpeningModeScheduleServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OpeningModeScheduleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OpeningModeScheduleServiceFileDescriptorSupplier())
              .addMethod(getCreateOpeningModeScheduleMethod())
              .addMethod(getGetOpeningModeScheduleMethod())
              .addMethod(getListOpeningModeSchedulesMethod())
              .addMethod(getUpdateOpeningModeScheduleMethod())
              .addMethod(getDeleteOpeningModeScheduleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
