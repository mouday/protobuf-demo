// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.example.protos;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_protos_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_protos_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_protos_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_protos_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_protos_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_protos_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021addressbook.proto\022\022com.example.protos\"" +
      "\260\002\n\006Person\022\017\n\002id\030\001 \001(\005H\000\210\001\001\022\021\n\004name\030\002 \001(" +
      "\tH\001\210\001\001\022\022\n\005email\030\003 \001(\tH\002\210\001\001\0226\n\006phones\030\004 \003" +
      "(\0132&.com.example.protos.Person.PhoneNumb" +
      "er\032o\n\013PhoneNumber\022\023\n\006number\030\001 \001(\tH\000\210\001\001\0227" +
      "\n\004type\030\002 \001(\0162$.com.example.protos.Person" +
      ".PhoneTypeH\001\210\001\001B\t\n\007_numberB\007\n\005_type\"+\n\tP" +
      "honeType\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002" +
      "B\005\n\003_idB\007\n\005_nameB\010\n\006_email\"9\n\013AddressBoo" +
      "k\022*\n\006people\030\001 \003(\0132\032.com.example.protos.P" +
      "ersonB)\n\022com.example.protosB\021AddressBook" +
      "ProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_protos_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_protos_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_protos_Person_descriptor,
        new java.lang.String[] { "Id", "Name", "Email", "Phones", "Id", "Name", "Email", });
    internal_static_com_example_protos_Person_PhoneNumber_descriptor =
      internal_static_com_example_protos_Person_descriptor.getNestedTypes().get(0);
    internal_static_com_example_protos_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_protos_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", "Number", "Type", });
    internal_static_com_example_protos_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_protos_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_protos_AddressBook_descriptor,
        new java.lang.String[] { "People", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
