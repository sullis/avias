package org.lyranthe.araethura.gamelift.http4s
import org.http4s.Method._
import org.lyranthe.araethura.gamelift.circe._
import org.lyranthe.araethura.gamelift.models
class AmazongameliftClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.gamelift.Amazongamelift[F] {
  private[this] final val ServiceType: String = "gamelift"
  private[this] final val ServiceAndPrefix: Option[String] = Some("GameLift")
  override def describeVpcPeeringAuthorizations: F[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsOutput, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeVpcPeeringAuthorizations", POST, "/", ())
  override def createPlayerSession(input: org.lyranthe.araethura.gamelift.models.CreatePlayerSessionInput): F[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreatePlayerSessionOutput, org.lyranthe.araethura.gamelift.models.CreatePlayerSessionInput](client, awsData, ServiceType, ServiceAndPrefix, "CreatePlayerSession", POST, "/", input)
  override def updateGameSession(input: org.lyranthe.araethura.gamelift.models.UpdateGameSessionInput): F[org.lyranthe.araethura.gamelift.models.UpdateGameSessionOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateGameSessionOutput, org.lyranthe.araethura.gamelift.models.UpdateGameSessionInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateGameSession", POST, "/", input)
  override def describeGameSessionDetails(input: org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsInput): F[org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsOutput, org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessionDetails", POST, "/", input)
  override def stopGameSessionPlacement(input: org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementInput): F[org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementOutput, org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementInput](client, awsData, ServiceType, ServiceAndPrefix, "StopGameSessionPlacement", POST, "/", input)
  override def validateMatchmakingRuleSet(input: org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetInput): F[org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetOutput, org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetInput](client, awsData, ServiceType, ServiceAndPrefix, "ValidateMatchmakingRuleSet", POST, "/", input)
  override def listAliases(input: org.lyranthe.araethura.gamelift.models.ListAliasesInput): F[org.lyranthe.araethura.gamelift.models.ListAliasesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.ListAliasesOutput, org.lyranthe.araethura.gamelift.models.ListAliasesInput](client, awsData, ServiceType, ServiceAndPrefix, "ListAliases", POST, "/", input)
  override def getGameSessionLogUrl(input: org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlInput): F[org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlOutput, org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlInput](client, awsData, ServiceType, ServiceAndPrefix, "GetGameSessionLogUrl", POST, "/", input)
  override def describeMatchmaking(input: org.lyranthe.araethura.gamelift.models.DescribeMatchmakingInput): F[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeMatchmakingOutput, org.lyranthe.araethura.gamelift.models.DescribeMatchmakingInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMatchmaking", POST, "/", input)
  override def searchGameSessions(input: org.lyranthe.araethura.gamelift.models.SearchGameSessionsInput): F[org.lyranthe.araethura.gamelift.models.SearchGameSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.SearchGameSessionsOutput, org.lyranthe.araethura.gamelift.models.SearchGameSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "SearchGameSessions", POST, "/", input)
  override def describeRuntimeConfiguration(input: org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationInput): F[org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationOutput, org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeRuntimeConfiguration", POST, "/", input)
  override def stopMatchmaking(input: org.lyranthe.araethura.gamelift.models.StopMatchmakingInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.StopMatchmakingInput](client, awsData, ServiceType, ServiceAndPrefix, "StopMatchmaking", POST, "/", input)
  override def updateFleetCapacity(input: org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityInput): F[org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityOutput, org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateFleetCapacity", POST, "/", input)
  override def describeMatchmakingRuleSets(input: org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsInput): F[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsOutput, org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMatchmakingRuleSets", POST, "/", input)
  override def describeScalingPolicies(input: org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesInput): F[org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesOutput, org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeScalingPolicies", POST, "/", input)
  override def createAlias(input: org.lyranthe.araethura.gamelift.models.CreateAliasInput): F[org.lyranthe.araethura.gamelift.models.CreateAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateAliasOutput, org.lyranthe.araethura.gamelift.models.CreateAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateAlias", POST, "/", input)
  override def createBuild(input: org.lyranthe.araethura.gamelift.models.CreateBuildInput): F[org.lyranthe.araethura.gamelift.models.CreateBuildOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateBuildOutput, org.lyranthe.araethura.gamelift.models.CreateBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateBuild", POST, "/", input)
  override def createVpcPeeringConnection(input: org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateVpcPeeringConnection", POST, "/", input)
  override def describeBuild(input: org.lyranthe.araethura.gamelift.models.DescribeBuildInput): F[org.lyranthe.araethura.gamelift.models.DescribeBuildOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeBuildOutput, org.lyranthe.araethura.gamelift.models.DescribeBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeBuild", POST, "/", input)
  override def createGameSession(input: org.lyranthe.araethura.gamelift.models.CreateGameSessionInput): F[org.lyranthe.araethura.gamelift.models.CreateGameSessionOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateGameSessionOutput, org.lyranthe.araethura.gamelift.models.CreateGameSessionInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateGameSession", POST, "/", input)
  override def createVpcPeeringAuthorization(input: org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationInput): F[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationOutput, org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateVpcPeeringAuthorization", POST, "/", input)
  override def describeFleetPortSettings(input: org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsInput): F[org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsOutput, org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetPortSettings", POST, "/", input)
  override def deleteMatchmakingConfiguration(input: org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteMatchmakingConfiguration", POST, "/", input)
  override def createMatchmakingRuleSet(input: org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetInput): F[org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetOutput, org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateMatchmakingRuleSet", POST, "/", input)
  override def describeAlias(input: org.lyranthe.araethura.gamelift.models.DescribeAliasInput): F[org.lyranthe.araethura.gamelift.models.DescribeAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeAliasOutput, org.lyranthe.araethura.gamelift.models.DescribeAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAlias", POST, "/", input)
  override def deleteVpcPeeringAuthorization(input: org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteVpcPeeringAuthorization", POST, "/", input)
  override def updateBuild(input: org.lyranthe.araethura.gamelift.models.UpdateBuildInput): F[org.lyranthe.araethura.gamelift.models.UpdateBuildOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateBuildOutput, org.lyranthe.araethura.gamelift.models.UpdateBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateBuild", POST, "/", input)
  override def describeMatchmakingConfigurations(input: org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsInput): F[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsOutput, org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeMatchmakingConfigurations", POST, "/", input)
  override def describeFleetAttributes(input: org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesInput): F[org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesOutput, org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetAttributes", POST, "/", input)
  override def deleteAlias(input: org.lyranthe.araethura.gamelift.models.DeleteAliasInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteAlias", POST, "/", input)
  override def createPlayerSessions(input: org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsInput): F[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsOutput, org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "CreatePlayerSessions", POST, "/", input)
  override def updateFleetPortSettings(input: org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsInput): F[org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsOutput, org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateFleetPortSettings", POST, "/", input)
  override def describeGameSessionQueues(input: org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesInput): F[org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesOutput, org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessionQueues", POST, "/", input)
  override def updateMatchmakingConfiguration(input: org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationInput): F[org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationOutput, org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateMatchmakingConfiguration", POST, "/", input)
  override def describeEC2InstanceLimits(input: org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsInput): F[org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsOutput, org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEC2InstanceLimits", POST, "/", input)
  override def updateGameSessionQueue(input: org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueInput): F[org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueOutput, org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateGameSessionQueue", POST, "/", input)
  override def describeInstances(input: org.lyranthe.araethura.gamelift.models.DescribeInstancesInput): F[org.lyranthe.araethura.gamelift.models.DescribeInstancesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeInstancesOutput, org.lyranthe.araethura.gamelift.models.DescribeInstancesInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeInstances", POST, "/", input)
  override def resolveAlias(input: org.lyranthe.araethura.gamelift.models.ResolveAliasInput): F[org.lyranthe.araethura.gamelift.models.ResolveAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.ResolveAliasOutput, org.lyranthe.araethura.gamelift.models.ResolveAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "ResolveAlias", POST, "/", input)
  override def updateFleetAttributes(input: org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesInput): F[org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesOutput, org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateFleetAttributes", POST, "/", input)
  override def getInstanceAccess(input: org.lyranthe.araethura.gamelift.models.GetInstanceAccessInput): F[org.lyranthe.araethura.gamelift.models.GetInstanceAccessOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.GetInstanceAccessOutput, org.lyranthe.araethura.gamelift.models.GetInstanceAccessInput](client, awsData, ServiceType, ServiceAndPrefix, "GetInstanceAccess", POST, "/", input)
  override def updateAlias(input: org.lyranthe.araethura.gamelift.models.UpdateAliasInput): F[org.lyranthe.araethura.gamelift.models.UpdateAliasOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateAliasOutput, org.lyranthe.araethura.gamelift.models.UpdateAliasInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateAlias", POST, "/", input)
  override def listBuilds(input: org.lyranthe.araethura.gamelift.models.ListBuildsInput): F[org.lyranthe.araethura.gamelift.models.ListBuildsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.ListBuildsOutput, org.lyranthe.araethura.gamelift.models.ListBuildsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListBuilds", POST, "/", input)
  override def describeGameSessionPlacement(input: org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementInput): F[org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementOutput, org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessionPlacement", POST, "/", input)
  override def updateRuntimeConfiguration(input: org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationInput): F[org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationOutput, org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateRuntimeConfiguration", POST, "/", input)
  override def deleteScalingPolicy(input: org.lyranthe.araethura.gamelift.models.DeleteScalingPolicyInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteScalingPolicyInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteScalingPolicy", POST, "/", input)
  override def describePlayerSessions(input: org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsInput): F[org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsOutput, org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribePlayerSessions", POST, "/", input)
  override def deleteVpcPeeringConnection(input: org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteVpcPeeringConnection", POST, "/", input)
  override def deleteGameSessionQueue(input: org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteGameSessionQueue", POST, "/", input)
  override def describeVpcPeeringConnections(input: org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsInput): F[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsOutput, org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeVpcPeeringConnections", POST, "/", input)
  override def createMatchmakingConfiguration(input: org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationInput): F[org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationOutput, org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateMatchmakingConfiguration", POST, "/", input)
  override def acceptMatch(input: org.lyranthe.araethura.gamelift.models.AcceptMatchInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.AcceptMatchInput](client, awsData, ServiceType, ServiceAndPrefix, "AcceptMatch", POST, "/", input)
  override def putScalingPolicy(input: org.lyranthe.araethura.gamelift.models.PutScalingPolicyInput): F[org.lyranthe.araethura.gamelift.models.PutScalingPolicyOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.PutScalingPolicyOutput, org.lyranthe.araethura.gamelift.models.PutScalingPolicyInput](client, awsData, ServiceType, ServiceAndPrefix, "PutScalingPolicy", POST, "/", input)
  override def describeFleetEvents(input: org.lyranthe.araethura.gamelift.models.DescribeFleetEventsInput): F[org.lyranthe.araethura.gamelift.models.DescribeFleetEventsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeFleetEventsOutput, org.lyranthe.araethura.gamelift.models.DescribeFleetEventsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetEvents", POST, "/", input)
  override def listFleets(input: org.lyranthe.araethura.gamelift.models.ListFleetsInput): F[org.lyranthe.araethura.gamelift.models.ListFleetsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.ListFleetsOutput, org.lyranthe.araethura.gamelift.models.ListFleetsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListFleets", POST, "/", input)
  override def describeFleetCapacity(input: org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityInput): F[org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityOutput, org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetCapacity", POST, "/", input)
  override def describeFleetUtilization(input: org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationInput): F[org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationOutput, org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeFleetUtilization", POST, "/", input)
  override def deleteBuild(input: org.lyranthe.araethura.gamelift.models.DeleteBuildInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteBuild", POST, "/", input)
  override def deleteFleet(input: org.lyranthe.araethura.gamelift.models.DeleteFleetInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, org.lyranthe.araethura.gamelift.models.DeleteFleetInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteFleet", POST, "/", input)
  override def createGameSessionQueue(input: org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueInput): F[org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueOutput, org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateGameSessionQueue", POST, "/", input)
  override def requestUploadCredentials(input: org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsInput): F[org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsOutput, org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsInput](client, awsData, ServiceType, ServiceAndPrefix, "RequestUploadCredentials", POST, "/", input)
  override def describeGameSessions(input: org.lyranthe.araethura.gamelift.models.DescribeGameSessionsInput): F[org.lyranthe.araethura.gamelift.models.DescribeGameSessionsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.DescribeGameSessionsOutput, org.lyranthe.araethura.gamelift.models.DescribeGameSessionsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeGameSessions", POST, "/", input)
  override def startMatchmaking(input: org.lyranthe.araethura.gamelift.models.StartMatchmakingInput): F[org.lyranthe.araethura.gamelift.models.StartMatchmakingOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.StartMatchmakingOutput, org.lyranthe.araethura.gamelift.models.StartMatchmakingInput](client, awsData, ServiceType, ServiceAndPrefix, "StartMatchmaking", POST, "/", input)
  override def startGameSessionPlacement(input: org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementInput): F[org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementOutput, org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementInput](client, awsData, ServiceType, ServiceAndPrefix, "StartGameSessionPlacement", POST, "/", input)
  override def createFleet(input: org.lyranthe.araethura.gamelift.models.CreateFleetInput): F[org.lyranthe.araethura.gamelift.models.CreateFleetOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.gamelift.models.CreateFleetOutput, org.lyranthe.araethura.gamelift.models.CreateFleetInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateFleet", POST, "/", input)
}