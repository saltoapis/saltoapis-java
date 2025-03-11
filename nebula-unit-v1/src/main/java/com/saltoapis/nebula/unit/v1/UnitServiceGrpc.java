package com.saltoapis.nebula.unit.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UnitService is the service responsible for managing unit resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/unit/v1/unit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UnitServiceGrpc {

  private UnitServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.unit.v1.UnitService";

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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CreateUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("CreateUnit"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.GetUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("GetUnit"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListUnitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListUnitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("ListUnits"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.UpdateUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Unit.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("UpdateUnit"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.DeleteUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("DeleteUnit"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CleanOutUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CleanOutUnitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("CleanOutUnit"))
              .build();
        }
      }
    }
    return getCleanOutUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.MoveInUnitRequest,
      com.saltoapis.nebula.unit.v1.MoveInUnitResponse> getMoveInUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveInUnit",
      requestType = com.saltoapis.nebula.unit.v1.MoveInUnitRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.MoveInUnitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.MoveInUnitRequest,
      com.saltoapis.nebula.unit.v1.MoveInUnitResponse> getMoveInUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.MoveInUnitRequest, com.saltoapis.nebula.unit.v1.MoveInUnitResponse> getMoveInUnitMethod;
    if ((getMoveInUnitMethod = UnitServiceGrpc.getMoveInUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getMoveInUnitMethod = UnitServiceGrpc.getMoveInUnitMethod) == null) {
          UnitServiceGrpc.getMoveInUnitMethod = getMoveInUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.MoveInUnitRequest, com.saltoapis.nebula.unit.v1.MoveInUnitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveInUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.MoveInUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.MoveInUnitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("MoveInUnit"))
              .build();
        }
      }
    }
    return getMoveInUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.MoveOutUnitRequest,
      com.saltoapis.nebula.unit.v1.MoveOutUnitResponse> getMoveOutUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveOutUnit",
      requestType = com.saltoapis.nebula.unit.v1.MoveOutUnitRequest.class,
      responseType = com.saltoapis.nebula.unit.v1.MoveOutUnitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.MoveOutUnitRequest,
      com.saltoapis.nebula.unit.v1.MoveOutUnitResponse> getMoveOutUnitMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.unit.v1.MoveOutUnitRequest, com.saltoapis.nebula.unit.v1.MoveOutUnitResponse> getMoveOutUnitMethod;
    if ((getMoveOutUnitMethod = UnitServiceGrpc.getMoveOutUnitMethod) == null) {
      synchronized (UnitServiceGrpc.class) {
        if ((getMoveOutUnitMethod = UnitServiceGrpc.getMoveOutUnitMethod) == null) {
          UnitServiceGrpc.getMoveOutUnitMethod = getMoveOutUnitMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.unit.v1.MoveOutUnitRequest, com.saltoapis.nebula.unit.v1.MoveOutUnitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveOutUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.MoveOutUnitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.MoveOutUnitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("MoveOutUnit"))
              .build();
        }
      }
    }
    return getMoveOutUnitMethod;
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.CreatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("CreatePolicy"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("GetPolicy"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.ListPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("ListPolicies"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.UpdatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("UpdatePolicy"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.DeletePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("DeletePolicy"))
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
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.TestPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.unit.v1.TestPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UnitServiceMethodDescriptorSupplier("TestPermissions"))
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
  public interface AsyncService {

    /**
     * <pre>
     * Create a unit
     * Creates a new unit.
     * </pre>
     */
    default void createUnit(com.saltoapis.nebula.unit.v1.CreateUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an existing unit
     * Retrieves an existing unit.
     * </pre>
     */
    default void getUnit(com.saltoapis.nebula.unit.v1.GetUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * List units
     * Returns a list of units that have been previously created.
     * </pre>
     */
    default void listUnits(com.saltoapis.nebula.unit.v1.ListUnitsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListUnitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUnitsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing unit
     * Updates an existing unit.
     * </pre>
     */
    default void updateUnit(com.saltoapis.nebula.unit.v1.UpdateUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Unit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a unit
     * Permanently deletes a unit. This cannot be undone.
     * </pre>
     */
    default void deleteUnit(com.saltoapis.nebula.unit.v1.DeleteUnitRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clean out a unit
     * Deprecated: Use [MoveOutUnit][salto.nebula.unit.v1.UnitService.MoveOutUnit]
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because clean out is a
     *     phrasal verb and api-linter don't support using them. --)
     * </pre>
     */
    default void cleanOutUnit(com.saltoapis.nebula.unit.v1.CleanOutUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.CleanOutUnitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanOutUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move in a unit
     * Moves in a unit by creating new occupants and associating them with the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move in" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    default void moveInUnit(com.saltoapis.nebula.unit.v1.MoveInUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.MoveInUnitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveInUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move out a unit
     * Moves out a unit by deleting all the occupants belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Moving out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move out" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    default void moveOutUnit(com.saltoapis.nebula.unit.v1.MoveOutUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.MoveOutUnitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveOutUnitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a new policy.
     * </pre>
     */
    default void createPolicy(com.saltoapis.nebula.unit.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an existing policy
     * Retrieves an existing policy.
     * </pre>
     */
    default void getPolicy(com.saltoapis.nebula.unit.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    default void listPolicies(com.saltoapis.nebula.unit.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing policy
     * Updates an existing policy.
     * </pre>
     */
    default void updatePolicy(com.saltoapis.nebula.unit.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    default void deletePolicy(com.saltoapis.nebula.unit.v1.DeletePolicyRequest request,
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
    default void testPermissions(com.saltoapis.nebula.unit.v1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestPermissionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UnitService.
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static abstract class UnitServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UnitServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UnitService.
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static final class UnitServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UnitServiceStub> {
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
     * Deprecated: Use [MoveOutUnit][salto.nebula.unit.v1.UnitService.MoveOutUnit]
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
     * Move in a unit
     * Moves in a unit by creating new occupants and associating them with the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move in" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    public void moveInUnit(com.saltoapis.nebula.unit.v1.MoveInUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.MoveInUnitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveInUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move out a unit
     * Moves out a unit by deleting all the occupants belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Moving out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move out" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    public void moveOutUnit(com.saltoapis.nebula.unit.v1.MoveOutUnitRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.MoveOutUnitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveOutUnitMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service UnitService.
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static final class UnitServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UnitServiceBlockingStub> {
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
     * Deprecated: Use [MoveOutUnit][salto.nebula.unit.v1.UnitService.MoveOutUnit]
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
     * Move in a unit
     * Moves in a unit by creating new occupants and associating them with the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move in" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.MoveInUnitResponse moveInUnit(com.saltoapis.nebula.unit.v1.MoveInUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveInUnitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move out a unit
     * Moves out a unit by deleting all the occupants belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Moving out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move out" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    public com.saltoapis.nebula.unit.v1.MoveOutUnitResponse moveOutUnit(com.saltoapis.nebula.unit.v1.MoveOutUnitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveOutUnitMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UnitService.
   * <pre>
   * UnitService is the service responsible for managing unit resources.
   * </pre>
   */
  public static final class UnitServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UnitServiceFutureStub> {
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
     * Deprecated: Use [MoveOutUnit][salto.nebula.unit.v1.UnitService.MoveOutUnit]
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
     * Move in a unit
     * Moves in a unit by creating new occupants and associating them with the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move in" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.MoveInUnitResponse> moveInUnit(
        com.saltoapis.nebula.unit.v1.MoveInUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveInUnitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move out a unit
     * Moves out a unit by deleting all the occupants belonging to it. This process
     * implicitly entails the blocking of the keys that were active within the
     * unit. Moving out a unit will not delete the access rights and the
     * associated access points that belong to the unit.
     * (-- api-linter: core::0136::http-uri-suffix=disabled
     *     aip.dev/not-precedent: We need to do this because "move out" is a phrasal
     *     verb and the api-linter doesn't support using them. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.unit.v1.MoveOutUnitResponse> moveOutUnit(
        com.saltoapis.nebula.unit.v1.MoveOutUnitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveOutUnitMethod(), getCallOptions()), request);
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
  private static final int METHODID_MOVE_IN_UNIT = 6;
  private static final int METHODID_MOVE_OUT_UNIT = 7;
  private static final int METHODID_CREATE_POLICY = 8;
  private static final int METHODID_GET_POLICY = 9;
  private static final int METHODID_LIST_POLICIES = 10;
  private static final int METHODID_UPDATE_POLICY = 11;
  private static final int METHODID_DELETE_POLICY = 12;
  private static final int METHODID_TEST_PERMISSIONS = 13;

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
        case METHODID_MOVE_IN_UNIT:
          serviceImpl.moveInUnit((com.saltoapis.nebula.unit.v1.MoveInUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.MoveInUnitResponse>) responseObserver);
          break;
        case METHODID_MOVE_OUT_UNIT:
          serviceImpl.moveOutUnit((com.saltoapis.nebula.unit.v1.MoveOutUnitRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.unit.v1.MoveOutUnitResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.CreateUnitRequest,
              com.saltoapis.nebula.unit.v1.Unit>(
                service, METHODID_CREATE_UNIT)))
        .addMethod(
          getGetUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.GetUnitRequest,
              com.saltoapis.nebula.unit.v1.Unit>(
                service, METHODID_GET_UNIT)))
        .addMethod(
          getListUnitsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.ListUnitsRequest,
              com.saltoapis.nebula.unit.v1.ListUnitsResponse>(
                service, METHODID_LIST_UNITS)))
        .addMethod(
          getUpdateUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.UpdateUnitRequest,
              com.saltoapis.nebula.unit.v1.Unit>(
                service, METHODID_UPDATE_UNIT)))
        .addMethod(
          getDeleteUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.DeleteUnitRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_UNIT)))
        .addMethod(
          getCleanOutUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.CleanOutUnitRequest,
              com.saltoapis.nebula.unit.v1.CleanOutUnitResponse>(
                service, METHODID_CLEAN_OUT_UNIT)))
        .addMethod(
          getMoveInUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.MoveInUnitRequest,
              com.saltoapis.nebula.unit.v1.MoveInUnitResponse>(
                service, METHODID_MOVE_IN_UNIT)))
        .addMethod(
          getMoveOutUnitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.MoveOutUnitRequest,
              com.saltoapis.nebula.unit.v1.MoveOutUnitResponse>(
                service, METHODID_MOVE_OUT_UNIT)))
        .addMethod(
          getCreatePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.CreatePolicyRequest,
              com.saltoapis.nebula.unit.v1.Policy>(
                service, METHODID_CREATE_POLICY)))
        .addMethod(
          getGetPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.GetPolicyRequest,
              com.saltoapis.nebula.unit.v1.Policy>(
                service, METHODID_GET_POLICY)))
        .addMethod(
          getListPoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.ListPoliciesRequest,
              com.saltoapis.nebula.unit.v1.ListPoliciesResponse>(
                service, METHODID_LIST_POLICIES)))
        .addMethod(
          getUpdatePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.UpdatePolicyRequest,
              com.saltoapis.nebula.unit.v1.Policy>(
                service, METHODID_UPDATE_POLICY)))
        .addMethod(
          getDeletePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.DeletePolicyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_POLICY)))
        .addMethod(
          getTestPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.unit.v1.TestPermissionsRequest,
              com.saltoapis.nebula.unit.v1.TestPermissionsResponse>(
                service, METHODID_TEST_PERMISSIONS)))
        .build();
  }

  private static abstract class UnitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UnitServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.unit.v1.UnitProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UnitService");
    }
  }

  private static final class UnitServiceFileDescriptorSupplier
      extends UnitServiceBaseDescriptorSupplier {
    UnitServiceFileDescriptorSupplier() {}
  }

  private static final class UnitServiceMethodDescriptorSupplier
      extends UnitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UnitServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UnitServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UnitServiceFileDescriptorSupplier())
              .addMethod(getCreateUnitMethod())
              .addMethod(getGetUnitMethod())
              .addMethod(getListUnitsMethod())
              .addMethod(getUpdateUnitMethod())
              .addMethod(getDeleteUnitMethod())
              .addMethod(getCleanOutUnitMethod())
              .addMethod(getMoveInUnitMethod())
              .addMethod(getMoveOutUnitMethod())
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
