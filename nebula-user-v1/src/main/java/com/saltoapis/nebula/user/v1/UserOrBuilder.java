// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/nebula/user/v1/user.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.nebula.user.v1;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.nebula.user.v1.User)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Resource name of the user. It must have the format of
   * `installations/&#42;&#47;users/&#42;`. For example:
   * `installations/surelock-homes-hq/users/john-watson`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of the user. It must have the format of
   * `installations/&#42;&#47;users/&#42;`. For example:
   * `installations/surelock-homes-hq/users/john-watson`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The name of the parent user of this user.
   * Only users who have had keys shared with them will have this field set.
   * </pre>
   *
   * <code>optional string parent = 2;</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <pre>
   * The name of the parent user of this user.
   * Only users who have had keys shared with them will have this field set.
   * </pre>
   *
   * <code>optional string parent = 2;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The name of the parent user of this user.
   * Only users who have had keys shared with them will have this field set.
   * </pre>
   *
   * <code>optional string parent = 2;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The personal name, forename or given name ("first name"). It could
   * also contain a middle name. First name is not used because the given
   * name is not placed first in some cultures.
   * </pre>
   *
   * <code>string given_name = 3;</code>
   * @return The givenName.
   */
  java.lang.String getGivenName();
  /**
   * <pre>
   * The personal name, forename or given name ("first name"). It could
   * also contain a middle name. First name is not used because the given
   * name is not placed first in some cultures.
   * </pre>
   *
   * <code>string given_name = 3;</code>
   * @return The bytes for givenName.
   */
  com.google.protobuf.ByteString
      getGivenNameBytes();

  /**
   * <pre>
   * The surname or family name ("last name"). It could also contain more than
   * one surname so that both matrilineal and patrilineal surnames can be
   * included in one place. Last name is not used because the family name is
   * not placed last in some cultures.
   * </pre>
   *
   * <code>optional string family_name = 4;</code>
   * @return Whether the familyName field is set.
   */
  boolean hasFamilyName();
  /**
   * <pre>
   * The surname or family name ("last name"). It could also contain more than
   * one surname so that both matrilineal and patrilineal surnames can be
   * included in one place. Last name is not used because the family name is
   * not placed last in some cultures.
   * </pre>
   *
   * <code>optional string family_name = 4;</code>
   * @return The familyName.
   */
  java.lang.String getFamilyName();
  /**
   * <pre>
   * The surname or family name ("last name"). It could also contain more than
   * one surname so that both matrilineal and patrilineal surnames can be
   * included in one place. Last name is not used because the family name is
   * not placed last in some cultures.
   * </pre>
   *
   * <code>optional string family_name = 4;</code>
   * @return The bytes for familyName.
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <pre>
   * The display name of the user, formed by concatenating the first and last
   * name values.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name of the user, formed by concatenating the first and last
   * name values.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Email address.
   * </pre>
   *
   * <code>optional string email = 6;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <pre>
   * Email address.
   * </pre>
   *
   * <code>optional string email = 6;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * Email address.
   * </pre>
   *
   * <code>optional string email = 6;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Activation time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp activate_time = 7;</code>
   * @return Whether the activateTime field is set.
   */
  boolean hasActivateTime();
  /**
   * <pre>
   * Activation time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp activate_time = 7;</code>
   * @return The activateTime.
   */
  com.google.protobuf.Timestamp getActivateTime();

  /**
   * <pre>
   * Expiration time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 8;</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * Expiration time independent of any time zone or calendar.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 8;</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();

  /**
   * <pre>
   * The file resource name for the user photo. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>optional string photo = 9;</code>
   * @return Whether the photo field is set.
   */
  boolean hasPhoto();
  /**
   * <pre>
   * The file resource name for the user photo. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>optional string photo = 9;</code>
   * @return The photo.
   */
  java.lang.String getPhoto();
  /**
   * <pre>
   * The file resource name for the user photo. It must have the
   * format of
   * `installations/surelock-homes-hq/files/01DSYSJ1PR36VVC3MRFRV4DC7G`.
   * </pre>
   *
   * <code>optional string photo = 9;</code>
   * @return The bytes for photo.
   */
  com.google.protobuf.ByteString
      getPhotoBytes();

  /**
   * <pre>
   * The URI to view the user photo.
   * </pre>
   *
   * <code>string photo_uri = 10;</code>
   * @return The photoUri.
   */
  java.lang.String getPhotoUri();
  /**
   * <pre>
   * The URI to view the user photo.
   * </pre>
   *
   * <code>string photo_uri = 10;</code>
   * @return The bytes for photoUri.
   */
  com.google.protobuf.ByteString
      getPhotoUriBytes();

  /**
   * <pre>
   * The card key resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey card_key = 11;</code>
   * @return Whether the cardKey field is set.
   */
  boolean hasCardKey();
  /**
   * <pre>
   * The card key resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.CardKey card_key = 11;</code>
   * @return The cardKey.
   */
  com.saltoapis.nebula.user.v1.CardKey getCardKey();

  /**
   * <pre>
   * The app key resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 12;</code>
   * @return Whether the appKey field is set.
   */
  boolean hasAppKey();
  /**
   * <pre>
   * The app key resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.AppKey app_key = 12;</code>
   * @return The appKey.
   */
  com.saltoapis.nebula.user.v1.AppKey getAppKey();

  /**
   * <pre>
   * The wallet key resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.WalletKey wallet_key = 13;</code>
   * @return Whether the walletKey field is set.
   */
  boolean hasWalletKey();
  /**
   * <pre>
   * The wallet key resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.WalletKey wallet_key = 13;</code>
   * @return The walletKey.
   */
  com.saltoapis.nebula.user.v1.WalletKey getWalletKey();

  /**
   * <pre>
   * The passcode resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.Passcode passcode = 15;</code>
   * @return Whether the passcode field is set.
   */
  boolean hasPasscode();
  /**
   * <pre>
   * The passcode resource that belongs to the user.
   * </pre>
   *
   * <code>.salto.nebula.user.v1.Passcode passcode = 15;</code>
   * @return The passcode.
   */
  com.saltoapis.nebula.user.v1.Passcode getPasscode();

  /**
   * <pre>
   * Indicates whether this user is blocked or not. A blocked user cannot
   * perform any admin actions, that is, if they have a management role this
   * will no longer be valid. If the user has a key then it will no longer
   * unlock access points.
   * </pre>
   *
   * <code>bool blocked = 14;</code>
   * @return The blocked.
   */
  boolean getBlocked();
}
