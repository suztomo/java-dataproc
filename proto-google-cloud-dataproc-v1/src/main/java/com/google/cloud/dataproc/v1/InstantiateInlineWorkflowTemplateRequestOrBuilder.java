// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface InstantiateInlineWorkflowTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The "resource name" of the workflow template region, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The "resource name" of the workflow template region, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The workflow template to instantiate.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowTemplate template = 2;</code>
   */
  boolean hasTemplate();
  /**
   * <pre>
   * Required. The workflow template to instantiate.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowTemplate template = 2;</code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate();
  /**
   * <pre>
   * Required. The workflow template to instantiate.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.WorkflowTemplate template = 2;</code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder();

  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
