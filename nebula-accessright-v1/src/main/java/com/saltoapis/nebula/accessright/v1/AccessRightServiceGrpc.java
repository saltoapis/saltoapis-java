package com.saltoapis.nebula.accessright.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Access rights simplify the management of access permissions for large
 * sets of users with similar access profiles. An access right can contain
 * multiple access points. Access rights determine who can enter where, and
 * when. This service is responsible for managing access right resources as well
 * as their association with access points.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/accessright/v1/access_right.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessRightServiceGrpc {

  private AccessRightServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.accessright.v1.AccessRightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest,
      com.saltoapis.nebula.accessright.v1.AccessRight> getCreateAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessRight",
      requestType = com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest,
      com.saltoapis.nebula.accessright.v1.AccessRight> getCreateAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest, com.saltoapis.nebula.accessright.v1.AccessRight> getCreateAccessRightMethod;
    if ((getCreateAccessRightMethod = AccessRightServiceGrpc.getCreateAccessRightMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getCreateAccessRightMethod = AccessRightServiceGrpc.getCreateAccessRightMethod) == null) {
          AccessRightServiceGrpc.getCreateAccessRightMethod = getCreateAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest, com.saltoapis.nebula.accessright.v1.AccessRight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("CreateAccessRight"))
              .build();
        }
      }
    }
    return getCreateAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightRequest,
      com.saltoapis.nebula.accessright.v1.AccessRight> getGetAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessRight",
      requestType = com.saltoapis.nebula.accessright.v1.GetAccessRightRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightRequest,
      com.saltoapis.nebula.accessright.v1.AccessRight> getGetAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightRequest, com.saltoapis.nebula.accessright.v1.AccessRight> getGetAccessRightMethod;
    if ((getGetAccessRightMethod = AccessRightServiceGrpc.getGetAccessRightMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getGetAccessRightMethod = AccessRightServiceGrpc.getGetAccessRightMethod) == null) {
          AccessRightServiceGrpc.getGetAccessRightMethod = getGetAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.GetAccessRightRequest, com.saltoapis.nebula.accessright.v1.AccessRight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.GetAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("GetAccessRight"))
              .build();
        }
      }
    }
    return getGetAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse> getListAccessRightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessRights",
      requestType = com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse> getListAccessRightsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse> getListAccessRightsMethod;
    if ((getListAccessRightsMethod = AccessRightServiceGrpc.getListAccessRightsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getListAccessRightsMethod = AccessRightServiceGrpc.getListAccessRightsMethod) == null) {
          AccessRightServiceGrpc.getListAccessRightsMethod = getListAccessRightsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessRights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("ListAccessRights"))
              .build();
        }
      }
    }
    return getListAccessRightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest,
      com.saltoapis.nebula.accessright.v1.AccessRight> getUpdateAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessRight",
      requestType = com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest,
      com.saltoapis.nebula.accessright.v1.AccessRight> getUpdateAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest, com.saltoapis.nebula.accessright.v1.AccessRight> getUpdateAccessRightMethod;
    if ((getUpdateAccessRightMethod = AccessRightServiceGrpc.getUpdateAccessRightMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getUpdateAccessRightMethod = AccessRightServiceGrpc.getUpdateAccessRightMethod) == null) {
          AccessRightServiceGrpc.getUpdateAccessRightMethod = getUpdateAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest, com.saltoapis.nebula.accessright.v1.AccessRight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRight.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("UpdateAccessRight"))
              .build();
        }
      }
    }
    return getUpdateAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest,
      com.google.protobuf.Empty> getDeleteAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessRight",
      requestType = com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest,
      com.google.protobuf.Empty> getDeleteAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest, com.google.protobuf.Empty> getDeleteAccessRightMethod;
    if ((getDeleteAccessRightMethod = AccessRightServiceGrpc.getDeleteAccessRightMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getDeleteAccessRightMethod = AccessRightServiceGrpc.getDeleteAccessRightMethod) == null) {
          AccessRightServiceGrpc.getDeleteAccessRightMethod = getDeleteAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("DeleteAccessRight"))
              .build();
        }
      }
    }
    return getDeleteAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getCreateAccessRightAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessRightAccessPoint",
      requestType = com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getCreateAccessRightAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getCreateAccessRightAccessPointMethod;
    if ((getCreateAccessRightAccessPointMethod = AccessRightServiceGrpc.getCreateAccessRightAccessPointMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getCreateAccessRightAccessPointMethod = AccessRightServiceGrpc.getCreateAccessRightAccessPointMethod) == null) {
          AccessRightServiceGrpc.getCreateAccessRightAccessPointMethod = getCreateAccessRightAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessRightAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("CreateAccessRightAccessPoint"))
              .build();
        }
      }
    }
    return getCreateAccessRightAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest,
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse> getBatchCreateAccessRightAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateAccessRightAccessPoints",
      requestType = com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest,
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse> getBatchCreateAccessRightAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse> getBatchCreateAccessRightAccessPointsMethod;
    if ((getBatchCreateAccessRightAccessPointsMethod = AccessRightServiceGrpc.getBatchCreateAccessRightAccessPointsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getBatchCreateAccessRightAccessPointsMethod = AccessRightServiceGrpc.getBatchCreateAccessRightAccessPointsMethod) == null) {
          AccessRightServiceGrpc.getBatchCreateAccessRightAccessPointsMethod = getBatchCreateAccessRightAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateAccessRightAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("BatchCreateAccessRightAccessPoints"))
              .build();
        }
      }
    }
    return getBatchCreateAccessRightAccessPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getGetAccessRightAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessRightAccessPoint",
      requestType = com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getGetAccessRightAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getGetAccessRightAccessPointMethod;
    if ((getGetAccessRightAccessPointMethod = AccessRightServiceGrpc.getGetAccessRightAccessPointMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getGetAccessRightAccessPointMethod = AccessRightServiceGrpc.getGetAccessRightAccessPointMethod) == null) {
          AccessRightServiceGrpc.getGetAccessRightAccessPointMethod = getGetAccessRightAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessRightAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("GetAccessRightAccessPoint"))
              .build();
        }
      }
    }
    return getGetAccessRightAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse> getListAccessRightAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessRightAccessPoints",
      requestType = com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse> getListAccessRightAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse> getListAccessRightAccessPointsMethod;
    if ((getListAccessRightAccessPointsMethod = AccessRightServiceGrpc.getListAccessRightAccessPointsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getListAccessRightAccessPointsMethod = AccessRightServiceGrpc.getListAccessRightAccessPointsMethod) == null) {
          AccessRightServiceGrpc.getListAccessRightAccessPointsMethod = getListAccessRightAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessRightAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("ListAccessRightAccessPoints"))
              .build();
        }
      }
    }
    return getListAccessRightAccessPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getUpdateAccessRightAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessRightAccessPoint",
      requestType = com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getUpdateAccessRightAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getUpdateAccessRightAccessPointMethod;
    if ((getUpdateAccessRightAccessPointMethod = AccessRightServiceGrpc.getUpdateAccessRightAccessPointMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getUpdateAccessRightAccessPointMethod = AccessRightServiceGrpc.getUpdateAccessRightAccessPointMethod) == null) {
          AccessRightServiceGrpc.getUpdateAccessRightAccessPointMethod = getUpdateAccessRightAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessRightAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("UpdateAccessRightAccessPoint"))
              .build();
        }
      }
    }
    return getUpdateAccessRightAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest,
      com.google.protobuf.Empty> getDeleteAccessRightAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessRightAccessPoint",
      requestType = com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest,
      com.google.protobuf.Empty> getDeleteAccessRightAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest, com.google.protobuf.Empty> getDeleteAccessRightAccessPointMethod;
    if ((getDeleteAccessRightAccessPointMethod = AccessRightServiceGrpc.getDeleteAccessRightAccessPointMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getDeleteAccessRightAccessPointMethod = AccessRightServiceGrpc.getDeleteAccessRightAccessPointMethod) == null) {
          AccessRightServiceGrpc.getDeleteAccessRightAccessPointMethod = getDeleteAccessRightAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessRightAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("DeleteAccessRightAccessPoint"))
              .build();
        }
      }
    }
    return getDeleteAccessRightAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest,
      com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse> getBatchDeleteAccessRightAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteAccessRightAccessPoints",
      requestType = com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest,
      com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse> getBatchDeleteAccessRightAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest, com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse> getBatchDeleteAccessRightAccessPointsMethod;
    if ((getBatchDeleteAccessRightAccessPointsMethod = AccessRightServiceGrpc.getBatchDeleteAccessRightAccessPointsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getBatchDeleteAccessRightAccessPointsMethod = AccessRightServiceGrpc.getBatchDeleteAccessRightAccessPointsMethod) == null) {
          AccessRightServiceGrpc.getBatchDeleteAccessRightAccessPointsMethod = getBatchDeleteAccessRightAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest, com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteAccessRightAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("BatchDeleteAccessRightAccessPoints"))
              .build();
        }
      }
    }
    return getBatchDeleteAccessRightAccessPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getCreateAccessRightAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessRightAccessPointGroup",
      requestType = com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getCreateAccessRightAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getCreateAccessRightAccessPointGroupMethod;
    if ((getCreateAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getCreateAccessRightAccessPointGroupMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getCreateAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getCreateAccessRightAccessPointGroupMethod) == null) {
          AccessRightServiceGrpc.getCreateAccessRightAccessPointGroupMethod = getCreateAccessRightAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessRightAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("CreateAccessRightAccessPointGroup"))
              .build();
        }
      }
    }
    return getCreateAccessRightAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest,
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse> getBatchCreateAccessRightAccessPointGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateAccessRightAccessPointGroups",
      requestType = com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest,
      com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse> getBatchCreateAccessRightAccessPointGroupsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse> getBatchCreateAccessRightAccessPointGroupsMethod;
    if ((getBatchCreateAccessRightAccessPointGroupsMethod = AccessRightServiceGrpc.getBatchCreateAccessRightAccessPointGroupsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getBatchCreateAccessRightAccessPointGroupsMethod = AccessRightServiceGrpc.getBatchCreateAccessRightAccessPointGroupsMethod) == null) {
          AccessRightServiceGrpc.getBatchCreateAccessRightAccessPointGroupsMethod = getBatchCreateAccessRightAccessPointGroupsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest, com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateAccessRightAccessPointGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("BatchCreateAccessRightAccessPointGroups"))
              .build();
        }
      }
    }
    return getBatchCreateAccessRightAccessPointGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getGetAccessRightAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessRightAccessPointGroup",
      requestType = com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getGetAccessRightAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getGetAccessRightAccessPointGroupMethod;
    if ((getGetAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getGetAccessRightAccessPointGroupMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getGetAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getGetAccessRightAccessPointGroupMethod) == null) {
          AccessRightServiceGrpc.getGetAccessRightAccessPointGroupMethod = getGetAccessRightAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessRightAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("GetAccessRightAccessPointGroup"))
              .build();
        }
      }
    }
    return getGetAccessRightAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse> getListAccessRightAccessPointGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessRightAccessPointGroups",
      requestType = com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse> getListAccessRightAccessPointGroupsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse> getListAccessRightAccessPointGroupsMethod;
    if ((getListAccessRightAccessPointGroupsMethod = AccessRightServiceGrpc.getListAccessRightAccessPointGroupsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getListAccessRightAccessPointGroupsMethod = AccessRightServiceGrpc.getListAccessRightAccessPointGroupsMethod) == null) {
          AccessRightServiceGrpc.getListAccessRightAccessPointGroupsMethod = getListAccessRightAccessPointGroupsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessRightAccessPointGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("ListAccessRightAccessPointGroups"))
              .build();
        }
      }
    }
    return getListAccessRightAccessPointGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getUpdateAccessRightAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessRightAccessPointGroup",
      requestType = com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getUpdateAccessRightAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getUpdateAccessRightAccessPointGroupMethod;
    if ((getUpdateAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getUpdateAccessRightAccessPointGroupMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getUpdateAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getUpdateAccessRightAccessPointGroupMethod) == null) {
          AccessRightServiceGrpc.getUpdateAccessRightAccessPointGroupMethod = getUpdateAccessRightAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest, com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessRightAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("UpdateAccessRightAccessPointGroup"))
              .build();
        }
      }
    }
    return getUpdateAccessRightAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest,
      com.google.protobuf.Empty> getDeleteAccessRightAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessRightAccessPointGroup",
      requestType = com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest,
      com.google.protobuf.Empty> getDeleteAccessRightAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest, com.google.protobuf.Empty> getDeleteAccessRightAccessPointGroupMethod;
    if ((getDeleteAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getDeleteAccessRightAccessPointGroupMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getDeleteAccessRightAccessPointGroupMethod = AccessRightServiceGrpc.getDeleteAccessRightAccessPointGroupMethod) == null) {
          AccessRightServiceGrpc.getDeleteAccessRightAccessPointGroupMethod = getDeleteAccessRightAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessRightAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("DeleteAccessRightAccessPointGroup"))
              .build();
        }
      }
    }
    return getDeleteAccessRightAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest,
      com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse> getBatchDeleteAccessRightAccessPointGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteAccessRightAccessPointGroups",
      requestType = com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest,
      com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse> getBatchDeleteAccessRightAccessPointGroupsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest, com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse> getBatchDeleteAccessRightAccessPointGroupsMethod;
    if ((getBatchDeleteAccessRightAccessPointGroupsMethod = AccessRightServiceGrpc.getBatchDeleteAccessRightAccessPointGroupsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getBatchDeleteAccessRightAccessPointGroupsMethod = AccessRightServiceGrpc.getBatchDeleteAccessRightAccessPointGroupsMethod) == null) {
          AccessRightServiceGrpc.getBatchDeleteAccessRightAccessPointGroupsMethod = getBatchDeleteAccessRightAccessPointGroupsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest, com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteAccessRightAccessPointGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("BatchDeleteAccessRightAccessPointGroups"))
              .build();
        }
      }
    }
    return getBatchDeleteAccessRightAccessPointGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightDestination> getCreateAccessRightDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessRightDestination",
      requestType = com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightDestination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightDestination> getCreateAccessRightDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest, com.saltoapis.nebula.accessright.v1.AccessRightDestination> getCreateAccessRightDestinationMethod;
    if ((getCreateAccessRightDestinationMethod = AccessRightServiceGrpc.getCreateAccessRightDestinationMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getCreateAccessRightDestinationMethod = AccessRightServiceGrpc.getCreateAccessRightDestinationMethod) == null) {
          AccessRightServiceGrpc.getCreateAccessRightDestinationMethod = getCreateAccessRightDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest, com.saltoapis.nebula.accessright.v1.AccessRightDestination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessRightDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightDestination.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("CreateAccessRightDestination"))
              .build();
        }
      }
    }
    return getCreateAccessRightDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightDestination> getGetAccessRightDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessRightDestination",
      requestType = com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightDestination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightDestination> getGetAccessRightDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest, com.saltoapis.nebula.accessright.v1.AccessRightDestination> getGetAccessRightDestinationMethod;
    if ((getGetAccessRightDestinationMethod = AccessRightServiceGrpc.getGetAccessRightDestinationMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getGetAccessRightDestinationMethod = AccessRightServiceGrpc.getGetAccessRightDestinationMethod) == null) {
          AccessRightServiceGrpc.getGetAccessRightDestinationMethod = getGetAccessRightDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest, com.saltoapis.nebula.accessright.v1.AccessRightDestination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessRightDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightDestination.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("GetAccessRightDestination"))
              .build();
        }
      }
    }
    return getGetAccessRightDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse> getListAccessRightDestinationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessRightDestinations",
      requestType = com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest,
      com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse> getListAccessRightDestinationsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse> getListAccessRightDestinationsMethod;
    if ((getListAccessRightDestinationsMethod = AccessRightServiceGrpc.getListAccessRightDestinationsMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getListAccessRightDestinationsMethod = AccessRightServiceGrpc.getListAccessRightDestinationsMethod) == null) {
          AccessRightServiceGrpc.getListAccessRightDestinationsMethod = getListAccessRightDestinationsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest, com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessRightDestinations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("ListAccessRightDestinations"))
              .build();
        }
      }
    }
    return getListAccessRightDestinationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightDestination> getUpdateAccessRightDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessRightDestination",
      requestType = com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest.class,
      responseType = com.saltoapis.nebula.accessright.v1.AccessRightDestination.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest,
      com.saltoapis.nebula.accessright.v1.AccessRightDestination> getUpdateAccessRightDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest, com.saltoapis.nebula.accessright.v1.AccessRightDestination> getUpdateAccessRightDestinationMethod;
    if ((getUpdateAccessRightDestinationMethod = AccessRightServiceGrpc.getUpdateAccessRightDestinationMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getUpdateAccessRightDestinationMethod = AccessRightServiceGrpc.getUpdateAccessRightDestinationMethod) == null) {
          AccessRightServiceGrpc.getUpdateAccessRightDestinationMethod = getUpdateAccessRightDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest, com.saltoapis.nebula.accessright.v1.AccessRightDestination>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessRightDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.AccessRightDestination.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("UpdateAccessRightDestination"))
              .build();
        }
      }
    }
    return getUpdateAccessRightDestinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest,
      com.google.protobuf.Empty> getDeleteAccessRightDestinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessRightDestination",
      requestType = com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest,
      com.google.protobuf.Empty> getDeleteAccessRightDestinationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest, com.google.protobuf.Empty> getDeleteAccessRightDestinationMethod;
    if ((getDeleteAccessRightDestinationMethod = AccessRightServiceGrpc.getDeleteAccessRightDestinationMethod) == null) {
      synchronized (AccessRightServiceGrpc.class) {
        if ((getDeleteAccessRightDestinationMethod = AccessRightServiceGrpc.getDeleteAccessRightDestinationMethod) == null) {
          AccessRightServiceGrpc.getDeleteAccessRightDestinationMethod = getDeleteAccessRightDestinationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessRightDestination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccessRightServiceMethodDescriptorSupplier("DeleteAccessRightDestination"))
              .build();
        }
      }
    }
    return getDeleteAccessRightDestinationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessRightServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRightServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRightServiceStub>() {
        @java.lang.Override
        public AccessRightServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRightServiceStub(channel, callOptions);
        }
      };
    return AccessRightServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessRightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRightServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRightServiceBlockingStub>() {
        @java.lang.Override
        public AccessRightServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRightServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessRightServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessRightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessRightServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessRightServiceFutureStub>() {
        @java.lang.Override
        public AccessRightServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessRightServiceFutureStub(channel, callOptions);
        }
      };
    return AccessRightServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Access rights simplify the management of access permissions for large
   * sets of users with similar access profiles. An access right can contain
   * multiple access points. Access rights determine who can enter where, and
   * when. This service is responsible for managing access right resources as well
   * as their association with access points.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an access right
     * Creates a new access right.
     * </pre>
     */
    default void createAccessRight(com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access right
     * Retrieves an existing access right.
     * </pre>
     */
    default void getAccessRight(com.saltoapis.nebula.accessright.v1.GetAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access rights
     * Returns a list of access rights that have been previously created.
     * </pre>
     */
    default void listAccessRights(com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessRightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing access right.
     * </pre>
     */
    default void updateAccessRight(com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access right
     * Permanently deletes an access right. This cannot be undone.
     * </pre>
     */
    default void deleteAccessRight(com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access right's access point association.
     * </pre>
     */
    default void createAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessRightAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a batch of access rights access points
     * Creates a batch of access rights access points associations.
     * This method allows the creation of multiple access rights access points in a single operation.
     * </pre>
     */
    default void batchCreateAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateAccessRightAccessPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access right's access point association.
     * </pre>
     */
    default void getAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessRightAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access right's access point associations.
     * </pre>
     */
    default void listAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessRightAccessPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access right's access point association.
     * </pre>
     */
    default void updateAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessRightAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access right's access point association.
     * </pre>
     */
    default void deleteAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessRightAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a batch of access points
     * Permanently deletes a batch of access right's access point associations.
     * This cannot be undone.
     * </pre>
     */
    default void batchDeleteAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteAccessRightAccessPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access right's access point group association.
     * </pre>
     */
    default void createAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessRightAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a batch of access right's access point groups
     * Creates a batch of access right's access point groups associations.
     * This method allows the creation of multiple access right's access point groups in a single operation.
     * </pre>
     */
    default void batchCreateAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateAccessRightAccessPointGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access point group
     * Retrieves an existing access right's access point group association.
     * </pre>
     */
    default void getAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessRightAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access point groups
     * Lists an existing access right's access point group associations.
     * </pre>
     */
    default void listAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessRightAccessPointGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access right's access point group association.
     * </pre>
     */
    default void updateAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessRightAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access point group
     * Deletes an access right's access point group association.
     * </pre>
     */
    default void deleteAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessRightAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a batch of access point groups
     * Permanently deletes a batch access right's access point group associations. This cannot be undone.
     * </pre>
     */
    default void batchDeleteAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteAccessRightAccessPointGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an access right destination
     * Creates an access right's destination association.
     * </pre>
     */
    default void createAccessRightDestination(com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessRightDestinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access right destination
     * Retrieves an existing access right's destination association.
     * </pre>
     */
    default void getAccessRightDestination(com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessRightDestinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access right destinations
     * Lists an existing access right's destination associations.
     * </pre>
     */
    default void listAccessRightDestinations(com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessRightDestinationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access right destination
     * Updates an existing access right's destination association.
     * </pre>
     */
    default void updateAccessRightDestination(com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessRightDestinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access right destination
     * Deletes an access right's destination association.
     * </pre>
     */
    default void deleteAccessRightDestination(com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessRightDestinationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccessRightService.
   * <pre>
   * Access rights simplify the management of access permissions for large
   * sets of users with similar access profiles. An access right can contain
   * multiple access points. Access rights determine who can enter where, and
   * when. This service is responsible for managing access right resources as well
   * as their association with access points.
   * </pre>
   */
  public static abstract class AccessRightServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccessRightServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccessRightService.
   * <pre>
   * Access rights simplify the management of access permissions for large
   * sets of users with similar access profiles. An access right can contain
   * multiple access points. Access rights determine who can enter where, and
   * when. This service is responsible for managing access right resources as well
   * as their association with access points.
   * </pre>
   */
  public static final class AccessRightServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccessRightServiceStub> {
    private AccessRightServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRightServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRightServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a new access right.
     * </pre>
     */
    public void createAccessRight(com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access right
     * Retrieves an existing access right.
     * </pre>
     */
    public void getAccessRight(com.saltoapis.nebula.accessright.v1.GetAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access rights
     * Returns a list of access rights that have been previously created.
     * </pre>
     */
    public void listAccessRights(com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessRightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing access right.
     * </pre>
     */
    public void updateAccessRight(com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access right
     * Permanently deletes an access right. This cannot be undone.
     * </pre>
     */
    public void deleteAccessRight(com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access right's access point association.
     * </pre>
     */
    public void createAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessRightAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a batch of access rights access points
     * Creates a batch of access rights access points associations.
     * This method allows the creation of multiple access rights access points in a single operation.
     * </pre>
     */
    public void batchCreateAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateAccessRightAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access right's access point association.
     * </pre>
     */
    public void getAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessRightAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access right's access point associations.
     * </pre>
     */
    public void listAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessRightAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access right's access point association.
     * </pre>
     */
    public void updateAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessRightAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access right's access point association.
     * </pre>
     */
    public void deleteAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessRightAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a batch of access points
     * Permanently deletes a batch of access right's access point associations.
     * This cannot be undone.
     * </pre>
     */
    public void batchDeleteAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteAccessRightAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access right's access point group association.
     * </pre>
     */
    public void createAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessRightAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a batch of access right's access point groups
     * Creates a batch of access right's access point groups associations.
     * This method allows the creation of multiple access right's access point groups in a single operation.
     * </pre>
     */
    public void batchCreateAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateAccessRightAccessPointGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access point group
     * Retrieves an existing access right's access point group association.
     * </pre>
     */
    public void getAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessRightAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access point groups
     * Lists an existing access right's access point group associations.
     * </pre>
     */
    public void listAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessRightAccessPointGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access right's access point group association.
     * </pre>
     */
    public void updateAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessRightAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access point group
     * Deletes an access right's access point group association.
     * </pre>
     */
    public void deleteAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessRightAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a batch of access point groups
     * Permanently deletes a batch access right's access point group associations. This cannot be undone.
     * </pre>
     */
    public void batchDeleteAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteAccessRightAccessPointGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an access right destination
     * Creates an access right's destination association.
     * </pre>
     */
    public void createAccessRightDestination(com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessRightDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access right destination
     * Retrieves an existing access right's destination association.
     * </pre>
     */
    public void getAccessRightDestination(com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessRightDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access right destinations
     * Lists an existing access right's destination associations.
     * </pre>
     */
    public void listAccessRightDestinations(com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessRightDestinationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access right destination
     * Updates an existing access right's destination association.
     * </pre>
     */
    public void updateAccessRightDestination(com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessRightDestinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access right destination
     * Deletes an access right's destination association.
     * </pre>
     */
    public void deleteAccessRightDestination(com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessRightDestinationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccessRightService.
   * <pre>
   * Access rights simplify the management of access permissions for large
   * sets of users with similar access profiles. An access right can contain
   * multiple access points. Access rights determine who can enter where, and
   * when. This service is responsible for managing access right resources as well
   * as their association with access points.
   * </pre>
   */
  public static final class AccessRightServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccessRightServiceBlockingStub> {
    private AccessRightServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRightServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRightServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a new access right.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight createAccessRight(com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access right
     * Retrieves an existing access right.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight getAccessRight(com.saltoapis.nebula.accessright.v1.GetAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access rights
     * Returns a list of access rights that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse listAccessRights(com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessRightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing access right.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRight updateAccessRight(com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access right
     * Permanently deletes an access right. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccessRight(com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access right's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint createAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessRightAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a batch of access rights access points
     * Creates a batch of access rights access points associations.
     * This method allows the creation of multiple access rights access points in a single operation.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse batchCreateAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateAccessRightAccessPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access right's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint getAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessRightAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access right's access point associations.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse listAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessRightAccessPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access right's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint updateAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessRightAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access right's access point association.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccessRightAccessPoint(com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessRightAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a batch of access points
     * Permanently deletes a batch of access right's access point associations.
     * This cannot be undone.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse batchDeleteAccessRightAccessPoints(com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteAccessRightAccessPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access right's access point group association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup createAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessRightAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a batch of access right's access point groups
     * Creates a batch of access right's access point groups associations.
     * This method allows the creation of multiple access right's access point groups in a single operation.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse batchCreateAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateAccessRightAccessPointGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access point group
     * Retrieves an existing access right's access point group association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup getAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessRightAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access point groups
     * Lists an existing access right's access point group associations.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse listAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessRightAccessPointGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access right's access point group association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup updateAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessRightAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access point group
     * Deletes an access right's access point group association.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccessRightAccessPointGroup(com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessRightAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a batch of access point groups
     * Permanently deletes a batch access right's access point group associations. This cannot be undone.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse batchDeleteAccessRightAccessPointGroups(com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteAccessRightAccessPointGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an access right destination
     * Creates an access right's destination association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightDestination createAccessRightDestination(com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessRightDestinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access right destination
     * Retrieves an existing access right's destination association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightDestination getAccessRightDestination(com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessRightDestinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access right destinations
     * Lists an existing access right's destination associations.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse listAccessRightDestinations(com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessRightDestinationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access right destination
     * Updates an existing access right's destination association.
     * </pre>
     */
    public com.saltoapis.nebula.accessright.v1.AccessRightDestination updateAccessRightDestination(com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessRightDestinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access right destination
     * Deletes an access right's destination association.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccessRightDestination(com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessRightDestinationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccessRightService.
   * <pre>
   * Access rights simplify the management of access permissions for large
   * sets of users with similar access profiles. An access right can contain
   * multiple access points. Access rights determine who can enter where, and
   * when. This service is responsible for managing access right resources as well
   * as their association with access points.
   * </pre>
   */
  public static final class AccessRightServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccessRightServiceFutureStub> {
    private AccessRightServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessRightServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessRightServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a new access right.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRight> createAccessRight(
        com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access right
     * Retrieves an existing access right.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRight> getAccessRight(
        com.saltoapis.nebula.accessright.v1.GetAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access rights
     * Returns a list of access rights that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse> listAccessRights(
        com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessRightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing access right.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRight> updateAccessRight(
        com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access right
     * Permanently deletes an access right. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccessRight(
        com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access right's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> createAccessRightAccessPoint(
        com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessRightAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a batch of access rights access points
     * Creates a batch of access rights access points associations.
     * This method allows the creation of multiple access rights access points in a single operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse> batchCreateAccessRightAccessPoints(
        com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateAccessRightAccessPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access right's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> getAccessRightAccessPoint(
        com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessRightAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access right's access point associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse> listAccessRightAccessPoints(
        com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessRightAccessPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access right's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint> updateAccessRightAccessPoint(
        com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessRightAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access right's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccessRightAccessPoint(
        com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessRightAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a batch of access points
     * Permanently deletes a batch of access right's access point associations.
     * This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse> batchDeleteAccessRightAccessPoints(
        com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteAccessRightAccessPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access right's access point group association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> createAccessRightAccessPointGroup(
        com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessRightAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a batch of access right's access point groups
     * Creates a batch of access right's access point groups associations.
     * This method allows the creation of multiple access right's access point groups in a single operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse> batchCreateAccessRightAccessPointGroups(
        com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateAccessRightAccessPointGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access point group
     * Retrieves an existing access right's access point group association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> getAccessRightAccessPointGroup(
        com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessRightAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access point groups
     * Lists an existing access right's access point group associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse> listAccessRightAccessPointGroups(
        com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessRightAccessPointGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access right's access point group association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup> updateAccessRightAccessPointGroup(
        com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessRightAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access point group
     * Deletes an access right's access point group association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccessRightAccessPointGroup(
        com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessRightAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a batch of access point groups
     * Permanently deletes a batch access right's access point group associations. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse> batchDeleteAccessRightAccessPointGroups(
        com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteAccessRightAccessPointGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an access right destination
     * Creates an access right's destination association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightDestination> createAccessRightDestination(
        com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessRightDestinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access right destination
     * Retrieves an existing access right's destination association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightDestination> getAccessRightDestination(
        com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessRightDestinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access right destinations
     * Lists an existing access right's destination associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse> listAccessRightDestinations(
        com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessRightDestinationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access right destination
     * Updates an existing access right's destination association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accessright.v1.AccessRightDestination> updateAccessRightDestination(
        com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessRightDestinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access right destination
     * Deletes an access right's destination association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccessRightDestination(
        com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessRightDestinationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCESS_RIGHT = 0;
  private static final int METHODID_GET_ACCESS_RIGHT = 1;
  private static final int METHODID_LIST_ACCESS_RIGHTS = 2;
  private static final int METHODID_UPDATE_ACCESS_RIGHT = 3;
  private static final int METHODID_DELETE_ACCESS_RIGHT = 4;
  private static final int METHODID_CREATE_ACCESS_RIGHT_ACCESS_POINT = 5;
  private static final int METHODID_BATCH_CREATE_ACCESS_RIGHT_ACCESS_POINTS = 6;
  private static final int METHODID_GET_ACCESS_RIGHT_ACCESS_POINT = 7;
  private static final int METHODID_LIST_ACCESS_RIGHT_ACCESS_POINTS = 8;
  private static final int METHODID_UPDATE_ACCESS_RIGHT_ACCESS_POINT = 9;
  private static final int METHODID_DELETE_ACCESS_RIGHT_ACCESS_POINT = 10;
  private static final int METHODID_BATCH_DELETE_ACCESS_RIGHT_ACCESS_POINTS = 11;
  private static final int METHODID_CREATE_ACCESS_RIGHT_ACCESS_POINT_GROUP = 12;
  private static final int METHODID_BATCH_CREATE_ACCESS_RIGHT_ACCESS_POINT_GROUPS = 13;
  private static final int METHODID_GET_ACCESS_RIGHT_ACCESS_POINT_GROUP = 14;
  private static final int METHODID_LIST_ACCESS_RIGHT_ACCESS_POINT_GROUPS = 15;
  private static final int METHODID_UPDATE_ACCESS_RIGHT_ACCESS_POINT_GROUP = 16;
  private static final int METHODID_DELETE_ACCESS_RIGHT_ACCESS_POINT_GROUP = 17;
  private static final int METHODID_BATCH_DELETE_ACCESS_RIGHT_ACCESS_POINT_GROUPS = 18;
  private static final int METHODID_CREATE_ACCESS_RIGHT_DESTINATION = 19;
  private static final int METHODID_GET_ACCESS_RIGHT_DESTINATION = 20;
  private static final int METHODID_LIST_ACCESS_RIGHT_DESTINATIONS = 21;
  private static final int METHODID_UPDATE_ACCESS_RIGHT_DESTINATION = 22;
  private static final int METHODID_DELETE_ACCESS_RIGHT_DESTINATION = 23;

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
        case METHODID_CREATE_ACCESS_RIGHT:
          serviceImpl.createAccessRight((com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight>) responseObserver);
          break;
        case METHODID_GET_ACCESS_RIGHT:
          serviceImpl.getAccessRight((com.saltoapis.nebula.accessright.v1.GetAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_RIGHTS:
          serviceImpl.listAccessRights((com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_RIGHT:
          serviceImpl.updateAccessRight((com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRight>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_RIGHT:
          serviceImpl.deleteAccessRight((com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ACCESS_RIGHT_ACCESS_POINT:
          serviceImpl.createAccessRightAccessPoint((com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_ACCESS_RIGHT_ACCESS_POINTS:
          serviceImpl.batchCreateAccessRightAccessPoints((com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse>) responseObserver);
          break;
        case METHODID_GET_ACCESS_RIGHT_ACCESS_POINT:
          serviceImpl.getAccessRightAccessPoint((com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_RIGHT_ACCESS_POINTS:
          serviceImpl.listAccessRightAccessPoints((com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_RIGHT_ACCESS_POINT:
          serviceImpl.updateAccessRightAccessPoint((com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_RIGHT_ACCESS_POINT:
          serviceImpl.deleteAccessRightAccessPoint((com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ACCESS_RIGHT_ACCESS_POINTS:
          serviceImpl.batchDeleteAccessRightAccessPoints((com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ACCESS_RIGHT_ACCESS_POINT_GROUP:
          serviceImpl.createAccessRightAccessPointGroup((com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_ACCESS_RIGHT_ACCESS_POINT_GROUPS:
          serviceImpl.batchCreateAccessRightAccessPointGroups((com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_ACCESS_RIGHT_ACCESS_POINT_GROUP:
          serviceImpl.getAccessRightAccessPointGroup((com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_RIGHT_ACCESS_POINT_GROUPS:
          serviceImpl.listAccessRightAccessPointGroups((com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_RIGHT_ACCESS_POINT_GROUP:
          serviceImpl.updateAccessRightAccessPointGroup((com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_RIGHT_ACCESS_POINT_GROUP:
          serviceImpl.deleteAccessRightAccessPointGroup((com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ACCESS_RIGHT_ACCESS_POINT_GROUPS:
          serviceImpl.batchDeleteAccessRightAccessPointGroups((com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ACCESS_RIGHT_DESTINATION:
          serviceImpl.createAccessRightDestination((com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination>) responseObserver);
          break;
        case METHODID_GET_ACCESS_RIGHT_DESTINATION:
          serviceImpl.getAccessRightDestination((com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_RIGHT_DESTINATIONS:
          serviceImpl.listAccessRightDestinations((com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_RIGHT_DESTINATION:
          serviceImpl.updateAccessRightDestination((com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accessright.v1.AccessRightDestination>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_RIGHT_DESTINATION:
          serviceImpl.deleteAccessRightDestination((com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest) request,
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
          getCreateAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.CreateAccessRightRequest,
              com.saltoapis.nebula.accessright.v1.AccessRight>(
                service, METHODID_CREATE_ACCESS_RIGHT)))
        .addMethod(
          getGetAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.GetAccessRightRequest,
              com.saltoapis.nebula.accessright.v1.AccessRight>(
                service, METHODID_GET_ACCESS_RIGHT)))
        .addMethod(
          getListAccessRightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.ListAccessRightsRequest,
              com.saltoapis.nebula.accessright.v1.ListAccessRightsResponse>(
                service, METHODID_LIST_ACCESS_RIGHTS)))
        .addMethod(
          getUpdateAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.UpdateAccessRightRequest,
              com.saltoapis.nebula.accessright.v1.AccessRight>(
                service, METHODID_UPDATE_ACCESS_RIGHT)))
        .addMethod(
          getDeleteAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.DeleteAccessRightRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCESS_RIGHT)))
        .addMethod(
          getCreateAccessRightAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>(
                service, METHODID_CREATE_ACCESS_RIGHT_ACCESS_POINT)))
        .addMethod(
          getBatchCreateAccessRightAccessPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsRequest,
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointsResponse>(
                service, METHODID_BATCH_CREATE_ACCESS_RIGHT_ACCESS_POINTS)))
        .addMethod(
          getGetAccessRightAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>(
                service, METHODID_GET_ACCESS_RIGHT_ACCESS_POINT)))
        .addMethod(
          getListAccessRightAccessPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsRequest,
              com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointsResponse>(
                service, METHODID_LIST_ACCESS_RIGHT_ACCESS_POINTS)))
        .addMethod(
          getUpdateAccessRightAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPoint>(
                service, METHODID_UPDATE_ACCESS_RIGHT_ACCESS_POINT)))
        .addMethod(
          getDeleteAccessRightAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCESS_RIGHT_ACCESS_POINT)))
        .addMethod(
          getBatchDeleteAccessRightAccessPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsRequest,
              com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointsResponse>(
                service, METHODID_BATCH_DELETE_ACCESS_RIGHT_ACCESS_POINTS)))
        .addMethod(
          getCreateAccessRightAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.CreateAccessRightAccessPointGroupRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>(
                service, METHODID_CREATE_ACCESS_RIGHT_ACCESS_POINT_GROUP)))
        .addMethod(
          getBatchCreateAccessRightAccessPointGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsRequest,
              com.saltoapis.nebula.accessright.v1.BatchCreateAccessRightAccessPointGroupsResponse>(
                service, METHODID_BATCH_CREATE_ACCESS_RIGHT_ACCESS_POINT_GROUPS)))
        .addMethod(
          getGetAccessRightAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.GetAccessRightAccessPointGroupRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>(
                service, METHODID_GET_ACCESS_RIGHT_ACCESS_POINT_GROUP)))
        .addMethod(
          getListAccessRightAccessPointGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsRequest,
              com.saltoapis.nebula.accessright.v1.ListAccessRightAccessPointGroupsResponse>(
                service, METHODID_LIST_ACCESS_RIGHT_ACCESS_POINT_GROUPS)))
        .addMethod(
          getUpdateAccessRightAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.UpdateAccessRightAccessPointGroupRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightAccessPointGroup>(
                service, METHODID_UPDATE_ACCESS_RIGHT_ACCESS_POINT_GROUP)))
        .addMethod(
          getDeleteAccessRightAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.DeleteAccessRightAccessPointGroupRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCESS_RIGHT_ACCESS_POINT_GROUP)))
        .addMethod(
          getBatchDeleteAccessRightAccessPointGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsRequest,
              com.saltoapis.nebula.accessright.v1.BatchDeleteAccessRightAccessPointGroupsResponse>(
                service, METHODID_BATCH_DELETE_ACCESS_RIGHT_ACCESS_POINT_GROUPS)))
        .addMethod(
          getCreateAccessRightDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.CreateAccessRightDestinationRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightDestination>(
                service, METHODID_CREATE_ACCESS_RIGHT_DESTINATION)))
        .addMethod(
          getGetAccessRightDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.GetAccessRightDestinationRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightDestination>(
                service, METHODID_GET_ACCESS_RIGHT_DESTINATION)))
        .addMethod(
          getListAccessRightDestinationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsRequest,
              com.saltoapis.nebula.accessright.v1.ListAccessRightDestinationsResponse>(
                service, METHODID_LIST_ACCESS_RIGHT_DESTINATIONS)))
        .addMethod(
          getUpdateAccessRightDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.UpdateAccessRightDestinationRequest,
              com.saltoapis.nebula.accessright.v1.AccessRightDestination>(
                service, METHODID_UPDATE_ACCESS_RIGHT_DESTINATION)))
        .addMethod(
          getDeleteAccessRightDestinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accessright.v1.DeleteAccessRightDestinationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCESS_RIGHT_DESTINATION)))
        .build();
  }

  private static abstract class AccessRightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessRightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.accessright.v1.AccessRightProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessRightService");
    }
  }

  private static final class AccessRightServiceFileDescriptorSupplier
      extends AccessRightServiceBaseDescriptorSupplier {
    AccessRightServiceFileDescriptorSupplier() {}
  }

  private static final class AccessRightServiceMethodDescriptorSupplier
      extends AccessRightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AccessRightServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AccessRightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessRightServiceFileDescriptorSupplier())
              .addMethod(getCreateAccessRightMethod())
              .addMethod(getGetAccessRightMethod())
              .addMethod(getListAccessRightsMethod())
              .addMethod(getUpdateAccessRightMethod())
              .addMethod(getDeleteAccessRightMethod())
              .addMethod(getCreateAccessRightAccessPointMethod())
              .addMethod(getBatchCreateAccessRightAccessPointsMethod())
              .addMethod(getGetAccessRightAccessPointMethod())
              .addMethod(getListAccessRightAccessPointsMethod())
              .addMethod(getUpdateAccessRightAccessPointMethod())
              .addMethod(getDeleteAccessRightAccessPointMethod())
              .addMethod(getBatchDeleteAccessRightAccessPointsMethod())
              .addMethod(getCreateAccessRightAccessPointGroupMethod())
              .addMethod(getBatchCreateAccessRightAccessPointGroupsMethod())
              .addMethod(getGetAccessRightAccessPointGroupMethod())
              .addMethod(getListAccessRightAccessPointGroupsMethod())
              .addMethod(getUpdateAccessRightAccessPointGroupMethod())
              .addMethod(getDeleteAccessRightAccessPointGroupMethod())
              .addMethod(getBatchDeleteAccessRightAccessPointGroupsMethod())
              .addMethod(getCreateAccessRightDestinationMethod())
              .addMethod(getGetAccessRightDestinationMethod())
              .addMethod(getListAccessRightDestinationsMethod())
              .addMethod(getUpdateAccessRightDestinationMethod())
              .addMethod(getDeleteAccessRightDestinationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
