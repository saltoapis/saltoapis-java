// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/event/v1/types.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.event.v1;

public interface WalletKeyAssignedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.event.v1.WalletKeyAssigned)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Wallet key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * Wallet key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   * @return The user.
   */
  com.saltoapis.nebula.user.v1.User getUser();
  /**
   * <pre>
   * Wallet key's user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.User user = 1;</code>
   */
  com.saltoapis.nebula.user.v1.UserOrBuilder getUserOrBuilder();

  /**
   * <pre>
   * Wallet key assigned.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.WalletKey wallet_key = 2;</code>
   * @return Whether the walletKey field is set.
   */
  boolean hasWalletKey();
  /**
   * <pre>
   * Wallet key assigned.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.WalletKey wallet_key = 2;</code>
   * @return The walletKey.
   */
  com.saltoapis.nebula.user.v1.WalletKey getWalletKey();
  /**
   * <pre>
   * Wallet key assigned.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.WalletKey wallet_key = 2;</code>
   */
  com.saltoapis.nebula.user.v1.WalletKeyOrBuilder getWalletKeyOrBuilder();
}
