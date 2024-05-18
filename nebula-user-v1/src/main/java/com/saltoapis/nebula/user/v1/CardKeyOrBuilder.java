// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 4.26.1
package com.saltoapis.nebula.user.v1;

public interface CardKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.CardKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the user's card key. It must have the
   * format of `installations/&#42;&#47;users/&#42;&#47;card-key`. For example:
   * `installations/surelock-homes-hq/users/john-watson/card-key`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the user's card key. It must have the
   * format of `installations/&#42;&#47;users/&#42;&#47;card-key`. For example:
   * `installations/surelock-homes-hq/users/john-watson/card-key`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Unique identifier of the physical card. Length dependent of technology.
   * Max length for ISO14443-3 is 10 bytes.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * Indicates whether this card key has been assigned, not assigned or is
   * active and ready for use. This field cannot be modified using a standard
   * [`UpdateCardKey`][salto.nebula.user.v1.UserService.UpdateCardKey]
   * operation. To change the value of this field, you must call
   * [`EncodeCardKey`][salto.nebula.user.v1.UserService.EncodeCardKey].
   *
   * If the value is `NOT_ASSIGNED` it also applies to cases where the
   * assignation process has been initiated, but not completed.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey.State state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Indicates whether this card key has been assigned, not assigned or is
   * active and ready for use. This field cannot be modified using a standard
   * [`UpdateCardKey`][salto.nebula.user.v1.UserService.UpdateCardKey]
   * operation. To change the value of this field, you must call
   * [`EncodeCardKey`][salto.nebula.user.v1.UserService.EncodeCardKey].
   *
   * If the value is `NOT_ASSIGNED` it also applies to cases where the
   * assignation process has been initiated, but not completed.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey.State state = 3;</code>
   * @return The state.
   */
  com.saltoapis.nebula.user.v1.CardKey.State getState();

  /**
   * <pre>
   * Indicates whether this card key has pending updates or not.
   * This field cannot be modified using a standard
   * [`UpdateCardKey`][salto.nebula.user.v1.UserService.UpdateCardKey]
   * operation. To change the value of this field, you must call
   * [`OutdateCardKey`][salto.nebula.user.v1.UserService.OutdateCardKey].
   * </pre>
   *
   * <code>bool outdated = 4;</code>
   * @return The outdated.
   */
  boolean getOutdated();
}
