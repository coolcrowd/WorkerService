// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: algorithm_option.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public interface AlgorithmOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crowdcontrol.AlgorithmOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .crowdcontrol.AlgorithmOption.AlgorithmParameter parameters = 7;</code>
   */
  java.util.List<edu.kit.ipd.crowdcontrol.objectservice.proto.AlgorithmOption.AlgorithmParameter> 
      getParametersList();
  /**
   * <code>repeated .crowdcontrol.AlgorithmOption.AlgorithmParameter parameters = 7;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.AlgorithmOption.AlgorithmParameter getParameters(int index);
  /**
   * <code>repeated .crowdcontrol.AlgorithmOption.AlgorithmParameter parameters = 7;</code>
   */
  int getParametersCount();
  /**
   * <code>repeated .crowdcontrol.AlgorithmOption.AlgorithmParameter parameters = 7;</code>
   */
  java.util.List<? extends edu.kit.ipd.crowdcontrol.objectservice.proto.AlgorithmOption.AlgorithmParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <code>repeated .crowdcontrol.AlgorithmOption.AlgorithmParameter parameters = 7;</code>
   */
  edu.kit.ipd.crowdcontrol.objectservice.proto.AlgorithmOption.AlgorithmParameterOrBuilder getParametersOrBuilder(
      int index);
}
