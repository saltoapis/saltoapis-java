package com.saltoapis.nebula.installation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service is responsible for the ingestion of encrypted payloads.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/installation/v1/encrypted_payload.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EncryptedPayloadServiceGrpc {

  private EncryptedPayloadServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.installation.v1.EncryptedPayloadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest,
      com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse> getIngestEncryptedPayloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IngestEncryptedPayloads",
      requestType = com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest,
      com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse> getIngestEncryptedPayloadsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest, com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse> getIngestEncryptedPayloadsMethod;
    if ((getIngestEncryptedPayloadsMethod = EncryptedPayloadServiceGrpc.getIngestEncryptedPayloadsMethod) == null) {
      synchronized (EncryptedPayloadServiceGrpc.class) {
        if ((getIngestEncryptedPayloadsMethod = EncryptedPayloadServiceGrpc.getIngestEncryptedPayloadsMethod) == null) {
          EncryptedPayloadServiceGrpc.getIngestEncryptedPayloadsMethod = getIngestEncryptedPayloadsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest, com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IngestEncryptedPayloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EncryptedPayloadServiceMethodDescriptorSupplier("IngestEncryptedPayloads"))
              .build();
        }
      }
    }
    return getIngestEncryptedPayloadsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EncryptedPayloadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncryptedPayloadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncryptedPayloadServiceStub>() {
        @java.lang.Override
        public EncryptedPayloadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncryptedPayloadServiceStub(channel, callOptions);
        }
      };
    return EncryptedPayloadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EncryptedPayloadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncryptedPayloadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncryptedPayloadServiceBlockingStub>() {
        @java.lang.Override
        public EncryptedPayloadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncryptedPayloadServiceBlockingStub(channel, callOptions);
        }
      };
    return EncryptedPayloadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EncryptedPayloadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EncryptedPayloadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EncryptedPayloadServiceFutureStub>() {
        @java.lang.Override
        public EncryptedPayloadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EncryptedPayloadServiceFutureStub(channel, callOptions);
        }
      };
    return EncryptedPayloadServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service is responsible for the ingestion of encrypted payloads.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Ingest encrypted payloads
     * Ingests encrypted payload for a given installation.
     * </pre>
     */
    default void ingestEncryptedPayloads(com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIngestEncryptedPayloadsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EncryptedPayloadService.
   * <pre>
   * This service is responsible for the ingestion of encrypted payloads.
   * </pre>
   */
  public static abstract class EncryptedPayloadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EncryptedPayloadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EncryptedPayloadService.
   * <pre>
   * This service is responsible for the ingestion of encrypted payloads.
   * </pre>
   */
  public static final class EncryptedPayloadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EncryptedPayloadServiceStub> {
    private EncryptedPayloadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncryptedPayloadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncryptedPayloadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ingest encrypted payloads
     * Ingests encrypted payload for a given installation.
     * </pre>
     */
    public void ingestEncryptedPayloads(com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIngestEncryptedPayloadsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EncryptedPayloadService.
   * <pre>
   * This service is responsible for the ingestion of encrypted payloads.
   * </pre>
   */
  public static final class EncryptedPayloadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EncryptedPayloadServiceBlockingStub> {
    private EncryptedPayloadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncryptedPayloadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncryptedPayloadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ingest encrypted payloads
     * Ingests encrypted payload for a given installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse ingestEncryptedPayloads(com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIngestEncryptedPayloadsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EncryptedPayloadService.
   * <pre>
   * This service is responsible for the ingestion of encrypted payloads.
   * </pre>
   */
  public static final class EncryptedPayloadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EncryptedPayloadServiceFutureStub> {
    private EncryptedPayloadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EncryptedPayloadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EncryptedPayloadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ingest encrypted payloads
     * Ingests encrypted payload for a given installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse> ingestEncryptedPayloads(
        com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIngestEncryptedPayloadsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INGEST_ENCRYPTED_PAYLOADS = 0;

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
        case METHODID_INGEST_ENCRYPTED_PAYLOADS:
          serviceImpl.ingestEncryptedPayloads((com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse>) responseObserver);
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
          getIngestEncryptedPayloadsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsRequest,
              com.saltoapis.nebula.installation.v1.IngestEncryptedPayloadsResponse>(
                service, METHODID_INGEST_ENCRYPTED_PAYLOADS)))
        .build();
  }

  private static abstract class EncryptedPayloadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EncryptedPayloadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.installation.v1.EncryptedPayloadProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EncryptedPayloadService");
    }
  }

  private static final class EncryptedPayloadServiceFileDescriptorSupplier
      extends EncryptedPayloadServiceBaseDescriptorSupplier {
    EncryptedPayloadServiceFileDescriptorSupplier() {}
  }

  private static final class EncryptedPayloadServiceMethodDescriptorSupplier
      extends EncryptedPayloadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EncryptedPayloadServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EncryptedPayloadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EncryptedPayloadServiceFileDescriptorSupplier())
              .addMethod(getIngestEncryptedPayloadsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
