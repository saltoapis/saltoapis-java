package com.saltoapis.nebula.installation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An installation represents any entity such as a company, office or building
 * that contains all the access control objects (access points, access rights,
 * users, etc.) that comprise the access control system within a facility.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/installation/v1/installation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstallationServiceGrpc {

  private InstallationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.installation.v1.InstallationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreateInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getCreateInstallationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstallation",
      requestType = com.saltoapis.nebula.installation.v1.CreateInstallationRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Installation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreateInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getCreateInstallationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreateInstallationRequest, com.saltoapis.nebula.installation.v1.Installation> getCreateInstallationMethod;
    if ((getCreateInstallationMethod = InstallationServiceGrpc.getCreateInstallationMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getCreateInstallationMethod = InstallationServiceGrpc.getCreateInstallationMethod) == null) {
          InstallationServiceGrpc.getCreateInstallationMethod = getCreateInstallationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.CreateInstallationRequest, com.saltoapis.nebula.installation.v1.Installation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstallation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.CreateInstallationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("CreateInstallation"))
              .build();
        }
      }
    }
    return getCreateInstallationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getGetInstallationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstallation",
      requestType = com.saltoapis.nebula.installation.v1.GetInstallationRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Installation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getGetInstallationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetInstallationRequest, com.saltoapis.nebula.installation.v1.Installation> getGetInstallationMethod;
    if ((getGetInstallationMethod = InstallationServiceGrpc.getGetInstallationMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getGetInstallationMethod = InstallationServiceGrpc.getGetInstallationMethod) == null) {
          InstallationServiceGrpc.getGetInstallationMethod = getGetInstallationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.GetInstallationRequest, com.saltoapis.nebula.installation.v1.Installation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstallation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.GetInstallationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("GetInstallation"))
              .build();
        }
      }
    }
    return getGetInstallationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListInstallationsRequest,
      com.saltoapis.nebula.installation.v1.ListInstallationsResponse> getListInstallationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstallations",
      requestType = com.saltoapis.nebula.installation.v1.ListInstallationsRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.ListInstallationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListInstallationsRequest,
      com.saltoapis.nebula.installation.v1.ListInstallationsResponse> getListInstallationsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListInstallationsRequest, com.saltoapis.nebula.installation.v1.ListInstallationsResponse> getListInstallationsMethod;
    if ((getListInstallationsMethod = InstallationServiceGrpc.getListInstallationsMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getListInstallationsMethod = InstallationServiceGrpc.getListInstallationsMethod) == null) {
          InstallationServiceGrpc.getListInstallationsMethod = getListInstallationsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.ListInstallationsRequest, com.saltoapis.nebula.installation.v1.ListInstallationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstallations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ListInstallationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ListInstallationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("ListInstallations"))
              .build();
        }
      }
    }
    return getListInstallationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getUpdateInstallationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstallation",
      requestType = com.saltoapis.nebula.installation.v1.UpdateInstallationRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Installation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getUpdateInstallationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateInstallationRequest, com.saltoapis.nebula.installation.v1.Installation> getUpdateInstallationMethod;
    if ((getUpdateInstallationMethod = InstallationServiceGrpc.getUpdateInstallationMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUpdateInstallationMethod = InstallationServiceGrpc.getUpdateInstallationMethod) == null) {
          InstallationServiceGrpc.getUpdateInstallationMethod = getUpdateInstallationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UpdateInstallationRequest, com.saltoapis.nebula.installation.v1.Installation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstallation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UpdateInstallationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UpdateInstallation"))
              .build();
        }
      }
    }
    return getUpdateInstallationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.DeleteInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getDeleteInstallationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstallation",
      requestType = com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Installation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.DeleteInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getDeleteInstallationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.DeleteInstallationRequest, com.saltoapis.nebula.installation.v1.Installation> getDeleteInstallationMethod;
    if ((getDeleteInstallationMethod = InstallationServiceGrpc.getDeleteInstallationMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getDeleteInstallationMethod = InstallationServiceGrpc.getDeleteInstallationMethod) == null) {
          InstallationServiceGrpc.getDeleteInstallationMethod = getDeleteInstallationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.DeleteInstallationRequest, com.saltoapis.nebula.installation.v1.Installation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstallation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.DeleteInstallationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("DeleteInstallation"))
              .build();
        }
      }
    }
    return getDeleteInstallationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getUndeleteInstallationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UndeleteInstallation",
      requestType = com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Installation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest,
      com.saltoapis.nebula.installation.v1.Installation> getUndeleteInstallationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest, com.saltoapis.nebula.installation.v1.Installation> getUndeleteInstallationMethod;
    if ((getUndeleteInstallationMethod = InstallationServiceGrpc.getUndeleteInstallationMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUndeleteInstallationMethod = InstallationServiceGrpc.getUndeleteInstallationMethod) == null) {
          InstallationServiceGrpc.getUndeleteInstallationMethod = getUndeleteInstallationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest, com.saltoapis.nebula.installation.v1.Installation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UndeleteInstallation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Installation.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UndeleteInstallation"))
              .build();
        }
      }
    }
    return getUndeleteInstallationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreatePolicyRequest,
      com.saltoapis.nebula.installation.v1.Policy> getCreatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePolicy",
      requestType = com.saltoapis.nebula.installation.v1.CreatePolicyRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreatePolicyRequest,
      com.saltoapis.nebula.installation.v1.Policy> getCreatePolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreatePolicyRequest, com.saltoapis.nebula.installation.v1.Policy> getCreatePolicyMethod;
    if ((getCreatePolicyMethod = InstallationServiceGrpc.getCreatePolicyMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getCreatePolicyMethod = InstallationServiceGrpc.getCreatePolicyMethod) == null) {
          InstallationServiceGrpc.getCreatePolicyMethod = getCreatePolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.CreatePolicyRequest, com.saltoapis.nebula.installation.v1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.CreatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("CreatePolicy"))
              .build();
        }
      }
    }
    return getCreatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetPolicyRequest,
      com.saltoapis.nebula.installation.v1.Policy> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = com.saltoapis.nebula.installation.v1.GetPolicyRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetPolicyRequest,
      com.saltoapis.nebula.installation.v1.Policy> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetPolicyRequest, com.saltoapis.nebula.installation.v1.Policy> getGetPolicyMethod;
    if ((getGetPolicyMethod = InstallationServiceGrpc.getGetPolicyMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getGetPolicyMethod = InstallationServiceGrpc.getGetPolicyMethod) == null) {
          InstallationServiceGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.GetPolicyRequest, com.saltoapis.nebula.installation.v1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("GetPolicy"))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListPoliciesRequest,
      com.saltoapis.nebula.installation.v1.ListPoliciesResponse> getListPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPolicies",
      requestType = com.saltoapis.nebula.installation.v1.ListPoliciesRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.ListPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListPoliciesRequest,
      com.saltoapis.nebula.installation.v1.ListPoliciesResponse> getListPoliciesMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListPoliciesRequest, com.saltoapis.nebula.installation.v1.ListPoliciesResponse> getListPoliciesMethod;
    if ((getListPoliciesMethod = InstallationServiceGrpc.getListPoliciesMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getListPoliciesMethod = InstallationServiceGrpc.getListPoliciesMethod) == null) {
          InstallationServiceGrpc.getListPoliciesMethod = getListPoliciesMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.ListPoliciesRequest, com.saltoapis.nebula.installation.v1.ListPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ListPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ListPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("ListPolicies"))
              .build();
        }
      }
    }
    return getListPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdatePolicyRequest,
      com.saltoapis.nebula.installation.v1.Policy> getUpdatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePolicy",
      requestType = com.saltoapis.nebula.installation.v1.UpdatePolicyRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdatePolicyRequest,
      com.saltoapis.nebula.installation.v1.Policy> getUpdatePolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdatePolicyRequest, com.saltoapis.nebula.installation.v1.Policy> getUpdatePolicyMethod;
    if ((getUpdatePolicyMethod = InstallationServiceGrpc.getUpdatePolicyMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUpdatePolicyMethod = InstallationServiceGrpc.getUpdatePolicyMethod) == null) {
          InstallationServiceGrpc.getUpdatePolicyMethod = getUpdatePolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UpdatePolicyRequest, com.saltoapis.nebula.installation.v1.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UpdatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UpdatePolicy"))
              .build();
        }
      }
    }
    return getUpdatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.DeletePolicyRequest,
      com.google.protobuf.Empty> getDeletePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePolicy",
      requestType = com.saltoapis.nebula.installation.v1.DeletePolicyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.DeletePolicyRequest,
      com.google.protobuf.Empty> getDeletePolicyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.DeletePolicyRequest, com.google.protobuf.Empty> getDeletePolicyMethod;
    if ((getDeletePolicyMethod = InstallationServiceGrpc.getDeletePolicyMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getDeletePolicyMethod = InstallationServiceGrpc.getDeletePolicyMethod) == null) {
          InstallationServiceGrpc.getDeletePolicyMethod = getDeletePolicyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.DeletePolicyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.DeletePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("DeletePolicy"))
              .build();
        }
      }
    }
    return getDeletePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.TestPermissionsRequest,
      com.saltoapis.nebula.installation.v1.TestPermissionsResponse> getTestPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestPermissions",
      requestType = com.saltoapis.nebula.installation.v1.TestPermissionsRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.TestPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.TestPermissionsRequest,
      com.saltoapis.nebula.installation.v1.TestPermissionsResponse> getTestPermissionsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.TestPermissionsRequest, com.saltoapis.nebula.installation.v1.TestPermissionsResponse> getTestPermissionsMethod;
    if ((getTestPermissionsMethod = InstallationServiceGrpc.getTestPermissionsMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getTestPermissionsMethod = InstallationServiceGrpc.getTestPermissionsMethod) == null) {
          InstallationServiceGrpc.getTestPermissionsMethod = getTestPermissionsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.TestPermissionsRequest, com.saltoapis.nebula.installation.v1.TestPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.TestPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.TestPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("TestPermissions"))
              .build();
        }
      }
    }
    return getTestPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest,
      com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse> getTransferInstallationOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferInstallationOwnership",
      requestType = com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest,
      com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse> getTransferInstallationOwnershipMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest, com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse> getTransferInstallationOwnershipMethod;
    if ((getTransferInstallationOwnershipMethod = InstallationServiceGrpc.getTransferInstallationOwnershipMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getTransferInstallationOwnershipMethod = InstallationServiceGrpc.getTransferInstallationOwnershipMethod) == null) {
          InstallationServiceGrpc.getTransferInstallationOwnershipMethod = getTransferInstallationOwnershipMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest, com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferInstallationOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("TransferInstallationOwnership"))
              .build();
        }
      }
    }
    return getTransferInstallationOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest,
      com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse> getAcceptInstallationOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptInstallationOwnership",
      requestType = com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest,
      com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse> getAcceptInstallationOwnershipMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest, com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse> getAcceptInstallationOwnershipMethod;
    if ((getAcceptInstallationOwnershipMethod = InstallationServiceGrpc.getAcceptInstallationOwnershipMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getAcceptInstallationOwnershipMethod = InstallationServiceGrpc.getAcceptInstallationOwnershipMethod) == null) {
          InstallationServiceGrpc.getAcceptInstallationOwnershipMethod = getAcceptInstallationOwnershipMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest, com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptInstallationOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("AcceptInstallationOwnership"))
              .build();
        }
      }
    }
    return getAcceptInstallationOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetSubscriptionRequest,
      com.saltoapis.nebula.installation.v1.Subscription> getGetSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubscription",
      requestType = com.saltoapis.nebula.installation.v1.GetSubscriptionRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.Subscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetSubscriptionRequest,
      com.saltoapis.nebula.installation.v1.Subscription> getGetSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.GetSubscriptionRequest, com.saltoapis.nebula.installation.v1.Subscription> getGetSubscriptionMethod;
    if ((getGetSubscriptionMethod = InstallationServiceGrpc.getGetSubscriptionMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getGetSubscriptionMethod = InstallationServiceGrpc.getGetSubscriptionMethod) == null) {
          InstallationServiceGrpc.getGetSubscriptionMethod = getGetSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.GetSubscriptionRequest, com.saltoapis.nebula.installation.v1.Subscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.GetSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.Subscription.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("GetSubscription"))
              .build();
        }
      }
    }
    return getGetSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest,
      com.saltoapis.nebula.installation.v1.BillingInfo> getUpdateBillingInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingInfo",
      requestType = com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.BillingInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest,
      com.saltoapis.nebula.installation.v1.BillingInfo> getUpdateBillingInfoMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest, com.saltoapis.nebula.installation.v1.BillingInfo> getUpdateBillingInfoMethod;
    if ((getUpdateBillingInfoMethod = InstallationServiceGrpc.getUpdateBillingInfoMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUpdateBillingInfoMethod = InstallationServiceGrpc.getUpdateBillingInfoMethod) == null) {
          InstallationServiceGrpc.getUpdateBillingInfoMethod = getUpdateBillingInfoMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest, com.saltoapis.nebula.installation.v1.BillingInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.BillingInfo.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UpdateBillingInfo"))
              .build();
        }
      }
    }
    return getUpdateBillingInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest,
      com.saltoapis.nebula.installation.v1.PaymentMethod> getUpdatePaymentMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePaymentMethod",
      requestType = com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.PaymentMethod.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest,
      com.saltoapis.nebula.installation.v1.PaymentMethod> getUpdatePaymentMethodMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest, com.saltoapis.nebula.installation.v1.PaymentMethod> getUpdatePaymentMethodMethod;
    if ((getUpdatePaymentMethodMethod = InstallationServiceGrpc.getUpdatePaymentMethodMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUpdatePaymentMethodMethod = InstallationServiceGrpc.getUpdatePaymentMethodMethod) == null) {
          InstallationServiceGrpc.getUpdatePaymentMethodMethod = getUpdatePaymentMethodMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest, com.saltoapis.nebula.installation.v1.PaymentMethod>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePaymentMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.PaymentMethod.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UpdatePaymentMethod"))
              .build();
        }
      }
    }
    return getUpdatePaymentMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateCardRequest,
      com.saltoapis.nebula.installation.v1.UpdateCardResponse> getUpdateCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCard",
      requestType = com.saltoapis.nebula.installation.v1.UpdateCardRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.UpdateCardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateCardRequest,
      com.saltoapis.nebula.installation.v1.UpdateCardResponse> getUpdateCardMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UpdateCardRequest, com.saltoapis.nebula.installation.v1.UpdateCardResponse> getUpdateCardMethod;
    if ((getUpdateCardMethod = InstallationServiceGrpc.getUpdateCardMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUpdateCardMethod = InstallationServiceGrpc.getUpdateCardMethod) == null) {
          InstallationServiceGrpc.getUpdateCardMethod = getUpdateCardMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UpdateCardRequest, com.saltoapis.nebula.installation.v1.UpdateCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UpdateCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UpdateCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UpdateCard"))
              .build();
        }
      }
    }
    return getUpdateCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest,
      com.saltoapis.nebula.installation.v1.PaymentAuthorization> getCreatePaymentAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePaymentAuthorization",
      requestType = com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.PaymentAuthorization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest,
      com.saltoapis.nebula.installation.v1.PaymentAuthorization> getCreatePaymentAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest, com.saltoapis.nebula.installation.v1.PaymentAuthorization> getCreatePaymentAuthorizationMethod;
    if ((getCreatePaymentAuthorizationMethod = InstallationServiceGrpc.getCreatePaymentAuthorizationMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getCreatePaymentAuthorizationMethod = InstallationServiceGrpc.getCreatePaymentAuthorizationMethod) == null) {
          InstallationServiceGrpc.getCreatePaymentAuthorizationMethod = getCreatePaymentAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest, com.saltoapis.nebula.installation.v1.PaymentAuthorization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePaymentAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.PaymentAuthorization.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("CreatePaymentAuthorization"))
              .build();
        }
      }
    }
    return getCreatePaymentAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListInvoicesRequest,
      com.saltoapis.nebula.installation.v1.ListInvoicesResponse> getListInvoicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInvoices",
      requestType = com.saltoapis.nebula.installation.v1.ListInvoicesRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.ListInvoicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListInvoicesRequest,
      com.saltoapis.nebula.installation.v1.ListInvoicesResponse> getListInvoicesMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ListInvoicesRequest, com.saltoapis.nebula.installation.v1.ListInvoicesResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = InstallationServiceGrpc.getListInvoicesMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getListInvoicesMethod = InstallationServiceGrpc.getListInvoicesMethod) == null) {
          InstallationServiceGrpc.getListInvoicesMethod = getListInvoicesMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.ListInvoicesRequest, com.saltoapis.nebula.installation.v1.ListInvoicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ListInvoicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ListInvoicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("ListInvoices"))
              .build();
        }
      }
    }
    return getListInvoicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ApplyCouponRequest,
      com.saltoapis.nebula.installation.v1.ApplyCouponResponse> getApplyCouponMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyCoupon",
      requestType = com.saltoapis.nebula.installation.v1.ApplyCouponRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.ApplyCouponResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ApplyCouponRequest,
      com.saltoapis.nebula.installation.v1.ApplyCouponResponse> getApplyCouponMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.ApplyCouponRequest, com.saltoapis.nebula.installation.v1.ApplyCouponResponse> getApplyCouponMethod;
    if ((getApplyCouponMethod = InstallationServiceGrpc.getApplyCouponMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getApplyCouponMethod = InstallationServiceGrpc.getApplyCouponMethod) == null) {
          InstallationServiceGrpc.getApplyCouponMethod = getApplyCouponMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.ApplyCouponRequest, com.saltoapis.nebula.installation.v1.ApplyCouponResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyCoupon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ApplyCouponRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.ApplyCouponResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("ApplyCoupon"))
              .build();
        }
      }
    }
    return getApplyCouponMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UnapplyCouponRequest,
      com.saltoapis.nebula.installation.v1.UnapplyCouponResponse> getUnapplyCouponMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnapplyCoupon",
      requestType = com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.class,
      responseType = com.saltoapis.nebula.installation.v1.UnapplyCouponResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UnapplyCouponRequest,
      com.saltoapis.nebula.installation.v1.UnapplyCouponResponse> getUnapplyCouponMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.installation.v1.UnapplyCouponRequest, com.saltoapis.nebula.installation.v1.UnapplyCouponResponse> getUnapplyCouponMethod;
    if ((getUnapplyCouponMethod = InstallationServiceGrpc.getUnapplyCouponMethod) == null) {
      synchronized (InstallationServiceGrpc.class) {
        if ((getUnapplyCouponMethod = InstallationServiceGrpc.getUnapplyCouponMethod) == null) {
          InstallationServiceGrpc.getUnapplyCouponMethod = getUnapplyCouponMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.installation.v1.UnapplyCouponRequest, com.saltoapis.nebula.installation.v1.UnapplyCouponResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnapplyCoupon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UnapplyCouponRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.installation.v1.UnapplyCouponResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstallationServiceMethodDescriptorSupplier("UnapplyCoupon"))
              .build();
        }
      }
    }
    return getUnapplyCouponMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstallationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstallationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstallationServiceStub>() {
        @java.lang.Override
        public InstallationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstallationServiceStub(channel, callOptions);
        }
      };
    return InstallationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstallationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstallationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstallationServiceBlockingStub>() {
        @java.lang.Override
        public InstallationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstallationServiceBlockingStub(channel, callOptions);
        }
      };
    return InstallationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstallationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstallationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstallationServiceFutureStub>() {
        @java.lang.Override
        public InstallationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstallationServiceFutureStub(channel, callOptions);
        }
      };
    return InstallationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An installation represents any entity such as a company, office or building
   * that contains all the access control objects (access points, access rights,
   * users, etc.) that comprise the access control system within a facility.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an installation
     * Creates a new installation.
     * </pre>
     */
    default void createInstallation(com.saltoapis.nebula.installation.v1.CreateInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInstallationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an installation
     * Retrieves an existing installation.
     * </pre>
     */
    default void getInstallation(com.saltoapis.nebula.installation.v1.GetInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInstallationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List installations
     * Returns a list of installations that have been previously created.
     * </pre>
     */
    default void listInstallations(com.saltoapis.nebula.installation.v1.ListInstallationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListInstallationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInstallationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an installation
     * Updates an existing installation.
     * </pre>
     */
    default void updateInstallation(com.saltoapis.nebula.installation.v1.UpdateInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInstallationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an installation
     * Soft deletes an installation. This action can be reversed if required.
     * </pre>
     */
    default void deleteInstallation(com.saltoapis.nebula.installation.v1.DeleteInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInstallationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Undelete an installation
     * Undeletes an installation.
     * </pre>
     */
    default void undeleteInstallation(com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndeleteInstallationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a policy for the installation. An IAM policy is a collection of
     * roles associated to users that define who has what type of access to manage
     * access control objects within the installation.
     * </pre>
     */
    default void createPolicy(com.saltoapis.nebula.installation.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a policy
     * Retrieves an existing policy.
     * </pre>
     */
    default void getPolicy(com.saltoapis.nebula.installation.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    default void listPolicies(com.saltoapis.nebula.installation.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a policy
     * Updates an existing policy.
     * </pre>
     */
    default void updatePolicy(com.saltoapis.nebula.installation.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    default void deletePolicy(com.saltoapis.nebula.installation.v1.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tests permissions
     * Returns permissions that a caller has within the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    default void testPermissions(com.saltoapis.nebula.installation.v1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfer installation ownership
     * Transfers the ownership of an installation.
     * </pre>
     */
    default void transferInstallationOwnership(com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferInstallationOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accept installation ownership
     * Accepts the ownership of an installation.
     * </pre>
     */
    default void acceptInstallationOwnership(com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptInstallationOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a subscription
     * Gets an existing subscription
     * </pre>
     */
    default void getSubscription(com.saltoapis.nebula.installation.v1.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Subscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a subscription's billing information
     * Updates an existing subscription's billing information.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    default void updateBillingInfo(com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.BillingInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update subscription payment method
     * Updates an existing subscription payment method. If there is a payment
     * method associated with the subscription, it will be deleted.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    default void updatePaymentMethod(com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.PaymentMethod> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePaymentMethodMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update subscription payment method's card
     * Updates subscription payment method's card. If there is a payment method
     * associated with the subscription, it will be deleted.
     * </pre>
     */
    default void updateCard(com.saltoapis.nebula.installation.v1.UpdateCardRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.UpdateCardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a payment authorization
     * Creates a payment authorization for the subscription.
     * The payment authorization is a process that allows the customer to
     * authorize a payment card for future use. This is done by creating a payment
     * authorization request. The result of the request is a payment authorization
     * that must be authorized by the client in the client's UI.
     * </pre>
     */
    default void createPaymentAuthorization(com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.PaymentAuthorization> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePaymentAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List invoices
     * Returns a list of invoices.
     * </pre>
     */
    default void listInvoices(com.saltoapis.nebula.installation.v1.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInvoicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply a coupon
     * Applies a coupon to the subscription.
     * </pre>
     */
    default void applyCoupon(com.saltoapis.nebula.installation.v1.ApplyCouponRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ApplyCouponResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyCouponMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unapply a coupon
     * Unapplies a coupon to the subscription.
     * </pre>
     */
    default void unapplyCoupon(com.saltoapis.nebula.installation.v1.UnapplyCouponRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.UnapplyCouponResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnapplyCouponMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InstallationService.
   * <pre>
   * An installation represents any entity such as a company, office or building
   * that contains all the access control objects (access points, access rights,
   * users, etc.) that comprise the access control system within a facility.
   * </pre>
   */
  public static abstract class InstallationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InstallationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InstallationService.
   * <pre>
   * An installation represents any entity such as a company, office or building
   * that contains all the access control objects (access points, access rights,
   * users, etc.) that comprise the access control system within a facility.
   * </pre>
   */
  public static final class InstallationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InstallationServiceStub> {
    private InstallationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstallationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstallationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an installation
     * Creates a new installation.
     * </pre>
     */
    public void createInstallation(com.saltoapis.nebula.installation.v1.CreateInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInstallationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an installation
     * Retrieves an existing installation.
     * </pre>
     */
    public void getInstallation(com.saltoapis.nebula.installation.v1.GetInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInstallationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List installations
     * Returns a list of installations that have been previously created.
     * </pre>
     */
    public void listInstallations(com.saltoapis.nebula.installation.v1.ListInstallationsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListInstallationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInstallationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an installation
     * Updates an existing installation.
     * </pre>
     */
    public void updateInstallation(com.saltoapis.nebula.installation.v1.UpdateInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInstallationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an installation
     * Soft deletes an installation. This action can be reversed if required.
     * </pre>
     */
    public void deleteInstallation(com.saltoapis.nebula.installation.v1.DeleteInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInstallationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undelete an installation
     * Undeletes an installation.
     * </pre>
     */
    public void undeleteInstallation(com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndeleteInstallationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a policy for the installation. An IAM policy is a collection of
     * roles associated to users that define who has what type of access to manage
     * access control objects within the installation.
     * </pre>
     */
    public void createPolicy(com.saltoapis.nebula.installation.v1.CreatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a policy
     * Retrieves an existing policy.
     * </pre>
     */
    public void getPolicy(com.saltoapis.nebula.installation.v1.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public void listPolicies(com.saltoapis.nebula.installation.v1.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a policy
     * Updates an existing policy.
     * </pre>
     */
    public void updatePolicy(com.saltoapis.nebula.installation.v1.UpdatePolicyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    public void deletePolicy(com.saltoapis.nebula.installation.v1.DeletePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tests permissions
     * Returns permissions that a caller has within the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public void testPermissions(com.saltoapis.nebula.installation.v1.TestPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.TestPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfer installation ownership
     * Transfers the ownership of an installation.
     * </pre>
     */
    public void transferInstallationOwnership(com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferInstallationOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Accept installation ownership
     * Accepts the ownership of an installation.
     * </pre>
     */
    public void acceptInstallationOwnership(com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptInstallationOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a subscription
     * Gets an existing subscription
     * </pre>
     */
    public void getSubscription(com.saltoapis.nebula.installation.v1.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Subscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a subscription's billing information
     * Updates an existing subscription's billing information.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    public void updateBillingInfo(com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.BillingInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update subscription payment method
     * Updates an existing subscription payment method. If there is a payment
     * method associated with the subscription, it will be deleted.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    public void updatePaymentMethod(com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.PaymentMethod> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePaymentMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update subscription payment method's card
     * Updates subscription payment method's card. If there is a payment method
     * associated with the subscription, it will be deleted.
     * </pre>
     */
    public void updateCard(com.saltoapis.nebula.installation.v1.UpdateCardRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.UpdateCardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a payment authorization
     * Creates a payment authorization for the subscription.
     * The payment authorization is a process that allows the customer to
     * authorize a payment card for future use. This is done by creating a payment
     * authorization request. The result of the request is a payment authorization
     * that must be authorized by the client in the client's UI.
     * </pre>
     */
    public void createPaymentAuthorization(com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.PaymentAuthorization> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePaymentAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List invoices
     * Returns a list of invoices.
     * </pre>
     */
    public void listInvoices(com.saltoapis.nebula.installation.v1.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply a coupon
     * Applies a coupon to the subscription.
     * </pre>
     */
    public void applyCoupon(com.saltoapis.nebula.installation.v1.ApplyCouponRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ApplyCouponResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyCouponMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unapply a coupon
     * Unapplies a coupon to the subscription.
     * </pre>
     */
    public void unapplyCoupon(com.saltoapis.nebula.installation.v1.UnapplyCouponRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.UnapplyCouponResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnapplyCouponMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InstallationService.
   * <pre>
   * An installation represents any entity such as a company, office or building
   * that contains all the access control objects (access points, access rights,
   * users, etc.) that comprise the access control system within a facility.
   * </pre>
   */
  public static final class InstallationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InstallationServiceBlockingStub> {
    private InstallationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstallationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstallationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an installation
     * Creates a new installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Installation createInstallation(com.saltoapis.nebula.installation.v1.CreateInstallationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInstallationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an installation
     * Retrieves an existing installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Installation getInstallation(com.saltoapis.nebula.installation.v1.GetInstallationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInstallationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List installations
     * Returns a list of installations that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.ListInstallationsResponse listInstallations(com.saltoapis.nebula.installation.v1.ListInstallationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInstallationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an installation
     * Updates an existing installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Installation updateInstallation(com.saltoapis.nebula.installation.v1.UpdateInstallationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInstallationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an installation
     * Soft deletes an installation. This action can be reversed if required.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Installation deleteInstallation(com.saltoapis.nebula.installation.v1.DeleteInstallationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInstallationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Undelete an installation
     * Undeletes an installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Installation undeleteInstallation(com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndeleteInstallationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a policy for the installation. An IAM policy is a collection of
     * roles associated to users that define who has what type of access to manage
     * access control objects within the installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Policy createPolicy(com.saltoapis.nebula.installation.v1.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a policy
     * Retrieves an existing policy.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Policy getPolicy(com.saltoapis.nebula.installation.v1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.ListPoliciesResponse listPolicies(com.saltoapis.nebula.installation.v1.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a policy
     * Updates an existing policy.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Policy updatePolicy(com.saltoapis.nebula.installation.v1.UpdatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a policy
     * Permanently deletes a policy. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deletePolicy(com.saltoapis.nebula.installation.v1.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests permissions
     * Returns permissions that a caller has within the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.TestPermissionsResponse testPermissions(com.saltoapis.nebula.installation.v1.TestPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfer installation ownership
     * Transfers the ownership of an installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse transferInstallationOwnership(com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferInstallationOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Accept installation ownership
     * Accepts the ownership of an installation.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse acceptInstallationOwnership(com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptInstallationOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a subscription
     * Gets an existing subscription
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.Subscription getSubscription(com.saltoapis.nebula.installation.v1.GetSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a subscription's billing information
     * Updates an existing subscription's billing information.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.BillingInfo updateBillingInfo(com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update subscription payment method
     * Updates an existing subscription payment method. If there is a payment
     * method associated with the subscription, it will be deleted.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.PaymentMethod updatePaymentMethod(com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePaymentMethodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update subscription payment method's card
     * Updates subscription payment method's card. If there is a payment method
     * associated with the subscription, it will be deleted.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.UpdateCardResponse updateCard(com.saltoapis.nebula.installation.v1.UpdateCardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a payment authorization
     * Creates a payment authorization for the subscription.
     * The payment authorization is a process that allows the customer to
     * authorize a payment card for future use. This is done by creating a payment
     * authorization request. The result of the request is a payment authorization
     * that must be authorized by the client in the client's UI.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.PaymentAuthorization createPaymentAuthorization(com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePaymentAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List invoices
     * Returns a list of invoices.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.ListInvoicesResponse listInvoices(com.saltoapis.nebula.installation.v1.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInvoicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply a coupon
     * Applies a coupon to the subscription.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.ApplyCouponResponse applyCoupon(com.saltoapis.nebula.installation.v1.ApplyCouponRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyCouponMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unapply a coupon
     * Unapplies a coupon to the subscription.
     * </pre>
     */
    public com.saltoapis.nebula.installation.v1.UnapplyCouponResponse unapplyCoupon(com.saltoapis.nebula.installation.v1.UnapplyCouponRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnapplyCouponMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InstallationService.
   * <pre>
   * An installation represents any entity such as a company, office or building
   * that contains all the access control objects (access points, access rights,
   * users, etc.) that comprise the access control system within a facility.
   * </pre>
   */
  public static final class InstallationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InstallationServiceFutureStub> {
    private InstallationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstallationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstallationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an installation
     * Creates a new installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Installation> createInstallation(
        com.saltoapis.nebula.installation.v1.CreateInstallationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInstallationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an installation
     * Retrieves an existing installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Installation> getInstallation(
        com.saltoapis.nebula.installation.v1.GetInstallationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInstallationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List installations
     * Returns a list of installations that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.ListInstallationsResponse> listInstallations(
        com.saltoapis.nebula.installation.v1.ListInstallationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInstallationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an installation
     * Updates an existing installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Installation> updateInstallation(
        com.saltoapis.nebula.installation.v1.UpdateInstallationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInstallationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an installation
     * Soft deletes an installation. This action can be reversed if required.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Installation> deleteInstallation(
        com.saltoapis.nebula.installation.v1.DeleteInstallationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInstallationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Undelete an installation
     * Undeletes an installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Installation> undeleteInstallation(
        com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndeleteInstallationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a policy
     * Creates a policy for the installation. An IAM policy is a collection of
     * roles associated to users that define who has what type of access to manage
     * access control objects within the installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Policy> createPolicy(
        com.saltoapis.nebula.installation.v1.CreatePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a policy
     * Retrieves an existing policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Policy> getPolicy(
        com.saltoapis.nebula.installation.v1.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List policies
     * Returns a list of policies that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.ListPoliciesResponse> listPolicies(
        com.saltoapis.nebula.installation.v1.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a policy
     * Updates an existing policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Policy> updatePolicy(
        com.saltoapis.nebula.installation.v1.UpdatePolicyRequest request) {
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
        com.saltoapis.nebula.installation.v1.DeletePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tests permissions
     * Returns permissions that a caller has within the installation. If the
     * installation does not exist, this will return an empty set of
     * permissions, not a NOT_FOUND error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.TestPermissionsResponse> testPermissions(
        com.saltoapis.nebula.installation.v1.TestPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfer installation ownership
     * Transfers the ownership of an installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse> transferInstallationOwnership(
        com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferInstallationOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Accept installation ownership
     * Accepts the ownership of an installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse> acceptInstallationOwnership(
        com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptInstallationOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a subscription
     * Gets an existing subscription
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.Subscription> getSubscription(
        com.saltoapis.nebula.installation.v1.GetSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a subscription's billing information
     * Updates an existing subscription's billing information.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.BillingInfo> updateBillingInfo(
        com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update subscription payment method
     * Updates an existing subscription payment method. If there is a payment
     * method associated with the subscription, it will be deleted.
     * (-- api-linter: core::0134::method-signature=disabled
     *     aip.dev/not-precedent: We need to do this to simplify the update operation. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.PaymentMethod> updatePaymentMethod(
        com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePaymentMethodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update subscription payment method's card
     * Updates subscription payment method's card. If there is a payment method
     * associated with the subscription, it will be deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.UpdateCardResponse> updateCard(
        com.saltoapis.nebula.installation.v1.UpdateCardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a payment authorization
     * Creates a payment authorization for the subscription.
     * The payment authorization is a process that allows the customer to
     * authorize a payment card for future use. This is done by creating a payment
     * authorization request. The result of the request is a payment authorization
     * that must be authorized by the client in the client's UI.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.PaymentAuthorization> createPaymentAuthorization(
        com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePaymentAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List invoices
     * Returns a list of invoices.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.ListInvoicesResponse> listInvoices(
        com.saltoapis.nebula.installation.v1.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply a coupon
     * Applies a coupon to the subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.ApplyCouponResponse> applyCoupon(
        com.saltoapis.nebula.installation.v1.ApplyCouponRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyCouponMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unapply a coupon
     * Unapplies a coupon to the subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.installation.v1.UnapplyCouponResponse> unapplyCoupon(
        com.saltoapis.nebula.installation.v1.UnapplyCouponRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnapplyCouponMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INSTALLATION = 0;
  private static final int METHODID_GET_INSTALLATION = 1;
  private static final int METHODID_LIST_INSTALLATIONS = 2;
  private static final int METHODID_UPDATE_INSTALLATION = 3;
  private static final int METHODID_DELETE_INSTALLATION = 4;
  private static final int METHODID_UNDELETE_INSTALLATION = 5;
  private static final int METHODID_CREATE_POLICY = 6;
  private static final int METHODID_GET_POLICY = 7;
  private static final int METHODID_LIST_POLICIES = 8;
  private static final int METHODID_UPDATE_POLICY = 9;
  private static final int METHODID_DELETE_POLICY = 10;
  private static final int METHODID_TEST_PERMISSIONS = 11;
  private static final int METHODID_TRANSFER_INSTALLATION_OWNERSHIP = 12;
  private static final int METHODID_ACCEPT_INSTALLATION_OWNERSHIP = 13;
  private static final int METHODID_GET_SUBSCRIPTION = 14;
  private static final int METHODID_UPDATE_BILLING_INFO = 15;
  private static final int METHODID_UPDATE_PAYMENT_METHOD = 16;
  private static final int METHODID_UPDATE_CARD = 17;
  private static final int METHODID_CREATE_PAYMENT_AUTHORIZATION = 18;
  private static final int METHODID_LIST_INVOICES = 19;
  private static final int METHODID_APPLY_COUPON = 20;
  private static final int METHODID_UNAPPLY_COUPON = 21;

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
        case METHODID_CREATE_INSTALLATION:
          serviceImpl.createInstallation((com.saltoapis.nebula.installation.v1.CreateInstallationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation>) responseObserver);
          break;
        case METHODID_GET_INSTALLATION:
          serviceImpl.getInstallation((com.saltoapis.nebula.installation.v1.GetInstallationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation>) responseObserver);
          break;
        case METHODID_LIST_INSTALLATIONS:
          serviceImpl.listInstallations((com.saltoapis.nebula.installation.v1.ListInstallationsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListInstallationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INSTALLATION:
          serviceImpl.updateInstallation((com.saltoapis.nebula.installation.v1.UpdateInstallationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation>) responseObserver);
          break;
        case METHODID_DELETE_INSTALLATION:
          serviceImpl.deleteInstallation((com.saltoapis.nebula.installation.v1.DeleteInstallationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation>) responseObserver);
          break;
        case METHODID_UNDELETE_INSTALLATION:
          serviceImpl.undeleteInstallation((com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Installation>) responseObserver);
          break;
        case METHODID_CREATE_POLICY:
          serviceImpl.createPolicy((com.saltoapis.nebula.installation.v1.CreatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((com.saltoapis.nebula.installation.v1.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy>) responseObserver);
          break;
        case METHODID_LIST_POLICIES:
          serviceImpl.listPolicies((com.saltoapis.nebula.installation.v1.ListPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListPoliciesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POLICY:
          serviceImpl.updatePolicy((com.saltoapis.nebula.installation.v1.UpdatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Policy>) responseObserver);
          break;
        case METHODID_DELETE_POLICY:
          serviceImpl.deletePolicy((com.saltoapis.nebula.installation.v1.DeletePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TEST_PERMISSIONS:
          serviceImpl.testPermissions((com.saltoapis.nebula.installation.v1.TestPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.TestPermissionsResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_INSTALLATION_OWNERSHIP:
          serviceImpl.transferInstallationOwnership((com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_INSTALLATION_OWNERSHIP:
          serviceImpl.acceptInstallationOwnership((com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIPTION:
          serviceImpl.getSubscription((com.saltoapis.nebula.installation.v1.GetSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.Subscription>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_INFO:
          serviceImpl.updateBillingInfo((com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.BillingInfo>) responseObserver);
          break;
        case METHODID_UPDATE_PAYMENT_METHOD:
          serviceImpl.updatePaymentMethod((com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.PaymentMethod>) responseObserver);
          break;
        case METHODID_UPDATE_CARD:
          serviceImpl.updateCard((com.saltoapis.nebula.installation.v1.UpdateCardRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.UpdateCardResponse>) responseObserver);
          break;
        case METHODID_CREATE_PAYMENT_AUTHORIZATION:
          serviceImpl.createPaymentAuthorization((com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.PaymentAuthorization>) responseObserver);
          break;
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((com.saltoapis.nebula.installation.v1.ListInvoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ListInvoicesResponse>) responseObserver);
          break;
        case METHODID_APPLY_COUPON:
          serviceImpl.applyCoupon((com.saltoapis.nebula.installation.v1.ApplyCouponRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.ApplyCouponResponse>) responseObserver);
          break;
        case METHODID_UNAPPLY_COUPON:
          serviceImpl.unapplyCoupon((com.saltoapis.nebula.installation.v1.UnapplyCouponRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.installation.v1.UnapplyCouponResponse>) responseObserver);
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
          getCreateInstallationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.CreateInstallationRequest,
              com.saltoapis.nebula.installation.v1.Installation>(
                service, METHODID_CREATE_INSTALLATION)))
        .addMethod(
          getGetInstallationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.GetInstallationRequest,
              com.saltoapis.nebula.installation.v1.Installation>(
                service, METHODID_GET_INSTALLATION)))
        .addMethod(
          getListInstallationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.ListInstallationsRequest,
              com.saltoapis.nebula.installation.v1.ListInstallationsResponse>(
                service, METHODID_LIST_INSTALLATIONS)))
        .addMethod(
          getUpdateInstallationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UpdateInstallationRequest,
              com.saltoapis.nebula.installation.v1.Installation>(
                service, METHODID_UPDATE_INSTALLATION)))
        .addMethod(
          getDeleteInstallationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.DeleteInstallationRequest,
              com.saltoapis.nebula.installation.v1.Installation>(
                service, METHODID_DELETE_INSTALLATION)))
        .addMethod(
          getUndeleteInstallationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UndeleteInstallationRequest,
              com.saltoapis.nebula.installation.v1.Installation>(
                service, METHODID_UNDELETE_INSTALLATION)))
        .addMethod(
          getCreatePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.CreatePolicyRequest,
              com.saltoapis.nebula.installation.v1.Policy>(
                service, METHODID_CREATE_POLICY)))
        .addMethod(
          getGetPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.GetPolicyRequest,
              com.saltoapis.nebula.installation.v1.Policy>(
                service, METHODID_GET_POLICY)))
        .addMethod(
          getListPoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.ListPoliciesRequest,
              com.saltoapis.nebula.installation.v1.ListPoliciesResponse>(
                service, METHODID_LIST_POLICIES)))
        .addMethod(
          getUpdatePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UpdatePolicyRequest,
              com.saltoapis.nebula.installation.v1.Policy>(
                service, METHODID_UPDATE_POLICY)))
        .addMethod(
          getDeletePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.DeletePolicyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_POLICY)))
        .addMethod(
          getTestPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.TestPermissionsRequest,
              com.saltoapis.nebula.installation.v1.TestPermissionsResponse>(
                service, METHODID_TEST_PERMISSIONS)))
        .addMethod(
          getTransferInstallationOwnershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipRequest,
              com.saltoapis.nebula.installation.v1.TransferInstallationOwnershipResponse>(
                service, METHODID_TRANSFER_INSTALLATION_OWNERSHIP)))
        .addMethod(
          getAcceptInstallationOwnershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipRequest,
              com.saltoapis.nebula.installation.v1.AcceptInstallationOwnershipResponse>(
                service, METHODID_ACCEPT_INSTALLATION_OWNERSHIP)))
        .addMethod(
          getGetSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.GetSubscriptionRequest,
              com.saltoapis.nebula.installation.v1.Subscription>(
                service, METHODID_GET_SUBSCRIPTION)))
        .addMethod(
          getUpdateBillingInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UpdateBillingInfoRequest,
              com.saltoapis.nebula.installation.v1.BillingInfo>(
                service, METHODID_UPDATE_BILLING_INFO)))
        .addMethod(
          getUpdatePaymentMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UpdatePaymentMethodRequest,
              com.saltoapis.nebula.installation.v1.PaymentMethod>(
                service, METHODID_UPDATE_PAYMENT_METHOD)))
        .addMethod(
          getUpdateCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UpdateCardRequest,
              com.saltoapis.nebula.installation.v1.UpdateCardResponse>(
                service, METHODID_UPDATE_CARD)))
        .addMethod(
          getCreatePaymentAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.CreatePaymentAuthorizationRequest,
              com.saltoapis.nebula.installation.v1.PaymentAuthorization>(
                service, METHODID_CREATE_PAYMENT_AUTHORIZATION)))
        .addMethod(
          getListInvoicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.ListInvoicesRequest,
              com.saltoapis.nebula.installation.v1.ListInvoicesResponse>(
                service, METHODID_LIST_INVOICES)))
        .addMethod(
          getApplyCouponMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.ApplyCouponRequest,
              com.saltoapis.nebula.installation.v1.ApplyCouponResponse>(
                service, METHODID_APPLY_COUPON)))
        .addMethod(
          getUnapplyCouponMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.installation.v1.UnapplyCouponRequest,
              com.saltoapis.nebula.installation.v1.UnapplyCouponResponse>(
                service, METHODID_UNAPPLY_COUPON)))
        .build();
  }

  private static abstract class InstallationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstallationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstallationService");
    }
  }

  private static final class InstallationServiceFileDescriptorSupplier
      extends InstallationServiceBaseDescriptorSupplier {
    InstallationServiceFileDescriptorSupplier() {}
  }

  private static final class InstallationServiceMethodDescriptorSupplier
      extends InstallationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InstallationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InstallationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstallationServiceFileDescriptorSupplier())
              .addMethod(getCreateInstallationMethod())
              .addMethod(getGetInstallationMethod())
              .addMethod(getListInstallationsMethod())
              .addMethod(getUpdateInstallationMethod())
              .addMethod(getDeleteInstallationMethod())
              .addMethod(getUndeleteInstallationMethod())
              .addMethod(getCreatePolicyMethod())
              .addMethod(getGetPolicyMethod())
              .addMethod(getListPoliciesMethod())
              .addMethod(getUpdatePolicyMethod())
              .addMethod(getDeletePolicyMethod())
              .addMethod(getTestPermissionsMethod())
              .addMethod(getTransferInstallationOwnershipMethod())
              .addMethod(getAcceptInstallationOwnershipMethod())
              .addMethod(getGetSubscriptionMethod())
              .addMethod(getUpdateBillingInfoMethod())
              .addMethod(getUpdatePaymentMethodMethod())
              .addMethod(getUpdateCardMethod())
              .addMethod(getCreatePaymentAuthorizationMethod())
              .addMethod(getListInvoicesMethod())
              .addMethod(getApplyCouponMethod())
              .addMethod(getUnapplyCouponMethod())
              .build();
        }
      }
    }
    return result;
  }
}
