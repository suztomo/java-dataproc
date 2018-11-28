// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Specifies the selection and config of software inside the cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.SoftwareConfig}
 */
public  final class SoftwareConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.SoftwareConfig)
    SoftwareConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SoftwareConfig.newBuilder() to construct.
  private SoftwareConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SoftwareConfig() {
    imageVersion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SoftwareConfig(
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
            java.lang.String s = input.readStringRequireUtf8();

            imageVersion_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              properties_ = com.google.protobuf.MapField.newMapField(
                  PropertiesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            properties__ = input.readMessage(
                PropertiesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            properties_.getMutableMap().put(
                properties__.getKey(), properties__.getValue());
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
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SoftwareConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetProperties();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SoftwareConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.SoftwareConfig.class, com.google.cloud.dataproc.v1.SoftwareConfig.Builder.class);
  }

  private int bitField0_;
  public static final int IMAGE_VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object imageVersion_;
  /**
   * <pre>
   * Optional. The version of software inside the cluster. It must be one of the supported
   * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
   * such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
   * If unspecified, it defaults to the latest version.
   * </pre>
   *
   * <code>string image_version = 1;</code>
   */
  public java.lang.String getImageVersion() {
    java.lang.Object ref = imageVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The version of software inside the cluster. It must be one of the supported
   * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
   * such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
   * If unspecified, it defaults to the latest version.
   * </pre>
   *
   * <code>string image_version = 1;</code>
   */
  public com.google.protobuf.ByteString
      getImageVersionBytes() {
    java.lang.Object ref = imageVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTIES_FIELD_NUMBER = 2;
  private static final class PropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SoftwareConfig_PropertiesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> properties_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetProperties() {
    if (properties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PropertiesDefaultEntryHolder.defaultEntry);
    }
    return properties_;
  }

  public int getPropertiesCount() {
    return internalGetProperties().getMap().size();
  }
  /**
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, such as
   * `core:fs.defaultFS`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  public boolean containsProperties(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetProperties().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getProperties() {
    return getPropertiesMap();
  }
  /**
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, such as
   * `core:fs.defaultFS`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
    return internalGetProperties().getMap();
  }
  /**
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, such as
   * `core:fs.defaultFS`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  public java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, such as
   * `core:fs.defaultFS`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  public java.lang.String getPropertiesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getImageVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imageVersion_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetProperties(),
        PropertiesDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getImageVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imageVersion_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      properties__ = PropertiesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, properties__);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.SoftwareConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.SoftwareConfig other = (com.google.cloud.dataproc.v1.SoftwareConfig) obj;

    boolean result = true;
    result = result && getImageVersion()
        .equals(other.getImageVersion());
    result = result && internalGetProperties().equals(
        other.internalGetProperties());
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
    hash = (37 * hash) + IMAGE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getImageVersion().hashCode();
    if (!internalGetProperties().getMap().isEmpty()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProperties().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SoftwareConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.SoftwareConfig prototype) {
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
   * Specifies the selection and config of software inside the cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.SoftwareConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.SoftwareConfig)
      com.google.cloud.dataproc.v1.SoftwareConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SoftwareConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SoftwareConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.SoftwareConfig.class, com.google.cloud.dataproc.v1.SoftwareConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.SoftwareConfig.newBuilder()
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
      imageVersion_ = "";

      internalGetMutableProperties().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SoftwareConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SoftwareConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.SoftwareConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SoftwareConfig build() {
      com.google.cloud.dataproc.v1.SoftwareConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SoftwareConfig buildPartial() {
      com.google.cloud.dataproc.v1.SoftwareConfig result = new com.google.cloud.dataproc.v1.SoftwareConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.imageVersion_ = imageVersion_;
      result.properties_ = internalGetProperties();
      result.properties_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.dataproc.v1.SoftwareConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.SoftwareConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.SoftwareConfig other) {
      if (other == com.google.cloud.dataproc.v1.SoftwareConfig.getDefaultInstance()) return this;
      if (!other.getImageVersion().isEmpty()) {
        imageVersion_ = other.imageVersion_;
        onChanged();
      }
      internalGetMutableProperties().mergeFrom(
          other.internalGetProperties());
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
      com.google.cloud.dataproc.v1.SoftwareConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.SoftwareConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object imageVersion_ = "";
    /**
     * <pre>
     * Optional. The version of software inside the cluster. It must be one of the supported
     * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
     * such as "1.2" (including a subminor version, such as "1.2.29"), or the
     * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
     * If unspecified, it defaults to the latest version.
     * </pre>
     *
     * <code>string image_version = 1;</code>
     */
    public java.lang.String getImageVersion() {
      java.lang.Object ref = imageVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The version of software inside the cluster. It must be one of the supported
     * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
     * such as "1.2" (including a subminor version, such as "1.2.29"), or the
     * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
     * If unspecified, it defaults to the latest version.
     * </pre>
     *
     * <code>string image_version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getImageVersionBytes() {
      java.lang.Object ref = imageVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The version of software inside the cluster. It must be one of the supported
     * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
     * such as "1.2" (including a subminor version, such as "1.2.29"), or the
     * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
     * If unspecified, it defaults to the latest version.
     * </pre>
     *
     * <code>string image_version = 1;</code>
     */
    public Builder setImageVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The version of software inside the cluster. It must be one of the supported
     * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
     * such as "1.2" (including a subminor version, such as "1.2.29"), or the
     * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
     * If unspecified, it defaults to the latest version.
     * </pre>
     *
     * <code>string image_version = 1;</code>
     */
    public Builder clearImageVersion() {
      
      imageVersion_ = getDefaultInstance().getImageVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The version of software inside the cluster. It must be one of the supported
     * [Cloud Dataproc Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
     * such as "1.2" (including a subminor version, such as "1.2.29"), or the
     * ["preview" version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
     * If unspecified, it defaults to the latest version.
     * </pre>
     *
     * <code>string image_version = 1;</code>
     */
    public Builder setImageVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageVersion_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> properties_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetProperties() {
      if (properties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      return properties_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableProperties() {
      onChanged();;
      if (properties_ == null) {
        properties_ = com.google.protobuf.MapField.newMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      if (!properties_.isMutable()) {
        properties_ = properties_.copy();
      }
      return properties_;
    }

    public int getPropertiesCount() {
      return internalGetProperties().getMap().size();
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */

    public boolean containsProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetProperties().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropertiesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getProperties() {
      return getPropertiesMap();
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
      return internalGetProperties().getMap();
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */

    public java.lang.String getPropertiesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */

    public java.lang.String getPropertiesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearProperties() {
      internalGetMutableProperties().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */

    public Builder removeProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableProperties().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableProperties() {
      return internalGetMutableProperties().getMutableMap();
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */
    public Builder putProperties(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableProperties().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Optional. The properties to set on daemon config files.
     * Property keys are specified in `prefix:property` format, such as
     * `core:fs.defaultFS`. The following are supported prefixes
     * and their mappings:
     * * capacity-scheduler: `capacity-scheduler.xml`
     * * core:   `core-site.xml`
     * * distcp: `distcp-default.xml`
     * * hdfs:   `hdfs-site.xml`
     * * hive:   `hive-site.xml`
     * * mapred: `mapred-site.xml`
     * * pig:    `pig.properties`
     * * spark:  `spark-defaults.conf`
     * * yarn:   `yarn-site.xml`
     * For more information, see
     * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 2;</code>
     */

    public Builder putAllProperties(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableProperties().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.SoftwareConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.SoftwareConfig)
  private static final com.google.cloud.dataproc.v1.SoftwareConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.SoftwareConfig();
  }

  public static com.google.cloud.dataproc.v1.SoftwareConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SoftwareConfig>
      PARSER = new com.google.protobuf.AbstractParser<SoftwareConfig>() {
    @java.lang.Override
    public SoftwareConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SoftwareConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SoftwareConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SoftwareConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.SoftwareConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

