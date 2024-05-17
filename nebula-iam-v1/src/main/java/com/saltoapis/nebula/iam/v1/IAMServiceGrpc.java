package com.saltoapis.nebula.iam.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Identity and Access Management (IAM) is a service that allows you to securely
 * control user access to specific resources. IAM gives you full control and
 * visibility to manage resources centrally. You grant roles to users by
 * creating an IAM policy which is a collection of permissions that define who
 * has what type of access.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: salto/nebula/iam/v1/iam.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IAMServiceGrpc {

  private IAMServiceGrpc() {}

  public static final String SERVICE_NAME = "salto.nebula.iam.v1.IAMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.iam.v1.GetRoleRequest,
      com.saltoapis.nebula.iam.v1.Role> getGetRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRole",
      requestType = com.saltoapis.nebula.iam.v1.GetRoleRequest.class,
      responseType = com.saltoapis.nebula.iam.v1.Role.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.iam.v1.GetRoleRequest,
      com.saltoapis.nebula.iam.v1.Role> getGetRoleMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.iam.v1.GetRoleRequest, com.saltoapis.nebula.iam.v1.Role> getGetRoleMethod;
    if ((getGetRoleMethod = IAMServiceGrpc.getGetRoleMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getGetRoleMethod = IAMServiceGrpc.getGetRoleMethod) == null) {
          IAMServiceGrpc.getGetRoleMethod = getGetRoleMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.iam.v1.GetRoleRequest, com.saltoapis.nebula.iam.v1.Role>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.iam.v1.GetRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.iam.v1.Role.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.iam.v1.ListRolesRequest,
      com.saltoapis.nebula.iam.v1.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = com.saltoapis.nebula.iam.v1.ListRolesRequest.class,
      responseType = com.saltoapis.nebula.iam.v1.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.iam.v1.ListRolesRequest,
      com.saltoapis.nebula.iam.v1.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.iam.v1.ListRolesRequest, com.saltoapis.nebula.iam.v1.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = IAMServiceGrpc.getListRolesMethod) == null) {
      synchronized (IAMServiceGrpc.class) {
        if ((getListRolesMethod = IAMServiceGrpc.getListRolesMethod) == null) {
          IAMServiceGrpc.getListRolesMethod = getListRolesMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.iam.v1.ListRolesRequest, com.saltoapis.nebula.iam.v1.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.iam.v1.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.iam.v1.ListRolesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListRolesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IAMServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceStub>() {
        @java.lang.Override
        public IAMServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceStub(channel, callOptions);
        }
      };
    return IAMServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IAMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceBlockingStub>() {
        @java.lang.Override
        public IAMServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceBlockingStub(channel, callOptions);
        }
      };
    return IAMServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IAMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IAMServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IAMServiceFutureStub>() {
        @java.lang.Override
        public IAMServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IAMServiceFutureStub(channel, callOptions);
        }
      };
    return IAMServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Identity and Access Management (IAM) is a service that allows you to securely
   * control user access to specific resources. IAM gives you full control and
   * visibility to manage resources centrally. You grant roles to users by
   * creating an IAM policy which is a collection of permissions that define who
   * has what type of access.
   * </pre>
   */
  public static abstract class IAMServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get a role
     * Gets an existing role.
     * </pre>
     */
    public void getRole(com.saltoapis.nebula.iam.v1.GetRoleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.iam.v1.Role> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * List roles
     * Returns a list of roles that have been previously created.
     * </pre>
     */
    public void listRoles(com.saltoapis.nebula.iam.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.iam.v1.ListRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.iam.v1.GetRoleRequest,
                com.saltoapis.nebula.iam.v1.Role>(
                  this, METHODID_GET_ROLE)))
          .addMethod(
            getListRolesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.iam.v1.ListRolesRequest,
                com.saltoapis.nebula.iam.v1.ListRolesResponse>(
                  this, METHODID_LIST_ROLES)))
          .build();
    }
  }

  /**
   * <pre>
   * Identity and Access Management (IAM) is a service that allows you to securely
   * control user access to specific resources. IAM gives you full control and
   * visibility to manage resources centrally. You grant roles to users by
   * creating an IAM policy which is a collection of permissions that define who
   * has what type of access.
   * </pre>
   */
  public static final class IAMServiceStub extends io.grpc.stub.AbstractAsyncStub<IAMServiceStub> {
    private IAMServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a role
     * Gets an existing role.
     * </pre>
     */
    public void getRole(com.saltoapis.nebula.iam.v1.GetRoleRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.iam.v1.Role> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List roles
     * Returns a list of roles that have been previously created.
     * </pre>
     */
    public void listRoles(com.saltoapis.nebula.iam.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.iam.v1.ListRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Identity and Access Management (IAM) is a service that allows you to securely
   * control user access to specific resources. IAM gives you full control and
   * visibility to manage resources centrally. You grant roles to users by
   * creating an IAM policy which is a collection of permissions that define who
   * has what type of access.
   * </pre>
   */
  public static final class IAMServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IAMServiceBlockingStub> {
    private IAMServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a role
     * Gets an existing role.
     * </pre>
     */
    public com.saltoapis.nebula.iam.v1.Role getRole(com.saltoapis.nebula.iam.v1.GetRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List roles
     * Returns a list of roles that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.iam.v1.ListRolesResponse listRoles(com.saltoapis.nebula.iam.v1.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Identity and Access Management (IAM) is a service that allows you to securely
   * control user access to specific resources. IAM gives you full control and
   * visibility to manage resources centrally. You grant roles to users by
   * creating an IAM policy which is a collection of permissions that define who
   * has what type of access.
   * </pre>
   */
  public static final class IAMServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IAMServiceFutureStub> {
    private IAMServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IAMServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a role
     * Gets an existing role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.iam.v1.Role> getRole(
        com.saltoapis.nebula.iam.v1.GetRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List roles
     * Returns a list of roles that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.iam.v1.ListRolesResponse> listRoles(
        com.saltoapis.nebula.iam.v1.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROLE = 0;
  private static final int METHODID_LIST_ROLES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IAMServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IAMServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROLE:
          serviceImpl.getRole((com.saltoapis.nebula.iam.v1.GetRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.iam.v1.Role>) responseObserver);
          break;
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((com.saltoapis.nebula.iam.v1.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.iam.v1.ListRolesResponse>) responseObserver);
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
      synchronized (IAMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetRoleMethod())
              .addMethod(getListRolesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
