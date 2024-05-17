// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.installation.v1;

/**
 * <pre>
 * (-- api-linter: core::0158::response-next-page-token-field=disabled
 *     aip.dev/not-precedent: We need to do this because there is no paging yet. --)
 * The response message for [`ListInvoices`][salto.nebula.installation.v1.InstallationService.ListInvoices]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.installation.v1.ListInvoicesResponse}
 */
public  final class ListInvoicesResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListInvoicesResponse, ListInvoicesResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:salto.nebula.installation.v1.ListInvoicesResponse)
    ListInvoicesResponseOrBuilder {
  private ListInvoicesResponse() {
    invoices_ = emptyProtobufList();
  }
  public static final int INVOICES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.saltoapis.nebula.installation.v1.Invoice> invoices_;
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.saltoapis.nebula.installation.v1.Invoice> getInvoicesList() {
    return invoices_;
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  public java.util.List<? extends com.saltoapis.nebula.installation.v1.InvoiceOrBuilder> 
      getInvoicesOrBuilderList() {
    return invoices_;
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public int getInvoicesCount() {
    return invoices_.size();
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  @java.lang.Override
  public com.saltoapis.nebula.installation.v1.Invoice getInvoices(int index) {
    return invoices_.get(index);
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  public com.saltoapis.nebula.installation.v1.InvoiceOrBuilder getInvoicesOrBuilder(
      int index) {
    return invoices_.get(index);
  }
  private void ensureInvoicesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.saltoapis.nebula.installation.v1.Invoice> tmp = invoices_;
    if (!tmp.isModifiable()) {
      invoices_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  private void setInvoices(
      int index, com.saltoapis.nebula.installation.v1.Invoice value) {
    value.getClass();
  ensureInvoicesIsMutable();
    invoices_.set(index, value);
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  private void addInvoices(com.saltoapis.nebula.installation.v1.Invoice value) {
    value.getClass();
  ensureInvoicesIsMutable();
    invoices_.add(value);
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  private void addInvoices(
      int index, com.saltoapis.nebula.installation.v1.Invoice value) {
    value.getClass();
  ensureInvoicesIsMutable();
    invoices_.add(index, value);
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  private void addAllInvoices(
      java.lang.Iterable<? extends com.saltoapis.nebula.installation.v1.Invoice> values) {
    ensureInvoicesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, invoices_);
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  private void clearInvoices() {
    invoices_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The field name should match the noun `invoices` in the method name.
   * </pre>
   *
   * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
   */
  private void removeInvoices(int index) {
    ensureInvoicesIsMutable();
    invoices_.remove(index);
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.saltoapis.nebula.installation.v1.ListInvoicesResponse prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * (-- api-linter: core::0158::response-next-page-token-field=disabled
   *     aip.dev/not-precedent: We need to do this because there is no paging yet. --)
   * The response message for [`ListInvoices`][salto.nebula.installation.v1.InstallationService.ListInvoices]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.installation.v1.ListInvoicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.saltoapis.nebula.installation.v1.ListInvoicesResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.installation.v1.ListInvoicesResponse)
      com.saltoapis.nebula.installation.v1.ListInvoicesResponseOrBuilder {
    // Construct using com.saltoapis.nebula.installation.v1.ListInvoicesResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.saltoapis.nebula.installation.v1.Invoice> getInvoicesList() {
      return java.util.Collections.unmodifiableList(
          instance.getInvoicesList());
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    @java.lang.Override
    public int getInvoicesCount() {
      return instance.getInvoicesCount();
    }/**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.Invoice getInvoices(int index) {
      return instance.getInvoices(index);
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder setInvoices(
        int index, com.saltoapis.nebula.installation.v1.Invoice value) {
      copyOnWrite();
      instance.setInvoices(index, value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder setInvoices(
        int index, com.saltoapis.nebula.installation.v1.Invoice.Builder builderForValue) {
      copyOnWrite();
      instance.setInvoices(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(com.saltoapis.nebula.installation.v1.Invoice value) {
      copyOnWrite();
      instance.addInvoices(value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(
        int index, com.saltoapis.nebula.installation.v1.Invoice value) {
      copyOnWrite();
      instance.addInvoices(index, value);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(
        com.saltoapis.nebula.installation.v1.Invoice.Builder builderForValue) {
      copyOnWrite();
      instance.addInvoices(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder addInvoices(
        int index, com.saltoapis.nebula.installation.v1.Invoice.Builder builderForValue) {
      copyOnWrite();
      instance.addInvoices(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder addAllInvoices(
        java.lang.Iterable<? extends com.saltoapis.nebula.installation.v1.Invoice> values) {
      copyOnWrite();
      instance.addAllInvoices(values);
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder clearInvoices() {
      copyOnWrite();
      instance.clearInvoices();
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public Builder removeInvoices(int index) {
      copyOnWrite();
      instance.removeInvoices(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.installation.v1.ListInvoicesResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.saltoapis.nebula.installation.v1.ListInvoicesResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "invoices_",
            com.saltoapis.nebula.installation.v1.Invoice.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.saltoapis.nebula.installation.v1.ListInvoicesResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.saltoapis.nebula.installation.v1.ListInvoicesResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.saltoapis.nebula.installation.v1.ListInvoicesResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:salto.nebula.installation.v1.ListInvoicesResponse)
  private static final com.saltoapis.nebula.installation.v1.ListInvoicesResponse DEFAULT_INSTANCE;
  static {
    ListInvoicesResponse defaultInstance = new ListInvoicesResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListInvoicesResponse.class, defaultInstance);
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListInvoicesResponse> PARSER;

  public static com.google.protobuf.Parser<ListInvoicesResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

