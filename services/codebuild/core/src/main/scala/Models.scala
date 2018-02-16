package org.lyranthe.araethura.codebuild.models
final case class LogsLocation(groupName: scala.Option[java.lang.String] = scala.None, streamName: scala.Option[java.lang.String] = scala.None, deepLink: scala.Option[java.lang.String] = scala.None)
final case class ListCuratedEnvironmentImagesOutput(platforms: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentPlatform]] = scala.None)
final case class EnvironmentImage(name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class StartBuildInput(projectName: java.lang.String, sourceVersion: scala.Option[java.lang.String] = scala.None, buildspecOverride: scala.Option[java.lang.String] = scala.None, artifactsOverride: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectArtifacts] = scala.None, timeoutInMinutesOverride: scala.Option[scala.Int] = scala.None, environmentVariablesOverride: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentVariable]] = scala.None)
final case class StopBuildInput(id: java.lang.String)
final case class DeleteWebhookInput(projectName: java.lang.String)
final case class BatchDeleteBuildsInput(ids: scala.List[java.lang.String])
final case class CreateProjectOutput(project: scala.Option[org.lyranthe.araethura.codebuild.models.Project] = scala.None)
final case class BatchGetProjectsOutput(projects: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Project]] = scala.None, projectsNotFound: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ListBuildsForProjectInput(projectName: java.lang.String, sortOrder: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class BuildPhase(startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, contexts: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.PhaseContext]] = scala.None, phaseType: scala.Option[java.lang.String] = scala.None, phaseStatus: scala.Option[java.lang.String] = scala.None, durationInSeconds: scala.Option[scala.Long] = scala.None)
final case class SourceAuth(`type`: java.lang.String, resource: scala.Option[java.lang.String] = scala.None)
final case class EnvironmentPlatform(platform: scala.Option[java.lang.String] = scala.None, languages: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentLanguage]] = scala.None)
case object ResourceNotFoundException
case object ListCuratedEnvironmentImagesInput
final case class CreateWebhookInput(projectName: java.lang.String)
final case class ProjectEnvironment(image: java.lang.String, computeType: java.lang.String, `type`: java.lang.String, privilegedMode: scala.Option[scala.Boolean] = scala.None, environmentVariables: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentVariable]] = scala.None)
final case class BuildNotDeleted(id: scala.Option[java.lang.String] = scala.None, statusCode: scala.Option[java.lang.String] = scala.None)
final case class ListBuildsForProjectOutput(ids: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteProjectInput(name: java.lang.String)
final case class UpdateProjectOutput(project: scala.Option[org.lyranthe.araethura.codebuild.models.Project] = scala.None)
final case class EnvironmentLanguage(language: scala.Option[java.lang.String] = scala.None, images: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentImage]] = scala.None)
final case class StopBuildOutput(build: scala.Option[org.lyranthe.araethura.codebuild.models.Build] = scala.None)
case object DeleteProjectOutput
final case class ProjectArtifacts(`type`: java.lang.String, location: scala.Option[java.lang.String] = scala.None, path: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, namespaceType: scala.Option[java.lang.String] = scala.None, packaging: scala.Option[java.lang.String] = scala.None)
final case class ProjectSource(`type`: java.lang.String, location: scala.Option[java.lang.String] = scala.None, buildspec: scala.Option[java.lang.String] = scala.None, auth: scala.Option[org.lyranthe.araethura.codebuild.models.SourceAuth] = scala.None)
final case class BatchGetBuildsInput(ids: scala.List[java.lang.String])
case object DeleteWebhookOutput
final case class BatchDeleteBuildsOutput(buildsDeleted: scala.Option[scala.List[java.lang.String]] = scala.None, buildsNotDeleted: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.BuildNotDeleted]] = scala.None)
final case class BuildArtifacts(location: scala.Option[java.lang.String] = scala.None, sha256sum: scala.Option[java.lang.String] = scala.None, md5sum: scala.Option[java.lang.String] = scala.None)
final case class StartBuildOutput(build: scala.Option[org.lyranthe.araethura.codebuild.models.Build] = scala.None)
final case class BatchGetBuildsOutput(builds: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Build]] = scala.None, buildsNotFound: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class CreateProjectInput(environment: org.lyranthe.araethura.codebuild.models.ProjectEnvironment, artifacts: org.lyranthe.araethura.codebuild.models.ProjectArtifacts, source: org.lyranthe.araethura.codebuild.models.ProjectSource, name: java.lang.String, description: scala.Option[java.lang.String] = scala.None, serviceRole: scala.Option[java.lang.String] = scala.None, encryptionKey: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Tag]] = scala.None, timeoutInMinutes: scala.Option[scala.Int] = scala.None)
case object InvalidInputException
final case class BatchGetProjectsInput(names: scala.List[java.lang.String])
final case class ListBuildsOutput(ids: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListProjectsOutput(nextToken: scala.Option[java.lang.String] = scala.None, projects: scala.Option[scala.List[java.lang.String]] = scala.None)
case object ResourceAlreadyExistsException
final case class Tag(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
case object AccountLimitExceededException
final case class PhaseContext(statusCode: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None)
final case class UpdateProjectInput(name: java.lang.String, description: scala.Option[java.lang.String] = scala.None, serviceRole: scala.Option[java.lang.String] = scala.None, encryptionKey: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Tag]] = scala.None, environment: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectEnvironment] = scala.None, artifacts: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectArtifacts] = scala.None, source: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectSource] = scala.None, timeoutInMinutes: scala.Option[scala.Int] = scala.None)
final case class Project(created: scala.Option[java.time.Instant] = scala.None, lastModified: scala.Option[java.time.Instant] = scala.None, description: scala.Option[java.lang.String] = scala.None, serviceRole: scala.Option[java.lang.String] = scala.None, encryptionKey: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Tag]] = scala.None, arn: scala.Option[java.lang.String] = scala.None, environment: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectEnvironment] = scala.None, artifacts: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectArtifacts] = scala.None, source: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectSource] = scala.None, timeoutInMinutes: scala.Option[scala.Int] = scala.None, webhook: scala.Option[org.lyranthe.araethura.codebuild.models.Webhook] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class ListProjectsInput(sortBy: scala.Option[java.lang.String] = scala.None, sortOrder: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Webhook(url: scala.Option[java.lang.String] = scala.None)
final case class EnvironmentVariable(name: java.lang.String, value: java.lang.String, `type`: scala.Option[java.lang.String] = scala.None)
case object OAuthProviderException
final case class CreateWebhookOutput(webhook: scala.Option[org.lyranthe.araethura.codebuild.models.Webhook] = scala.None)
final case class ListBuildsInput(sortOrder: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Build(logs: scala.Option[org.lyranthe.araethura.codebuild.models.LogsLocation] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, id: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, sourceVersion: scala.Option[java.lang.String] = scala.None, projectName: scala.Option[java.lang.String] = scala.None, currentPhase: scala.Option[java.lang.String] = scala.None, initiator: scala.Option[java.lang.String] = scala.None, timeoutInMinutes: scala.Option[scala.Int] = scala.None, environment: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectEnvironment] = scala.None, buildStatus: scala.Option[java.lang.String] = scala.None, source: scala.Option[org.lyranthe.araethura.codebuild.models.ProjectSource] = scala.None, artifacts: scala.Option[org.lyranthe.araethura.codebuild.models.BuildArtifacts] = scala.None, phases: scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.BuildPhase]] = scala.None, buildComplete: scala.Option[scala.Boolean] = scala.None)