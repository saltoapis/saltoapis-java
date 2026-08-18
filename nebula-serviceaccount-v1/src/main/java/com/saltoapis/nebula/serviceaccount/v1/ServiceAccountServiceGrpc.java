package com.saltoapis.nebula.serviceaccount.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service account is a specialized account used by applications or services to
 * authenticate and interact with other applications or services, providing a secure
 * and controlled way to manage access to resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/serviceaccount/v1/service_account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceAccountServiceGrpc {

  private ServiceAccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.serviceaccount.v1.ServiceAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getCreateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccount",
      requestType = com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getCreateServiceAccountMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getCreateServiceAccountMethod;
    if ((getCreateServiceAccountMethod = ServiceAccountServiceGrpc.getCreateServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getCreateServiceAccountMethod = ServiceAccountServiceGrpc.getCreateServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getCreateServiceAccountMethod = getCreateServiceAccountMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("CreateServiceAccount"))
              .build();
        }
      }
    }
    return getCreateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getGetServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccount",
      requestType = com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getGetServiceAccountMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getGetServiceAccountMethod;
    if ((getGetServiceAccountMethod = ServiceAccountServiceGrpc.getGetServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getGetServiceAccountMethod = ServiceAccountServiceGrpc.getGetServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getGetServiceAccountMethod = getGetServiceAccountMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("GetServiceAccount"))
              .build();
        }
      }
    }
    return getGetServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest,
      com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse> getListServiceAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccounts",
      requestType = com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest,
      com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse> getListServiceAccountsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest, com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse> getListServiceAccountsMethod;
    if ((getListServiceAccountsMethod = ServiceAccountServiceGrpc.getListServiceAccountsMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getListServiceAccountsMethod = ServiceAccountServiceGrpc.getListServiceAccountsMethod) == null) {
          ServiceAccountServiceGrpc.getListServiceAccountsMethod = getListServiceAccountsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest, com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("ListServiceAccounts"))
              .build();
        }
      }
    }
    return getListServiceAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getUpdateServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceAccount",
      requestType = com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ServiceAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getUpdateServiceAccountMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getUpdateServiceAccountMethod;
    if ((getUpdateServiceAccountMethod = ServiceAccountServiceGrpc.getUpdateServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getUpdateServiceAccountMethod = ServiceAccountServiceGrpc.getUpdateServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getUpdateServiceAccountMethod = getUpdateServiceAccountMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ServiceAccount.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("UpdateServiceAccount"))
              .build();
        }
      }
    }
    return getUpdateServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccount",
      requestType = com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest, com.google.protobuf.Empty> getDeleteServiceAccountMethod;
    if ((getDeleteServiceAccountMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getDeleteServiceAccountMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountMethod) == null) {
          ServiceAccountServiceGrpc.getDeleteServiceAccountMethod = getDeleteServiceAccountMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("DeleteServiceAccount"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getCreateServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServiceAccountKey",
      requestType = com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getCreateServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getCreateServiceAccountKeyMethod;
    if ((getCreateServiceAccountKeyMethod = ServiceAccountServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getCreateServiceAccountKeyMethod = ServiceAccountServiceGrpc.getCreateServiceAccountKeyMethod) == null) {
          ServiceAccountServiceGrpc.getCreateServiceAccountKeyMethod = getCreateServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("CreateServiceAccountKey"))
              .build();
        }
      }
    }
    return getCreateServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getGetServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceAccountKey",
      requestType = com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest,
      com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getGetServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getGetServiceAccountKeyMethod;
    if ((getGetServiceAccountKeyMethod = ServiceAccountServiceGrpc.getGetServiceAccountKeyMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getGetServiceAccountKeyMethod = ServiceAccountServiceGrpc.getGetServiceAccountKeyMethod) == null) {
          ServiceAccountServiceGrpc.getGetServiceAccountKeyMethod = getGetServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest, com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("GetServiceAccountKey"))
              .build();
        }
      }
    }
    return getGetServiceAccountKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest,
      com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServiceAccountKeys",
      requestType = com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest.class,
      responseType = com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest,
      com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest, com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse> getListServiceAccountKeysMethod;
    if ((getListServiceAccountKeysMethod = ServiceAccountServiceGrpc.getListServiceAccountKeysMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getListServiceAccountKeysMethod = ServiceAccountServiceGrpc.getListServiceAccountKeysMethod) == null) {
          ServiceAccountServiceGrpc.getListServiceAccountKeysMethod = getListServiceAccountKeysMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest, com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServiceAccountKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("ListServiceAccountKeys"))
              .build();
        }
      }
    }
    return getListServiceAccountKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServiceAccountKey",
      requestType = com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty> getDeleteServiceAccountKeyMethod;
    if ((getDeleteServiceAccountKeyMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
      synchronized (ServiceAccountServiceGrpc.class) {
        if ((getDeleteServiceAccountKeyMethod = ServiceAccountServiceGrpc.getDeleteServiceAccountKeyMethod) == null) {
          ServiceAccountServiceGrpc.getDeleteServiceAccountKeyMethod = getDeleteServiceAccountKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServiceAccountKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceAccountServiceMethodDescriptorSupplier("DeleteServiceAccountKey"))
              .build();
        }
      }
    }
    return getDeleteServiceAccountKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceStub>() {
        @java.lang.Override
        public ServiceAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAccountServiceStub(channel, callOptions);
        }
      };
    return ServiceAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceBlockingStub>() {
        @java.lang.Override
        public ServiceAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceAccountServiceFutureStub>() {
        @java.lang.Override
        public ServiceAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceAccountServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service account is a specialized account used by applications or services to
   * authenticate and interact with other applications or services, providing a secure
   * and controlled way to manage access to resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a service account
     * Creates a new service account.
     * </pre>
     */
    default void createServiceAccount(com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a service account
     * Retrieves an existing service account.
     * </pre>
     */
    default void getServiceAccount(com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * List service accounts
     * Returns a list of service accounts that have been previously created.
     * </pre>
     */
    default void listServiceAccounts(com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServiceAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the service account
     * Updates the existing service account.
     * </pre>
     */
    default void updateServiceAccount(com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a service account
     * Permanently deletes a service account. This cannot be undone.
     * </pre>
     */
    default void deleteServiceAccount(com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a service account key
     * Creates a new service account key.
     * </pre>
     */
    default void createServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a service account key
     * Retrieves a specific service account key by its resource name.
     * </pre>
     */
    default void getServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceAccountKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List service account keys
     * Returns a list of keys for a service account.
     * </pre>
     */
    default void listServiceAccountKeys(com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServiceAccountKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a service account key
     * Permanently deletes a service account key.
     * </pre>
     */
    default void deleteServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceAccountKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceAccountService.
   * <pre>
   * A service account is a specialized account used by applications or services to
   * authenticate and interact with other applications or services, providing a secure
   * and controlled way to manage access to resources.
   * </pre>
   */
  public static abstract class ServiceAccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceAccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceAccountService.
   * <pre>
   * A service account is a specialized account used by applications or services to
   * authenticate and interact with other applications or services, providing a secure
   * and controlled way to manage access to resources.
   * </pre>
   */
  public static final class ServiceAccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceAccountServiceStub> {
    private ServiceAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a service account
     * Creates a new service account.
     * </pre>
     */
    public void createServiceAccount(com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a service account
     * Retrieves an existing service account.
     * </pre>
     */
    public void getServiceAccount(com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List service accounts
     * Returns a list of service accounts that have been previously created.
     * </pre>
     */
    public void listServiceAccounts(com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the service account
     * Updates the existing service account.
     * </pre>
     */
    public void updateServiceAccount(com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a service account
     * Permanently deletes a service account. This cannot be undone.
     * </pre>
     */
    public void deleteServiceAccount(com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a service account key
     * Creates a new service account key.
     * </pre>
     */
    public void createServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a service account key
     * Retrieves a specific service account key by its resource name.
     * </pre>
     */
    public void getServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List service account keys
     * Returns a list of keys for a service account.
     * </pre>
     */
    public void listServiceAccountKeys(com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a service account key
     * Permanently deletes a service account key.
     * </pre>
     */
    public void deleteServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceAccountService.
   * <pre>
   * A service account is a specialized account used by applications or services to
   * authenticate and interact with other applications or services, providing a secure
   * and controlled way to manage access to resources.
   * </pre>
   */
  public static final class ServiceAccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceAccountServiceBlockingStub> {
    private ServiceAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a service account
     * Creates a new service account.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ServiceAccount createServiceAccount(com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a service account
     * Retrieves an existing service account.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ServiceAccount getServiceAccount(com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List service accounts
     * Returns a list of service accounts that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse listServiceAccounts(com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServiceAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the service account
     * Updates the existing service account.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ServiceAccount updateServiceAccount(com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a service account
     * Permanently deletes a service account. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccount(com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a service account key
     * Creates a new service account key.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey createServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a service account key
     * Retrieves a specific service account key by its resource name.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey getServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceAccountKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List service account keys
     * Returns a list of keys for a service account.
     * </pre>
     */
    public com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse listServiceAccountKeys(com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServiceAccountKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a service account key
     * Permanently deletes a service account key.
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccountKey(com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceAccountKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceAccountService.
   * <pre>
   * A service account is a specialized account used by applications or services to
   * authenticate and interact with other applications or services, providing a secure
   * and controlled way to manage access to resources.
   * </pre>
   */
  public static final class ServiceAccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceAccountServiceFutureStub> {
    private ServiceAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a service account
     * Creates a new service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> createServiceAccount(
        com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a service account
     * Retrieves an existing service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> getServiceAccount(
        com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List service accounts
     * Returns a list of service accounts that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse> listServiceAccounts(
        com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServiceAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the service account
     * Updates the existing service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount> updateServiceAccount(
        com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a service account
     * Permanently deletes a service account. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccount(
        com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a service account key
     * Creates a new service account key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> createServiceAccountKey(
        com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a service account key
     * Retrieves a specific service account key by its resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey> getServiceAccountKey(
        com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceAccountKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List service account keys
     * Returns a list of keys for a service account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse> listServiceAccountKeys(
        com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServiceAccountKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a service account key
     * Permanently deletes a service account key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccountKey(
        com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceAccountKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 0;
  private static final int METHODID_GET_SERVICE_ACCOUNT = 1;
  private static final int METHODID_LIST_SERVICE_ACCOUNTS = 2;
  private static final int METHODID_UPDATE_SERVICE_ACCOUNT = 3;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 4;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_KEY = 5;
  private static final int METHODID_GET_SERVICE_ACCOUNT_KEY = 6;
  private static final int METHODID_LIST_SERVICE_ACCOUNT_KEYS = 7;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_KEY = 8;

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
        case METHODID_CREATE_SERVICE_ACCOUNT:
          serviceImpl.createServiceAccount((com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT:
          serviceImpl.getServiceAccount((com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNTS:
          serviceImpl.listServiceAccounts((com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_ACCOUNT:
          serviceImpl.updateServiceAccount((com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT:
          serviceImpl.deleteServiceAccount((com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT_KEY:
          serviceImpl.createServiceAccountKey((com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_KEY:
          serviceImpl.getServiceAccountKey((com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNT_KEYS:
          serviceImpl.listServiceAccountKeys((com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_KEY:
          serviceImpl.deleteServiceAccountKey((com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest) request,
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
          getCreateServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountRequest,
              com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>(
                service, METHODID_CREATE_SERVICE_ACCOUNT)))
        .addMethod(
          getGetServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountRequest,
              com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>(
                service, METHODID_GET_SERVICE_ACCOUNT)))
        .addMethod(
          getListServiceAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsRequest,
              com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountsResponse>(
                service, METHODID_LIST_SERVICE_ACCOUNTS)))
        .addMethod(
          getUpdateServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.UpdateServiceAccountRequest,
              com.saltoapis.nebula.serviceaccount.v1.ServiceAccount>(
                service, METHODID_UPDATE_SERVICE_ACCOUNT)))
        .addMethod(
          getDeleteServiceAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SERVICE_ACCOUNT)))
        .addMethod(
          getCreateServiceAccountKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.CreateServiceAccountKeyRequest,
              com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey>(
                service, METHODID_CREATE_SERVICE_ACCOUNT_KEY)))
        .addMethod(
          getGetServiceAccountKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.GetServiceAccountKeyRequest,
              com.saltoapis.nebula.serviceaccount.v1.ServiceAccountKey>(
                service, METHODID_GET_SERVICE_ACCOUNT_KEY)))
        .addMethod(
          getListServiceAccountKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysRequest,
              com.saltoapis.nebula.serviceaccount.v1.ListServiceAccountKeysResponse>(
                service, METHODID_LIST_SERVICE_ACCOUNT_KEYS)))
        .addMethod(
          getDeleteServiceAccountKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.serviceaccount.v1.DeleteServiceAccountKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SERVICE_ACCOUNT_KEY)))
        .build();
  }

  private static abstract class ServiceAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.serviceaccount.v1.ServiceAccountProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceAccountService");
    }
  }

  private static final class ServiceAccountServiceFileDescriptorSupplier
      extends ServiceAccountServiceBaseDescriptorSupplier {
    ServiceAccountServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceAccountServiceMethodDescriptorSupplier
      extends ServiceAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceAccountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceAccountServiceFileDescriptorSupplier())
              .addMethod(getCreateServiceAccountMethod())
              .addMethod(getGetServiceAccountMethod())
              .addMethod(getListServiceAccountsMethod())
              .addMethod(getUpdateServiceAccountMethod())
              .addMethod(getDeleteServiceAccountMethod())
              .addMethod(getCreateServiceAccountKeyMethod())
              .addMethod(getGetServiceAccountKeyMethod())
              .addMethod(getListServiceAccountKeysMethod())
              .addMethod(getDeleteServiceAccountKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
