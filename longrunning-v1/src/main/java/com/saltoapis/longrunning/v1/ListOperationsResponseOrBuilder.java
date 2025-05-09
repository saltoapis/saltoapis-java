// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/longrunning/v1/operation.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.longrunning.v1;

public interface ListOperationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.longrunning.v1.ListOperationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .salto.longrunning.v1.Operation operations = 1;</code>
   */
  java.util.List<com.saltoapis.longrunning.v1.Operation> 
      getOperationsList();
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .salto.longrunning.v1.Operation operations = 1;</code>
   */
  com.saltoapis.longrunning.v1.Operation getOperations(int index);
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .salto.longrunning.v1.Operation operations = 1;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .salto.longrunning.v1.Operation operations = 1;</code>
   */
  java.util.List<? extends com.saltoapis.longrunning.v1.OperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .salto.longrunning.v1.Operation operations = 1;</code>
   */
  com.saltoapis.longrunning.v1.OperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
