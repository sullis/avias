package org.lyranthe.araethura.cloudtrail.http4s
import org.http4s.Method._
import org.lyranthe.araethura.cloudtrail.circe._
import org.lyranthe.araethura.cloudtrail.models
class AmazoncloudtrailClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.cloudtrail.Amazoncloudtrail[F] {
  private[this] final val ServiceType: String = "cloudtrail"
  private[this] final val ServiceAndPrefix: Option[String] = Some("com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101")
  override def addTags(input: org.lyranthe.araethura.cloudtrail.models.AddTagsRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.cloudtrail.models.AddTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddTags", POST, "/", input)
  override def listTags(input: org.lyranthe.araethura.cloudtrail.models.ListTagsRequest): F[org.lyranthe.araethura.cloudtrail.models.ListTagsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.ListTagsResponse, org.lyranthe.araethura.cloudtrail.models.ListTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTags", POST, "/", input)
  override def createTrail(input: org.lyranthe.araethura.cloudtrail.models.CreateTrailRequest): F[org.lyranthe.araethura.cloudtrail.models.CreateTrailResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.CreateTrailResponse, org.lyranthe.araethura.cloudtrail.models.CreateTrailRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateTrail", POST, "/", input)
  override def describeTrails(input: org.lyranthe.araethura.cloudtrail.models.DescribeTrailsRequest): F[org.lyranthe.araethura.cloudtrail.models.DescribeTrailsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.DescribeTrailsResponse, org.lyranthe.araethura.cloudtrail.models.DescribeTrailsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrails", POST, "/", input)
  override def startLogging(input: org.lyranthe.araethura.cloudtrail.models.StartLoggingRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.cloudtrail.models.StartLoggingRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartLogging", POST, "/", input)
  override def lookupEvents(input: org.lyranthe.araethura.cloudtrail.models.LookupEventsRequest): F[org.lyranthe.araethura.cloudtrail.models.LookupEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.LookupEventsResponse, org.lyranthe.araethura.cloudtrail.models.LookupEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "LookupEvents", POST, "/", input)
  override def stopLogging(input: org.lyranthe.araethura.cloudtrail.models.StopLoggingRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.cloudtrail.models.StopLoggingRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopLogging", POST, "/", input)
  override def removeTags(input: org.lyranthe.araethura.cloudtrail.models.RemoveTagsRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.cloudtrail.models.RemoveTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "RemoveTags", POST, "/", input)
  override def deleteTrail(input: org.lyranthe.araethura.cloudtrail.models.DeleteTrailRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.cloudtrail.models.DeleteTrailRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteTrail", POST, "/", input)
  override def updateTrail(input: org.lyranthe.araethura.cloudtrail.models.UpdateTrailRequest): F[org.lyranthe.araethura.cloudtrail.models.UpdateTrailResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.UpdateTrailResponse, org.lyranthe.araethura.cloudtrail.models.UpdateTrailRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateTrail", POST, "/", input)
  override def putEventSelectors(input: org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsRequest): F[org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsResponse, org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutEventSelectors", POST, "/", input)
  override def getEventSelectors(input: org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsRequest): F[org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsResponse, org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetEventSelectors", POST, "/", input)
  override def getTrailStatus(input: org.lyranthe.araethura.cloudtrail.models.GetTrailStatusRequest): F[org.lyranthe.araethura.cloudtrail.models.GetTrailStatusResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.GetTrailStatusResponse, org.lyranthe.araethura.cloudtrail.models.GetTrailStatusRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetTrailStatus", POST, "/", input)
  override def listPublicKeys(input: org.lyranthe.araethura.cloudtrail.models.ListPublicKeysRequest): F[org.lyranthe.araethura.cloudtrail.models.ListPublicKeysResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.cloudtrail.models.ListPublicKeysResponse, org.lyranthe.araethura.cloudtrail.models.ListPublicKeysRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListPublicKeys", POST, "/", input)
}