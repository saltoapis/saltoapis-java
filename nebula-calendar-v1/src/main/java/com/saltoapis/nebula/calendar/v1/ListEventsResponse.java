// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/calendar/v1/calendar.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.calendar.v1;

/**
 * <pre>
 * The response message for [`ListEvent`][salto.nebula.calendar.v1.CalendarService.ListEvent]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.calendar.v1.ListEventsResponse}
 */
public final class ListEventsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.calendar.v1.ListEventsResponse)
    ListEventsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListEventsResponse.class.getName());
  }
  // Use ListEventsResponse.newBuilder() to construct.
  private ListEventsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListEventsResponse() {
    events_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.calendar.v1.ListEventsResponse.class, com.saltoapis.nebula.calendar.v1.ListEventsResponse.Builder.class);
  }

  public static final int EVENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.calendar.v1.Event> events_;
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items
   * returned based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.calendar.v1.Event> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items
   * returned based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.calendar.v1.EventOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items
   * returned based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items
   * returned based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.calendar.v1.Event getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `events` in the method name. There
   * will be a maximum number of items
   * returned based on the `page_size` field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.calendar.v1.EventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(1, events_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, events_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.saltoapis.nebula.calendar.v1.ListEventsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.calendar.v1.ListEventsResponse other = (com.saltoapis.nebula.calendar.v1.ListEventsResponse) obj;

    if (!getEventsList()
        .equals(other.getEventsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.calendar.v1.ListEventsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response message for [`ListEvent`][salto.nebula.calendar.v1.CalendarService.ListEvent]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.calendar.v1.ListEventsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.calendar.v1.ListEventsResponse)
      com.saltoapis.nebula.calendar.v1.ListEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.calendar.v1.ListEventsResponse.class, com.saltoapis.nebula.calendar.v1.ListEventsResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.calendar.v1.ListEventsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListEventsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.calendar.v1.ListEventsResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.calendar.v1.ListEventsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.calendar.v1.ListEventsResponse build() {
      com.saltoapis.nebula.calendar.v1.ListEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.calendar.v1.ListEventsResponse buildPartial() {
      com.saltoapis.nebula.calendar.v1.ListEventsResponse result = new com.saltoapis.nebula.calendar.v1.ListEventsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.calendar.v1.ListEventsResponse result) {
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.calendar.v1.ListEventsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.calendar.v1.ListEventsResponse) {
        return mergeFrom((com.saltoapis.nebula.calendar.v1.ListEventsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.calendar.v1.ListEventsResponse other) {
      if (other == com.saltoapis.nebula.calendar.v1.ListEventsResponse.getDefaultInstance()) return this;
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.saltoapis.nebula.calendar.v1.Event m =
                  input.readMessage(
                      com.saltoapis.nebula.calendar.v1.Event.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.saltoapis.nebula.calendar.v1.Event> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new java.util.ArrayList<com.saltoapis.nebula.calendar.v1.Event>(events_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.calendar.v1.Event, com.saltoapis.nebula.calendar.v1.Event.Builder, com.saltoapis.nebula.calendar.v1.EventOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.calendar.v1.Event> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Event getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder setEvents(
        int index, com.saltoapis.nebula.calendar.v1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder setEvents(
        int index, com.saltoapis.nebula.calendar.v1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder addEvents(com.saltoapis.nebula.calendar.v1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder addEvents(
        int index, com.saltoapis.nebula.calendar.v1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder addEvents(
        com.saltoapis.nebula.calendar.v1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder addEvents(
        int index, com.saltoapis.nebula.calendar.v1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends com.saltoapis.nebula.calendar.v1.Event> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Event.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.EventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.calendar.v1.EventOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Event.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          com.saltoapis.nebula.calendar.v1.Event.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Event.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.calendar.v1.Event.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `events` in the method name. There
     * will be a maximum number of items
     * returned based on the `page_size` field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Event events = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.calendar.v1.Event.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.calendar.v1.Event, com.saltoapis.nebula.calendar.v1.Event.Builder, com.saltoapis.nebula.calendar.v1.EventOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.calendar.v1.Event, com.saltoapis.nebula.calendar.v1.Event.Builder, com.saltoapis.nebula.calendar.v1.EventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.calendar.v1.ListEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.calendar.v1.ListEventsResponse)
  private static final com.saltoapis.nebula.calendar.v1.ListEventsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.calendar.v1.ListEventsResponse();
  }

  public static com.saltoapis.nebula.calendar.v1.ListEventsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEventsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListEventsResponse>() {
    @java.lang.Override
    public ListEventsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.calendar.v1.ListEventsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

