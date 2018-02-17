package avias.kinesisanalytics.http4s
import org.http4s.Method._
import avias.kinesisanalytics.circe._
import avias.kinesisanalytics.models
class AmazonkinesisanalyticsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.kinesisanalytics.Amazonkinesisanalytics[F] {
  private[this] final val ServiceType: String = "kinesisanalytics"
  private[this] final val ServiceAndPrefix: Option[String] = Some("KinesisAnalytics_20150814")
  override def createApplication(input: avias.kinesisanalytics.models.CreateApplicationRequest): F[avias.kinesisanalytics.models.CreateApplicationResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.kinesisanalytics.models.CreateApplicationResponse, avias.kinesisanalytics.models.CreateApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateApplication", POST, "/", input)
  override def deleteApplicationInputProcessingConfiguration(input: avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteApplicationInputProcessingConfiguration", POST, "/", input)
  override def deleteApplicationOutput(input: avias.kinesisanalytics.models.DeleteApplicationOutputRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.DeleteApplicationOutputRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteApplicationOutput", POST, "/", input)
  override def deleteApplicationReferenceDataSource(input: avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteApplicationReferenceDataSource", POST, "/", input)
  override def listApplications(input: avias.kinesisanalytics.models.ListApplicationsRequest): F[avias.kinesisanalytics.models.ListApplicationsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.kinesisanalytics.models.ListApplicationsResponse, avias.kinesisanalytics.models.ListApplicationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListApplications", POST, "/", input)
  override def deleteApplication(input: avias.kinesisanalytics.models.DeleteApplicationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.DeleteApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteApplication", POST, "/", input)
  override def stopApplication(input: avias.kinesisanalytics.models.StopApplicationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.StopApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopApplication", POST, "/", input)
  override def addApplicationOutput(input: avias.kinesisanalytics.models.AddApplicationOutputRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.AddApplicationOutputRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddApplicationOutput", POST, "/", input)
  override def addApplicationReferenceDataSource(input: avias.kinesisanalytics.models.AddApplicationReferenceDataSourceRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.AddApplicationReferenceDataSourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddApplicationReferenceDataSource", POST, "/", input)
  override def updateApplication(input: avias.kinesisanalytics.models.UpdateApplicationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.UpdateApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateApplication", POST, "/", input)
  override def describeApplication(input: avias.kinesisanalytics.models.DescribeApplicationRequest): F[avias.kinesisanalytics.models.DescribeApplicationResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.kinesisanalytics.models.DescribeApplicationResponse, avias.kinesisanalytics.models.DescribeApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeApplication", POST, "/", input)
  override def addApplicationInputProcessingConfiguration(input: avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddApplicationInputProcessingConfiguration", POST, "/", input)
  override def deleteApplicationCloudWatchLoggingOption(input: avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteApplicationCloudWatchLoggingOption", POST, "/", input)
  override def startApplication(input: avias.kinesisanalytics.models.StartApplicationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.StartApplicationRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartApplication", POST, "/", input)
  override def discoverInputSchema(input: avias.kinesisanalytics.models.DiscoverInputSchemaRequest): F[avias.kinesisanalytics.models.DiscoverInputSchemaResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.kinesisanalytics.models.DiscoverInputSchemaResponse, avias.kinesisanalytics.models.DiscoverInputSchemaRequest](client, awsData, ServiceType, ServiceAndPrefix, "DiscoverInputSchema", POST, "/", input)
  override def addApplicationInput(input: avias.kinesisanalytics.models.AddApplicationInputRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.AddApplicationInputRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddApplicationInput", POST, "/", input)
  override def addApplicationCloudWatchLoggingOption(input: avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddApplicationCloudWatchLoggingOption", POST, "/", input)
}