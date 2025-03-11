// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/rpc/error_details.proto
// Protobuf Java Version: 4.29.2

package com.google.rpc;

public interface ErrorInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.ErrorInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The reason of the error. This is a constant value that identifies the
   * proximate cause of the error. Error reasons are unique within a particular
   * domain of errors. This should be at most 63 characters and match
   * /[A-Z0-9_]+/.
   * </pre>
   *
   * <code>string reason = 1;</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <pre>
   * The reason of the error. This is a constant value that identifies the
   * proximate cause of the error. Error reasons are unique within a particular
   * domain of errors. This should be at most 63 characters and match
   * /[A-Z0-9_]+/.
   * </pre>
   *
   * <code>string reason = 1;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <pre>
   * The logical grouping to which the "reason" belongs. The error domain
   * is typically the registered service name of the tool or product that
   * generates the error. Example: "pubsub.googleapis.com". If the error is
   * generated by some common infrastructure, the error domain must be a
   * globally unique value that identifies the infrastructure. For Google API
   * infrastructure, the error domain is "googleapis.com".
   * </pre>
   *
   * <code>string domain = 2;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * The logical grouping to which the "reason" belongs. The error domain
   * is typically the registered service name of the tool or product that
   * generates the error. Example: "pubsub.googleapis.com". If the error is
   * generated by some common infrastructure, the error domain must be a
   * globally unique value that identifies the infrastructure. For Google API
   * infrastructure, the error domain is "googleapis.com".
   * </pre>
   *
   * <code>string domain = 2;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys should match /[a-zA-Z0-9-_]/ and be limited to 64 characters in
   * length. When identifying the current value of an exceeded limit, the units
   * should be contained in the key, not the value.  For example, rather than
   * {"instanceLimit": "100/request"}, should be returned as,
   * {"instanceLimitPerRequest": "100"}, if the client exceeds the number of
   * instances that can be created in a single (batch) request.
   * </pre>
   *
   * <code>repeated .google.rpc.ErrorInfo.MetadataEntry metadata = 3;</code>
   */
  java.util.List<com.google.rpc.ErrorInfo.MetadataEntry> 
      getMetadataList();
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys should match /[a-zA-Z0-9-_]/ and be limited to 64 characters in
   * length. When identifying the current value of an exceeded limit, the units
   * should be contained in the key, not the value.  For example, rather than
   * {"instanceLimit": "100/request"}, should be returned as,
   * {"instanceLimitPerRequest": "100"}, if the client exceeds the number of
   * instances that can be created in a single (batch) request.
   * </pre>
   *
   * <code>repeated .google.rpc.ErrorInfo.MetadataEntry metadata = 3;</code>
   */
  com.google.rpc.ErrorInfo.MetadataEntry getMetadata(int index);
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys should match /[a-zA-Z0-9-_]/ and be limited to 64 characters in
   * length. When identifying the current value of an exceeded limit, the units
   * should be contained in the key, not the value.  For example, rather than
   * {"instanceLimit": "100/request"}, should be returned as,
   * {"instanceLimitPerRequest": "100"}, if the client exceeds the number of
   * instances that can be created in a single (batch) request.
   * </pre>
   *
   * <code>repeated .google.rpc.ErrorInfo.MetadataEntry metadata = 3;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys should match /[a-zA-Z0-9-_]/ and be limited to 64 characters in
   * length. When identifying the current value of an exceeded limit, the units
   * should be contained in the key, not the value.  For example, rather than
   * {"instanceLimit": "100/request"}, should be returned as,
   * {"instanceLimitPerRequest": "100"}, if the client exceeds the number of
   * instances that can be created in a single (batch) request.
   * </pre>
   *
   * <code>repeated .google.rpc.ErrorInfo.MetadataEntry metadata = 3;</code>
   */
  java.util.List<? extends com.google.rpc.ErrorInfo.MetadataEntryOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys should match /[a-zA-Z0-9-_]/ and be limited to 64 characters in
   * length. When identifying the current value of an exceeded limit, the units
   * should be contained in the key, not the value.  For example, rather than
   * {"instanceLimit": "100/request"}, should be returned as,
   * {"instanceLimitPerRequest": "100"}, if the client exceeds the number of
   * instances that can be created in a single (batch) request.
   * </pre>
   *
   * <code>repeated .google.rpc.ErrorInfo.MetadataEntry metadata = 3;</code>
   */
  com.google.rpc.ErrorInfo.MetadataEntryOrBuilder getMetadataOrBuilder(
      int index);
}
