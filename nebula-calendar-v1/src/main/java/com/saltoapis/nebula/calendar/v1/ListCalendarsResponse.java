// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/calendar/v1/calendar.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.calendar.v1;

/**
 * <pre>
 * The response message for [`ListCalendars`][salto.nebula.calendar.v1.CalendarService.ListCalendars]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.calendar.v1.ListCalendarsResponse}
 */
public final class ListCalendarsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.calendar.v1.ListCalendarsResponse)
    ListCalendarsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      ListCalendarsResponse.class.getName());
  }
  // Use ListCalendarsResponse.newBuilder() to construct.
  private ListCalendarsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListCalendarsResponse() {
    calendars_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.class, com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.Builder.class);
  }

  public static final int CALENDARS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.calendar.v1.Calendar> calendars_;
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.calendar.v1.Calendar> getCalendarsList() {
    return calendars_;
  }
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.saltoapis.nebula.calendar.v1.CalendarOrBuilder> 
      getCalendarsOrBuilderList() {
    return calendars_;
  }
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  @java.lang.Override
  public int getCalendarsCount() {
    return calendars_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.calendar.v1.Calendar getCalendars(int index) {
    return calendars_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `calendars` in the method name.
   * There will be a maximum number of items returned based on the `page_size`
   * field in the request.
   * </pre>
   *
   * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.calendar.v1.CalendarOrBuilder getCalendarsOrBuilder(
      int index) {
    return calendars_.get(index);
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
    for (int i = 0; i < calendars_.size(); i++) {
      output.writeMessage(1, calendars_.get(i));
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
    for (int i = 0; i < calendars_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, calendars_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.calendar.v1.ListCalendarsResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.calendar.v1.ListCalendarsResponse other = (com.saltoapis.nebula.calendar.v1.ListCalendarsResponse) obj;

    if (!getCalendarsList()
        .equals(other.getCalendarsList())) return false;
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
    if (getCalendarsCount() > 0) {
      hash = (37 * hash) + CALENDARS_FIELD_NUMBER;
      hash = (53 * hash) + getCalendarsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.calendar.v1.ListCalendarsResponse prototype) {
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
   * The response message for [`ListCalendars`][salto.nebula.calendar.v1.CalendarService.ListCalendars]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.calendar.v1.ListCalendarsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.calendar.v1.ListCalendarsResponse)
      com.saltoapis.nebula.calendar.v1.ListCalendarsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.class, com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.newBuilder()
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
      if (calendarsBuilder_ == null) {
        calendars_ = java.util.Collections.emptyList();
      } else {
        calendars_ = null;
        calendarsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.calendar.v1.CalendarProto.internal_static_salto_nebula_calendar_v1_ListCalendarsResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.calendar.v1.ListCalendarsResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.calendar.v1.ListCalendarsResponse build() {
      com.saltoapis.nebula.calendar.v1.ListCalendarsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.calendar.v1.ListCalendarsResponse buildPartial() {
      com.saltoapis.nebula.calendar.v1.ListCalendarsResponse result = new com.saltoapis.nebula.calendar.v1.ListCalendarsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.calendar.v1.ListCalendarsResponse result) {
      if (calendarsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          calendars_ = java.util.Collections.unmodifiableList(calendars_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.calendars_ = calendars_;
      } else {
        result.calendars_ = calendarsBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.calendar.v1.ListCalendarsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.calendar.v1.ListCalendarsResponse) {
        return mergeFrom((com.saltoapis.nebula.calendar.v1.ListCalendarsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.calendar.v1.ListCalendarsResponse other) {
      if (other == com.saltoapis.nebula.calendar.v1.ListCalendarsResponse.getDefaultInstance()) return this;
      if (calendarsBuilder_ == null) {
        if (!other.calendars_.isEmpty()) {
          if (calendars_.isEmpty()) {
            calendars_ = other.calendars_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCalendarsIsMutable();
            calendars_.addAll(other.calendars_);
          }
          onChanged();
        }
      } else {
        if (!other.calendars_.isEmpty()) {
          if (calendarsBuilder_.isEmpty()) {
            calendarsBuilder_.dispose();
            calendarsBuilder_ = null;
            calendars_ = other.calendars_;
            bitField0_ = (bitField0_ & ~0x00000001);
            calendarsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCalendarsFieldBuilder() : null;
          } else {
            calendarsBuilder_.addAllMessages(other.calendars_);
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
              com.saltoapis.nebula.calendar.v1.Calendar m =
                  input.readMessage(
                      com.saltoapis.nebula.calendar.v1.Calendar.parser(),
                      extensionRegistry);
              if (calendarsBuilder_ == null) {
                ensureCalendarsIsMutable();
                calendars_.add(m);
              } else {
                calendarsBuilder_.addMessage(m);
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

    private java.util.List<com.saltoapis.nebula.calendar.v1.Calendar> calendars_ =
      java.util.Collections.emptyList();
    private void ensureCalendarsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        calendars_ = new java.util.ArrayList<com.saltoapis.nebula.calendar.v1.Calendar>(calendars_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.calendar.v1.Calendar, com.saltoapis.nebula.calendar.v1.Calendar.Builder, com.saltoapis.nebula.calendar.v1.CalendarOrBuilder> calendarsBuilder_;

    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.calendar.v1.Calendar> getCalendarsList() {
      if (calendarsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(calendars_);
      } else {
        return calendarsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public int getCalendarsCount() {
      if (calendarsBuilder_ == null) {
        return calendars_.size();
      } else {
        return calendarsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar getCalendars(int index) {
      if (calendarsBuilder_ == null) {
        return calendars_.get(index);
      } else {
        return calendarsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder setCalendars(
        int index, com.saltoapis.nebula.calendar.v1.Calendar value) {
      if (calendarsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCalendarsIsMutable();
        calendars_.set(index, value);
        onChanged();
      } else {
        calendarsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder setCalendars(
        int index, com.saltoapis.nebula.calendar.v1.Calendar.Builder builderForValue) {
      if (calendarsBuilder_ == null) {
        ensureCalendarsIsMutable();
        calendars_.set(index, builderForValue.build());
        onChanged();
      } else {
        calendarsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder addCalendars(com.saltoapis.nebula.calendar.v1.Calendar value) {
      if (calendarsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCalendarsIsMutable();
        calendars_.add(value);
        onChanged();
      } else {
        calendarsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder addCalendars(
        int index, com.saltoapis.nebula.calendar.v1.Calendar value) {
      if (calendarsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCalendarsIsMutable();
        calendars_.add(index, value);
        onChanged();
      } else {
        calendarsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder addCalendars(
        com.saltoapis.nebula.calendar.v1.Calendar.Builder builderForValue) {
      if (calendarsBuilder_ == null) {
        ensureCalendarsIsMutable();
        calendars_.add(builderForValue.build());
        onChanged();
      } else {
        calendarsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder addCalendars(
        int index, com.saltoapis.nebula.calendar.v1.Calendar.Builder builderForValue) {
      if (calendarsBuilder_ == null) {
        ensureCalendarsIsMutable();
        calendars_.add(index, builderForValue.build());
        onChanged();
      } else {
        calendarsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder addAllCalendars(
        java.lang.Iterable<? extends com.saltoapis.nebula.calendar.v1.Calendar> values) {
      if (calendarsBuilder_ == null) {
        ensureCalendarsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, calendars_);
        onChanged();
      } else {
        calendarsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder clearCalendars() {
      if (calendarsBuilder_ == null) {
        calendars_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        calendarsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public Builder removeCalendars(int index) {
      if (calendarsBuilder_ == null) {
        ensureCalendarsIsMutable();
        calendars_.remove(index);
        onChanged();
      } else {
        calendarsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar.Builder getCalendarsBuilder(
        int index) {
      return getCalendarsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.CalendarOrBuilder getCalendarsOrBuilder(
        int index) {
      if (calendarsBuilder_ == null) {
        return calendars_.get(index);  } else {
        return calendarsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public java.util.List<? extends com.saltoapis.nebula.calendar.v1.CalendarOrBuilder> 
         getCalendarsOrBuilderList() {
      if (calendarsBuilder_ != null) {
        return calendarsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(calendars_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar.Builder addCalendarsBuilder() {
      return getCalendarsFieldBuilder().addBuilder(
          com.saltoapis.nebula.calendar.v1.Calendar.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public com.saltoapis.nebula.calendar.v1.Calendar.Builder addCalendarsBuilder(
        int index) {
      return getCalendarsFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.calendar.v1.Calendar.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `calendars` in the method name.
     * There will be a maximum number of items returned based on the `page_size`
     * field in the request.
     * </pre>
     *
     * <code>repeated .salto.nebula.calendar.v1.Calendar calendars = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.calendar.v1.Calendar.Builder> 
         getCalendarsBuilderList() {
      return getCalendarsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.calendar.v1.Calendar, com.saltoapis.nebula.calendar.v1.Calendar.Builder, com.saltoapis.nebula.calendar.v1.CalendarOrBuilder> 
        getCalendarsFieldBuilder() {
      if (calendarsBuilder_ == null) {
        calendarsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.calendar.v1.Calendar, com.saltoapis.nebula.calendar.v1.Calendar.Builder, com.saltoapis.nebula.calendar.v1.CalendarOrBuilder>(
                calendars_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        calendars_ = null;
      }
      return calendarsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:salto.nebula.calendar.v1.ListCalendarsResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.calendar.v1.ListCalendarsResponse)
  private static final com.saltoapis.nebula.calendar.v1.ListCalendarsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.calendar.v1.ListCalendarsResponse();
  }

  public static com.saltoapis.nebula.calendar.v1.ListCalendarsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCalendarsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCalendarsResponse>() {
    @java.lang.Override
    public ListCalendarsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCalendarsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCalendarsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.calendar.v1.ListCalendarsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

