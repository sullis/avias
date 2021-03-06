package avias.inspector.models
final case class DeleteAssessmentRunRequest(assessmentRunArn: java.lang.String)
final case class Subscription(resourceArn: java.lang.String, topicArn: java.lang.String, eventSubscriptions: scala.List[avias.inspector.models.EventSubscription])
final case class StopAssessmentRunRequest(assessmentRunArn: java.lang.String, stopAction: scala.Option[java.lang.String] = scala.None)
final case class AssetAttributes(schemaVersion: scala.Int, ipv4Addresses: scala.Option[scala.List[java.lang.String]] = scala.None, hostname: scala.Option[java.lang.String] = scala.None, autoScalingGroup: scala.Option[java.lang.String] = scala.None, agentId: scala.Option[java.lang.String] = scala.None, amiId: scala.Option[java.lang.String] = scala.None)
final case class DescribeResourceGroupsRequest(resourceGroupArns: scala.List[java.lang.String])
final case class TelemetryMetadata(messageType: java.lang.String, count: scala.Long, dataSize: scala.Option[scala.Long] = scala.None)
final case class Finding(createdAt: java.time.Instant, updatedAt: java.time.Instant, arn: java.lang.String, userAttributes: scala.List[avias.inspector.models.Attribute], attributes: scala.List[avias.inspector.models.Attribute], assetAttributes: scala.Option[avias.inspector.models.AssetAttributes] = scala.None, severity: scala.Option[java.lang.String] = scala.None, title: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, recommendation: scala.Option[java.lang.String] = scala.None, schemaVersion: scala.Option[scala.Int] = scala.None, confidence: scala.Option[scala.Int] = scala.None, id: scala.Option[java.lang.String] = scala.None, service: scala.Option[java.lang.String] = scala.None, assetType: scala.Option[java.lang.String] = scala.None, numericSeverity: scala.Option[scala.Double] = scala.None, indicatorOfCompromise: scala.Option[scala.Boolean] = scala.None, serviceAttributes: scala.Option[avias.inspector.models.InspectorServiceAttributes] = scala.None)
final case class AgentAlreadyRunningAssessment(agentId: java.lang.String, assessmentRunArn: java.lang.String)
final case class EventSubscription(event: java.lang.String, subscribedAt: java.time.Instant)
final case class DurationRange(minSeconds: scala.Option[scala.Int] = scala.None, maxSeconds: scala.Option[scala.Int] = scala.None)
final case class FailedItemDetails(failureCode: java.lang.String, retryable: scala.Boolean)
final case class ListTagsForResourceResponse(tags: scala.List[avias.inspector.models.Tag])
final case class PreviewAgentsResponse(agentPreviews: scala.List[avias.inspector.models.AgentPreview], nextToken: scala.Option[java.lang.String] = scala.None)
final case class RemoveAttributesFromFindingsRequest(findingArns: scala.List[java.lang.String], attributeKeys: scala.List[java.lang.String])
final case class ListEventSubscriptionsResponse(subscriptions: scala.List[avias.inspector.models.Subscription], nextToken: scala.Option[java.lang.String] = scala.None)
final case class ResourceGroup(arn: java.lang.String, tags: scala.List[avias.inspector.models.ResourceGroupTag], createdAt: java.time.Instant)
final case class AddAttributesToFindingsRequest(findingArns: scala.List[java.lang.String], attributes: scala.List[avias.inspector.models.Attribute])
final case class CreateResourceGroupResponse(resourceGroupArn: java.lang.String)
final case class ListFindingsRequest(assessmentRunArns: scala.Option[scala.List[java.lang.String]] = scala.None, filter: scala.Option[avias.inspector.models.FindingFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AssessmentTemplateFilter(namePattern: scala.Option[java.lang.String] = scala.None, durationRange: scala.Option[avias.inspector.models.DurationRange] = scala.None, rulesPackageArns: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class CreateResourceGroupRequest(resourceGroupTags: scala.List[avias.inspector.models.ResourceGroupTag])
final case class RemoveAttributesFromFindingsResponse(failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class DescribeAssessmentRunsResponse(assessmentRuns: scala.List[avias.inspector.models.AssessmentRun], failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class AgentPreview(agentId: java.lang.String, autoScalingGroup: scala.Option[java.lang.String] = scala.None)
final case class AccessDeniedException(message: java.lang.String, errorCode: java.lang.String, canRetry: scala.Boolean)
final case class DeleteAssessmentTemplateRequest(assessmentTemplateArn: java.lang.String)
final case class GetTelemetryMetadataRequest(assessmentRunArn: java.lang.String)
final case class TimestampRange(beginDate: scala.Option[java.time.Instant] = scala.None, endDate: scala.Option[java.time.Instant] = scala.None)
final case class RulesPackage(name: java.lang.String, arn: java.lang.String, version: java.lang.String, provider: java.lang.String, description: scala.Option[java.lang.String] = scala.None)
final case class DescribeRulesPackagesResponse(rulesPackages: scala.List[avias.inspector.models.RulesPackage], failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class InternalException(message: java.lang.String, canRetry: scala.Boolean)
final case class ListFindingsResponse(findingArns: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListAssessmentTemplatesRequest(assessmentTargetArns: scala.Option[scala.List[java.lang.String]] = scala.None, filter: scala.Option[avias.inspector.models.AssessmentTemplateFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class Tag(key: java.lang.String, value: scala.Option[java.lang.String] = scala.None)
final case class DescribeAssessmentTargetsRequest(assessmentTargetArns: scala.List[java.lang.String])
final case class GetAssessmentReportResponse(status: java.lang.String, url: scala.Option[java.lang.String] = scala.None)
final case class AssessmentRunAgent(assessmentRunArn: java.lang.String, agentHealth: java.lang.String, telemetryMetadata: scala.List[avias.inspector.models.TelemetryMetadata], agentId: java.lang.String, agentHealthCode: java.lang.String, agentHealthDetails: scala.Option[java.lang.String] = scala.None, autoScalingGroup: scala.Option[java.lang.String] = scala.None)
final case class RegisterCrossAccountAccessRoleRequest(roleArn: java.lang.String)
final case class FindingFilter(autoScalingGroups: scala.Option[scala.List[java.lang.String]] = scala.None, creationTimeRange: scala.Option[avias.inspector.models.TimestampRange] = scala.None, severities: scala.Option[scala.List[java.lang.String]] = scala.None, attributes: scala.Option[scala.List[avias.inspector.models.Attribute]] = scala.None, userAttributes: scala.Option[scala.List[avias.inspector.models.Attribute]] = scala.None, ruleNames: scala.Option[scala.List[java.lang.String]] = scala.None, agentIds: scala.Option[scala.List[java.lang.String]] = scala.None, rulesPackageArns: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ListAssessmentRunsResponse(assessmentRunArns: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class InvalidInputException(message: java.lang.String, errorCode: java.lang.String, canRetry: scala.Boolean)
final case class UnsubscribeFromEventRequest(resourceArn: java.lang.String, topicArn: java.lang.String, event: java.lang.String)
final case class DescribeAssessmentTargetsResponse(assessmentTargets: scala.List[avias.inspector.models.AssessmentTarget], failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class UnsupportedFeatureException(message: java.lang.String, canRetry: scala.Boolean)
final case class DeleteAssessmentTargetRequest(assessmentTargetArn: java.lang.String)
final case class StartAssessmentRunRequest(assessmentTemplateArn: java.lang.String, assessmentRunName: scala.Option[java.lang.String] = scala.None)
final case class Attribute(key: java.lang.String, value: scala.Option[java.lang.String] = scala.None)
final case class CreateAssessmentTargetResponse(assessmentTargetArn: java.lang.String)
final case class ListRulesPackagesResponse(rulesPackageArns: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateAssessmentTemplateResponse(assessmentTemplateArn: java.lang.String)
final case class DescribeAssessmentTemplatesResponse(assessmentTemplates: scala.List[avias.inspector.models.AssessmentTemplate], failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class InvalidCrossAccountRoleException(message: java.lang.String, errorCode: java.lang.String, canRetry: scala.Boolean)
final case class SetTagsForResourceRequest(resourceArn: java.lang.String, tags: scala.Option[scala.List[avias.inspector.models.Tag]] = scala.None)
final case class ListEventSubscriptionsRequest(resourceArn: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AssessmentRunFilter(durationRange: scala.Option[avias.inspector.models.DurationRange] = scala.None, startTimeRange: scala.Option[avias.inspector.models.TimestampRange] = scala.None, completionTimeRange: scala.Option[avias.inspector.models.TimestampRange] = scala.None, stateChangeTimeRange: scala.Option[avias.inspector.models.TimestampRange] = scala.None, namePattern: scala.Option[java.lang.String] = scala.None, rulesPackageArns: scala.Option[scala.List[java.lang.String]] = scala.None, states: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ResourceGroupTag(key: java.lang.String, value: scala.Option[java.lang.String] = scala.None)
final case class DescribeCrossAccountAccessRoleResponse(roleArn: java.lang.String, valid: scala.Boolean, registeredAt: java.time.Instant)
final case class StartAssessmentRunResponse(assessmentRunArn: java.lang.String)
final case class LimitExceededException(message: java.lang.String, errorCode: java.lang.String, canRetry: scala.Boolean)
final case class ListAssessmentRunAgentsRequest(assessmentRunArn: java.lang.String, filter: scala.Option[avias.inspector.models.AgentFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ListAssessmentTargetsResponse(assessmentTargetArns: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeAssessmentRunsRequest(assessmentRunArns: scala.List[java.lang.String])
final case class AssessmentTarget(arn: java.lang.String, resourceGroupArn: java.lang.String, name: java.lang.String, createdAt: java.time.Instant, updatedAt: java.time.Instant)
final case class ListRulesPackagesRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AssessmentRunStateChange(stateChangedAt: java.time.Instant, state: java.lang.String)
final case class DescribeResourceGroupsResponse(resourceGroups: scala.List[avias.inspector.models.ResourceGroup], failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class GetAssessmentReportRequest(assessmentRunArn: java.lang.String, reportFileFormat: java.lang.String, reportType: java.lang.String)
final case class AgentsAlreadyRunningAssessmentException(message: java.lang.String, agents: scala.List[avias.inspector.models.AgentAlreadyRunningAssessment], agentsTruncated: scala.Boolean, canRetry: scala.Boolean)
final case class ListTagsForResourceRequest(resourceArn: java.lang.String)
final case class NoSuchEntityException(message: java.lang.String, errorCode: java.lang.String, canRetry: scala.Boolean)
final case class ListAssessmentRunsRequest(assessmentTemplateArns: scala.Option[scala.List[java.lang.String]] = scala.None, filter: scala.Option[avias.inspector.models.AssessmentRunFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AgentFilter(agentHealths: scala.List[java.lang.String], agentHealthCodes: scala.List[java.lang.String])
final case class CreateAssessmentTemplateRequest(assessmentTargetArn: java.lang.String, assessmentTemplateName: java.lang.String, rulesPackageArns: scala.List[java.lang.String], durationInSeconds: scala.Int, userAttributesForFindings: scala.Option[scala.List[avias.inspector.models.Attribute]] = scala.None)
final case class AssessmentRunInProgressException(message: java.lang.String, assessmentRunArns: scala.List[java.lang.String], assessmentRunArnsTruncated: scala.Boolean, canRetry: scala.Boolean)
final case class AddAttributesToFindingsResponse(failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class SubscribeToEventRequest(resourceArn: java.lang.String, topicArn: java.lang.String, event: java.lang.String)
final case class ListAssessmentTemplatesResponse(assessmentTemplateArns: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeFindingsResponse(findings: scala.List[avias.inspector.models.Finding], failedItems: scala.collection.immutable.Map[java.lang.String, avias.inspector.models.FailedItemDetails])
final case class ListAssessmentTargetsRequest(filter: scala.Option[avias.inspector.models.AssessmentTargetFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AssessmentRun(createdAt: java.time.Instant, stateChangedAt: java.time.Instant, arn: java.lang.String, assessmentTemplateArn: java.lang.String, userAttributesForFindings: scala.List[avias.inspector.models.Attribute], name: java.lang.String, rulesPackageArns: scala.List[java.lang.String], stateChanges: scala.List[avias.inspector.models.AssessmentRunStateChange], durationInSeconds: scala.Int, notifications: scala.List[avias.inspector.models.AssessmentRunNotification], findingCounts: scala.collection.immutable.Map[java.lang.String, scala.Int], dataCollected: scala.Boolean, state: java.lang.String, startedAt: scala.Option[java.time.Instant] = scala.None, completedAt: scala.Option[java.time.Instant] = scala.None)
final case class DescribeFindingsRequest(findingArns: scala.List[java.lang.String], locale: scala.Option[java.lang.String] = scala.None)
final case class DescribeRulesPackagesRequest(rulesPackageArns: scala.List[java.lang.String], locale: scala.Option[java.lang.String] = scala.None)
final case class AssessmentRunNotification(date: java.time.Instant, event: java.lang.String, error: scala.Boolean, snsTopicArn: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, snsPublishStatusCode: scala.Option[java.lang.String] = scala.None)
final case class PreviewAgentsRequest(previewAgentsArn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AssessmentTargetFilter(assessmentTargetNamePattern: scala.Option[java.lang.String] = scala.None)
final case class UpdateAssessmentTargetRequest(assessmentTargetArn: java.lang.String, resourceGroupArn: java.lang.String, assessmentTargetName: java.lang.String)
final case class InspectorServiceAttributes(schemaVersion: scala.Int, assessmentRunArn: scala.Option[java.lang.String] = scala.None, rulesPackageArn: scala.Option[java.lang.String] = scala.None)
final case class AssessmentTemplate(createdAt: java.time.Instant, arn: java.lang.String, assessmentTargetArn: java.lang.String, userAttributesForFindings: scala.List[avias.inspector.models.Attribute], name: java.lang.String, rulesPackageArns: scala.List[java.lang.String], durationInSeconds: scala.Int)
final case class GetTelemetryMetadataResponse(telemetryMetadata: scala.List[avias.inspector.models.TelemetryMetadata])
final case class DescribeAssessmentTemplatesRequest(assessmentTemplateArns: scala.List[java.lang.String])
final case class ListAssessmentRunAgentsResponse(assessmentRunAgents: scala.List[avias.inspector.models.AssessmentRunAgent], nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateAssessmentTargetRequest(assessmentTargetName: java.lang.String, resourceGroupArn: java.lang.String)