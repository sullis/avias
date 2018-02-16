package org.lyranthe.araethura.logs.http4s
import org.http4s.Method._
import org.lyranthe.araethura.logs.circe._
import org.lyranthe.araethura.logs.models
class AmazonlogsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.logs.Amazonlogs[F] {
  private[this] final val ServiceType: String = "logs"
  private[this] final val ServiceAndPrefix: Option[String] = Some("Logs_20140328")
  override def putRetentionPolicy(input: org.lyranthe.araethura.logs.models.PutRetentionPolicyRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.PutRetentionPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutRetentionPolicy", POST, "/", input)
  override def disassociateKmsKey(input: org.lyranthe.araethura.logs.models.DisassociateKmsKeyRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DisassociateKmsKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisassociateKmsKey", POST, "/", input)
  override def putLogEvents(input: org.lyranthe.araethura.logs.models.PutLogEventsRequest): F[org.lyranthe.araethura.logs.models.PutLogEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.PutLogEventsResponse, org.lyranthe.araethura.logs.models.PutLogEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutLogEvents", POST, "/", input)
  override def describeResourcePolicies(input: org.lyranthe.araethura.logs.models.DescribeResourcePoliciesRequest): F[org.lyranthe.araethura.logs.models.DescribeResourcePoliciesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeResourcePoliciesResponse, org.lyranthe.araethura.logs.models.DescribeResourcePoliciesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeResourcePolicies", POST, "/", input)
  override def describeExportTasks(input: org.lyranthe.araethura.logs.models.DescribeExportTasksRequest): F[org.lyranthe.araethura.logs.models.DescribeExportTasksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeExportTasksResponse, org.lyranthe.araethura.logs.models.DescribeExportTasksRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeExportTasks", POST, "/", input)
  override def putDestination(input: org.lyranthe.araethura.logs.models.PutDestinationRequest): F[org.lyranthe.araethura.logs.models.PutDestinationResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.PutDestinationResponse, org.lyranthe.araethura.logs.models.PutDestinationRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutDestination", POST, "/", input)
  override def describeSubscriptionFilters(input: org.lyranthe.araethura.logs.models.DescribeSubscriptionFiltersRequest): F[org.lyranthe.araethura.logs.models.DescribeSubscriptionFiltersResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeSubscriptionFiltersResponse, org.lyranthe.araethura.logs.models.DescribeSubscriptionFiltersRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSubscriptionFilters", POST, "/", input)
  override def listTagsLogGroup(input: org.lyranthe.araethura.logs.models.ListTagsLogGroupRequest): F[org.lyranthe.araethura.logs.models.ListTagsLogGroupResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.ListTagsLogGroupResponse, org.lyranthe.araethura.logs.models.ListTagsLogGroupRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTagsLogGroup", POST, "/", input)
  override def tagLogGroup(input: org.lyranthe.araethura.logs.models.TagLogGroupRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.TagLogGroupRequest](client, awsData, ServiceType, ServiceAndPrefix, "TagLogGroup", POST, "/", input)
  override def deleteResourcePolicy(input: org.lyranthe.araethura.logs.models.DeleteResourcePolicyRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteResourcePolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteResourcePolicy", POST, "/", input)
  override def createExportTask(input: org.lyranthe.araethura.logs.models.CreateExportTaskRequest): F[org.lyranthe.araethura.logs.models.CreateExportTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.CreateExportTaskResponse, org.lyranthe.araethura.logs.models.CreateExportTaskRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateExportTask", POST, "/", input)
  override def deleteDestination(input: org.lyranthe.araethura.logs.models.DeleteDestinationRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteDestinationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteDestination", POST, "/", input)
  override def deleteRetentionPolicy(input: org.lyranthe.araethura.logs.models.DeleteRetentionPolicyRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteRetentionPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteRetentionPolicy", POST, "/", input)
  override def deleteLogStream(input: org.lyranthe.araethura.logs.models.DeleteLogStreamRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteLogStreamRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteLogStream", POST, "/", input)
  override def deleteLogGroup(input: org.lyranthe.araethura.logs.models.DeleteLogGroupRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteLogGroupRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteLogGroup", POST, "/", input)
  override def getLogEvents(input: org.lyranthe.araethura.logs.models.GetLogEventsRequest): F[org.lyranthe.araethura.logs.models.GetLogEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.GetLogEventsResponse, org.lyranthe.araethura.logs.models.GetLogEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetLogEvents", POST, "/", input)
  override def describeMetricFilters(input: org.lyranthe.araethura.logs.models.DescribeMetricFiltersRequest): F[org.lyranthe.araethura.logs.models.DescribeMetricFiltersResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeMetricFiltersResponse, org.lyranthe.araethura.logs.models.DescribeMetricFiltersRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMetricFilters", POST, "/", input)
  override def putDestinationPolicy(input: org.lyranthe.araethura.logs.models.PutDestinationPolicyRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.PutDestinationPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutDestinationPolicy", POST, "/", input)
  override def putSubscriptionFilter(input: org.lyranthe.araethura.logs.models.PutSubscriptionFilterRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.PutSubscriptionFilterRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutSubscriptionFilter", POST, "/", input)
  override def describeLogStreams(input: org.lyranthe.araethura.logs.models.DescribeLogStreamsRequest): F[org.lyranthe.araethura.logs.models.DescribeLogStreamsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeLogStreamsResponse, org.lyranthe.araethura.logs.models.DescribeLogStreamsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeLogStreams", POST, "/", input)
  override def associateKmsKey(input: org.lyranthe.araethura.logs.models.AssociateKmsKeyRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.AssociateKmsKeyRequest](client, awsData, ServiceType, ServiceAndPrefix, "AssociateKmsKey", POST, "/", input)
  override def filterLogEvents(input: org.lyranthe.araethura.logs.models.FilterLogEventsRequest): F[org.lyranthe.araethura.logs.models.FilterLogEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.FilterLogEventsResponse, org.lyranthe.araethura.logs.models.FilterLogEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "FilterLogEvents", POST, "/", input)
  override def describeDestinations(input: org.lyranthe.araethura.logs.models.DescribeDestinationsRequest): F[org.lyranthe.araethura.logs.models.DescribeDestinationsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeDestinationsResponse, org.lyranthe.araethura.logs.models.DescribeDestinationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeDestinations", POST, "/", input)
  override def createLogStream(input: org.lyranthe.araethura.logs.models.CreateLogStreamRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.CreateLogStreamRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateLogStream", POST, "/", input)
  override def cancelExportTask(input: org.lyranthe.araethura.logs.models.CancelExportTaskRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.CancelExportTaskRequest](client, awsData, ServiceType, ServiceAndPrefix, "CancelExportTask", POST, "/", input)
  override def deleteSubscriptionFilter(input: org.lyranthe.araethura.logs.models.DeleteSubscriptionFilterRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteSubscriptionFilterRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteSubscriptionFilter", POST, "/", input)
  override def untagLogGroup(input: org.lyranthe.araethura.logs.models.UntagLogGroupRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.UntagLogGroupRequest](client, awsData, ServiceType, ServiceAndPrefix, "UntagLogGroup", POST, "/", input)
  override def deleteMetricFilter(input: org.lyranthe.araethura.logs.models.DeleteMetricFilterRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.DeleteMetricFilterRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteMetricFilter", POST, "/", input)
  override def testMetricFilter(input: org.lyranthe.araethura.logs.models.TestMetricFilterRequest): F[org.lyranthe.araethura.logs.models.TestMetricFilterResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.TestMetricFilterResponse, org.lyranthe.araethura.logs.models.TestMetricFilterRequest](client, awsData, ServiceType, ServiceAndPrefix, "TestMetricFilter", POST, "/", input)
  override def putResourcePolicy(input: org.lyranthe.araethura.logs.models.PutResourcePolicyRequest): F[org.lyranthe.araethura.logs.models.PutResourcePolicyResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.PutResourcePolicyResponse, org.lyranthe.araethura.logs.models.PutResourcePolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutResourcePolicy", POST, "/", input)
  override def putMetricFilter(input: org.lyranthe.araethura.logs.models.PutMetricFilterRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.PutMetricFilterRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutMetricFilter", POST, "/", input)
  override def createLogGroup(input: org.lyranthe.araethura.logs.models.CreateLogGroupRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.logs.models.CreateLogGroupRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateLogGroup", POST, "/", input)
  override def describeLogGroups(input: org.lyranthe.araethura.logs.models.DescribeLogGroupsRequest): F[org.lyranthe.araethura.logs.models.DescribeLogGroupsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.logs.models.DescribeLogGroupsResponse, org.lyranthe.araethura.logs.models.DescribeLogGroupsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeLogGroups", POST, "/", input)
}