// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.installation.v1;

/**
 * <pre>
 * (-- api-linter: core::0158::response-next-page-token-field=disabled
 * aip.dev/not-precedent: We need to do this because there is no paging yet. --)
 * The response message for [`ListInvoices`][salto.nebula.installation.v1.InstallationService.ListInvoices]
 * </pre>
 *
 * Protobuf type {@code salto.nebula.installation.v1.ListInvoicesResponse}
 */
public final class ListInvoicesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:salto.nebula.installation.v1.ListInvoicesResponse)
    ListInvoicesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ListInvoicesResponse.class.getName());
  }
  // Use ListInvoicesResponse.newBuilder() to construct.
  private ListInvoicesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListInvoicesResponse() {
    invoices_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_ListInvoicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_ListInvoicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saltoapis.nebula.installation.v1.ListInvoicesResponse.class, com.saltoapis.nebula.installation.v1.ListInvoicesResponse.Builder.class);
  }

  public static final int INVOICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.saltoapis.nebula.installation.v1.Invoice> invoices_;
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
  @java.lang.Override
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
  @java.lang.Override
  public com.saltoapis.nebula.installation.v1.InvoiceOrBuilder getInvoicesOrBuilder(
      int index) {
    return invoices_.get(index);
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
    for (int i = 0; i < invoices_.size(); i++) {
      output.writeMessage(1, invoices_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < invoices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, invoices_.get(i));
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
    if (!(obj instanceof com.saltoapis.nebula.installation.v1.ListInvoicesResponse)) {
      return super.equals(obj);
    }
    com.saltoapis.nebula.installation.v1.ListInvoicesResponse other = (com.saltoapis.nebula.installation.v1.ListInvoicesResponse) obj;

    if (!getInvoicesList()
        .equals(other.getInvoicesList())) return false;
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
    if (getInvoicesCount() > 0) {
      hash = (37 * hash) + INVOICES_FIELD_NUMBER;
      hash = (53 * hash) + getInvoicesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse parseFrom(
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
  public static Builder newBuilder(com.saltoapis.nebula.installation.v1.ListInvoicesResponse prototype) {
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
   * (-- api-linter: core::0158::response-next-page-token-field=disabled
   * aip.dev/not-precedent: We need to do this because there is no paging yet. --)
   * The response message for [`ListInvoices`][salto.nebula.installation.v1.InstallationService.ListInvoices]
   * </pre>
   *
   * Protobuf type {@code salto.nebula.installation.v1.ListInvoicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:salto.nebula.installation.v1.ListInvoicesResponse)
      com.saltoapis.nebula.installation.v1.ListInvoicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_ListInvoicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_ListInvoicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saltoapis.nebula.installation.v1.ListInvoicesResponse.class, com.saltoapis.nebula.installation.v1.ListInvoicesResponse.Builder.class);
    }

    // Construct using com.saltoapis.nebula.installation.v1.ListInvoicesResponse.newBuilder()
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
      if (invoicesBuilder_ == null) {
        invoices_ = java.util.Collections.emptyList();
      } else {
        invoices_ = null;
        invoicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saltoapis.nebula.installation.v1.InstallationProto.internal_static_salto_nebula_installation_v1_ListInvoicesResponse_descriptor;
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.ListInvoicesResponse getDefaultInstanceForType() {
      return com.saltoapis.nebula.installation.v1.ListInvoicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.ListInvoicesResponse build() {
      com.saltoapis.nebula.installation.v1.ListInvoicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.saltoapis.nebula.installation.v1.ListInvoicesResponse buildPartial() {
      com.saltoapis.nebula.installation.v1.ListInvoicesResponse result = new com.saltoapis.nebula.installation.v1.ListInvoicesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.saltoapis.nebula.installation.v1.ListInvoicesResponse result) {
      if (invoicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          invoices_ = java.util.Collections.unmodifiableList(invoices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.invoices_ = invoices_;
      } else {
        result.invoices_ = invoicesBuilder_.build();
      }
    }

    private void buildPartial0(com.saltoapis.nebula.installation.v1.ListInvoicesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saltoapis.nebula.installation.v1.ListInvoicesResponse) {
        return mergeFrom((com.saltoapis.nebula.installation.v1.ListInvoicesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saltoapis.nebula.installation.v1.ListInvoicesResponse other) {
      if (other == com.saltoapis.nebula.installation.v1.ListInvoicesResponse.getDefaultInstance()) return this;
      if (invoicesBuilder_ == null) {
        if (!other.invoices_.isEmpty()) {
          if (invoices_.isEmpty()) {
            invoices_ = other.invoices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInvoicesIsMutable();
            invoices_.addAll(other.invoices_);
          }
          onChanged();
        }
      } else {
        if (!other.invoices_.isEmpty()) {
          if (invoicesBuilder_.isEmpty()) {
            invoicesBuilder_.dispose();
            invoicesBuilder_ = null;
            invoices_ = other.invoices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            invoicesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getInvoicesFieldBuilder() : null;
          } else {
            invoicesBuilder_.addAllMessages(other.invoices_);
          }
        }
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
              com.saltoapis.nebula.installation.v1.Invoice m =
                  input.readMessage(
                      com.saltoapis.nebula.installation.v1.Invoice.parser(),
                      extensionRegistry);
              if (invoicesBuilder_ == null) {
                ensureInvoicesIsMutable();
                invoices_.add(m);
              } else {
                invoicesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.saltoapis.nebula.installation.v1.Invoice> invoices_ =
      java.util.Collections.emptyList();
    private void ensureInvoicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        invoices_ = new java.util.ArrayList<com.saltoapis.nebula.installation.v1.Invoice>(invoices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.installation.v1.Invoice, com.saltoapis.nebula.installation.v1.Invoice.Builder, com.saltoapis.nebula.installation.v1.InvoiceOrBuilder> invoicesBuilder_;

    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.installation.v1.Invoice> getInvoicesList() {
      if (invoicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(invoices_);
      } else {
        return invoicesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public int getInvoicesCount() {
      if (invoicesBuilder_ == null) {
        return invoices_.size();
      } else {
        return invoicesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public com.saltoapis.nebula.installation.v1.Invoice getInvoices(int index) {
      if (invoicesBuilder_ == null) {
        return invoices_.get(index);
      } else {
        return invoicesBuilder_.getMessage(index);
      }
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
      if (invoicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvoicesIsMutable();
        invoices_.set(index, value);
        onChanged();
      } else {
        invoicesBuilder_.setMessage(index, value);
      }
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
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.set(index, builderForValue.build());
        onChanged();
      } else {
        invoicesBuilder_.setMessage(index, builderForValue.build());
      }
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
      if (invoicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvoicesIsMutable();
        invoices_.add(value);
        onChanged();
      } else {
        invoicesBuilder_.addMessage(value);
      }
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
      if (invoicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvoicesIsMutable();
        invoices_.add(index, value);
        onChanged();
      } else {
        invoicesBuilder_.addMessage(index, value);
      }
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
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.add(builderForValue.build());
        onChanged();
      } else {
        invoicesBuilder_.addMessage(builderForValue.build());
      }
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
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.add(index, builderForValue.build());
        onChanged();
      } else {
        invoicesBuilder_.addMessage(index, builderForValue.build());
      }
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
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, invoices_);
        onChanged();
      } else {
        invoicesBuilder_.addAllMessages(values);
      }
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
      if (invoicesBuilder_ == null) {
        invoices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        invoicesBuilder_.clear();
      }
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
      if (invoicesBuilder_ == null) {
        ensureInvoicesIsMutable();
        invoices_.remove(index);
        onChanged();
      } else {
        invoicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public com.saltoapis.nebula.installation.v1.Invoice.Builder getInvoicesBuilder(
        int index) {
      return getInvoicesFieldBuilder().getBuilder(index);
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
      if (invoicesBuilder_ == null) {
        return invoices_.get(index);  } else {
        return invoicesBuilder_.getMessageOrBuilder(index);
      }
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
      if (invoicesBuilder_ != null) {
        return invoicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(invoices_);
      }
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public com.saltoapis.nebula.installation.v1.Invoice.Builder addInvoicesBuilder() {
      return getInvoicesFieldBuilder().addBuilder(
          com.saltoapis.nebula.installation.v1.Invoice.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public com.saltoapis.nebula.installation.v1.Invoice.Builder addInvoicesBuilder(
        int index) {
      return getInvoicesFieldBuilder().addBuilder(
          index, com.saltoapis.nebula.installation.v1.Invoice.getDefaultInstance());
    }
    /**
     * <pre>
     * The field name should match the noun `invoices` in the method name.
     * </pre>
     *
     * <code>repeated .salto.nebula.installation.v1.Invoice invoices = 1;</code>
     */
    public java.util.List<com.saltoapis.nebula.installation.v1.Invoice.Builder> 
         getInvoicesBuilderList() {
      return getInvoicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.saltoapis.nebula.installation.v1.Invoice, com.saltoapis.nebula.installation.v1.Invoice.Builder, com.saltoapis.nebula.installation.v1.InvoiceOrBuilder> 
        getInvoicesFieldBuilder() {
      if (invoicesBuilder_ == null) {
        invoicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.saltoapis.nebula.installation.v1.Invoice, com.saltoapis.nebula.installation.v1.Invoice.Builder, com.saltoapis.nebula.installation.v1.InvoiceOrBuilder>(
                invoices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        invoices_ = null;
      }
      return invoicesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:salto.nebula.installation.v1.ListInvoicesResponse)
  }

  // @@protoc_insertion_point(class_scope:salto.nebula.installation.v1.ListInvoicesResponse)
  private static final com.saltoapis.nebula.installation.v1.ListInvoicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saltoapis.nebula.installation.v1.ListInvoicesResponse();
  }

  public static com.saltoapis.nebula.installation.v1.ListInvoicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInvoicesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInvoicesResponse>() {
    @java.lang.Override
    public ListInvoicesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInvoicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInvoicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.saltoapis.nebula.installation.v1.ListInvoicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

