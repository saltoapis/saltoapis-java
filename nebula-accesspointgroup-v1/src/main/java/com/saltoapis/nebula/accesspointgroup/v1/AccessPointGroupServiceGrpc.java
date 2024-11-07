package com.saltoapis.nebula.accesspointgroup.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Access point group is a collection of access points that can be managed as a
 * single entity. It is used to simplify the management of multiple access
 * points by grouping them together and applying settings to all of them at
 * once. It's also used to optimize the amount of data being used to store all
 * access point identifiers by using only an access point group identifier.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: salto/nebula/accesspointgroup/v1/access_point_group.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessPointGroupServiceGrpc {

  private AccessPointGroupServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.accesspointgroup.v1.AccessPointGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getCreateAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessPointGroup",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getCreateAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getCreateAccessPointGroupMethod;
    if ((getCreateAccessPointGroupMethod = AccessPointGroupServiceGrpc.getCreateAccessPointGroupMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getCreateAccessPointGroupMethod = AccessPointGroupServiceGrpc.getCreateAccessPointGroupMethod) == null) {
          AccessPointGroupServiceGrpc.getCreateAccessPointGroupMethod = getCreateAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("CreateAccessPointGroup"))
              .build();
        }
      }
    }
    return getCreateAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getGetAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessPointGroup",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getGetAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getGetAccessPointGroupMethod;
    if ((getGetAccessPointGroupMethod = AccessPointGroupServiceGrpc.getGetAccessPointGroupMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getGetAccessPointGroupMethod = AccessPointGroupServiceGrpc.getGetAccessPointGroupMethod) == null) {
          AccessPointGroupServiceGrpc.getGetAccessPointGroupMethod = getGetAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("GetAccessPointGroup"))
              .build();
        }
      }
    }
    return getGetAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse> getListAccessPointGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessPointGroups",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse> getListAccessPointGroupsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest, com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse> getListAccessPointGroupsMethod;
    if ((getListAccessPointGroupsMethod = AccessPointGroupServiceGrpc.getListAccessPointGroupsMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getListAccessPointGroupsMethod = AccessPointGroupServiceGrpc.getListAccessPointGroupsMethod) == null) {
          AccessPointGroupServiceGrpc.getListAccessPointGroupsMethod = getListAccessPointGroupsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest, com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessPointGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("ListAccessPointGroups"))
              .build();
        }
      }
    }
    return getListAccessPointGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getUpdateAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessPointGroup",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getUpdateAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getUpdateAccessPointGroupMethod;
    if ((getUpdateAccessPointGroupMethod = AccessPointGroupServiceGrpc.getUpdateAccessPointGroupMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getUpdateAccessPointGroupMethod = AccessPointGroupServiceGrpc.getUpdateAccessPointGroupMethod) == null) {
          AccessPointGroupServiceGrpc.getUpdateAccessPointGroupMethod = getUpdateAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("UpdateAccessPointGroup"))
              .build();
        }
      }
    }
    return getUpdateAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getDeleteAccessPointGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessPointGroup",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getDeleteAccessPointGroupMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getDeleteAccessPointGroupMethod;
    if ((getDeleteAccessPointGroupMethod = AccessPointGroupServiceGrpc.getDeleteAccessPointGroupMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getDeleteAccessPointGroupMethod = AccessPointGroupServiceGrpc.getDeleteAccessPointGroupMethod) == null) {
          AccessPointGroupServiceGrpc.getDeleteAccessPointGroupMethod = getDeleteAccessPointGroupMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessPointGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("DeleteAccessPointGroup"))
              .build();
        }
      }
    }
    return getDeleteAccessPointGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getCreateAccessPointGroupAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessPointGroupAccessPoint",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getCreateAccessPointGroupAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getCreateAccessPointGroupAccessPointMethod;
    if ((getCreateAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getCreateAccessPointGroupAccessPointMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getCreateAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getCreateAccessPointGroupAccessPointMethod) == null) {
          AccessPointGroupServiceGrpc.getCreateAccessPointGroupAccessPointMethod = getCreateAccessPointGroupAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessPointGroupAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("CreateAccessPointGroupAccessPoint"))
              .build();
        }
      }
    }
    return getCreateAccessPointGroupAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse> getBatchCreateAccessPointGroupAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateAccessPointGroupAccessPoints",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse> getBatchCreateAccessPointGroupAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest, com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse> getBatchCreateAccessPointGroupAccessPointsMethod;
    if ((getBatchCreateAccessPointGroupAccessPointsMethod = AccessPointGroupServiceGrpc.getBatchCreateAccessPointGroupAccessPointsMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getBatchCreateAccessPointGroupAccessPointsMethod = AccessPointGroupServiceGrpc.getBatchCreateAccessPointGroupAccessPointsMethod) == null) {
          AccessPointGroupServiceGrpc.getBatchCreateAccessPointGroupAccessPointsMethod = getBatchCreateAccessPointGroupAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest, com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateAccessPointGroupAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("BatchCreateAccessPointGroupAccessPoints"))
              .build();
        }
      }
    }
    return getBatchCreateAccessPointGroupAccessPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getGetAccessPointGroupAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessPointGroupAccessPoint",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getGetAccessPointGroupAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getGetAccessPointGroupAccessPointMethod;
    if ((getGetAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getGetAccessPointGroupAccessPointMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getGetAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getGetAccessPointGroupAccessPointMethod) == null) {
          AccessPointGroupServiceGrpc.getGetAccessPointGroupAccessPointMethod = getGetAccessPointGroupAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessPointGroupAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("GetAccessPointGroupAccessPoint"))
              .build();
        }
      }
    }
    return getGetAccessPointGroupAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> getListAccessPointGroupAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessPointGroupAccessPoints",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> getListAccessPointGroupAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest, com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> getListAccessPointGroupAccessPointsMethod;
    if ((getListAccessPointGroupAccessPointsMethod = AccessPointGroupServiceGrpc.getListAccessPointGroupAccessPointsMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getListAccessPointGroupAccessPointsMethod = AccessPointGroupServiceGrpc.getListAccessPointGroupAccessPointsMethod) == null) {
          AccessPointGroupServiceGrpc.getListAccessPointGroupAccessPointsMethod = getListAccessPointGroupAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest, com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessPointGroupAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("ListAccessPointGroupAccessPoints"))
              .build();
        }
      }
    }
    return getListAccessPointGroupAccessPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getUpdateAccessPointGroupAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessPointGroupAccessPoint",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest,
      com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getUpdateAccessPointGroupAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getUpdateAccessPointGroupAccessPointMethod;
    if ((getUpdateAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getUpdateAccessPointGroupAccessPointMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getUpdateAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getUpdateAccessPointGroupAccessPointMethod) == null) {
          AccessPointGroupServiceGrpc.getUpdateAccessPointGroupAccessPointMethod = getUpdateAccessPointGroupAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest, com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccessPointGroupAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("UpdateAccessPointGroupAccessPoint"))
              .build();
        }
      }
    }
    return getUpdateAccessPointGroupAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest,
      com.google.protobuf.Empty> getDeleteAccessPointGroupAccessPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessPointGroupAccessPoint",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest,
      com.google.protobuf.Empty> getDeleteAccessPointGroupAccessPointMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest, com.google.protobuf.Empty> getDeleteAccessPointGroupAccessPointMethod;
    if ((getDeleteAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getDeleteAccessPointGroupAccessPointMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getDeleteAccessPointGroupAccessPointMethod = AccessPointGroupServiceGrpc.getDeleteAccessPointGroupAccessPointMethod) == null) {
          AccessPointGroupServiceGrpc.getDeleteAccessPointGroupAccessPointMethod = getDeleteAccessPointGroupAccessPointMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessPointGroupAccessPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("DeleteAccessPointGroupAccessPoint"))
              .build();
        }
      }
    }
    return getDeleteAccessPointGroupAccessPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse> getBatchDeleteAccessPointGroupAccessPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteAccessPointGroupAccessPoints",
      requestType = com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest.class,
      responseType = com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest,
      com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse> getBatchDeleteAccessPointGroupAccessPointsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest, com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse> getBatchDeleteAccessPointGroupAccessPointsMethod;
    if ((getBatchDeleteAccessPointGroupAccessPointsMethod = AccessPointGroupServiceGrpc.getBatchDeleteAccessPointGroupAccessPointsMethod) == null) {
      synchronized (AccessPointGroupServiceGrpc.class) {
        if ((getBatchDeleteAccessPointGroupAccessPointsMethod = AccessPointGroupServiceGrpc.getBatchDeleteAccessPointGroupAccessPointsMethod) == null) {
          AccessPointGroupServiceGrpc.getBatchDeleteAccessPointGroupAccessPointsMethod = getBatchDeleteAccessPointGroupAccessPointsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest, com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteAccessPointGroupAccessPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessPointGroupServiceMethodDescriptorSupplier("BatchDeleteAccessPointGroupAccessPoints"))
              .build();
        }
      }
    }
    return getBatchDeleteAccessPointGroupAccessPointsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessPointGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPointGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPointGroupServiceStub>() {
        @java.lang.Override
        public AccessPointGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPointGroupServiceStub(channel, callOptions);
        }
      };
    return AccessPointGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessPointGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPointGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPointGroupServiceBlockingStub>() {
        @java.lang.Override
        public AccessPointGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPointGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessPointGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessPointGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessPointGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessPointGroupServiceFutureStub>() {
        @java.lang.Override
        public AccessPointGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessPointGroupServiceFutureStub(channel, callOptions);
        }
      };
    return AccessPointGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Access point group is a collection of access points that can be managed as a
   * single entity. It is used to simplify the management of multiple access
   * points by grouping them together and applying settings to all of them at
   * once. It's also used to optimize the amount of data being used to store all
   * access point identifiers by using only an access point group identifier.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an access point group
     * Creates an access point group.
     * </pre>
     */
    default void createAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access point group
     * Gets an existing access point group.
     * </pre>
     */
    default void getAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access point groups
     * Returns a list of access point groups that have been previously
     * created.
     * </pre>
     */
    default void listAccessPointGroups(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessPointGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access point group.
     * </pre>
     */
    default void updateAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access point group
     * Soft deletes an access point group.
     * </pre>
     */
    default void deleteAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessPointGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access point group's access point association.
     * </pre>
     */
    default void createAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessPointGroupAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a batch of access point group access points
     * Creates a batch of access point group's access points association.
     * This method allows the creation of multiple access point group's access points in a single operation.
     * </pre>
     */
    default void batchCreateAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateAccessPointGroupAccessPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point group's access point association.
     * </pre>
     */
    default void getAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessPointGroupAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access point group's access point associations.
     * </pre>
     */
    default void listAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessPointGroupAccessPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point group's access point association.
     * </pre>
     */
    default void updateAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccessPointGroupAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access point group's access point association.
     * </pre>
     */
    default void deleteAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessPointGroupAccessPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a batch of access point group access point associations
     * Deletes a batch of access point group access point associations. This method allows the
     * deletion of multiple access point group access points in a single operation. This cannot be undone.
     * </pre>
     */
    default void batchDeleteAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteAccessPointGroupAccessPointsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccessPointGroupService.
   * <pre>
   * Access point group is a collection of access points that can be managed as a
   * single entity. It is used to simplify the management of multiple access
   * points by grouping them together and applying settings to all of them at
   * once. It's also used to optimize the amount of data being used to store all
   * access point identifiers by using only an access point group identifier.
   * </pre>
   */
  public static abstract class AccessPointGroupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccessPointGroupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccessPointGroupService.
   * <pre>
   * Access point group is a collection of access points that can be managed as a
   * single entity. It is used to simplify the management of multiple access
   * points by grouping them together and applying settings to all of them at
   * once. It's also used to optimize the amount of data being used to store all
   * access point identifiers by using only an access point group identifier.
   * </pre>
   */
  public static final class AccessPointGroupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccessPointGroupServiceStub> {
    private AccessPointGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPointGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPointGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access point group.
     * </pre>
     */
    public void createAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access point group
     * Gets an existing access point group.
     * </pre>
     */
    public void getAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access point groups
     * Returns a list of access point groups that have been previously
     * created.
     * </pre>
     */
    public void listAccessPointGroups(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessPointGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access point group.
     * </pre>
     */
    public void updateAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access point group
     * Soft deletes an access point group.
     * </pre>
     */
    public void deleteAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessPointGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access point group's access point association.
     * </pre>
     */
    public void createAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessPointGroupAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a batch of access point group access points
     * Creates a batch of access point group's access points association.
     * This method allows the creation of multiple access point group's access points in a single operation.
     * </pre>
     */
    public void batchCreateAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateAccessPointGroupAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point group's access point association.
     * </pre>
     */
    public void getAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessPointGroupAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access point group's access point associations.
     * </pre>
     */
    public void listAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessPointGroupAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point group's access point association.
     * </pre>
     */
    public void updateAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccessPointGroupAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access point group's access point association.
     * </pre>
     */
    public void deleteAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessPointGroupAccessPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a batch of access point group access point associations
     * Deletes a batch of access point group access point associations. This method allows the
     * deletion of multiple access point group access points in a single operation. This cannot be undone.
     * </pre>
     */
    public void batchDeleteAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteAccessPointGroupAccessPointsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccessPointGroupService.
   * <pre>
   * Access point group is a collection of access points that can be managed as a
   * single entity. It is used to simplify the management of multiple access
   * points by grouping them together and applying settings to all of them at
   * once. It's also used to optimize the amount of data being used to store all
   * access point identifiers by using only an access point group identifier.
   * </pre>
   */
  public static final class AccessPointGroupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccessPointGroupServiceBlockingStub> {
    private AccessPointGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPointGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPointGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access point group.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup createAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access point group
     * Gets an existing access point group.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup getAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access point groups
     * Returns a list of access point groups that have been previously
     * created.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse listAccessPointGroups(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessPointGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access point group.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup updateAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access point group
     * Soft deletes an access point group.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup deleteAccessPointGroup(com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessPointGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access point group's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint createAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessPointGroupAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a batch of access point group access points
     * Creates a batch of access point group's access points association.
     * This method allows the creation of multiple access point group's access points in a single operation.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse batchCreateAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateAccessPointGroupAccessPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point group's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint getAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessPointGroupAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access point group's access point associations.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse listAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessPointGroupAccessPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point group's access point association.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint updateAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccessPointGroupAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access point group's access point association.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAccessPointGroupAccessPoint(com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessPointGroupAccessPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a batch of access point group access point associations
     * Deletes a batch of access point group access point associations. This method allows the
     * deletion of multiple access point group access points in a single operation. This cannot be undone.
     * </pre>
     */
    public com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse batchDeleteAccessPointGroupAccessPoints(com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteAccessPointGroupAccessPointsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccessPointGroupService.
   * <pre>
   * Access point group is a collection of access points that can be managed as a
   * single entity. It is used to simplify the management of multiple access
   * points by grouping them together and applying settings to all of them at
   * once. It's also used to optimize the amount of data being used to store all
   * access point identifiers by using only an access point group identifier.
   * </pre>
   */
  public static final class AccessPointGroupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccessPointGroupServiceFutureStub> {
    private AccessPointGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessPointGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessPointGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an access point group
     * Creates an access point group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> createAccessPointGroup(
        com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access point group
     * Gets an existing access point group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> getAccessPointGroup(
        com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access point groups
     * Returns a list of access point groups that have been previously
     * created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse> listAccessPointGroups(
        com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessPointGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access point group
     * Updates an existing access point group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> updateAccessPointGroup(
        com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access point group
     * Soft deletes an access point group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup> deleteAccessPointGroup(
        com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessPointGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an access point
     * Creates an access point group's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> createAccessPointGroupAccessPoint(
        com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessPointGroupAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a batch of access point group access points
     * Creates a batch of access point group's access points association.
     * This method allows the creation of multiple access point group's access points in a single operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse> batchCreateAccessPointGroupAccessPoints(
        com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateAccessPointGroupAccessPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access point
     * Retrieves an existing access point group's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> getAccessPointGroupAccessPoint(
        com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessPointGroupAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access points
     * Lists an existing access point group's access point associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse> listAccessPointGroupAccessPoints(
        com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessPointGroupAccessPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access point
     * Updates an existing access point group's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint> updateAccessPointGroupAccessPoint(
        com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccessPointGroupAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access point
     * Deletes an access point group's access point association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccessPointGroupAccessPoint(
        com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessPointGroupAccessPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a batch of access point group access point associations
     * Deletes a batch of access point group access point associations. This method allows the
     * deletion of multiple access point group access points in a single operation. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse> batchDeleteAccessPointGroupAccessPoints(
        com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteAccessPointGroupAccessPointsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCESS_POINT_GROUP = 0;
  private static final int METHODID_GET_ACCESS_POINT_GROUP = 1;
  private static final int METHODID_LIST_ACCESS_POINT_GROUPS = 2;
  private static final int METHODID_UPDATE_ACCESS_POINT_GROUP = 3;
  private static final int METHODID_DELETE_ACCESS_POINT_GROUP = 4;
  private static final int METHODID_CREATE_ACCESS_POINT_GROUP_ACCESS_POINT = 5;
  private static final int METHODID_BATCH_CREATE_ACCESS_POINT_GROUP_ACCESS_POINTS = 6;
  private static final int METHODID_GET_ACCESS_POINT_GROUP_ACCESS_POINT = 7;
  private static final int METHODID_LIST_ACCESS_POINT_GROUP_ACCESS_POINTS = 8;
  private static final int METHODID_UPDATE_ACCESS_POINT_GROUP_ACCESS_POINT = 9;
  private static final int METHODID_DELETE_ACCESS_POINT_GROUP_ACCESS_POINT = 10;
  private static final int METHODID_BATCH_DELETE_ACCESS_POINT_GROUP_ACCESS_POINTS = 11;

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
        case METHODID_CREATE_ACCESS_POINT_GROUP:
          serviceImpl.createAccessPointGroup((com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>) responseObserver);
          break;
        case METHODID_GET_ACCESS_POINT_GROUP:
          serviceImpl.getAccessPointGroup((com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_POINT_GROUPS:
          serviceImpl.listAccessPointGroups((com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_POINT_GROUP:
          serviceImpl.updateAccessPointGroup((com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_POINT_GROUP:
          serviceImpl.deleteAccessPointGroup((com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>) responseObserver);
          break;
        case METHODID_CREATE_ACCESS_POINT_GROUP_ACCESS_POINT:
          serviceImpl.createAccessPointGroupAccessPoint((com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_ACCESS_POINT_GROUP_ACCESS_POINTS:
          serviceImpl.batchCreateAccessPointGroupAccessPoints((com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse>) responseObserver);
          break;
        case METHODID_GET_ACCESS_POINT_GROUP_ACCESS_POINT:
          serviceImpl.getAccessPointGroupAccessPoint((com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_POINT_GROUP_ACCESS_POINTS:
          serviceImpl.listAccessPointGroupAccessPoints((com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_POINT_GROUP_ACCESS_POINT:
          serviceImpl.updateAccessPointGroupAccessPoint((com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_POINT_GROUP_ACCESS_POINT:
          serviceImpl.deleteAccessPointGroupAccessPoint((com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ACCESS_POINT_GROUP_ACCESS_POINTS:
          serviceImpl.batchDeleteAccessPointGroupAccessPoints((com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse>) responseObserver);
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
          getCreateAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>(
                service, METHODID_CREATE_ACCESS_POINT_GROUP)))
        .addMethod(
          getGetAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>(
                service, METHODID_GET_ACCESS_POINT_GROUP)))
        .addMethod(
          getListAccessPointGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsRequest,
              com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupsResponse>(
                service, METHODID_LIST_ACCESS_POINT_GROUPS)))
        .addMethod(
          getUpdateAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>(
                service, METHODID_UPDATE_ACCESS_POINT_GROUP)))
        .addMethod(
          getDeleteAccessPointGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroup>(
                service, METHODID_DELETE_ACCESS_POINT_GROUP)))
        .addMethod(
          getCreateAccessPointGroupAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.CreateAccessPointGroupAccessPointRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>(
                service, METHODID_CREATE_ACCESS_POINT_GROUP_ACCESS_POINT)))
        .addMethod(
          getBatchCreateAccessPointGroupAccessPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsRequest,
              com.saltoapis.nebula.accesspointgroup.v1.BatchCreateAccessPointGroupAccessPointsResponse>(
                service, METHODID_BATCH_CREATE_ACCESS_POINT_GROUP_ACCESS_POINTS)))
        .addMethod(
          getGetAccessPointGroupAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.GetAccessPointGroupAccessPointRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>(
                service, METHODID_GET_ACCESS_POINT_GROUP_ACCESS_POINT)))
        .addMethod(
          getListAccessPointGroupAccessPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsRequest,
              com.saltoapis.nebula.accesspointgroup.v1.ListAccessPointGroupAccessPointsResponse>(
                service, METHODID_LIST_ACCESS_POINT_GROUP_ACCESS_POINTS)))
        .addMethod(
          getUpdateAccessPointGroupAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.UpdateAccessPointGroupAccessPointRequest,
              com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupAccessPoint>(
                service, METHODID_UPDATE_ACCESS_POINT_GROUP_ACCESS_POINT)))
        .addMethod(
          getDeleteAccessPointGroupAccessPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.DeleteAccessPointGroupAccessPointRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCESS_POINT_GROUP_ACCESS_POINT)))
        .addMethod(
          getBatchDeleteAccessPointGroupAccessPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsRequest,
              com.saltoapis.nebula.accesspointgroup.v1.BatchDeleteAccessPointGroupAccessPointsResponse>(
                service, METHODID_BATCH_DELETE_ACCESS_POINT_GROUP_ACCESS_POINTS)))
        .build();
  }

  private static abstract class AccessPointGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessPointGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.accesspointgroup.v1.AccessPointGroupProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessPointGroupService");
    }
  }

  private static final class AccessPointGroupServiceFileDescriptorSupplier
      extends AccessPointGroupServiceBaseDescriptorSupplier {
    AccessPointGroupServiceFileDescriptorSupplier() {}
  }

  private static final class AccessPointGroupServiceMethodDescriptorSupplier
      extends AccessPointGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AccessPointGroupServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AccessPointGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessPointGroupServiceFileDescriptorSupplier())
              .addMethod(getCreateAccessPointGroupMethod())
              .addMethod(getGetAccessPointGroupMethod())
              .addMethod(getListAccessPointGroupsMethod())
              .addMethod(getUpdateAccessPointGroupMethod())
              .addMethod(getDeleteAccessPointGroupMethod())
              .addMethod(getCreateAccessPointGroupAccessPointMethod())
              .addMethod(getBatchCreateAccessPointGroupAccessPointsMethod())
              .addMethod(getGetAccessPointGroupAccessPointMethod())
              .addMethod(getListAccessPointGroupAccessPointsMethod())
              .addMethod(getUpdateAccessPointGroupAccessPointMethod())
              .addMethod(getDeleteAccessPointGroupAccessPointMethod())
              .addMethod(getBatchDeleteAccessPointGroupAccessPointsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
