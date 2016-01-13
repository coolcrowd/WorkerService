// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: population_list.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

/**
 * Protobuf type {@code crowdcontrol.PopulationList}
 */
public  final class PopulationList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:crowdcontrol.PopulationList)
    PopulationListOrBuilder {
  // Use PopulationList.newBuilder() to construct.
  private PopulationList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PopulationList() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PopulationList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              items_ = new java.util.ArrayList<edu.kit.ipd.crowdcontrol.objectservice.proto.Population>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(input.readMessage(edu.kit.ipd.crowdcontrol.objectservice.proto.Population.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationListOuterClass.internal_static_crowdcontrol_PopulationList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationListOuterClass.internal_static_crowdcontrol_PopulationList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.class, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> items_;
  /**
   * <code>repeated .crowdcontrol.Population items = 1;</code>
   */
  public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .crowdcontrol.Population items = 1;</code>
   */
  public java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .crowdcontrol.Population items = 1;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .crowdcontrol.Population items = 1;</code>
   */
  public edu.kit.ipd.crowdcontrol.objectservice.proto.Population getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .crowdcontrol.Population items = 1;</code>
   */
  public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code crowdcontrol.PopulationList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crowdcontrol.PopulationList)
      edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationListOuterClass.internal_static_crowdcontrol_PopulationList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationListOuterClass.internal_static_crowdcontrol_PopulationList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.class, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.Builder.class);
    }

    // Construct using edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationListOuterClass.internal_static_crowdcontrol_PopulationList_descriptor;
    }

    public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList getDefaultInstanceForType() {
      return edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.getDefaultInstance();
    }

    public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList build() {
      edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList buildPartial() {
      edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList result = new edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList(this);
      int from_bitField0_ = bitField0_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList) {
        return mergeFrom((edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList other) {
      if (other == edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        items_ = new java.util.ArrayList<edu.kit.ipd.crowdcontrol.objectservice.proto.Population>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        edu.kit.ipd.crowdcontrol.objectservice.proto.Population, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.Population getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder setItems(
        int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder setItems(
        int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder addItems(edu.kit.ipd.crowdcontrol.objectservice.proto.Population value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder addItems(
        int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder addItems(
        edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder addItems(
        int index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.Population> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          edu.kit.ipd.crowdcontrol.objectservice.proto.Population.getDefaultInstance());
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.getDefaultInstance());
    }
    /**
     * <code>repeated .crowdcontrol.Population items = 1;</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        edu.kit.ipd.crowdcontrol.objectservice.proto.Population, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            edu.kit.ipd.crowdcontrol.objectservice.proto.Population, edu.kit.ipd.crowdcontrol.objectservice.proto.Population.Builder, edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:crowdcontrol.PopulationList)
  }

  // @@protoc_insertion_point(class_scope:crowdcontrol.PopulationList)
  private static final edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList();
  }

  public static edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PopulationList>
      PARSER = new com.google.protobuf.AbstractParser<PopulationList>() {
    public PopulationList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new PopulationList(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<PopulationList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PopulationList> getParserForType() {
    return PARSER;
  }

  public edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

