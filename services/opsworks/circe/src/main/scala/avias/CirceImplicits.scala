package avias.opsworks
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeleteInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "DeleteElasticIp" -> o.deleteElasticIp.asJson, "DeleteVolumes" -> o.deleteVolumes.asJson)
  }
  final implicit val InstanceIdentityEncoder: io.circe.Encoder[avias.opsworks.models.InstanceIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("Document" -> o.document.asJson, "Signature" -> o.signature.asJson)
  }
  final implicit val DetachElasticLoadBalancerRequestEncoder: io.circe.Encoder[avias.opsworks.models.DetachElasticLoadBalancerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticLoadBalancerName" -> o.elasticLoadBalancerName.asJson, "LayerId" -> o.layerId.asJson)
  }
  final implicit val ShutdownEventConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.ShutdownEventConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("ExecutionTimeout" -> o.executionTimeout.asJson, "DelayUntilElbConnectionsDrained" -> o.delayUntilElbConnectionsDrained.asJson)
  }
  final implicit val DeregisterVolumeRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeregisterVolumeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeId" -> o.volumeId.asJson)
  }
  final implicit val CloneStackRequestEncoder: io.circe.Encoder[avias.opsworks.models.CloneStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceRoleArn" -> o.serviceRoleArn.asJson, "SourceStackId" -> o.sourceStackId.asJson, "Attributes" -> o.attributes.asJson, "DefaultOs" -> o.defaultOs.asJson, "VpcId" -> o.vpcId.asJson, "DefaultInstanceProfileArn" -> o.defaultInstanceProfileArn.asJson, "HostnameTheme" -> o.hostnameTheme.asJson, "DefaultSshKeyName" -> o.defaultSshKeyName.asJson, "AgentVersion" -> o.agentVersion.asJson, "Name" -> o.name.asJson, "CustomJson" -> o.customJson.asJson, "DefaultSubnetId" -> o.defaultSubnetId.asJson, "Region" -> o.region.asJson, "DefaultAvailabilityZone" -> o.defaultAvailabilityZone.asJson, "CustomCookbooksSource" -> o.customCookbooksSource.asJson, "ChefConfiguration" -> o.chefConfiguration.asJson, "ConfigurationManager" -> o.configurationManager.asJson, "UseCustomCookbooks" -> o.useCustomCookbooks.asJson, "UseOpsworksSecurityGroups" -> o.useOpsworksSecurityGroups.asJson, "ClonePermissions" -> o.clonePermissions.asJson, "DefaultRootDeviceType" -> o.defaultRootDeviceType.asJson, "CloneAppIds" -> o.cloneAppIds.asJson)
  }
  final implicit val DeregisterEcsClusterRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeregisterEcsClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("EcsClusterArn" -> o.ecsClusterArn.asJson)
  }
  final implicit val RegisterInstanceResultEncoder: io.circe.Encoder[avias.opsworks.models.RegisterInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val UpdateRdsDbInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateRdsDbInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RdsDbInstanceArn" -> o.rdsDbInstanceArn.asJson, "DbUser" -> o.dbUser.asJson, "DbPassword" -> o.dbPassword.asJson)
  }
  final implicit val VolumeConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.VolumeConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("MountPoint" -> o.mountPoint.asJson, "NumberOfDisks" -> o.numberOfDisks.asJson, "Size" -> o.size.asJson, "VolumeType" -> o.volumeType.asJson, "RaidLevel" -> o.raidLevel.asJson, "Iops" -> o.iops.asJson)
  }
  final implicit val DescribeTimeBasedAutoScalingRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeTimeBasedAutoScalingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceIds" -> o.instanceIds.asJson)
  }
  final implicit val RegisterElasticIpResultEncoder: io.circe.Encoder[avias.opsworks.models.RegisterElasticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIp" -> o.elasticIp.asJson)
  }
  final implicit val RegisterInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.RegisterInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "RsaPublicKeyFingerprint" -> o.rsaPublicKeyFingerprint.asJson, "PrivateIp" -> o.privateIp.asJson, "RsaPublicKey" -> o.rsaPublicKey.asJson, "Hostname" -> o.hostname.asJson, "PublicIp" -> o.publicIp.asJson, "InstanceIdentity" -> o.instanceIdentity.asJson)
  }
  final implicit val UnassignVolumeRequestEncoder: io.circe.Encoder[avias.opsworks.models.UnassignVolumeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeId" -> o.volumeId.asJson)
  }
  final implicit val SelfUserProfileEncoder: io.circe.Encoder[avias.opsworks.models.SelfUserProfile] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson, "Name" -> o.name.asJson, "SshUsername" -> o.sshUsername.asJson, "SshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val LayerEncoder: io.circe.Encoder[avias.opsworks.models.Layer] = io.circe.Encoder.instance { o => 
    Json.obj("Shortname" -> o.shortname.asJson, "CustomInstanceProfileArn" -> o.customInstanceProfileArn.asJson, "Arn" -> o.arn.asJson, "StackId" -> o.stackId.asJson, "Name" -> o.name.asJson, "CustomJson" -> o.customJson.asJson, "LayerId" -> o.layerId.asJson, "CloudWatchLogsConfiguration" -> o.cloudWatchLogsConfiguration.asJson, "Type" -> o.`type`.asJson, "DefaultRecipes" -> o.defaultRecipes.asJson, "CustomRecipes" -> o.customRecipes.asJson, "VolumeConfigurations" -> o.volumeConfigurations.asJson, "CreatedAt" -> o.createdAt.asJson, "UseEbsOptimizedInstances" -> o.useEbsOptimizedInstances.asJson, "InstallUpdatesOnBoot" -> o.installUpdatesOnBoot.asJson, "EnableAutoHealing" -> o.enableAutoHealing.asJson, "AutoAssignElasticIps" -> o.autoAssignElasticIps.asJson, "AutoAssignPublicIps" -> o.autoAssignPublicIps.asJson, "LifecycleEventConfiguration" -> o.lifecycleEventConfiguration.asJson, "CustomSecurityGroupIds" -> o.customSecurityGroupIds.asJson, "DefaultSecurityGroupNames" -> o.defaultSecurityGroupNames.asJson, "Packages" -> o.packages.asJson, "Attributes" -> o.attributes.asJson)
  }
  final implicit val DescribeServiceErrorsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeServiceErrorsResult] = io.circe.Encoder.instance { o => 
    Json.obj("ServiceErrors" -> o.serviceErrors.asJson)
  }
  final implicit val DescribeStackProvisioningParametersRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeStackProvisioningParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val SslConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.SslConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "PrivateKey" -> o.privateKey.asJson, "Chain" -> o.chain.asJson)
  }
  final implicit val AppEncoder: io.circe.Encoder[avias.opsworks.models.App] = io.circe.Encoder.instance { o => 
    Json.obj("DataSources" -> o.dataSources.asJson, "Shortname" -> o.shortname.asJson, "AppId" -> o.appId.asJson, "StackId" -> o.stackId.asJson, "Name" -> o.name.asJson, "CreatedAt" -> o.createdAt.asJson, "Description" -> o.description.asJson, "SslConfiguration" -> o.sslConfiguration.asJson, "Type" -> o.`type`.asJson, "AppSource" -> o.appSource.asJson, "EnableSsl" -> o.enableSsl.asJson, "Attributes" -> o.attributes.asJson, "Domains" -> o.domains.asJson, "Environment" -> o.environment.asJson)
  }
  final implicit val DescribeRaidArraysRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeRaidArraysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "StackId" -> o.stackId.asJson, "RaidArrayIds" -> o.raidArrayIds.asJson)
  }
  final implicit val DescribeRdsDbInstancesResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeRdsDbInstancesResult] = io.circe.Encoder.instance { o => 
    Json.obj("RdsDbInstances" -> o.rdsDbInstances.asJson)
  }
  final implicit val AssignVolumeRequestEncoder: io.circe.Encoder[avias.opsworks.models.AssignVolumeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeId" -> o.volumeId.asJson, "InstanceId" -> o.instanceId.asJson)
  }
  final implicit val RebootInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.RebootInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val DescribeStacksRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeStacksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackIds" -> o.stackIds.asJson)
  }
  final implicit val DeregisterElasticIpRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeregisterElasticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIp" -> o.elasticIp.asJson)
  }
  final implicit val AutoScalingThresholdsEncoder: io.circe.Encoder[avias.opsworks.models.AutoScalingThresholds] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceCount" -> o.instanceCount.asJson, "ThresholdsWaitTime" -> o.thresholdsWaitTime.asJson, "IgnoreMetricsTime" -> o.ignoreMetricsTime.asJson, "CpuThreshold" -> o.cpuThreshold.asJson, "MemoryThreshold" -> o.memoryThreshold.asJson, "LoadThreshold" -> o.loadThreshold.asJson, "Alarms" -> o.alarms.asJson)
  }
  final implicit val GrantAccessRequestEncoder: io.circe.Encoder[avias.opsworks.models.GrantAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "ValidForInMinutes" -> o.validForInMinutes.asJson)
  }
  final implicit val EcsClusterEncoder: io.circe.Encoder[avias.opsworks.models.EcsCluster] = io.circe.Encoder.instance { o => 
    Json.obj("EcsClusterArn" -> o.ecsClusterArn.asJson, "EcsClusterName" -> o.ecsClusterName.asJson, "StackId" -> o.stackId.asJson, "RegisteredAt" -> o.registeredAt.asJson)
  }
  final implicit val DescribeEcsClustersResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeEcsClustersResult] = io.circe.Encoder.instance { o => 
    Json.obj("EcsClusters" -> o.ecsClusters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val SourceEncoder: io.circe.Encoder[avias.opsworks.models.Source] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Revision" -> o.revision.asJson, "Username" -> o.username.asJson, "Password" -> o.password.asJson, "Url" -> o.url.asJson, "SshKey" -> o.sshKey.asJson)
  }
  final implicit val DescribeRdsDbInstancesRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeRdsDbInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "RdsDbInstanceArns" -> o.rdsDbInstanceArns.asJson)
  }
  final implicit val CreateUserProfileResultEncoder: io.circe.Encoder[avias.opsworks.models.CreateUserProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[avias.opsworks.models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("BlockDeviceMappings" -> o.blockDeviceMappings.asJson, "PrivateIp" -> o.privateIp.asJson, "SubnetId" -> o.subnetId.asJson, "SshHostRsaKeyFingerprint" -> o.sshHostRsaKeyFingerprint.asJson, "ReportedAgentVersion" -> o.reportedAgentVersion.asJson, "AmiId" -> o.amiId.asJson, "SshHostDsaKeyFingerprint" -> o.sshHostDsaKeyFingerprint.asJson, "Arn" -> o.arn.asJson, "Tenancy" -> o.tenancy.asJson, "Ec2InstanceId" -> o.ec2InstanceId.asJson, "InstanceType" -> o.instanceType.asJson, "Status" -> o.status.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "RootDeviceVolumeId" -> o.rootDeviceVolumeId.asJson, "StackId" -> o.stackId.asJson, "AgentVersion" -> o.agentVersion.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "Hostname" -> o.hostname.asJson, "PublicDns" -> o.publicDns.asJson, "Platform" -> o.platform.asJson, "Os" -> o.os.asJson, "EcsClusterArn" -> o.ecsClusterArn.asJson, "SshKeyName" -> o.sshKeyName.asJson, "InfrastructureClass" -> o.infrastructureClass.asJson, "InstanceId" -> o.instanceId.asJson, "EcsContainerInstanceArn" -> o.ecsContainerInstanceArn.asJson, "LastServiceErrorId" -> o.lastServiceErrorId.asJson, "PublicIp" -> o.publicIp.asJson, "PrivateDns" -> o.privateDns.asJson, "RegisteredBy" -> o.registeredBy.asJson, "ElasticIp" -> o.elasticIp.asJson, "VirtualizationType" -> o.virtualizationType.asJson, "ReportedOs" -> o.reportedOs.asJson, "CreatedAt" -> o.createdAt.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "InstallUpdatesOnBoot" -> o.installUpdatesOnBoot.asJson, "RootDeviceType" -> o.rootDeviceType.asJson, "AutoScalingType" -> o.autoScalingType.asJson, "LayerIds" -> o.layerIds.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "Architecture" -> o.architecture.asJson)
  }
  final implicit val RegisterVolumeResultEncoder: io.circe.Encoder[avias.opsworks.models.RegisterVolumeResult] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeId" -> o.volumeId.asJson)
  }
  final implicit val DataSourceEncoder: io.circe.Encoder[avias.opsworks.models.DataSource] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Arn" -> o.arn.asJson, "DatabaseName" -> o.databaseName.asJson)
  }
  final implicit val DescribeInstancesResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeInstancesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Instances" -> o.instances.asJson)
  }
  final implicit val ListTagsRequestEncoder: io.circe.Encoder[avias.opsworks.models.ListTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeAppsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeAppsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "AppIds" -> o.appIds.asJson)
  }
  final implicit val CreateDeploymentRequestEncoder: io.circe.Encoder[avias.opsworks.models.CreateDeploymentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "Command" -> o.command.asJson, "AppId" -> o.appId.asJson, "Comment" -> o.comment.asJson, "CustomJson" -> o.customJson.asJson, "InstanceIds" -> o.instanceIds.asJson, "LayerIds" -> o.layerIds.asJson)
  }
  final implicit val DescribeUserProfilesRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeUserProfilesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArns" -> o.iamUserArns.asJson)
  }
  final implicit val CreateDeploymentResultEncoder: io.circe.Encoder[avias.opsworks.models.CreateDeploymentResult] = io.circe.Encoder.instance { o => 
    Json.obj("DeploymentId" -> o.deploymentId.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[avias.opsworks.models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val DeleteAppRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeleteAppRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AppId" -> o.appId.asJson)
  }
  final implicit val UpdateVolumeRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateVolumeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeId" -> o.volumeId.asJson, "Name" -> o.name.asJson, "MountPoint" -> o.mountPoint.asJson)
  }
  final implicit val SetLoadBasedAutoScalingRequestEncoder: io.circe.Encoder[avias.opsworks.models.SetLoadBasedAutoScalingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson, "Enable" -> o.enable.asJson, "UpScaling" -> o.upScaling.asJson, "DownScaling" -> o.downScaling.asJson)
  }
  final implicit val DescribeElasticLoadBalancersResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeElasticLoadBalancersResult] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticLoadBalancers" -> o.elasticLoadBalancers.asJson)
  }
  final implicit val DescribeDeploymentsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeDeploymentsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Deployments" -> o.deployments.asJson)
  }
  final implicit val DescribeStackSummaryResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeStackSummaryResult] = io.circe.Encoder.instance { o => 
    Json.obj("StackSummary" -> o.stackSummary.asJson)
  }
  final implicit val DeregisterRdsDbInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeregisterRdsDbInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RdsDbInstanceArn" -> o.rdsDbInstanceArn.asJson)
  }
  final implicit val DescribeAgentVersionsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeAgentVersionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("AgentVersions" -> o.agentVersions.asJson)
  }
  final implicit val InstancesCountEncoder: io.circe.Encoder[avias.opsworks.models.InstancesCount] = io.circe.Encoder.instance { o => 
    Json.obj("ShuttingDown" -> o.shuttingDown.asJson, "Stopping" -> o.stopping.asJson, "Unassigning" -> o.unassigning.asJson, "Terminating" -> o.terminating.asJson, "StartFailed" -> o.startFailed.asJson, "Deregistering" -> o.deregistering.asJson, "Registering" -> o.registering.asJson, "Assigning" -> o.assigning.asJson, "Rebooting" -> o.rebooting.asJson, "Registered" -> o.registered.asJson, "ConnectionLost" -> o.connectionLost.asJson, "Booting" -> o.booting.asJson, "Terminated" -> o.terminated.asJson, "Stopped" -> o.stopped.asJson, "RunningSetup" -> o.runningSetup.asJson, "Pending" -> o.pending.asJson, "Online" -> o.online.asJson, "Requested" -> o.requested.asJson, "SetupFailed" -> o.setupFailed.asJson)
  }
  final implicit val ServiceErrorEncoder: io.circe.Encoder[avias.opsworks.models.ServiceError] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "StackId" -> o.stackId.asJson, "Type" -> o.`type`.asJson, "ServiceErrorId" -> o.serviceErrorId.asJson, "InstanceId" -> o.instanceId.asJson, "CreatedAt" -> o.createdAt.asJson)
  }
  final implicit val RegisterElasticIpRequestEncoder: io.circe.Encoder[avias.opsworks.models.RegisterElasticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIp" -> o.elasticIp.asJson, "StackId" -> o.stackId.asJson)
  }
  final implicit val AssociateElasticIpRequestEncoder: io.circe.Encoder[avias.opsworks.models.AssociateElasticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIp" -> o.elasticIp.asJson, "InstanceId" -> o.instanceId.asJson)
  }
  final implicit val ReportedOsEncoder: io.circe.Encoder[avias.opsworks.models.ReportedOs] = io.circe.Encoder.instance { o => 
    Json.obj("Family" -> o.family.asJson, "Name" -> o.name.asJson, "Version" -> o.version.asJson)
  }
  final implicit val RegisterRdsDbInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.RegisterRdsDbInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "RdsDbInstanceArn" -> o.rdsDbInstanceArn.asJson, "DbUser" -> o.dbUser.asJson, "DbPassword" -> o.dbPassword.asJson)
  }
  final implicit val ListTagsResultEncoder: io.circe.Encoder[avias.opsworks.models.ListTagsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val SetPermissionRequestEncoder: io.circe.Encoder[avias.opsworks.models.SetPermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "IamUserArn" -> o.iamUserArn.asJson, "Level" -> o.level.asJson, "AllowSsh" -> o.allowSsh.asJson, "AllowSudo" -> o.allowSudo.asJson)
  }
  final implicit val CloudWatchLogsConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.CloudWatchLogsConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("Enabled" -> o.enabled.asJson, "LogStreams" -> o.logStreams.asJson)
  }
  final implicit val StopInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.StopInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val DeleteLayerRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeleteLayerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson)
  }
  final implicit val DescribeLayersRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeLayersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "LayerIds" -> o.layerIds.asJson)
  }
  final implicit val DeploymentEncoder: io.circe.Encoder[avias.opsworks.models.Deployment] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "AppId" -> o.appId.asJson, "StackId" -> o.stackId.asJson, "CustomJson" -> o.customJson.asJson, "Comment" -> o.comment.asJson, "IamUserArn" -> o.iamUserArn.asJson, "DeploymentId" -> o.deploymentId.asJson, "Command" -> o.command.asJson, "Duration" -> o.duration.asJson, "CreatedAt" -> o.createdAt.asJson, "CompletedAt" -> o.completedAt.asJson, "InstanceIds" -> o.instanceIds.asJson)
  }
  final implicit val ChefConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.ChefConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("ManageBerkshelf" -> o.manageBerkshelf.asJson, "BerkshelfVersion" -> o.berkshelfVersion.asJson)
  }
  final implicit val DescribeAgentVersionsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeAgentVersionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "ConfigurationManager" -> o.configurationManager.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[avias.opsworks.models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeLayersResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeLayersResult] = io.circe.Encoder.instance { o => 
    Json.obj("Layers" -> o.layers.asJson)
  }
  final implicit val SetTimeBasedAutoScalingRequestEncoder: io.circe.Encoder[avias.opsworks.models.SetTimeBasedAutoScalingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "AutoScalingSchedule" -> o.autoScalingSchedule.asJson)
  }
  final implicit val StopStackRequestEncoder: io.circe.Encoder[avias.opsworks.models.StopStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val EbsBlockDeviceEncoder: io.circe.Encoder[avias.opsworks.models.EbsBlockDevice] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson, "Iops" -> o.iops.asJson, "VolumeSize" -> o.volumeSize.asJson, "VolumeType" -> o.volumeType.asJson, "DeleteOnTermination" -> o.deleteOnTermination.asJson)
  }
  final implicit val StackConfigurationManagerEncoder: io.circe.Encoder[avias.opsworks.models.StackConfigurationManager] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Version" -> o.version.asJson)
  }
  final implicit val CreateAppRequestEncoder: io.circe.Encoder[avias.opsworks.models.CreateAppRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "DataSources" -> o.dataSources.asJson, "Shortname" -> o.shortname.asJson, "Description" -> o.description.asJson, "SslConfiguration" -> o.sslConfiguration.asJson, "AppSource" -> o.appSource.asJson, "EnableSsl" -> o.enableSsl.asJson, "Attributes" -> o.attributes.asJson, "Domains" -> o.domains.asJson, "Environment" -> o.environment.asJson)
  }
  final implicit val TemporaryCredentialEncoder: io.circe.Encoder[avias.opsworks.models.TemporaryCredential] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "Password" -> o.password.asJson, "InstanceId" -> o.instanceId.asJson, "ValidForInMinutes" -> o.validForInMinutes.asJson)
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[avias.opsworks.models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val UpdateInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "AmiId" -> o.amiId.asJson, "InstanceType" -> o.instanceType.asJson, "AgentVersion" -> o.agentVersion.asJson, "Hostname" -> o.hostname.asJson, "Os" -> o.os.asJson, "SshKeyName" -> o.sshKeyName.asJson, "InstallUpdatesOnBoot" -> o.installUpdatesOnBoot.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "AutoScalingType" -> o.autoScalingType.asJson, "LayerIds" -> o.layerIds.asJson, "Architecture" -> o.architecture.asJson)
  }
  final implicit val AgentVersionEncoder: io.circe.Encoder[avias.opsworks.models.AgentVersion] = io.circe.Encoder.instance { o => 
    Json.obj("Version" -> o.version.asJson, "ConfigurationManager" -> o.configurationManager.asJson)
  }
  final implicit val DescribeVolumesRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeVolumesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "StackId" -> o.stackId.asJson, "RaidArrayId" -> o.raidArrayId.asJson, "VolumeIds" -> o.volumeIds.asJson)
  }
  final implicit val DescribeLoadBasedAutoScalingRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeLoadBasedAutoScalingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LayerIds" -> o.layerIds.asJson)
  }
  final implicit val ElasticLoadBalancerEncoder: io.circe.Encoder[avias.opsworks.models.ElasticLoadBalancer] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "StackId" -> o.stackId.asJson, "DnsName" -> o.dnsName.asJson, "LayerId" -> o.layerId.asJson, "Region" -> o.region.asJson, "ElasticLoadBalancerName" -> o.elasticLoadBalancerName.asJson, "AvailabilityZones" -> o.availabilityZones.asJson, "SubnetIds" -> o.subnetIds.asJson, "Ec2InstanceIds" -> o.ec2InstanceIds.asJson)
  }
  final implicit val BlockDeviceMappingEncoder: io.circe.Encoder[avias.opsworks.models.BlockDeviceMapping] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceName" -> o.deviceName.asJson, "NoDevice" -> o.noDevice.asJson, "VirtualName" -> o.virtualName.asJson, "Ebs" -> o.ebs.asJson)
  }
  final implicit val UpdateMyUserProfileRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateMyUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val RaidArrayEncoder: io.circe.Encoder[avias.opsworks.models.RaidArray] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson, "RaidArrayId" -> o.raidArrayId.asJson, "MountPoint" -> o.mountPoint.asJson, "VolumeType" -> o.volumeType.asJson, "StackId" -> o.stackId.asJson, "Name" -> o.name.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "InstanceId" -> o.instanceId.asJson, "RaidLevel" -> o.raidLevel.asJson, "NumberOfDisks" -> o.numberOfDisks.asJson, "Size" -> o.size.asJson, "Iops" -> o.iops.asJson, "CreatedAt" -> o.createdAt.asJson)
  }
  final implicit val RdsDbInstanceEncoder: io.circe.Encoder[avias.opsworks.models.RdsDbInstance] = io.circe.Encoder.instance { o => 
    Json.obj("DbPassword" -> o.dbPassword.asJson, "DbUser" -> o.dbUser.asJson, "Engine" -> o.engine.asJson, "DbInstanceIdentifier" -> o.dbInstanceIdentifier.asJson, "StackId" -> o.stackId.asJson, "Region" -> o.region.asJson, "Address" -> o.address.asJson, "RdsDbInstanceArn" -> o.rdsDbInstanceArn.asJson, "MissingOnRds" -> o.missingOnRds.asJson)
  }
  final implicit val DescribeElasticIpsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeElasticIpsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "StackId" -> o.stackId.asJson, "Ips" -> o.ips.asJson)
  }
  final implicit val PermissionEncoder: io.circe.Encoder[avias.opsworks.models.Permission] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "IamUserArn" -> o.iamUserArn.asJson, "Level" -> o.level.asJson, "AllowSsh" -> o.allowSsh.asJson, "AllowSudo" -> o.allowSudo.asJson)
  }
  final implicit val DescribeDeploymentsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeDeploymentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "AppId" -> o.appId.asJson, "DeploymentIds" -> o.deploymentIds.asJson)
  }
  final implicit val CommandEncoder: io.circe.Encoder[avias.opsworks.models.Command] = io.circe.Encoder.instance { o => 
    Json.obj("LogUrl" -> o.logUrl.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "CommandId" -> o.commandId.asJson, "InstanceId" -> o.instanceId.asJson, "DeploymentId" -> o.deploymentId.asJson, "CreatedAt" -> o.createdAt.asJson, "AcknowledgedAt" -> o.acknowledgedAt.asJson, "CompletedAt" -> o.completedAt.asJson, "ExitCode" -> o.exitCode.asJson)
  }
  final implicit val RegisterEcsClusterRequestEncoder: io.circe.Encoder[avias.opsworks.models.RegisterEcsClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("EcsClusterArn" -> o.ecsClusterArn.asJson, "StackId" -> o.stackId.asJson)
  }
  final implicit val CreateStackRequestEncoder: io.circe.Encoder[avias.opsworks.models.CreateStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DefaultInstanceProfileArn" -> o.defaultInstanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Region" -> o.region.asJson, "Attributes" -> o.attributes.asJson, "DefaultOs" -> o.defaultOs.asJson, "VpcId" -> o.vpcId.asJson, "HostnameTheme" -> o.hostnameTheme.asJson, "DefaultSshKeyName" -> o.defaultSshKeyName.asJson, "AgentVersion" -> o.agentVersion.asJson, "CustomJson" -> o.customJson.asJson, "DefaultSubnetId" -> o.defaultSubnetId.asJson, "DefaultAvailabilityZone" -> o.defaultAvailabilityZone.asJson, "CustomCookbooksSource" -> o.customCookbooksSource.asJson, "ChefConfiguration" -> o.chefConfiguration.asJson, "ConfigurationManager" -> o.configurationManager.asJson, "UseCustomCookbooks" -> o.useCustomCookbooks.asJson, "UseOpsworksSecurityGroups" -> o.useOpsworksSecurityGroups.asJson, "DefaultRootDeviceType" -> o.defaultRootDeviceType.asJson)
  }
  final implicit val RecipesEncoder: io.circe.Encoder[avias.opsworks.models.Recipes] = io.circe.Encoder.instance { o => 
    Json.obj("Undeploy" -> o.undeploy.asJson, "Deploy" -> o.deploy.asJson, "Configure" -> o.configure.asJson, "Setup" -> o.setup.asJson, "Shutdown" -> o.shutdown.asJson)
  }
  final implicit val DescribeUserProfilesResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeUserProfilesResult] = io.circe.Encoder.instance { o => 
    Json.obj("UserProfiles" -> o.userProfiles.asJson)
  }
  final implicit val GrantAccessResultEncoder: io.circe.Encoder[avias.opsworks.models.GrantAccessResult] = io.circe.Encoder.instance { o => 
    Json.obj("TemporaryCredential" -> o.temporaryCredential.asJson)
  }
  final implicit val UpdateElasticIpRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateElasticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIp" -> o.elasticIp.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DescribeVolumesResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeVolumesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Volumes" -> o.volumes.asJson)
  }
  final implicit val VolumeEncoder: io.circe.Encoder[avias.opsworks.models.Volume] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson, "RaidArrayId" -> o.raidArrayId.asJson, "Status" -> o.status.asJson, "Ec2VolumeId" -> o.ec2VolumeId.asJson, "MountPoint" -> o.mountPoint.asJson, "VolumeType" -> o.volumeType.asJson, "Name" -> o.name.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "Region" -> o.region.asJson, "InstanceId" -> o.instanceId.asJson, "VolumeId" -> o.volumeId.asJson, "Size" -> o.size.asJson, "Iops" -> o.iops.asJson)
  }
  final implicit val EnvironmentVariableEncoder: io.circe.Encoder[avias.opsworks.models.EnvironmentVariable] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Secure" -> o.secure.asJson)
  }
  final implicit val StackEncoder: io.circe.Encoder[avias.opsworks.models.Stack] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "DefaultOs" -> o.defaultOs.asJson, "VpcId" -> o.vpcId.asJson, "DefaultInstanceProfileArn" -> o.defaultInstanceProfileArn.asJson, "Arn" -> o.arn.asJson, "HostnameTheme" -> o.hostnameTheme.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "StackId" -> o.stackId.asJson, "DefaultSshKeyName" -> o.defaultSshKeyName.asJson, "AgentVersion" -> o.agentVersion.asJson, "Name" -> o.name.asJson, "CustomJson" -> o.customJson.asJson, "DefaultSubnetId" -> o.defaultSubnetId.asJson, "Region" -> o.region.asJson, "DefaultAvailabilityZone" -> o.defaultAvailabilityZone.asJson, "CustomCookbooksSource" -> o.customCookbooksSource.asJson, "ChefConfiguration" -> o.chefConfiguration.asJson, "ConfigurationManager" -> o.configurationManager.asJson, "CreatedAt" -> o.createdAt.asJson, "UseCustomCookbooks" -> o.useCustomCookbooks.asJson, "UseOpsworksSecurityGroups" -> o.useOpsworksSecurityGroups.asJson, "DefaultRootDeviceType" -> o.defaultRootDeviceType.asJson)
  }
  final implicit val CreateLayerRequestEncoder: io.circe.Encoder[avias.opsworks.models.CreateLayerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "StackId" -> o.stackId.asJson, "Shortname" -> o.shortname.asJson, "Type" -> o.`type`.asJson, "CustomInstanceProfileArn" -> o.customInstanceProfileArn.asJson, "CustomJson" -> o.customJson.asJson, "CloudWatchLogsConfiguration" -> o.cloudWatchLogsConfiguration.asJson, "CustomRecipes" -> o.customRecipes.asJson, "VolumeConfigurations" -> o.volumeConfigurations.asJson, "UseEbsOptimizedInstances" -> o.useEbsOptimizedInstances.asJson, "InstallUpdatesOnBoot" -> o.installUpdatesOnBoot.asJson, "EnableAutoHealing" -> o.enableAutoHealing.asJson, "AutoAssignElasticIps" -> o.autoAssignElasticIps.asJson, "AutoAssignPublicIps" -> o.autoAssignPublicIps.asJson, "LifecycleEventConfiguration" -> o.lifecycleEventConfiguration.asJson, "CustomSecurityGroupIds" -> o.customSecurityGroupIds.asJson, "Packages" -> o.packages.asJson, "Attributes" -> o.attributes.asJson)
  }
  final implicit val AssignInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.AssignInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "LayerIds" -> o.layerIds.asJson)
  }
  final implicit val StackSummaryEncoder: io.circe.Encoder[avias.opsworks.models.StackSummary] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "Name" -> o.name.asJson, "Arn" -> o.arn.asJson, "LayersCount" -> o.layersCount.asJson, "AppsCount" -> o.appsCount.asJson, "InstancesCount" -> o.instancesCount.asJson)
  }
  final implicit val DescribeElasticLoadBalancersRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeElasticLoadBalancersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "LayerIds" -> o.layerIds.asJson)
  }
  final implicit val UpdateUserProfileRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson, "SshUsername" -> o.sshUsername.asJson, "SshPublicKey" -> o.sshPublicKey.asJson, "AllowSelfManagement" -> o.allowSelfManagement.asJson)
  }
  final implicit val StartInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.StartInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val DeregisterInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeregisterInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val DescribePermissionsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribePermissionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Permissions" -> o.permissions.asJson)
  }
  final implicit val GetHostnameSuggestionResultEncoder: io.circe.Encoder[avias.opsworks.models.GetHostnameSuggestionResult] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson, "Hostname" -> o.hostname.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.opsworks.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeploymentCommandEncoder: io.circe.Encoder[avias.opsworks.models.DeploymentCommand] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Args" -> o.args.asJson)
  }
  final implicit val CreateLayerResultEncoder: io.circe.Encoder[avias.opsworks.models.CreateLayerResult] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson)
  }
  final implicit val DescribeTimeBasedAutoScalingResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeTimeBasedAutoScalingResult] = io.circe.Encoder.instance { o => 
    Json.obj("TimeBasedAutoScalingConfigurations" -> o.timeBasedAutoScalingConfigurations.asJson)
  }
  final implicit val DescribeServiceErrorsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeServiceErrorsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "InstanceId" -> o.instanceId.asJson, "ServiceErrorIds" -> o.serviceErrorIds.asJson)
  }
  final implicit val CreateUserProfileRequestEncoder: io.circe.Encoder[avias.opsworks.models.CreateUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson, "SshUsername" -> o.sshUsername.asJson, "SshPublicKey" -> o.sshPublicKey.asJson, "AllowSelfManagement" -> o.allowSelfManagement.asJson)
  }
  final implicit val StartStackRequestEncoder: io.circe.Encoder[avias.opsworks.models.StartStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val DescribePermissionsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribePermissionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson, "StackId" -> o.stackId.asJson)
  }
  final implicit val DescribeStackProvisioningParametersResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeStackProvisioningParametersResult] = io.circe.Encoder.instance { o => 
    Json.obj("AgentInstallerUrl" -> o.agentInstallerUrl.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val DescribeAppsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeAppsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Apps" -> o.apps.asJson)
  }
  final implicit val UnassignInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.UnassignInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val UserProfileEncoder: io.circe.Encoder[avias.opsworks.models.UserProfile] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson, "Name" -> o.name.asJson, "SshUsername" -> o.sshUsername.asJson, "SshPublicKey" -> o.sshPublicKey.asJson, "AllowSelfManagement" -> o.allowSelfManagement.asJson)
  }
  final implicit val TimeBasedAutoScalingConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.TimeBasedAutoScalingConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "AutoScalingSchedule" -> o.autoScalingSchedule.asJson)
  }
  final implicit val UpdateStackRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "Attributes" -> o.attributes.asJson, "DefaultOs" -> o.defaultOs.asJson, "DefaultInstanceProfileArn" -> o.defaultInstanceProfileArn.asJson, "HostnameTheme" -> o.hostnameTheme.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "DefaultSshKeyName" -> o.defaultSshKeyName.asJson, "AgentVersion" -> o.agentVersion.asJson, "Name" -> o.name.asJson, "CustomJson" -> o.customJson.asJson, "DefaultSubnetId" -> o.defaultSubnetId.asJson, "DefaultAvailabilityZone" -> o.defaultAvailabilityZone.asJson, "CustomCookbooksSource" -> o.customCookbooksSource.asJson, "ChefConfiguration" -> o.chefConfiguration.asJson, "ConfigurationManager" -> o.configurationManager.asJson, "UseCustomCookbooks" -> o.useCustomCookbooks.asJson, "UseOpsworksSecurityGroups" -> o.useOpsworksSecurityGroups.asJson, "DefaultRootDeviceType" -> o.defaultRootDeviceType.asJson)
  }
  final implicit val UpdateAppRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateAppRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AppId" -> o.appId.asJson, "DataSources" -> o.dataSources.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "SslConfiguration" -> o.sslConfiguration.asJson, "Type" -> o.`type`.asJson, "AppSource" -> o.appSource.asJson, "EnableSsl" -> o.enableSsl.asJson, "Attributes" -> o.attributes.asJson, "Domains" -> o.domains.asJson, "Environment" -> o.environment.asJson)
  }
  final implicit val DescribeCommandsRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeCommandsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeploymentId" -> o.deploymentId.asJson, "InstanceId" -> o.instanceId.asJson, "CommandIds" -> o.commandIds.asJson)
  }
  final implicit val RegisterEcsClusterResultEncoder: io.circe.Encoder[avias.opsworks.models.RegisterEcsClusterResult] = io.circe.Encoder.instance { o => 
    Json.obj("EcsClusterArn" -> o.ecsClusterArn.asJson)
  }
  final implicit val DisassociateElasticIpRequestEncoder: io.circe.Encoder[avias.opsworks.models.DisassociateElasticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIp" -> o.elasticIp.asJson)
  }
  final implicit val RegisterVolumeRequestEncoder: io.circe.Encoder[avias.opsworks.models.RegisterVolumeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "Ec2VolumeId" -> o.ec2VolumeId.asJson)
  }
  final implicit val CreateStackResultEncoder: io.circe.Encoder[avias.opsworks.models.CreateStackResult] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val DescribeStacksResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeStacksResult] = io.circe.Encoder.instance { o => 
    Json.obj("Stacks" -> o.stacks.asJson)
  }
  final implicit val CreateInstanceRequestEncoder: io.circe.Encoder[avias.opsworks.models.CreateInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "InstanceType" -> o.instanceType.asJson, "LayerIds" -> o.layerIds.asJson, "BlockDeviceMappings" -> o.blockDeviceMappings.asJson, "SubnetId" -> o.subnetId.asJson, "AmiId" -> o.amiId.asJson, "Tenancy" -> o.tenancy.asJson, "AgentVersion" -> o.agentVersion.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "Hostname" -> o.hostname.asJson, "Os" -> o.os.asJson, "SshKeyName" -> o.sshKeyName.asJson, "VirtualizationType" -> o.virtualizationType.asJson, "InstallUpdatesOnBoot" -> o.installUpdatesOnBoot.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "RootDeviceType" -> o.rootDeviceType.asJson, "AutoScalingType" -> o.autoScalingType.asJson, "Architecture" -> o.architecture.asJson)
  }
  final implicit val DescribeLoadBasedAutoScalingResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeLoadBasedAutoScalingResult] = io.circe.Encoder.instance { o => 
    Json.obj("LoadBasedAutoScalingConfigurations" -> o.loadBasedAutoScalingConfigurations.asJson)
  }
  final implicit val CreateInstanceResultEncoder: io.circe.Encoder[avias.opsworks.models.CreateInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val DescribeMyUserProfileResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeMyUserProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("UserProfile" -> o.userProfile.asJson)
  }
  final implicit val DescribeInstancesRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson, "LayerId" -> o.layerId.asJson, "InstanceIds" -> o.instanceIds.asJson)
  }
  final implicit val DeleteUserProfileRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeleteUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("IamUserArn" -> o.iamUserArn.asJson)
  }
  final implicit val WeeklyAutoScalingScheduleEncoder: io.circe.Encoder[avias.opsworks.models.WeeklyAutoScalingSchedule] = io.circe.Encoder.instance { o => 
    Json.obj("Wednesday" -> o.wednesday.asJson, "Sunday" -> o.sunday.asJson, "Saturday" -> o.saturday.asJson, "Tuesday" -> o.tuesday.asJson, "Monday" -> o.monday.asJson, "Friday" -> o.friday.asJson, "Thursday" -> o.thursday.asJson)
  }
  final implicit val CloudWatchLogsLogStreamEncoder: io.circe.Encoder[avias.opsworks.models.CloudWatchLogsLogStream] = io.circe.Encoder.instance { o => 
    Json.obj("DatetimeFormat" -> o.datetimeFormat.asJson, "FileFingerprintLines" -> o.fileFingerprintLines.asJson, "LogGroupName" -> o.logGroupName.asJson, "MultiLineStartPattern" -> o.multiLineStartPattern.asJson, "File" -> o.file.asJson, "InitialPosition" -> o.initialPosition.asJson, "Encoding" -> o.encoding.asJson, "TimeZone" -> o.timeZone.asJson, "BufferDuration" -> o.bufferDuration.asJson, "BatchCount" -> o.batchCount.asJson, "BatchSize" -> o.batchSize.asJson)
  }
  final implicit val DescribeElasticIpsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeElasticIpsResult] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticIps" -> o.elasticIps.asJson)
  }
  final implicit val GetHostnameSuggestionRequestEncoder: io.circe.Encoder[avias.opsworks.models.GetHostnameSuggestionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson)
  }
  final implicit val LoadBasedAutoScalingConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.LoadBasedAutoScalingConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson, "Enable" -> o.enable.asJson, "UpScaling" -> o.upScaling.asJson, "DownScaling" -> o.downScaling.asJson)
  }
  final implicit val DescribeCommandsResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeCommandsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Commands" -> o.commands.asJson)
  }
  final implicit val LifecycleEventConfigurationEncoder: io.circe.Encoder[avias.opsworks.models.LifecycleEventConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("Shutdown" -> o.shutdown.asJson)
  }
  final implicit val DescribeStackSummaryRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeStackSummaryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val DeleteStackRequestEncoder: io.circe.Encoder[avias.opsworks.models.DeleteStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val AttachElasticLoadBalancerRequestEncoder: io.circe.Encoder[avias.opsworks.models.AttachElasticLoadBalancerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ElasticLoadBalancerName" -> o.elasticLoadBalancerName.asJson, "LayerId" -> o.layerId.asJson)
  }
  final implicit val DescribeEcsClustersRequestEncoder: io.circe.Encoder[avias.opsworks.models.DescribeEcsClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("EcsClusterArns" -> o.ecsClusterArns.asJson, "StackId" -> o.stackId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val UpdateLayerRequestEncoder: io.circe.Encoder[avias.opsworks.models.UpdateLayerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LayerId" -> o.layerId.asJson, "Shortname" -> o.shortname.asJson, "CustomInstanceProfileArn" -> o.customInstanceProfileArn.asJson, "Name" -> o.name.asJson, "CustomJson" -> o.customJson.asJson, "CloudWatchLogsConfiguration" -> o.cloudWatchLogsConfiguration.asJson, "CustomRecipes" -> o.customRecipes.asJson, "VolumeConfigurations" -> o.volumeConfigurations.asJson, "UseEbsOptimizedInstances" -> o.useEbsOptimizedInstances.asJson, "InstallUpdatesOnBoot" -> o.installUpdatesOnBoot.asJson, "EnableAutoHealing" -> o.enableAutoHealing.asJson, "AutoAssignElasticIps" -> o.autoAssignElasticIps.asJson, "AutoAssignPublicIps" -> o.autoAssignPublicIps.asJson, "LifecycleEventConfiguration" -> o.lifecycleEventConfiguration.asJson, "CustomSecurityGroupIds" -> o.customSecurityGroupIds.asJson, "Packages" -> o.packages.asJson, "Attributes" -> o.attributes.asJson)
  }
  final implicit val CloneStackResultEncoder: io.circe.Encoder[avias.opsworks.models.CloneStackResult] = io.circe.Encoder.instance { o => 
    Json.obj("StackId" -> o.stackId.asJson)
  }
  final implicit val ElasticIpEncoder: io.circe.Encoder[avias.opsworks.models.ElasticIp] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson, "Ip" -> o.ip.asJson, "Name" -> o.name.asJson, "Region" -> o.region.asJson, "InstanceId" -> o.instanceId.asJson)
  }
  final implicit val CreateAppResultEncoder: io.circe.Encoder[avias.opsworks.models.CreateAppResult] = io.circe.Encoder.instance { o => 
    Json.obj("AppId" -> o.appId.asJson)
  }
  final implicit val DescribeRaidArraysResultEncoder: io.circe.Encoder[avias.opsworks.models.DescribeRaidArraysResult] = io.circe.Encoder.instance { o => 
    Json.obj("RaidArrays" -> o.raidArrays.asJson)
  }
  final implicit val DeleteInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeleteInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[scala.Boolean]]("DeleteElasticIp"), o.get[scala.Option[scala.Boolean]]("DeleteVolumes")).mapN(avias.opsworks.models.DeleteInstanceRequest.apply _)
  }
  final implicit val InstanceIdentityDecoder: io.circe.Decoder[avias.opsworks.models.InstanceIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Document"), o.get[scala.Option[java.lang.String]]("Signature")).mapN(avias.opsworks.models.InstanceIdentity.apply _)
  }
  final implicit val DetachElasticLoadBalancerRequestDecoder: io.circe.Decoder[avias.opsworks.models.DetachElasticLoadBalancerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ElasticLoadBalancerName"), o.get[java.lang.String]("LayerId")).mapN(avias.opsworks.models.DetachElasticLoadBalancerRequest.apply _)
  }
  final implicit val ShutdownEventConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.ShutdownEventConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ExecutionTimeout"), o.get[scala.Option[scala.Boolean]]("DelayUntilElbConnectionsDrained")).mapN(avias.opsworks.models.ShutdownEventConfiguration.apply _)
  }
  final implicit val DeregisterVolumeRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeregisterVolumeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeId").map(avias.opsworks.models.DeregisterVolumeRequest.apply _)
  }
  final implicit val CloneStackRequestDecoder: io.circe.Decoder[avias.opsworks.models.CloneStackRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServiceRoleArn"), o.get[java.lang.String]("SourceStackId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[java.lang.String]]("DefaultOs"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("DefaultInstanceProfileArn"), o.get[scala.Option[java.lang.String]]("HostnameTheme"), o.get[scala.Option[java.lang.String]]("DefaultSshKeyName"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[java.lang.String]]("DefaultSubnetId"), o.get[scala.Option[java.lang.String]]("Region"), o.get[scala.Option[java.lang.String]]("DefaultAvailabilityZone"), o.get[scala.Option[avias.opsworks.models.Source]]("CustomCookbooksSource"), o.get[scala.Option[avias.opsworks.models.ChefConfiguration]]("ChefConfiguration"), o.get[scala.Option[avias.opsworks.models.StackConfigurationManager]]("ConfigurationManager"), o.get[scala.Option[scala.Boolean]]("UseCustomCookbooks"), o.get[scala.Option[scala.Boolean]]("UseOpsworksSecurityGroups"), o.get[scala.Option[scala.Boolean]]("ClonePermissions"), o.get[scala.Option[java.lang.String]]("DefaultRootDeviceType"), o.get[scala.Option[scala.List[java.lang.String]]]("CloneAppIds")).mapN(avias.opsworks.models.CloneStackRequest.apply _)
  }
  final implicit val DeregisterEcsClusterRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeregisterEcsClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("EcsClusterArn").map(avias.opsworks.models.DeregisterEcsClusterRequest.apply _)
  }
  final implicit val RegisterInstanceResultDecoder: io.circe.Decoder[avias.opsworks.models.RegisterInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("InstanceId").map(avias.opsworks.models.RegisterInstanceResult.apply _)
  }
  final implicit val UpdateRdsDbInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateRdsDbInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RdsDbInstanceArn"), o.get[scala.Option[java.lang.String]]("DbUser"), o.get[scala.Option[java.lang.String]]("DbPassword")).mapN(avias.opsworks.models.UpdateRdsDbInstanceRequest.apply _)
  }
  final implicit val VolumeConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.VolumeConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MountPoint"), o.get[scala.Int]("NumberOfDisks"), o.get[scala.Int]("Size"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[scala.Int]]("RaidLevel"), o.get[scala.Option[scala.Int]]("Iops")).mapN(avias.opsworks.models.VolumeConfiguration.apply _)
  }
  final implicit val DescribeTimeBasedAutoScalingRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeTimeBasedAutoScalingRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("InstanceIds").map(avias.opsworks.models.DescribeTimeBasedAutoScalingRequest.apply _)
  }
  final implicit val RegisterElasticIpResultDecoder: io.circe.Decoder[avias.opsworks.models.RegisterElasticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ElasticIp").map(avias.opsworks.models.RegisterElasticIpResult.apply _)
  }
  final implicit val RegisterInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.RegisterInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[scala.Option[java.lang.String]]("RsaPublicKeyFingerprint"), o.get[scala.Option[java.lang.String]]("PrivateIp"), o.get[scala.Option[java.lang.String]]("RsaPublicKey"), o.get[scala.Option[java.lang.String]]("Hostname"), o.get[scala.Option[java.lang.String]]("PublicIp"), o.get[scala.Option[avias.opsworks.models.InstanceIdentity]]("InstanceIdentity")).mapN(avias.opsworks.models.RegisterInstanceRequest.apply _)
  }
  final implicit val UnassignVolumeRequestDecoder: io.circe.Decoder[avias.opsworks.models.UnassignVolumeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeId").map(avias.opsworks.models.UnassignVolumeRequest.apply _)
  }
  final implicit val SelfUserProfileDecoder: io.circe.Decoder[avias.opsworks.models.SelfUserProfile] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IamUserArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SshUsername"), o.get[scala.Option[java.lang.String]]("SshPublicKey")).mapN(avias.opsworks.models.SelfUserProfile.apply _)
  }
  final implicit val LayerDecoder: io.circe.Decoder[avias.opsworks.models.Layer] = io.circe.Decoder.instance { o => 
    for (`shortname` <- o.get[scala.Option[java.lang.String]]("Shortname"); `customInstanceProfileArn` <- o.get[scala.Option[java.lang.String]]("CustomInstanceProfileArn"); `arn` <- o.get[scala.Option[java.lang.String]]("Arn"); `stackId` <- o.get[scala.Option[java.lang.String]]("StackId"); `name` <- o.get[scala.Option[java.lang.String]]("Name"); `customJson` <- o.get[scala.Option[java.lang.String]]("CustomJson"); `layerId` <- o.get[scala.Option[java.lang.String]]("LayerId"); `cloudWatchLogsConfiguration` <- o.get[scala.Option[avias.opsworks.models.CloudWatchLogsConfiguration]]("CloudWatchLogsConfiguration"); `type` <- o.get[scala.Option[java.lang.String]]("Type"); `defaultRecipes` <- o.get[scala.Option[avias.opsworks.models.Recipes]]("DefaultRecipes"); `customRecipes` <- o.get[scala.Option[avias.opsworks.models.Recipes]]("CustomRecipes"); `volumeConfigurations` <- o.get[scala.Option[scala.List[avias.opsworks.models.VolumeConfiguration]]]("VolumeConfigurations"); `createdAt` <- o.get[scala.Option[java.lang.String]]("CreatedAt"); `useEbsOptimizedInstances` <- o.get[scala.Option[scala.Boolean]]("UseEbsOptimizedInstances"); `installUpdatesOnBoot` <- o.get[scala.Option[scala.Boolean]]("InstallUpdatesOnBoot"); `enableAutoHealing` <- o.get[scala.Option[scala.Boolean]]("EnableAutoHealing"); `autoAssignElasticIps` <- o.get[scala.Option[scala.Boolean]]("AutoAssignElasticIps"); `autoAssignPublicIps` <- o.get[scala.Option[scala.Boolean]]("AutoAssignPublicIps"); `lifecycleEventConfiguration` <- o.get[scala.Option[avias.opsworks.models.LifecycleEventConfiguration]]("LifecycleEventConfiguration"); `customSecurityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("CustomSecurityGroupIds"); `defaultSecurityGroupNames` <- o.get[scala.Option[scala.List[java.lang.String]]]("DefaultSecurityGroupNames"); `packages` <- o.get[scala.Option[scala.List[java.lang.String]]]("Packages"); `attributes` <- o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes")) yield avias.opsworks.models.Layer(shortname, customInstanceProfileArn, arn, stackId, name, customJson, layerId, cloudWatchLogsConfiguration, `type`, defaultRecipes, customRecipes, volumeConfigurations, createdAt, useEbsOptimizedInstances, installUpdatesOnBoot, enableAutoHealing, autoAssignElasticIps, autoAssignPublicIps, lifecycleEventConfiguration, customSecurityGroupIds, defaultSecurityGroupNames, packages, attributes)
  }
  final implicit val DescribeServiceErrorsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeServiceErrorsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.ServiceError]]]("ServiceErrors").map(avias.opsworks.models.DescribeServiceErrorsResult.apply _)
  }
  final implicit val DescribeStackProvisioningParametersRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeStackProvisioningParametersRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StackId").map(avias.opsworks.models.DescribeStackProvisioningParametersRequest.apply _)
  }
  final implicit val SslConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.SslConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Certificate"), o.get[java.lang.String]("PrivateKey"), o.get[scala.Option[java.lang.String]]("Chain")).mapN(avias.opsworks.models.SslConfiguration.apply _)
  }
  final implicit val AppDecoder: io.circe.Decoder[avias.opsworks.models.App] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.opsworks.models.DataSource]]]("DataSources"), o.get[scala.Option[java.lang.String]]("Shortname"), o.get[scala.Option[java.lang.String]]("AppId"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[avias.opsworks.models.SslConfiguration]]("SslConfiguration"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[avias.opsworks.models.Source]]("AppSource"), o.get[scala.Option[scala.Boolean]]("EnableSsl"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[scala.List[java.lang.String]]]("Domains"), o.get[scala.Option[scala.List[avias.opsworks.models.EnvironmentVariable]]]("Environment")).mapN(avias.opsworks.models.App.apply _)
  }
  final implicit val DescribeRaidArraysRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeRaidArraysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[scala.List[java.lang.String]]]("RaidArrayIds")).mapN(avias.opsworks.models.DescribeRaidArraysRequest.apply _)
  }
  final implicit val DescribeRdsDbInstancesResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeRdsDbInstancesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.RdsDbInstance]]]("RdsDbInstances").map(avias.opsworks.models.DescribeRdsDbInstancesResult.apply _)
  }
  final implicit val AssignVolumeRequestDecoder: io.circe.Decoder[avias.opsworks.models.AssignVolumeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeId"), o.get[scala.Option[java.lang.String]]("InstanceId")).mapN(avias.opsworks.models.AssignVolumeRequest.apply _)
  }
  final implicit val RebootInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.RebootInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("InstanceId").map(avias.opsworks.models.RebootInstanceRequest.apply _)
  }
  final implicit val DescribeStacksRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeStacksRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("StackIds").map(avias.opsworks.models.DescribeStacksRequest.apply _)
  }
  final implicit val DeregisterElasticIpRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeregisterElasticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ElasticIp").map(avias.opsworks.models.DeregisterElasticIpRequest.apply _)
  }
  final implicit val AutoScalingThresholdsDecoder: io.circe.Decoder[avias.opsworks.models.AutoScalingThresholds] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("InstanceCount"), o.get[scala.Option[scala.Int]]("ThresholdsWaitTime"), o.get[scala.Option[scala.Int]]("IgnoreMetricsTime"), o.get[scala.Option[scala.Double]]("CpuThreshold"), o.get[scala.Option[scala.Double]]("MemoryThreshold"), o.get[scala.Option[scala.Double]]("LoadThreshold"), o.get[scala.Option[scala.List[java.lang.String]]]("Alarms")).mapN(avias.opsworks.models.AutoScalingThresholds.apply _)
  }
  final implicit val GrantAccessRequestDecoder: io.circe.Decoder[avias.opsworks.models.GrantAccessRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[scala.Int]]("ValidForInMinutes")).mapN(avias.opsworks.models.GrantAccessRequest.apply _)
  }
  final implicit val EcsClusterDecoder: io.circe.Decoder[avias.opsworks.models.EcsCluster] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EcsClusterArn"), o.get[scala.Option[java.lang.String]]("EcsClusterName"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("RegisteredAt")).mapN(avias.opsworks.models.EcsCluster.apply _)
  }
  final implicit val DescribeEcsClustersResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeEcsClustersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.opsworks.models.EcsCluster]]]("EcsClusters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.opsworks.models.DescribeEcsClustersResult.apply _)
  }
  final implicit val SourceDecoder: io.circe.Decoder[avias.opsworks.models.Source] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Revision"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("Password"), o.get[scala.Option[java.lang.String]]("Url"), o.get[scala.Option[java.lang.String]]("SshKey")).mapN(avias.opsworks.models.Source.apply _)
  }
  final implicit val DescribeRdsDbInstancesRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeRdsDbInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[scala.Option[scala.List[java.lang.String]]]("RdsDbInstanceArns")).mapN(avias.opsworks.models.DescribeRdsDbInstancesRequest.apply _)
  }
  final implicit val CreateUserProfileResultDecoder: io.circe.Decoder[avias.opsworks.models.CreateUserProfileResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("IamUserArn").map(avias.opsworks.models.CreateUserProfileResult.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[avias.opsworks.models.Instance] = io.circe.Decoder.instance { o => 
    for (`blockDeviceMappings` <- o.get[scala.Option[scala.List[avias.opsworks.models.BlockDeviceMapping]]]("BlockDeviceMappings"); `privateIp` <- o.get[scala.Option[java.lang.String]]("PrivateIp"); `subnetId` <- o.get[scala.Option[java.lang.String]]("SubnetId"); `sshHostRsaKeyFingerprint` <- o.get[scala.Option[java.lang.String]]("SshHostRsaKeyFingerprint"); `reportedAgentVersion` <- o.get[scala.Option[java.lang.String]]("ReportedAgentVersion"); `amiId` <- o.get[scala.Option[java.lang.String]]("AmiId"); `sshHostDsaKeyFingerprint` <- o.get[scala.Option[java.lang.String]]("SshHostDsaKeyFingerprint"); `arn` <- o.get[scala.Option[java.lang.String]]("Arn"); `tenancy` <- o.get[scala.Option[java.lang.String]]("Tenancy"); `ec2InstanceId` <- o.get[scala.Option[java.lang.String]]("Ec2InstanceId"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `rootDeviceVolumeId` <- o.get[scala.Option[java.lang.String]]("RootDeviceVolumeId"); `stackId` <- o.get[scala.Option[java.lang.String]]("StackId"); `agentVersion` <- o.get[scala.Option[java.lang.String]]("AgentVersion"); `availabilityZone` <- o.get[scala.Option[java.lang.String]]("AvailabilityZone"); `hostname` <- o.get[scala.Option[java.lang.String]]("Hostname"); `publicDns` <- o.get[scala.Option[java.lang.String]]("PublicDns"); `platform` <- o.get[scala.Option[java.lang.String]]("Platform"); `os` <- o.get[scala.Option[java.lang.String]]("Os"); `ecsClusterArn` <- o.get[scala.Option[java.lang.String]]("EcsClusterArn"); `sshKeyName` <- o.get[scala.Option[java.lang.String]]("SshKeyName"); `infrastructureClass` <- o.get[scala.Option[java.lang.String]]("InfrastructureClass"); `instanceId` <- o.get[scala.Option[java.lang.String]]("InstanceId"); `ecsContainerInstanceArn` <- o.get[scala.Option[java.lang.String]]("EcsContainerInstanceArn"); `lastServiceErrorId` <- o.get[scala.Option[java.lang.String]]("LastServiceErrorId"); `publicIp` <- o.get[scala.Option[java.lang.String]]("PublicIp"); `privateDns` <- o.get[scala.Option[java.lang.String]]("PrivateDns"); `registeredBy` <- o.get[scala.Option[java.lang.String]]("RegisteredBy"); `elasticIp` <- o.get[scala.Option[java.lang.String]]("ElasticIp"); `virtualizationType` <- o.get[scala.Option[java.lang.String]]("VirtualizationType"); `reportedOs` <- o.get[scala.Option[avias.opsworks.models.ReportedOs]]("ReportedOs"); `createdAt` <- o.get[scala.Option[java.lang.String]]("CreatedAt"); `ebsOptimized` <- o.get[scala.Option[scala.Boolean]]("EbsOptimized"); `installUpdatesOnBoot` <- o.get[scala.Option[scala.Boolean]]("InstallUpdatesOnBoot"); `rootDeviceType` <- o.get[scala.Option[java.lang.String]]("RootDeviceType"); `autoScalingType` <- o.get[scala.Option[java.lang.String]]("AutoScalingType"); `layerIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("LayerIds"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `architecture` <- o.get[scala.Option[java.lang.String]]("Architecture")) yield avias.opsworks.models.Instance(blockDeviceMappings, privateIp, subnetId, sshHostRsaKeyFingerprint, reportedAgentVersion, amiId, sshHostDsaKeyFingerprint, arn, tenancy, ec2InstanceId, instanceType, status, instanceProfileArn, rootDeviceVolumeId, stackId, agentVersion, availabilityZone, hostname, publicDns, platform, os, ecsClusterArn, sshKeyName, infrastructureClass, instanceId, ecsContainerInstanceArn, lastServiceErrorId, publicIp, privateDns, registeredBy, elasticIp, virtualizationType, reportedOs, createdAt, ebsOptimized, installUpdatesOnBoot, rootDeviceType, autoScalingType, layerIds, securityGroupIds, architecture)
  }
  final implicit val RegisterVolumeResultDecoder: io.circe.Decoder[avias.opsworks.models.RegisterVolumeResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeId").map(avias.opsworks.models.RegisterVolumeResult.apply _)
  }
  final implicit val DataSourceDecoder: io.circe.Decoder[avias.opsworks.models.DataSource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("DatabaseName")).mapN(avias.opsworks.models.DataSource.apply _)
  }
  final implicit val DescribeInstancesResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeInstancesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Instance]]]("Instances").map(avias.opsworks.models.DescribeInstancesResult.apply _)
  }
  final implicit val ListTagsRequestDecoder: io.circe.Decoder[avias.opsworks.models.ListTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.opsworks.models.ListTagsRequest.apply _)
  }
  final implicit val DescribeAppsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeAppsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[scala.List[java.lang.String]]]("AppIds")).mapN(avias.opsworks.models.DescribeAppsRequest.apply _)
  }
  final implicit val CreateDeploymentRequestDecoder: io.circe.Decoder[avias.opsworks.models.CreateDeploymentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[avias.opsworks.models.DeploymentCommand]("Command"), o.get[scala.Option[java.lang.String]]("AppId"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceIds"), o.get[scala.Option[scala.List[java.lang.String]]]("LayerIds")).mapN(avias.opsworks.models.CreateDeploymentRequest.apply _)
  }
  final implicit val DescribeUserProfilesRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeUserProfilesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("IamUserArns").map(avias.opsworks.models.DescribeUserProfilesRequest.apply _)
  }
  final implicit val CreateDeploymentResultDecoder: io.circe.Decoder[avias.opsworks.models.CreateDeploymentResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DeploymentId").map(avias.opsworks.models.CreateDeploymentResult.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[avias.opsworks.models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Tags")).mapN(avias.opsworks.models.TagResourceRequest.apply _)
  }
  final implicit val DeleteAppRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeleteAppRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AppId").map(avias.opsworks.models.DeleteAppRequest.apply _)
  }
  final implicit val UpdateVolumeRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateVolumeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("MountPoint")).mapN(avias.opsworks.models.UpdateVolumeRequest.apply _)
  }
  final implicit val SetLoadBasedAutoScalingRequestDecoder: io.circe.Decoder[avias.opsworks.models.SetLoadBasedAutoScalingRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("LayerId"), o.get[scala.Option[scala.Boolean]]("Enable"), o.get[scala.Option[avias.opsworks.models.AutoScalingThresholds]]("UpScaling"), o.get[scala.Option[avias.opsworks.models.AutoScalingThresholds]]("DownScaling")).mapN(avias.opsworks.models.SetLoadBasedAutoScalingRequest.apply _)
  }
  final implicit val DescribeElasticLoadBalancersResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeElasticLoadBalancersResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.ElasticLoadBalancer]]]("ElasticLoadBalancers").map(avias.opsworks.models.DescribeElasticLoadBalancersResult.apply _)
  }
  final implicit val DescribeDeploymentsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeDeploymentsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Deployment]]]("Deployments").map(avias.opsworks.models.DescribeDeploymentsResult.apply _)
  }
  final implicit val DescribeStackSummaryResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeStackSummaryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworks.models.StackSummary]]("StackSummary").map(avias.opsworks.models.DescribeStackSummaryResult.apply _)
  }
  final implicit val DeregisterRdsDbInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeregisterRdsDbInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RdsDbInstanceArn").map(avias.opsworks.models.DeregisterRdsDbInstanceRequest.apply _)
  }
  final implicit val DescribeAgentVersionsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeAgentVersionsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.AgentVersion]]]("AgentVersions").map(avias.opsworks.models.DescribeAgentVersionsResult.apply _)
  }
  final implicit val InstancesCountDecoder: io.circe.Decoder[avias.opsworks.models.InstancesCount] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ShuttingDown"), o.get[scala.Option[scala.Int]]("Stopping"), o.get[scala.Option[scala.Int]]("Unassigning"), o.get[scala.Option[scala.Int]]("Terminating"), o.get[scala.Option[scala.Int]]("StartFailed"), o.get[scala.Option[scala.Int]]("Deregistering"), o.get[scala.Option[scala.Int]]("Registering"), o.get[scala.Option[scala.Int]]("Assigning"), o.get[scala.Option[scala.Int]]("Rebooting"), o.get[scala.Option[scala.Int]]("Registered"), o.get[scala.Option[scala.Int]]("ConnectionLost"), o.get[scala.Option[scala.Int]]("Booting"), o.get[scala.Option[scala.Int]]("Terminated"), o.get[scala.Option[scala.Int]]("Stopped"), o.get[scala.Option[scala.Int]]("RunningSetup"), o.get[scala.Option[scala.Int]]("Pending"), o.get[scala.Option[scala.Int]]("Online"), o.get[scala.Option[scala.Int]]("Requested"), o.get[scala.Option[scala.Int]]("SetupFailed")).mapN(avias.opsworks.models.InstancesCount.apply _)
  }
  final implicit val ServiceErrorDecoder: io.circe.Decoder[avias.opsworks.models.ServiceError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("ServiceErrorId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("CreatedAt")).mapN(avias.opsworks.models.ServiceError.apply _)
  }
  final implicit val RegisterElasticIpRequestDecoder: io.circe.Decoder[avias.opsworks.models.RegisterElasticIpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ElasticIp"), o.get[java.lang.String]("StackId")).mapN(avias.opsworks.models.RegisterElasticIpRequest.apply _)
  }
  final implicit val AssociateElasticIpRequestDecoder: io.circe.Decoder[avias.opsworks.models.AssociateElasticIpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ElasticIp"), o.get[scala.Option[java.lang.String]]("InstanceId")).mapN(avias.opsworks.models.AssociateElasticIpRequest.apply _)
  }
  final implicit val ReportedOsDecoder: io.circe.Decoder[avias.opsworks.models.ReportedOs] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Family"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version")).mapN(avias.opsworks.models.ReportedOs.apply _)
  }
  final implicit val RegisterRdsDbInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.RegisterRdsDbInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[java.lang.String]("RdsDbInstanceArn"), o.get[java.lang.String]("DbUser"), o.get[java.lang.String]("DbPassword")).mapN(avias.opsworks.models.RegisterRdsDbInstanceRequest.apply _)
  }
  final implicit val ListTagsResultDecoder: io.circe.Decoder[avias.opsworks.models.ListTagsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.opsworks.models.ListTagsResult.apply _)
  }
  final implicit val SetPermissionRequestDecoder: io.circe.Decoder[avias.opsworks.models.SetPermissionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[java.lang.String]("IamUserArn"), o.get[scala.Option[java.lang.String]]("Level"), o.get[scala.Option[scala.Boolean]]("AllowSsh"), o.get[scala.Option[scala.Boolean]]("AllowSudo")).mapN(avias.opsworks.models.SetPermissionRequest.apply _)
  }
  final implicit val CloudWatchLogsConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.CloudWatchLogsConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[scala.List[avias.opsworks.models.CloudWatchLogsLogStream]]]("LogStreams")).mapN(avias.opsworks.models.CloudWatchLogsConfiguration.apply _)
  }
  final implicit val StopInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.StopInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("InstanceId").map(avias.opsworks.models.StopInstanceRequest.apply _)
  }
  final implicit val DeleteLayerRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeleteLayerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("LayerId").map(avias.opsworks.models.DeleteLayerRequest.apply _)
  }
  final implicit val DescribeLayersRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeLayersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[scala.List[java.lang.String]]]("LayerIds")).mapN(avias.opsworks.models.DescribeLayersRequest.apply _)
  }
  final implicit val DeploymentDecoder: io.circe.Decoder[avias.opsworks.models.Deployment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("AppId"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[java.lang.String]]("IamUserArn"), o.get[scala.Option[java.lang.String]]("DeploymentId"), o.get[scala.Option[avias.opsworks.models.DeploymentCommand]]("Command"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[java.lang.String]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("CompletedAt"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceIds")).mapN(avias.opsworks.models.Deployment.apply _)
  }
  final implicit val ChefConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.ChefConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("ManageBerkshelf"), o.get[scala.Option[java.lang.String]]("BerkshelfVersion")).mapN(avias.opsworks.models.ChefConfiguration.apply _)
  }
  final implicit val DescribeAgentVersionsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeAgentVersionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[avias.opsworks.models.StackConfigurationManager]]("ConfigurationManager")).mapN(avias.opsworks.models.DescribeAgentVersionsRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[avias.opsworks.models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.opsworks.models.ValidationException.apply _)
  }
  final implicit val DescribeLayersResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeLayersResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Layer]]]("Layers").map(avias.opsworks.models.DescribeLayersResult.apply _)
  }
  final implicit val SetTimeBasedAutoScalingRequestDecoder: io.circe.Decoder[avias.opsworks.models.SetTimeBasedAutoScalingRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[avias.opsworks.models.WeeklyAutoScalingSchedule]]("AutoScalingSchedule")).mapN(avias.opsworks.models.SetTimeBasedAutoScalingRequest.apply _)
  }
  final implicit val StopStackRequestDecoder: io.circe.Decoder[avias.opsworks.models.StopStackRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StackId").map(avias.opsworks.models.StopStackRequest.apply _)
  }
  final implicit val EbsBlockDeviceDecoder: io.circe.Decoder[avias.opsworks.models.EbsBlockDevice] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[scala.Int]]("Iops"), o.get[scala.Option[scala.Int]]("VolumeSize"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[scala.Boolean]]("DeleteOnTermination")).mapN(avias.opsworks.models.EbsBlockDevice.apply _)
  }
  final implicit val StackConfigurationManagerDecoder: io.circe.Decoder[avias.opsworks.models.StackConfigurationManager] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version")).mapN(avias.opsworks.models.StackConfigurationManager.apply _)
  }
  final implicit val CreateAppRequestDecoder: io.circe.Decoder[avias.opsworks.models.CreateAppRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type"), o.get[scala.Option[scala.List[avias.opsworks.models.DataSource]]]("DataSources"), o.get[scala.Option[java.lang.String]]("Shortname"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[avias.opsworks.models.SslConfiguration]]("SslConfiguration"), o.get[scala.Option[avias.opsworks.models.Source]]("AppSource"), o.get[scala.Option[scala.Boolean]]("EnableSsl"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[scala.List[java.lang.String]]]("Domains"), o.get[scala.Option[scala.List[avias.opsworks.models.EnvironmentVariable]]]("Environment")).mapN(avias.opsworks.models.CreateAppRequest.apply _)
  }
  final implicit val TemporaryCredentialDecoder: io.circe.Decoder[avias.opsworks.models.TemporaryCredential] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("Password"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.Int]]("ValidForInMinutes")).mapN(avias.opsworks.models.TemporaryCredential.apply _)
  }
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[avias.opsworks.models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.opsworks.models.UntagResourceRequest.apply _)
  }
  final implicit val UpdateInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[java.lang.String]]("AmiId"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("Hostname"), o.get[scala.Option[java.lang.String]]("Os"), o.get[scala.Option[java.lang.String]]("SshKeyName"), o.get[scala.Option[scala.Boolean]]("InstallUpdatesOnBoot"), o.get[scala.Option[scala.Boolean]]("EbsOptimized"), o.get[scala.Option[java.lang.String]]("AutoScalingType"), o.get[scala.Option[scala.List[java.lang.String]]]("LayerIds"), o.get[scala.Option[java.lang.String]]("Architecture")).mapN(avias.opsworks.models.UpdateInstanceRequest.apply _)
  }
  final implicit val AgentVersionDecoder: io.circe.Decoder[avias.opsworks.models.AgentVersion] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[avias.opsworks.models.StackConfigurationManager]]("ConfigurationManager")).mapN(avias.opsworks.models.AgentVersion.apply _)
  }
  final implicit val DescribeVolumesRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeVolumesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("RaidArrayId"), o.get[scala.Option[scala.List[java.lang.String]]]("VolumeIds")).mapN(avias.opsworks.models.DescribeVolumesRequest.apply _)
  }
  final implicit val DescribeLoadBasedAutoScalingRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeLoadBasedAutoScalingRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("LayerIds").map(avias.opsworks.models.DescribeLoadBasedAutoScalingRequest.apply _)
  }
  final implicit val ElasticLoadBalancerDecoder: io.circe.Decoder[avias.opsworks.models.ElasticLoadBalancer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("DnsName"), o.get[scala.Option[java.lang.String]]("LayerId"), o.get[scala.Option[java.lang.String]]("Region"), o.get[scala.Option[java.lang.String]]("ElasticLoadBalancerName"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[scala.List[java.lang.String]]]("Ec2InstanceIds")).mapN(avias.opsworks.models.ElasticLoadBalancer.apply _)
  }
  final implicit val BlockDeviceMappingDecoder: io.circe.Decoder[avias.opsworks.models.BlockDeviceMapping] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeviceName"), o.get[scala.Option[java.lang.String]]("NoDevice"), o.get[scala.Option[java.lang.String]]("VirtualName"), o.get[scala.Option[avias.opsworks.models.EbsBlockDevice]]("Ebs")).mapN(avias.opsworks.models.BlockDeviceMapping.apply _)
  }
  final implicit val UpdateMyUserProfileRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateMyUserProfileRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SshPublicKey").map(avias.opsworks.models.UpdateMyUserProfileRequest.apply _)
  }
  final implicit val RaidArrayDecoder: io.circe.Decoder[avias.opsworks.models.RaidArray] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Device"), o.get[scala.Option[java.lang.String]]("RaidArrayId"), o.get[scala.Option[java.lang.String]]("MountPoint"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.Int]]("RaidLevel"), o.get[scala.Option[scala.Int]]("NumberOfDisks"), o.get[scala.Option[scala.Int]]("Size"), o.get[scala.Option[scala.Int]]("Iops"), o.get[scala.Option[java.lang.String]]("CreatedAt")).mapN(avias.opsworks.models.RaidArray.apply _)
  }
  final implicit val RdsDbInstanceDecoder: io.circe.Decoder[avias.opsworks.models.RdsDbInstance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DbPassword"), o.get[scala.Option[java.lang.String]]("DbUser"), o.get[scala.Option[java.lang.String]]("Engine"), o.get[scala.Option[java.lang.String]]("DbInstanceIdentifier"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("Region"), o.get[scala.Option[java.lang.String]]("Address"), o.get[scala.Option[java.lang.String]]("RdsDbInstanceArn"), o.get[scala.Option[scala.Boolean]]("MissingOnRds")).mapN(avias.opsworks.models.RdsDbInstance.apply _)
  }
  final implicit val DescribeElasticIpsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeElasticIpsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[scala.List[java.lang.String]]]("Ips")).mapN(avias.opsworks.models.DescribeElasticIpsRequest.apply _)
  }
  final implicit val PermissionDecoder: io.circe.Decoder[avias.opsworks.models.Permission] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("IamUserArn"), o.get[scala.Option[java.lang.String]]("Level"), o.get[scala.Option[scala.Boolean]]("AllowSsh"), o.get[scala.Option[scala.Boolean]]("AllowSudo")).mapN(avias.opsworks.models.Permission.apply _)
  }
  final implicit val DescribeDeploymentsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeDeploymentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("AppId"), o.get[scala.Option[scala.List[java.lang.String]]]("DeploymentIds")).mapN(avias.opsworks.models.DescribeDeploymentsRequest.apply _)
  }
  final implicit val CommandDecoder: io.circe.Decoder[avias.opsworks.models.Command] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("LogUrl"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("CommandId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("DeploymentId"), o.get[scala.Option[java.lang.String]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("AcknowledgedAt"), o.get[scala.Option[java.lang.String]]("CompletedAt"), o.get[scala.Option[scala.Int]]("ExitCode")).mapN(avias.opsworks.models.Command.apply _)
  }
  final implicit val RegisterEcsClusterRequestDecoder: io.circe.Decoder[avias.opsworks.models.RegisterEcsClusterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EcsClusterArn"), o.get[java.lang.String]("StackId")).mapN(avias.opsworks.models.RegisterEcsClusterRequest.apply _)
  }
  final implicit val CreateStackRequestDecoder: io.circe.Decoder[avias.opsworks.models.CreateStackRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("DefaultInstanceProfileArn"), o.get[java.lang.String]("ServiceRoleArn"), o.get[java.lang.String]("Region"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[java.lang.String]]("DefaultOs"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("HostnameTheme"), o.get[scala.Option[java.lang.String]]("DefaultSshKeyName"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[java.lang.String]]("DefaultSubnetId"), o.get[scala.Option[java.lang.String]]("DefaultAvailabilityZone"), o.get[scala.Option[avias.opsworks.models.Source]]("CustomCookbooksSource"), o.get[scala.Option[avias.opsworks.models.ChefConfiguration]]("ChefConfiguration"), o.get[scala.Option[avias.opsworks.models.StackConfigurationManager]]("ConfigurationManager"), o.get[scala.Option[scala.Boolean]]("UseCustomCookbooks"), o.get[scala.Option[scala.Boolean]]("UseOpsworksSecurityGroups"), o.get[scala.Option[java.lang.String]]("DefaultRootDeviceType")).mapN(avias.opsworks.models.CreateStackRequest.apply _)
  }
  final implicit val RecipesDecoder: io.circe.Decoder[avias.opsworks.models.Recipes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Undeploy"), o.get[scala.Option[scala.List[java.lang.String]]]("Deploy"), o.get[scala.Option[scala.List[java.lang.String]]]("Configure"), o.get[scala.Option[scala.List[java.lang.String]]]("Setup"), o.get[scala.Option[scala.List[java.lang.String]]]("Shutdown")).mapN(avias.opsworks.models.Recipes.apply _)
  }
  final implicit val DescribeUserProfilesResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeUserProfilesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.UserProfile]]]("UserProfiles").map(avias.opsworks.models.DescribeUserProfilesResult.apply _)
  }
  final implicit val GrantAccessResultDecoder: io.circe.Decoder[avias.opsworks.models.GrantAccessResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworks.models.TemporaryCredential]]("TemporaryCredential").map(avias.opsworks.models.GrantAccessResult.apply _)
  }
  final implicit val UpdateElasticIpRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateElasticIpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ElasticIp"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.opsworks.models.UpdateElasticIpRequest.apply _)
  }
  final implicit val DescribeVolumesResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeVolumesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Volume]]]("Volumes").map(avias.opsworks.models.DescribeVolumesResult.apply _)
  }
  final implicit val VolumeDecoder: io.circe.Decoder[avias.opsworks.models.Volume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Device"), o.get[scala.Option[java.lang.String]]("RaidArrayId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Ec2VolumeId"), o.get[scala.Option[java.lang.String]]("MountPoint"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("Region"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[scala.Int]]("Size"), o.get[scala.Option[scala.Int]]("Iops")).mapN(avias.opsworks.models.Volume.apply _)
  }
  final implicit val EnvironmentVariableDecoder: io.circe.Decoder[avias.opsworks.models.EnvironmentVariable] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value"), o.get[scala.Option[scala.Boolean]]("Secure")).mapN(avias.opsworks.models.EnvironmentVariable.apply _)
  }
  final implicit val StackDecoder: io.circe.Decoder[avias.opsworks.models.Stack] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[java.lang.String]]("DefaultOs"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("DefaultInstanceProfileArn"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("HostnameTheme"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("DefaultSshKeyName"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[java.lang.String]]("DefaultSubnetId"), o.get[scala.Option[java.lang.String]]("Region"), o.get[scala.Option[java.lang.String]]("DefaultAvailabilityZone"), o.get[scala.Option[avias.opsworks.models.Source]]("CustomCookbooksSource"), o.get[scala.Option[avias.opsworks.models.ChefConfiguration]]("ChefConfiguration"), o.get[scala.Option[avias.opsworks.models.StackConfigurationManager]]("ConfigurationManager"), o.get[scala.Option[java.lang.String]]("CreatedAt"), o.get[scala.Option[scala.Boolean]]("UseCustomCookbooks"), o.get[scala.Option[scala.Boolean]]("UseOpsworksSecurityGroups"), o.get[scala.Option[java.lang.String]]("DefaultRootDeviceType")).mapN(avias.opsworks.models.Stack.apply _)
  }
  final implicit val CreateLayerRequestDecoder: io.circe.Decoder[avias.opsworks.models.CreateLayerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("StackId"), o.get[java.lang.String]("Shortname"), o.get[java.lang.String]("Type"), o.get[scala.Option[java.lang.String]]("CustomInstanceProfileArn"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[avias.opsworks.models.CloudWatchLogsConfiguration]]("CloudWatchLogsConfiguration"), o.get[scala.Option[avias.opsworks.models.Recipes]]("CustomRecipes"), o.get[scala.Option[scala.List[avias.opsworks.models.VolumeConfiguration]]]("VolumeConfigurations"), o.get[scala.Option[scala.Boolean]]("UseEbsOptimizedInstances"), o.get[scala.Option[scala.Boolean]]("InstallUpdatesOnBoot"), o.get[scala.Option[scala.Boolean]]("EnableAutoHealing"), o.get[scala.Option[scala.Boolean]]("AutoAssignElasticIps"), o.get[scala.Option[scala.Boolean]]("AutoAssignPublicIps"), o.get[scala.Option[avias.opsworks.models.LifecycleEventConfiguration]]("LifecycleEventConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("CustomSecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("Packages"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes")).mapN(avias.opsworks.models.CreateLayerRequest.apply _)
  }
  final implicit val AssignInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.AssignInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.List[java.lang.String]]("LayerIds")).mapN(avias.opsworks.models.AssignInstanceRequest.apply _)
  }
  final implicit val StackSummaryDecoder: io.circe.Decoder[avias.opsworks.models.StackSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[scala.Int]]("LayersCount"), o.get[scala.Option[scala.Int]]("AppsCount"), o.get[scala.Option[avias.opsworks.models.InstancesCount]]("InstancesCount")).mapN(avias.opsworks.models.StackSummary.apply _)
  }
  final implicit val DescribeElasticLoadBalancersRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeElasticLoadBalancersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[scala.List[java.lang.String]]]("LayerIds")).mapN(avias.opsworks.models.DescribeElasticLoadBalancersRequest.apply _)
  }
  final implicit val UpdateUserProfileRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateUserProfileRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IamUserArn"), o.get[scala.Option[java.lang.String]]("SshUsername"), o.get[scala.Option[java.lang.String]]("SshPublicKey"), o.get[scala.Option[scala.Boolean]]("AllowSelfManagement")).mapN(avias.opsworks.models.UpdateUserProfileRequest.apply _)
  }
  final implicit val StartInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.StartInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("InstanceId").map(avias.opsworks.models.StartInstanceRequest.apply _)
  }
  final implicit val DeregisterInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeregisterInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("InstanceId").map(avias.opsworks.models.DeregisterInstanceRequest.apply _)
  }
  final implicit val DescribePermissionsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribePermissionsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Permission]]]("Permissions").map(avias.opsworks.models.DescribePermissionsResult.apply _)
  }
  final implicit val GetHostnameSuggestionResultDecoder: io.circe.Decoder[avias.opsworks.models.GetHostnameSuggestionResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("LayerId"), o.get[scala.Option[java.lang.String]]("Hostname")).mapN(avias.opsworks.models.GetHostnameSuggestionResult.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.opsworks.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.opsworks.models.ResourceNotFoundException.apply _)
  }
  final implicit val DeploymentCommandDecoder: io.circe.Decoder[avias.opsworks.models.DeploymentCommand] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Args")).mapN(avias.opsworks.models.DeploymentCommand.apply _)
  }
  final implicit val CreateLayerResultDecoder: io.circe.Decoder[avias.opsworks.models.CreateLayerResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("LayerId").map(avias.opsworks.models.CreateLayerResult.apply _)
  }
  final implicit val DescribeTimeBasedAutoScalingResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeTimeBasedAutoScalingResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.TimeBasedAutoScalingConfiguration]]]("TimeBasedAutoScalingConfigurations").map(avias.opsworks.models.DescribeTimeBasedAutoScalingResult.apply _)
  }
  final implicit val DescribeServiceErrorsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeServiceErrorsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.List[java.lang.String]]]("ServiceErrorIds")).mapN(avias.opsworks.models.DescribeServiceErrorsRequest.apply _)
  }
  final implicit val CreateUserProfileRequestDecoder: io.circe.Decoder[avias.opsworks.models.CreateUserProfileRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IamUserArn"), o.get[scala.Option[java.lang.String]]("SshUsername"), o.get[scala.Option[java.lang.String]]("SshPublicKey"), o.get[scala.Option[scala.Boolean]]("AllowSelfManagement")).mapN(avias.opsworks.models.CreateUserProfileRequest.apply _)
  }
  final implicit val StartStackRequestDecoder: io.circe.Decoder[avias.opsworks.models.StartStackRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StackId").map(avias.opsworks.models.StartStackRequest.apply _)
  }
  final implicit val DescribePermissionsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribePermissionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IamUserArn"), o.get[scala.Option[java.lang.String]]("StackId")).mapN(avias.opsworks.models.DescribePermissionsRequest.apply _)
  }
  final implicit val DescribeStackProvisioningParametersResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeStackProvisioningParametersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AgentInstallerUrl"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Parameters")).mapN(avias.opsworks.models.DescribeStackProvisioningParametersResult.apply _)
  }
  final implicit val DescribeAppsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeAppsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.App]]]("Apps").map(avias.opsworks.models.DescribeAppsResult.apply _)
  }
  final implicit val UnassignInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.UnassignInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("InstanceId").map(avias.opsworks.models.UnassignInstanceRequest.apply _)
  }
  final implicit val UserProfileDecoder: io.circe.Decoder[avias.opsworks.models.UserProfile] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IamUserArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SshUsername"), o.get[scala.Option[java.lang.String]]("SshPublicKey"), o.get[scala.Option[scala.Boolean]]("AllowSelfManagement")).mapN(avias.opsworks.models.UserProfile.apply _)
  }
  final implicit val TimeBasedAutoScalingConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.TimeBasedAutoScalingConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[avias.opsworks.models.WeeklyAutoScalingSchedule]]("AutoScalingSchedule")).mapN(avias.opsworks.models.TimeBasedAutoScalingConfiguration.apply _)
  }
  final implicit val UpdateStackRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateStackRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[java.lang.String]]("DefaultOs"), o.get[scala.Option[java.lang.String]]("DefaultInstanceProfileArn"), o.get[scala.Option[java.lang.String]]("HostnameTheme"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("DefaultSshKeyName"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[java.lang.String]]("DefaultSubnetId"), o.get[scala.Option[java.lang.String]]("DefaultAvailabilityZone"), o.get[scala.Option[avias.opsworks.models.Source]]("CustomCookbooksSource"), o.get[scala.Option[avias.opsworks.models.ChefConfiguration]]("ChefConfiguration"), o.get[scala.Option[avias.opsworks.models.StackConfigurationManager]]("ConfigurationManager"), o.get[scala.Option[scala.Boolean]]("UseCustomCookbooks"), o.get[scala.Option[scala.Boolean]]("UseOpsworksSecurityGroups"), o.get[scala.Option[java.lang.String]]("DefaultRootDeviceType")).mapN(avias.opsworks.models.UpdateStackRequest.apply _)
  }
  final implicit val UpdateAppRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateAppRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AppId"), o.get[scala.Option[scala.List[avias.opsworks.models.DataSource]]]("DataSources"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[avias.opsworks.models.SslConfiguration]]("SslConfiguration"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[avias.opsworks.models.Source]]("AppSource"), o.get[scala.Option[scala.Boolean]]("EnableSsl"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes"), o.get[scala.Option[scala.List[java.lang.String]]]("Domains"), o.get[scala.Option[scala.List[avias.opsworks.models.EnvironmentVariable]]]("Environment")).mapN(avias.opsworks.models.UpdateAppRequest.apply _)
  }
  final implicit val DescribeCommandsRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeCommandsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeploymentId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.List[java.lang.String]]]("CommandIds")).mapN(avias.opsworks.models.DescribeCommandsRequest.apply _)
  }
  final implicit val RegisterEcsClusterResultDecoder: io.circe.Decoder[avias.opsworks.models.RegisterEcsClusterResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("EcsClusterArn").map(avias.opsworks.models.RegisterEcsClusterResult.apply _)
  }
  final implicit val DisassociateElasticIpRequestDecoder: io.circe.Decoder[avias.opsworks.models.DisassociateElasticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ElasticIp").map(avias.opsworks.models.DisassociateElasticIpRequest.apply _)
  }
  final implicit val RegisterVolumeRequestDecoder: io.circe.Decoder[avias.opsworks.models.RegisterVolumeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[scala.Option[java.lang.String]]("Ec2VolumeId")).mapN(avias.opsworks.models.RegisterVolumeRequest.apply _)
  }
  final implicit val CreateStackResultDecoder: io.circe.Decoder[avias.opsworks.models.CreateStackResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("StackId").map(avias.opsworks.models.CreateStackResult.apply _)
  }
  final implicit val DescribeStacksResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeStacksResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Stack]]]("Stacks").map(avias.opsworks.models.DescribeStacksResult.apply _)
  }
  final implicit val CreateInstanceRequestDecoder: io.circe.Decoder[avias.opsworks.models.CreateInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackId"), o.get[java.lang.String]("InstanceType"), o.get[scala.List[java.lang.String]]("LayerIds"), o.get[scala.Option[scala.List[avias.opsworks.models.BlockDeviceMapping]]]("BlockDeviceMappings"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("AmiId"), o.get[scala.Option[java.lang.String]]("Tenancy"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("Hostname"), o.get[scala.Option[java.lang.String]]("Os"), o.get[scala.Option[java.lang.String]]("SshKeyName"), o.get[scala.Option[java.lang.String]]("VirtualizationType"), o.get[scala.Option[scala.Boolean]]("InstallUpdatesOnBoot"), o.get[scala.Option[scala.Boolean]]("EbsOptimized"), o.get[scala.Option[java.lang.String]]("RootDeviceType"), o.get[scala.Option[java.lang.String]]("AutoScalingType"), o.get[scala.Option[java.lang.String]]("Architecture")).mapN(avias.opsworks.models.CreateInstanceRequest.apply _)
  }
  final implicit val DescribeLoadBasedAutoScalingResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeLoadBasedAutoScalingResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.LoadBasedAutoScalingConfiguration]]]("LoadBasedAutoScalingConfigurations").map(avias.opsworks.models.DescribeLoadBasedAutoScalingResult.apply _)
  }
  final implicit val CreateInstanceResultDecoder: io.circe.Decoder[avias.opsworks.models.CreateInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("InstanceId").map(avias.opsworks.models.CreateInstanceResult.apply _)
  }
  final implicit val DescribeMyUserProfileResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeMyUserProfileResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworks.models.SelfUserProfile]]("UserProfile").map(avias.opsworks.models.DescribeMyUserProfileResult.apply _)
  }
  final implicit val DescribeInstancesRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("LayerId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceIds")).mapN(avias.opsworks.models.DescribeInstancesRequest.apply _)
  }
  final implicit val DeleteUserProfileRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeleteUserProfileRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IamUserArn").map(avias.opsworks.models.DeleteUserProfileRequest.apply _)
  }
  final implicit val WeeklyAutoScalingScheduleDecoder: io.circe.Decoder[avias.opsworks.models.WeeklyAutoScalingSchedule] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Wednesday"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Sunday"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Saturday"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Tuesday"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Monday"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Friday"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Thursday")).mapN(avias.opsworks.models.WeeklyAutoScalingSchedule.apply _)
  }
  final implicit val CloudWatchLogsLogStreamDecoder: io.circe.Decoder[avias.opsworks.models.CloudWatchLogsLogStream] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DatetimeFormat"), o.get[scala.Option[java.lang.String]]("FileFingerprintLines"), o.get[scala.Option[java.lang.String]]("LogGroupName"), o.get[scala.Option[java.lang.String]]("MultiLineStartPattern"), o.get[scala.Option[java.lang.String]]("File"), o.get[scala.Option[java.lang.String]]("InitialPosition"), o.get[scala.Option[java.lang.String]]("Encoding"), o.get[scala.Option[java.lang.String]]("TimeZone"), o.get[scala.Option[scala.Int]]("BufferDuration"), o.get[scala.Option[scala.Int]]("BatchCount"), o.get[scala.Option[scala.Int]]("BatchSize")).mapN(avias.opsworks.models.CloudWatchLogsLogStream.apply _)
  }
  final implicit val DescribeElasticIpsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeElasticIpsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.ElasticIp]]]("ElasticIps").map(avias.opsworks.models.DescribeElasticIpsResult.apply _)
  }
  final implicit val GetHostnameSuggestionRequestDecoder: io.circe.Decoder[avias.opsworks.models.GetHostnameSuggestionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("LayerId").map(avias.opsworks.models.GetHostnameSuggestionRequest.apply _)
  }
  final implicit val LoadBasedAutoScalingConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.LoadBasedAutoScalingConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("LayerId"), o.get[scala.Option[scala.Boolean]]("Enable"), o.get[scala.Option[avias.opsworks.models.AutoScalingThresholds]]("UpScaling"), o.get[scala.Option[avias.opsworks.models.AutoScalingThresholds]]("DownScaling")).mapN(avias.opsworks.models.LoadBasedAutoScalingConfiguration.apply _)
  }
  final implicit val DescribeCommandsResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeCommandsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.Command]]]("Commands").map(avias.opsworks.models.DescribeCommandsResult.apply _)
  }
  final implicit val LifecycleEventConfigurationDecoder: io.circe.Decoder[avias.opsworks.models.LifecycleEventConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworks.models.ShutdownEventConfiguration]]("Shutdown").map(avias.opsworks.models.LifecycleEventConfiguration.apply _)
  }
  final implicit val DescribeStackSummaryRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeStackSummaryRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StackId").map(avias.opsworks.models.DescribeStackSummaryRequest.apply _)
  }
  final implicit val DeleteStackRequestDecoder: io.circe.Decoder[avias.opsworks.models.DeleteStackRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StackId").map(avias.opsworks.models.DeleteStackRequest.apply _)
  }
  final implicit val AttachElasticLoadBalancerRequestDecoder: io.circe.Decoder[avias.opsworks.models.AttachElasticLoadBalancerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ElasticLoadBalancerName"), o.get[java.lang.String]("LayerId")).mapN(avias.opsworks.models.AttachElasticLoadBalancerRequest.apply _)
  }
  final implicit val DescribeEcsClustersRequestDecoder: io.circe.Decoder[avias.opsworks.models.DescribeEcsClustersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("EcsClusterArns"), o.get[scala.Option[java.lang.String]]("StackId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.opsworks.models.DescribeEcsClustersRequest.apply _)
  }
  final implicit val UpdateLayerRequestDecoder: io.circe.Decoder[avias.opsworks.models.UpdateLayerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("LayerId"), o.get[scala.Option[java.lang.String]]("Shortname"), o.get[scala.Option[java.lang.String]]("CustomInstanceProfileArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CustomJson"), o.get[scala.Option[avias.opsworks.models.CloudWatchLogsConfiguration]]("CloudWatchLogsConfiguration"), o.get[scala.Option[avias.opsworks.models.Recipes]]("CustomRecipes"), o.get[scala.Option[scala.List[avias.opsworks.models.VolumeConfiguration]]]("VolumeConfigurations"), o.get[scala.Option[scala.Boolean]]("UseEbsOptimizedInstances"), o.get[scala.Option[scala.Boolean]]("InstallUpdatesOnBoot"), o.get[scala.Option[scala.Boolean]]("EnableAutoHealing"), o.get[scala.Option[scala.Boolean]]("AutoAssignElasticIps"), o.get[scala.Option[scala.Boolean]]("AutoAssignPublicIps"), o.get[scala.Option[avias.opsworks.models.LifecycleEventConfiguration]]("LifecycleEventConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("CustomSecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("Packages"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Attributes")).mapN(avias.opsworks.models.UpdateLayerRequest.apply _)
  }
  final implicit val CloneStackResultDecoder: io.circe.Decoder[avias.opsworks.models.CloneStackResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("StackId").map(avias.opsworks.models.CloneStackResult.apply _)
  }
  final implicit val ElasticIpDecoder: io.circe.Decoder[avias.opsworks.models.ElasticIp] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Domain"), o.get[scala.Option[java.lang.String]]("Ip"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Region"), o.get[scala.Option[java.lang.String]]("InstanceId")).mapN(avias.opsworks.models.ElasticIp.apply _)
  }
  final implicit val CreateAppResultDecoder: io.circe.Decoder[avias.opsworks.models.CreateAppResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("AppId").map(avias.opsworks.models.CreateAppResult.apply _)
  }
  final implicit val DescribeRaidArraysResultDecoder: io.circe.Decoder[avias.opsworks.models.DescribeRaidArraysResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworks.models.RaidArray]]]("RaidArrays").map(avias.opsworks.models.DescribeRaidArraysResult.apply _)
  }
}