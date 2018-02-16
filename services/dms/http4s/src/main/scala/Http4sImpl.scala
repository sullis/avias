package org.lyranthe.araethura.dms.http4s
import org.http4s.Method._
import org.lyranthe.araethura.dms.circe._
import org.lyranthe.araethura.dms.models
class AmazondmsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.dms.Amazondms[F] {
  private[this] final val ServiceType: String = "dms"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AmazonDMSv20160101")
  override def describeTableStatistics(input: org.lyranthe.araethura.dms.models.DescribeTableStatisticsMessage): F[org.lyranthe.araethura.dms.models.DescribeTableStatisticsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeTableStatisticsResponse, org.lyranthe.araethura.dms.models.DescribeTableStatisticsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTableStatistics", POST, "/", input)
  override def modifyEventSubscription(input: org.lyranthe.araethura.dms.models.ModifyEventSubscriptionMessage): F[org.lyranthe.araethura.dms.models.ModifyEventSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ModifyEventSubscriptionResponse, org.lyranthe.araethura.dms.models.ModifyEventSubscriptionMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyEventSubscription", POST, "/", input)
  override def describeReplicationInstances(input: org.lyranthe.araethura.dms.models.DescribeReplicationInstancesMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationInstancesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeReplicationInstancesResponse, org.lyranthe.araethura.dms.models.DescribeReplicationInstancesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationInstances", POST, "/", input)
  override def describeCertificates(input: org.lyranthe.araethura.dms.models.DescribeCertificatesMessage): F[org.lyranthe.araethura.dms.models.DescribeCertificatesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeCertificatesResponse, org.lyranthe.araethura.dms.models.DescribeCertificatesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCertificates", POST, "/", input)
  override def deleteCertificate(input: org.lyranthe.araethura.dms.models.DeleteCertificateMessage): F[org.lyranthe.araethura.dms.models.DeleteCertificateResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DeleteCertificateResponse, org.lyranthe.araethura.dms.models.DeleteCertificateMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteCertificate", POST, "/", input)
  override def stopReplicationTask(input: org.lyranthe.araethura.dms.models.StopReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.StopReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.StopReplicationTaskResponse, org.lyranthe.araethura.dms.models.StopReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "StopReplicationTask", POST, "/", input)
  override def describeEndpointTypes(input: org.lyranthe.araethura.dms.models.DescribeEndpointTypesMessage): F[org.lyranthe.araethura.dms.models.DescribeEndpointTypesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeEndpointTypesResponse, org.lyranthe.araethura.dms.models.DescribeEndpointTypesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEndpointTypes", POST, "/", input)
  override def startReplicationTaskAssessment(input: org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentMessage): F[org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentResponse, org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentMessage](client, awsData, ServiceType, ServiceAndPrefix, "StartReplicationTaskAssessment", POST, "/", input)
  override def modifyReplicationTask(input: org.lyranthe.araethura.dms.models.ModifyReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.ModifyReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ModifyReplicationTaskResponse, org.lyranthe.araethura.dms.models.ModifyReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyReplicationTask", POST, "/", input)
  override def deleteReplicationTask(input: org.lyranthe.araethura.dms.models.DeleteReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.DeleteReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DeleteReplicationTaskResponse, org.lyranthe.araethura.dms.models.DeleteReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationTask", POST, "/", input)
  override def startReplicationTask(input: org.lyranthe.araethura.dms.models.StartReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.StartReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.StartReplicationTaskResponse, org.lyranthe.araethura.dms.models.StartReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "StartReplicationTask", POST, "/", input)
  override def createReplicationInstance(input: org.lyranthe.araethura.dms.models.CreateReplicationInstanceMessage): F[org.lyranthe.araethura.dms.models.CreateReplicationInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.CreateReplicationInstanceResponse, org.lyranthe.araethura.dms.models.CreateReplicationInstanceMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationInstance", POST, "/", input)
  override def describeEventCategories(input: org.lyranthe.araethura.dms.models.DescribeEventCategoriesMessage): F[org.lyranthe.araethura.dms.models.DescribeEventCategoriesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeEventCategoriesResponse, org.lyranthe.araethura.dms.models.DescribeEventCategoriesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventCategories", POST, "/", input)
  override def deleteEventSubscription(input: org.lyranthe.araethura.dms.models.DeleteEventSubscriptionMessage): F[org.lyranthe.araethura.dms.models.DeleteEventSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DeleteEventSubscriptionResponse, org.lyranthe.araethura.dms.models.DeleteEventSubscriptionMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteEventSubscription", POST, "/", input)
  override def testConnection(input: org.lyranthe.araethura.dms.models.TestConnectionMessage): F[org.lyranthe.araethura.dms.models.TestConnectionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.TestConnectionResponse, org.lyranthe.araethura.dms.models.TestConnectionMessage](client, awsData, ServiceType, ServiceAndPrefix, "TestConnection", POST, "/", input)
  override def describeConnections(input: org.lyranthe.araethura.dms.models.DescribeConnectionsMessage): F[org.lyranthe.araethura.dms.models.DescribeConnectionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeConnectionsResponse, org.lyranthe.araethura.dms.models.DescribeConnectionsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeConnections", POST, "/", input)
  override def listTagsForResource(input: org.lyranthe.araethura.dms.models.ListTagsForResourceMessage): F[org.lyranthe.araethura.dms.models.ListTagsForResourceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ListTagsForResourceResponse, org.lyranthe.araethura.dms.models.ListTagsForResourceMessage](client, awsData, ServiceType, ServiceAndPrefix, "ListTagsForResource", POST, "/", input)
  override def createEventSubscription(input: org.lyranthe.araethura.dms.models.CreateEventSubscriptionMessage): F[org.lyranthe.araethura.dms.models.CreateEventSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.CreateEventSubscriptionResponse, org.lyranthe.araethura.dms.models.CreateEventSubscriptionMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateEventSubscription", POST, "/", input)
  override def describeOrderableReplicationInstances(input: org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesMessage): F[org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesResponse, org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeOrderableReplicationInstances", POST, "/", input)
  override def describeReplicationTasks(input: org.lyranthe.araethura.dms.models.DescribeReplicationTasksMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationTasksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeReplicationTasksResponse, org.lyranthe.araethura.dms.models.DescribeReplicationTasksMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationTasks", POST, "/", input)
  override def modifyReplicationSubnetGroup(input: org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupMessage): F[org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupResponse, org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyReplicationSubnetGroup", POST, "/", input)
  override def describeReplicationTaskAssessmentResults(input: org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsResponse, org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationTaskAssessmentResults", POST, "/", input)
  override def describeReplicationSubnetGroups(input: org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsResponse, org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReplicationSubnetGroups", POST, "/", input)
  override def deleteReplicationInstance(input: org.lyranthe.araethura.dms.models.DeleteReplicationInstanceMessage): F[org.lyranthe.araethura.dms.models.DeleteReplicationInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DeleteReplicationInstanceResponse, org.lyranthe.araethura.dms.models.DeleteReplicationInstanceMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationInstance", POST, "/", input)
  override def createReplicationSubnetGroup(input: org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupMessage): F[org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupResponse, org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationSubnetGroup", POST, "/", input)
  override def createReplicationTask(input: org.lyranthe.araethura.dms.models.CreateReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.CreateReplicationTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.CreateReplicationTaskResponse, org.lyranthe.araethura.dms.models.CreateReplicationTaskMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationTask", POST, "/", input)
  override def addTagsToResource(input: org.lyranthe.araethura.dms.models.AddTagsToResourceMessage): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.dms.models.AddTagsToResourceMessage](client, awsData, ServiceType, ServiceAndPrefix, "AddTagsToResource", POST, "/", input)
  override def describeEndpoints(input: org.lyranthe.araethura.dms.models.DescribeEndpointsMessage): F[org.lyranthe.araethura.dms.models.DescribeEndpointsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeEndpointsResponse, org.lyranthe.araethura.dms.models.DescribeEndpointsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEndpoints", POST, "/", input)
  override def removeTagsFromResource(input: org.lyranthe.araethura.dms.models.RemoveTagsFromResourceMessage): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.dms.models.RemoveTagsFromResourceMessage](client, awsData, ServiceType, ServiceAndPrefix, "RemoveTagsFromResource", POST, "/", input)
  override def importCertificate(input: org.lyranthe.araethura.dms.models.ImportCertificateMessage): F[org.lyranthe.araethura.dms.models.ImportCertificateResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ImportCertificateResponse, org.lyranthe.araethura.dms.models.ImportCertificateMessage](client, awsData, ServiceType, ServiceAndPrefix, "ImportCertificate", POST, "/", input)
  override def modifyEndpoint(input: org.lyranthe.araethura.dms.models.ModifyEndpointMessage): F[org.lyranthe.araethura.dms.models.ModifyEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ModifyEndpointResponse, org.lyranthe.araethura.dms.models.ModifyEndpointMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyEndpoint", POST, "/", input)
  override def describeEventSubscriptions(input: org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsMessage): F[org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsResponse, org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventSubscriptions", POST, "/", input)
  override def deleteReplicationSubnetGroup(input: org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupMessage): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationSubnetGroup", POST, "/", input)
  override def describeEvents(input: org.lyranthe.araethura.dms.models.DescribeEventsMessage): F[org.lyranthe.araethura.dms.models.DescribeEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeEventsResponse, org.lyranthe.araethura.dms.models.DescribeEventsMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEvents", POST, "/", input)
  override def describeRefreshSchemasStatus(input: org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusMessage): F[org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusResponse, org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeRefreshSchemasStatus", POST, "/", input)
  override def describeAccountAttributes: F[org.lyranthe.araethura.dms.models.DescribeAccountAttributesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeAccountAttributesResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAccountAttributes", POST, "/", ())
  override def refreshSchemas(input: org.lyranthe.araethura.dms.models.RefreshSchemasMessage): F[org.lyranthe.araethura.dms.models.RefreshSchemasResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.RefreshSchemasResponse, org.lyranthe.araethura.dms.models.RefreshSchemasMessage](client, awsData, ServiceType, ServiceAndPrefix, "RefreshSchemas", POST, "/", input)
  override def reloadTables(input: org.lyranthe.araethura.dms.models.ReloadTablesMessage): F[org.lyranthe.araethura.dms.models.ReloadTablesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ReloadTablesResponse, org.lyranthe.araethura.dms.models.ReloadTablesMessage](client, awsData, ServiceType, ServiceAndPrefix, "ReloadTables", POST, "/", input)
  override def deleteEndpoint(input: org.lyranthe.araethura.dms.models.DeleteEndpointMessage): F[org.lyranthe.araethura.dms.models.DeleteEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DeleteEndpointResponse, org.lyranthe.araethura.dms.models.DeleteEndpointMessage](client, awsData, ServiceType, ServiceAndPrefix, "DeleteEndpoint", POST, "/", input)
  override def createEndpoint(input: org.lyranthe.araethura.dms.models.CreateEndpointMessage): F[org.lyranthe.araethura.dms.models.CreateEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.CreateEndpointResponse, org.lyranthe.araethura.dms.models.CreateEndpointMessage](client, awsData, ServiceType, ServiceAndPrefix, "CreateEndpoint", POST, "/", input)
  override def modifyReplicationInstance(input: org.lyranthe.araethura.dms.models.ModifyReplicationInstanceMessage): F[org.lyranthe.araethura.dms.models.ModifyReplicationInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.ModifyReplicationInstanceResponse, org.lyranthe.araethura.dms.models.ModifyReplicationInstanceMessage](client, awsData, ServiceType, ServiceAndPrefix, "ModifyReplicationInstance", POST, "/", input)
  override def describeSchemas(input: org.lyranthe.araethura.dms.models.DescribeSchemasMessage): F[org.lyranthe.araethura.dms.models.DescribeSchemasResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.dms.models.DescribeSchemasResponse, org.lyranthe.araethura.dms.models.DescribeSchemasMessage](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSchemas", POST, "/", input)
}