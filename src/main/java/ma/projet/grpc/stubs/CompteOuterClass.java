// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

public final class CompteOuterClass {
  private CompteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Compte_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Compte_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SoldeStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SoldeStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllComptesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllComptesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllComptesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllComptesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCompteByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCompteByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCompteByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCompteByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetTotalSoldeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetTotalSoldeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetTotalSoldeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetTotalSoldeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCompteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCompteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetComptesByTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetComptesByTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetComptesByTypeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetComptesByTypeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteCompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteCompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteCompteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteCompteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014compte.proto\"T\n\006Compte\022\n\n\002id\030\001 \001(\t\022\r\n\005" +
      "solde\030\002 \001(\002\022\024\n\014dateCreation\030\003 \001(\t\022\031\n\004typ" +
      "e\030\004 \001(\0162\013.TypeCompte\"O\n\rCompteRequest\022\r\n" +
      "\005solde\030\001 \001(\002\022\024\n\014dateCreation\030\002 \001(\t\022\031\n\004ty" +
      "pe\030\003 \001(\0162\013.TypeCompte\"9\n\nSoldeStats\022\r\n\005c" +
      "ount\030\001 \001(\005\022\013\n\003sum\030\002 \001(\002\022\017\n\007average\030\003 \001(\002" +
      "\"\026\n\024GetAllComptesRequest\"1\n\025GetAllCompte" +
      "sResponse\022\030\n\007comptes\030\001 \003(\0132\007.Compte\"\"\n\024G" +
      "etCompteByIdRequest\022\n\n\002id\030\001 \001(\t\"0\n\025GetCo" +
      "mpteByIdResponse\022\027\n\006compte\030\001 \001(\0132\007.Compt" +
      "e\"\026\n\024GetTotalSoldeRequest\"3\n\025GetTotalSol" +
      "deResponse\022\032\n\005stats\030\001 \001(\0132\013.SoldeStats\"3" +
      "\n\021SaveCompteRequest\022\036\n\006compte\030\001 \001(\0132\016.Co" +
      "mpteRequest\"-\n\022SaveCompteResponse\022\027\n\006com" +
      "pte\030\001 \001(\0132\007.Compte\"\'\n\027GetComptesByTypeRe" +
      "quest\022\014\n\004type\030\001 \001(\t\"4\n\030GetComptesByTypeR" +
      "esponse\022\030\n\007comptes\030\001 \003(\0132\007.Compte\"!\n\023Del" +
      "eteCompteRequest\022\n\n\002id\030\001 \001(\t\"\'\n\024DeleteCo" +
      "mpteResponse\022\017\n\007success\030\001 \001(\010*&\n\nTypeCom" +
      "pte\022\013\n\007COURANT\020\000\022\013\n\007EPARGNE\020\0012\204\003\n\rCompte" +
      "Service\022;\n\nAllComptes\022\025.GetAllComptesReq" +
      "uest\032\026.GetAllComptesResponse\022;\n\nCompteBy" +
      "Id\022\025.GetCompteByIdRequest\032\026.GetCompteByI" +
      "dResponse\022;\n\nTotalSolde\022\025.GetTotalSoldeR" +
      "equest\032\026.GetTotalSoldeResponse\0225\n\nSaveCo" +
      "mpte\022\022.SaveCompteRequest\032\023.SaveCompteRes" +
      "ponse\022H\n\021FindComptesByType\022\030.GetComptesB" +
      "yTypeRequest\032\031.GetComptesByTypeResponse\022" +
      ";\n\014DeleteCompte\022\024.DeleteCompteRequest\032\025." +
      "DeleteCompteResponseB\030\n\024ma.projet.grpc.s" +
      "tubsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Compte_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Compte_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Compte_descriptor,
        new java.lang.String[] { "Id", "Solde", "DateCreation", "Type", });
    internal_static_CompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CompteRequest_descriptor,
        new java.lang.String[] { "Solde", "DateCreation", "Type", });
    internal_static_SoldeStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SoldeStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SoldeStats_descriptor,
        new java.lang.String[] { "Count", "Sum", "Average", });
    internal_static_GetAllComptesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetAllComptesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllComptesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetAllComptesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetAllComptesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllComptesResponse_descriptor,
        new java.lang.String[] { "Comptes", });
    internal_static_GetCompteByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetCompteByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCompteByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetCompteByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GetCompteByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCompteByIdResponse_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_GetTotalSoldeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GetTotalSoldeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetTotalSoldeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetTotalSoldeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GetTotalSoldeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetTotalSoldeResponse_descriptor,
        new java.lang.String[] { "Stats", });
    internal_static_SaveCompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_SaveCompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCompteRequest_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_SaveCompteResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_SaveCompteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCompteResponse_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_GetComptesByTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_GetComptesByTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetComptesByTypeRequest_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_GetComptesByTypeResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_GetComptesByTypeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetComptesByTypeResponse_descriptor,
        new java.lang.String[] { "Comptes", });
    internal_static_DeleteCompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_DeleteCompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteCompteRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_DeleteCompteResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_DeleteCompteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteCompteResponse_descriptor,
        new java.lang.String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
