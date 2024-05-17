// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/installation/v1/installation.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.installation.v1;

public interface UpdateCardRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.installation.v1.UpdateCardRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The resource name of the subscription's payment method for which the card is being
   * requested to be updated. For example:
   * `installations/surelock-homes-hq/subscription/payment-method`.
   * </pre>
   *
   * <code>string payment_method = 1;</code>
   * @return The paymentMethod.
   */
  java.lang.String getPaymentMethod();
  /**
   * <pre>
   * The resource name of the subscription's payment method for which the card is being
   * requested to be updated. For example:
   * `installations/surelock-homes-hq/subscription/payment-method`.
   * </pre>
   *
   * <code>string payment_method = 1;</code>
   * @return The bytes for paymentMethod.
   */
  com.google.protobuf.ByteString
      getPaymentMethodBytes();

  /**
   * <pre>
   * The token provided for the operation.
   * </pre>
   *
   * <code>string token = 2;</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * The token provided for the operation.
   * </pre>
   *
   * <code>string token = 2;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
