package org.lyranthe.araethura.dms
trait Amazondms[F[_]] {
  def describeTableStatistics(input: org.lyranthe.araethura.dms.models.DescribeTableStatisticsMessage): F[org.lyranthe.araethura.dms.models.DescribeTableStatisticsResponse]
  def modifyEventSubscription(input: org.lyranthe.araethura.dms.models.ModifyEventSubscriptionMessage): F[org.lyranthe.araethura.dms.models.ModifyEventSubscriptionResponse]
  def describeReplicationInstances(input: org.lyranthe.araethura.dms.models.DescribeReplicationInstancesMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationInstancesResponse]
  def describeCertificates(input: org.lyranthe.araethura.dms.models.DescribeCertificatesMessage): F[org.lyranthe.araethura.dms.models.DescribeCertificatesResponse]
  def deleteCertificate(input: org.lyranthe.araethura.dms.models.DeleteCertificateMessage): F[org.lyranthe.araethura.dms.models.DeleteCertificateResponse]
  def stopReplicationTask(input: org.lyranthe.araethura.dms.models.StopReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.StopReplicationTaskResponse]
  def describeEndpointTypes(input: org.lyranthe.araethura.dms.models.DescribeEndpointTypesMessage): F[org.lyranthe.araethura.dms.models.DescribeEndpointTypesResponse]
  def startReplicationTaskAssessment(input: org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentMessage): F[org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentResponse]
  def modifyReplicationTask(input: org.lyranthe.araethura.dms.models.ModifyReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.ModifyReplicationTaskResponse]
  def deleteReplicationTask(input: org.lyranthe.araethura.dms.models.DeleteReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.DeleteReplicationTaskResponse]
  def startReplicationTask(input: org.lyranthe.araethura.dms.models.StartReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.StartReplicationTaskResponse]
  def createReplicationInstance(input: org.lyranthe.araethura.dms.models.CreateReplicationInstanceMessage): F[org.lyranthe.araethura.dms.models.CreateReplicationInstanceResponse]
  def describeEventCategories(input: org.lyranthe.araethura.dms.models.DescribeEventCategoriesMessage): F[org.lyranthe.araethura.dms.models.DescribeEventCategoriesResponse]
  def deleteEventSubscription(input: org.lyranthe.araethura.dms.models.DeleteEventSubscriptionMessage): F[org.lyranthe.araethura.dms.models.DeleteEventSubscriptionResponse]
  def testConnection(input: org.lyranthe.araethura.dms.models.TestConnectionMessage): F[org.lyranthe.araethura.dms.models.TestConnectionResponse]
  def describeConnections(input: org.lyranthe.araethura.dms.models.DescribeConnectionsMessage): F[org.lyranthe.araethura.dms.models.DescribeConnectionsResponse]
  def listTagsForResource(input: org.lyranthe.araethura.dms.models.ListTagsForResourceMessage): F[org.lyranthe.araethura.dms.models.ListTagsForResourceResponse]
  def createEventSubscription(input: org.lyranthe.araethura.dms.models.CreateEventSubscriptionMessage): F[org.lyranthe.araethura.dms.models.CreateEventSubscriptionResponse]
  def describeOrderableReplicationInstances(input: org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesMessage): F[org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesResponse]
  def describeReplicationTasks(input: org.lyranthe.araethura.dms.models.DescribeReplicationTasksMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationTasksResponse]
  def modifyReplicationSubnetGroup(input: org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupMessage): F[org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupResponse]
  def describeReplicationTaskAssessmentResults(input: org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsResponse]
  def describeReplicationSubnetGroups(input: org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsMessage): F[org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsResponse]
  def deleteReplicationInstance(input: org.lyranthe.araethura.dms.models.DeleteReplicationInstanceMessage): F[org.lyranthe.araethura.dms.models.DeleteReplicationInstanceResponse]
  def createReplicationSubnetGroup(input: org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupMessage): F[org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupResponse]
  def createReplicationTask(input: org.lyranthe.araethura.dms.models.CreateReplicationTaskMessage): F[org.lyranthe.araethura.dms.models.CreateReplicationTaskResponse]
  def addTagsToResource(input: org.lyranthe.araethura.dms.models.AddTagsToResourceMessage): F[scala.Unit]
  def describeEndpoints(input: org.lyranthe.araethura.dms.models.DescribeEndpointsMessage): F[org.lyranthe.araethura.dms.models.DescribeEndpointsResponse]
  def removeTagsFromResource(input: org.lyranthe.araethura.dms.models.RemoveTagsFromResourceMessage): F[scala.Unit]
  def importCertificate(input: org.lyranthe.araethura.dms.models.ImportCertificateMessage): F[org.lyranthe.araethura.dms.models.ImportCertificateResponse]
  def modifyEndpoint(input: org.lyranthe.araethura.dms.models.ModifyEndpointMessage): F[org.lyranthe.araethura.dms.models.ModifyEndpointResponse]
  def describeEventSubscriptions(input: org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsMessage): F[org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsResponse]
  def deleteReplicationSubnetGroup(input: org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupMessage): F[scala.Unit]
  def describeEvents(input: org.lyranthe.araethura.dms.models.DescribeEventsMessage): F[org.lyranthe.araethura.dms.models.DescribeEventsResponse]
  def describeRefreshSchemasStatus(input: org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusMessage): F[org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusResponse]
  def describeAccountAttributes: F[org.lyranthe.araethura.dms.models.DescribeAccountAttributesResponse]
  def refreshSchemas(input: org.lyranthe.araethura.dms.models.RefreshSchemasMessage): F[org.lyranthe.araethura.dms.models.RefreshSchemasResponse]
  def reloadTables(input: org.lyranthe.araethura.dms.models.ReloadTablesMessage): F[org.lyranthe.araethura.dms.models.ReloadTablesResponse]
  def deleteEndpoint(input: org.lyranthe.araethura.dms.models.DeleteEndpointMessage): F[org.lyranthe.araethura.dms.models.DeleteEndpointResponse]
  def createEndpoint(input: org.lyranthe.araethura.dms.models.CreateEndpointMessage): F[org.lyranthe.araethura.dms.models.CreateEndpointResponse]
  def modifyReplicationInstance(input: org.lyranthe.araethura.dms.models.ModifyReplicationInstanceMessage): F[org.lyranthe.araethura.dms.models.ModifyReplicationInstanceResponse]
  def describeSchemas(input: org.lyranthe.araethura.dms.models.DescribeSchemasMessage): F[org.lyranthe.araethura.dms.models.DescribeSchemasResponse]
}