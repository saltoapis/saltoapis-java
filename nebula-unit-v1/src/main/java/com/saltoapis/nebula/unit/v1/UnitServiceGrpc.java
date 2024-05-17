package com.saltoapis.nebula.unit.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UnitService is the service responsible for managing unit resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: salto/nebula/unit/v1/unit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UnitServiceGrpc {

  private UnitServiceGrpc() {}

  public static final String SERVICE_NAME = "salto.nebula.unit.v1.UnitService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CreateUnitRequest,
      com.saltoapis.nebula.unit.v1.Unit> getCreateUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUnit",
      requestType = com.saltoapis.nebula.unit.v1.CreateUnitRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.Unit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CreateUnitRequest,
      com.saltoapis.nebula.unit.v1.Unit> getCreateUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CreateUnitRequest, com.saltoapis.nebula.unit.v1.Unit> getCreateUnitMethod;
    if ((getCreateUnitMethod = UnitServiceGrpc.getCreateUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getCreateUnitMethod = UnitServiceGrpc.getCreateUnitMethod) == null) {
          UnitServiceGrpc.getCreateUnitMethod = getCreateUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.CreateUnitRequest, com.saltoapis.nebula.unit.v1.Unit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CreateUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.GetUnitRequest,
      com.saltoapis.nebula.unit.v1.Unit> getGetUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnit",
      requestType = com.saltoapis.nebula.unit.v1.GetUnitRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.Unit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.GetUnitRequest,
      com.saltoapis.nebula.unit.v1.Unit> getGetUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.GetUnitRequest, com.saltoapis.nebula.unit.v1.Unit> getGetUnitMethod;
    if ((getGetUnitMethod = UnitServiceGrpc.getGetUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getGetUnitMethod = UnitServiceGrpc.getGetUnitMethod) == null) {
          UnitServiceGrpc.getGetUnitMethod = getGetUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.GetUnitRequest, com.saltoapis.nebula.unit.v1.Unit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.GetUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.ListUnitsRequest,
      com.saltoapis.nebula.unit.v1.ListUnitsResponse> getListUnitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUnits",
      requestType = com.saltoapis.nebula.unit.v1.ListUnitsRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.ListUnitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.ListUnitsRequest,
      com.saltoapis.nebula.unit.v1.ListUnitsResponse> getListUnitsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.ListUnitsRequest, com.saltoapis.nebula.unit.v1.ListUnitsResponse> getListUnitsMethod;
    if ((getListUnitsMethod = UnitServiceGrpc.getListUnitsMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getListUnitsMethod = UnitServiceGrpc.getListUnitsMethod) == null) {
          UnitServiceGrpc.getListUnitsMethod = getListUnitsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.ListUnitsRequest, com.saltoapis.nebula.unit.v1.ListUnitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUnits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListUnitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListUnitsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListUnitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.UpdateUnitRequest,
      com.saltoapis.nebula.unit.v1.Unit> getUpdateUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUnit",
      requestType = com.saltoapis.nebula.unit.v1.UpdateUnitRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.Unit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.UpdateUnitRequest,
      com.saltoapis.nebula.unit.v1.Unit> getUpdateUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.UpdateUnitRequest, com.saltoapis.nebula.unit.v1.Unit> getUpdateUnitMethod;
    if ((getUpdateUnitMethod = UnitServiceGrpc.getUpdateUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getUpdateUnitMethod = UnitServiceGrpc.getUpdateUnitMethod) == null) {
          UnitServiceGrpc.getUpdateUnitMethod = getUpdateUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.UpdateUnitRequest, com.saltoapis.nebula.unit.v1.Unit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.UpdateUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.DeleteUnitRequest,
      com.google.protobuf.Empty> getDeleteUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUnit",
      requestType = com.saltoapis.nebula.unit.v1.DeleteUnitRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.DeleteUnitRequest,
      com.google.protobuf.Empty> getDeleteUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.DeleteUnitRequest, com.google.protobuf.Empty> getDeleteUnitMethod;
    if ((getDeleteUnitMethod = UnitServiceGrpc.getDeleteUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getDeleteUnitMethod = UnitServiceGrpc.getDeleteUnitMethod) == null) {
          UnitServiceGrpc.getDeleteUnitMethod = getDeleteUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.DeleteUnitRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.DeleteUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CleanOutUnitRequest,
      com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> getCleanOutUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanOutUnit",
      requestType = com.saltoapis.nebula.unit.v1.CleanOutUnitRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.CleanOutUnitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CleanOutUnitRequest,
      com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> getCleanOutUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CleanOutUnitRequest, com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> getCleanOutUnitMethod;
    if ((getCleanOutUnitMethod = UnitServiceGrpc.getCleanOutUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getCleanOutUnitMethod = UnitServiceGrpc.getCleanOutUnitMethod) == null) {
          UnitServiceGrpc.getCleanOutUnitMethod = getCleanOutUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.CleanOutUnitRequest, com.saltoapis.nebula.unit.v1.CleanOutUnitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanOutUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CleanOutUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CleanOutUnitResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCleanOutUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CreatePolicyRequest,
      com.saltoapis.nebula.unit.v1.Policy> getCreatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePolicy",
      requestType = com.saltoapis.nebula.unit.v1.CreatePolicyRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CreatePolicyRequest,
      com.saltoapis.nebula.unit.v1.Policy> getCreatePolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.CreatePolicyRequest, com.saltoapis.nebula.unit.v1.Policy> getCreatePolicyMethod;
    if ((getCreatePolicyMethod = UnitServiceGrpc.getCreatePolicyMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getCreatePolicyMethod = UnitServiceGrpc.getCreatePolicyMethod) == null) {
          UnitServiceGrpc.getCreatePolicyMethod = getCreatePolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.CreatePolicyRequest, com.saltoapis.nebula.unit.v1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CreatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.GetPolicyRequest,
      com.saltoapis.nebula.unit.v1.Policy> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = com.saltoapis.nebula.unit.v1.GetPolicyRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.GetPolicyRequest,
      com.saltoapis.nebula.unit.v1.Policy> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.GetPolicyRequest, com.saltoapis.nebula.unit.v1.Policy> getGetPolicyMethod;
    if ((getGetPolicyMethod = UnitServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getGetPolicyMethod = UnitServiceGrpc.getGetPolicyMethod) == null) {
          UnitServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.GetPolicyRequest, com.saltoapis.nebula.unit.v1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.ListPoliciesRequest,
      com.saltoapis.nebula.unit.v1.ListPoliciesResponse> getListPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPolicies",
      requestType = com.saltoapis.nebula.unit.v1.ListPoliciesRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.ListPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.ListPoliciesRequest,
      com.saltoapis.nebula.unit.v1.ListPoliciesResponse> getListPoliciesMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.ListPoliciesRequest, com.saltoapis.nebula.unit.v1.ListPoliciesResponse> getListPoliciesMethod;
    if ((getListPoliciesMethod = UnitServiceGrpc.getListPoliciesMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getListPoliciesMethod = UnitServiceGrpc.getListPoliciesMethod) == null) {
          UnitServiceGrpc.getListPoliciesMethod = getListPoliciesMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.ListPoliciesRequest, com.saltoapis.nebula.unit.v1.ListPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListPoliciesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.UpdatePolicyRequest,
      com.saltoapis.nebula.unit.v1.Policy> getUpdatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePolicy",
      requestType = com.saltoapis.nebula.unit.v1.UpdatePolicyRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.UpdatePolicyRequest,
      com.saltoapis.nebula.unit.v1.Policy> getUpdatePolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.UpdatePolicyRequest, com.saltoapis.nebula.unit.v1.Policy> getUpdatePolicyMethod;
    if ((getUpdatePolicyMethod = UnitServiceGrpc.getUpdatePolicyMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getUpdatePolicyMethod = UnitServiceGrpc.getUpdatePolicyMethod) == null) {
          UnitServiceGrpc.getUpdatePolicyMethod = getUpdatePolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.UpdatePolicyRequest, com.saltoapis.nebula.unit.v1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.UpdatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.DeletePolicyRequest,
      com.google.protobuf.Empty> getDeletePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePolicy",
      requestType = com.saltoapis.nebula.unit.v1.DeletePolicyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.DeletePolicyRequest,
      com.google.protobuf.Empty> getDeletePolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.DeletePolicyRequest, com.google.protobuf.Empty> getDeletePolicyMethod;
    if ((getDeletePolicyMethod = UnitServiceGrpc.getDeletePolicyMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getDeletePolicyMethod = UnitServiceGrpc.getDeletePolicyMethod) == null) {
          UnitServiceGrpc.getDeletePolicyMethod = getDeletePolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.DeletePolicyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.DeletePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeletePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.TestPermissionsRequest,
      com.saltoapis.nebula.unit.v1.TestPermissionsResponse> getTestPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestPermissions",
      requestType = com.saltoapis.nebula.unit.v1.TestPermissionsRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.TestPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.TestPermissionsRequest,
      com.saltoapis.nebula.unit.v1.TestPermissionsResponse> getTestPermissionsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.TestPermissionsRequest, com.saltoapis.nebula.unit.v1.TestPermissionsResponse> getTestPermissionsMethod;
    if ((getTestPermissionsMethod = UnitServiceGrpc.getTestPermissionsMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getTestPermissionsMethod = UnitServiceGrpc.getTestPermissionsMethod) == null) {
          UnitServiceGrpc.getTestPermissionsMethod = getTestPermissionsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.TestPermissionsRequest, com.saltoapis.nebula.unit.v1.TestPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.TestPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.TestPermissionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTestPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UnitServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UnitServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UnitServiceStub>() {
        @java.lang.Override
        public UnitServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UnitServiceStub(channel, callOptions);
        }
      };
    return UnitServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UnitServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UnitServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UnitServiceBlockingStub>() {
        @java.lang.Override
        public UnitServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UnitServiceBlockingStub(channel, callOptions);
        }
      };
    return UnitServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UnitServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UnitServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UnitServiceFutureStub>() {
        @java.lang.Override
        public UnitServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UnitServiceFutureStub(channel, callOptions);
        }
      };
    return UnitServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static abstract class UnitServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a unit
     * Creates a new unit.
     * </pre>
     */
    public void createUnit(com.saltoapis.nebula.unit.v1.CreateUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an existing unit
     * Retrieves an existing unit.
     * </pre>
     */
    public void getUnit(com.saltoapis.nebula.unit.v1.GetUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * List units
     * Returns a list of units that have been previously created.
     * </pre>
     */
    public void listUnits(com.saltoapis.nebula.unit.v1.ListUnitsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListUnitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUnitsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing unit
     * Updates an existing unit.
     * </pre>
     */
    public void updateUnit(com.saltoapis.nebula.unit.v1.UpdateUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a unit
     * Permanently deletes a unit. This cannot be undone.
     * </pre>
     */
    public void deleteUnit(com.saltoapis.nebula.unit.v1.DeleteUnitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clean out a unit
     * Cleans out a unit by deleting all the users belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Cleaning out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because clean out is a
     *     phrasal verb and api-linter don't support using them. --)
     * </pre>
     */
    public void cleanOutUnit(com.saltoapis.nebula.unit.v1.CleanOutUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanOutUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a new policy.
     * </pre>
     */
    public void createPolicy(com.saltoapis.nebula.unit.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an existing policy
     * Retrieves an existing policy.
     * </pre>
     */
    public void getPolicy(com.saltoapis.nebula.unit.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public void listPolicies(com.saltoapis.nebula.unit.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing policy
     * Updates an existing policy.
     * </pre>
     */
    public void updatePolicy(com.saltoapis.nebula.unit.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    public void deletePolicy(com.saltoapis.nebula.unit.v1.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Test a permission
     * Returns permissions that a caller has on the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public void testPermissions(com.saltoapis.nebula.unit.v1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUnitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.CreateUnitRequest,
                com.saltoapis.nebula.unit.v1.Unit>(
                  this, METHODID_CREATE_UNIT)))
          .addMethod(
            getGetUnitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.GetUnitRequest,
                com.saltoapis.nebula.unit.v1.Unit>(
                  this, METHODID_GET_UNIT)))
          .addMethod(
            getListUnitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.ListUnitsRequest,
                com.saltoapis.nebula.unit.v1.ListUnitsResponse>(
                  this, METHODID_LIST_UNITS)))
          .addMethod(
            getUpdateUnitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.UpdateUnitRequest,
                com.saltoapis.nebula.unit.v1.Unit>(
                  this, METHODID_UPDATE_UNIT)))
          .addMethod(
            getDeleteUnitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.DeleteUnitRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_UNIT)))
          .addMethod(
            getCleanOutUnitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.CleanOutUnitRequest,
                com.saltoapis.nebula.unit.v1.CleanOutUnitResponse>(
                  this, METHODID_CLEAN_OUT_UNIT)))
          .addMethod(
            getCreatePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.CreatePolicyRequest,
                com.saltoapis.nebula.unit.v1.Policy>(
                  this, METHODID_CREATE_POLICY)))
          .addMethod(
            getGetPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.GetPolicyRequest,
                com.saltoapis.nebula.unit.v1.Policy>(
                  this, METHODID_GET_POLICY)))
          .addMethod(
            getListPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.ListPoliciesRequest,
                com.saltoapis.nebula.unit.v1.ListPoliciesResponse>(
                  this, METHODID_LIST_POLICIES)))
          .addMethod(
            getUpdatePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.UpdatePolicyRequest,
                com.saltoapis.nebula.unit.v1.Policy>(
                  this, METHODID_UPDATE_POLICY)))
          .addMethod(
            getDeletePolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.DeletePolicyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_POLICY)))
          .addMethod(
            getTestPermissionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.saltoapis.nebula.unit.v1.TestPermissionsRequest,
                com.saltoapis.nebula.unit.v1.TestPermissionsResponse>(
                  this, METHODID_TEST_PERMISSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static final class UnitServiceStub extends io.grpc.stub.AbstractAsyncStub<UnitServiceStub> {
    private UnitServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnitServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UnitServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a unit
     * Creates a new unit.
     * </pre>
     */
    public void createUnit(com.saltoapis.nebula.unit.v1.CreateUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an existing unit
     * Retrieves an existing unit.
     * </pre>
     */
    public void getUnit(com.saltoapis.nebula.unit.v1.GetUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List units
     * Returns a list of units that have been previously created.
     * </pre>
     */
    public void listUnits(com.saltoapis.nebula.unit.v1.ListUnitsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListUnitsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUnitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing unit
     * Updates an existing unit.
     * </pre>
     */
    public void updateUnit(com.saltoapis.nebula.unit.v1.UpdateUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a unit
     * Permanently deletes a unit. This cannot be undone.
     * </pre>
     */
    public void deleteUnit(com.saltoapis.nebula.unit.v1.DeleteUnitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clean out a unit
     * Cleans out a unit by deleting all the users belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Cleaning out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because clean out is a
     *     phrasal verb and api-linter don't support using them. --)
     * </pre>
     */
    public void cleanOutUnit(com.saltoapis.nebula.unit.v1.CleanOutUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanOutUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a new policy.
     * </pre>
     */
    public void createPolicy(com.saltoapis.nebula.unit.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an existing policy
     * Retrieves an existing policy.
     * </pre>
     */
    public void getPolicy(com.saltoapis.nebula.unit.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public void listPolicies(com.saltoapis.nebula.unit.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing policy
     * Updates an existing policy.
     * </pre>
     */
    public void updatePolicy(com.saltoapis.nebula.unit.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    public void deletePolicy(com.saltoapis.nebula.unit.v1.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Test a permission
     * Returns permissions that a caller has on the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public void testPermissions(com.saltoapis.nebula.unit.v1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static final class UnitServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UnitServiceBlockingStub> {
    private UnitServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnitServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UnitServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a unit
     * Creates a new unit.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.Unit createUnit(com.saltoapis.nebula.unit.v1.CreateUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUnitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an existing unit
     * Retrieves an existing unit.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.Unit getUnit(com.saltoapis.nebula.unit.v1.GetUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List units
     * Returns a list of units that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.ListUnitsResponse listUnits(com.saltoapis.nebula.unit.v1.ListUnitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUnitsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing unit
     * Updates an existing unit.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.Unit updateUnit(com.saltoapis.nebula.unit.v1.UpdateUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUnitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a unit
     * Permanently deletes a unit. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteUnit(com.saltoapis.nebula.unit.v1.DeleteUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUnitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clean out a unit
     * Cleans out a unit by deleting all the users belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Cleaning out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because clean out is a
     *     phrasal verb and api-linter don't support using them. --)
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.CleanOutUnitResponse cleanOutUnit(com.saltoapis.nebula.unit.v1.CleanOutUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanOutUnitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a new policy.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.Policy createPolicy(com.saltoapis.nebula.unit.v1.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an existing policy
     * Retrieves an existing policy.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.Policy getPolicy(com.saltoapis.nebula.unit.v1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.ListPoliciesResponse listPolicies(com.saltoapis.nebula.unit.v1.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing policy
     * Updates an existing policy.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.Policy updatePolicy(com.saltoapis.nebula.unit.v1.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deletePolicy(com.saltoapis.nebula.unit.v1.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Test a permission
     * Returns permissions that a caller has on the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.TestPermissionsResponse testPermissions(com.saltoapis.nebula.unit.v1.TestPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static final class UnitServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UnitServiceFutureStub> {
    private UnitServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnitServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UnitServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a unit
     * Creates a new unit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.Unit> createUnit(
        com.saltoapis.nebula.unit.v1.CreateUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUnitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an existing unit
     * Retrieves an existing unit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.Unit> getUnit(
        com.saltoapis.nebula.unit.v1.GetUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List units
     * Returns a list of units that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.ListUnitsResponse> listUnits(
        com.saltoapis.nebula.unit.v1.ListUnitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUnitsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing unit
     * Updates an existing unit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.Unit> updateUnit(
        com.saltoapis.nebula.unit.v1.UpdateUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUnitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a unit
     * Permanently deletes a unit. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUnit(
        com.saltoapis.nebula.unit.v1.DeleteUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUnitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clean out a unit
     * Cleans out a unit by deleting all the users belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Cleaning out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because clean out is a
     *     phrasal verb and api-linter don't support using them. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> cleanOutUnit(
        com.saltoapis.nebula.unit.v1.CleanOutUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanOutUnitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a new policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.Policy> createPolicy(
        com.saltoapis.nebula.unit.v1.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an existing policy
     * Retrieves an existing policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.Policy> getPolicy(
        com.saltoapis.nebula.unit.v1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.ListPoliciesResponse> listPolicies(
        com.saltoapis.nebula.unit.v1.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing policy
     * Updates an existing policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.Policy> updatePolicy(
        com.saltoapis.nebula.unit.v1.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePolicy(
        com.saltoapis.nebula.unit.v1.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Test a permission
     * Returns permissions that a caller has on the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.TestPermissionsResponse> testPermissions(
        com.saltoapis.nebula.unit.v1.TestPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_UNIT = 0;
  private static final int METHODID_GET_UNIT = 1;
  private static final int METHODID_LIST_UNITS = 2;
  private static final int METHODID_UPDATE_UNIT = 3;
  private static final int METHODID_DELETE_UNIT = 4;
  private static final int METHODID_CLEAN_OUT_UNIT = 5;
  private static final int METHODID_CREATE_POLICY = 6;
  private static final int METHODID_GET_POLICY = 7;
  private static final int METHODID_LIST_POLICIES = 8;
  private static final int METHODID_UPDATE_POLICY = 9;
  private static final int METHODID_DELETE_POLICY = 10;
  private static final int METHODID_TEST_PERMISSIONS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UnitServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UnitServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_UNIT:
          serviceImpl.createUnit((com.saltoapis.nebula.unit.v1.CreateUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit>) responseObserver);
          break;
        case METHODID_GET_UNIT:
          serviceImpl.getUnit((com.saltoapis.nebula.unit.v1.GetUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit>) responseObserver);
          break;
        case METHODID_LIST_UNITS:
          serviceImpl.listUnits((com.saltoapis.nebula.unit.v1.ListUnitsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListUnitsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_UNIT:
          serviceImpl.updateUnit((com.saltoapis.nebula.unit.v1.UpdateUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit>) responseObserver);
          break;
        case METHODID_DELETE_UNIT:
          serviceImpl.deleteUnit((com.saltoapis.nebula.unit.v1.DeleteUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CLEAN_OUT_UNIT:
          serviceImpl.cleanOutUnit((com.saltoapis.nebula.unit.v1.CleanOutUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.CleanOutUnitResponse>) responseObserver);
          break;
        case METHODID_CREATE_POLICY:
          serviceImpl.createPolicy((com.saltoapis.nebula.unit.v1.CreatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((com.saltoapis.nebula.unit.v1.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy>) responseObserver);
          break;
        case METHODID_LIST_POLICIES:
          serviceImpl.listPolicies((com.saltoapis.nebula.unit.v1.ListPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListPoliciesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POLICY:
          serviceImpl.updatePolicy((com.saltoapis.nebula.unit.v1.UpdatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy>) responseObserver);
          break;
        case METHODID_DELETE_POLICY:
          serviceImpl.deletePolicy((com.saltoapis.nebula.unit.v1.DeletePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TEST_PERMISSIONS:
          serviceImpl.testPermissions((com.saltoapis.nebula.unit.v1.TestPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.TestPermissionsResponse>) responseObserver);
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
      synchronized (UnitServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateUnitMethod())
              .addMethod(getGetUnitMethod())
              .addMethod(getListUnitsMethod())
              .addMethod(getUpdateUnitMethod())
              .addMethod(getDeleteUnitMethod())
              .addMethod(getCleanOutUnitMethod())
              .addMethod(getCreatePolicyMethod())
              .addMethod(getGetPolicyMethod())
              .addMethod(getListPoliciesMethod())
              .addMethod(getUpdatePolicyMethod())
              .addMethod(getDeletePolicyMethod())
              .addMethod(getTestPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
