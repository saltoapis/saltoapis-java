package com.saltoapis.nebula.user.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A user can refer to both a holder of keys and a user with permissions to
 * manage other users. Users are eligible to access rights and may be assigned a
 * key. This service is responsible for managing user resources as well as
 * their associations with access rights.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/user/v1/user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.user.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CreateUserRequest,
      com.saltoapis.nebula.user.v1.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.saltoapis.nebula.user.v1.CreateUserRequest.class,
      responseType = com.saltoapis.nebula.user.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CreateUserRequest,
      com.saltoapis.nebula.user.v1.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CreateUserRequest, com.saltoapis.nebula.user.v1.User> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.CreateUserRequest, com.saltoapis.nebula.user.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.GetUserRequest,
      com.saltoapis.nebula.user.v1.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.saltoapis.nebula.user.v1.GetUserRequest.class,
      responseType = com.saltoapis.nebula.user.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.GetUserRequest,
      com.saltoapis.nebula.user.v1.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.GetUserRequest, com.saltoapis.nebula.user.v1.User> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.GetUserRequest, com.saltoapis.nebula.user.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ListUsersRequest,
      com.saltoapis.nebula.user.v1.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.saltoapis.nebula.user.v1.ListUsersRequest.class,
      responseType = com.saltoapis.nebula.user.v1.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ListUsersRequest,
      com.saltoapis.nebula.user.v1.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ListUsersRequest, com.saltoapis.nebula.user.v1.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
          UserServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.ListUsersRequest, com.saltoapis.nebula.user.v1.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UpdateUserRequest,
      com.saltoapis.nebula.user.v1.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.saltoapis.nebula.user.v1.UpdateUserRequest.class,
      responseType = com.saltoapis.nebula.user.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UpdateUserRequest,
      com.saltoapis.nebula.user.v1.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UpdateUserRequest, com.saltoapis.nebula.user.v1.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.UpdateUserRequest, com.saltoapis.nebula.user.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.DeleteUserRequest,
      com.google.protobuf.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.saltoapis.nebula.user.v1.DeleteUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.DeleteUserRequest,
      com.google.protobuf.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.DeleteUserRequest, com.google.protobuf.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.DeleteUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.BlockUserRequest,
      com.saltoapis.nebula.user.v1.BlockUserResponse> getBlockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockUser",
      requestType = com.saltoapis.nebula.user.v1.BlockUserRequest.class,
      responseType = com.saltoapis.nebula.user.v1.BlockUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.BlockUserRequest,
      com.saltoapis.nebula.user.v1.BlockUserResponse> getBlockUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.BlockUserRequest, com.saltoapis.nebula.user.v1.BlockUserResponse> getBlockUserMethod;
    if ((getBlockUserMethod = UserServiceGrpc.getBlockUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getBlockUserMethod = UserServiceGrpc.getBlockUserMethod) == null) {
          UserServiceGrpc.getBlockUserMethod = getBlockUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.BlockUserRequest, com.saltoapis.nebula.user.v1.BlockUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.BlockUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.BlockUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("BlockUser"))
              .build();
        }
      }
    }
    return getBlockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UnblockUserRequest,
      com.saltoapis.nebula.user.v1.UnblockUserResponse> getUnblockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnblockUser",
      requestType = com.saltoapis.nebula.user.v1.UnblockUserRequest.class,
      responseType = com.saltoapis.nebula.user.v1.UnblockUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UnblockUserRequest,
      com.saltoapis.nebula.user.v1.UnblockUserResponse> getUnblockUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UnblockUserRequest, com.saltoapis.nebula.user.v1.UnblockUserResponse> getUnblockUserMethod;
    if ((getUnblockUserMethod = UserServiceGrpc.getUnblockUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUnblockUserMethod = UserServiceGrpc.getUnblockUserMethod) == null) {
          UserServiceGrpc.getUnblockUserMethod = getUnblockUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.UnblockUserRequest, com.saltoapis.nebula.user.v1.UnblockUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnblockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UnblockUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UnblockUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UnblockUser"))
              .build();
        }
      }
    }
    return getUnblockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest,
      com.saltoapis.nebula.user.v1.UserAccessRight> getCreateUserAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserAccessRight",
      requestType = com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest.class,
      responseType = com.saltoapis.nebula.user.v1.UserAccessRight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest,
      com.saltoapis.nebula.user.v1.UserAccessRight> getCreateUserAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest, com.saltoapis.nebula.user.v1.UserAccessRight> getCreateUserAccessRightMethod;
    if ((getCreateUserAccessRightMethod = UserServiceGrpc.getCreateUserAccessRightMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserAccessRightMethod = UserServiceGrpc.getCreateUserAccessRightMethod) == null) {
          UserServiceGrpc.getCreateUserAccessRightMethod = getCreateUserAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest, com.saltoapis.nebula.user.v1.UserAccessRight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UserAccessRight.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUserAccessRight"))
              .build();
        }
      }
    }
    return getCreateUserAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.GetUserAccessRightRequest,
      com.saltoapis.nebula.user.v1.UserAccessRight> getGetUserAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserAccessRight",
      requestType = com.saltoapis.nebula.user.v1.GetUserAccessRightRequest.class,
      responseType = com.saltoapis.nebula.user.v1.UserAccessRight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.GetUserAccessRightRequest,
      com.saltoapis.nebula.user.v1.UserAccessRight> getGetUserAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.GetUserAccessRightRequest, com.saltoapis.nebula.user.v1.UserAccessRight> getGetUserAccessRightMethod;
    if ((getGetUserAccessRightMethod = UserServiceGrpc.getGetUserAccessRightMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserAccessRightMethod = UserServiceGrpc.getGetUserAccessRightMethod) == null) {
          UserServiceGrpc.getGetUserAccessRightMethod = getGetUserAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.GetUserAccessRightRequest, com.saltoapis.nebula.user.v1.UserAccessRight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.GetUserAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UserAccessRight.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserAccessRight"))
              .build();
        }
      }
    }
    return getGetUserAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest,
      com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse> getListUserAccessRightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserAccessRights",
      requestType = com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest.class,
      responseType = com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest,
      com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse> getListUserAccessRightsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest, com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse> getListUserAccessRightsMethod;
    if ((getListUserAccessRightsMethod = UserServiceGrpc.getListUserAccessRightsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserAccessRightsMethod = UserServiceGrpc.getListUserAccessRightsMethod) == null) {
          UserServiceGrpc.getListUserAccessRightsMethod = getListUserAccessRightsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest, com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserAccessRights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUserAccessRights"))
              .build();
        }
      }
    }
    return getListUserAccessRightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest,
      com.saltoapis.nebula.user.v1.UserAccessRight> getUpdateUserAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserAccessRight",
      requestType = com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest.class,
      responseType = com.saltoapis.nebula.user.v1.UserAccessRight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest,
      com.saltoapis.nebula.user.v1.UserAccessRight> getUpdateUserAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest, com.saltoapis.nebula.user.v1.UserAccessRight> getUpdateUserAccessRightMethod;
    if ((getUpdateUserAccessRightMethod = UserServiceGrpc.getUpdateUserAccessRightMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserAccessRightMethod = UserServiceGrpc.getUpdateUserAccessRightMethod) == null) {
          UserServiceGrpc.getUpdateUserAccessRightMethod = getUpdateUserAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest, com.saltoapis.nebula.user.v1.UserAccessRight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.UserAccessRight.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserAccessRight"))
              .build();
        }
      }
    }
    return getUpdateUserAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest,
      com.google.protobuf.Empty> getDeleteUserAccessRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserAccessRight",
      requestType = com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest,
      com.google.protobuf.Empty> getDeleteUserAccessRightMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest, com.google.protobuf.Empty> getDeleteUserAccessRightMethod;
    if ((getDeleteUserAccessRightMethod = UserServiceGrpc.getDeleteUserAccessRightMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserAccessRightMethod = UserServiceGrpc.getDeleteUserAccessRightMethod) == null) {
          UserServiceGrpc.getDeleteUserAccessRightMethod = getDeleteUserAccessRightMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserAccessRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUserAccessRight"))
              .build();
        }
      }
    }
    return getDeleteUserAccessRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignCardKeyRequest,
      com.saltoapis.nebula.user.v1.CardKey> getAssignCardKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignCardKey",
      requestType = com.saltoapis.nebula.user.v1.AssignCardKeyRequest.class,
      responseType = com.saltoapis.nebula.user.v1.CardKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignCardKeyRequest,
      com.saltoapis.nebula.user.v1.CardKey> getAssignCardKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignCardKeyRequest, com.saltoapis.nebula.user.v1.CardKey> getAssignCardKeyMethod;
    if ((getAssignCardKeyMethod = UserServiceGrpc.getAssignCardKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignCardKeyMethod = UserServiceGrpc.getAssignCardKeyMethod) == null) {
          UserServiceGrpc.getAssignCardKeyMethod = getAssignCardKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.AssignCardKeyRequest, com.saltoapis.nebula.user.v1.CardKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignCardKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AssignCardKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AssignCardKey"))
              .build();
        }
      }
    }
    return getAssignCardKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelCardKeyRequest,
      com.saltoapis.nebula.user.v1.CardKey> getCancelCardKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelCardKey",
      requestType = com.saltoapis.nebula.user.v1.CancelCardKeyRequest.class,
      responseType = com.saltoapis.nebula.user.v1.CardKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelCardKeyRequest,
      com.saltoapis.nebula.user.v1.CardKey> getCancelCardKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelCardKeyRequest, com.saltoapis.nebula.user.v1.CardKey> getCancelCardKeyMethod;
    if ((getCancelCardKeyMethod = UserServiceGrpc.getCancelCardKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCancelCardKeyMethod = UserServiceGrpc.getCancelCardKeyMethod) == null) {
          UserServiceGrpc.getCancelCardKeyMethod = getCancelCardKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.CancelCardKeyRequest, com.saltoapis.nebula.user.v1.CardKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelCardKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CancelCardKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CardKey.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CancelCardKey"))
              .build();
        }
      }
    }
    return getCancelCardKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.EncodeCardKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getEncodeCardKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EncodeCardKey",
      requestType = com.saltoapis.nebula.user.v1.EncodeCardKeyRequest.class,
      responseType = com.saltoapis.longrunning.v1.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.EncodeCardKeyRequest,
      com.saltoapis.longrunning.v1.Operation> getEncodeCardKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.EncodeCardKeyRequest, com.saltoapis.longrunning.v1.Operation> getEncodeCardKeyMethod;
    if ((getEncodeCardKeyMethod = UserServiceGrpc.getEncodeCardKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getEncodeCardKeyMethod = UserServiceGrpc.getEncodeCardKeyMethod) == null) {
          UserServiceGrpc.getEncodeCardKeyMethod = getEncodeCardKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.EncodeCardKeyRequest, com.saltoapis.longrunning.v1.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EncodeCardKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.EncodeCardKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.longrunning.v1.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("EncodeCardKey"))
              .build();
        }
      }
    }
    return getEncodeCardKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignAppKeyRequest,
      com.saltoapis.nebula.user.v1.AppKey> getAssignAppKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignAppKey",
      requestType = com.saltoapis.nebula.user.v1.AssignAppKeyRequest.class,
      responseType = com.saltoapis.nebula.user.v1.AppKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignAppKeyRequest,
      com.saltoapis.nebula.user.v1.AppKey> getAssignAppKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignAppKeyRequest, com.saltoapis.nebula.user.v1.AppKey> getAssignAppKeyMethod;
    if ((getAssignAppKeyMethod = UserServiceGrpc.getAssignAppKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignAppKeyMethod = UserServiceGrpc.getAssignAppKeyMethod) == null) {
          UserServiceGrpc.getAssignAppKeyMethod = getAssignAppKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.AssignAppKeyRequest, com.saltoapis.nebula.user.v1.AppKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignAppKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AssignAppKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AssignAppKey"))
              .build();
        }
      }
    }
    return getAssignAppKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelAppKeyRequest,
      com.saltoapis.nebula.user.v1.AppKey> getCancelAppKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAppKey",
      requestType = com.saltoapis.nebula.user.v1.CancelAppKeyRequest.class,
      responseType = com.saltoapis.nebula.user.v1.AppKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelAppKeyRequest,
      com.saltoapis.nebula.user.v1.AppKey> getCancelAppKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelAppKeyRequest, com.saltoapis.nebula.user.v1.AppKey> getCancelAppKeyMethod;
    if ((getCancelAppKeyMethod = UserServiceGrpc.getCancelAppKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCancelAppKeyMethod = UserServiceGrpc.getCancelAppKeyMethod) == null) {
          UserServiceGrpc.getCancelAppKeyMethod = getCancelAppKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.CancelAppKeyRequest, com.saltoapis.nebula.user.v1.AppKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAppKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CancelAppKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AppKey.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CancelAppKey"))
              .build();
        }
      }
    }
    return getCancelAppKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest,
      com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse> getComputeAppKeyDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ComputeAppKeyData",
      requestType = com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest.class,
      responseType = com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest,
      com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse> getComputeAppKeyDataMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest, com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse> getComputeAppKeyDataMethod;
    if ((getComputeAppKeyDataMethod = UserServiceGrpc.getComputeAppKeyDataMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getComputeAppKeyDataMethod = UserServiceGrpc.getComputeAppKeyDataMethod) == null) {
          UserServiceGrpc.getComputeAppKeyDataMethod = getComputeAppKeyDataMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest, com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ComputeAppKeyData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ComputeAppKeyData"))
              .build();
        }
      }
    }
    return getComputeAppKeyDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignWalletKeyRequest,
      com.saltoapis.nebula.user.v1.AssignWalletKeyResponse> getAssignWalletKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignWalletKey",
      requestType = com.saltoapis.nebula.user.v1.AssignWalletKeyRequest.class,
      responseType = com.saltoapis.nebula.user.v1.AssignWalletKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignWalletKeyRequest,
      com.saltoapis.nebula.user.v1.AssignWalletKeyResponse> getAssignWalletKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignWalletKeyRequest, com.saltoapis.nebula.user.v1.AssignWalletKeyResponse> getAssignWalletKeyMethod;
    if ((getAssignWalletKeyMethod = UserServiceGrpc.getAssignWalletKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignWalletKeyMethod = UserServiceGrpc.getAssignWalletKeyMethod) == null) {
          UserServiceGrpc.getAssignWalletKeyMethod = getAssignWalletKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.AssignWalletKeyRequest, com.saltoapis.nebula.user.v1.AssignWalletKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignWalletKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AssignWalletKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AssignWalletKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AssignWalletKey"))
              .build();
        }
      }
    }
    return getAssignWalletKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelWalletKeyRequest,
      com.saltoapis.nebula.user.v1.CancelWalletKeyResponse> getCancelWalletKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelWalletKey",
      requestType = com.saltoapis.nebula.user.v1.CancelWalletKeyRequest.class,
      responseType = com.saltoapis.nebula.user.v1.CancelWalletKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelWalletKeyRequest,
      com.saltoapis.nebula.user.v1.CancelWalletKeyResponse> getCancelWalletKeyMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelWalletKeyRequest, com.saltoapis.nebula.user.v1.CancelWalletKeyResponse> getCancelWalletKeyMethod;
    if ((getCancelWalletKeyMethod = UserServiceGrpc.getCancelWalletKeyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCancelWalletKeyMethod = UserServiceGrpc.getCancelWalletKeyMethod) == null) {
          UserServiceGrpc.getCancelWalletKeyMethod = getCancelWalletKeyMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.CancelWalletKeyRequest, com.saltoapis.nebula.user.v1.CancelWalletKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelWalletKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CancelWalletKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CancelWalletKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CancelWalletKey"))
              .build();
        }
      }
    }
    return getCancelWalletKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignPasscodeRequest,
      com.saltoapis.nebula.user.v1.AssignPasscodeResponse> getAssignPasscodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignPasscode",
      requestType = com.saltoapis.nebula.user.v1.AssignPasscodeRequest.class,
      responseType = com.saltoapis.nebula.user.v1.AssignPasscodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignPasscodeRequest,
      com.saltoapis.nebula.user.v1.AssignPasscodeResponse> getAssignPasscodeMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.AssignPasscodeRequest, com.saltoapis.nebula.user.v1.AssignPasscodeResponse> getAssignPasscodeMethod;
    if ((getAssignPasscodeMethod = UserServiceGrpc.getAssignPasscodeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignPasscodeMethod = UserServiceGrpc.getAssignPasscodeMethod) == null) {
          UserServiceGrpc.getAssignPasscodeMethod = getAssignPasscodeMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.AssignPasscodeRequest, com.saltoapis.nebula.user.v1.AssignPasscodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignPasscode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AssignPasscodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.AssignPasscodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AssignPasscode"))
              .build();
        }
      }
    }
    return getAssignPasscodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelPasscodeRequest,
      com.saltoapis.nebula.user.v1.CancelPasscodeResponse> getCancelPasscodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelPasscode",
      requestType = com.saltoapis.nebula.user.v1.CancelPasscodeRequest.class,
      responseType = com.saltoapis.nebula.user.v1.CancelPasscodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelPasscodeRequest,
      com.saltoapis.nebula.user.v1.CancelPasscodeResponse> getCancelPasscodeMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.user.v1.CancelPasscodeRequest, com.saltoapis.nebula.user.v1.CancelPasscodeResponse> getCancelPasscodeMethod;
    if ((getCancelPasscodeMethod = UserServiceGrpc.getCancelPasscodeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCancelPasscodeMethod = UserServiceGrpc.getCancelPasscodeMethod) == null) {
          UserServiceGrpc.getCancelPasscodeMethod = getCancelPasscodeMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.user.v1.CancelPasscodeRequest, com.saltoapis.nebula.user.v1.CancelPasscodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelPasscode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CancelPasscodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.user.v1.CancelPasscodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CancelPasscode"))
              .build();
        }
      }
    }
    return getCancelPasscodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A user can refer to both a holder of keys and a user with permissions to
   * manage other users. Users are eligible to access rights and may be assigned a
   * key. This service is responsible for managing user resources as well as
   * their associations with access rights.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a user
     * Creates a new user.
     * </pre>
     */
    default void createUser(com.saltoapis.nebula.user.v1.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a user
     * Retrieves an existing user.
     * </pre>
     */
    default void getUser(com.saltoapis.nebula.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * List users
     * Returns a list of users that have been previously created.
     * </pre>
     */
    default void listUsers(com.saltoapis.nebula.user.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a user
     * Updates an existing user.
     * </pre>
     */
    default void updateUser(com.saltoapis.nebula.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a user
     * Permanently deletes a user. This cannot be undone.
     * </pre>
     */
    default void deleteUser(com.saltoapis.nebula.user.v1.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block a user
     * Temporarily blocks an existing user. While blocked, the user cannot
     * perform any admin actions, that is, they have no management role.
     * Neither can they unlock any access point with any type of key.
     * </pre>
     */
    default void blockUser(com.saltoapis.nebula.user.v1.BlockUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.BlockUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unblock a user
     * Unblocks an already blocked user. Once unblocked, the user can
     * perform the admin actions they could previously, that is,
     * they once again have a management role.
     * They can also once again unlock the access points they previously
     * had access to.
     * </pre>
     */
    default void unblockUser(com.saltoapis.nebula.user.v1.UnblockUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UnblockUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnblockUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a user's access right association.
     * </pre>
     */
    default void createUserAccessRight(com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an access right
     * Gets an existing user's access right association.
     * </pre>
     */
    default void getUserAccessRight(com.saltoapis.nebula.user.v1.GetUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * List access rights
     * Lists an existing user's access right associations.
     * </pre>
     */
    default void listUserAccessRights(com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserAccessRightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing user's access right associations.
     * </pre>
     */
    default void updateUserAccessRight(com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an access right
     * Deletes a user's access right association. This cannot be undone.
     * </pre>
     */
    default void deleteUserAccessRight(com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserAccessRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign a card key
     * Assigns a card key to an existing user.
     * </pre>
     */
    default void assignCardKey(com.saltoapis.nebula.user.v1.AssignCardKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CardKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignCardKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel a card key
     * Cancels an existing user's card key.
     * </pre>
     */
    default void cancelCardKey(com.saltoapis.nebula.user.v1.CancelCardKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CardKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelCardKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Encode a card key
     * Encodes an existing user's card key.
     * </pre>
     */
    default void encodeCardKey(com.saltoapis.nebula.user.v1.EncodeCardKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncodeCardKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign an app key
     * Assigns an app key to an existing user.
     * </pre>
     */
    default void assignAppKey(com.saltoapis.nebula.user.v1.AssignAppKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AppKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignAppKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an app key
     * Cancels an existing user's app key.
     * </pre>
     */
    default void cancelAppKey(com.saltoapis.nebula.user.v1.CancelAppKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AppKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAppKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compute data of an app key
     * Compute an existing user's app key data. Data contains encoded access
     * rights of the user.
     * (-- api-linter: core::0136::http-name-variable=disabled --)
     * </pre>
     */
    default void computeAppKeyData(com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComputeAppKeyDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign a wallet key
     * Assigns a wallet key to an existing user.
     * </pre>
     */
    default void assignWalletKey(com.saltoapis.nebula.user.v1.AssignWalletKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AssignWalletKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignWalletKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel a wallet key
     * Cancels an existing user's wallet key.
     * </pre>
     */
    default void cancelWalletKey(com.saltoapis.nebula.user.v1.CancelWalletKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CancelWalletKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelWalletKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign a passcode
     * Assigns a passcode to an existing user.
     * </pre>
     */
    default void assignPasscode(com.saltoapis.nebula.user.v1.AssignPasscodeRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AssignPasscodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignPasscodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel a passcode
     * Cancels an existing user's passcode.
     * </pre>
     */
    default void cancelPasscode(com.saltoapis.nebula.user.v1.CancelPasscodeRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CancelPasscodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelPasscodeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   * <pre>
   * A user can refer to both a holder of keys and a user with permissions to
   * manage other users. Users are eligible to access rights and may be assigned a
   * key. This service is responsible for managing user resources as well as
   * their associations with access rights.
   * </pre>
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   * <pre>
   * A user can refer to both a holder of keys and a user with permissions to
   * manage other users. Users are eligible to access rights and may be assigned a
   * key. This service is responsible for managing user resources as well as
   * their associations with access rights.
   * </pre>
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a user
     * Creates a new user.
     * </pre>
     */
    public void createUser(com.saltoapis.nebula.user.v1.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a user
     * Retrieves an existing user.
     * </pre>
     */
    public void getUser(com.saltoapis.nebula.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List users
     * Returns a list of users that have been previously created.
     * </pre>
     */
    public void listUsers(com.saltoapis.nebula.user.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a user
     * Updates an existing user.
     * </pre>
     */
    public void updateUser(com.saltoapis.nebula.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a user
     * Permanently deletes a user. This cannot be undone.
     * </pre>
     */
    public void deleteUser(com.saltoapis.nebula.user.v1.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block a user
     * Temporarily blocks an existing user. While blocked, the user cannot
     * perform any admin actions, that is, they have no management role.
     * Neither can they unlock any access point with any type of key.
     * </pre>
     */
    public void blockUser(com.saltoapis.nebula.user.v1.BlockUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.BlockUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unblock a user
     * Unblocks an already blocked user. Once unblocked, the user can
     * perform the admin actions they could previously, that is,
     * they once again have a management role.
     * They can also once again unlock the access points they previously
     * had access to.
     * </pre>
     */
    public void unblockUser(com.saltoapis.nebula.user.v1.UnblockUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UnblockUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a user's access right association.
     * </pre>
     */
    public void createUserAccessRight(com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an access right
     * Gets an existing user's access right association.
     * </pre>
     */
    public void getUserAccessRight(com.saltoapis.nebula.user.v1.GetUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List access rights
     * Lists an existing user's access right associations.
     * </pre>
     */
    public void listUserAccessRights(com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserAccessRightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing user's access right associations.
     * </pre>
     */
    public void updateUserAccessRight(com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an access right
     * Deletes a user's access right association. This cannot be undone.
     * </pre>
     */
    public void deleteUserAccessRight(com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserAccessRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign a card key
     * Assigns a card key to an existing user.
     * </pre>
     */
    public void assignCardKey(com.saltoapis.nebula.user.v1.AssignCardKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CardKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignCardKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel a card key
     * Cancels an existing user's card key.
     * </pre>
     */
    public void cancelCardKey(com.saltoapis.nebula.user.v1.CancelCardKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CardKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelCardKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Encode a card key
     * Encodes an existing user's card key.
     * </pre>
     */
    public void encodeCardKey(com.saltoapis.nebula.user.v1.EncodeCardKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncodeCardKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign an app key
     * Assigns an app key to an existing user.
     * </pre>
     */
    public void assignAppKey(com.saltoapis.nebula.user.v1.AssignAppKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AppKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignAppKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an app key
     * Cancels an existing user's app key.
     * </pre>
     */
    public void cancelAppKey(com.saltoapis.nebula.user.v1.CancelAppKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AppKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAppKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compute data of an app key
     * Compute an existing user's app key data. Data contains encoded access
     * rights of the user.
     * (-- api-linter: core::0136::http-name-variable=disabled --)
     * </pre>
     */
    public void computeAppKeyData(com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getComputeAppKeyDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign a wallet key
     * Assigns a wallet key to an existing user.
     * </pre>
     */
    public void assignWalletKey(com.saltoapis.nebula.user.v1.AssignWalletKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AssignWalletKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignWalletKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel a wallet key
     * Cancels an existing user's wallet key.
     * </pre>
     */
    public void cancelWalletKey(com.saltoapis.nebula.user.v1.CancelWalletKeyRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CancelWalletKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelWalletKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign a passcode
     * Assigns a passcode to an existing user.
     * </pre>
     */
    public void assignPasscode(com.saltoapis.nebula.user.v1.AssignPasscodeRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AssignPasscodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignPasscodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel a passcode
     * Cancels an existing user's passcode.
     * </pre>
     */
    public void cancelPasscode(com.saltoapis.nebula.user.v1.CancelPasscodeRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CancelPasscodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelPasscodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   * <pre>
   * A user can refer to both a holder of keys and a user with permissions to
   * manage other users. Users are eligible to access rights and may be assigned a
   * key. This service is responsible for managing user resources as well as
   * their associations with access rights.
   * </pre>
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a user
     * Creates a new user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.User createUser(com.saltoapis.nebula.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a user
     * Retrieves an existing user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.User getUser(com.saltoapis.nebula.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List users
     * Returns a list of users that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.ListUsersResponse listUsers(com.saltoapis.nebula.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a user
     * Updates an existing user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.User updateUser(com.saltoapis.nebula.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a user
     * Permanently deletes a user. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteUser(com.saltoapis.nebula.user.v1.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block a user
     * Temporarily blocks an existing user. While blocked, the user cannot
     * perform any admin actions, that is, they have no management role.
     * Neither can they unlock any access point with any type of key.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.BlockUserResponse blockUser(com.saltoapis.nebula.user.v1.BlockUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unblock a user
     * Unblocks an already blocked user. Once unblocked, the user can
     * perform the admin actions they could previously, that is,
     * they once again have a management role.
     * They can also once again unlock the access points they previously
     * had access to.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.UnblockUserResponse unblockUser(com.saltoapis.nebula.user.v1.UnblockUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnblockUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a user's access right association.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight createUserAccessRight(com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an access right
     * Gets an existing user's access right association.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight getUserAccessRight(com.saltoapis.nebula.user.v1.GetUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List access rights
     * Lists an existing user's access right associations.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse listUserAccessRights(com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserAccessRightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing user's access right associations.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.UserAccessRight updateUserAccessRight(com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an access right
     * Deletes a user's access right association. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteUserAccessRight(com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserAccessRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign a card key
     * Assigns a card key to an existing user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.CardKey assignCardKey(com.saltoapis.nebula.user.v1.AssignCardKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignCardKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a card key
     * Cancels an existing user's card key.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.CardKey cancelCardKey(com.saltoapis.nebula.user.v1.CancelCardKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelCardKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Encode a card key
     * Encodes an existing user's card key.
     * </pre>
     */
    public com.saltoapis.longrunning.v1.Operation encodeCardKey(com.saltoapis.nebula.user.v1.EncodeCardKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncodeCardKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign an app key
     * Assigns an app key to an existing user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.AppKey assignAppKey(com.saltoapis.nebula.user.v1.AssignAppKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignAppKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an app key
     * Cancels an existing user's app key.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.AppKey cancelAppKey(com.saltoapis.nebula.user.v1.CancelAppKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAppKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compute data of an app key
     * Compute an existing user's app key data. Data contains encoded access
     * rights of the user.
     * (-- api-linter: core::0136::http-name-variable=disabled --)
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse computeAppKeyData(com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getComputeAppKeyDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign a wallet key
     * Assigns a wallet key to an existing user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.AssignWalletKeyResponse assignWalletKey(com.saltoapis.nebula.user.v1.AssignWalletKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignWalletKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a wallet key
     * Cancels an existing user's wallet key.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.CancelWalletKeyResponse cancelWalletKey(com.saltoapis.nebula.user.v1.CancelWalletKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelWalletKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign a passcode
     * Assigns a passcode to an existing user.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.AssignPasscodeResponse assignPasscode(com.saltoapis.nebula.user.v1.AssignPasscodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignPasscodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a passcode
     * Cancels an existing user's passcode.
     * </pre>
     */
    public com.saltoapis.nebula.user.v1.CancelPasscodeResponse cancelPasscode(com.saltoapis.nebula.user.v1.CancelPasscodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelPasscodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   * <pre>
   * A user can refer to both a holder of keys and a user with permissions to
   * manage other users. Users are eligible to access rights and may be assigned a
   * key. This service is responsible for managing user resources as well as
   * their associations with access rights.
   * </pre>
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a user
     * Creates a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.User> createUser(
        com.saltoapis.nebula.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a user
     * Retrieves an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.User> getUser(
        com.saltoapis.nebula.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List users
     * Returns a list of users that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.ListUsersResponse> listUsers(
        com.saltoapis.nebula.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a user
     * Updates an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.User> updateUser(
        com.saltoapis.nebula.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a user
     * Permanently deletes a user. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUser(
        com.saltoapis.nebula.user.v1.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block a user
     * Temporarily blocks an existing user. While blocked, the user cannot
     * perform any admin actions, that is, they have no management role.
     * Neither can they unlock any access point with any type of key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.BlockUserResponse> blockUser(
        com.saltoapis.nebula.user.v1.BlockUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unblock a user
     * Unblocks an already blocked user. Once unblocked, the user can
     * perform the admin actions they could previously, that is,
     * they once again have a management role.
     * They can also once again unlock the access points they previously
     * had access to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.UnblockUserResponse> unblockUser(
        com.saltoapis.nebula.user.v1.UnblockUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an access right
     * Creates a user's access right association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.UserAccessRight> createUserAccessRight(
        com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an access right
     * Gets an existing user's access right association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.UserAccessRight> getUserAccessRight(
        com.saltoapis.nebula.user.v1.GetUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List access rights
     * Lists an existing user's access right associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse> listUserAccessRights(
        com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserAccessRightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an access right
     * Updates an existing user's access right associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.UserAccessRight> updateUserAccessRight(
        com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an access right
     * Deletes a user's access right association. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUserAccessRight(
        com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserAccessRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign a card key
     * Assigns a card key to an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.CardKey> assignCardKey(
        com.saltoapis.nebula.user.v1.AssignCardKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignCardKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel a card key
     * Cancels an existing user's card key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.CardKey> cancelCardKey(
        com.saltoapis.nebula.user.v1.CancelCardKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelCardKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Encode a card key
     * Encodes an existing user's card key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.longrunning.v1.Operation> encodeCardKey(
        com.saltoapis.nebula.user.v1.EncodeCardKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncodeCardKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign an app key
     * Assigns an app key to an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.AppKey> assignAppKey(
        com.saltoapis.nebula.user.v1.AssignAppKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignAppKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an app key
     * Cancels an existing user's app key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.AppKey> cancelAppKey(
        com.saltoapis.nebula.user.v1.CancelAppKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAppKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compute data of an app key
     * Compute an existing user's app key data. Data contains encoded access
     * rights of the user.
     * (-- api-linter: core::0136::http-name-variable=disabled --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse> computeAppKeyData(
        com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getComputeAppKeyDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign a wallet key
     * Assigns a wallet key to an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.AssignWalletKeyResponse> assignWalletKey(
        com.saltoapis.nebula.user.v1.AssignWalletKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignWalletKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel a wallet key
     * Cancels an existing user's wallet key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.CancelWalletKeyResponse> cancelWalletKey(
        com.saltoapis.nebula.user.v1.CancelWalletKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelWalletKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign a passcode
     * Assigns a passcode to an existing user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.AssignPasscodeResponse> assignPasscode(
        com.saltoapis.nebula.user.v1.AssignPasscodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignPasscodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel a passcode
     * Cancels an existing user's passcode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.user.v1.CancelPasscodeResponse> cancelPasscode(
        com.saltoapis.nebula.user.v1.CancelPasscodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelPasscodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_LIST_USERS = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_BLOCK_USER = 5;
  private static final int METHODID_UNBLOCK_USER = 6;
  private static final int METHODID_CREATE_USER_ACCESS_RIGHT = 7;
  private static final int METHODID_GET_USER_ACCESS_RIGHT = 8;
  private static final int METHODID_LIST_USER_ACCESS_RIGHTS = 9;
  private static final int METHODID_UPDATE_USER_ACCESS_RIGHT = 10;
  private static final int METHODID_DELETE_USER_ACCESS_RIGHT = 11;
  private static final int METHODID_ASSIGN_CARD_KEY = 12;
  private static final int METHODID_CANCEL_CARD_KEY = 13;
  private static final int METHODID_ENCODE_CARD_KEY = 14;
  private static final int METHODID_ASSIGN_APP_KEY = 15;
  private static final int METHODID_CANCEL_APP_KEY = 16;
  private static final int METHODID_COMPUTE_APP_KEY_DATA = 17;
  private static final int METHODID_ASSIGN_WALLET_KEY = 18;
  private static final int METHODID_CANCEL_WALLET_KEY = 19;
  private static final int METHODID_ASSIGN_PASSCODE = 20;
  private static final int METHODID_CANCEL_PASSCODE = 21;

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
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.saltoapis.nebula.user.v1.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.saltoapis.nebula.user.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.saltoapis.nebula.user.v1.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ListUsersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.saltoapis.nebula.user.v1.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.User>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.saltoapis.nebula.user.v1.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BLOCK_USER:
          serviceImpl.blockUser((com.saltoapis.nebula.user.v1.BlockUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.BlockUserResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK_USER:
          serviceImpl.unblockUser((com.saltoapis.nebula.user.v1.UnblockUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UnblockUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_ACCESS_RIGHT:
          serviceImpl.createUserAccessRight((com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight>) responseObserver);
          break;
        case METHODID_GET_USER_ACCESS_RIGHT:
          serviceImpl.getUserAccessRight((com.saltoapis.nebula.user.v1.GetUserAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight>) responseObserver);
          break;
        case METHODID_LIST_USER_ACCESS_RIGHTS:
          serviceImpl.listUserAccessRights((com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_ACCESS_RIGHT:
          serviceImpl.updateUserAccessRight((com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.UserAccessRight>) responseObserver);
          break;
        case METHODID_DELETE_USER_ACCESS_RIGHT:
          serviceImpl.deleteUserAccessRight((com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ASSIGN_CARD_KEY:
          serviceImpl.assignCardKey((com.saltoapis.nebula.user.v1.AssignCardKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CardKey>) responseObserver);
          break;
        case METHODID_CANCEL_CARD_KEY:
          serviceImpl.cancelCardKey((com.saltoapis.nebula.user.v1.CancelCardKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CardKey>) responseObserver);
          break;
        case METHODID_ENCODE_CARD_KEY:
          serviceImpl.encodeCardKey((com.saltoapis.nebula.user.v1.EncodeCardKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.longrunning.v1.Operation>) responseObserver);
          break;
        case METHODID_ASSIGN_APP_KEY:
          serviceImpl.assignAppKey((com.saltoapis.nebula.user.v1.AssignAppKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AppKey>) responseObserver);
          break;
        case METHODID_CANCEL_APP_KEY:
          serviceImpl.cancelAppKey((com.saltoapis.nebula.user.v1.CancelAppKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AppKey>) responseObserver);
          break;
        case METHODID_COMPUTE_APP_KEY_DATA:
          serviceImpl.computeAppKeyData((com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_WALLET_KEY:
          serviceImpl.assignWalletKey((com.saltoapis.nebula.user.v1.AssignWalletKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AssignWalletKeyResponse>) responseObserver);
          break;
        case METHODID_CANCEL_WALLET_KEY:
          serviceImpl.cancelWalletKey((com.saltoapis.nebula.user.v1.CancelWalletKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CancelWalletKeyResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_PASSCODE:
          serviceImpl.assignPasscode((com.saltoapis.nebula.user.v1.AssignPasscodeRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.AssignPasscodeResponse>) responseObserver);
          break;
        case METHODID_CANCEL_PASSCODE:
          serviceImpl.cancelPasscode((com.saltoapis.nebula.user.v1.CancelPasscodeRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.user.v1.CancelPasscodeResponse>) responseObserver);
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
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.CreateUserRequest,
              com.saltoapis.nebula.user.v1.User>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.GetUserRequest,
              com.saltoapis.nebula.user.v1.User>(
                service, METHODID_GET_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.ListUsersRequest,
              com.saltoapis.nebula.user.v1.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.UpdateUserRequest,
              com.saltoapis.nebula.user.v1.User>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.DeleteUserRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getBlockUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.BlockUserRequest,
              com.saltoapis.nebula.user.v1.BlockUserResponse>(
                service, METHODID_BLOCK_USER)))
        .addMethod(
          getUnblockUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.UnblockUserRequest,
              com.saltoapis.nebula.user.v1.UnblockUserResponse>(
                service, METHODID_UNBLOCK_USER)))
        .addMethod(
          getCreateUserAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.CreateUserAccessRightRequest,
              com.saltoapis.nebula.user.v1.UserAccessRight>(
                service, METHODID_CREATE_USER_ACCESS_RIGHT)))
        .addMethod(
          getGetUserAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.GetUserAccessRightRequest,
              com.saltoapis.nebula.user.v1.UserAccessRight>(
                service, METHODID_GET_USER_ACCESS_RIGHT)))
        .addMethod(
          getListUserAccessRightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.ListUserAccessRightsRequest,
              com.saltoapis.nebula.user.v1.ListUserAccessRightsResponse>(
                service, METHODID_LIST_USER_ACCESS_RIGHTS)))
        .addMethod(
          getUpdateUserAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.UpdateUserAccessRightRequest,
              com.saltoapis.nebula.user.v1.UserAccessRight>(
                service, METHODID_UPDATE_USER_ACCESS_RIGHT)))
        .addMethod(
          getDeleteUserAccessRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.DeleteUserAccessRightRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER_ACCESS_RIGHT)))
        .addMethod(
          getAssignCardKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.AssignCardKeyRequest,
              com.saltoapis.nebula.user.v1.CardKey>(
                service, METHODID_ASSIGN_CARD_KEY)))
        .addMethod(
          getCancelCardKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.CancelCardKeyRequest,
              com.saltoapis.nebula.user.v1.CardKey>(
                service, METHODID_CANCEL_CARD_KEY)))
        .addMethod(
          getEncodeCardKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.EncodeCardKeyRequest,
              com.saltoapis.longrunning.v1.Operation>(
                service, METHODID_ENCODE_CARD_KEY)))
        .addMethod(
          getAssignAppKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.AssignAppKeyRequest,
              com.saltoapis.nebula.user.v1.AppKey>(
                service, METHODID_ASSIGN_APP_KEY)))
        .addMethod(
          getCancelAppKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.CancelAppKeyRequest,
              com.saltoapis.nebula.user.v1.AppKey>(
                service, METHODID_CANCEL_APP_KEY)))
        .addMethod(
          getComputeAppKeyDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.ComputeAppKeyDataRequest,
              com.saltoapis.nebula.user.v1.ComputeAppKeyDataResponse>(
                service, METHODID_COMPUTE_APP_KEY_DATA)))
        .addMethod(
          getAssignWalletKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.AssignWalletKeyRequest,
              com.saltoapis.nebula.user.v1.AssignWalletKeyResponse>(
                service, METHODID_ASSIGN_WALLET_KEY)))
        .addMethod(
          getCancelWalletKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.CancelWalletKeyRequest,
              com.saltoapis.nebula.user.v1.CancelWalletKeyResponse>(
                service, METHODID_CANCEL_WALLET_KEY)))
        .addMethod(
          getAssignPasscodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.AssignPasscodeRequest,
              com.saltoapis.nebula.user.v1.AssignPasscodeResponse>(
                service, METHODID_ASSIGN_PASSCODE)))
        .addMethod(
          getCancelPasscodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.user.v1.CancelPasscodeRequest,
              com.saltoapis.nebula.user.v1.CancelPasscodeResponse>(
                service, METHODID_CANCEL_PASSCODE)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.user.v1.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getBlockUserMethod())
              .addMethod(getUnblockUserMethod())
              .addMethod(getCreateUserAccessRightMethod())
              .addMethod(getGetUserAccessRightMethod())
              .addMethod(getListUserAccessRightsMethod())
              .addMethod(getUpdateUserAccessRightMethod())
              .addMethod(getDeleteUserAccessRightMethod())
              .addMethod(getAssignCardKeyMethod())
              .addMethod(getCancelCardKeyMethod())
              .addMethod(getEncodeCardKeyMethod())
              .addMethod(getAssignAppKeyMethod())
              .addMethod(getCancelAppKeyMethod())
              .addMethod(getComputeAppKeyDataMethod())
              .addMethod(getAssignWalletKeyMethod())
              .addMethod(getCancelWalletKeyMethod())
              .addMethod(getAssignPasscodeMethod())
              .addMethod(getCancelPasscodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
