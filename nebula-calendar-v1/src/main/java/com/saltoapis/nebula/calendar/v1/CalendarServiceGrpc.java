package com.saltoapis.nebula.calendar.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The calendar functionality defines your organization's working calendar.
 * For example, you can define public holidays, company holidays and company
 * shutdowns. This service is responsible for managing calendar resources.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: salto/nebula/calendar/v1/calendar.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalendarServiceGrpc {

  private CalendarServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "salto.nebula.calendar.v1.CalendarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.CreateCalendarRequest,
      com.saltoapis.nebula.calendar.v1.Calendar> getCreateCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCalendar",
      requestType = com.saltoapis.nebula.calendar.v1.CreateCalendarRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.Calendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.CreateCalendarRequest,
      com.saltoapis.nebula.calendar.v1.Calendar> getCreateCalendarMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.CreateCalendarRequest, com.saltoapis.nebula.calendar.v1.Calendar> getCreateCalendarMethod;
    if ((getCreateCalendarMethod = CalendarServiceGrpc.getCreateCalendarMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getCreateCalendarMethod = CalendarServiceGrpc.getCreateCalendarMethod) == null) {
          CalendarServiceGrpc.getCreateCalendarMethod = getCreateCalendarMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.CreateCalendarRequest, com.saltoapis.nebula.calendar.v1.Calendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.CreateCalendarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.Calendar.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("CreateCalendar"))
              .build();
        }
      }
    }
    return getCreateCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.GetCalendarRequest,
      com.saltoapis.nebula.calendar.v1.Calendar> getGetCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCalendar",
      requestType = com.saltoapis.nebula.calendar.v1.GetCalendarRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.Calendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.GetCalendarRequest,
      com.saltoapis.nebula.calendar.v1.Calendar> getGetCalendarMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.GetCalendarRequest, com.saltoapis.nebula.calendar.v1.Calendar> getGetCalendarMethod;
    if ((getGetCalendarMethod = CalendarServiceGrpc.getGetCalendarMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getGetCalendarMethod = CalendarServiceGrpc.getGetCalendarMethod) == null) {
          CalendarServiceGrpc.getGetCalendarMethod = getGetCalendarMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.GetCalendarRequest, com.saltoapis.nebula.calendar.v1.Calendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.GetCalendarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.Calendar.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("GetCalendar"))
              .build();
        }
      }
    }
    return getGetCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.ListCalendarsRequest,
      com.saltoapis.nebula.calendar.v1.ListCalendarsResponse> getListCalendarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCalendars",
      requestType = com.saltoapis.nebula.calendar.v1.ListCalendarsRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.ListCalendarsRequest,
      com.saltoapis.nebula.calendar.v1.ListCalendarsResponse> getListCalendarsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.ListCalendarsRequest, com.saltoapis.nebula.calendar.v1.ListCalendarsResponse> getListCalendarsMethod;
    if ((getListCalendarsMethod = CalendarServiceGrpc.getListCalendarsMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getListCalendarsMethod = CalendarServiceGrpc.getListCalendarsMethod) == null) {
          CalendarServiceGrpc.getListCalendarsMethod = getListCalendarsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.ListCalendarsRequest, com.saltoapis.nebula.calendar.v1.ListCalendarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCalendars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.ListCalendarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("ListCalendars"))
              .build();
        }
      }
    }
    return getListCalendarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest,
      com.saltoapis.nebula.calendar.v1.Calendar> getUpdateCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCalendar",
      requestType = com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.Calendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest,
      com.saltoapis.nebula.calendar.v1.Calendar> getUpdateCalendarMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest, com.saltoapis.nebula.calendar.v1.Calendar> getUpdateCalendarMethod;
    if ((getUpdateCalendarMethod = CalendarServiceGrpc.getUpdateCalendarMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getUpdateCalendarMethod = CalendarServiceGrpc.getUpdateCalendarMethod) == null) {
          CalendarServiceGrpc.getUpdateCalendarMethod = getUpdateCalendarMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest, com.saltoapis.nebula.calendar.v1.Calendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.Calendar.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("UpdateCalendar"))
              .build();
        }
      }
    }
    return getUpdateCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest,
      com.google.protobuf.Empty> getDeleteCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCalendar",
      requestType = com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest,
      com.google.protobuf.Empty> getDeleteCalendarMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest, com.google.protobuf.Empty> getDeleteCalendarMethod;
    if ((getDeleteCalendarMethod = CalendarServiceGrpc.getDeleteCalendarMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getDeleteCalendarMethod = CalendarServiceGrpc.getDeleteCalendarMethod) == null) {
          CalendarServiceGrpc.getDeleteCalendarMethod = getDeleteCalendarMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("DeleteCalendar"))
              .build();
        }
      }
    }
    return getDeleteCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.CreateEventRequest,
      com.saltoapis.nebula.calendar.v1.Event> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = com.saltoapis.nebula.calendar.v1.CreateEventRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.CreateEventRequest,
      com.saltoapis.nebula.calendar.v1.Event> getCreateEventMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.CreateEventRequest, com.saltoapis.nebula.calendar.v1.Event> getCreateEventMethod;
    if ((getCreateEventMethod = CalendarServiceGrpc.getCreateEventMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getCreateEventMethod = CalendarServiceGrpc.getCreateEventMethod) == null) {
          CalendarServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.CreateEventRequest, com.saltoapis.nebula.calendar.v1.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.Event.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.GetEventRequest,
      com.saltoapis.nebula.calendar.v1.Event> getGetEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvent",
      requestType = com.saltoapis.nebula.calendar.v1.GetEventRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.GetEventRequest,
      com.saltoapis.nebula.calendar.v1.Event> getGetEventMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.GetEventRequest, com.saltoapis.nebula.calendar.v1.Event> getGetEventMethod;
    if ((getGetEventMethod = CalendarServiceGrpc.getGetEventMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getGetEventMethod = CalendarServiceGrpc.getGetEventMethod) == null) {
          CalendarServiceGrpc.getGetEventMethod = getGetEventMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.GetEventRequest, com.saltoapis.nebula.calendar.v1.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.GetEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.Event.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("GetEvent"))
              .build();
        }
      }
    }
    return getGetEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.ListEventsRequest,
      com.saltoapis.nebula.calendar.v1.ListEventsResponse> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvents",
      requestType = com.saltoapis.nebula.calendar.v1.ListEventsRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.ListEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.ListEventsRequest,
      com.saltoapis.nebula.calendar.v1.ListEventsResponse> getListEventsMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.ListEventsRequest, com.saltoapis.nebula.calendar.v1.ListEventsResponse> getListEventsMethod;
    if ((getListEventsMethod = CalendarServiceGrpc.getListEventsMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getListEventsMethod = CalendarServiceGrpc.getListEventsMethod) == null) {
          CalendarServiceGrpc.getListEventsMethod = getListEventsMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.ListEventsRequest, com.saltoapis.nebula.calendar.v1.ListEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.ListEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.ListEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("ListEvents"))
              .build();
        }
      }
    }
    return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.UpdateEventRequest,
      com.saltoapis.nebula.calendar.v1.Event> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvent",
      requestType = com.saltoapis.nebula.calendar.v1.UpdateEventRequest.class,
      responseType = com.saltoapis.nebula.calendar.v1.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.UpdateEventRequest,
      com.saltoapis.nebula.calendar.v1.Event> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.UpdateEventRequest, com.saltoapis.nebula.calendar.v1.Event> getUpdateEventMethod;
    if ((getUpdateEventMethod = CalendarServiceGrpc.getUpdateEventMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getUpdateEventMethod = CalendarServiceGrpc.getUpdateEventMethod) == null) {
          CalendarServiceGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.UpdateEventRequest, com.saltoapis.nebula.calendar.v1.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.UpdateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.Event.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("UpdateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.DeleteEventRequest,
      com.google.protobuf.Empty> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvent",
      requestType = com.saltoapis.nebula.calendar.v1.DeleteEventRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.DeleteEventRequest,
      com.google.protobuf.Empty> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<com.saltoapis.nebula.calendar.v1.DeleteEventRequest, com.google.protobuf.Empty> getDeleteEventMethod;
    if ((getDeleteEventMethod = CalendarServiceGrpc.getDeleteEventMethod) == null) {
      synchronized (CalendarServiceGrpc.class) {
        if ((getDeleteEventMethod = CalendarServiceGrpc.getDeleteEventMethod) == null) {
          CalendarServiceGrpc.getDeleteEventMethod = getDeleteEventMethod =
              io.grpc.MethodDescriptor.<com.saltoapis.nebula.calendar.v1.DeleteEventRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saltoapis.nebula.calendar.v1.DeleteEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CalendarServiceMethodDescriptorSupplier("DeleteEvent"))
              .build();
        }
      }
    }
    return getDeleteEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalendarServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalendarServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalendarServiceStub>() {
        @java.lang.Override
        public CalendarServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalendarServiceStub(channel, callOptions);
        }
      };
    return CalendarServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalendarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalendarServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalendarServiceBlockingStub>() {
        @java.lang.Override
        public CalendarServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalendarServiceBlockingStub(channel, callOptions);
        }
      };
    return CalendarServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalendarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalendarServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalendarServiceFutureStub>() {
        @java.lang.Override
        public CalendarServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalendarServiceFutureStub(channel, callOptions);
        }
      };
    return CalendarServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The calendar functionality defines your organization's working calendar.
   * For example, you can define public holidays, company holidays and company
   * shutdowns. This service is responsible for managing calendar resources.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a calendar
     * Creates a calendar.
     * </pre>
     */
    default void createCalendar(com.saltoapis.nebula.calendar.v1.CreateCalendarRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCalendarMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a calendar
     * Gets an existing calendar.
     * </pre>
     */
    default void getCalendar(com.saltoapis.nebula.calendar.v1.GetCalendarRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCalendarMethod(), responseObserver);
    }

    /**
     * <pre>
     * List calendars
     * Returns a list of calendars that have been previously created.
     * </pre>
     */
    default void listCalendars(com.saltoapis.nebula.calendar.v1.ListCalendarsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.ListCalendarsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCalendarsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a calendar
     * Updates an existing calendar.
     * </pre>
     */
    default void updateCalendar(com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCalendarMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a calendar
     * Permanently deletes a calendar. This cannot be undone.
     * </pre>
     */
    default void deleteCalendar(com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCalendarMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a calendar event
     * Creates a calendar event.
     * </pre>
     */
    default void createEvent(com.saltoapis.nebula.calendar.v1.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a calendar event
     * Gets an existing calendar event.
     * </pre>
     */
    default void getEvent(com.saltoapis.nebula.calendar.v1.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * List calendar events
     * Lists existing calendar events.
     * </pre>
     */
    default void listEvents(com.saltoapis.nebula.calendar.v1.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.ListEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a calendar event
     * Updates an existing calendar event.
     * </pre>
     */
    default void updateEvent(com.saltoapis.nebula.calendar.v1.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a calendar event
     * Permanently deletes a calendar event. This cannot be undone.
     * </pre>
     */
    default void deleteEvent(com.saltoapis.nebula.calendar.v1.DeleteEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CalendarService.
   * <pre>
   * The calendar functionality defines your organization's working calendar.
   * For example, you can define public holidays, company holidays and company
   * shutdowns. This service is responsible for managing calendar resources.
   * </pre>
   */
  public static abstract class CalendarServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CalendarServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CalendarService.
   * <pre>
   * The calendar functionality defines your organization's working calendar.
   * For example, you can define public holidays, company holidays and company
   * shutdowns. This service is responsible for managing calendar resources.
   * </pre>
   */
  public static final class CalendarServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CalendarServiceStub> {
    private CalendarServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalendarServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalendarServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a calendar
     * Creates a calendar.
     * </pre>
     */
    public void createCalendar(com.saltoapis.nebula.calendar.v1.CreateCalendarRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a calendar
     * Gets an existing calendar.
     * </pre>
     */
    public void getCalendar(com.saltoapis.nebula.calendar.v1.GetCalendarRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List calendars
     * Returns a list of calendars that have been previously created.
     * </pre>
     */
    public void listCalendars(com.saltoapis.nebula.calendar.v1.ListCalendarsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.ListCalendarsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCalendarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a calendar
     * Updates an existing calendar.
     * </pre>
     */
    public void updateCalendar(com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a calendar
     * Permanently deletes a calendar. This cannot be undone.
     * </pre>
     */
    public void deleteCalendar(com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a calendar event
     * Creates a calendar event.
     * </pre>
     */
    public void createEvent(com.saltoapis.nebula.calendar.v1.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a calendar event
     * Gets an existing calendar event.
     * </pre>
     */
    public void getEvent(com.saltoapis.nebula.calendar.v1.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List calendar events
     * Lists existing calendar events.
     * </pre>
     */
    public void listEvents(com.saltoapis.nebula.calendar.v1.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.ListEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a calendar event
     * Updates an existing calendar event.
     * </pre>
     */
    public void updateEvent(com.saltoapis.nebula.calendar.v1.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a calendar event
     * Permanently deletes a calendar event. This cannot be undone.
     * </pre>
     */
    public void deleteEvent(com.saltoapis.nebula.calendar.v1.DeleteEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CalendarService.
   * <pre>
   * The calendar functionality defines your organization's working calendar.
   * For example, you can define public holidays, company holidays and company
   * shutdowns. This service is responsible for managing calendar resources.
   * </pre>
   */
  public static final class CalendarServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CalendarServiceBlockingStub> {
    private CalendarServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalendarServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalendarServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a calendar
     * Creates a calendar.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar createCalendar(com.saltoapis.nebula.calendar.v1.CreateCalendarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCalendarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a calendar
     * Gets an existing calendar.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar getCalendar(com.saltoapis.nebula.calendar.v1.GetCalendarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCalendarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List calendars
     * Returns a list of calendars that have been previously created.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.ListCalendarsResponse listCalendars(com.saltoapis.nebula.calendar.v1.ListCalendarsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCalendarsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a calendar
     * Updates an existing calendar.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar updateCalendar(com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCalendarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a calendar
     * Permanently deletes a calendar. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteCalendar(com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCalendarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a calendar event
     * Creates a calendar event.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.Event createEvent(com.saltoapis.nebula.calendar.v1.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a calendar event
     * Gets an existing calendar event.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.Event getEvent(com.saltoapis.nebula.calendar.v1.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List calendar events
     * Lists existing calendar events.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.ListEventsResponse listEvents(com.saltoapis.nebula.calendar.v1.ListEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a calendar event
     * Updates an existing calendar event.
     * </pre>
     */
    public com.saltoapis.nebula.calendar.v1.Event updateEvent(com.saltoapis.nebula.calendar.v1.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a calendar event
     * Permanently deletes a calendar event. This cannot be undone.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEvent(com.saltoapis.nebula.calendar.v1.DeleteEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CalendarService.
   * <pre>
   * The calendar functionality defines your organization's working calendar.
   * For example, you can define public holidays, company holidays and company
   * shutdowns. This service is responsible for managing calendar resources.
   * </pre>
   */
  public static final class CalendarServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CalendarServiceFutureStub> {
    private CalendarServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalendarServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalendarServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a calendar
     * Creates a calendar.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.Calendar> createCalendar(
        com.saltoapis.nebula.calendar.v1.CreateCalendarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCalendarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a calendar
     * Gets an existing calendar.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.Calendar> getCalendar(
        com.saltoapis.nebula.calendar.v1.GetCalendarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCalendarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List calendars
     * Returns a list of calendars that have been previously created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.ListCalendarsResponse> listCalendars(
        com.saltoapis.nebula.calendar.v1.ListCalendarsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCalendarsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a calendar
     * Updates an existing calendar.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.Calendar> updateCalendar(
        com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCalendarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a calendar
     * Permanently deletes a calendar. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCalendar(
        com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCalendarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a calendar event
     * Creates a calendar event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.Event> createEvent(
        com.saltoapis.nebula.calendar.v1.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a calendar event
     * Gets an existing calendar event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.Event> getEvent(
        com.saltoapis.nebula.calendar.v1.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List calendar events
     * Lists existing calendar events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.ListEventsResponse> listEvents(
        com.saltoapis.nebula.calendar.v1.ListEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a calendar event
     * Updates an existing calendar event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saltoapis.nebula.calendar.v1.Event> updateEvent(
        com.saltoapis.nebula.calendar.v1.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a calendar event
     * Permanently deletes a calendar event. This cannot be undone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEvent(
        com.saltoapis.nebula.calendar.v1.DeleteEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CALENDAR = 0;
  private static final int METHODID_GET_CALENDAR = 1;
  private static final int METHODID_LIST_CALENDARS = 2;
  private static final int METHODID_UPDATE_CALENDAR = 3;
  private static final int METHODID_DELETE_CALENDAR = 4;
  private static final int METHODID_CREATE_EVENT = 5;
  private static final int METHODID_GET_EVENT = 6;
  private static final int METHODID_LIST_EVENTS = 7;
  private static final int METHODID_UPDATE_EVENT = 8;
  private static final int METHODID_DELETE_EVENT = 9;

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
        case METHODID_CREATE_CALENDAR:
          serviceImpl.createCalendar((com.saltoapis.nebula.calendar.v1.CreateCalendarRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar>) responseObserver);
          break;
        case METHODID_GET_CALENDAR:
          serviceImpl.getCalendar((com.saltoapis.nebula.calendar.v1.GetCalendarRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar>) responseObserver);
          break;
        case METHODID_LIST_CALENDARS:
          serviceImpl.listCalendars((com.saltoapis.nebula.calendar.v1.ListCalendarsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.ListCalendarsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CALENDAR:
          serviceImpl.updateCalendar((com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Calendar>) responseObserver);
          break;
        case METHODID_DELETE_CALENDAR:
          serviceImpl.deleteCalendar((com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.saltoapis.nebula.calendar.v1.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((com.saltoapis.nebula.calendar.v1.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event>) responseObserver);
          break;
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((com.saltoapis.nebula.calendar.v1.ListEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.ListEventsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((com.saltoapis.nebula.calendar.v1.UpdateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.saltoapis.nebula.calendar.v1.Event>) responseObserver);
          break;
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((com.saltoapis.nebula.calendar.v1.DeleteEventRequest) request,
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
          getCreateCalendarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.CreateCalendarRequest,
              com.saltoapis.nebula.calendar.v1.Calendar>(
                service, METHODID_CREATE_CALENDAR)))
        .addMethod(
          getGetCalendarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.GetCalendarRequest,
              com.saltoapis.nebula.calendar.v1.Calendar>(
                service, METHODID_GET_CALENDAR)))
        .addMethod(
          getListCalendarsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.ListCalendarsRequest,
              com.saltoapis.nebula.calendar.v1.ListCalendarsResponse>(
                service, METHODID_LIST_CALENDARS)))
        .addMethod(
          getUpdateCalendarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.UpdateCalendarRequest,
              com.saltoapis.nebula.calendar.v1.Calendar>(
                service, METHODID_UPDATE_CALENDAR)))
        .addMethod(
          getDeleteCalendarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.DeleteCalendarRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CALENDAR)))
        .addMethod(
          getCreateEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.CreateEventRequest,
              com.saltoapis.nebula.calendar.v1.Event>(
                service, METHODID_CREATE_EVENT)))
        .addMethod(
          getGetEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.GetEventRequest,
              com.saltoapis.nebula.calendar.v1.Event>(
                service, METHODID_GET_EVENT)))
        .addMethod(
          getListEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.ListEventsRequest,
              com.saltoapis.nebula.calendar.v1.ListEventsResponse>(
                service, METHODID_LIST_EVENTS)))
        .addMethod(
          getUpdateEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.UpdateEventRequest,
              com.saltoapis.nebula.calendar.v1.Event>(
                service, METHODID_UPDATE_EVENT)))
        .addMethod(
          getDeleteEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.saltoapis.nebula.calendar.v1.DeleteEventRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EVENT)))
        .build();
  }

  private static abstract class CalendarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalendarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalendarService");
    }
  }

  private static final class CalendarServiceFileDescriptorSupplier
      extends CalendarServiceBaseDescriptorSupplier {
    CalendarServiceFileDescriptorSupplier() {}
  }

  private static final class CalendarServiceMethodDescriptorSupplier
      extends CalendarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CalendarServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CalendarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalendarServiceFileDescriptorSupplier())
              .addMethod(getCreateCalendarMethod())
              .addMethod(getGetCalendarMethod())
              .addMethod(getListCalendarsMethod())
              .addMethod(getUpdateCalendarMethod())
              .addMethod(getDeleteCalendarMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getGetEventMethod())
              .addMethod(getListEventsMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getDeleteEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
