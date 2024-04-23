// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/ema/dto/data_point.proto

package org.ema.dto;

public interface InputDataPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.ema.dto.InputDataPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string partner_id = 2;</code>
   * @return The partnerId.
   */
  java.lang.String getPartnerId();
  /**
   * <code>string partner_id = 2;</code>
   * @return The bytes for partnerId.
   */
  com.google.protobuf.ByteString
      getPartnerIdBytes();

  /**
   * <code>.org.ema.dto.PartnerType partner_type = 3;</code>
   * @return The enum numeric value on the wire for partnerType.
   */
  int getPartnerTypeValue();
  /**
   * <code>.org.ema.dto.PartnerType partner_type = 3;</code>
   * @return The partnerType.
   */
  org.ema.dto.PartnerType getPartnerType();

  /**
   * <code>.org.ema.dto.Struct data = 4;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.org.ema.dto.Struct data = 4;</code>
   * @return The data.
   */
  org.ema.dto.Struct getData();
  /**
   * <code>.org.ema.dto.Struct data = 4;</code>
   */
  org.ema.dto.StructOrBuilder getDataOrBuilder();
}
