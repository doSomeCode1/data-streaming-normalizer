// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/ema/dto/normalized_data_point.proto

package org.ema.dto;

public final class NormalizedDataPointOuterClass {
  private NormalizedDataPointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ema_dto_NormalizedDataPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ema_dto_NormalizedDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ema_dto_TicketingEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ema_dto_TicketingEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_ema_dto_RecruitingEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_ema_dto_RecruitingEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'org/ema/dto/normalized_data_point.prot" +
      "o\022\013org.ema.dto\"\270\001\n\023NormalizedDataPoint\022\n" +
      "\n\002id\030\001 \001(\t\022\022\n\npartner_id\030\002 \001(\t\0228\n\020recrui" +
      "ting_event\030\003 \001(\0132\034.org.ema.dto.Recruitin" +
      "gEventH\000\0226\n\017ticketing_event\030\004 \001(\0132\033.org." +
      "ema.dto.TicketingEventH\000B\017\n\rinput_messag" +
      "e\"\344\001\n\016TicketingEvent\022\014\n\004name\030\001 \001(\t\022\023\n\013de" +
      "scription\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\020\n\010assign" +
      "ee\030\004 \001(\t\0222\n\006status\030\005 \001(\0162\".org.ema.dto.T" +
      "icketingEvent.Status\"Z\n\006Status\022\026\n\022STATUS" +
      "_UNSPECIFIED\020\000\022\017\n\013STATUS_OPEN\020\001\022\026\n\022STATU" +
      "S_IN_PROGRESS\020\002\022\017\n\013STATUS_DONE\020\003\"n\n\017Recr" +
      "uitingEvent\022\014\n\004name\030\001 \001(\t\022\r\n\005title\030\003 \001(\t" +
      "\022\020\n\010assignee\030\004 \001(\t\022\033\n\023years_of_experienc" +
      "e\030\005 \001(\003\022\017\n\007company\030\006 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_ema_dto_NormalizedDataPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_ema_dto_NormalizedDataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ema_dto_NormalizedDataPoint_descriptor,
        new java.lang.String[] { "Id", "PartnerId", "RecruitingEvent", "TicketingEvent", "InputMessage", });
    internal_static_org_ema_dto_TicketingEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_ema_dto_TicketingEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ema_dto_TicketingEvent_descriptor,
        new java.lang.String[] { "Name", "Description", "Title", "Assignee", "Status", });
    internal_static_org_ema_dto_RecruitingEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_ema_dto_RecruitingEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_ema_dto_RecruitingEvent_descriptor,
        new java.lang.String[] { "Name", "Title", "Assignee", "YearsOfExperience", "Company", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}