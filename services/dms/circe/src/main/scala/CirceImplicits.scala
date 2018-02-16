package org.lyranthe.araethura.dms
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListTagsForResourceMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ListTagsForResourceMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val DescribeReplicationSubnetGroupsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ResourceNotFoundFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ResourceNotFoundFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeSchemasMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeSchemasMessage] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson, "Marker" -> o.marker.asJson, "MaxRecords" -> o.maxRecords.asJson)
  }
  final implicit val DeleteReplicationInstanceMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteReplicationInstanceMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstanceArn" -> o.replicationInstanceArn.asJson)
  }
  final implicit val DescribeConnectionsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeConnectionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Connections" -> o.connections.asJson)
  }
  final implicit val TestConnectionMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.TestConnectionMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "EndpointArn" -> o.endpointArn.asJson)
  }
  final implicit val SubnetAlreadyInUseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.SubnetAlreadyInUse] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SNSInvalidTopicFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.SNSInvalidTopicFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddTagsToResourceMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.AddTagsToResourceMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val CreateEventSubscriptionMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateEventSubscriptionMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionName" -> o.subscriptionName.asJson, "SnsTopicArn" -> o.snsTopicArn.asJson, "Enabled" -> o.enabled.asJson, "SourceIds" -> o.sourceIds.asJson, "SourceType" -> o.sourceType.asJson, "Tags" -> o.tags.asJson, "EventCategories" -> o.eventCategories.asJson)
  }
  final implicit val ReplicationTaskEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationTask] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskSettings" -> o.replicationTaskSettings.asJson, "TargetEndpointArn" -> o.targetEndpointArn.asJson, "SourceEndpointArn" -> o.sourceEndpointArn.asJson, "ReplicationTaskArn" -> o.replicationTaskArn.asJson, "Status" -> o.status.asJson, "ReplicationTaskIdentifier" -> o.replicationTaskIdentifier.asJson, "ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "LastFailureMessage" -> o.lastFailureMessage.asJson, "TableMappings" -> o.tableMappings.asJson, "StopReason" -> o.stopReason.asJson, "MigrationType" -> o.migrationType.asJson, "ReplicationTaskCreationDate" -> o.replicationTaskCreationDate.asJson, "ReplicationTaskStartDate" -> o.replicationTaskStartDate.asJson, "ReplicationTaskStats" -> o.replicationTaskStats.asJson)
  }
  final implicit val CreateEndpointResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateEndpointResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Endpoint" -> o.endpoint.asJson)
  }
  final implicit val DescribeRefreshSchemasStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("RefreshSchemasStatus" -> o.refreshSchemasStatus.asJson)
  }
  final implicit val EventCategoryGroupEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.EventCategoryGroup] = io.circe.Encoder.instance { o => 
    Json.obj("SourceType" -> o.sourceType.asJson, "EventCategories" -> o.eventCategories.asJson)
  }
  final implicit val DescribeReplicationTaskAssessmentResultsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "BucketName" -> o.bucketName.asJson, "ReplicationTaskAssessmentResults" -> o.replicationTaskAssessmentResults.asJson)
  }
  final implicit val DescribeReplicationInstancesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationInstancesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "ReplicationInstances" -> o.replicationInstances.asJson)
  }
  final implicit val InvalidResourceStateFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.InvalidResourceStateFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val VpcSecurityGroupMembershipEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.VpcSecurityGroupMembership] = io.circe.Encoder.instance { o => 
    Json.obj("VpcSecurityGroupId" -> o.vpcSecurityGroupId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val TableToReloadEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.TableToReload] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaName" -> o.schemaName.asJson, "TableName" -> o.tableName.asJson)
  }
  final implicit val DescribeAccountAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeAccountAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AccountQuotas" -> o.accountQuotas.asJson)
  }
  final implicit val ReplicationSubnetGroupDoesNotCoverEnoughAZsEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationSubnetGroupDoesNotCoverEnoughAZs] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StartReplicationTaskResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StartReplicationTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTask" -> o.replicationTask.asJson)
  }
  final implicit val DeleteEndpointResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteEndpointResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Endpoint" -> o.endpoint.asJson)
  }
  final implicit val ModifyReplicationTaskResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyReplicationTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTask" -> o.replicationTask.asJson)
  }
  final implicit val ModifyReplicationInstanceMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyReplicationInstanceMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "MultiAZ" -> o.multiAZ.asJson, "AutoMinorVersionUpgrade" -> o.autoMinorVersionUpgrade.asJson, "ReplicationInstanceIdentifier" -> o.replicationInstanceIdentifier.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "ReplicationInstanceClass" -> o.replicationInstanceClass.asJson, "EngineVersion" -> o.engineVersion.asJson, "VpcSecurityGroupIds" -> o.vpcSecurityGroupIds.asJson, "AllocatedStorage" -> o.allocatedStorage.asJson, "ApplyImmediately" -> o.applyImmediately.asJson, "AllowMajorVersionUpgrade" -> o.allowMajorVersionUpgrade.asJson)
  }
  final implicit val DynamoDbSettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DynamoDbSettings] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceAccessRoleArn" -> o.serviceAccessRoleArn.asJson)
  }
  final implicit val DescribeEndpointTypesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEndpointTypesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "SupportedEndpointTypes" -> o.supportedEndpointTypes.asJson)
  }
  final implicit val DescribeReplicationSubnetGroupsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "ReplicationSubnetGroups" -> o.replicationSubnetGroups.asJson)
  }
  final implicit val MongoDbSettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.MongoDbSettings] = io.circe.Encoder.instance { o => 
    Json.obj("NestingLevel" -> o.nestingLevel.asJson, "DatabaseName" -> o.databaseName.asJson, "Username" -> o.username.asJson, "DocsToInvestigate" -> o.docsToInvestigate.asJson, "ExtractDocId" -> o.extractDocId.asJson, "ServerName" -> o.serverName.asJson, "AuthSource" -> o.authSource.asJson, "Port" -> o.port.asJson, "AuthMechanism" -> o.authMechanism.asJson, "AuthType" -> o.authType.asJson, "Password" -> o.password.asJson)
  }
  final implicit val InsufficientResourceCapacityFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.InsufficientResourceCapacityFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeReplicationTaskAssessmentResultsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson, "Marker" -> o.marker.asJson, "MaxRecords" -> o.maxRecords.asJson)
  }
  final implicit val CreateReplicationSubnetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationSubnetGroup" -> o.replicationSubnetGroup.asJson)
  }
  final implicit val StartReplicationTaskMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StartReplicationTaskMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson, "StartReplicationTaskType" -> o.startReplicationTaskType.asJson, "CdcStartTime" -> o.cdcStartTime.asJson)
  }
  final implicit val DeleteEventSubscriptionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteEventSubscriptionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EventSubscription" -> o.eventSubscription.asJson)
  }
  final implicit val AccessDeniedFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.AccessDeniedFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CertificateEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Certificate] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "CertificatePem" -> o.certificatePem.asJson, "CertificateIdentifier" -> o.certificateIdentifier.asJson, "CertificateOwner" -> o.certificateOwner.asJson, "SigningAlgorithm" -> o.signingAlgorithm.asJson, "CertificateCreationDate" -> o.certificateCreationDate.asJson, "ValidFromDate" -> o.validFromDate.asJson, "ValidToDate" -> o.validToDate.asJson, "CertificateWallet" -> o.certificateWallet.asJson, "KeyLength" -> o.keyLength.asJson)
  }
  final implicit val DescribeEndpointTypesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEndpointTypesMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val SubnetEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Subnet] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetIdentifier" -> o.subnetIdentifier.asJson, "SubnetStatus" -> o.subnetStatus.asJson, "SubnetAvailabilityZone" -> o.subnetAvailabilityZone.asJson)
  }
  final implicit val CreateReplicationInstanceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateReplicationInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstance" -> o.replicationInstance.asJson)
  }
  final implicit val ReloadTablesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReloadTablesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson)
  }
  final implicit val S3SettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.S3Settings] = io.circe.Encoder.instance { o => 
    Json.obj("BucketName" -> o.bucketName.asJson, "CsvDelimiter" -> o.csvDelimiter.asJson, "BucketFolder" -> o.bucketFolder.asJson, "CsvRowDelimiter" -> o.csvRowDelimiter.asJson, "ExternalTableDefinition" -> o.externalTableDefinition.asJson, "ServiceAccessRoleArn" -> o.serviceAccessRoleArn.asJson, "CompressionType" -> o.compressionType.asJson)
  }
  final implicit val AddTagsToResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.AddTagsToResourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateReplicationInstanceMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateReplicationInstanceMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstanceIdentifier" -> o.replicationInstanceIdentifier.asJson, "ReplicationInstanceClass" -> o.replicationInstanceClass.asJson, "MultiAZ" -> o.multiAZ.asJson, "AutoMinorVersionUpgrade" -> o.autoMinorVersionUpgrade.asJson, "PubliclyAccessible" -> o.publiclyAccessible.asJson, "ReplicationSubnetGroupIdentifier" -> o.replicationSubnetGroupIdentifier.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "EngineVersion" -> o.engineVersion.asJson, "VpcSecurityGroupIds" -> o.vpcSecurityGroupIds.asJson, "AllocatedStorage" -> o.allocatedStorage.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ModifyEndpointResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyEndpointResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Endpoint" -> o.endpoint.asJson)
  }
  final implicit val InvalidSubnetEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.InvalidSubnet] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ReplicationTaskAssessmentResultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationTaskAssessmentResult] = io.circe.Encoder.instance { o => 
    Json.obj("S3ObjectUrl" -> o.s3ObjectUrl.asJson, "ReplicationTaskArn" -> o.replicationTaskArn.asJson, "ReplicationTaskIdentifier" -> o.replicationTaskIdentifier.asJson, "AssessmentResultsFile" -> o.assessmentResultsFile.asJson, "AssessmentResults" -> o.assessmentResults.asJson, "AssessmentStatus" -> o.assessmentStatus.asJson, "ReplicationTaskLastAssessmentDate" -> o.replicationTaskLastAssessmentDate.asJson)
  }
  final implicit val DeleteCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson)
  }
  final implicit val AvailabilityZoneEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.AvailabilityZone] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DescribeRefreshSchemasStatusMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusMessage] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson)
  }
  final implicit val TestConnectionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.TestConnectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Connection" -> o.connection.asJson)
  }
  final implicit val DescribeEndpointsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEndpointsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Endpoints" -> o.endpoints.asJson)
  }
  final implicit val RemoveTagsFromResourceMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.RemoveTagsFromResourceMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val SupportedEndpointTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.SupportedEndpointType] = io.circe.Encoder.instance { o => 
    Json.obj("EngineName" -> o.engineName.asJson, "SupportsCDC" -> o.supportsCDC.asJson, "EndpointType" -> o.endpointType.asJson)
  }
  final implicit val DescribeReplicationInstancesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationInstancesMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DescribeEventsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEventsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SourceType" -> o.sourceType.asJson, "Filters" -> o.filters.asJson, "SourceIdentifier" -> o.sourceIdentifier.asJson, "Marker" -> o.marker.asJson, "Duration" -> o.duration.asJson, "MaxRecords" -> o.maxRecords.asJson, "EventCategories" -> o.eventCategories.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson)
  }
  final implicit val DescribeEventCategoriesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEventCategoriesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EventCategoryGroupList" -> o.eventCategoryGroupList.asJson)
  }
  final implicit val DescribeEventSubscriptionsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "EventSubscriptionsList" -> o.eventSubscriptionsList.asJson)
  }
  final implicit val DescribeReplicationTasksResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "ReplicationTasks" -> o.replicationTasks.asJson)
  }
  final implicit val DeleteEventSubscriptionMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteEventSubscriptionMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionName" -> o.subscriptionName.asJson)
  }
  final implicit val StopReplicationTaskMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StopReplicationTaskMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson)
  }
  final implicit val EventSubscriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.EventSubscription] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionCreationTime" -> o.subscriptionCreationTime.asJson, "Status" -> o.status.asJson, "SourceType" -> o.sourceType.asJson, "CustSubscriptionId" -> o.custSubscriptionId.asJson, "SnsTopicArn" -> o.snsTopicArn.asJson, "CustomerAwsId" -> o.customerAwsId.asJson, "SourceIdsList" -> o.sourceIdsList.asJson, "EventCategoriesList" -> o.eventCategoriesList.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val DescribeTableStatisticsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeTableStatisticsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson, "Marker" -> o.marker.asJson, "MaxRecords" -> o.maxRecords.asJson, "Filters" -> o.filters.asJson)
  }
  final implicit val ModifyReplicationSubnetGroupMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationSubnetGroupIdentifier" -> o.replicationSubnetGroupIdentifier.asJson, "SubnetIds" -> o.subnetIds.asJson, "ReplicationSubnetGroupDescription" -> o.replicationSubnetGroupDescription.asJson)
  }
  final implicit val DeleteEndpointMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteEndpointMessage] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson)
  }
  final implicit val ImportCertificateMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ImportCertificateMessage] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateIdentifier" -> o.certificateIdentifier.asJson, "CertificatePem" -> o.certificatePem.asJson, "CertificateWallet" -> o.certificateWallet.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ModifyReplicationSubnetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationSubnetGroup" -> o.replicationSubnetGroup.asJson)
  }
  final implicit val ReplicationSubnetGroupEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationSubnetGroup] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationSubnetGroupIdentifier" -> o.replicationSubnetGroupIdentifier.asJson, "ReplicationSubnetGroupDescription" -> o.replicationSubnetGroupDescription.asJson, "VpcId" -> o.vpcId.asJson, "SubnetGroupStatus" -> o.subnetGroupStatus.asJson, "Subnets" -> o.subnets.asJson)
  }
  final implicit val ModifyEventSubscriptionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyEventSubscriptionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EventSubscription" -> o.eventSubscription.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("SourceIdentifier" -> o.sourceIdentifier.asJson, "Message" -> o.message.asJson, "SourceType" -> o.sourceType.asJson, "EventCategories" -> o.eventCategories.asJson, "Date" -> o.date.asJson)
  }
  final implicit val UpgradeDependencyFailureFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.UpgradeDependencyFailureFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteReplicationTaskResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteReplicationTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTask" -> o.replicationTask.asJson)
  }
  final implicit val DeleteReplicationSubnetGroupMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationSubnetGroupIdentifier" -> o.replicationSubnetGroupIdentifier.asJson)
  }
  final implicit val ModifyEndpointMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyEndpointMessage] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson, "DatabaseName" -> o.databaseName.asJson, "EndpointIdentifier" -> o.endpointIdentifier.asJson, "CertificateArn" -> o.certificateArn.asJson, "EngineName" -> o.engineName.asJson, "Username" -> o.username.asJson, "ExtraConnectionAttributes" -> o.extraConnectionAttributes.asJson, "ServerName" -> o.serverName.asJson, "Port" -> o.port.asJson, "DynamoDbSettings" -> o.dynamoDbSettings.asJson, "MongoDbSettings" -> o.mongoDbSettings.asJson, "S3Settings" -> o.s3Settings.asJson, "SslMode" -> o.sslMode.asJson, "Password" -> o.password.asJson, "EndpointType" -> o.endpointType.asJson)
  }
  final implicit val EndpointEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Endpoint] = io.circe.Encoder.instance { o => 
    Json.obj("DatabaseName" -> o.databaseName.asJson, "EndpointArn" -> o.endpointArn.asJson, "EndpointIdentifier" -> o.endpointIdentifier.asJson, "CertificateArn" -> o.certificateArn.asJson, "EngineName" -> o.engineName.asJson, "Status" -> o.status.asJson, "Username" -> o.username.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "ExternalId" -> o.externalId.asJson, "ExtraConnectionAttributes" -> o.extraConnectionAttributes.asJson, "ServerName" -> o.serverName.asJson, "Port" -> o.port.asJson, "DynamoDbSettings" -> o.dynamoDbSettings.asJson, "MongoDbSettings" -> o.mongoDbSettings.asJson, "S3Settings" -> o.s3Settings.asJson, "SslMode" -> o.sslMode.asJson, "EndpointType" -> o.endpointType.asJson)
  }
  final implicit val DescribeReplicationTasksMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeReplicationTasksMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InvalidCertificateFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.InvalidCertificateFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeAccountAttributesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeAccountAttributesMessage.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val OrderableReplicationInstanceEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.OrderableReplicationInstance] = io.circe.Encoder.instance { o => 
    Json.obj("EngineVersion" -> o.engineVersion.asJson, "ReplicationInstanceClass" -> o.replicationInstanceClass.asJson, "StorageType" -> o.storageType.asJson, "MinAllocatedStorage" -> o.minAllocatedStorage.asJson, "MaxAllocatedStorage" -> o.maxAllocatedStorage.asJson, "DefaultAllocatedStorage" -> o.defaultAllocatedStorage.asJson, "IncludedAllocatedStorage" -> o.includedAllocatedStorage.asJson)
  }
  final implicit val DescribeSchemasResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeSchemasResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Schemas" -> o.schemas.asJson)
  }
  final implicit val DescribeEventSubscriptionsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionName" -> o.subscriptionName.asJson, "Marker" -> o.marker.asJson, "Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson)
  }
  final implicit val RefreshSchemasResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.RefreshSchemasResponse] = io.circe.Encoder.instance { o => 
    Json.obj("RefreshSchemasStatus" -> o.refreshSchemasStatus.asJson)
  }
  final implicit val DescribeOrderableReplicationInstancesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrderableReplicationInstances" -> o.orderableReplicationInstances.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteReplicationSubnetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventCategoriesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEventCategoriesMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SourceType" -> o.sourceType.asJson, "Filters" -> o.filters.asJson)
  }
  final implicit val ListTagsForResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ListTagsForResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val DeleteReplicationInstanceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteReplicationInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstance" -> o.replicationInstance.asJson)
  }
  final implicit val DescribeTableStatisticsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeTableStatisticsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson, "Marker" -> o.marker.asJson, "TableStatistics" -> o.tableStatistics.asJson)
  }
  final implicit val ModifyEventSubscriptionMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyEventSubscriptionMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionName" -> o.subscriptionName.asJson, "SnsTopicArn" -> o.snsTopicArn.asJson, "SourceType" -> o.sourceType.asJson, "EventCategories" -> o.eventCategories.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val CreateReplicationTaskResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateReplicationTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTask" -> o.replicationTask.asJson)
  }
  final implicit val DeleteReplicationTaskMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteReplicationTaskMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Events" -> o.events.asJson)
  }
  final implicit val RefreshSchemasMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.RefreshSchemasMessage] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson, "ReplicationInstanceArn" -> o.replicationInstanceArn.asJson)
  }
  final implicit val RemoveTagsFromResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.RemoveTagsFromResourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeCertificatesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeCertificatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Certificates" -> o.certificates.asJson)
  }
  final implicit val ModifyReplicationInstanceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyReplicationInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstance" -> o.replicationInstance.asJson)
  }
  final implicit val ReloadTablesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReloadTablesMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson, "TablesToReload" -> o.tablesToReload.asJson)
  }
  final implicit val CreateEndpointMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateEndpointMessage] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointIdentifier" -> o.endpointIdentifier.asJson, "EngineName" -> o.engineName.asJson, "EndpointType" -> o.endpointType.asJson, "DatabaseName" -> o.databaseName.asJson, "CertificateArn" -> o.certificateArn.asJson, "Username" -> o.username.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "ExtraConnectionAttributes" -> o.extraConnectionAttributes.asJson, "ServerName" -> o.serverName.asJson, "Port" -> o.port.asJson, "DynamoDbSettings" -> o.dynamoDbSettings.asJson, "MongoDbSettings" -> o.mongoDbSettings.asJson, "S3Settings" -> o.s3Settings.asJson, "Tags" -> o.tags.asJson, "SslMode" -> o.sslMode.asJson, "Password" -> o.password.asJson)
  }
  final implicit val DescribeOrderableReplicationInstancesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesMessage] = io.circe.Encoder.instance { o => 
    Json.obj("MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ReplicationPendingModifiedValuesEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationPendingModifiedValues] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstanceClass" -> o.replicationInstanceClass.asJson, "EngineVersion" -> o.engineVersion.asJson, "AllocatedStorage" -> o.allocatedStorage.asJson, "MultiAZ" -> o.multiAZ.asJson)
  }
  final implicit val AccountQuotaEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.AccountQuota] = io.circe.Encoder.instance { o => 
    Json.obj("AccountQuotaName" -> o.accountQuotaName.asJson, "Used" -> o.used.asJson, "Max" -> o.max.asJson)
  }
  final implicit val DescribeCertificatesMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeCertificatesMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val CreateEventSubscriptionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateEventSubscriptionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EventSubscription" -> o.eventSubscription.asJson)
  }
  final implicit val KMSKeyNotAccessibleFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.KMSKeyNotAccessibleFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ReplicationTaskStatsEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationTaskStats] = io.circe.Encoder.instance { o => 
    Json.obj("TablesErrored" -> o.tablesErrored.asJson, "TablesLoading" -> o.tablesLoading.asJson, "TablesLoaded" -> o.tablesLoaded.asJson, "TablesQueued" -> o.tablesQueued.asJson, "FullLoadProgressPercent" -> o.fullLoadProgressPercent.asJson, "ElapsedTimeMillis" -> o.elapsedTimeMillis.asJson)
  }
  final implicit val SNSNoAuthorizationFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.SNSNoAuthorizationFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val RefreshSchemasStatusEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.RefreshSchemasStatus] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson, "ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "LastFailureMessage" -> o.lastFailureMessage.asJson, "Status" -> o.status.asJson, "LastRefreshDate" -> o.lastRefreshDate.asJson)
  }
  final implicit val DescribeConnectionsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeConnectionsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ModifyReplicationTaskMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ModifyReplicationTaskMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson, "ReplicationTaskIdentifier" -> o.replicationTaskIdentifier.asJson, "TableMappings" -> o.tableMappings.asJson, "ReplicationTaskSettings" -> o.replicationTaskSettings.asJson, "MigrationType" -> o.migrationType.asJson, "CdcStartTime" -> o.cdcStartTime.asJson)
  }
  final implicit val ConnectionEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Connection] = io.circe.Encoder.instance { o => 
    Json.obj("EndpointArn" -> o.endpointArn.asJson, "EndpointIdentifier" -> o.endpointIdentifier.asJson, "Status" -> o.status.asJson, "ReplicationInstanceIdentifier" -> o.replicationInstanceIdentifier.asJson, "ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "LastFailureMessage" -> o.lastFailureMessage.asJson)
  }
  final implicit val StorageQuotaExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StorageQuotaExceededFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteCertificateMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DeleteCertificateMessage] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val CreateReplicationSubnetGroupMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationSubnetGroupIdentifier" -> o.replicationSubnetGroupIdentifier.asJson, "ReplicationSubnetGroupDescription" -> o.replicationSubnetGroupDescription.asJson, "SubnetIds" -> o.subnetIds.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ImportCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ImportCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson)
  }
  final implicit val FilterEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.Filter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Values" -> o.values.asJson)
  }
  final implicit val StopReplicationTaskResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StopReplicationTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTask" -> o.replicationTask.asJson)
  }
  final implicit val CreateReplicationTaskMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.CreateReplicationTaskMessage] = io.circe.Encoder.instance { o => 
    Json.obj("SourceEndpointArn" -> o.sourceEndpointArn.asJson, "ReplicationTaskIdentifier" -> o.replicationTaskIdentifier.asJson, "TargetEndpointArn" -> o.targetEndpointArn.asJson, "ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "TableMappings" -> o.tableMappings.asJson, "MigrationType" -> o.migrationType.asJson, "ReplicationTaskSettings" -> o.replicationTaskSettings.asJson, "CdcStartTime" -> o.cdcStartTime.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ResourceQuotaExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ResourceQuotaExceededFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StartReplicationTaskAssessmentMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentMessage] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTaskArn" -> o.replicationTaskArn.asJson)
  }
  final implicit val StartReplicationTaskAssessmentResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationTask" -> o.replicationTask.asJson)
  }
  final implicit val ResourceAlreadyExistsFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ResourceAlreadyExistsFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeEndpointsMessageEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.DescribeEndpointsMessage] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxRecords" -> o.maxRecords.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val TableStatisticsEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.TableStatistics] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaName" -> o.schemaName.asJson, "TableName" -> o.tableName.asJson, "TableState" -> o.tableState.asJson, "ValidationState" -> o.validationState.asJson, "FullLoadCondtnlChkFailedRows" -> o.fullLoadCondtnlChkFailedRows.asJson, "Ddls" -> o.ddls.asJson, "Inserts" -> o.inserts.asJson, "FullLoadRows" -> o.fullLoadRows.asJson, "FullLoadErrorRows" -> o.fullLoadErrorRows.asJson, "Deletes" -> o.deletes.asJson, "ValidationSuspendedRecords" -> o.validationSuspendedRecords.asJson, "Updates" -> o.updates.asJson, "ValidationFailedRecords" -> o.validationFailedRecords.asJson, "ValidationPendingRecords" -> o.validationPendingRecords.asJson, "LastUpdateTime" -> o.lastUpdateTime.asJson)
  }
  final implicit val ReplicationInstanceEncoder: io.circe.Encoder[org.lyranthe.araethura.dms.models.ReplicationInstance] = io.circe.Encoder.instance { o => 
    Json.obj("ReplicationInstancePublicIpAddress" -> o.replicationInstancePublicIpAddress.asJson, "ReplicationInstanceIdentifier" -> o.replicationInstanceIdentifier.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "ReplicationInstancePrivateIpAddress" -> o.replicationInstancePrivateIpAddress.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "ReplicationInstanceArn" -> o.replicationInstanceArn.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "ReplicationInstanceClass" -> o.replicationInstanceClass.asJson, "ReplicationInstanceStatus" -> o.replicationInstanceStatus.asJson, "EngineVersion" -> o.engineVersion.asJson, "SecondaryAvailabilityZone" -> o.secondaryAvailabilityZone.asJson, "VpcSecurityGroups" -> o.vpcSecurityGroups.asJson, "ReplicationInstancePrivateIpAddresses" -> o.replicationInstancePrivateIpAddresses.asJson, "ReplicationSubnetGroup" -> o.replicationSubnetGroup.asJson, "AllocatedStorage" -> o.allocatedStorage.asJson, "PendingModifiedValues" -> o.pendingModifiedValues.asJson, "MultiAZ" -> o.multiAZ.asJson, "AutoMinorVersionUpgrade" -> o.autoMinorVersionUpgrade.asJson, "PubliclyAccessible" -> o.publiclyAccessible.asJson, "ReplicationInstancePublicIpAddresses" -> o.replicationInstancePublicIpAddresses.asJson, "InstanceCreateTime" -> o.instanceCreateTime.asJson)
  }
  final implicit val ListTagsForResourceMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ListTagsForResourceMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ResourceArn").map(org.lyranthe.araethura.dms.models.ListTagsForResourceMessage.apply _)
  }
  final implicit val DescribeReplicationSubnetGroupsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsMessage.apply _)
  }
  final implicit val ResourceNotFoundFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ResourceNotFoundFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.ResourceNotFoundFault.apply _)
  }
  final implicit val DescribeSchemasMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeSchemasMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EndpointArn"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxRecords")).mapN(org.lyranthe.araethura.dms.models.DescribeSchemasMessage.apply _)
  }
  final implicit val DeleteReplicationInstanceMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteReplicationInstanceMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ReplicationInstanceArn").map(org.lyranthe.araethura.dms.models.DeleteReplicationInstanceMessage.apply _)
  }
  final implicit val DescribeConnectionsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeConnectionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Connection]]]("Connections")).mapN(org.lyranthe.araethura.dms.models.DescribeConnectionsResponse.apply _)
  }
  final implicit val TestConnectionMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.TestConnectionMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationInstanceArn"), o.get[java.lang.String]("EndpointArn")).mapN(org.lyranthe.araethura.dms.models.TestConnectionMessage.apply _)
  }
  final implicit val SubnetAlreadyInUseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.SubnetAlreadyInUse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.SubnetAlreadyInUse.apply _)
  }
  final implicit val SNSInvalidTopicFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.SNSInvalidTopicFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.SNSInvalidTopicFault.apply _)
  }
  final implicit val AddTagsToResourceMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.AddTagsToResourceMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[org.lyranthe.araethura.dms.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.dms.models.AddTagsToResourceMessage.apply _)
  }
  final implicit val CreateEventSubscriptionMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateEventSubscriptionMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubscriptionName"), o.get[java.lang.String]("SnsTopicArn"), o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[scala.List[java.lang.String]]]("SourceIds"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("Tags"), o.get[scala.Option[scala.List[java.lang.String]]]("EventCategories")).mapN(org.lyranthe.araethura.dms.models.CreateEventSubscriptionMessage.apply _)
  }
  final implicit val ReplicationTaskDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationTask] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReplicationTaskSettings"), o.get[scala.Option[java.lang.String]]("TargetEndpointArn"), o.get[scala.Option[java.lang.String]]("SourceEndpointArn"), o.get[scala.Option[java.lang.String]]("ReplicationTaskArn"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ReplicationTaskIdentifier"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceArn"), o.get[scala.Option[java.lang.String]]("LastFailureMessage"), o.get[scala.Option[java.lang.String]]("TableMappings"), o.get[scala.Option[java.lang.String]]("StopReason"), o.get[scala.Option[java.lang.String]]("MigrationType"), o.get[scala.Option[java.time.Instant]]("ReplicationTaskCreationDate"), o.get[scala.Option[java.time.Instant]]("ReplicationTaskStartDate"), o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTaskStats]]("ReplicationTaskStats")).mapN(org.lyranthe.araethura.dms.models.ReplicationTask.apply _)
  }
  final implicit val CreateEndpointResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateEndpointResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.Endpoint]]("Endpoint").map(org.lyranthe.araethura.dms.models.CreateEndpointResponse.apply _)
  }
  final implicit val DescribeRefreshSchemasStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.RefreshSchemasStatus]]("RefreshSchemasStatus").map(org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusResponse.apply _)
  }
  final implicit val EventCategoryGroupDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.EventCategoryGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[scala.List[java.lang.String]]]("EventCategories")).mapN(org.lyranthe.araethura.dms.models.EventCategoryGroup.apply _)
  }
  final implicit val DescribeReplicationTaskAssessmentResultsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[java.lang.String]]("BucketName"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.ReplicationTaskAssessmentResult]]]("ReplicationTaskAssessmentResults")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsResponse.apply _)
  }
  final implicit val DescribeReplicationInstancesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationInstancesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.ReplicationInstance]]]("ReplicationInstances")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationInstancesResponse.apply _)
  }
  final implicit val InvalidResourceStateFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.InvalidResourceStateFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.InvalidResourceStateFault.apply _)
  }
  final implicit val VpcSecurityGroupMembershipDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.VpcSecurityGroupMembership] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcSecurityGroupId"), o.get[scala.Option[java.lang.String]]("Status")).mapN(org.lyranthe.araethura.dms.models.VpcSecurityGroupMembership.apply _)
  }
  final implicit val TableToReloadDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.TableToReload] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SchemaName"), o.get[scala.Option[java.lang.String]]("TableName")).mapN(org.lyranthe.araethura.dms.models.TableToReload.apply _)
  }
  final implicit val DescribeAccountAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeAccountAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.AccountQuota]]]("AccountQuotas").map(org.lyranthe.araethura.dms.models.DescribeAccountAttributesResponse.apply _)
  }
  final implicit val ReplicationSubnetGroupDoesNotCoverEnoughAZsDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationSubnetGroupDoesNotCoverEnoughAZs] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.ReplicationSubnetGroupDoesNotCoverEnoughAZs.apply _)
  }
  final implicit val StartReplicationTaskResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StartReplicationTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTask]]("ReplicationTask").map(org.lyranthe.araethura.dms.models.StartReplicationTaskResponse.apply _)
  }
  final implicit val DeleteEndpointResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteEndpointResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.Endpoint]]("Endpoint").map(org.lyranthe.araethura.dms.models.DeleteEndpointResponse.apply _)
  }
  final implicit val ModifyReplicationTaskResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyReplicationTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTask]]("ReplicationTask").map(org.lyranthe.araethura.dms.models.ModifyReplicationTaskResponse.apply _)
  }
  final implicit val ModifyReplicationInstanceMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyReplicationInstanceMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationInstanceArn"), o.get[scala.Option[scala.Boolean]]("MultiAZ"), o.get[scala.Option[scala.Boolean]]("AutoMinorVersionUpgrade"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceIdentifier"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceClass"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[scala.List[java.lang.String]]]("VpcSecurityGroupIds"), o.get[scala.Option[scala.Int]]("AllocatedStorage"), o.get[scala.Option[scala.Boolean]]("ApplyImmediately"), o.get[scala.Option[scala.Boolean]]("AllowMajorVersionUpgrade")).mapN(org.lyranthe.araethura.dms.models.ModifyReplicationInstanceMessage.apply _)
  }
  final implicit val DynamoDbSettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DynamoDbSettings] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServiceAccessRoleArn").map(org.lyranthe.araethura.dms.models.DynamoDbSettings.apply _)
  }
  final implicit val DescribeEndpointTypesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEndpointTypesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.SupportedEndpointType]]]("SupportedEndpointTypes")).mapN(org.lyranthe.araethura.dms.models.DescribeEndpointTypesResponse.apply _)
  }
  final implicit val DescribeReplicationSubnetGroupsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.ReplicationSubnetGroup]]]("ReplicationSubnetGroups")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationSubnetGroupsResponse.apply _)
  }
  final implicit val MongoDbSettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.MongoDbSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NestingLevel"), o.get[scala.Option[java.lang.String]]("DatabaseName"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("DocsToInvestigate"), o.get[scala.Option[java.lang.String]]("ExtractDocId"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("AuthSource"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[java.lang.String]]("AuthMechanism"), o.get[scala.Option[java.lang.String]]("AuthType"), o.get[scala.Option[java.lang.String]]("Password")).mapN(org.lyranthe.araethura.dms.models.MongoDbSettings.apply _)
  }
  final implicit val InsufficientResourceCapacityFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.InsufficientResourceCapacityFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.InsufficientResourceCapacityFault.apply _)
  }
  final implicit val DescribeReplicationTaskAssessmentResultsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReplicationTaskArn"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxRecords")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationTaskAssessmentResultsMessage.apply _)
  }
  final implicit val CreateReplicationSubnetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationSubnetGroup]]("ReplicationSubnetGroup").map(org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupResponse.apply _)
  }
  final implicit val StartReplicationTaskMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StartReplicationTaskMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationTaskArn"), o.get[java.lang.String]("StartReplicationTaskType"), o.get[scala.Option[java.time.Instant]]("CdcStartTime")).mapN(org.lyranthe.araethura.dms.models.StartReplicationTaskMessage.apply _)
  }
  final implicit val DeleteEventSubscriptionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteEventSubscriptionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.EventSubscription]]("EventSubscription").map(org.lyranthe.araethura.dms.models.DeleteEventSubscriptionResponse.apply _)
  }
  final implicit val AccessDeniedFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.AccessDeniedFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.AccessDeniedFault.apply _)
  }
  final implicit val CertificateDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Certificate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("CertificatePem"), o.get[scala.Option[java.lang.String]]("CertificateIdentifier"), o.get[scala.Option[java.lang.String]]("CertificateOwner"), o.get[scala.Option[java.lang.String]]("SigningAlgorithm"), o.get[scala.Option[java.time.Instant]]("CertificateCreationDate"), o.get[scala.Option[java.time.Instant]]("ValidFromDate"), o.get[scala.Option[java.time.Instant]]("ValidToDate"), o.get[scala.Option[scala.Array[scala.Byte]]]("CertificateWallet"), o.get[scala.Option[scala.Int]]("KeyLength")).mapN(org.lyranthe.araethura.dms.models.Certificate.apply _)
  }
  final implicit val DescribeEndpointTypesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEndpointTypesMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeEndpointTypesMessage.apply _)
  }
  final implicit val SubnetDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Subnet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubnetIdentifier"), o.get[scala.Option[java.lang.String]]("SubnetStatus"), o.get[scala.Option[org.lyranthe.araethura.dms.models.AvailabilityZone]]("SubnetAvailabilityZone")).mapN(org.lyranthe.araethura.dms.models.Subnet.apply _)
  }
  final implicit val CreateReplicationInstanceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateReplicationInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationInstance]]("ReplicationInstance").map(org.lyranthe.araethura.dms.models.CreateReplicationInstanceResponse.apply _)
  }
  final implicit val ReloadTablesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReloadTablesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ReplicationTaskArn").map(org.lyranthe.araethura.dms.models.ReloadTablesResponse.apply _)
  }
  final implicit val S3SettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.S3Settings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BucketName"), o.get[scala.Option[java.lang.String]]("CsvDelimiter"), o.get[scala.Option[java.lang.String]]("BucketFolder"), o.get[scala.Option[java.lang.String]]("CsvRowDelimiter"), o.get[scala.Option[java.lang.String]]("ExternalTableDefinition"), o.get[scala.Option[java.lang.String]]("ServiceAccessRoleArn"), o.get[scala.Option[java.lang.String]]("CompressionType")).mapN(org.lyranthe.araethura.dms.models.S3Settings.apply _)
  }
  final implicit val AddTagsToResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.AddTagsToResourceResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dms.models.AddTagsToResourceResponse)
  final implicit val CreateReplicationInstanceMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateReplicationInstanceMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationInstanceIdentifier"), o.get[java.lang.String]("ReplicationInstanceClass"), o.get[scala.Option[scala.Boolean]]("MultiAZ"), o.get[scala.Option[scala.Boolean]]("AutoMinorVersionUpgrade"), o.get[scala.Option[scala.Boolean]]("PubliclyAccessible"), o.get[scala.Option[java.lang.String]]("ReplicationSubnetGroupIdentifier"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[scala.List[java.lang.String]]]("VpcSecurityGroupIds"), o.get[scala.Option[scala.Int]]("AllocatedStorage"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("Tags")).mapN(org.lyranthe.araethura.dms.models.CreateReplicationInstanceMessage.apply _)
  }
  final implicit val ModifyEndpointResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyEndpointResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.Endpoint]]("Endpoint").map(org.lyranthe.araethura.dms.models.ModifyEndpointResponse.apply _)
  }
  final implicit val InvalidSubnetDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.InvalidSubnet] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.InvalidSubnet.apply _)
  }
  final implicit val ReplicationTaskAssessmentResultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationTaskAssessmentResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3ObjectUrl"), o.get[scala.Option[java.lang.String]]("ReplicationTaskArn"), o.get[scala.Option[java.lang.String]]("ReplicationTaskIdentifier"), o.get[scala.Option[java.lang.String]]("AssessmentResultsFile"), o.get[scala.Option[java.lang.String]]("AssessmentResults"), o.get[scala.Option[java.lang.String]]("AssessmentStatus"), o.get[scala.Option[java.time.Instant]]("ReplicationTaskLastAssessmentDate")).mapN(org.lyranthe.araethura.dms.models.ReplicationTaskAssessmentResult.apply _)
  }
  final implicit val DeleteCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.Certificate]]("Certificate").map(org.lyranthe.araethura.dms.models.DeleteCertificateResponse.apply _)
  }
  final implicit val AvailabilityZoneDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.AvailabilityZone] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Name").map(org.lyranthe.araethura.dms.models.AvailabilityZone.apply _)
  }
  final implicit val DescribeRefreshSchemasStatusMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("EndpointArn").map(org.lyranthe.araethura.dms.models.DescribeRefreshSchemasStatusMessage.apply _)
  }
  final implicit val TestConnectionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.TestConnectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.Connection]]("Connection").map(org.lyranthe.araethura.dms.models.TestConnectionResponse.apply _)
  }
  final implicit val DescribeEndpointsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEndpointsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Endpoint]]]("Endpoints")).mapN(org.lyranthe.araethura.dms.models.DescribeEndpointsResponse.apply _)
  }
  final implicit val RemoveTagsFromResourceMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.RemoveTagsFromResourceMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(org.lyranthe.araethura.dms.models.RemoveTagsFromResourceMessage.apply _)
  }
  final implicit val SupportedEndpointTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.SupportedEndpointType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EngineName"), o.get[scala.Option[scala.Boolean]]("SupportsCDC"), o.get[scala.Option[java.lang.String]]("EndpointType")).mapN(org.lyranthe.araethura.dms.models.SupportedEndpointType.apply _)
  }
  final implicit val DescribeReplicationInstancesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationInstancesMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationInstancesMessage.apply _)
  }
  final implicit val DescribeEventsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEventsMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[java.lang.String]]("SourceIdentifier"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[scala.List[java.lang.String]]]("EventCategories"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime")).mapN(org.lyranthe.araethura.dms.models.DescribeEventsMessage.apply _)
  }
  final implicit val DescribeEventCategoriesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEventCategoriesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.EventCategoryGroup]]]("EventCategoryGroupList").map(org.lyranthe.araethura.dms.models.DescribeEventCategoriesResponse.apply _)
  }
  final implicit val DescribeEventSubscriptionsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.EventSubscription]]]("EventSubscriptionsList")).mapN(org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsResponse.apply _)
  }
  final implicit val DescribeReplicationTasksResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.ReplicationTask]]]("ReplicationTasks")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationTasksResponse.apply _)
  }
  final implicit val DeleteEventSubscriptionMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteEventSubscriptionMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SubscriptionName").map(org.lyranthe.araethura.dms.models.DeleteEventSubscriptionMessage.apply _)
  }
  final implicit val StopReplicationTaskMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StopReplicationTaskMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ReplicationTaskArn").map(org.lyranthe.araethura.dms.models.StopReplicationTaskMessage.apply _)
  }
  final implicit val EventSubscriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.EventSubscription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubscriptionCreationTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[java.lang.String]]("CustSubscriptionId"), o.get[scala.Option[java.lang.String]]("SnsTopicArn"), o.get[scala.Option[java.lang.String]]("CustomerAwsId"), o.get[scala.Option[scala.List[java.lang.String]]]("SourceIdsList"), o.get[scala.Option[scala.List[java.lang.String]]]("EventCategoriesList"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(org.lyranthe.araethura.dms.models.EventSubscription.apply _)
  }
  final implicit val DescribeTableStatisticsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeTableStatisticsMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationTaskArn"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters")).mapN(org.lyranthe.araethura.dms.models.DescribeTableStatisticsMessage.apply _)
  }
  final implicit val ModifyReplicationSubnetGroupMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationSubnetGroupIdentifier"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("ReplicationSubnetGroupDescription")).mapN(org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupMessage.apply _)
  }
  final implicit val DeleteEndpointMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteEndpointMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("EndpointArn").map(org.lyranthe.araethura.dms.models.DeleteEndpointMessage.apply _)
  }
  final implicit val ImportCertificateMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ImportCertificateMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateIdentifier"), o.get[scala.Option[java.lang.String]]("CertificatePem"), o.get[scala.Option[scala.Array[scala.Byte]]]("CertificateWallet"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("Tags")).mapN(org.lyranthe.araethura.dms.models.ImportCertificateMessage.apply _)
  }
  final implicit val ModifyReplicationSubnetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationSubnetGroup]]("ReplicationSubnetGroup").map(org.lyranthe.araethura.dms.models.ModifyReplicationSubnetGroupResponse.apply _)
  }
  final implicit val ReplicationSubnetGroupDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationSubnetGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReplicationSubnetGroupIdentifier"), o.get[scala.Option[java.lang.String]]("ReplicationSubnetGroupDescription"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("SubnetGroupStatus"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Subnet]]]("Subnets")).mapN(org.lyranthe.araethura.dms.models.ReplicationSubnetGroup.apply _)
  }
  final implicit val ModifyEventSubscriptionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyEventSubscriptionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.EventSubscription]]("EventSubscription").map(org.lyranthe.araethura.dms.models.ModifyEventSubscriptionResponse.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceIdentifier"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[scala.List[java.lang.String]]]("EventCategories"), o.get[scala.Option[java.time.Instant]]("Date")).mapN(org.lyranthe.araethura.dms.models.Event.apply _)
  }
  final implicit val UpgradeDependencyFailureFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.UpgradeDependencyFailureFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.UpgradeDependencyFailureFault.apply _)
  }
  final implicit val DeleteReplicationTaskResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteReplicationTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTask]]("ReplicationTask").map(org.lyranthe.araethura.dms.models.DeleteReplicationTaskResponse.apply _)
  }
  final implicit val DeleteReplicationSubnetGroupMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ReplicationSubnetGroupIdentifier").map(org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupMessage.apply _)
  }
  final implicit val ModifyEndpointMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyEndpointMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EndpointArn"), o.get[scala.Option[java.lang.String]]("DatabaseName"), o.get[scala.Option[java.lang.String]]("EndpointIdentifier"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("EngineName"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("ExtraConnectionAttributes"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[org.lyranthe.araethura.dms.models.DynamoDbSettings]]("DynamoDbSettings"), o.get[scala.Option[org.lyranthe.araethura.dms.models.MongoDbSettings]]("MongoDbSettings"), o.get[scala.Option[org.lyranthe.araethura.dms.models.S3Settings]]("S3Settings"), o.get[scala.Option[java.lang.String]]("SslMode"), o.get[scala.Option[java.lang.String]]("Password"), o.get[scala.Option[java.lang.String]]("EndpointType")).mapN(org.lyranthe.araethura.dms.models.ModifyEndpointMessage.apply _)
  }
  final implicit val EndpointDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Endpoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DatabaseName"), o.get[scala.Option[java.lang.String]]("EndpointArn"), o.get[scala.Option[java.lang.String]]("EndpointIdentifier"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("EngineName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("ExternalId"), o.get[scala.Option[java.lang.String]]("ExtraConnectionAttributes"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[org.lyranthe.araethura.dms.models.DynamoDbSettings]]("DynamoDbSettings"), o.get[scala.Option[org.lyranthe.araethura.dms.models.MongoDbSettings]]("MongoDbSettings"), o.get[scala.Option[org.lyranthe.araethura.dms.models.S3Settings]]("S3Settings"), o.get[scala.Option[java.lang.String]]("SslMode"), o.get[scala.Option[java.lang.String]]("EndpointType")).mapN(org.lyranthe.araethura.dms.models.Endpoint.apply _)
  }
  final implicit val DescribeReplicationTasksMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeReplicationTasksMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeReplicationTasksMessage.apply _)
  }
  final implicit val InvalidCertificateFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.InvalidCertificateFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.InvalidCertificateFault.apply _)
  }
  final implicit val DescribeAccountAttributesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeAccountAttributesMessage.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dms.models.DescribeAccountAttributesMessage)
  final implicit val OrderableReplicationInstanceDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.OrderableReplicationInstance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceClass"), o.get[scala.Option[java.lang.String]]("StorageType"), o.get[scala.Option[scala.Int]]("MinAllocatedStorage"), o.get[scala.Option[scala.Int]]("MaxAllocatedStorage"), o.get[scala.Option[scala.Int]]("DefaultAllocatedStorage"), o.get[scala.Option[scala.Int]]("IncludedAllocatedStorage")).mapN(org.lyranthe.araethura.dms.models.OrderableReplicationInstance.apply _)
  }
  final implicit val DescribeSchemasResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeSchemasResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[java.lang.String]]]("Schemas")).mapN(org.lyranthe.araethura.dms.models.DescribeSchemasResponse.apply _)
  }
  final implicit val DescribeEventSubscriptionsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubscriptionName"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords")).mapN(org.lyranthe.araethura.dms.models.DescribeEventSubscriptionsMessage.apply _)
  }
  final implicit val RefreshSchemasResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.RefreshSchemasResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.RefreshSchemasStatus]]("RefreshSchemasStatus").map(org.lyranthe.araethura.dms.models.RefreshSchemasResponse.apply _)
  }
  final implicit val DescribeOrderableReplicationInstancesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.OrderableReplicationInstance]]]("OrderableReplicationInstances"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesResponse.apply _)
  }
  final implicit val DeleteReplicationSubnetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dms.models.DeleteReplicationSubnetGroupResponse)
  final implicit val DescribeEventCategoriesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEventCategoriesMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters")).mapN(org.lyranthe.araethura.dms.models.DescribeEventCategoriesMessage.apply _)
  }
  final implicit val ListTagsForResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ListTagsForResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("TagList").map(org.lyranthe.araethura.dms.models.ListTagsForResourceResponse.apply _)
  }
  final implicit val DeleteReplicationInstanceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteReplicationInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationInstance]]("ReplicationInstance").map(org.lyranthe.araethura.dms.models.DeleteReplicationInstanceResponse.apply _)
  }
  final implicit val DescribeTableStatisticsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeTableStatisticsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReplicationTaskArn"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.TableStatistics]]]("TableStatistics")).mapN(org.lyranthe.araethura.dms.models.DescribeTableStatisticsResponse.apply _)
  }
  final implicit val ModifyEventSubscriptionMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyEventSubscriptionMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubscriptionName"), o.get[scala.Option[java.lang.String]]("SnsTopicArn"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[scala.List[java.lang.String]]]("EventCategories"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(org.lyranthe.araethura.dms.models.ModifyEventSubscriptionMessage.apply _)
  }
  final implicit val CreateReplicationTaskResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateReplicationTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTask]]("ReplicationTask").map(org.lyranthe.araethura.dms.models.CreateReplicationTaskResponse.apply _)
  }
  final implicit val DeleteReplicationTaskMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteReplicationTaskMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ReplicationTaskArn").map(org.lyranthe.araethura.dms.models.DeleteReplicationTaskMessage.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Event]]]("Events")).mapN(org.lyranthe.araethura.dms.models.DescribeEventsResponse.apply _)
  }
  final implicit val RefreshSchemasMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.RefreshSchemasMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EndpointArn"), o.get[java.lang.String]("ReplicationInstanceArn")).mapN(org.lyranthe.araethura.dms.models.RefreshSchemasMessage.apply _)
  }
  final implicit val RemoveTagsFromResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.RemoveTagsFromResourceResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dms.models.RemoveTagsFromResourceResponse)
  final implicit val DescribeCertificatesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeCertificatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Certificate]]]("Certificates")).mapN(org.lyranthe.araethura.dms.models.DescribeCertificatesResponse.apply _)
  }
  final implicit val ModifyReplicationInstanceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyReplicationInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationInstance]]("ReplicationInstance").map(org.lyranthe.araethura.dms.models.ModifyReplicationInstanceResponse.apply _)
  }
  final implicit val ReloadTablesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReloadTablesMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationTaskArn"), o.get[scala.List[org.lyranthe.araethura.dms.models.TableToReload]]("TablesToReload")).mapN(org.lyranthe.araethura.dms.models.ReloadTablesMessage.apply _)
  }
  final implicit val CreateEndpointMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateEndpointMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EndpointIdentifier"), o.get[java.lang.String]("EngineName"), o.get[java.lang.String]("EndpointType"), o.get[scala.Option[java.lang.String]]("DatabaseName"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("ExtraConnectionAttributes"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[org.lyranthe.araethura.dms.models.DynamoDbSettings]]("DynamoDbSettings"), o.get[scala.Option[org.lyranthe.araethura.dms.models.MongoDbSettings]]("MongoDbSettings"), o.get[scala.Option[org.lyranthe.araethura.dms.models.S3Settings]]("S3Settings"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("SslMode"), o.get[scala.Option[java.lang.String]]("Password")).mapN(org.lyranthe.araethura.dms.models.CreateEndpointMessage.apply _)
  }
  final implicit val DescribeOrderableReplicationInstancesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeOrderableReplicationInstancesMessage.apply _)
  }
  final implicit val ReplicationPendingModifiedValuesDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationPendingModifiedValues] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReplicationInstanceClass"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[scala.Int]]("AllocatedStorage"), o.get[scala.Option[scala.Boolean]]("MultiAZ")).mapN(org.lyranthe.araethura.dms.models.ReplicationPendingModifiedValues.apply _)
  }
  final implicit val AccountQuotaDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.AccountQuota] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccountQuotaName"), o.get[scala.Option[scala.Long]]("Used"), o.get[scala.Option[scala.Long]]("Max")).mapN(org.lyranthe.araethura.dms.models.AccountQuota.apply _)
  }
  final implicit val DescribeCertificatesMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeCertificatesMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeCertificatesMessage.apply _)
  }
  final implicit val CreateEventSubscriptionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateEventSubscriptionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.EventSubscription]]("EventSubscription").map(org.lyranthe.araethura.dms.models.CreateEventSubscriptionResponse.apply _)
  }
  final implicit val KMSKeyNotAccessibleFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.KMSKeyNotAccessibleFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.KMSKeyNotAccessibleFault.apply _)
  }
  final implicit val ReplicationTaskStatsDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationTaskStats] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("TablesErrored"), o.get[scala.Option[scala.Int]]("TablesLoading"), o.get[scala.Option[scala.Int]]("TablesLoaded"), o.get[scala.Option[scala.Int]]("TablesQueued"), o.get[scala.Option[scala.Int]]("FullLoadProgressPercent"), o.get[scala.Option[scala.Long]]("ElapsedTimeMillis")).mapN(org.lyranthe.araethura.dms.models.ReplicationTaskStats.apply _)
  }
  final implicit val SNSNoAuthorizationFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.SNSNoAuthorizationFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.SNSNoAuthorizationFault.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.dms.models.Tag.apply _)
  }
  final implicit val RefreshSchemasStatusDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.RefreshSchemasStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EndpointArn"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceArn"), o.get[scala.Option[java.lang.String]]("LastFailureMessage"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.time.Instant]]("LastRefreshDate")).mapN(org.lyranthe.araethura.dms.models.RefreshSchemasStatus.apply _)
  }
  final implicit val DescribeConnectionsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeConnectionsMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeConnectionsMessage.apply _)
  }
  final implicit val ModifyReplicationTaskMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ModifyReplicationTaskMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationTaskArn"), o.get[scala.Option[java.lang.String]]("ReplicationTaskIdentifier"), o.get[scala.Option[java.lang.String]]("TableMappings"), o.get[scala.Option[java.lang.String]]("ReplicationTaskSettings"), o.get[scala.Option[java.lang.String]]("MigrationType"), o.get[scala.Option[java.time.Instant]]("CdcStartTime")).mapN(org.lyranthe.araethura.dms.models.ModifyReplicationTaskMessage.apply _)
  }
  final implicit val ConnectionDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Connection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EndpointArn"), o.get[scala.Option[java.lang.String]]("EndpointIdentifier"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceIdentifier"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceArn"), o.get[scala.Option[java.lang.String]]("LastFailureMessage")).mapN(org.lyranthe.araethura.dms.models.Connection.apply _)
  }
  final implicit val StorageQuotaExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StorageQuotaExceededFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.StorageQuotaExceededFault.apply _)
  }
  final implicit val DeleteCertificateMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DeleteCertificateMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(org.lyranthe.araethura.dms.models.DeleteCertificateMessage.apply _)
  }
  final implicit val CreateReplicationSubnetGroupMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReplicationSubnetGroupIdentifier"), o.get[java.lang.String]("ReplicationSubnetGroupDescription"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("Tags")).mapN(org.lyranthe.araethura.dms.models.CreateReplicationSubnetGroupMessage.apply _)
  }
  final implicit val ImportCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ImportCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.Certificate]]("Certificate").map(org.lyranthe.araethura.dms.models.ImportCertificateResponse.apply _)
  }
  final implicit val FilterDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.Filter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.List[java.lang.String]]("Values")).mapN(org.lyranthe.araethura.dms.models.Filter.apply _)
  }
  final implicit val StopReplicationTaskResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StopReplicationTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTask]]("ReplicationTask").map(org.lyranthe.araethura.dms.models.StopReplicationTaskResponse.apply _)
  }
  final implicit val CreateReplicationTaskMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.CreateReplicationTaskMessage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SourceEndpointArn"), o.get[java.lang.String]("ReplicationTaskIdentifier"), o.get[java.lang.String]("TargetEndpointArn"), o.get[java.lang.String]("ReplicationInstanceArn"), o.get[java.lang.String]("TableMappings"), o.get[java.lang.String]("MigrationType"), o.get[scala.Option[java.lang.String]]("ReplicationTaskSettings"), o.get[scala.Option[java.time.Instant]]("CdcStartTime"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Tag]]]("Tags")).mapN(org.lyranthe.araethura.dms.models.CreateReplicationTaskMessage.apply _)
  }
  final implicit val ResourceQuotaExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ResourceQuotaExceededFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.ResourceQuotaExceededFault.apply _)
  }
  final implicit val StartReplicationTaskAssessmentMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentMessage] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ReplicationTaskArn").map(org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentMessage.apply _)
  }
  final implicit val StartReplicationTaskAssessmentResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationTask]]("ReplicationTask").map(org.lyranthe.araethura.dms.models.StartReplicationTaskAssessmentResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ResourceAlreadyExistsFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dms.models.ResourceAlreadyExistsFault.apply _)
  }
  final implicit val DescribeEndpointsMessageDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.DescribeEndpointsMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.Filter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxRecords"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.dms.models.DescribeEndpointsMessage.apply _)
  }
  final implicit val TableStatisticsDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.TableStatistics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SchemaName"), o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[java.lang.String]]("TableState"), o.get[scala.Option[java.lang.String]]("ValidationState"), o.get[scala.Option[scala.Long]]("FullLoadCondtnlChkFailedRows"), o.get[scala.Option[scala.Long]]("Ddls"), o.get[scala.Option[scala.Long]]("Inserts"), o.get[scala.Option[scala.Long]]("FullLoadRows"), o.get[scala.Option[scala.Long]]("FullLoadErrorRows"), o.get[scala.Option[scala.Long]]("Deletes"), o.get[scala.Option[scala.Long]]("ValidationSuspendedRecords"), o.get[scala.Option[scala.Long]]("Updates"), o.get[scala.Option[scala.Long]]("ValidationFailedRecords"), o.get[scala.Option[scala.Long]]("ValidationPendingRecords"), o.get[scala.Option[java.time.Instant]]("LastUpdateTime")).mapN(org.lyranthe.araethura.dms.models.TableStatistics.apply _)
  }
  final implicit val ReplicationInstanceDecoder: io.circe.Decoder[org.lyranthe.araethura.dms.models.ReplicationInstance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReplicationInstancePublicIpAddress"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceIdentifier"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("ReplicationInstancePrivateIpAddress"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceArn"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceClass"), o.get[scala.Option[java.lang.String]]("ReplicationInstanceStatus"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[java.lang.String]]("SecondaryAvailabilityZone"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dms.models.VpcSecurityGroupMembership]]]("VpcSecurityGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("ReplicationInstancePrivateIpAddresses"), o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationSubnetGroup]]("ReplicationSubnetGroup"), o.get[scala.Option[scala.Int]]("AllocatedStorage"), o.get[scala.Option[org.lyranthe.araethura.dms.models.ReplicationPendingModifiedValues]]("PendingModifiedValues"), o.get[scala.Option[scala.Boolean]]("MultiAZ"), o.get[scala.Option[scala.Boolean]]("AutoMinorVersionUpgrade"), o.get[scala.Option[scala.Boolean]]("PubliclyAccessible"), o.get[scala.Option[scala.List[java.lang.String]]]("ReplicationInstancePublicIpAddresses"), o.get[scala.Option[java.time.Instant]]("InstanceCreateTime")).mapN(org.lyranthe.araethura.dms.models.ReplicationInstance.apply _)
  }
}