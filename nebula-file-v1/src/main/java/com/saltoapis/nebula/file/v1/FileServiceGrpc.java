package com.saltoapis.nebula.file.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A file represents an object that serves as a reference for files
 * stored elsewhere. This service is responsible for managing file resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/file/v1/file.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileServiceGrpc {

  private FileServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.file.v1.FileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.file.v1.CreateFileRequest,
      com.saltoapis.nebula.file.v1.File> getCreateFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFile",
      requestType = com.saltoapis.nebula.file.v1.CreateFileRequest.class,
      responseType = com.saltoapis.nebula.file.v1.File.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.file.v1.CreateFileRequest,
      com.saltoapis.nebula.file.v1.File> getCreateFileMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.file.v1.CreateFileRequest, com.saltoapis.nebula.file.v1.File> getCreateFileMethod;
    if ((getCreateFileMethod = FileServiceGrpc.getCreateFileMethod) == null) {
      synchronized (FileServiceGrpc.class) {
        if ((getCreateFileMethod = FileServiceGrpc.getCreateFileMethod) == null) {
          FileServiceGrpc.getCreateFileMethod = getCreateFileMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.file.v1.CreateFileRequest, com.saltoapis.nebula.file.v1.File>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.file.v1.CreateFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.file.v1.File.getDefaultInstance()))
              .setSchemaDescriptor(new FileServiceMethodDescriptorSupplier("CreateFile"))
              .build();
        }
      }
    }
    return getCreateFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceStub>() {
        @java.lang.Override
        public FileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceStub(channel, callOptions);
        }
      };
    return FileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceBlockingStub>() {
        @java.lang.Override
        public FileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceBlockingStub(channel, callOptions);
        }
      };
    return FileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileServiceFutureStub>() {
        @java.lang.Override
        public FileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileServiceFutureStub(channel, callOptions);
        }
      };
    return FileServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A file represents an object that serves as a reference for files
   * stored elsewhere. This service is responsible for managing file resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a file
     * Creates a new file.
     * </pre>
     */
    default void createFile(com.saltoapis.nebula.file.v1.CreateFileRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.file.v1.File> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFileMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FileService.
   * <pre>
   * A file represents an object that serves as a reference for files
   * stored elsewhere. This service is responsible for managing file resources.
   * </pre>
   */
  public static abstract class FileServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FileServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FileService.
   * <pre>
   * A file represents an object that serves as a reference for files
   * stored elsewhere. This service is responsible for managing file resources.
   * </pre>
   */
  public static final class FileServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FileServiceStub> {
    private FileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a file
     * Creates a new file.
     * </pre>
     */
    public void createFile(com.saltoapis.nebula.file.v1.CreateFileRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.file.v1.File> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FileService.
   * <pre>
   * A file represents an object that serves as a reference for files
   * stored elsewhere. This service is responsible for managing file resources.
   * </pre>
   */
  public static final class FileServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FileServiceBlockingStub> {
    private FileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a file
     * Creates a new file.
     * </pre>
     */
    public com.saltoapis.nebula.file.v1.File createFile(com.saltoapis.nebula.file.v1.CreateFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FileService.
   * <pre>
   * A file represents an object that serves as a reference for files
   * stored elsewhere. This service is responsible for managing file resources.
   * </pre>
   */
  public static final class FileServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FileServiceFutureStub> {
    private FileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a file
     * Creates a new file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.file.v1.File> createFile(
        com.saltoapis.nebula.file.v1.CreateFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FILE = 0;

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
        case METHODID_CREATE_FILE:
          serviceImpl.createFile((com.saltoapis.nebula.file.v1.CreateFileRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.file.v1.File>) responseObserver);
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
          getCreateFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.file.v1.CreateFileRequest,
              com.saltoapis.nebula.file.v1.File>(
                service, METHODID_CREATE_FILE)))
        .build();
  }

  private static abstract class FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.file.v1.FileProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileService");
    }
  }

  private static final class FileServiceFileDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier {
    FileServiceFileDescriptorSupplier() {}
  }

  private static final class FileServiceMethodDescriptorSupplier
      extends FileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FileServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileServiceFileDescriptorSupplier())
              .addMethod(getCreateFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
