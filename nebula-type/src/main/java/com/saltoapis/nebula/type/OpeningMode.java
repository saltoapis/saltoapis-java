// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: salto/nebula/type/opening_mode.proto
// Protobuf Java Version: 4.29.2

package com.saltoapis.nebula.type;

/**
 * <pre>
 * Represents an opening mode.
 * </pre>
 *
 * Protobuf enum {@code salto.nebula.type.OpeningMode}
 */
public enum OpeningMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OPENING_MODE_UNSPECIFIED = 0;</code>
   */
  OPENING_MODE_UNSPECIFIED(0),
  /**
   * <pre>
   * Office.
   * </pre>
   *
   * <code>OFFICE = 1;</code>
   */
  OFFICE(1),
  /**
   * <pre>
   * Toggle.
   * </pre>
   *
   * <code>TOGGLE = 2;</code>
   */
  TOGGLE(2),
  /**
   * <pre>
   * Autolock.
   * </pre>
   *
   * <code>AUTOLOCK = 3;</code>
   */
  AUTOLOCK(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      OpeningMode.class.getName());
  }
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OPENING_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int OPENING_MODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Office.
   * </pre>
   *
   * <code>OFFICE = 1;</code>
   */
  public static final int OFFICE_VALUE = 1;
  /**
   * <pre>
   * Toggle.
   * </pre>
   *
   * <code>TOGGLE = 2;</code>
   */
  public static final int TOGGLE_VALUE = 2;
  /**
   * <pre>
   * Autolock.
   * </pre>
   *
   * <code>AUTOLOCK = 3;</code>
   */
  public static final int AUTOLOCK_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OpeningMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OpeningMode forNumber(int value) {
    switch (value) {
      case 0: return OPENING_MODE_UNSPECIFIED;
      case 1: return OFFICE;
      case 2: return TOGGLE;
      case 3: return AUTOLOCK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OpeningMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OpeningMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OpeningMode>() {
          public OpeningMode findValueByNumber(int number) {
            return OpeningMode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.saltoapis.nebula.type.OpeningModeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OpeningMode[] VALUES = values();

  public static OpeningMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OpeningMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:salto.nebula.type.OpeningMode)
}

