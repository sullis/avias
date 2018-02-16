package org.lyranthe.araethura.applicationautoscaling.models
final case class FailedResourceAccessException(message: scala.Option[java.lang.String] = scala.None)
final case class ScalableTarget(resourceId: java.lang.String, roleARN: java.lang.String, serviceNamespace: java.lang.String, creationTime: java.time.Instant, minCapacity: scala.Int, maxCapacity: scala.Int, scalableDimension: java.lang.String)
final case class DescribeScheduledActionsRequest(serviceNamespace: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, scheduledActionNames: scala.Option[scala.List[java.lang.String]] = scala.None, scalableDimension: scala.Option[java.lang.String] = scala.None)
case object RegisterScalableTargetResponse
final case class DescribeScalingPoliciesResponse(scalingPolicies: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.ScalingPolicy]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ConcurrentUpdateException(message: scala.Option[java.lang.String] = scala.None)
case object DeregisterScalableTargetResponse
final case class DescribeScalingActivitiesRequest(serviceNamespace: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, scalableDimension: scala.Option[java.lang.String] = scala.None)
final case class StepScalingPolicyConfiguration(minAdjustmentMagnitude: scala.Option[scala.Int] = scala.None, metricAggregationType: scala.Option[java.lang.String] = scala.None, adjustmentType: scala.Option[java.lang.String] = scala.None, stepAdjustments: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.StepAdjustment]] = scala.None, cooldown: scala.Option[scala.Int] = scala.None)
final case class InternalServiceException(message: scala.Option[java.lang.String] = scala.None)
final case class CustomizedMetricSpecification(statistic: java.lang.String, namespace: java.lang.String, metricName: java.lang.String, dimensions: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.MetricDimension]] = scala.None, unit: scala.Option[java.lang.String] = scala.None)
final case class DescribeScheduledActionsResponse(scheduledActions: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.ScheduledAction]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class TargetTrackingScalingPolicyConfiguration(targetValue: scala.Double, customizedMetricSpecification: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.CustomizedMetricSpecification] = scala.None, scaleOutCooldown: scala.Option[scala.Int] = scala.None, scaleInCooldown: scala.Option[scala.Int] = scala.None, predefinedMetricSpecification: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.PredefinedMetricSpecification] = scala.None, disableScaleIn: scala.Option[scala.Boolean] = scala.None)
final case class DescribeScalingActivitiesResponse(scalingActivities: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.ScalingActivity]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ScheduledAction(scheduledActionARN: java.lang.String, schedule: java.lang.String, resourceId: java.lang.String, serviceNamespace: java.lang.String, creationTime: java.time.Instant, scheduledActionName: java.lang.String, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, scalableDimension: scala.Option[java.lang.String] = scala.None, scalableTargetAction: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.ScalableTargetAction] = scala.None)
final case class LimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class RegisterScalableTargetRequest(serviceNamespace: java.lang.String, resourceId: java.lang.String, scalableDimension: java.lang.String, roleARN: scala.Option[java.lang.String] = scala.None, minCapacity: scala.Option[scala.Int] = scala.None, maxCapacity: scala.Option[scala.Int] = scala.None)
final case class ScalingPolicy(policyARN: java.lang.String, resourceId: java.lang.String, policyType: java.lang.String, serviceNamespace: java.lang.String, policyName: java.lang.String, creationTime: java.time.Instant, scalableDimension: java.lang.String, stepScalingPolicyConfiguration: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.StepScalingPolicyConfiguration] = scala.None, targetTrackingScalingPolicyConfiguration: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration] = scala.None, alarms: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.Alarm]] = scala.None)
final case class DeleteScheduledActionRequest(serviceNamespace: java.lang.String, scheduledActionName: java.lang.String, resourceId: java.lang.String, scalableDimension: scala.Option[java.lang.String] = scala.None)
final case class PutScalingPolicyResponse(policyARN: java.lang.String, alarms: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.Alarm]] = scala.None)
final case class PredefinedMetricSpecification(predefinedMetricType: java.lang.String, resourceLabel: scala.Option[java.lang.String] = scala.None)
final case class DescribeScalingPoliciesRequest(serviceNamespace: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, policyNames: scala.Option[scala.List[java.lang.String]] = scala.None, scalableDimension: scala.Option[java.lang.String] = scala.None)
case object DeleteScalingPolicyResponse
final case class PutScalingPolicyRequest(resourceId: java.lang.String, serviceNamespace: java.lang.String, policyName: java.lang.String, scalableDimension: java.lang.String, policyType: scala.Option[java.lang.String] = scala.None, stepScalingPolicyConfiguration: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.StepScalingPolicyConfiguration] = scala.None, targetTrackingScalingPolicyConfiguration: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.TargetTrackingScalingPolicyConfiguration] = scala.None)
final case class DeregisterScalableTargetRequest(serviceNamespace: java.lang.String, resourceId: java.lang.String, scalableDimension: java.lang.String)
final case class ScalingActivity(description: java.lang.String, cause: java.lang.String, resourceId: java.lang.String, serviceNamespace: java.lang.String, startTime: java.time.Instant, statusCode: java.lang.String, scalableDimension: java.lang.String, activityId: java.lang.String, statusMessage: scala.Option[java.lang.String] = scala.None, details: scala.Option[java.lang.String] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None)
final case class ObjectNotFoundException(message: scala.Option[java.lang.String] = scala.None)
case object DeleteScheduledActionResponse
final case class StepAdjustment(scalingAdjustment: scala.Int, metricIntervalLowerBound: scala.Option[scala.Double] = scala.None, metricIntervalUpperBound: scala.Option[scala.Double] = scala.None)
final case class MetricDimension(name: java.lang.String, value: java.lang.String)
final case class PutScheduledActionRequest(resourceId: java.lang.String, serviceNamespace: java.lang.String, scheduledActionName: java.lang.String, schedule: scala.Option[java.lang.String] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, scalableDimension: scala.Option[java.lang.String] = scala.None, scalableTargetAction: scala.Option[org.lyranthe.araethura.applicationautoscaling.models.ScalableTargetAction] = scala.None)
final case class Alarm(alarmName: java.lang.String, alarmARN: java.lang.String)
final case class ScalableTargetAction(minCapacity: scala.Option[scala.Int] = scala.None, maxCapacity: scala.Option[scala.Int] = scala.None)
case object PutScheduledActionResponse
final case class ValidationException(message: scala.Option[java.lang.String] = scala.None)
final case class InvalidNextTokenException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeScalableTargetsResponse(scalableTargets: scala.Option[scala.List[org.lyranthe.araethura.applicationautoscaling.models.ScalableTarget]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeScalableTargetsRequest(serviceNamespace: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, resourceIds: scala.Option[scala.List[java.lang.String]] = scala.None, scalableDimension: scala.Option[java.lang.String] = scala.None)
final case class DeleteScalingPolicyRequest(policyName: java.lang.String, resourceId: java.lang.String, serviceNamespace: java.lang.String, scalableDimension: java.lang.String)