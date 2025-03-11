// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/rpc/error_details.proto
// Protobuf Java Version: 4.29.2

package com.google.rpc;

public interface QuotaFailureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.QuotaFailure)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  java.util.List<com.google.rpc.QuotaFailure.Violation> 
      getViolationsList();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  com.google.rpc.QuotaFailure.Violation getViolations(int index);
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  int getViolationsCount();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  java.util.List<? extends com.google.rpc.QuotaFailure.ViolationOrBuilder> 
      getViolationsOrBuilderList();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  com.google.rpc.QuotaFailure.ViolationOrBuilder getViolationsOrBuilder(
      int index);
}
