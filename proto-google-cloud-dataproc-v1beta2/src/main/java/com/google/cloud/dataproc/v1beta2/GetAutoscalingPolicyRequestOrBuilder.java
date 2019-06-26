// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

package com.google.cloud.dataproc.v1beta2;

public interface GetAutoscalingPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.GetAutoscalingPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}