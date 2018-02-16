package org.lyranthe.araethura.codedeploy
trait Amazoncodedeploy[F[_]] {
  def deleteDeploymentConfig(input: org.lyranthe.araethura.codedeploy.models.DeleteDeploymentConfigInput): F[scala.Unit]
  def batchGetDeploymentInstances(input: org.lyranthe.araethura.codedeploy.models.BatchGetDeploymentInstancesInput): F[org.lyranthe.araethura.codedeploy.models.BatchGetDeploymentInstancesOutput]
  def deleteApplication(input: org.lyranthe.araethura.codedeploy.models.DeleteApplicationInput): F[scala.Unit]
  def batchGetApplicationRevisions(input: org.lyranthe.araethura.codedeploy.models.BatchGetApplicationRevisionsInput): F[org.lyranthe.araethura.codedeploy.models.BatchGetApplicationRevisionsOutput]
  def createDeploymentGroup(input: org.lyranthe.araethura.codedeploy.models.CreateDeploymentGroupInput): F[org.lyranthe.araethura.codedeploy.models.CreateDeploymentGroupOutput]
  def listDeploymentInstances(input: org.lyranthe.araethura.codedeploy.models.ListDeploymentInstancesInput): F[org.lyranthe.araethura.codedeploy.models.ListDeploymentInstancesOutput]
  def stopDeployment(input: org.lyranthe.araethura.codedeploy.models.StopDeploymentInput): F[org.lyranthe.araethura.codedeploy.models.StopDeploymentOutput]
  def registerOnPremisesInstance(input: org.lyranthe.araethura.codedeploy.models.RegisterOnPremisesInstanceInput): F[scala.Unit]
  def listGitHubAccountTokenNames(input: org.lyranthe.araethura.codedeploy.models.ListGitHubAccountTokenNamesInput): F[org.lyranthe.araethura.codedeploy.models.ListGitHubAccountTokenNamesOutput]
  def getDeploymentInstance(input: org.lyranthe.araethura.codedeploy.models.GetDeploymentInstanceInput): F[org.lyranthe.araethura.codedeploy.models.GetDeploymentInstanceOutput]
  def updateDeploymentGroup(input: org.lyranthe.araethura.codedeploy.models.UpdateDeploymentGroupInput): F[org.lyranthe.araethura.codedeploy.models.UpdateDeploymentGroupOutput]
  def listDeployments(input: org.lyranthe.araethura.codedeploy.models.ListDeploymentsInput): F[org.lyranthe.araethura.codedeploy.models.ListDeploymentsOutput]
  def createDeployment(input: org.lyranthe.araethura.codedeploy.models.CreateDeploymentInput): F[org.lyranthe.araethura.codedeploy.models.CreateDeploymentOutput]
  def removeTagsFromOnPremisesInstances(input: org.lyranthe.araethura.codedeploy.models.RemoveTagsFromOnPremisesInstancesInput): F[scala.Unit]
  def deleteDeploymentGroup(input: org.lyranthe.araethura.codedeploy.models.DeleteDeploymentGroupInput): F[org.lyranthe.araethura.codedeploy.models.DeleteDeploymentGroupOutput]
  def addTagsToOnPremisesInstances(input: org.lyranthe.araethura.codedeploy.models.AddTagsToOnPremisesInstancesInput): F[scala.Unit]
  def createDeploymentConfig(input: org.lyranthe.araethura.codedeploy.models.CreateDeploymentConfigInput): F[org.lyranthe.araethura.codedeploy.models.CreateDeploymentConfigOutput]
  def getDeployment(input: org.lyranthe.araethura.codedeploy.models.GetDeploymentInput): F[org.lyranthe.araethura.codedeploy.models.GetDeploymentOutput]
  def skipWaitTimeForInstanceTermination(input: org.lyranthe.araethura.codedeploy.models.SkipWaitTimeForInstanceTerminationInput): F[scala.Unit]
  def updateApplication(input: org.lyranthe.araethura.codedeploy.models.UpdateApplicationInput): F[scala.Unit]
  def getDeploymentConfig(input: org.lyranthe.araethura.codedeploy.models.GetDeploymentConfigInput): F[org.lyranthe.araethura.codedeploy.models.GetDeploymentConfigOutput]
  def listDeploymentConfigs(input: org.lyranthe.araethura.codedeploy.models.ListDeploymentConfigsInput): F[org.lyranthe.araethura.codedeploy.models.ListDeploymentConfigsOutput]
  def continueDeployment(input: org.lyranthe.araethura.codedeploy.models.ContinueDeploymentInput): F[scala.Unit]
  def listOnPremisesInstances(input: org.lyranthe.araethura.codedeploy.models.ListOnPremisesInstancesInput): F[org.lyranthe.araethura.codedeploy.models.ListOnPremisesInstancesOutput]
  def listApplicationRevisions(input: org.lyranthe.araethura.codedeploy.models.ListApplicationRevisionsInput): F[org.lyranthe.araethura.codedeploy.models.ListApplicationRevisionsOutput]
  def listApplications(input: org.lyranthe.araethura.codedeploy.models.ListApplicationsInput): F[org.lyranthe.araethura.codedeploy.models.ListApplicationsOutput]
  def getApplicationRevision(input: org.lyranthe.araethura.codedeploy.models.GetApplicationRevisionInput): F[org.lyranthe.araethura.codedeploy.models.GetApplicationRevisionOutput]
  def createApplication(input: org.lyranthe.araethura.codedeploy.models.CreateApplicationInput): F[org.lyranthe.araethura.codedeploy.models.CreateApplicationOutput]
  def getOnPremisesInstance(input: org.lyranthe.araethura.codedeploy.models.GetOnPremisesInstanceInput): F[org.lyranthe.araethura.codedeploy.models.GetOnPremisesInstanceOutput]
  def getDeploymentGroup(input: org.lyranthe.araethura.codedeploy.models.GetDeploymentGroupInput): F[org.lyranthe.araethura.codedeploy.models.GetDeploymentGroupOutput]
  def registerApplicationRevision(input: org.lyranthe.araethura.codedeploy.models.RegisterApplicationRevisionInput): F[scala.Unit]
  def batchGetDeploymentGroups(input: org.lyranthe.araethura.codedeploy.models.BatchGetDeploymentGroupsInput): F[org.lyranthe.araethura.codedeploy.models.BatchGetDeploymentGroupsOutput]
  def batchGetDeployments(input: org.lyranthe.araethura.codedeploy.models.BatchGetDeploymentsInput): F[org.lyranthe.araethura.codedeploy.models.BatchGetDeploymentsOutput]
  def batchGetApplications(input: org.lyranthe.araethura.codedeploy.models.BatchGetApplicationsInput): F[org.lyranthe.araethura.codedeploy.models.BatchGetApplicationsOutput]
  def batchGetOnPremisesInstances(input: org.lyranthe.araethura.codedeploy.models.BatchGetOnPremisesInstancesInput): F[org.lyranthe.araethura.codedeploy.models.BatchGetOnPremisesInstancesOutput]
  def getApplication(input: org.lyranthe.araethura.codedeploy.models.GetApplicationInput): F[org.lyranthe.araethura.codedeploy.models.GetApplicationOutput]
  def listDeploymentGroups(input: org.lyranthe.araethura.codedeploy.models.ListDeploymentGroupsInput): F[org.lyranthe.araethura.codedeploy.models.ListDeploymentGroupsOutput]
  def deregisterOnPremisesInstance(input: org.lyranthe.araethura.codedeploy.models.DeregisterOnPremisesInstanceInput): F[scala.Unit]
}