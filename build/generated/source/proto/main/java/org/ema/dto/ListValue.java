// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/ema/dto/struct.proto

package org.ema.dto;

/**
 * <pre>
 * `ListValue` is a wrapper around a repeated field of values.
 * The JSON representation for `ListValue` is JSON array.
 * </pre>
 *
 * Protobuf type {@code org.ema.dto.ListValue}
 */
public final class ListValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.ema.dto.ListValue)
    ListValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListValue.newBuilder() to construct.
  private ListValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListValue() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.ema.dto.StructOuterClass.internal_static_org_ema_dto_ListValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.ema.dto.StructOuterClass.internal_static_org_ema_dto_ListValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.ema.dto.ListValue.class, org.ema.dto.ListValue.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.ema.dto.Value> values_;
  /**
   * <pre>
   * Repeated field of dynamically typed values.
   * </pre>
   *
   * <code>repeated .org.ema.dto.Value values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.ema.dto.Value> getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * Repeated field of dynamically typed values.
   * </pre>
   *
   * <code>repeated .org.ema.dto.Value values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.ema.dto.ValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <pre>
   * Repeated field of dynamically typed values.
   * </pre>
   *
   * <code>repeated .org.ema.dto.Value values = 1;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * Repeated field of dynamically typed values.
   * </pre>
   *
   * <code>repeated .org.ema.dto.Value values = 1;</code>
   */
  @java.lang.Override
  public org.ema.dto.Value getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * Repeated field of dynamically typed values.
   * </pre>
   *
   * <code>repeated .org.ema.dto.Value values = 1;</code>
   */
  @java.lang.Override
  public org.ema.dto.ValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, values_.get(i));
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
    if (!(obj instanceof org.ema.dto.ListValue)) {
      return super.equals(obj);
    }
    org.ema.dto.ListValue other = (org.ema.dto.ListValue) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.ema.dto.ListValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ema.dto.ListValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ema.dto.ListValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ema.dto.ListValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ema.dto.ListValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ema.dto.ListValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ema.dto.ListValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ema.dto.ListValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ema.dto.ListValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.ema.dto.ListValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ema.dto.ListValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ema.dto.ListValue parseFrom(
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
  public static Builder newBuilder(org.ema.dto.ListValue prototype) {
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
   * <pre>
   * `ListValue` is a wrapper around a repeated field of values.
   * The JSON representation for `ListValue` is JSON array.
   * </pre>
   *
   * Protobuf type {@code org.ema.dto.ListValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.ema.dto.ListValue)
      org.ema.dto.ListValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.ema.dto.StructOuterClass.internal_static_org_ema_dto_ListValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.ema.dto.StructOuterClass.internal_static_org_ema_dto_ListValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.ema.dto.ListValue.class, org.ema.dto.ListValue.Builder.class);
    }

    // Construct using org.ema.dto.ListValue.newBuilder()
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
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
      } else {
        values_ = null;
        valuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.ema.dto.StructOuterClass.internal_static_org_ema_dto_ListValue_descriptor;
    }

    @java.lang.Override
    public org.ema.dto.ListValue getDefaultInstanceForType() {
      return org.ema.dto.ListValue.getDefaultInstance();
    }

    @java.lang.Override
    public org.ema.dto.ListValue build() {
      org.ema.dto.ListValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.ema.dto.ListValue buildPartial() {
      org.ema.dto.ListValue result = new org.ema.dto.ListValue(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.ema.dto.ListValue result) {
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
    }

    private void buildPartial0(org.ema.dto.ListValue result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof org.ema.dto.ListValue) {
        return mergeFrom((org.ema.dto.ListValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.ema.dto.ListValue other) {
      if (other == org.ema.dto.ListValue.getDefaultInstance()) return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
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
              org.ema.dto.Value m =
                  input.readMessage(
                      org.ema.dto.Value.parser(),
                      extensionRegistry);
              if (valuesBuilder_ == null) {
                ensureValuesIsMutable();
                values_.add(m);
              } else {
                valuesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<org.ema.dto.Value> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<org.ema.dto.Value>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.ema.dto.Value, org.ema.dto.Value.Builder, org.ema.dto.ValueOrBuilder> valuesBuilder_;

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public java.util.List<org.ema.dto.Value> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public org.ema.dto.Value getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder setValues(
        int index, org.ema.dto.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder setValues(
        int index, org.ema.dto.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder addValues(org.ema.dto.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder addValues(
        int index, org.ema.dto.Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder addValues(
        org.ema.dto.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder addValues(
        int index, org.ema.dto.Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends org.ema.dto.Value> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public org.ema.dto.Value.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public org.ema.dto.ValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public java.util.List<? extends org.ema.dto.ValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public org.ema.dto.Value.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          org.ema.dto.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public org.ema.dto.Value.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, org.ema.dto.Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .org.ema.dto.Value values = 1;</code>
     */
    public java.util.List<org.ema.dto.Value.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.ema.dto.Value, org.ema.dto.Value.Builder, org.ema.dto.ValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.ema.dto.Value, org.ema.dto.Value.Builder, org.ema.dto.ValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.ema.dto.ListValue)
  }

  // @@protoc_insertion_point(class_scope:org.ema.dto.ListValue)
  private static final org.ema.dto.ListValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.ema.dto.ListValue();
  }

  public static org.ema.dto.ListValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListValue>
      PARSER = new com.google.protobuf.AbstractParser<ListValue>() {
    @java.lang.Override
    public ListValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.ema.dto.ListValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

