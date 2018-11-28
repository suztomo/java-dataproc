// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

/**
 * <pre>
 * Configuration for parameter validation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.ParameterValidation}
 */
public  final class ParameterValidation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.ParameterValidation)
    ParameterValidationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParameterValidation.newBuilder() to construct.
  private ParameterValidation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParameterValidation() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ParameterValidation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.dataproc.v1beta2.RegexValidation.Builder subBuilder = null;
            if (validationTypeCase_ == 1) {
              subBuilder = ((com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_).toBuilder();
            }
            validationType_ =
                input.readMessage(com.google.cloud.dataproc.v1beta2.RegexValidation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_);
              validationType_ = subBuilder.buildPartial();
            }
            validationTypeCase_ = 1;
            break;
          }
          case 18: {
            com.google.cloud.dataproc.v1beta2.ValueValidation.Builder subBuilder = null;
            if (validationTypeCase_ == 2) {
              subBuilder = ((com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_).toBuilder();
            }
            validationType_ =
                input.readMessage(com.google.cloud.dataproc.v1beta2.ValueValidation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_);
              validationType_ = subBuilder.buildPartial();
            }
            validationTypeCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_ParameterValidation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_ParameterValidation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.ParameterValidation.class, com.google.cloud.dataproc.v1beta2.ParameterValidation.Builder.class);
  }

  private int validationTypeCase_ = 0;
  private java.lang.Object validationType_;
  public enum ValidationTypeCase
      implements com.google.protobuf.Internal.EnumLite {
    REGEX(1),
    VALUES(2),
    VALIDATIONTYPE_NOT_SET(0);
    private final int value;
    private ValidationTypeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValidationTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValidationTypeCase forNumber(int value) {
      switch (value) {
        case 1: return REGEX;
        case 2: return VALUES;
        case 0: return VALIDATIONTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValidationTypeCase
  getValidationTypeCase() {
    return ValidationTypeCase.forNumber(
        validationTypeCase_);
  }

  public static final int REGEX_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
   */
  public boolean hasRegex() {
    return validationTypeCase_ == 1;
  }
  /**
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.RegexValidation getRegex() {
    if (validationTypeCase_ == 1) {
       return (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance();
  }
  /**
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.RegexValidationOrBuilder getRegexOrBuilder() {
    if (validationTypeCase_ == 1) {
       return (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance();
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
   */
  public boolean hasValues() {
    return validationTypeCase_ == 2;
  }
  /**
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ValueValidation getValues() {
    if (validationTypeCase_ == 2) {
       return (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance();
  }
  /**
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ValueValidationOrBuilder getValuesOrBuilder() {
    if (validationTypeCase_ == 2) {
       return (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance();
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
    if (validationTypeCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_);
    }
    if (validationTypeCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validationTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_);
    }
    if (validationTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.ParameterValidation)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.ParameterValidation other = (com.google.cloud.dataproc.v1beta2.ParameterValidation) obj;

    boolean result = true;
    result = result && getValidationTypeCase().equals(
        other.getValidationTypeCase());
    if (!result) return false;
    switch (validationTypeCase_) {
      case 1:
        result = result && getRegex()
            .equals(other.getRegex());
        break;
      case 2:
        result = result && getValues()
            .equals(other.getValues());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (validationTypeCase_) {
      case 1:
        hash = (37 * hash) + REGEX_FIELD_NUMBER;
        hash = (53 * hash) + getRegex().hashCode();
        break;
      case 2:
        hash = (37 * hash) + VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getValues().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.ParameterValidation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.ParameterValidation prototype) {
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
   * Configuration for parameter validation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.ParameterValidation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.ParameterValidation)
      com.google.cloud.dataproc.v1beta2.ParameterValidationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_ParameterValidation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_ParameterValidation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.ParameterValidation.class, com.google.cloud.dataproc.v1beta2.ParameterValidation.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.ParameterValidation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      validationTypeCase_ = 0;
      validationType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_ParameterValidation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ParameterValidation getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.ParameterValidation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ParameterValidation build() {
      com.google.cloud.dataproc.v1beta2.ParameterValidation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.ParameterValidation buildPartial() {
      com.google.cloud.dataproc.v1beta2.ParameterValidation result = new com.google.cloud.dataproc.v1beta2.ParameterValidation(this);
      if (validationTypeCase_ == 1) {
        if (regexBuilder_ == null) {
          result.validationType_ = validationType_;
        } else {
          result.validationType_ = regexBuilder_.build();
        }
      }
      if (validationTypeCase_ == 2) {
        if (valuesBuilder_ == null) {
          result.validationType_ = validationType_;
        } else {
          result.validationType_ = valuesBuilder_.build();
        }
      }
      result.validationTypeCase_ = validationTypeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1beta2.ParameterValidation) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.ParameterValidation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.ParameterValidation other) {
      if (other == com.google.cloud.dataproc.v1beta2.ParameterValidation.getDefaultInstance()) return this;
      switch (other.getValidationTypeCase()) {
        case REGEX: {
          mergeRegex(other.getRegex());
          break;
        }
        case VALUES: {
          mergeValues(other.getValues());
          break;
        }
        case VALIDATIONTYPE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dataproc.v1beta2.ParameterValidation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1beta2.ParameterValidation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int validationTypeCase_ = 0;
    private java.lang.Object validationType_;
    public ValidationTypeCase
        getValidationTypeCase() {
      return ValidationTypeCase.forNumber(
          validationTypeCase_);
    }

    public Builder clearValidationType() {
      validationTypeCase_ = 0;
      validationType_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.RegexValidation, com.google.cloud.dataproc.v1beta2.RegexValidation.Builder, com.google.cloud.dataproc.v1beta2.RegexValidationOrBuilder> regexBuilder_;
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public boolean hasRegex() {
      return validationTypeCase_ == 1;
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.RegexValidation getRegex() {
      if (regexBuilder_ == null) {
        if (validationTypeCase_ == 1) {
          return (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance();
      } else {
        if (validationTypeCase_ == 1) {
          return regexBuilder_.getMessage();
        }
        return com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public Builder setRegex(com.google.cloud.dataproc.v1beta2.RegexValidation value) {
      if (regexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validationType_ = value;
        onChanged();
      } else {
        regexBuilder_.setMessage(value);
      }
      validationTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public Builder setRegex(
        com.google.cloud.dataproc.v1beta2.RegexValidation.Builder builderForValue) {
      if (regexBuilder_ == null) {
        validationType_ = builderForValue.build();
        onChanged();
      } else {
        regexBuilder_.setMessage(builderForValue.build());
      }
      validationTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public Builder mergeRegex(com.google.cloud.dataproc.v1beta2.RegexValidation value) {
      if (regexBuilder_ == null) {
        if (validationTypeCase_ == 1 &&
            validationType_ != com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance()) {
          validationType_ = com.google.cloud.dataproc.v1beta2.RegexValidation.newBuilder((com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_)
              .mergeFrom(value).buildPartial();
        } else {
          validationType_ = value;
        }
        onChanged();
      } else {
        if (validationTypeCase_ == 1) {
          regexBuilder_.mergeFrom(value);
        }
        regexBuilder_.setMessage(value);
      }
      validationTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public Builder clearRegex() {
      if (regexBuilder_ == null) {
        if (validationTypeCase_ == 1) {
          validationTypeCase_ = 0;
          validationType_ = null;
          onChanged();
        }
      } else {
        if (validationTypeCase_ == 1) {
          validationTypeCase_ = 0;
          validationType_ = null;
        }
        regexBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.RegexValidation.Builder getRegexBuilder() {
      return getRegexFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.RegexValidationOrBuilder getRegexOrBuilder() {
      if ((validationTypeCase_ == 1) && (regexBuilder_ != null)) {
        return regexBuilder_.getMessageOrBuilder();
      } else {
        if (validationTypeCase_ == 1) {
          return (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.RegexValidation regex = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.RegexValidation, com.google.cloud.dataproc.v1beta2.RegexValidation.Builder, com.google.cloud.dataproc.v1beta2.RegexValidationOrBuilder> 
        getRegexFieldBuilder() {
      if (regexBuilder_ == null) {
        if (!(validationTypeCase_ == 1)) {
          validationType_ = com.google.cloud.dataproc.v1beta2.RegexValidation.getDefaultInstance();
        }
        regexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.RegexValidation, com.google.cloud.dataproc.v1beta2.RegexValidation.Builder, com.google.cloud.dataproc.v1beta2.RegexValidationOrBuilder>(
                (com.google.cloud.dataproc.v1beta2.RegexValidation) validationType_,
                getParentForChildren(),
                isClean());
        validationType_ = null;
      }
      validationTypeCase_ = 1;
      onChanged();;
      return regexBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.ValueValidation, com.google.cloud.dataproc.v1beta2.ValueValidation.Builder, com.google.cloud.dataproc.v1beta2.ValueValidationOrBuilder> valuesBuilder_;
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public boolean hasValues() {
      return validationTypeCase_ == 2;
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ValueValidation getValues() {
      if (valuesBuilder_ == null) {
        if (validationTypeCase_ == 2) {
          return (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance();
      } else {
        if (validationTypeCase_ == 2) {
          return valuesBuilder_.getMessage();
        }
        return com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public Builder setValues(com.google.cloud.dataproc.v1beta2.ValueValidation value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validationType_ = value;
        onChanged();
      } else {
        valuesBuilder_.setMessage(value);
      }
      validationTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public Builder setValues(
        com.google.cloud.dataproc.v1beta2.ValueValidation.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        validationType_ = builderForValue.build();
        onChanged();
      } else {
        valuesBuilder_.setMessage(builderForValue.build());
      }
      validationTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public Builder mergeValues(com.google.cloud.dataproc.v1beta2.ValueValidation value) {
      if (valuesBuilder_ == null) {
        if (validationTypeCase_ == 2 &&
            validationType_ != com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance()) {
          validationType_ = com.google.cloud.dataproc.v1beta2.ValueValidation.newBuilder((com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_)
              .mergeFrom(value).buildPartial();
        } else {
          validationType_ = value;
        }
        onChanged();
      } else {
        if (validationTypeCase_ == 2) {
          valuesBuilder_.mergeFrom(value);
        }
        valuesBuilder_.setMessage(value);
      }
      validationTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        if (validationTypeCase_ == 2) {
          validationTypeCase_ = 0;
          validationType_ = null;
          onChanged();
        }
      } else {
        if (validationTypeCase_ == 2) {
          validationTypeCase_ = 0;
          validationType_ = null;
        }
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ValueValidation.Builder getValuesBuilder() {
      return getValuesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ValueValidationOrBuilder getValuesOrBuilder() {
      if ((validationTypeCase_ == 2) && (valuesBuilder_ != null)) {
        return valuesBuilder_.getMessageOrBuilder();
      } else {
        if (validationTypeCase_ == 2) {
          return (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ValueValidation values = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.ValueValidation, com.google.cloud.dataproc.v1beta2.ValueValidation.Builder, com.google.cloud.dataproc.v1beta2.ValueValidationOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        if (!(validationTypeCase_ == 2)) {
          validationType_ = com.google.cloud.dataproc.v1beta2.ValueValidation.getDefaultInstance();
        }
        valuesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.ValueValidation, com.google.cloud.dataproc.v1beta2.ValueValidation.Builder, com.google.cloud.dataproc.v1beta2.ValueValidationOrBuilder>(
                (com.google.cloud.dataproc.v1beta2.ValueValidation) validationType_,
                getParentForChildren(),
                isClean());
        validationType_ = null;
      }
      validationTypeCase_ = 2;
      onChanged();;
      return valuesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.ParameterValidation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.ParameterValidation)
  private static final com.google.cloud.dataproc.v1beta2.ParameterValidation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.ParameterValidation();
  }

  public static com.google.cloud.dataproc.v1beta2.ParameterValidation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParameterValidation>
      PARSER = new com.google.protobuf.AbstractParser<ParameterValidation>() {
    @java.lang.Override
    public ParameterValidation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ParameterValidation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ParameterValidation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParameterValidation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.ParameterValidation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

