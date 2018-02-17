package avias.applicationautoscaling.http4s
import org.http4s.Method._
import avias.applicationautoscaling.circe._
import avias.applicationautoscaling.models
class AmazonapplicationautoscalingClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.applicationautoscaling.Amazonapplicationautoscaling[F] {
  private[this] final val ServiceType: String = "autoscaling"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AnyScaleFrontendService")
  override def deregisterScalableTarget(input: avias.applicationautoscaling.models.DeregisterScalableTargetRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.applicationautoscaling.models.DeregisterScalableTargetRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeregisterScalableTarget", POST, "/", input)
  override def registerScalableTarget(input: avias.applicationautoscaling.models.RegisterScalableTargetRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.applicationautoscaling.models.RegisterScalableTargetRequest](client, awsData, ServiceType, ServiceAndPrefix, "RegisterScalableTarget", POST, "/", input)
  override def describeScalingActivities(input: avias.applicationautoscaling.models.DescribeScalingActivitiesRequest): F[avias.applicationautoscaling.models.DescribeScalingActivitiesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.applicationautoscaling.models.DescribeScalingActivitiesResponse, avias.applicationautoscaling.models.DescribeScalingActivitiesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeScalingActivities", POST, "/", input)
  override def deleteScalingPolicy(input: avias.applicationautoscaling.models.DeleteScalingPolicyRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.applicationautoscaling.models.DeleteScalingPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteScalingPolicy", POST, "/", input)
  override def deleteScheduledAction(input: avias.applicationautoscaling.models.DeleteScheduledActionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.applicationautoscaling.models.DeleteScheduledActionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteScheduledAction", POST, "/", input)
  override def putScalingPolicy(input: avias.applicationautoscaling.models.PutScalingPolicyRequest): F[avias.applicationautoscaling.models.PutScalingPolicyResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.applicationautoscaling.models.PutScalingPolicyResponse, avias.applicationautoscaling.models.PutScalingPolicyRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutScalingPolicy", POST, "/", input)
  override def describeScalableTargets(input: avias.applicationautoscaling.models.DescribeScalableTargetsRequest): F[avias.applicationautoscaling.models.DescribeScalableTargetsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.applicationautoscaling.models.DescribeScalableTargetsResponse, avias.applicationautoscaling.models.DescribeScalableTargetsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeScalableTargets", POST, "/", input)
  override def putScheduledAction(input: avias.applicationautoscaling.models.PutScheduledActionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.applicationautoscaling.models.PutScheduledActionRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutScheduledAction", POST, "/", input)
  override def describeScalingPolicies(input: avias.applicationautoscaling.models.DescribeScalingPoliciesRequest): F[avias.applicationautoscaling.models.DescribeScalingPoliciesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.applicationautoscaling.models.DescribeScalingPoliciesResponse, avias.applicationautoscaling.models.DescribeScalingPoliciesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeScalingPolicies", POST, "/", input)
  override def describeScheduledActions(input: avias.applicationautoscaling.models.DescribeScheduledActionsRequest): F[avias.applicationautoscaling.models.DescribeScheduledActionsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.applicationautoscaling.models.DescribeScheduledActionsResponse, avias.applicationautoscaling.models.DescribeScheduledActionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeScheduledActions", POST, "/", input)
}