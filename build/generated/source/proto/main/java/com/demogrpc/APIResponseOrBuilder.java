// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dummy/order.proto

package com.demogrpc;

public interface APIResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:demogrpc.APIResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ticker = 1;</code>
   * @return The ticker.
   */
  java.lang.String getTicker();
  /**
   * <code>string ticker = 1;</code>
   * @return The bytes for ticker.
   */
  com.google.protobuf.ByteString
      getTickerBytes();

  /**
   * <code>string direction = 2;</code>
   * @return The direction.
   */
  java.lang.String getDirection();
  /**
   * <code>string direction = 2;</code>
   * @return The bytes for direction.
   */
  com.google.protobuf.ByteString
      getDirectionBytes();

  /**
   * <code>int32 quantity = 3;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>string orderId = 4;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 4;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>int32 price = 5;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>string username = 6;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 6;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string email = 7;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 7;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}
