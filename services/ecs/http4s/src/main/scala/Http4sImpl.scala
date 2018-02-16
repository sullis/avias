package org.lyranthe.araethura.ecs.http4s
import org.http4s.Method._
import org.lyranthe.araethura.ecs.circe._
import org.lyranthe.araethura.ecs.models
class AmazonecsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.ecs.Amazonecs[F] {
  private[this] final val ServiceType: String = "ecs"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AmazonEC2ContainerServiceV20141113")
  override def submitContainerStateChange(input: org.lyranthe.araethura.ecs.models.SubmitContainerStateChangeRequest): F[org.lyranthe.araethura.ecs.models.SubmitContainerStateChangeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.SubmitContainerStateChangeResponse, org.lyranthe.araethura.ecs.models.SubmitContainerStateChangeRequest](client, awsData, ServiceType, ServiceAndPrefix, "SubmitContainerStateChange", POST, "/", input)
  override def describeTaskDefinition(input: org.lyranthe.araethura.ecs.models.DescribeTaskDefinitionRequest): F[org.lyranthe.araethura.ecs.models.DescribeTaskDefinitionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DescribeTaskDefinitionResponse, org.lyranthe.araethura.ecs.models.DescribeTaskDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTaskDefinition", POST, "/", input)
  override def listAttributes(input: org.lyranthe.araethura.ecs.models.ListAttributesRequest): F[org.lyranthe.araethura.ecs.models.ListAttributesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListAttributesResponse, org.lyranthe.araethura.ecs.models.ListAttributesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAttributes", POST, "/", input)
  override def listContainerInstances(input: org.lyranthe.araethura.ecs.models.ListContainerInstancesRequest): F[org.lyranthe.araethura.ecs.models.ListContainerInstancesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListContainerInstancesResponse, org.lyranthe.araethura.ecs.models.ListContainerInstancesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListContainerInstances", POST, "/", input)
  override def deregisterContainerInstance(input: org.lyranthe.araethura.ecs.models.DeregisterContainerInstanceRequest): F[org.lyranthe.araethura.ecs.models.DeregisterContainerInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DeregisterContainerInstanceResponse, org.lyranthe.araethura.ecs.models.DeregisterContainerInstanceRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeregisterContainerInstance", POST, "/", input)
  override def deleteService(input: org.lyranthe.araethura.ecs.models.DeleteServiceRequest): F[org.lyranthe.araethura.ecs.models.DeleteServiceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DeleteServiceResponse, org.lyranthe.araethura.ecs.models.DeleteServiceRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteService", POST, "/", input)
  override def runTask(input: org.lyranthe.araethura.ecs.models.RunTaskRequest): F[org.lyranthe.araethura.ecs.models.RunTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.RunTaskResponse, org.lyranthe.araethura.ecs.models.RunTaskRequest](client, awsData, ServiceType, ServiceAndPrefix, "RunTask", POST, "/", input)
  override def describeClusters(input: org.lyranthe.araethura.ecs.models.DescribeClustersRequest): F[org.lyranthe.araethura.ecs.models.DescribeClustersResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DescribeClustersResponse, org.lyranthe.araethura.ecs.models.DescribeClustersRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeClusters", POST, "/", input)
  override def putAttributes(input: org.lyranthe.araethura.ecs.models.PutAttributesRequest): F[org.lyranthe.araethura.ecs.models.PutAttributesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.PutAttributesResponse, org.lyranthe.araethura.ecs.models.PutAttributesRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutAttributes", POST, "/", input)
  override def describeServices(input: org.lyranthe.araethura.ecs.models.DescribeServicesRequest): F[org.lyranthe.araethura.ecs.models.DescribeServicesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DescribeServicesResponse, org.lyranthe.araethura.ecs.models.DescribeServicesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeServices", POST, "/", input)
  override def createService(input: org.lyranthe.araethura.ecs.models.CreateServiceRequest): F[org.lyranthe.araethura.ecs.models.CreateServiceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.CreateServiceResponse, org.lyranthe.araethura.ecs.models.CreateServiceRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateService", POST, "/", input)
  override def listTasks(input: org.lyranthe.araethura.ecs.models.ListTasksRequest): F[org.lyranthe.araethura.ecs.models.ListTasksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListTasksResponse, org.lyranthe.araethura.ecs.models.ListTasksRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTasks", POST, "/", input)
  override def listTaskDefinitions(input: org.lyranthe.araethura.ecs.models.ListTaskDefinitionsRequest): F[org.lyranthe.araethura.ecs.models.ListTaskDefinitionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListTaskDefinitionsResponse, org.lyranthe.araethura.ecs.models.ListTaskDefinitionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTaskDefinitions", POST, "/", input)
  override def describeContainerInstances(input: org.lyranthe.araethura.ecs.models.DescribeContainerInstancesRequest): F[org.lyranthe.araethura.ecs.models.DescribeContainerInstancesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DescribeContainerInstancesResponse, org.lyranthe.araethura.ecs.models.DescribeContainerInstancesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeContainerInstances", POST, "/", input)
  override def listClusters(input: org.lyranthe.araethura.ecs.models.ListClustersRequest): F[org.lyranthe.araethura.ecs.models.ListClustersResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListClustersResponse, org.lyranthe.araethura.ecs.models.ListClustersRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListClusters", POST, "/", input)
  override def deleteCluster(input: org.lyranthe.araethura.ecs.models.DeleteClusterRequest): F[org.lyranthe.araethura.ecs.models.DeleteClusterResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DeleteClusterResponse, org.lyranthe.araethura.ecs.models.DeleteClusterRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteCluster", POST, "/", input)
  override def updateContainerInstancesState(input: org.lyranthe.araethura.ecs.models.UpdateContainerInstancesStateRequest): F[org.lyranthe.araethura.ecs.models.UpdateContainerInstancesStateResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.UpdateContainerInstancesStateResponse, org.lyranthe.araethura.ecs.models.UpdateContainerInstancesStateRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateContainerInstancesState", POST, "/", input)
  override def deregisterTaskDefinition(input: org.lyranthe.araethura.ecs.models.DeregisterTaskDefinitionRequest): F[org.lyranthe.araethura.ecs.models.DeregisterTaskDefinitionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DeregisterTaskDefinitionResponse, org.lyranthe.araethura.ecs.models.DeregisterTaskDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeregisterTaskDefinition", POST, "/", input)
  override def stopTask(input: org.lyranthe.araethura.ecs.models.StopTaskRequest): F[org.lyranthe.araethura.ecs.models.StopTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.StopTaskResponse, org.lyranthe.araethura.ecs.models.StopTaskRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopTask", POST, "/", input)
  override def updateService(input: org.lyranthe.araethura.ecs.models.UpdateServiceRequest): F[org.lyranthe.araethura.ecs.models.UpdateServiceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.UpdateServiceResponse, org.lyranthe.araethura.ecs.models.UpdateServiceRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateService", POST, "/", input)
  override def startTask(input: org.lyranthe.araethura.ecs.models.StartTaskRequest): F[org.lyranthe.araethura.ecs.models.StartTaskResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.StartTaskResponse, org.lyranthe.araethura.ecs.models.StartTaskRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartTask", POST, "/", input)
  override def registerContainerInstance(input: org.lyranthe.araethura.ecs.models.RegisterContainerInstanceRequest): F[org.lyranthe.araethura.ecs.models.RegisterContainerInstanceResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.RegisterContainerInstanceResponse, org.lyranthe.araethura.ecs.models.RegisterContainerInstanceRequest](client, awsData, ServiceType, ServiceAndPrefix, "RegisterContainerInstance", POST, "/", input)
  override def registerTaskDefinition(input: org.lyranthe.araethura.ecs.models.RegisterTaskDefinitionRequest): F[org.lyranthe.araethura.ecs.models.RegisterTaskDefinitionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.RegisterTaskDefinitionResponse, org.lyranthe.araethura.ecs.models.RegisterTaskDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "RegisterTaskDefinition", POST, "/", input)
  override def deleteAttributes(input: org.lyranthe.araethura.ecs.models.DeleteAttributesRequest): F[org.lyranthe.araethura.ecs.models.DeleteAttributesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DeleteAttributesResponse, org.lyranthe.araethura.ecs.models.DeleteAttributesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteAttributes", POST, "/", input)
  override def submitTaskStateChange(input: org.lyranthe.araethura.ecs.models.SubmitTaskStateChangeRequest): F[org.lyranthe.araethura.ecs.models.SubmitTaskStateChangeResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.SubmitTaskStateChangeResponse, org.lyranthe.araethura.ecs.models.SubmitTaskStateChangeRequest](client, awsData, ServiceType, ServiceAndPrefix, "SubmitTaskStateChange", POST, "/", input)
  override def discoverPollEndpoint(input: org.lyranthe.araethura.ecs.models.DiscoverPollEndpointRequest): F[org.lyranthe.araethura.ecs.models.DiscoverPollEndpointResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DiscoverPollEndpointResponse, org.lyranthe.araethura.ecs.models.DiscoverPollEndpointRequest](client, awsData, ServiceType, ServiceAndPrefix, "DiscoverPollEndpoint", POST, "/", input)
  override def createCluster(input: org.lyranthe.araethura.ecs.models.CreateClusterRequest): F[org.lyranthe.araethura.ecs.models.CreateClusterResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.CreateClusterResponse, org.lyranthe.araethura.ecs.models.CreateClusterRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateCluster", POST, "/", input)
  override def updateContainerAgent(input: org.lyranthe.araethura.ecs.models.UpdateContainerAgentRequest): F[org.lyranthe.araethura.ecs.models.UpdateContainerAgentResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.UpdateContainerAgentResponse, org.lyranthe.araethura.ecs.models.UpdateContainerAgentRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateContainerAgent", POST, "/", input)
  override def describeTasks(input: org.lyranthe.araethura.ecs.models.DescribeTasksRequest): F[org.lyranthe.araethura.ecs.models.DescribeTasksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.DescribeTasksResponse, org.lyranthe.araethura.ecs.models.DescribeTasksRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTasks", POST, "/", input)
  override def listTaskDefinitionFamilies(input: org.lyranthe.araethura.ecs.models.ListTaskDefinitionFamiliesRequest): F[org.lyranthe.araethura.ecs.models.ListTaskDefinitionFamiliesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListTaskDefinitionFamiliesResponse, org.lyranthe.araethura.ecs.models.ListTaskDefinitionFamiliesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTaskDefinitionFamilies", POST, "/", input)
  override def listServices(input: org.lyranthe.araethura.ecs.models.ListServicesRequest): F[org.lyranthe.araethura.ecs.models.ListServicesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.ecs.models.ListServicesResponse, org.lyranthe.araethura.ecs.models.ListServicesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListServices", POST, "/", input)
}