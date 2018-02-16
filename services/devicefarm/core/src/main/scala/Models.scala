package org.lyranthe.araethura.devicefarm.models
final case class ListSamplesRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateRemoteAccessSessionRequest(projectArn: java.lang.String, deviceArn: java.lang.String, name: scala.Option[java.lang.String] = scala.None, configuration: scala.Option[org.lyranthe.araethura.devicefarm.models.CreateRemoteAccessSessionConfiguration] = scala.None, clientId: scala.Option[java.lang.String] = scala.None, remoteDebugEnabled: scala.Option[scala.Boolean] = scala.None, sshPublicKey: scala.Option[java.lang.String] = scala.None)
case object DeleteUploadResult
final case class GetDeviceResult(device: scala.Option[org.lyranthe.araethura.devicefarm.models.Device] = scala.None)
final case class Offering(recurringCharges: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.RecurringCharge]] = scala.None, id: scala.Option[java.lang.String] = scala.None, platform: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class CreateUploadRequest(projectArn: java.lang.String, name: java.lang.String, `type`: java.lang.String, contentType: scala.Option[java.lang.String] = scala.None)
final case class StopRunResult(run: scala.Option[org.lyranthe.araethura.devicefarm.models.Run] = scala.None)
final case class Upload(arn: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, created: scala.Option[java.time.Instant] = scala.None, contentType: scala.Option[java.lang.String] = scala.None, url: scala.Option[java.lang.String] = scala.None, metadata: scala.Option[java.lang.String] = scala.None)
final case class RecurringCharge(cost: scala.Option[org.lyranthe.araethura.devicefarm.models.MonetaryAmount] = scala.None, frequency: scala.Option[java.lang.String] = scala.None)
final case class ListArtifactsResult(artifacts: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Artifact]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListJobsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetSuiteResult(suite: scala.Option[org.lyranthe.araethura.devicefarm.models.Suite] = scala.None)
final case class GetProjectResult(project: scala.Option[org.lyranthe.araethura.devicefarm.models.Project] = scala.None)
final case class Suite(arn: scala.Option[java.lang.String] = scala.None, deviceMinutes: scala.Option[org.lyranthe.araethura.devicefarm.models.DeviceMinutes] = scala.None, name: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, result: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, counters: scala.Option[org.lyranthe.araethura.devicefarm.models.Counters] = scala.None, created: scala.Option[java.time.Instant] = scala.None, started: scala.Option[java.time.Instant] = scala.None, stopped: scala.Option[java.time.Instant] = scala.None)
final case class GetDevicePoolCompatibilityResult(compatibleDevices: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.DevicePoolCompatibilityResult]] = scala.None, incompatibleDevices: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.DevicePoolCompatibilityResult]] = scala.None)
final case class CustomerArtifactPaths(iosPaths: scala.Option[scala.List[java.lang.String]] = scala.None, androidPaths: scala.Option[scala.List[java.lang.String]] = scala.None, deviceHostPaths: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ScheduleRunTest(`type`: java.lang.String, testPackageArn: scala.Option[java.lang.String] = scala.None, filter: scala.Option[java.lang.String] = scala.None, parameters: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class ListOfferingTransactionsRequest(nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListSamplesResult(samples: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Sample]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class LimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class DeviceMinutes(total: scala.Option[scala.Double] = scala.None, metered: scala.Option[scala.Double] = scala.None, unmetered: scala.Option[scala.Double] = scala.None)
final case class Radios(wifi: scala.Option[scala.Boolean] = scala.None, bluetooth: scala.Option[scala.Boolean] = scala.None, nfc: scala.Option[scala.Boolean] = scala.None, gps: scala.Option[scala.Boolean] = scala.None)
final case class UpdateDevicePoolResult(devicePool: scala.Option[org.lyranthe.araethura.devicefarm.models.DevicePool] = scala.None)
final case class GetDeviceRequest(arn: java.lang.String)
final case class InstallToRemoteAccessSessionResult(appUpload: scala.Option[org.lyranthe.araethura.devicefarm.models.Upload] = scala.None)
final case class ListRunsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DevicePoolCompatibilityResult(device: scala.Option[org.lyranthe.araethura.devicefarm.models.Device] = scala.None, compatible: scala.Option[scala.Boolean] = scala.None, incompatibilityMessages: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.IncompatibilityMessage]] = scala.None)
final case class Rule(attribute: scala.Option[java.lang.String] = scala.None, operator: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class Device(arn: scala.Option[java.lang.String] = scala.None, heapSize: scala.Option[scala.Long] = scala.None, memory: scala.Option[scala.Long] = scala.None, os: scala.Option[java.lang.String] = scala.None, radio: scala.Option[java.lang.String] = scala.None, manufacturer: scala.Option[java.lang.String] = scala.None, model: scala.Option[java.lang.String] = scala.None, image: scala.Option[java.lang.String] = scala.None, carrier: scala.Option[java.lang.String] = scala.None, fleetType: scala.Option[java.lang.String] = scala.None, fleetName: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, platform: scala.Option[java.lang.String] = scala.None, resolution: scala.Option[org.lyranthe.araethura.devicefarm.models.Resolution] = scala.None, cpu: scala.Option[org.lyranthe.araethura.devicefarm.models.CPU] = scala.None, remoteAccessEnabled: scala.Option[scala.Boolean] = scala.None, remoteDebugEnabled: scala.Option[scala.Boolean] = scala.None, formFactor: scala.Option[java.lang.String] = scala.None)
final case class ListUploadsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetNetworkProfileResult(networkProfile: scala.Option[org.lyranthe.araethura.devicefarm.models.NetworkProfile] = scala.None)
final case class UpdateNetworkProfileRequest(arn: java.lang.String, uplinkLossPercent: scala.Option[scala.Int] = scala.None, downlinkLossPercent: scala.Option[scala.Int] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, uplinkDelayMs: scala.Option[scala.Long] = scala.None, downlinkJitterMs: scala.Option[scala.Long] = scala.None, downlinkDelayMs: scala.Option[scala.Long] = scala.None, uplinkJitterMs: scala.Option[scala.Long] = scala.None, downlinkBandwidthBits: scala.Option[scala.Long] = scala.None, uplinkBandwidthBits: scala.Option[scala.Long] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class GetRunResult(run: scala.Option[org.lyranthe.araethura.devicefarm.models.Run] = scala.None)
final case class Location(latitude: scala.Double, longitude: scala.Double)
final case class DeleteUploadRequest(arn: java.lang.String)
final case class ListTestsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AccountSettings(unmeteredDevices: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]] = scala.None, unmeteredRemoteAccessDevices: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]] = scala.None, maxSlots: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]] = scala.None, trialMinutes: scala.Option[org.lyranthe.araethura.devicefarm.models.TrialMinutes] = scala.None, awsAccountNumber: scala.Option[java.lang.String] = scala.None, maxJobTimeoutMinutes: scala.Option[scala.Int] = scala.None, defaultJobTimeoutMinutes: scala.Option[scala.Int] = scala.None)
final case class CreateRemoteAccessSessionConfiguration(billingMethod: scala.Option[java.lang.String] = scala.None)
final case class ListNetworkProfilesRequest(arn: java.lang.String, `type`: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListOfferingsRequest(nextToken: scala.Option[java.lang.String] = scala.None)
final case class OfferingStatus(`type`: scala.Option[java.lang.String] = scala.None, offering: scala.Option[org.lyranthe.araethura.devicefarm.models.Offering] = scala.None, quantity: scala.Option[scala.Int] = scala.None, effectiveOn: scala.Option[java.time.Instant] = scala.None)
final case class Problem(run: scala.Option[org.lyranthe.araethura.devicefarm.models.ProblemDetail] = scala.None, job: scala.Option[org.lyranthe.araethura.devicefarm.models.ProblemDetail] = scala.None, suite: scala.Option[org.lyranthe.araethura.devicefarm.models.ProblemDetail] = scala.None, test: scala.Option[org.lyranthe.araethura.devicefarm.models.ProblemDetail] = scala.None, device: scala.Option[org.lyranthe.araethura.devicefarm.models.Device] = scala.None, result: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None)
final case class GetProjectRequest(arn: java.lang.String)
final case class GetRunRequest(arn: java.lang.String)
final case class GetRemoteAccessSessionRequest(arn: java.lang.String)
final case class CreateNetworkProfileRequest(projectArn: java.lang.String, name: java.lang.String, uplinkLossPercent: scala.Option[scala.Int] = scala.None, downlinkLossPercent: scala.Option[scala.Int] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, uplinkDelayMs: scala.Option[scala.Long] = scala.None, downlinkJitterMs: scala.Option[scala.Long] = scala.None, downlinkDelayMs: scala.Option[scala.Long] = scala.None, uplinkJitterMs: scala.Option[scala.Long] = scala.None, downlinkBandwidthBits: scala.Option[scala.Long] = scala.None, uplinkBandwidthBits: scala.Option[scala.Long] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class DeleteRunRequest(arn: java.lang.String)
final case class ListProjectsResult(projects: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Project]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateNetworkProfileResult(networkProfile: scala.Option[org.lyranthe.araethura.devicefarm.models.NetworkProfile] = scala.None)
final case class UpdateNetworkProfileResult(networkProfile: scala.Option[org.lyranthe.araethura.devicefarm.models.NetworkProfile] = scala.None)
case object DeleteNetworkProfileResult
final case class Artifact(`type`: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, extension: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, url: scala.Option[java.lang.String] = scala.None)
final case class OfferingTransaction(transactionId: scala.Option[java.lang.String] = scala.None, offeringStatus: scala.Option[org.lyranthe.araethura.devicefarm.models.OfferingStatus] = scala.None, createdOn: scala.Option[java.time.Instant] = scala.None, offeringPromotionId: scala.Option[java.lang.String] = scala.None, cost: scala.Option[org.lyranthe.araethura.devicefarm.models.MonetaryAmount] = scala.None)
final case class ListRunsResult(runs: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Run]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class IdempotencyException(message: scala.Option[java.lang.String] = scala.None)
final case class GetNetworkProfileRequest(arn: java.lang.String)
final case class Project(arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, defaultJobTimeoutMinutes: scala.Option[scala.Int] = scala.None, created: scala.Option[java.time.Instant] = scala.None)
final case class ListJobsResult(jobs: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Job]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ScheduleRunRequest(projectArn: java.lang.String, devicePoolArn: java.lang.String, test: org.lyranthe.araethura.devicefarm.models.ScheduleRunTest, appArn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, executionConfiguration: scala.Option[org.lyranthe.araethura.devicefarm.models.ExecutionConfiguration] = scala.None, configuration: scala.Option[org.lyranthe.araethura.devicefarm.models.ScheduleRunConfiguration] = scala.None)
case object DeleteDevicePoolResult
final case class CreateUploadResult(upload: scala.Option[org.lyranthe.araethura.devicefarm.models.Upload] = scala.None)
final case class ListUniqueProblemsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class StopRemoteAccessSessionRequest(arn: java.lang.String)
final case class ListOfferingPromotionsResult(offeringPromotions: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.OfferingPromotion]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteDevicePoolRequest(arn: java.lang.String)
final case class CreateDevicePoolResult(devicePool: scala.Option[org.lyranthe.araethura.devicefarm.models.DevicePool] = scala.None)
final case class ListOfferingsResult(offerings: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Offering]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ScheduleRunResult(run: scala.Option[org.lyranthe.araethura.devicefarm.models.Run] = scala.None)
final case class PurchaseOfferingRequest(offeringId: scala.Option[java.lang.String] = scala.None, quantity: scala.Option[scala.Int] = scala.None, offeringPromotionId: scala.Option[java.lang.String] = scala.None)
case object GetAccountSettingsRequest
final case class GetJobRequest(arn: java.lang.String)
final case class DeleteRemoteAccessSessionRequest(arn: java.lang.String)
final case class GetAccountSettingsResult(accountSettings: scala.Option[org.lyranthe.araethura.devicefarm.models.AccountSettings] = scala.None)
final case class Counters(passed: scala.Option[scala.Int] = scala.None, total: scala.Option[scala.Int] = scala.None, errored: scala.Option[scala.Int] = scala.None, skipped: scala.Option[scala.Int] = scala.None, warned: scala.Option[scala.Int] = scala.None, failed: scala.Option[scala.Int] = scala.None, stopped: scala.Option[scala.Int] = scala.None)
final case class InstallToRemoteAccessSessionRequest(remoteAccessSessionArn: java.lang.String, appArn: java.lang.String)
final case class ArgumentException(message: scala.Option[java.lang.String] = scala.None)
final case class NotEligibleException(message: scala.Option[java.lang.String] = scala.None)
final case class ListOfferingTransactionsResult(offeringTransactions: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.OfferingTransaction]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListRemoteAccessSessionsRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Job(arn: scala.Option[java.lang.String] = scala.None, deviceMinutes: scala.Option[org.lyranthe.araethura.devicefarm.models.DeviceMinutes] = scala.None, device: scala.Option[org.lyranthe.araethura.devicefarm.models.Device] = scala.None, name: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, result: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, counters: scala.Option[org.lyranthe.araethura.devicefarm.models.Counters] = scala.None, created: scala.Option[java.time.Instant] = scala.None, started: scala.Option[java.time.Instant] = scala.None, stopped: scala.Option[java.time.Instant] = scala.None)
case object DeleteRemoteAccessSessionResult
final case class ListDevicePoolsRequest(arn: java.lang.String, `type`: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class NotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class RemoteAccessSession(arn: scala.Option[java.lang.String] = scala.None, hostAddress: scala.Option[java.lang.String] = scala.None, deviceMinutes: scala.Option[org.lyranthe.araethura.devicefarm.models.DeviceMinutes] = scala.None, endpoint: scala.Option[java.lang.String] = scala.None, deviceUdid: scala.Option[java.lang.String] = scala.None, device: scala.Option[org.lyranthe.araethura.devicefarm.models.Device] = scala.None, name: scala.Option[java.lang.String] = scala.None, result: scala.Option[java.lang.String] = scala.None, clientId: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, created: scala.Option[java.time.Instant] = scala.None, started: scala.Option[java.time.Instant] = scala.None, stopped: scala.Option[java.time.Instant] = scala.None, billingMethod: scala.Option[java.lang.String] = scala.None, remoteDebugEnabled: scala.Option[scala.Boolean] = scala.None)
final case class Sample(arn: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, url: scala.Option[java.lang.String] = scala.None)
final case class GetOfferingStatusRequest(nextToken: scala.Option[java.lang.String] = scala.None)
final case class ServiceAccountException(message: scala.Option[java.lang.String] = scala.None)
final case class CreateProjectRequest(name: java.lang.String, defaultJobTimeoutMinutes: scala.Option[scala.Int] = scala.None)
final case class Resolution(width: scala.Option[scala.Int] = scala.None, height: scala.Option[scala.Int] = scala.None)
final case class RenewOfferingRequest(offeringId: scala.Option[java.lang.String] = scala.None, quantity: scala.Option[scala.Int] = scala.None)
final case class Run(arn: scala.Option[java.lang.String] = scala.None, customerArtifactPaths: scala.Option[org.lyranthe.araethura.devicefarm.models.CustomerArtifactPaths] = scala.None, deviceMinutes: scala.Option[org.lyranthe.araethura.devicefarm.models.DeviceMinutes] = scala.None, parsingResultUrl: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, platform: scala.Option[java.lang.String] = scala.None, result: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, counters: scala.Option[org.lyranthe.araethura.devicefarm.models.Counters] = scala.None, created: scala.Option[java.time.Instant] = scala.None, started: scala.Option[java.time.Instant] = scala.None, stopped: scala.Option[java.time.Instant] = scala.None, billingMethod: scala.Option[java.lang.String] = scala.None, totalJobs: scala.Option[scala.Int] = scala.None, completedJobs: scala.Option[scala.Int] = scala.None, resultCode: scala.Option[java.lang.String] = scala.None, networkProfile: scala.Option[org.lyranthe.araethura.devicefarm.models.NetworkProfile] = scala.None)
final case class CPU(frequency: scala.Option[java.lang.String] = scala.None, architecture: scala.Option[java.lang.String] = scala.None, clock: scala.Option[scala.Double] = scala.None)
final case class ListTestsResult(tests: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Test]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteProjectRequest(arn: java.lang.String)
final case class DevicePool(arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, rules: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Rule]] = scala.None, description: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class StopRemoteAccessSessionResult(remoteAccessSession: scala.Option[org.lyranthe.araethura.devicefarm.models.RemoteAccessSession] = scala.None)
final case class GetUploadResult(upload: scala.Option[org.lyranthe.araethura.devicefarm.models.Upload] = scala.None)
final case class ListSuitesResult(suites: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Suite]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetTestRequest(arn: java.lang.String)
final case class GetSuiteRequest(arn: java.lang.String)
final case class ExecutionConfiguration(jobTimeoutMinutes: scala.Option[scala.Int] = scala.None, accountsCleanup: scala.Option[scala.Boolean] = scala.None, appPackagesCleanup: scala.Option[scala.Boolean] = scala.None)
final case class RenewOfferingResult(offeringTransaction: scala.Option[org.lyranthe.araethura.devicefarm.models.OfferingTransaction] = scala.None)
final case class CreateDevicePoolRequest(projectArn: java.lang.String, name: java.lang.String, rules: scala.List[org.lyranthe.araethura.devicefarm.models.Rule], description: scala.Option[java.lang.String] = scala.None)
final case class GetOfferingStatusResult(current: scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.devicefarm.models.OfferingStatus]] = scala.None, nextPeriod: scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.devicefarm.models.OfferingStatus]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListUploadsResult(uploads: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Upload]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListDevicesRequest(arn: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ScheduleRunConfiguration(extraDataPackageArn: scala.Option[java.lang.String] = scala.None, networkProfileArn: scala.Option[java.lang.String] = scala.None, customerArtifactPaths: scala.Option[org.lyranthe.araethura.devicefarm.models.CustomerArtifactPaths] = scala.None, radios: scala.Option[org.lyranthe.araethura.devicefarm.models.Radios] = scala.None, locale: scala.Option[java.lang.String] = scala.None, location: scala.Option[org.lyranthe.araethura.devicefarm.models.Location] = scala.None, billingMethod: scala.Option[java.lang.String] = scala.None, auxiliaryApps: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class TrialMinutes(total: scala.Option[scala.Double] = scala.None, remaining: scala.Option[scala.Double] = scala.None)
final case class ListDevicesResult(devices: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Device]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateProjectRequest(arn: java.lang.String, name: scala.Option[java.lang.String] = scala.None, defaultJobTimeoutMinutes: scala.Option[scala.Int] = scala.None)
case object DeleteProjectResult
final case class GetRemoteAccessSessionResult(remoteAccessSession: scala.Option[org.lyranthe.araethura.devicefarm.models.RemoteAccessSession] = scala.None)
final case class ListDevicePoolsResult(devicePools: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.DevicePool]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetJobResult(job: scala.Option[org.lyranthe.araethura.devicefarm.models.Job] = scala.None)
final case class ListRemoteAccessSessionsResult(remoteAccessSessions: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.RemoteAccessSession]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetUploadRequest(arn: java.lang.String)
final case class PurchaseOfferingResult(offeringTransaction: scala.Option[org.lyranthe.araethura.devicefarm.models.OfferingTransaction] = scala.None)
final case class ListArtifactsRequest(arn: java.lang.String, `type`: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetDevicePoolCompatibilityRequest(devicePoolArn: java.lang.String, appArn: scala.Option[java.lang.String] = scala.None, testType: scala.Option[java.lang.String] = scala.None, test: scala.Option[org.lyranthe.araethura.devicefarm.models.ScheduleRunTest] = scala.None)
final case class UpdateDevicePoolRequest(arn: java.lang.String, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, rules: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Rule]] = scala.None)
final case class ListSuitesRequest(arn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class MonetaryAmount(amount: scala.Option[scala.Double] = scala.None, currencyCode: scala.Option[java.lang.String] = scala.None)
final case class Test(arn: scala.Option[java.lang.String] = scala.None, deviceMinutes: scala.Option[org.lyranthe.araethura.devicefarm.models.DeviceMinutes] = scala.None, name: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, result: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, counters: scala.Option[org.lyranthe.araethura.devicefarm.models.Counters] = scala.None, created: scala.Option[java.time.Instant] = scala.None, started: scala.Option[java.time.Instant] = scala.None, stopped: scala.Option[java.time.Instant] = scala.None)
case object DeleteRunResult
final case class ListOfferingPromotionsRequest(nextToken: scala.Option[java.lang.String] = scala.None)
final case class ProblemDetail(arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class CreateRemoteAccessSessionResult(remoteAccessSession: scala.Option[org.lyranthe.araethura.devicefarm.models.RemoteAccessSession] = scala.None)
final case class StopRunRequest(arn: java.lang.String)
final case class ListUniqueProblemsResult(uniqueProblems: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[org.lyranthe.araethura.devicefarm.models.UniqueProblem]]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListNetworkProfilesResult(networkProfiles: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.NetworkProfile]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteNetworkProfileRequest(arn: java.lang.String)
final case class OfferingPromotion(id: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class IncompatibilityMessage(message: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class UniqueProblem(message: scala.Option[java.lang.String] = scala.None, problems: scala.Option[scala.List[org.lyranthe.araethura.devicefarm.models.Problem]] = scala.None)
final case class GetTestResult(test: scala.Option[org.lyranthe.araethura.devicefarm.models.Test] = scala.None)
final case class GetDevicePoolResult(devicePool: scala.Option[org.lyranthe.araethura.devicefarm.models.DevicePool] = scala.None)
final case class NetworkProfile(arn: scala.Option[java.lang.String] = scala.None, uplinkLossPercent: scala.Option[scala.Int] = scala.None, downlinkLossPercent: scala.Option[scala.Int] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, uplinkDelayMs: scala.Option[scala.Long] = scala.None, downlinkJitterMs: scala.Option[scala.Long] = scala.None, downlinkDelayMs: scala.Option[scala.Long] = scala.None, uplinkJitterMs: scala.Option[scala.Long] = scala.None, downlinkBandwidthBits: scala.Option[scala.Long] = scala.None, uplinkBandwidthBits: scala.Option[scala.Long] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class UpdateProjectResult(project: scala.Option[org.lyranthe.araethura.devicefarm.models.Project] = scala.None)
final case class CreateProjectResult(project: scala.Option[org.lyranthe.araethura.devicefarm.models.Project] = scala.None)
final case class ListProjectsRequest(arn: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetDevicePoolRequest(arn: java.lang.String)