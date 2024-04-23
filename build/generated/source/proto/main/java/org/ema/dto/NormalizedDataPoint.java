// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/ema/dto/normalized_data_point.proto

package org.ema.dto;

/**
 * Protobuf type {@code org.ema.dto.NormalizedDataPoint}
 */
public final class NormalizedDataPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.ema.dto.NormalizedDataPoint)
    NormalizedDataPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NormalizedDataPoint.newBuilder() to construct.
  private NormalizedDataPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NormalizedDataPoint() {
    id_ = "";
    partnerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NormalizedDataPoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.ema.dto.NormalizedDataPointOuterClass.internal_static_org_ema_dto_NormalizedDataPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.ema.dto.NormalizedDataPointOuterClass.internal_static_org_ema_dto_NormalizedDataPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.ema.dto.NormalizedDataPoint.class, org.ema.dto.NormalizedDataPoint.Builder.class);
  }

  private int inputMessageCase_ = 0;
  private java.lang.Object inputMessage_;
  public enum InputMessageCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RECRUITING_EVENT(3),
    TICKETING_EVENT(4),
    INPUTMESSAGE_NOT_SET(0);
    private final int value;
    private InputMessageCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InputMessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static InputMessageCase forNumber(int value) {
      switch (value) {
        case 3: return RECRUITING_EVENT;
        case 4: return TICKETING_EVENT;
        case 0: return INPUTMESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public InputMessageCase
  getInputMessageCase() {
    return InputMessageCase.forNumber(
        inputMessageCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTNER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object partnerId_ = "";
  /**
   * <code>string partner_id = 2;</code>
   * @return The partnerId.
   */
  @java.lang.Override
  public java.lang.String getPartnerId() {
    java.lang.Object ref = partnerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partnerId_ = s;
      return s;
    }
  }
  /**
   * <code>string partner_id = 2;</code>
   * @return The bytes for partnerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPartnerIdBytes() {
    java.lang.Object ref = partnerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partnerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECRUITING_EVENT_FIELD_NUMBER = 3;
  /**
   * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
   * @return Whether the recruitingEvent field is set.
   */
  @java.lang.Override
  public boolean hasRecruitingEvent() {
    return inputMessageCase_ == 3;
  }
  /**
   * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
   * @return The recruitingEvent.
   */
  @java.lang.Override
  public org.ema.dto.RecruitingEvent getRecruitingEvent() {
    if (inputMessageCase_ == 3) {
       return (org.ema.dto.RecruitingEvent) inputMessage_;
    }
    return org.ema.dto.RecruitingEvent.getDefaultInstance();
  }
  /**
   * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
   */
  @java.lang.Override
  public org.ema.dto.RecruitingEventOrBuilder getRecruitingEventOrBuilder() {
    if (inputMessageCase_ == 3) {
       return (org.ema.dto.RecruitingEvent) inputMessage_;
    }
    return org.ema.dto.RecruitingEvent.getDefaultInstance();
  }

  public static final int TICKETING_EVENT_FIELD_NUMBER = 4;
  /**
   * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
   * @return Whether the ticketingEvent field is set.
   */
  @java.lang.Override
  public boolean hasTicketingEvent() {
    return inputMessageCase_ == 4;
  }
  /**
   * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
   * @return The ticketingEvent.
   */
  @java.lang.Override
  public org.ema.dto.TicketingEvent getTicketingEvent() {
    if (inputMessageCase_ == 4) {
       return (org.ema.dto.TicketingEvent) inputMessage_;
    }
    return org.ema.dto.TicketingEvent.getDefaultInstance();
  }
  /**
   * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
   */
  @java.lang.Override
  public org.ema.dto.TicketingEventOrBuilder getTicketingEventOrBuilder() {
    if (inputMessageCase_ == 4) {
       return (org.ema.dto.TicketingEvent) inputMessage_;
    }
    return org.ema.dto.TicketingEvent.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(partnerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, partnerId_);
    }
    if (inputMessageCase_ == 3) {
      output.writeMessage(3, (org.ema.dto.RecruitingEvent) inputMessage_);
    }
    if (inputMessageCase_ == 4) {
      output.writeMessage(4, (org.ema.dto.TicketingEvent) inputMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(partnerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, partnerId_);
    }
    if (inputMessageCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (org.ema.dto.RecruitingEvent) inputMessage_);
    }
    if (inputMessageCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (org.ema.dto.TicketingEvent) inputMessage_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.ema.dto.NormalizedDataPoint)) {
      return super.equals(obj);
    }
    org.ema.dto.NormalizedDataPoint other = (org.ema.dto.NormalizedDataPoint) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getPartnerId()
        .equals(other.getPartnerId())) return false;
    if (!getInputMessageCase().equals(other.getInputMessageCase())) return false;
    switch (inputMessageCase_) {
      case 3:
        if (!getRecruitingEvent()
            .equals(other.getRecruitingEvent())) return false;
        break;
      case 4:
        if (!getTicketingEvent()
            .equals(other.getTicketingEvent())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PARTNER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPartnerId().hashCode();
    switch (inputMessageCase_) {
      case 3:
        hash = (37 * hash) + RECRUITING_EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getRecruitingEvent().hashCode();
        break;
      case 4:
        hash = (37 * hash) + TICKETING_EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getTicketingEvent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.ema.dto.NormalizedDataPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ema.dto.NormalizedDataPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.ema.dto.NormalizedDataPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ema.dto.NormalizedDataPoint parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.ema.dto.NormalizedDataPoint prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.ema.dto.NormalizedDataPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.ema.dto.NormalizedDataPoint)
      org.ema.dto.NormalizedDataPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.ema.dto.NormalizedDataPointOuterClass.internal_static_org_ema_dto_NormalizedDataPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.ema.dto.NormalizedDataPointOuterClass.internal_static_org_ema_dto_NormalizedDataPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.ema.dto.NormalizedDataPoint.class, org.ema.dto.NormalizedDataPoint.Builder.class);
    }

    // Construct using org.ema.dto.NormalizedDataPoint.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      partnerId_ = "";
      if (recruitingEventBuilder_ != null) {
        recruitingEventBuilder_.clear();
      }
      if (ticketingEventBuilder_ != null) {
        ticketingEventBuilder_.clear();
      }
      inputMessageCase_ = 0;
      inputMessage_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.ema.dto.NormalizedDataPointOuterClass.internal_static_org_ema_dto_NormalizedDataPoint_descriptor;
    }

    @java.lang.Override
    public org.ema.dto.NormalizedDataPoint getDefaultInstanceForType() {
      return org.ema.dto.NormalizedDataPoint.getDefaultInstance();
    }

    @java.lang.Override
    public org.ema.dto.NormalizedDataPoint build() {
      org.ema.dto.NormalizedDataPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.ema.dto.NormalizedDataPoint buildPartial() {
      org.ema.dto.NormalizedDataPoint result = new org.ema.dto.NormalizedDataPoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.ema.dto.NormalizedDataPoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.partnerId_ = partnerId_;
      }
    }

    private void buildPartialOneofs(org.ema.dto.NormalizedDataPoint result) {
      result.inputMessageCase_ = inputMessageCase_;
      result.inputMessage_ = this.inputMessage_;
      if (inputMessageCase_ == 3 &&
          recruitingEventBuilder_ != null) {
        result.inputMessage_ = recruitingEventBuilder_.build();
      }
      if (inputMessageCase_ == 4 &&
          ticketingEventBuilder_ != null) {
        result.inputMessage_ = ticketingEventBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.ema.dto.NormalizedDataPoint) {
        return mergeFrom((org.ema.dto.NormalizedDataPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.ema.dto.NormalizedDataPoint other) {
      if (other == org.ema.dto.NormalizedDataPoint.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPartnerId().isEmpty()) {
        partnerId_ = other.partnerId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getInputMessageCase()) {
        case RECRUITING_EVENT: {
          mergeRecruitingEvent(other.getRecruitingEvent());
          break;
        }
        case TICKETING_EVENT: {
          mergeTicketingEvent(other.getTicketingEvent());
          break;
        }
        case INPUTMESSAGE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              partnerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRecruitingEventFieldBuilder().getBuilder(),
                  extensionRegistry);
              inputMessageCase_ = 3;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getTicketingEventFieldBuilder().getBuilder(),
                  extensionRegistry);
              inputMessageCase_ = 4;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int inputMessageCase_ = 0;
    private java.lang.Object inputMessage_;
    public InputMessageCase
        getInputMessageCase() {
      return InputMessageCase.forNumber(
          inputMessageCase_);
    }

    public Builder clearInputMessage() {
      inputMessageCase_ = 0;
      inputMessage_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object partnerId_ = "";
    /**
     * <code>string partner_id = 2;</code>
     * @return The partnerId.
     */
    public java.lang.String getPartnerId() {
      java.lang.Object ref = partnerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partnerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string partner_id = 2;</code>
     * @return The bytes for partnerId.
     */
    public com.google.protobuf.ByteString
        getPartnerIdBytes() {
      java.lang.Object ref = partnerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partnerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string partner_id = 2;</code>
     * @param value The partnerId to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      partnerId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string partner_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartnerId() {
      partnerId_ = getDefaultInstance().getPartnerId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string partner_id = 2;</code>
     * @param value The bytes for partnerId to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      partnerId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.ema.dto.RecruitingEvent, org.ema.dto.RecruitingEvent.Builder, org.ema.dto.RecruitingEventOrBuilder> recruitingEventBuilder_;
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     * @return Whether the recruitingEvent field is set.
     */
    @java.lang.Override
    public boolean hasRecruitingEvent() {
      return inputMessageCase_ == 3;
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     * @return The recruitingEvent.
     */
    @java.lang.Override
    public org.ema.dto.RecruitingEvent getRecruitingEvent() {
      if (recruitingEventBuilder_ == null) {
        if (inputMessageCase_ == 3) {
          return (org.ema.dto.RecruitingEvent) inputMessage_;
        }
        return org.ema.dto.RecruitingEvent.getDefaultInstance();
      } else {
        if (inputMessageCase_ == 3) {
          return recruitingEventBuilder_.getMessage();
        }
        return org.ema.dto.RecruitingEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    public Builder setRecruitingEvent(org.ema.dto.RecruitingEvent value) {
      if (recruitingEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputMessage_ = value;
        onChanged();
      } else {
        recruitingEventBuilder_.setMessage(value);
      }
      inputMessageCase_ = 3;
      return this;
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    public Builder setRecruitingEvent(
        org.ema.dto.RecruitingEvent.Builder builderForValue) {
      if (recruitingEventBuilder_ == null) {
        inputMessage_ = builderForValue.build();
        onChanged();
      } else {
        recruitingEventBuilder_.setMessage(builderForValue.build());
      }
      inputMessageCase_ = 3;
      return this;
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    public Builder mergeRecruitingEvent(org.ema.dto.RecruitingEvent value) {
      if (recruitingEventBuilder_ == null) {
        if (inputMessageCase_ == 3 &&
            inputMessage_ != org.ema.dto.RecruitingEvent.getDefaultInstance()) {
          inputMessage_ = org.ema.dto.RecruitingEvent.newBuilder((org.ema.dto.RecruitingEvent) inputMessage_)
              .mergeFrom(value).buildPartial();
        } else {
          inputMessage_ = value;
        }
        onChanged();
      } else {
        if (inputMessageCase_ == 3) {
          recruitingEventBuilder_.mergeFrom(value);
        } else {
          recruitingEventBuilder_.setMessage(value);
        }
      }
      inputMessageCase_ = 3;
      return this;
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    public Builder clearRecruitingEvent() {
      if (recruitingEventBuilder_ == null) {
        if (inputMessageCase_ == 3) {
          inputMessageCase_ = 0;
          inputMessage_ = null;
          onChanged();
        }
      } else {
        if (inputMessageCase_ == 3) {
          inputMessageCase_ = 0;
          inputMessage_ = null;
        }
        recruitingEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    public org.ema.dto.RecruitingEvent.Builder getRecruitingEventBuilder() {
      return getRecruitingEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    @java.lang.Override
    public org.ema.dto.RecruitingEventOrBuilder getRecruitingEventOrBuilder() {
      if ((inputMessageCase_ == 3) && (recruitingEventBuilder_ != null)) {
        return recruitingEventBuilder_.getMessageOrBuilder();
      } else {
        if (inputMessageCase_ == 3) {
          return (org.ema.dto.RecruitingEvent) inputMessage_;
        }
        return org.ema.dto.RecruitingEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.org.ema.dto.RecruitingEvent recruiting_event = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.ema.dto.RecruitingEvent, org.ema.dto.RecruitingEvent.Builder, org.ema.dto.RecruitingEventOrBuilder> 
        getRecruitingEventFieldBuilder() {
      if (recruitingEventBuilder_ == null) {
        if (!(inputMessageCase_ == 3)) {
          inputMessage_ = org.ema.dto.RecruitingEvent.getDefaultInstance();
        }
        recruitingEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.ema.dto.RecruitingEvent, org.ema.dto.RecruitingEvent.Builder, org.ema.dto.RecruitingEventOrBuilder>(
                (org.ema.dto.RecruitingEvent) inputMessage_,
                getParentForChildren(),
                isClean());
        inputMessage_ = null;
      }
      inputMessageCase_ = 3;
      onChanged();
      return recruitingEventBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.ema.dto.TicketingEvent, org.ema.dto.TicketingEvent.Builder, org.ema.dto.TicketingEventOrBuilder> ticketingEventBuilder_;
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     * @return Whether the ticketingEvent field is set.
     */
    @java.lang.Override
    public boolean hasTicketingEvent() {
      return inputMessageCase_ == 4;
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     * @return The ticketingEvent.
     */
    @java.lang.Override
    public org.ema.dto.TicketingEvent getTicketingEvent() {
      if (ticketingEventBuilder_ == null) {
        if (inputMessageCase_ == 4) {
          return (org.ema.dto.TicketingEvent) inputMessage_;
        }
        return org.ema.dto.TicketingEvent.getDefaultInstance();
      } else {
        if (inputMessageCase_ == 4) {
          return ticketingEventBuilder_.getMessage();
        }
        return org.ema.dto.TicketingEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    public Builder setTicketingEvent(org.ema.dto.TicketingEvent value) {
      if (ticketingEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputMessage_ = value;
        onChanged();
      } else {
        ticketingEventBuilder_.setMessage(value);
      }
      inputMessageCase_ = 4;
      return this;
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    public Builder setTicketingEvent(
        org.ema.dto.TicketingEvent.Builder builderForValue) {
      if (ticketingEventBuilder_ == null) {
        inputMessage_ = builderForValue.build();
        onChanged();
      } else {
        ticketingEventBuilder_.setMessage(builderForValue.build());
      }
      inputMessageCase_ = 4;
      return this;
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    public Builder mergeTicketingEvent(org.ema.dto.TicketingEvent value) {
      if (ticketingEventBuilder_ == null) {
        if (inputMessageCase_ == 4 &&
            inputMessage_ != org.ema.dto.TicketingEvent.getDefaultInstance()) {
          inputMessage_ = org.ema.dto.TicketingEvent.newBuilder((org.ema.dto.TicketingEvent) inputMessage_)
              .mergeFrom(value).buildPartial();
        } else {
          inputMessage_ = value;
        }
        onChanged();
      } else {
        if (inputMessageCase_ == 4) {
          ticketingEventBuilder_.mergeFrom(value);
        } else {
          ticketingEventBuilder_.setMessage(value);
        }
      }
      inputMessageCase_ = 4;
      return this;
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    public Builder clearTicketingEvent() {
      if (ticketingEventBuilder_ == null) {
        if (inputMessageCase_ == 4) {
          inputMessageCase_ = 0;
          inputMessage_ = null;
          onChanged();
        }
      } else {
        if (inputMessageCase_ == 4) {
          inputMessageCase_ = 0;
          inputMessage_ = null;
        }
        ticketingEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    public org.ema.dto.TicketingEvent.Builder getTicketingEventBuilder() {
      return getTicketingEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    @java.lang.Override
    public org.ema.dto.TicketingEventOrBuilder getTicketingEventOrBuilder() {
      if ((inputMessageCase_ == 4) && (ticketingEventBuilder_ != null)) {
        return ticketingEventBuilder_.getMessageOrBuilder();
      } else {
        if (inputMessageCase_ == 4) {
          return (org.ema.dto.TicketingEvent) inputMessage_;
        }
        return org.ema.dto.TicketingEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.org.ema.dto.TicketingEvent ticketing_event = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.ema.dto.TicketingEvent, org.ema.dto.TicketingEvent.Builder, org.ema.dto.TicketingEventOrBuilder> 
        getTicketingEventFieldBuilder() {
      if (ticketingEventBuilder_ == null) {
        if (!(inputMessageCase_ == 4)) {
          inputMessage_ = org.ema.dto.TicketingEvent.getDefaultInstance();
        }
        ticketingEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.ema.dto.TicketingEvent, org.ema.dto.TicketingEvent.Builder, org.ema.dto.TicketingEventOrBuilder>(
                (org.ema.dto.TicketingEvent) inputMessage_,
                getParentForChildren(),
                isClean());
        inputMessage_ = null;
      }
      inputMessageCase_ = 4;
      onChanged();
      return ticketingEventBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.ema.dto.NormalizedDataPoint)
  }

  // @@protoc_insertion_point(class_scope:org.ema.dto.NormalizedDataPoint)
  private static final org.ema.dto.NormalizedDataPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.ema.dto.NormalizedDataPoint();
  }

  public static org.ema.dto.NormalizedDataPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedDataPoint>
      PARSER = new com.google.protobuf.AbstractParser<NormalizedDataPoint>() {
    @java.lang.Override
    public NormalizedDataPoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<NormalizedDataPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedDataPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.ema.dto.NormalizedDataPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
