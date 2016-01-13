// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: experiment.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public final class ExperimentOuterClass {
  private ExperimentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_crowdcontrol_Experiment_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_crowdcontrol_Experiment_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_crowdcontrol_Experiment_PlaceholdersEntry_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_crowdcontrol_Experiment_PlaceholdersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020experiment.proto\022\014crowdcontrol\032\021answer" +
      "_type.proto\032\020constraint.proto\032\020populatio" +
      "n.proto\032\ttag.proto\"\224\005\n\nExperiment\022\n\n\002id\030" +
      "\001 \001(\005\022\r\n\005title\030\002 \001(\t\022\023\n\013description\030\003 \001(" +
      "\t\022-\n\005state\030\004 \001(\0162\036.crowdcontrol.Experime" +
      "nt.State\022-\n\013answer_type\030\005 \001(\0162\030.crowdcon" +
      "trol.AnswerType\022\036\n\026algorithm_task_choose" +
      "r\030\006 \001(\t\022 \n\030algorithm_quality_answer\030\007 \001(" +
      "\t\022 \n\030algorithm_quality_rating\030\010 \001(\t\022\032\n\022r" +
      "atings_per_answer\030\t \001(\005\022\024\n\014payment_base\030",
      "\n \001(\005\022\026\n\016payment_answer\030\013 \001(\005\022\026\n\016payment" +
      "_rating\030\014 \001(\005\022-\n\013constraints\030\r \003(\0132\030.cro" +
      "wdcontrol.Constraint\022\037\n\004tags\030\016 \003(\0132\021.cro" +
      "wdcontrol.Tag\022-\n\013populations\030\017 \003(\0132\030.cro" +
      "wdcontrol.Population\022@\n\014placeholders\030\020 \003" +
      "(\0132*.crowdcontrol.Experiment.Placeholder" +
      "sEntry\0323\n\021PlaceholdersEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t:\0028\001\"<\n\005State\022\t\n\005DRAFT\020\000\022" +
      "\r\n\tPUBLISHED\020\001\022\014\n\010STOPPING\020\002\022\013\n\007STOPPED\020" +
      "\003B0\n,edu.kit.ipd.crowdcontrol.objectserv",
      "ice.protoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          edu.kit.ipd.crowdcontrol.objectservice.proto.AnswerTypeOuterClass.getDescriptor(),
          edu.kit.ipd.crowdcontrol.objectservice.proto.ConstraintOuterClass.getDescriptor(),
          edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOuterClass.getDescriptor(),
          edu.kit.ipd.crowdcontrol.objectservice.proto.TagOuterClass.getDescriptor(),
        }, assigner);
    internal_static_crowdcontrol_Experiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crowdcontrol_Experiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_crowdcontrol_Experiment_descriptor,
        new java.lang.String[] { "Id", "Title", "Description", "State", "AnswerType", "AlgorithmTaskChooser", "AlgorithmQualityAnswer", "AlgorithmQualityRating", "RatingsPerAnswer", "PaymentBase", "PaymentAnswer", "PaymentRating", "Constraints", "Tags", "Populations", "Placeholders", });
    internal_static_crowdcontrol_Experiment_PlaceholdersEntry_descriptor =
      internal_static_crowdcontrol_Experiment_descriptor.getNestedTypes().get(0);
    internal_static_crowdcontrol_Experiment_PlaceholdersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_crowdcontrol_Experiment_PlaceholdersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    edu.kit.ipd.crowdcontrol.objectservice.proto.AnswerTypeOuterClass.getDescriptor();
    edu.kit.ipd.crowdcontrol.objectservice.proto.ConstraintOuterClass.getDescriptor();
    edu.kit.ipd.crowdcontrol.objectservice.proto.PopulationOuterClass.getDescriptor();
    edu.kit.ipd.crowdcontrol.objectservice.proto.TagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
