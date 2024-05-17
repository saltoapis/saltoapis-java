// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: salto/type/color.proto

// Protobuf Java Version: 3.25.1
package com.saltoapis.type;

public interface ColorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:salto.type.Color)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1;</code>
   * @return The red.
   */
  float getRed();

  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2;</code>
   * @return The green.
   */
  float getGreen();

  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3;</code>
   * @return The blue.
   */
  float getBlue();

  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>optional float alpha = 4;</code>
   * @return Whether the alpha field is set.
   */
  boolean hasAlpha();
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>optional float alpha = 4;</code>
   * @return The alpha.
   */
  float getAlpha();
}
