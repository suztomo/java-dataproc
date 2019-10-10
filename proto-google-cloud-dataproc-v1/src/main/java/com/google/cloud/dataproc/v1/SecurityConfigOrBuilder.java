// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface SecurityConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.SecurityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
   */
  boolean hasKerberosConfig();
  /**
   *
   *
   * <pre>
   * Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
   */
  com.google.cloud.dataproc.v1.KerberosConfig getKerberosConfig();
  /**
   *
   *
   * <pre>
   * Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
   */
  com.google.cloud.dataproc.v1.KerberosConfigOrBuilder getKerberosConfigOrBuilder();
}