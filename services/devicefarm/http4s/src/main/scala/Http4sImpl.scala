package org.lyranthe.araethura.devicefarm.http4s
import org.http4s.Method._
import org.lyranthe.araethura.devicefarm.circe._
import org.lyranthe.araethura.devicefarm.models
class AmazondevicefarmClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.devicefarm.Amazondevicefarm[F] {
  private[this] final val ServiceType: String = "devicefarm"
  private[this] final val ServiceAndPrefix: Option[String] = Some("DeviceFarm_20150623")
  override def listProjects(input: org.lyranthe.araethura.devicefarm.models.ListProjectsRequest): F[org.lyranthe.araethura.devicefarm.models.ListProjectsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListProjectsResult, org.lyranthe.araethura.devicefarm.models.ListProjectsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListProjects", POST, "/", input)
  override def deleteRemoteAccessSession(input: org.lyranthe.araethura.devicefarm.models.DeleteRemoteAccessSessionRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.devicefarm.models.DeleteRemoteAccessSessionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteRemoteAccessSession", POST, "/", input)
  override def listOfferingTransactions(input: org.lyranthe.araethura.devicefarm.models.ListOfferingTransactionsRequest): F[org.lyranthe.araethura.devicefarm.models.ListOfferingTransactionsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListOfferingTransactionsResult, org.lyranthe.araethura.devicefarm.models.ListOfferingTransactionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListOfferingTransactions", POST, "/", input)
  override def getOfferingStatus(input: org.lyranthe.araethura.devicefarm.models.GetOfferingStatusRequest): F[org.lyranthe.araethura.devicefarm.models.GetOfferingStatusResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetOfferingStatusResult, org.lyranthe.araethura.devicefarm.models.GetOfferingStatusRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetOfferingStatus", POST, "/", input)
  override def getUpload(input: org.lyranthe.araethura.devicefarm.models.GetUploadRequest): F[org.lyranthe.araethura.devicefarm.models.GetUploadResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetUploadResult, org.lyranthe.araethura.devicefarm.models.GetUploadRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetUpload", POST, "/", input)
  override def listNetworkProfiles(input: org.lyranthe.araethura.devicefarm.models.ListNetworkProfilesRequest): F[org.lyranthe.araethura.devicefarm.models.ListNetworkProfilesResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListNetworkProfilesResult, org.lyranthe.araethura.devicefarm.models.ListNetworkProfilesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListNetworkProfiles", POST, "/", input)
  override def listSuites(input: org.lyranthe.araethura.devicefarm.models.ListSuitesRequest): F[org.lyranthe.araethura.devicefarm.models.ListSuitesResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListSuitesResult, org.lyranthe.araethura.devicefarm.models.ListSuitesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListSuites", POST, "/", input)
  override def installToRemoteAccessSession(input: org.lyranthe.araethura.devicefarm.models.InstallToRemoteAccessSessionRequest): F[org.lyranthe.araethura.devicefarm.models.InstallToRemoteAccessSessionResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.InstallToRemoteAccessSessionResult, org.lyranthe.araethura.devicefarm.models.InstallToRemoteAccessSessionRequest](client, awsData, ServiceType, ServiceAndPrefix, "InstallToRemoteAccessSession", POST, "/", input)
  override def createRemoteAccessSession(input: org.lyranthe.araethura.devicefarm.models.CreateRemoteAccessSessionRequest): F[org.lyranthe.araethura.devicefarm.models.CreateRemoteAccessSessionResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.CreateRemoteAccessSessionResult, org.lyranthe.araethura.devicefarm.models.CreateRemoteAccessSessionRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateRemoteAccessSession", POST, "/", input)
  override def deleteDevicePool(input: org.lyranthe.araethura.devicefarm.models.DeleteDevicePoolRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.devicefarm.models.DeleteDevicePoolRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteDevicePool", POST, "/", input)
  override def updateNetworkProfile(input: org.lyranthe.araethura.devicefarm.models.UpdateNetworkProfileRequest): F[org.lyranthe.araethura.devicefarm.models.UpdateNetworkProfileResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.UpdateNetworkProfileResult, org.lyranthe.araethura.devicefarm.models.UpdateNetworkProfileRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateNetworkProfile", POST, "/", input)
  override def getAccountSettings: F[org.lyranthe.araethura.devicefarm.models.GetAccountSettingsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetAccountSettingsResult, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "GetAccountSettings", POST, "/", ())
  override def deleteProject(input: org.lyranthe.araethura.devicefarm.models.DeleteProjectRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.devicefarm.models.DeleteProjectRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteProject", POST, "/", input)
  override def listOfferings(input: org.lyranthe.araethura.devicefarm.models.ListOfferingsRequest): F[org.lyranthe.araethura.devicefarm.models.ListOfferingsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListOfferingsResult, org.lyranthe.araethura.devicefarm.models.ListOfferingsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListOfferings", POST, "/", input)
  override def listDevicePools(input: org.lyranthe.araethura.devicefarm.models.ListDevicePoolsRequest): F[org.lyranthe.araethura.devicefarm.models.ListDevicePoolsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListDevicePoolsResult, org.lyranthe.araethura.devicefarm.models.ListDevicePoolsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListDevicePools", POST, "/", input)
  override def deleteUpload(input: org.lyranthe.araethura.devicefarm.models.DeleteUploadRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.devicefarm.models.DeleteUploadRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteUpload", POST, "/", input)
  override def listUniqueProblems(input: org.lyranthe.araethura.devicefarm.models.ListUniqueProblemsRequest): F[org.lyranthe.araethura.devicefarm.models.ListUniqueProblemsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListUniqueProblemsResult, org.lyranthe.araethura.devicefarm.models.ListUniqueProblemsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListUniqueProblems", POST, "/", input)
  override def createDevicePool(input: org.lyranthe.araethura.devicefarm.models.CreateDevicePoolRequest): F[org.lyranthe.araethura.devicefarm.models.CreateDevicePoolResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.CreateDevicePoolResult, org.lyranthe.araethura.devicefarm.models.CreateDevicePoolRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateDevicePool", POST, "/", input)
  override def getNetworkProfile(input: org.lyranthe.araethura.devicefarm.models.GetNetworkProfileRequest): F[org.lyranthe.araethura.devicefarm.models.GetNetworkProfileResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetNetworkProfileResult, org.lyranthe.araethura.devicefarm.models.GetNetworkProfileRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetNetworkProfile", POST, "/", input)
  override def scheduleRun(input: org.lyranthe.araethura.devicefarm.models.ScheduleRunRequest): F[org.lyranthe.araethura.devicefarm.models.ScheduleRunResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ScheduleRunResult, org.lyranthe.araethura.devicefarm.models.ScheduleRunRequest](client, awsData, ServiceType, ServiceAndPrefix, "ScheduleRun", POST, "/", input)
  override def stopRemoteAccessSession(input: org.lyranthe.araethura.devicefarm.models.StopRemoteAccessSessionRequest): F[org.lyranthe.araethura.devicefarm.models.StopRemoteAccessSessionResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.StopRemoteAccessSessionResult, org.lyranthe.araethura.devicefarm.models.StopRemoteAccessSessionRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopRemoteAccessSession", POST, "/", input)
  override def createNetworkProfile(input: org.lyranthe.araethura.devicefarm.models.CreateNetworkProfileRequest): F[org.lyranthe.araethura.devicefarm.models.CreateNetworkProfileResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.CreateNetworkProfileResult, org.lyranthe.araethura.devicefarm.models.CreateNetworkProfileRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateNetworkProfile", POST, "/", input)
  override def createUpload(input: org.lyranthe.araethura.devicefarm.models.CreateUploadRequest): F[org.lyranthe.araethura.devicefarm.models.CreateUploadResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.CreateUploadResult, org.lyranthe.araethura.devicefarm.models.CreateUploadRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateUpload", POST, "/", input)
  override def renewOffering(input: org.lyranthe.araethura.devicefarm.models.RenewOfferingRequest): F[org.lyranthe.araethura.devicefarm.models.RenewOfferingResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.RenewOfferingResult, org.lyranthe.araethura.devicefarm.models.RenewOfferingRequest](client, awsData, ServiceType, ServiceAndPrefix, "RenewOffering", POST, "/", input)
  override def listDevices(input: org.lyranthe.araethura.devicefarm.models.ListDevicesRequest): F[org.lyranthe.araethura.devicefarm.models.ListDevicesResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListDevicesResult, org.lyranthe.araethura.devicefarm.models.ListDevicesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListDevices", POST, "/", input)
  override def stopRun(input: org.lyranthe.araethura.devicefarm.models.StopRunRequest): F[org.lyranthe.araethura.devicefarm.models.StopRunResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.StopRunResult, org.lyranthe.araethura.devicefarm.models.StopRunRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopRun", POST, "/", input)
  override def getTest(input: org.lyranthe.araethura.devicefarm.models.GetTestRequest): F[org.lyranthe.araethura.devicefarm.models.GetTestResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetTestResult, org.lyranthe.araethura.devicefarm.models.GetTestRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetTest", POST, "/", input)
  override def listRemoteAccessSessions(input: org.lyranthe.araethura.devicefarm.models.ListRemoteAccessSessionsRequest): F[org.lyranthe.araethura.devicefarm.models.ListRemoteAccessSessionsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListRemoteAccessSessionsResult, org.lyranthe.araethura.devicefarm.models.ListRemoteAccessSessionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListRemoteAccessSessions", POST, "/", input)
  override def deleteNetworkProfile(input: org.lyranthe.araethura.devicefarm.models.DeleteNetworkProfileRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.devicefarm.models.DeleteNetworkProfileRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteNetworkProfile", POST, "/", input)
  override def getRemoteAccessSession(input: org.lyranthe.araethura.devicefarm.models.GetRemoteAccessSessionRequest): F[org.lyranthe.araethura.devicefarm.models.GetRemoteAccessSessionResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetRemoteAccessSessionResult, org.lyranthe.araethura.devicefarm.models.GetRemoteAccessSessionRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetRemoteAccessSession", POST, "/", input)
  override def listArtifacts(input: org.lyranthe.araethura.devicefarm.models.ListArtifactsRequest): F[org.lyranthe.araethura.devicefarm.models.ListArtifactsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListArtifactsResult, org.lyranthe.araethura.devicefarm.models.ListArtifactsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListArtifacts", POST, "/", input)
  override def listRuns(input: org.lyranthe.araethura.devicefarm.models.ListRunsRequest): F[org.lyranthe.araethura.devicefarm.models.ListRunsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListRunsResult, org.lyranthe.araethura.devicefarm.models.ListRunsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListRuns", POST, "/", input)
  override def updateDevicePool(input: org.lyranthe.araethura.devicefarm.models.UpdateDevicePoolRequest): F[org.lyranthe.araethura.devicefarm.models.UpdateDevicePoolResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.UpdateDevicePoolResult, org.lyranthe.araethura.devicefarm.models.UpdateDevicePoolRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateDevicePool", POST, "/", input)
  override def getJob(input: org.lyranthe.araethura.devicefarm.models.GetJobRequest): F[org.lyranthe.araethura.devicefarm.models.GetJobResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetJobResult, org.lyranthe.araethura.devicefarm.models.GetJobRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetJob", POST, "/", input)
  override def getSuite(input: org.lyranthe.araethura.devicefarm.models.GetSuiteRequest): F[org.lyranthe.araethura.devicefarm.models.GetSuiteResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetSuiteResult, org.lyranthe.araethura.devicefarm.models.GetSuiteRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetSuite", POST, "/", input)
  override def listSamples(input: org.lyranthe.araethura.devicefarm.models.ListSamplesRequest): F[org.lyranthe.araethura.devicefarm.models.ListSamplesResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListSamplesResult, org.lyranthe.araethura.devicefarm.models.ListSamplesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListSamples", POST, "/", input)
  override def createProject(input: org.lyranthe.araethura.devicefarm.models.CreateProjectRequest): F[org.lyranthe.araethura.devicefarm.models.CreateProjectResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.CreateProjectResult, org.lyranthe.araethura.devicefarm.models.CreateProjectRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateProject", POST, "/", input)
  override def getDevicePool(input: org.lyranthe.araethura.devicefarm.models.GetDevicePoolRequest): F[org.lyranthe.araethura.devicefarm.models.GetDevicePoolResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetDevicePoolResult, org.lyranthe.araethura.devicefarm.models.GetDevicePoolRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetDevicePool", POST, "/", input)
  override def listUploads(input: org.lyranthe.araethura.devicefarm.models.ListUploadsRequest): F[org.lyranthe.araethura.devicefarm.models.ListUploadsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListUploadsResult, org.lyranthe.araethura.devicefarm.models.ListUploadsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListUploads", POST, "/", input)
  override def listJobs(input: org.lyranthe.araethura.devicefarm.models.ListJobsRequest): F[org.lyranthe.araethura.devicefarm.models.ListJobsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListJobsResult, org.lyranthe.araethura.devicefarm.models.ListJobsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListJobs", POST, "/", input)
  override def listOfferingPromotions(input: org.lyranthe.araethura.devicefarm.models.ListOfferingPromotionsRequest): F[org.lyranthe.araethura.devicefarm.models.ListOfferingPromotionsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListOfferingPromotionsResult, org.lyranthe.araethura.devicefarm.models.ListOfferingPromotionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListOfferingPromotions", POST, "/", input)
  override def listTests(input: org.lyranthe.araethura.devicefarm.models.ListTestsRequest): F[org.lyranthe.araethura.devicefarm.models.ListTestsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.ListTestsResult, org.lyranthe.araethura.devicefarm.models.ListTestsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTests", POST, "/", input)
  override def getDevicePoolCompatibility(input: org.lyranthe.araethura.devicefarm.models.GetDevicePoolCompatibilityRequest): F[org.lyranthe.araethura.devicefarm.models.GetDevicePoolCompatibilityResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetDevicePoolCompatibilityResult, org.lyranthe.araethura.devicefarm.models.GetDevicePoolCompatibilityRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetDevicePoolCompatibility", POST, "/", input)
  override def purchaseOffering(input: org.lyranthe.araethura.devicefarm.models.PurchaseOfferingRequest): F[org.lyranthe.araethura.devicefarm.models.PurchaseOfferingResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.PurchaseOfferingResult, org.lyranthe.araethura.devicefarm.models.PurchaseOfferingRequest](client, awsData, ServiceType, ServiceAndPrefix, "PurchaseOffering", POST, "/", input)
  override def getRun(input: org.lyranthe.araethura.devicefarm.models.GetRunRequest): F[org.lyranthe.araethura.devicefarm.models.GetRunResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetRunResult, org.lyranthe.araethura.devicefarm.models.GetRunRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetRun", POST, "/", input)
  override def updateProject(input: org.lyranthe.araethura.devicefarm.models.UpdateProjectRequest): F[org.lyranthe.araethura.devicefarm.models.UpdateProjectResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.UpdateProjectResult, org.lyranthe.araethura.devicefarm.models.UpdateProjectRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateProject", POST, "/", input)
  override def getDevice(input: org.lyranthe.araethura.devicefarm.models.GetDeviceRequest): F[org.lyranthe.araethura.devicefarm.models.GetDeviceResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetDeviceResult, org.lyranthe.araethura.devicefarm.models.GetDeviceRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetDevice", POST, "/", input)
  override def getProject(input: org.lyranthe.araethura.devicefarm.models.GetProjectRequest): F[org.lyranthe.araethura.devicefarm.models.GetProjectResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.devicefarm.models.GetProjectResult, org.lyranthe.araethura.devicefarm.models.GetProjectRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetProject", POST, "/", input)
  override def deleteRun(input: org.lyranthe.araethura.devicefarm.models.DeleteRunRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.devicefarm.models.DeleteRunRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteRun", POST, "/", input)
}