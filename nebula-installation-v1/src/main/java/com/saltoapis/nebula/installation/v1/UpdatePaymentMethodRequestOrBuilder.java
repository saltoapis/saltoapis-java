// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.installation.v1;

public interface UpdatePaymentMethodRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.UpdatePaymentMethodRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The payment method resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.PaymentMethod payment_method = 1;</code>
   * @return Whether the paymentMethod field is set.
   */
  boolean hasPaymentMethod();
  /**
   * <pre>
   * The payment method resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.PaymentMethod payment_method = 1;</code>
   * @return The paymentMethod.
   */
  com.saltoapis.nebula.installation.v1.PaymentMethod getPaymentMethod();
  /**
   * <pre>
   * The payment method resource which replaces the resource on the server.
   * </pre>
   *
   * <code>.salto.nebula.installation.v1.PaymentMethod payment_method = 1;</code>
   */
  com.saltoapis.nebula.installation.v1.PaymentMethodOrBuilder getPaymentMethodOrBuilder();
}
