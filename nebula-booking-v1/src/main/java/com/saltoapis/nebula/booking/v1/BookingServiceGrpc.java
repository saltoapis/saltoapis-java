package com.saltoapis.nebula.booking.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The BookingService manages bookings within an installation.
 * A booking represents the contractual agreement for a stay, including
 * reservation details, dates and guest information. This service handles
 * the lifecycle of bookings independently from the physical access control
 * systems, allowing reservations to be managed separately from device states
 * and access permissions.
 * Use this service to create, retrieve, update and delete bookings as part
 * of property management operations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/booking/v1/booking.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.booking.v1.BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CreateBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getCreateBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBooking",
      requestType = com.saltoapis.nebula.booking.v1.CreateBookingRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.Booking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CreateBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getCreateBookingMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CreateBookingRequest, com.saltoapis.nebula.booking.v1.Booking> getCreateBookingMethod;
    if ((getCreateBookingMethod = BookingServiceGrpc.getCreateBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCreateBookingMethod = BookingServiceGrpc.getCreateBookingMethod) == null) {
          BookingServiceGrpc.getCreateBookingMethod = getCreateBookingMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.CreateBookingRequest, com.saltoapis.nebula.booking.v1.Booking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.CreateBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.Booking.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CreateBooking"))
              .build();
        }
      }
    }
    return getCreateBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.GetBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getGetBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBooking",
      requestType = com.saltoapis.nebula.booking.v1.GetBookingRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.Booking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.GetBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getGetBookingMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.GetBookingRequest, com.saltoapis.nebula.booking.v1.Booking> getGetBookingMethod;
    if ((getGetBookingMethod = BookingServiceGrpc.getGetBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetBookingMethod = BookingServiceGrpc.getGetBookingMethod) == null) {
          BookingServiceGrpc.getGetBookingMethod = getGetBookingMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.GetBookingRequest, com.saltoapis.nebula.booking.v1.Booking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.GetBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.Booking.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("GetBooking"))
              .build();
        }
      }
    }
    return getGetBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.ListBookingsRequest,
      com.saltoapis.nebula.booking.v1.ListBookingsResponse> getListBookingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBookings",
      requestType = com.saltoapis.nebula.booking.v1.ListBookingsRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.ListBookingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.ListBookingsRequest,
      com.saltoapis.nebula.booking.v1.ListBookingsResponse> getListBookingsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.ListBookingsRequest, com.saltoapis.nebula.booking.v1.ListBookingsResponse> getListBookingsMethod;
    if ((getListBookingsMethod = BookingServiceGrpc.getListBookingsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getListBookingsMethod = BookingServiceGrpc.getListBookingsMethod) == null) {
          BookingServiceGrpc.getListBookingsMethod = getListBookingsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.ListBookingsRequest, com.saltoapis.nebula.booking.v1.ListBookingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBookings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.ListBookingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.ListBookingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("ListBookings"))
              .build();
        }
      }
    }
    return getListBookingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.UpdateBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getUpdateBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBooking",
      requestType = com.saltoapis.nebula.booking.v1.UpdateBookingRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.Booking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.UpdateBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getUpdateBookingMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.UpdateBookingRequest, com.saltoapis.nebula.booking.v1.Booking> getUpdateBookingMethod;
    if ((getUpdateBookingMethod = BookingServiceGrpc.getUpdateBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getUpdateBookingMethod = BookingServiceGrpc.getUpdateBookingMethod) == null) {
          BookingServiceGrpc.getUpdateBookingMethod = getUpdateBookingMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.UpdateBookingRequest, com.saltoapis.nebula.booking.v1.Booking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.UpdateBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.Booking.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("UpdateBooking"))
              .build();
        }
      }
    }
    return getUpdateBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.DeleteBookingRequest,
      com.google.protobuf.Empty> getDeleteBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBooking",
      requestType = com.saltoapis.nebula.booking.v1.DeleteBookingRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.DeleteBookingRequest,
      com.google.protobuf.Empty> getDeleteBookingMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.DeleteBookingRequest, com.google.protobuf.Empty> getDeleteBookingMethod;
    if ((getDeleteBookingMethod = BookingServiceGrpc.getDeleteBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getDeleteBookingMethod = BookingServiceGrpc.getDeleteBookingMethod) == null) {
          BookingServiceGrpc.getDeleteBookingMethod = getDeleteBookingMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.DeleteBookingRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.DeleteBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("DeleteBooking"))
              .build();
        }
      }
    }
    return getDeleteBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CheckInBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getCheckInBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckInBooking",
      requestType = com.saltoapis.nebula.booking.v1.CheckInBookingRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.Booking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CheckInBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getCheckInBookingMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CheckInBookingRequest, com.saltoapis.nebula.booking.v1.Booking> getCheckInBookingMethod;
    if ((getCheckInBookingMethod = BookingServiceGrpc.getCheckInBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCheckInBookingMethod = BookingServiceGrpc.getCheckInBookingMethod) == null) {
          BookingServiceGrpc.getCheckInBookingMethod = getCheckInBookingMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.CheckInBookingRequest, com.saltoapis.nebula.booking.v1.Booking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckInBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.CheckInBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.Booking.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CheckInBooking"))
              .build();
        }
      }
    }
    return getCheckInBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CheckOutBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getCheckOutBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckOutBooking",
      requestType = com.saltoapis.nebula.booking.v1.CheckOutBookingRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.Booking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CheckOutBookingRequest,
      com.saltoapis.nebula.booking.v1.Booking> getCheckOutBookingMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CheckOutBookingRequest, com.saltoapis.nebula.booking.v1.Booking> getCheckOutBookingMethod;
    if ((getCheckOutBookingMethod = BookingServiceGrpc.getCheckOutBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCheckOutBookingMethod = BookingServiceGrpc.getCheckOutBookingMethod) == null) {
          BookingServiceGrpc.getCheckOutBookingMethod = getCheckOutBookingMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.CheckOutBookingRequest, com.saltoapis.nebula.booking.v1.Booking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckOutBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.CheckOutBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.Booking.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CheckOutBooking"))
              .build();
        }
      }
    }
    return getCheckOutBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CreateBookingUserRequest,
      com.saltoapis.nebula.booking.v1.BookingUser> getCreateBookingUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBookingUser",
      requestType = com.saltoapis.nebula.booking.v1.CreateBookingUserRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.BookingUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CreateBookingUserRequest,
      com.saltoapis.nebula.booking.v1.BookingUser> getCreateBookingUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.CreateBookingUserRequest, com.saltoapis.nebula.booking.v1.BookingUser> getCreateBookingUserMethod;
    if ((getCreateBookingUserMethod = BookingServiceGrpc.getCreateBookingUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCreateBookingUserMethod = BookingServiceGrpc.getCreateBookingUserMethod) == null) {
          BookingServiceGrpc.getCreateBookingUserMethod = getCreateBookingUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.CreateBookingUserRequest, com.saltoapis.nebula.booking.v1.BookingUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBookingUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.CreateBookingUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.BookingUser.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("CreateBookingUser"))
              .build();
        }
      }
    }
    return getCreateBookingUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.GetBookingUserRequest,
      com.saltoapis.nebula.booking.v1.BookingUser> getGetBookingUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBookingUser",
      requestType = com.saltoapis.nebula.booking.v1.GetBookingUserRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.BookingUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.GetBookingUserRequest,
      com.saltoapis.nebula.booking.v1.BookingUser> getGetBookingUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.GetBookingUserRequest, com.saltoapis.nebula.booking.v1.BookingUser> getGetBookingUserMethod;
    if ((getGetBookingUserMethod = BookingServiceGrpc.getGetBookingUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetBookingUserMethod = BookingServiceGrpc.getGetBookingUserMethod) == null) {
          BookingServiceGrpc.getGetBookingUserMethod = getGetBookingUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.GetBookingUserRequest, com.saltoapis.nebula.booking.v1.BookingUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBookingUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.GetBookingUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.BookingUser.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("GetBookingUser"))
              .build();
        }
      }
    }
    return getGetBookingUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.ListBookingUsersRequest,
      com.saltoapis.nebula.booking.v1.ListBookingUsersResponse> getListBookingUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBookingUsers",
      requestType = com.saltoapis.nebula.booking.v1.ListBookingUsersRequest.class,
      responseType = com.saltoapis.nebula.booking.v1.ListBookingUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.ListBookingUsersRequest,
      com.saltoapis.nebula.booking.v1.ListBookingUsersResponse> getListBookingUsersMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.ListBookingUsersRequest, com.saltoapis.nebula.booking.v1.ListBookingUsersResponse> getListBookingUsersMethod;
    if ((getListBookingUsersMethod = BookingServiceGrpc.getListBookingUsersMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getListBookingUsersMethod = BookingServiceGrpc.getListBookingUsersMethod) == null) {
          BookingServiceGrpc.getListBookingUsersMethod = getListBookingUsersMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.ListBookingUsersRequest, com.saltoapis.nebula.booking.v1.ListBookingUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBookingUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.ListBookingUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.ListBookingUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("ListBookingUsers"))
              .build();
        }
      }
    }
    return getListBookingUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest,
      com.google.protobuf.Empty> getDeleteBookingUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBookingUser",
      requestType = com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest,
      com.google.protobuf.Empty> getDeleteBookingUserMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest, com.google.protobuf.Empty> getDeleteBookingUserMethod;
    if ((getDeleteBookingUserMethod = BookingServiceGrpc.getDeleteBookingUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getDeleteBookingUserMethod = BookingServiceGrpc.getDeleteBookingUserMethod) == null) {
          BookingServiceGrpc.getDeleteBookingUserMethod = getDeleteBookingUserMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBookingUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("DeleteBookingUser"))
              .build();
        }
      }
    }
    return getDeleteBookingUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub>() {
        @java.lang.Override
        public BookingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceStub(channel, callOptions);
        }
      };
    return BookingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub>() {
        @java.lang.Override
        public BookingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceBlockingStub(channel, callOptions);
        }
      };
    return BookingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub>() {
        @java.lang.Override
        public BookingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceFutureStub(channel, callOptions);
        }
      };
    return BookingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The BookingService manages bookings within an installation.
   * A booking represents the contractual agreement for a stay, including
   * reservation details, dates and guest information. This service handles
   * the lifecycle of bookings independently from the physical access control
   * systems, allowing reservations to be managed separately from device states
   * and access permissions.
   * Use this service to create, retrieve, update and delete bookings as part
   * of property management operations.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a booking
     * Creates a new booking in the specified installation.
     * </pre>
     */
    default void createBooking(com.saltoapis.nebula.booking.v1.CreateBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a booking
     * Gets an existing booking.
     * </pre>
     */
    default void getBooking(com.saltoapis.nebula.booking.v1.GetBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * List bookings
     * Returns a list of bookings that have been previously created.
     * </pre>
     */
    default void listBookings(com.saltoapis.nebula.booking.v1.ListBookingsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.ListBookingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBookingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a booking
     * Updates an existing booking.
     * </pre>
     */
    default void updateBooking(com.saltoapis.nebula.booking.v1.UpdateBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a booking
     * Permanently deletes a booking. This cannot be undone.
     * </pre>
     */
    default void deleteBooking(com.saltoapis.nebula.booking.v1.DeleteBookingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check in a booking
     * Performs the check-in process for a booking.
     * </pre>
     */
    default void checkInBooking(com.saltoapis.nebula.booking.v1.CheckInBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckInBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check out a booking
     * Performs the check-out process for a booking.
     * </pre>
     */
    default void checkOutBooking(com.saltoapis.nebula.booking.v1.CheckOutBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckOutBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a booking user
     * Creates a booking's user association.
     * </pre>
     */
    default void createBookingUser(com.saltoapis.nebula.booking.v1.CreateBookingUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.BookingUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBookingUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a booking user
     * Retrieves an existing booking's user association.
     * </pre>
     */
    default void getBookingUser(com.saltoapis.nebula.booking.v1.GetBookingUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.BookingUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookingUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * List booking users
     * Lists an existing booking's user associations.
     * </pre>
     */
    default void listBookingUsers(com.saltoapis.nebula.booking.v1.ListBookingUsersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.ListBookingUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBookingUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a booking user
     * Deletes a booking's user association.
     * </pre>
     */
    default void deleteBookingUser(com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBookingUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookingService.
   * <pre>
   * The BookingService manages bookings within an installation.
   * A booking represents the contractual agreement for a stay, including
   * reservation details, dates and guest information. This service handles
   * the lifecycle of bookings independently from the physical access control
   * systems, allowing reservations to be managed separately from device states
   * and access permissions.
   * Use this service to create, retrieve, update and delete bookings as part
   * of property management operations.
   * </pre>
   */
  public static abstract class BookingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookingService.
   * <pre>
   * The BookingService manages bookings within an installation.
   * A booking represents the contractual agreement for a stay, including
   * reservation details, dates and guest information. This service handles
   * the lifecycle of bookings independently from the physical access control
   * systems, allowing reservations to be managed separately from device states
   * and access permissions.
   * Use this service to create, retrieve, update and delete bookings as part
   * of property management operations.
   * </pre>
   */
  public static final class BookingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookingServiceStub> {
    private BookingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a booking
     * Creates a new booking in the specified installation.
     * </pre>
     */
    public void createBooking(com.saltoapis.nebula.booking.v1.CreateBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a booking
     * Gets an existing booking.
     * </pre>
     */
    public void getBooking(com.saltoapis.nebula.booking.v1.GetBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List bookings
     * Returns a list of bookings that have been previously created.
     * </pre>
     */
    public void listBookings(com.saltoapis.nebula.booking.v1.ListBookingsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.ListBookingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBookingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a booking
     * Updates an existing booking.
     * </pre>
     */
    public void updateBooking(com.saltoapis.nebula.booking.v1.UpdateBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a booking
     * Permanently deletes a booking. This cannot be undone.
     * </pre>
     */
    public void deleteBooking(com.saltoapis.nebula.booking.v1.DeleteBookingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check in a booking
     * Performs the check-in process for a booking.
     * </pre>
     */
    public void checkInBooking(com.saltoapis.nebula.booking.v1.CheckInBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckInBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check out a booking
     * Performs the check-out process for a booking.
     * </pre>
     */
    public void checkOutBooking(com.saltoapis.nebula.booking.v1.CheckOutBookingRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckOutBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a booking user
     * Creates a booking's user association.
     * </pre>
     */
    public void createBookingUser(com.saltoapis.nebula.booking.v1.CreateBookingUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.BookingUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBookingUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a booking user
     * Retrieves an existing booking's user association.
     * </pre>
     */
    public void getBookingUser(com.saltoapis.nebula.booking.v1.GetBookingUserRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.BookingUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookingUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List booking users
     * Lists an existing booking's user associations.
     * </pre>
     */
    public void listBookingUsers(com.saltoapis.nebula.booking.v1.ListBookingUsersRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.ListBookingUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBookingUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a booking user
     * Deletes a booking's user association.
     * </pre>
     */
    public void deleteBookingUser(com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBookingUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookingService.
   * <pre>
   * The BookingService manages bookings within an installation.
   * A booking represents the contractual agreement for a stay, including
   * reservation details, dates and guest information. This service handles
   * the lifecycle of bookings independently from the physical access control
   * systems, allowing reservations to be managed separately from device states
   * and access permissions.
   * Use this service to create, retrieve, update and delete bookings as part
   * of property management operations.
   * </pre>
   */
  public static final class BookingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a booking
     * Creates a new booking in the specified installation.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.Booking createBooking(com.saltoapis.nebula.booking.v1.CreateBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a booking
     * Gets an existing booking.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.Booking getBooking(com.saltoapis.nebula.booking.v1.GetBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List bookings
     * Returns a list of bookings that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.ListBookingsResponse listBookings(com.saltoapis.nebula.booking.v1.ListBookingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBookingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a booking
     * Updates an existing booking.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.Booking updateBooking(com.saltoapis.nebula.booking.v1.UpdateBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a booking
     * Permanently deletes a booking. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBooking(com.saltoapis.nebula.booking.v1.DeleteBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check in a booking
     * Performs the check-in process for a booking.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.Booking checkInBooking(com.saltoapis.nebula.booking.v1.CheckInBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckInBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check out a booking
     * Performs the check-out process for a booking.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.Booking checkOutBooking(com.saltoapis.nebula.booking.v1.CheckOutBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckOutBookingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a booking user
     * Creates a booking's user association.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.BookingUser createBookingUser(com.saltoapis.nebula.booking.v1.CreateBookingUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBookingUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a booking user
     * Retrieves an existing booking's user association.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.BookingUser getBookingUser(com.saltoapis.nebula.booking.v1.GetBookingUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookingUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List booking users
     * Lists an existing booking's user associations.
     * </pre>
     */
    public com.saltoapis.nebula.booking.v1.ListBookingUsersResponse listBookingUsers(com.saltoapis.nebula.booking.v1.ListBookingUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBookingUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a booking user
     * Deletes a booking's user association.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBookingUser(com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBookingUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookingService.
   * <pre>
   * The BookingService manages bookings within an installation.
   * A booking represents the contractual agreement for a stay, including
   * reservation details, dates and guest information. This service handles
   * the lifecycle of bookings independently from the physical access control
   * systems, allowing reservations to be managed separately from device states
   * and access permissions.
   * Use this service to create, retrieve, update and delete bookings as part
   * of property management operations.
   * </pre>
   */
  public static final class BookingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a booking
     * Creates a new booking in the specified installation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.Booking> createBooking(
        com.saltoapis.nebula.booking.v1.CreateBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a booking
     * Gets an existing booking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.Booking> getBooking(
        com.saltoapis.nebula.booking.v1.GetBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List bookings
     * Returns a list of bookings that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.ListBookingsResponse> listBookings(
        com.saltoapis.nebula.booking.v1.ListBookingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBookingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a booking
     * Updates an existing booking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.Booking> updateBooking(
        com.saltoapis.nebula.booking.v1.UpdateBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a booking
     * Permanently deletes a booking. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBooking(
        com.saltoapis.nebula.booking.v1.DeleteBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check in a booking
     * Performs the check-in process for a booking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.Booking> checkInBooking(
        com.saltoapis.nebula.booking.v1.CheckInBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckInBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check out a booking
     * Performs the check-out process for a booking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.Booking> checkOutBooking(
        com.saltoapis.nebula.booking.v1.CheckOutBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckOutBookingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a booking user
     * Creates a booking's user association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.BookingUser> createBookingUser(
        com.saltoapis.nebula.booking.v1.CreateBookingUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBookingUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a booking user
     * Retrieves an existing booking's user association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.BookingUser> getBookingUser(
        com.saltoapis.nebula.booking.v1.GetBookingUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookingUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List booking users
     * Lists an existing booking's user associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.booking.v1.ListBookingUsersResponse> listBookingUsers(
        com.saltoapis.nebula.booking.v1.ListBookingUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBookingUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a booking user
     * Deletes a booking's user association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBookingUser(
        com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBookingUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOOKING = 0;
  private static final int METHODID_GET_BOOKING = 1;
  private static final int METHODID_LIST_BOOKINGS = 2;
  private static final int METHODID_UPDATE_BOOKING = 3;
  private static final int METHODID_DELETE_BOOKING = 4;
  private static final int METHODID_CHECK_IN_BOOKING = 5;
  private static final int METHODID_CHECK_OUT_BOOKING = 6;
  private static final int METHODID_CREATE_BOOKING_USER = 7;
  private static final int METHODID_GET_BOOKING_USER = 8;
  private static final int METHODID_LIST_BOOKING_USERS = 9;
  private static final int METHODID_DELETE_BOOKING_USER = 10;

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
        case METHODID_CREATE_BOOKING:
          serviceImpl.createBooking((com.saltoapis.nebula.booking.v1.CreateBookingRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking>) responseObserver);
          break;
        case METHODID_GET_BOOKING:
          serviceImpl.getBooking((com.saltoapis.nebula.booking.v1.GetBookingRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking>) responseObserver);
          break;
        case METHODID_LIST_BOOKINGS:
          serviceImpl.listBookings((com.saltoapis.nebula.booking.v1.ListBookingsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.ListBookingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOOKING:
          serviceImpl.updateBooking((com.saltoapis.nebula.booking.v1.UpdateBookingRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking>) responseObserver);
          break;
        case METHODID_DELETE_BOOKING:
          serviceImpl.deleteBooking((com.saltoapis.nebula.booking.v1.DeleteBookingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHECK_IN_BOOKING:
          serviceImpl.checkInBooking((com.saltoapis.nebula.booking.v1.CheckInBookingRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking>) responseObserver);
          break;
        case METHODID_CHECK_OUT_BOOKING:
          serviceImpl.checkOutBooking((com.saltoapis.nebula.booking.v1.CheckOutBookingRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.Booking>) responseObserver);
          break;
        case METHODID_CREATE_BOOKING_USER:
          serviceImpl.createBookingUser((com.saltoapis.nebula.booking.v1.CreateBookingUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.BookingUser>) responseObserver);
          break;
        case METHODID_GET_BOOKING_USER:
          serviceImpl.getBookingUser((com.saltoapis.nebula.booking.v1.GetBookingUserRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.BookingUser>) responseObserver);
          break;
        case METHODID_LIST_BOOKING_USERS:
          serviceImpl.listBookingUsers((com.saltoapis.nebula.booking.v1.ListBookingUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.booking.v1.ListBookingUsersResponse>) responseObserver);
          break;
        case METHODID_DELETE_BOOKING_USER:
          serviceImpl.deleteBookingUser((com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest) request,
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
          getCreateBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.CreateBookingRequest,
              com.saltoapis.nebula.booking.v1.Booking>(
                service, METHODID_CREATE_BOOKING)))
        .addMethod(
          getGetBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.GetBookingRequest,
              com.saltoapis.nebula.booking.v1.Booking>(
                service, METHODID_GET_BOOKING)))
        .addMethod(
          getListBookingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.ListBookingsRequest,
              com.saltoapis.nebula.booking.v1.ListBookingsResponse>(
                service, METHODID_LIST_BOOKINGS)))
        .addMethod(
          getUpdateBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.UpdateBookingRequest,
              com.saltoapis.nebula.booking.v1.Booking>(
                service, METHODID_UPDATE_BOOKING)))
        .addMethod(
          getDeleteBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.DeleteBookingRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_BOOKING)))
        .addMethod(
          getCheckInBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.CheckInBookingRequest,
              com.saltoapis.nebula.booking.v1.Booking>(
                service, METHODID_CHECK_IN_BOOKING)))
        .addMethod(
          getCheckOutBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.CheckOutBookingRequest,
              com.saltoapis.nebula.booking.v1.Booking>(
                service, METHODID_CHECK_OUT_BOOKING)))
        .addMethod(
          getCreateBookingUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.CreateBookingUserRequest,
              com.saltoapis.nebula.booking.v1.BookingUser>(
                service, METHODID_CREATE_BOOKING_USER)))
        .addMethod(
          getGetBookingUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.GetBookingUserRequest,
              com.saltoapis.nebula.booking.v1.BookingUser>(
                service, METHODID_GET_BOOKING_USER)))
        .addMethod(
          getListBookingUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.ListBookingUsersRequest,
              com.saltoapis.nebula.booking.v1.ListBookingUsersResponse>(
                service, METHODID_LIST_BOOKING_USERS)))
        .addMethod(
          getDeleteBookingUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.booking.v1.DeleteBookingUserRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_BOOKING_USER)))
        .build();
  }

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.booking.v1.BookingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
              .addMethod(getCreateBookingMethod())
              .addMethod(getGetBookingMethod())
              .addMethod(getListBookingsMethod())
              .addMethod(getUpdateBookingMethod())
              .addMethod(getDeleteBookingMethod())
              .addMethod(getCheckInBookingMethod())
              .addMethod(getCheckOutBookingMethod())
              .addMethod(getCreateBookingUserMethod())
              .addMethod(getGetBookingUserMethod())
              .addMethod(getListBookingUsersMethod())
              .addMethod(getDeleteBookingUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
