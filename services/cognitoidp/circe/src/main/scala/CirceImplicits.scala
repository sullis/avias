package org.lyranthe.araethura.cognitoidp
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val InvalidSmsRoleTrustRelationshipExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidSmsRoleTrustRelationshipException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteUserPoolRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val AdminLinkProviderForUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminLinkProviderForUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val VerifyUserAttributeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.VerifyUserAttributeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "AttributeName" -> o.attributeName.asJson, "Code" -> o.code.asJson)
  }
  final implicit val NumberAttributeConstraintsTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.NumberAttributeConstraintsType] = io.circe.Encoder.instance { o => 
    Json.obj("MinValue" -> o.minValue.asJson, "MaxValue" -> o.maxValue.asJson)
  }
  final implicit val GetUICustomizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetUICustomizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UICustomization" -> o.uicustomization.asJson)
  }
  final implicit val AdminEnableUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminEnableUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val ListResourceServersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListResourceServersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServers" -> o.resourceServers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidEmailRoleAccessPolicyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidEmailRoleAccessPolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeUserPoolDomainResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DomainDescription" -> o.domainDescription.asJson)
  }
  final implicit val AdminListGroupsForUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminListGroupsForUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Groups" -> o.groups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateIdentityProviderResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateIdentityProviderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val AdminGetDeviceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminGetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val CreateUserPoolClientRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientName" -> o.clientName.asJson, "UserPoolId" -> o.userPoolId.asJson, "GenerateSecret" -> o.generateSecret.asJson, "CallbackURLs" -> o.callbackURLs.asJson, "RefreshTokenValidity" -> o.refreshTokenValidity.asJson, "AllowedOAuthFlows" -> o.allowedOAuthFlows.asJson, "ReadAttributes" -> o.readAttributes.asJson, "WriteAttributes" -> o.writeAttributes.asJson, "LogoutURLs" -> o.logoutURLs.asJson, "ExplicitAuthFlows" -> o.explicitAuthFlows.asJson, "AllowedOAuthScopes" -> o.allowedOAuthScopes.asJson, "AllowedOAuthFlowsUserPoolClient" -> o.allowedOAuthFlowsUserPoolClient.asJson, "DefaultRedirectURI" -> o.defaultRedirectURI.asJson, "SupportedIdentityProviders" -> o.supportedIdentityProviders.asJson)
  }
  final implicit val AliasExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AliasExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateResourceServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateResourceServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServer" -> o.resourceServer.asJson)
  }
  final implicit val UserPoolClientDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserPoolClientDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "UserPoolId" -> o.userPoolId.asJson, "ClientName" -> o.clientName.asJson)
  }
  final implicit val UpdateUserPoolRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "EmailVerificationMessage" -> o.emailVerificationMessage.asJson, "AdminCreateUserConfig" -> o.adminCreateUserConfig.asJson, "SmsConfiguration" -> o.smsConfiguration.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "UserPoolTags" -> o.userPoolTags.asJson, "EmailVerificationSubject" -> o.emailVerificationSubject.asJson, "DeviceConfiguration" -> o.deviceConfiguration.asJson, "AutoVerifiedAttributes" -> o.autoVerifiedAttributes.asJson, "EmailConfiguration" -> o.emailConfiguration.asJson, "SmsVerificationMessage" -> o.smsVerificationMessage.asJson, "SmsAuthenticationMessage" -> o.smsAuthenticationMessage.asJson, "VerificationMessageTemplate" -> o.verificationMessageTemplate.asJson, "MfaConfiguration" -> o.mfaConfiguration.asJson, "Policies" -> o.policies.asJson)
  }
  final implicit val ListUserPoolsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UserImportJobTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserImportJobType] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDate" -> o.creationDate.asJson, "StartDate" -> o.startDate.asJson, "CompletionDate" -> o.completionDate.asJson, "PreSignedUrl" -> o.preSignedUrl.asJson, "Status" -> o.status.asJson, "JobName" -> o.jobName.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "ImportedUsers" -> o.importedUsers.asJson, "SkippedUsers" -> o.skippedUsers.asJson, "FailedUsers" -> o.failedUsers.asJson, "UserPoolId" -> o.userPoolId.asJson, "CompletionMessage" -> o.completionMessage.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val GetDeviceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetDeviceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson)
  }
  final implicit val PasswordPolicyTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.PasswordPolicyType] = io.circe.Encoder.instance { o => 
    Json.obj("MinimumLength" -> o.minimumLength.asJson, "RequireUppercase" -> o.requireUppercase.asJson, "RequireLowercase" -> o.requireLowercase.asJson, "RequireNumbers" -> o.requireNumbers.asJson, "RequireSymbols" -> o.requireSymbols.asJson)
  }
  final implicit val UserPoolClientTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserPoolClientType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "CallbackURLs" -> o.callbackURLs.asJson, "RefreshTokenValidity" -> o.refreshTokenValidity.asJson, "ClientId" -> o.clientId.asJson, "ClientSecret" -> o.clientSecret.asJson, "ClientName" -> o.clientName.asJson, "AllowedOAuthFlows" -> o.allowedOAuthFlows.asJson, "ReadAttributes" -> o.readAttributes.asJson, "WriteAttributes" -> o.writeAttributes.asJson, "LogoutURLs" -> o.logoutURLs.asJson, "ExplicitAuthFlows" -> o.explicitAuthFlows.asJson, "AllowedOAuthScopes" -> o.allowedOAuthScopes.asJson, "UserPoolId" -> o.userPoolId.asJson, "AllowedOAuthFlowsUserPoolClient" -> o.allowedOAuthFlowsUserPoolClient.asJson, "DefaultRedirectURI" -> o.defaultRedirectURI.asJson, "SupportedIdentityProviders" -> o.supportedIdentityProviders.asJson)
  }
  final implicit val DeviceSecretVerifierConfigTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeviceSecretVerifierConfigType] = io.circe.Encoder.instance { o => 
    Json.obj("PasswordVerifier" -> o.passwordVerifier.asJson, "Salt" -> o.salt.asJson)
  }
  final implicit val UICustomizationTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UICustomizationType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "CSS" -> o.css.asJson, "ImageUrl" -> o.imageUrl.asJson, "ClientId" -> o.clientId.asJson, "CSSVersion" -> o.cssversion.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val AdminCreateUserConfigTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserConfigType] = io.circe.Encoder.instance { o => 
    Json.obj("AllowAdminCreateUserOnly" -> o.allowAdminCreateUserOnly.asJson, "UnusedAccountValidityDays" -> o.unusedAccountValidityDays.asJson, "InviteMessageTemplate" -> o.inviteMessageTemplate.asJson)
  }
  final implicit val InvalidPasswordExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidPasswordException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDeviceStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateDeviceStatusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson, "Description" -> o.description.asJson, "Precedence" -> o.precedence.asJson, "RoleArn" -> o.roleArn.asJson)
  }
  final implicit val GetUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson)
  }
  final implicit val TooManyFailedAttemptsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.TooManyFailedAttemptsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SmsConfigurationTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SmsConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("SnsCallerArn" -> o.snsCallerArn.asJson, "ExternalId" -> o.externalId.asJson)
  }
  final implicit val StopUserImportJobRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.StopUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val GetUICustomizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetUICustomizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson)
  }
  final implicit val ForgetDeviceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ForgetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val DescribeUserImportJobResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val PasswordResetRequiredExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.PasswordResetRequiredException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ForgotPasswordResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ForgotPasswordResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val VerifyUserAttributeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.VerifyUserAttributeResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListUserPoolClientsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolClientsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClients" -> o.userPoolClients.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UnexpectedLambdaExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UnexpectedLambdaException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PreconditionNotMetExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.PreconditionNotMetException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val AdminRemoveUserFromGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminRemoveUserFromGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "GroupName" -> o.groupName.asJson)
  }
  final implicit val ListUserImportJobsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUserImportJobsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val UpdateGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson, "Description" -> o.description.asJson, "Precedence" -> o.precedence.asJson, "RoleArn" -> o.roleArn.asJson)
  }
  final implicit val MessageTemplateTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.MessageTemplateType] = io.circe.Encoder.instance { o => 
    Json.obj("SMSMessage" -> o.smsmessage.asJson, "EmailMessage" -> o.emailMessage.asJson, "EmailSubject" -> o.emailSubject.asJson)
  }
  final implicit val UpdateGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Group" -> o.group.asJson)
  }
  final implicit val ListResourceServersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListResourceServersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConfirmDeviceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConfirmDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "DeviceKey" -> o.deviceKey.asJson, "DeviceSecretVerifierConfig" -> o.deviceSecretVerifierConfig.asJson, "DeviceName" -> o.deviceName.asJson)
  }
  final implicit val AdminDeleteUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val UserNotConfirmedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserNotConfirmedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AdminDisableProviderForUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableProviderForUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "User" -> o.user.asJson)
  }
  final implicit val AdminResetUserPasswordResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminResetUserPasswordResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ConfirmDeviceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConfirmDeviceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserConfirmationNecessary" -> o.userConfirmationNecessary.asJson)
  }
  final implicit val ResourceServerTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ResourceServerType] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson, "Name" -> o.name.asJson, "Scopes" -> o.scopes.asJson)
  }
  final implicit val SchemaAttributeTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SchemaAttributeType] = io.circe.Encoder.instance { o => 
    Json.obj("NumberAttributeConstraints" -> o.numberAttributeConstraints.asJson, "StringAttributeConstraints" -> o.stringAttributeConstraints.asJson, "AttributeDataType" -> o.attributeDataType.asJson, "Name" -> o.name.asJson, "DeveloperOnlyAttribute" -> o.developerOnlyAttribute.asJson, "Mutable" -> o.mutable.asJson, "Required" -> o.required.asJson)
  }
  final implicit val CreateIdentityProviderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderType" -> o.providerType.asJson, "ProviderDetails" -> o.providerDetails.asJson, "ProviderName" -> o.providerName.asJson, "UserPoolId" -> o.userPoolId.asJson, "AttributeMapping" -> o.attributeMapping.asJson, "IdpIdentifiers" -> o.idpIdentifiers.asJson)
  }
  final implicit val LambdaConfigTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.LambdaConfigType] = io.circe.Encoder.instance { o => 
    Json.obj("DefineAuthChallenge" -> o.defineAuthChallenge.asJson, "VerifyAuthChallengeResponse" -> o.verifyAuthChallengeResponse.asJson, "PreSignUp" -> o.preSignUp.asJson, "PostConfirmation" -> o.postConfirmation.asJson, "PreAuthentication" -> o.preAuthentication.asJson, "CreateAuthChallenge" -> o.createAuthChallenge.asJson, "CustomMessage" -> o.customMessage.asJson, "PostAuthentication" -> o.postAuthentication.asJson)
  }
  final implicit val CreateUserPoolRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PoolName" -> o.poolName.asJson, "EmailVerificationMessage" -> o.emailVerificationMessage.asJson, "AdminCreateUserConfig" -> o.adminCreateUserConfig.asJson, "SmsConfiguration" -> o.smsConfiguration.asJson, "UsernameAttributes" -> o.usernameAttributes.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "UserPoolTags" -> o.userPoolTags.asJson, "AliasAttributes" -> o.aliasAttributes.asJson, "EmailVerificationSubject" -> o.emailVerificationSubject.asJson, "Schema" -> o.schema.asJson, "DeviceConfiguration" -> o.deviceConfiguration.asJson, "AutoVerifiedAttributes" -> o.autoVerifiedAttributes.asJson, "EmailConfiguration" -> o.emailConfiguration.asJson, "SmsVerificationMessage" -> o.smsVerificationMessage.asJson, "SmsAuthenticationMessage" -> o.smsAuthenticationMessage.asJson, "VerificationMessageTemplate" -> o.verificationMessageTemplate.asJson, "MfaConfiguration" -> o.mfaConfiguration.asJson, "Policies" -> o.policies.asJson)
  }
  final implicit val ConfirmSignUpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConfirmSignUpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "ClientId" -> o.clientId.asJson, "ConfirmationCode" -> o.confirmationCode.asJson, "ForceAliasCreation" -> o.forceAliasCreation.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val ExpiredCodeExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ExpiredCodeException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RespondToAuthChallengeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.RespondToAuthChallengeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeResponses" -> o.challengeResponses.asJson)
  }
  final implicit val InitiateAuthRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InitiateAuthRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AuthFlow" -> o.authFlow.asJson, "ClientId" -> o.clientId.asJson, "AuthParameters" -> o.authParameters.asJson, "ClientMetadata" -> o.clientMetadata.asJson)
  }
  final implicit val AdminCreateUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("User" -> o.user.asJson)
  }
  final implicit val AdminInitiateAuthRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminInitiateAuthRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AuthFlow" -> o.authFlow.asJson, "ClientId" -> o.clientId.asJson, "UserPoolId" -> o.userPoolId.asJson, "AuthParameters" -> o.authParameters.asJson, "ClientMetadata" -> o.clientMetadata.asJson)
  }
  final implicit val AdminForgetDeviceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminForgetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "DeviceKey" -> o.deviceKey.asJson)
  }
  final implicit val GetGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val ListGroupsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StringAttributeConstraintsTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.StringAttributeConstraintsType] = io.circe.Encoder.instance { o => 
    Json.obj("MinLength" -> o.minLength.asJson, "MaxLength" -> o.maxLength.asJson)
  }
  final implicit val AdminInitiateAuthResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminInitiateAuthResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdentityProviderByIdentifierResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetIdentityProviderByIdentifierResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val AdminUserGlobalSignOutResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminUserGlobalSignOutResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AdminConfirmSignUpResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminConfirmSignUpResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProviderUserIdentifierTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ProviderUserIdentifierType] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "ProviderAttributeName" -> o.providerAttributeName.asJson, "ProviderAttributeValue" -> o.providerAttributeValue.asJson)
  }
  final implicit val AdminDeleteUserAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "UserAttributeNames" -> o.userAttributeNames.asJson)
  }
  final implicit val AdminUpdateDeviceStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateDeviceStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "DeviceKey" -> o.deviceKey.asJson, "DeviceRememberedStatus" -> o.deviceRememberedStatus.asJson)
  }
  final implicit val AdminSetUserSettingsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminSetUserSettingsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SignUpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SignUpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "ClientId" -> o.clientId.asJson, "Password" -> o.password.asJson, "UserAttributes" -> o.userAttributes.asJson, "ValidationData" -> o.validationData.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val ListIdentityProvidersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListIdentityProvidersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Providers" -> o.providers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AdminUserGlobalSignOutRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminUserGlobalSignOutRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val AdminUpdateUserAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateUserAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Group" -> o.group.asJson)
  }
  final implicit val StartUserImportJobResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.StartUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val ConfirmForgotPasswordResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConfirmForgotPasswordResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListUsersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUsersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Users" -> o.users.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val UserPoolTaggingExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserPoolTaggingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ConfirmSignUpResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConfirmSignUpResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NewDeviceMetadataTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.NewDeviceMetadataType] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "DeviceGroupKey" -> o.deviceGroupKey.asJson)
  }
  final implicit val ConfirmForgotPasswordRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConfirmForgotPasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "ClientId" -> o.clientId.asJson, "Password" -> o.password.asJson, "ConfirmationCode" -> o.confirmationCode.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val CreateGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Group" -> o.group.asJson)
  }
  final implicit val UpdateResourceServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson, "Name" -> o.name.asJson, "Scopes" -> o.scopes.asJson)
  }
  final implicit val AdminResetUserPasswordRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminResetUserPasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val AdminListDevicesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminListDevicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "Limit" -> o.limit.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val ResendConfirmationCodeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ResendConfirmationCodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "Username" -> o.username.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val UpdateUserPoolResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SignUpResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SignUpResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserConfirmed" -> o.userConfirmed.asJson, "UserSub" -> o.userSub.asJson, "CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val AdminDeleteUserAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserAttributes" -> o.userAttributes.asJson, "MFAOptions" -> o.mfaoptions.asJson)
  }
  final implicit val AdminGetUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminGetUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserCreateDate" -> o.userCreateDate.asJson, "UserLastModifiedDate" -> o.userLastModifiedDate.asJson, "UserAttributes" -> o.userAttributes.asJson, "MFAOptions" -> o.mfaoptions.asJson, "UserStatus" -> o.userStatus.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val UserLambdaValidationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserLambdaValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateIdentityProviderResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateIdentityProviderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val GetUserAttributeVerificationCodeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetUserAttributeVerificationCodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val InvalidLambdaResponseExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidLambdaResponseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeviceConfigurationTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeviceConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeRequiredOnNewDevice" -> o.challengeRequiredOnNewDevice.asJson, "DeviceOnlyRememberedOnUserPrompt" -> o.deviceOnlyRememberedOnUserPrompt.asJson)
  }
  final implicit val AdminGetUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminGetUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val InitiateAuthResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InitiateAuthResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val DescribeResourceServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeResourceServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServer" -> o.resourceServer.asJson)
  }
  final implicit val DescribeUserPoolResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPool" -> o.userPool.asJson)
  }
  final implicit val AuthenticationResultTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "RefreshToken" -> o.refreshToken.asJson, "IdToken" -> o.idToken.asJson, "ExpiresIn" -> o.expiresIn.asJson, "TokenType" -> o.tokenType.asJson, "NewDeviceMetadata" -> o.newDeviceMetadata.asJson)
  }
  final implicit val DeleteResourceServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson)
  }
  final implicit val ForgotPasswordRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ForgotPasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "Username" -> o.username.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val AttributeTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AttributeType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val AdminSetUserSettingsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminSetUserSettingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "MFAOptions" -> o.mfaoptions.asJson)
  }
  final implicit val AdminCreateUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserPoolId" -> o.userPoolId.asJson, "ForceAliasCreation" -> o.forceAliasCreation.asJson, "UserAttributes" -> o.userAttributes.asJson, "ValidationData" -> o.validationData.asJson, "MessageAction" -> o.messageAction.asJson, "TemporaryPassword" -> o.temporaryPassword.asJson, "DesiredDeliveryMediums" -> o.desiredDeliveryMediums.asJson)
  }
  final implicit val ChangePasswordResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ChangePasswordResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeUserPoolRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val CodeDeliveryDetailsTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType] = io.circe.Encoder.instance { o => 
    Json.obj("Destination" -> o.destination.asJson, "DeliveryMedium" -> o.deliveryMedium.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val AdminDisableUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val CreateUserPoolClientResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClient" -> o.userPoolClient.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateUserPoolDomainResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AdminEnableUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminEnableUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SetUserSettingsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SetUserSettingsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AddCustomAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AddCustomAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DomainDescriptionTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DomainDescriptionType] = io.circe.Encoder.instance { o => 
    Json.obj("AWSAccountId" -> o.awsaccountId.asJson, "Domain" -> o.domain.asJson, "S3Bucket" -> o.s3Bucket.asJson, "Version" -> o.version.asJson, "CloudFrontDistribution" -> o.cloudFrontDistribution.asJson, "UserPoolId" -> o.userPoolId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val UpdateIdentityProviderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "UserPoolId" -> o.userPoolId.asJson, "AttributeMapping" -> o.attributeMapping.asJson, "ProviderDetails" -> o.providerDetails.asJson, "IdpIdentifiers" -> o.idpIdentifiers.asJson)
  }
  final implicit val AdminListDevicesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminListDevicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Devices" -> o.devices.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val RespondToAuthChallengeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.RespondToAuthChallengeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val UserPoolTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserPoolType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "EmailVerificationMessage" -> o.emailVerificationMessage.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "EstimatedNumberOfUsers" -> o.estimatedNumberOfUsers.asJson, "AdminCreateUserConfig" -> o.adminCreateUserConfig.asJson, "SmsConfiguration" -> o.smsConfiguration.asJson, "SmsConfigurationFailure" -> o.smsConfigurationFailure.asJson, "EmailConfigurationFailure" -> o.emailConfigurationFailure.asJson, "UsernameAttributes" -> o.usernameAttributes.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "UserPoolTags" -> o.userPoolTags.asJson, "AliasAttributes" -> o.aliasAttributes.asJson, "EmailVerificationSubject" -> o.emailVerificationSubject.asJson, "SchemaAttributes" -> o.schemaAttributes.asJson, "DeviceConfiguration" -> o.deviceConfiguration.asJson, "AutoVerifiedAttributes" -> o.autoVerifiedAttributes.asJson, "EmailConfiguration" -> o.emailConfiguration.asJson, "SmsVerificationMessage" -> o.smsVerificationMessage.asJson, "SmsAuthenticationMessage" -> o.smsAuthenticationMessage.asJson, "VerificationMessageTemplate" -> o.verificationMessageTemplate.asJson, "Id" -> o.id.asJson, "Status" -> o.status.asJson, "MfaConfiguration" -> o.mfaConfiguration.asJson, "Policies" -> o.policies.asJson)
  }
  final implicit val AdminConfirmSignUpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminConfirmSignUpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val GroupTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GroupType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "Description" -> o.description.asJson, "GroupName" -> o.groupName.asJson, "Precedence" -> o.precedence.asJson, "RoleArn" -> o.roleArn.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val UpdateUserPoolClientRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "UserPoolId" -> o.userPoolId.asJson, "CallbackURLs" -> o.callbackURLs.asJson, "RefreshTokenValidity" -> o.refreshTokenValidity.asJson, "ClientName" -> o.clientName.asJson, "AllowedOAuthFlows" -> o.allowedOAuthFlows.asJson, "ReadAttributes" -> o.readAttributes.asJson, "WriteAttributes" -> o.writeAttributes.asJson, "LogoutURLs" -> o.logoutURLs.asJson, "ExplicitAuthFlows" -> o.explicitAuthFlows.asJson, "AllowedOAuthScopes" -> o.allowedOAuthScopes.asJson, "AllowedOAuthFlowsUserPoolClient" -> o.allowedOAuthFlowsUserPoolClient.asJson, "DefaultRedirectURI" -> o.defaultRedirectURI.asJson, "SupportedIdentityProviders" -> o.supportedIdentityProviders.asJson)
  }
  final implicit val ListUsersInGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUsersInGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Users" -> o.users.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UserImportInProgressExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserImportInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeUserPoolClientResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClient" -> o.userPoolClient.asJson)
  }
  final implicit val CreateUserImportJobRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("JobName" -> o.jobName.asJson, "UserPoolId" -> o.userPoolId.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson)
  }
  final implicit val CreateUserPoolDomainRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val UpdateUserPoolClientResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClient" -> o.userPoolClient.asJson)
  }
  final implicit val CreateUserImportJobResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val ListUserPoolClientsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolClientsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateUserPoolResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPool" -> o.userPool.asJson)
  }
  final implicit val ListIdentityProvidersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListIdentityProvidersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UsernameExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UsernameExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeResourceServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson)
  }
  final implicit val ProviderDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ProviderDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "ProviderType" -> o.providerType.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson)
  }
  final implicit val ListUserImportJobsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUserImportJobsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJobs" -> o.userImportJobs.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val AdminLinkProviderForUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminLinkProviderForUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "DestinationUser" -> o.destinationUser.asJson, "SourceUser" -> o.sourceUser.asJson)
  }
  final implicit val DeleteUserAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteUserPoolClientRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson)
  }
  final implicit val AdminRespondToAuthChallengeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminRespondToAuthChallengeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val DeviceTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeviceType] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "DeviceAttributes" -> o.deviceAttributes.asJson, "DeviceCreateDate" -> o.deviceCreateDate.asJson, "DeviceLastModifiedDate" -> o.deviceLastModifiedDate.asJson, "DeviceLastAuthenticatedDate" -> o.deviceLastAuthenticatedDate.asJson)
  }
  final implicit val AdminDisableUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotAuthorizedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.NotAuthorizedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson)
  }
  final implicit val EmailConfigurationTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.EmailConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("SourceArn" -> o.sourceArn.asJson, "ReplyToEmailAddress" -> o.replyToEmailAddress.asJson)
  }
  final implicit val InvalidUserPoolConfigurationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidUserPoolConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListDevicesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListDevicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Devices" -> o.devices.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DuplicateProviderExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DuplicateProviderException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MFAOptionTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.MFAOptionType] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryMedium" -> o.deliveryMedium.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val GetCSVHeaderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetCSVHeaderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val InvalidSmsRoleAccessPolicyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidSmsRoleAccessPolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CodeDeliveryFailureExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryFailureException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeUserImportJobRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteUserAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserAttributeNames" -> o.userAttributeNames.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val SetUICustomizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SetUICustomizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UICustomization" -> o.uicustomization.asJson)
  }
  final implicit val GetDeviceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val IdentityProviderTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.IdentityProviderType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "ProviderName" -> o.providerName.asJson, "AttributeMapping" -> o.attributeMapping.asJson, "ProviderType" -> o.providerType.asJson, "ProviderDetails" -> o.providerDetails.asJson, "UserPoolId" -> o.userPoolId.asJson, "IdpIdentifiers" -> o.idpIdentifiers.asJson)
  }
  final implicit val UserPoolDescriptionTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserPoolDescriptionType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "Id" -> o.id.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ListUsersInGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUsersInGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "GroupName" -> o.groupName.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteUserPoolDomainRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val UpdateUserAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetailsList" -> o.codeDeliveryDetailsList.asJson)
  }
  final implicit val ListGroupsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Groups" -> o.groups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MFAMethodNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.MFAMethodNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SetUserSettingsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SetUserSettingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "MFAOptions" -> o.mfaoptions.asJson)
  }
  final implicit val ListUserPoolsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPools" -> o.userPools.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeIdentityProviderResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeIdentityProviderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val ListUsersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListUsersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Limit" -> o.limit.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "Filter" -> o.filter.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val SetUICustomizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.SetUICustomizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson, "CSS" -> o.css.asJson, "ImageFile" -> o.imageFile.asJson)
  }
  final implicit val VerificationMessageTemplateTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.VerificationMessageTemplateType] = io.circe.Encoder.instance { o => 
    Json.obj("EmailMessage" -> o.emailMessage.asJson, "EmailSubjectByLink" -> o.emailSubjectByLink.asJson, "EmailSubject" -> o.emailSubject.asJson, "DefaultEmailOption" -> o.defaultEmailOption.asJson, "EmailMessageByLink" -> o.emailMessageByLink.asJson, "SmsMessage" -> o.smsMessage.asJson)
  }
  final implicit val DeleteUserPoolDomainResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UserNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateResourceServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson, "Name" -> o.name.asJson, "Scopes" -> o.scopes.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDeviceStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateDeviceStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "DeviceKey" -> o.deviceKey.asJson, "DeviceRememberedStatus" -> o.deviceRememberedStatus.asJson)
  }
  final implicit val DescribeUserPoolClientRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson)
  }
  final implicit val ChangePasswordRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ChangePasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PreviousPassword" -> o.previousPassword.asJson, "ProposedPassword" -> o.proposedPassword.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val GlobalSignOutRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GlobalSignOutRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson)
  }
  final implicit val UpdateUserAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserAttributes" -> o.userAttributes.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val DescribeIdentityProviderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ProviderName" -> o.providerName.asJson)
  }
  final implicit val ScopeDoesNotExistExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ScopeDoesNotExistException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteIdentityProviderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DeleteIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ProviderName" -> o.providerName.asJson)
  }
  final implicit val UserTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserType] = io.circe.Encoder.instance { o => 
    Json.obj("UserCreateDate" -> o.userCreateDate.asJson, "UserLastModifiedDate" -> o.userLastModifiedDate.asJson, "Username" -> o.username.asJson, "Attributes" -> o.attributes.asJson, "MFAOptions" -> o.mfaoptions.asJson, "UserStatus" -> o.userStatus.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val CodeMismatchExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CodeMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResourceServerScopeTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ResourceServerScopeType] = io.circe.Encoder.instance { o => 
    Json.obj("ScopeName" -> o.scopeName.asJson, "ScopeDescription" -> o.scopeDescription.asJson)
  }
  final implicit val UnsupportedUserStateExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UnsupportedUserStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdentityProviderByIdentifierRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetIdentityProviderByIdentifierRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "IdpIdentifier" -> o.idpIdentifier.asJson)
  }
  final implicit val GetCSVHeaderResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetCSVHeaderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "CSVHeader" -> o.csvheader.asJson)
  }
  final implicit val AdminUpdateDeviceStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateDeviceStatusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GroupExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GroupExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddCustomAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AddCustomAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "CustomAttributes" -> o.customAttributes.asJson)
  }
  final implicit val AdminRespondToAuthChallengeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminRespondToAuthChallengeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "ChallengeName" -> o.challengeName.asJson, "UserPoolId" -> o.userPoolId.asJson, "Session" -> o.session.asJson, "ChallengeResponses" -> o.challengeResponses.asJson)
  }
  final implicit val AdminListGroupsForUserRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminListGroupsForUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserPoolId" -> o.userPoolId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidOAuthFlowExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.InvalidOAuthFlowException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AdminAddUserToGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminAddUserToGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "GroupName" -> o.groupName.asJson)
  }
  final implicit val CreateResourceServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.CreateResourceServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServer" -> o.resourceServer.asJson)
  }
  final implicit val UserPoolPolicyTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UserPoolPolicyType] = io.circe.Encoder.instance { o => 
    Json.obj("PasswordPolicy" -> o.passwordPolicy.asJson)
  }
  final implicit val GetUserAttributeVerificationCodeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GetUserAttributeVerificationCodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val AdminGetDeviceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminGetDeviceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson)
  }
  final implicit val ListDevicesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ListDevicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "Limit" -> o.limit.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val StopUserImportJobResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.StopUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val ResendConfirmationCodeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.ResendConfirmationCodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val GlobalSignOutResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.GlobalSignOutResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedIdentityProviderExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.UnsupportedIdentityProviderException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StartUserImportJobRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.StartUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val DescribeUserPoolDomainRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson)
  }
  final implicit val AdminDisableProviderForUserResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableProviderForUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AdminUpdateUserAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "UserAttributes" -> o.userAttributes.asJson)
  }
  final implicit val InvalidSmsRoleTrustRelationshipExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidSmsRoleTrustRelationshipException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidSmsRoleTrustRelationshipException.apply _)
  }
  final implicit val DeleteUserPoolRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("UserPoolId").map(org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolRequest.apply _)
  }
  final implicit val AdminLinkProviderForUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminLinkProviderForUserResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminLinkProviderForUserResponse)
  final implicit val VerifyUserAttributeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.VerifyUserAttributeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("Code")).mapN(org.lyranthe.araethura.cognitoidp.models.VerifyUserAttributeRequest.apply _)
  }
  final implicit val NumberAttributeConstraintsTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.NumberAttributeConstraintsType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MinValue"), o.get[scala.Option[java.lang.String]]("MaxValue")).mapN(org.lyranthe.araethura.cognitoidp.models.NumberAttributeConstraintsType.apply _)
  }
  final implicit val GetUICustomizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetUICustomizationResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.UICustomizationType]("UICustomization").map(org.lyranthe.araethura.cognitoidp.models.GetUICustomizationResponse.apply _)
  }
  final implicit val AdminEnableUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminEnableUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminEnableUserRequest.apply _)
  }
  final implicit val ListResourceServersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListResourceServersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.ResourceServerType]]("ResourceServers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListResourceServersResponse.apply _)
  }
  final implicit val InvalidEmailRoleAccessPolicyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidEmailRoleAccessPolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidEmailRoleAccessPolicyException.apply _)
  }
  final implicit val DescribeUserPoolDomainResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.DomainDescriptionType]]("DomainDescription").map(org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolDomainResponse.apply _)
  }
  final implicit val AdminListGroupsForUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminListGroupsForUserResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.GroupType]]]("Groups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminListGroupsForUserResponse.apply _)
  }
  final implicit val UpdateIdentityProviderResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateIdentityProviderResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(org.lyranthe.araethura.cognitoidp.models.UpdateIdentityProviderResponse.apply _)
  }
  final implicit val AdminGetDeviceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminGetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeviceKey"), o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminGetDeviceRequest.apply _)
  }
  final implicit val CreateUserPoolClientRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Boolean]]("GenerateSecret"), o.get[scala.Option[scala.List[java.lang.String]]]("CallbackURLs"), o.get[scala.Option[scala.Int]]("RefreshTokenValidity"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("ReadAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("WriteAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("LogoutURLs"), o.get[scala.Option[scala.List[java.lang.String]]]("ExplicitAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthScopes"), o.get[scala.Option[scala.Boolean]]("AllowedOAuthFlowsUserPoolClient"), o.get[scala.Option[java.lang.String]]("DefaultRedirectURI"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedIdentityProviders")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateUserPoolClientRequest.apply _)
  }
  final implicit val AliasExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AliasExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.AliasExistsException.apply _)
  }
  final implicit val UpdateResourceServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateResourceServerResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.ResourceServerType]("ResourceServer").map(org.lyranthe.araethura.cognitoidp.models.UpdateResourceServerResponse.apply _)
  }
  final implicit val UserPoolClientDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserPoolClientDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("ClientName")).mapN(org.lyranthe.araethura.cognitoidp.models.UserPoolClientDescription.apply _)
  }
  final implicit val UpdateUserPoolRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("EmailVerificationMessage"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserConfigType]]("AdminCreateUserConfig"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.SmsConfigurationType]]("SmsConfiguration"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.LambdaConfigType]]("LambdaConfig"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("UserPoolTags"), o.get[scala.Option[java.lang.String]]("EmailVerificationSubject"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.DeviceConfigurationType]]("DeviceConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("AutoVerifiedAttributes"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.EmailConfigurationType]]("EmailConfiguration"), o.get[scala.Option[java.lang.String]]("SmsVerificationMessage"), o.get[scala.Option[java.lang.String]]("SmsAuthenticationMessage"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.VerificationMessageTemplateType]]("VerificationMessageTemplate"), o.get[scala.Option[java.lang.String]]("MfaConfiguration"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolPolicyType]]("Policies")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolRequest.apply _)
  }
  final implicit val ListUserPoolsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUserPoolsRequest.apply _)
  }
  final implicit val UserImportJobTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserImportJobType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("StartDate"), o.get[scala.Option[java.time.Instant]]("CompletionDate"), o.get[scala.Option[java.lang.String]]("PreSignedUrl"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("JobName"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[scala.Long]]("ImportedUsers"), o.get[scala.Option[scala.Long]]("SkippedUsers"), o.get[scala.Option[scala.Long]]("FailedUsers"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("CompletionMessage"), o.get[scala.Option[java.lang.String]]("JobId")).mapN(org.lyranthe.araethura.cognitoidp.models.UserImportJobType.apply _)
  }
  final implicit val GetDeviceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetDeviceResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.DeviceType]("Device").map(org.lyranthe.araethura.cognitoidp.models.GetDeviceResponse.apply _)
  }
  final implicit val PasswordPolicyTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.PasswordPolicyType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MinimumLength"), o.get[scala.Option[scala.Boolean]]("RequireUppercase"), o.get[scala.Option[scala.Boolean]]("RequireLowercase"), o.get[scala.Option[scala.Boolean]]("RequireNumbers"), o.get[scala.Option[scala.Boolean]]("RequireSymbols")).mapN(org.lyranthe.araethura.cognitoidp.models.PasswordPolicyType.apply _)
  }
  final implicit val UserPoolClientTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserPoolClientType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[scala.List[java.lang.String]]]("CallbackURLs"), o.get[scala.Option[scala.Int]]("RefreshTokenValidity"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("ClientSecret"), o.get[scala.Option[java.lang.String]]("ClientName"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("ReadAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("WriteAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("LogoutURLs"), o.get[scala.Option[scala.List[java.lang.String]]]("ExplicitAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthScopes"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[scala.Boolean]]("AllowedOAuthFlowsUserPoolClient"), o.get[scala.Option[java.lang.String]]("DefaultRedirectURI"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedIdentityProviders")).mapN(org.lyranthe.araethura.cognitoidp.models.UserPoolClientType.apply _)
  }
  final implicit val DeviceSecretVerifierConfigTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeviceSecretVerifierConfigType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PasswordVerifier"), o.get[scala.Option[java.lang.String]]("Salt")).mapN(org.lyranthe.araethura.cognitoidp.models.DeviceSecretVerifierConfigType.apply _)
  }
  final implicit val UICustomizationTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UICustomizationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("CSS"), o.get[scala.Option[java.lang.String]]("ImageUrl"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("CSSVersion"), o.get[scala.Option[java.lang.String]]("UserPoolId")).mapN(org.lyranthe.araethura.cognitoidp.models.UICustomizationType.apply _)
  }
  final implicit val AdminCreateUserConfigTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserConfigType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AllowAdminCreateUserOnly"), o.get[scala.Option[scala.Int]]("UnusedAccountValidityDays"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.MessageTemplateType]]("InviteMessageTemplate")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminCreateUserConfigType.apply _)
  }
  final implicit val InvalidPasswordExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidPasswordException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidPasswordException.apply _)
  }
  final implicit val UpdateDeviceStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateDeviceStatusResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.UpdateDeviceStatusResponse)
  final implicit val CreateGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("Precedence"), o.get[scala.Option[java.lang.String]]("RoleArn")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateGroupRequest.apply _)
  }
  final implicit val GetUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetUserRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccessToken").map(org.lyranthe.araethura.cognitoidp.models.GetUserRequest.apply _)
  }
  final implicit val TooManyFailedAttemptsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.TooManyFailedAttemptsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.TooManyFailedAttemptsException.apply _)
  }
  final implicit val SmsConfigurationTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SmsConfigurationType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SnsCallerArn"), o.get[scala.Option[java.lang.String]]("ExternalId")).mapN(org.lyranthe.araethura.cognitoidp.models.SmsConfigurationType.apply _)
  }
  final implicit val StopUserImportJobRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.StopUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("JobId")).mapN(org.lyranthe.araethura.cognitoidp.models.StopUserImportJobRequest.apply _)
  }
  final implicit val GetUICustomizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetUICustomizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("ClientId")).mapN(org.lyranthe.araethura.cognitoidp.models.GetUICustomizationRequest.apply _)
  }
  final implicit val ForgetDeviceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ForgetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("AccessToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ForgetDeviceRequest.apply _)
  }
  final implicit val DescribeUserImportJobResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserImportJobType]]("UserImportJob").map(org.lyranthe.araethura.cognitoidp.models.DescribeUserImportJobResponse.apply _)
  }
  final implicit val PasswordResetRequiredExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.PasswordResetRequiredException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.PasswordResetRequiredException.apply _)
  }
  final implicit val ForgotPasswordResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ForgotPasswordResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails").map(org.lyranthe.araethura.cognitoidp.models.ForgotPasswordResponse.apply _)
  }
  final implicit val VerifyUserAttributeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.VerifyUserAttributeResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.VerifyUserAttributeResponse)
  final implicit val ListUserPoolClientsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolClientsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.UserPoolClientDescription]]]("UserPoolClients"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUserPoolClientsResponse.apply _)
  }
  final implicit val UnexpectedLambdaExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UnexpectedLambdaException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UnexpectedLambdaException.apply _)
  }
  final implicit val PreconditionNotMetExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.PreconditionNotMetException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.PreconditionNotMetException.apply _)
  }
  final implicit val DeleteGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId")).mapN(org.lyranthe.araethura.cognitoidp.models.DeleteGroupRequest.apply _)
  }
  final implicit val AdminRemoveUserFromGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminRemoveUserFromGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("GroupName")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminRemoveUserFromGroupRequest.apply _)
  }
  final implicit val ListUserImportJobsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUserImportJobsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUserImportJobsRequest.apply _)
  }
  final implicit val UpdateGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("Precedence"), o.get[scala.Option[java.lang.String]]("RoleArn")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateGroupRequest.apply _)
  }
  final implicit val MessageTemplateTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.MessageTemplateType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SMSMessage"), o.get[scala.Option[java.lang.String]]("EmailMessage"), o.get[scala.Option[java.lang.String]]("EmailSubject")).mapN(org.lyranthe.araethura.cognitoidp.models.MessageTemplateType.apply _)
  }
  final implicit val UpdateGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.GroupType]]("Group").map(org.lyranthe.araethura.cognitoidp.models.UpdateGroupResponse.apply _)
  }
  final implicit val ListResourceServersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListResourceServersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListResourceServersRequest.apply _)
  }
  final implicit val ConfirmDeviceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConfirmDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.DeviceSecretVerifierConfigType]]("DeviceSecretVerifierConfig"), o.get[scala.Option[java.lang.String]]("DeviceName")).mapN(org.lyranthe.araethura.cognitoidp.models.ConfirmDeviceRequest.apply _)
  }
  final implicit val AdminDeleteUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserRequest.apply _)
  }
  final implicit val UserNotConfirmedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserNotConfirmedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UserNotConfirmedException.apply _)
  }
  final implicit val AdminDisableProviderForUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableProviderForUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[org.lyranthe.araethura.cognitoidp.models.ProviderUserIdentifierType]("User")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminDisableProviderForUserRequest.apply _)
  }
  final implicit val AdminResetUserPasswordResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminResetUserPasswordResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminResetUserPasswordResponse)
  final implicit val ConfirmDeviceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConfirmDeviceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("UserConfirmationNecessary").map(org.lyranthe.araethura.cognitoidp.models.ConfirmDeviceResponse.apply _)
  }
  final implicit val ResourceServerTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ResourceServerType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Identifier"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.ResourceServerScopeType]]]("Scopes")).mapN(org.lyranthe.araethura.cognitoidp.models.ResourceServerType.apply _)
  }
  final implicit val SchemaAttributeTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SchemaAttributeType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.NumberAttributeConstraintsType]]("NumberAttributeConstraints"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.StringAttributeConstraintsType]]("StringAttributeConstraints"), o.get[scala.Option[java.lang.String]]("AttributeDataType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Boolean]]("DeveloperOnlyAttribute"), o.get[scala.Option[scala.Boolean]]("Mutable"), o.get[scala.Option[scala.Boolean]]("Required")).mapN(org.lyranthe.araethura.cognitoidp.models.SchemaAttributeType.apply _)
  }
  final implicit val CreateIdentityProviderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProviderType"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("ProviderDetails"), o.get[java.lang.String]("ProviderName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AttributeMapping"), o.get[scala.Option[scala.List[java.lang.String]]]("IdpIdentifiers")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateIdentityProviderRequest.apply _)
  }
  final implicit val LambdaConfigTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.LambdaConfigType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DefineAuthChallenge"), o.get[scala.Option[java.lang.String]]("VerifyAuthChallengeResponse"), o.get[scala.Option[java.lang.String]]("PreSignUp"), o.get[scala.Option[java.lang.String]]("PostConfirmation"), o.get[scala.Option[java.lang.String]]("PreAuthentication"), o.get[scala.Option[java.lang.String]]("CreateAuthChallenge"), o.get[scala.Option[java.lang.String]]("CustomMessage"), o.get[scala.Option[java.lang.String]]("PostAuthentication")).mapN(org.lyranthe.araethura.cognitoidp.models.LambdaConfigType.apply _)
  }
  final implicit val CreateUserPoolRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PoolName"), o.get[scala.Option[java.lang.String]]("EmailVerificationMessage"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserConfigType]]("AdminCreateUserConfig"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.SmsConfigurationType]]("SmsConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("UsernameAttributes"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.LambdaConfigType]]("LambdaConfig"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("UserPoolTags"), o.get[scala.Option[scala.List[java.lang.String]]]("AliasAttributes"), o.get[scala.Option[java.lang.String]]("EmailVerificationSubject"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.SchemaAttributeType]]]("Schema"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.DeviceConfigurationType]]("DeviceConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("AutoVerifiedAttributes"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.EmailConfigurationType]]("EmailConfiguration"), o.get[scala.Option[java.lang.String]]("SmsVerificationMessage"), o.get[scala.Option[java.lang.String]]("SmsAuthenticationMessage"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.VerificationMessageTemplateType]]("VerificationMessageTemplate"), o.get[scala.Option[java.lang.String]]("MfaConfiguration"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolPolicyType]]("Policies")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateUserPoolRequest.apply _)
  }
  final implicit val ConfirmSignUpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConfirmSignUpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("ConfirmationCode"), o.get[scala.Option[scala.Boolean]]("ForceAliasCreation"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(org.lyranthe.araethura.cognitoidp.models.ConfirmSignUpRequest.apply _)
  }
  final implicit val ExpiredCodeExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ExpiredCodeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.ExpiredCodeException.apply _)
  }
  final implicit val RespondToAuthChallengeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.RespondToAuthChallengeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeResponses")).mapN(org.lyranthe.araethura.cognitoidp.models.RespondToAuthChallengeRequest.apply _)
  }
  final implicit val InitiateAuthRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InitiateAuthRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AuthFlow"), o.get[java.lang.String]("ClientId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AuthParameters"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ClientMetadata")).mapN(org.lyranthe.araethura.cognitoidp.models.InitiateAuthRequest.apply _)
  }
  final implicit val AdminCreateUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserType]]("User").map(org.lyranthe.araethura.cognitoidp.models.AdminCreateUserResponse.apply _)
  }
  final implicit val AdminInitiateAuthRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminInitiateAuthRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AuthFlow"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AuthParameters"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ClientMetadata")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminInitiateAuthRequest.apply _)
  }
  final implicit val AdminForgetDeviceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminForgetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("DeviceKey")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminForgetDeviceRequest.apply _)
  }
  final implicit val GetGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId")).mapN(org.lyranthe.araethura.cognitoidp.models.GetGroupRequest.apply _)
  }
  final implicit val ListGroupsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListGroupsRequest.apply _)
  }
  final implicit val StringAttributeConstraintsTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.StringAttributeConstraintsType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MinLength"), o.get[scala.Option[java.lang.String]]("MaxLength")).mapN(org.lyranthe.araethura.cognitoidp.models.StringAttributeConstraintsType.apply _)
  }
  final implicit val AdminInitiateAuthResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminInitiateAuthResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminInitiateAuthResponse.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InternalErrorException.apply _)
  }
  final implicit val GetIdentityProviderByIdentifierResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetIdentityProviderByIdentifierResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(org.lyranthe.araethura.cognitoidp.models.GetIdentityProviderByIdentifierResponse.apply _)
  }
  final implicit val AdminUserGlobalSignOutResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminUserGlobalSignOutResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminUserGlobalSignOutResponse)
  final implicit val AdminConfirmSignUpResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminConfirmSignUpResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminConfirmSignUpResponse)
  final implicit val ProviderUserIdentifierTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ProviderUserIdentifierType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("ProviderAttributeName"), o.get[scala.Option[java.lang.String]]("ProviderAttributeValue")).mapN(org.lyranthe.araethura.cognitoidp.models.ProviderUserIdentifierType.apply _)
  }
  final implicit val AdminDeleteUserAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.List[java.lang.String]]("UserAttributeNames")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserAttributesRequest.apply _)
  }
  final implicit val AdminUpdateDeviceStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateDeviceStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("DeviceRememberedStatus")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminUpdateDeviceStatusRequest.apply _)
  }
  final implicit val AdminSetUserSettingsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminSetUserSettingsResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminSetUserSettingsResponse)
  final implicit val SignUpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SignUpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Password"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("UserAttributes"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("ValidationData"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(org.lyranthe.araethura.cognitoidp.models.SignUpRequest.apply _)
  }
  final implicit val ListIdentityProvidersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListIdentityProvidersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.ProviderDescription]]("Providers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListIdentityProvidersResponse.apply _)
  }
  final implicit val AdminUserGlobalSignOutRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminUserGlobalSignOutRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminUserGlobalSignOutRequest.apply _)
  }
  final implicit val AdminUpdateUserAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateUserAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminUpdateUserAttributesResponse)
  final implicit val GetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.GroupType]]("Group").map(org.lyranthe.araethura.cognitoidp.models.GetGroupResponse.apply _)
  }
  final implicit val StartUserImportJobResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.StartUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserImportJobType]]("UserImportJob").map(org.lyranthe.araethura.cognitoidp.models.StartUserImportJobResponse.apply _)
  }
  final implicit val ConfirmForgotPasswordResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConfirmForgotPasswordResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.ConfirmForgotPasswordResponse)
  final implicit val ListUsersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUsersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.UserType]]]("Users"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUsersResponse.apply _)
  }
  final implicit val UserPoolTaggingExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserPoolTaggingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UserPoolTaggingException.apply _)
  }
  final implicit val ConfirmSignUpResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConfirmSignUpResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.ConfirmSignUpResponse)
  final implicit val NewDeviceMetadataTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.NewDeviceMetadataType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeviceKey"), o.get[scala.Option[java.lang.String]]("DeviceGroupKey")).mapN(org.lyranthe.araethura.cognitoidp.models.NewDeviceMetadataType.apply _)
  }
  final implicit val ConfirmForgotPasswordRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConfirmForgotPasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("ConfirmationCode"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(org.lyranthe.araethura.cognitoidp.models.ConfirmForgotPasswordRequest.apply _)
  }
  final implicit val CreateGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.GroupType]]("Group").map(org.lyranthe.araethura.cognitoidp.models.CreateGroupResponse.apply _)
  }
  final implicit val UpdateResourceServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier"), o.get[java.lang.String]("Name"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.ResourceServerScopeType]]]("Scopes")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateResourceServerRequest.apply _)
  }
  final implicit val AdminResetUserPasswordRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminResetUserPasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminResetUserPasswordRequest.apply _)
  }
  final implicit val AdminListDevicesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminListDevicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminListDevicesRequest.apply _)
  }
  final implicit val ResendConfirmationCodeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ResendConfirmationCodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Username"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(org.lyranthe.araethura.cognitoidp.models.ResendConfirmationCodeRequest.apply _)
  }
  final implicit val UpdateUserPoolResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolResponse)
  final implicit val SignUpResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SignUpResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("UserConfirmed"), o.get[java.lang.String]("UserSub"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails")).mapN(org.lyranthe.araethura.cognitoidp.models.SignUpResponse.apply _)
  }
  final implicit val AdminDeleteUserAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminDeleteUserAttributesResponse)
  final implicit val GetUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetUserResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]("UserAttributes"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.MFAOptionType]]]("MFAOptions")).mapN(org.lyranthe.araethura.cognitoidp.models.GetUserResponse.apply _)
  }
  final implicit val AdminGetUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminGetUserResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[scala.Option[java.time.Instant]]("UserCreateDate"), o.get[scala.Option[java.time.Instant]]("UserLastModifiedDate"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("UserAttributes"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.MFAOptionType]]]("MFAOptions"), o.get[scala.Option[java.lang.String]]("UserStatus"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminGetUserResponse.apply _)
  }
  final implicit val UserLambdaValidationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserLambdaValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UserLambdaValidationException.apply _)
  }
  final implicit val CreateIdentityProviderResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateIdentityProviderResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(org.lyranthe.araethura.cognitoidp.models.CreateIdentityProviderResponse.apply _)
  }
  final implicit val GetUserAttributeVerificationCodeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetUserAttributeVerificationCodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails").map(org.lyranthe.araethura.cognitoidp.models.GetUserAttributeVerificationCodeResponse.apply _)
  }
  final implicit val InvalidLambdaResponseExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidLambdaResponseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidLambdaResponseException.apply _)
  }
  final implicit val DeviceConfigurationTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeviceConfigurationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("ChallengeRequiredOnNewDevice"), o.get[scala.Option[scala.Boolean]]("DeviceOnlyRememberedOnUserPrompt")).mapN(org.lyranthe.araethura.cognitoidp.models.DeviceConfigurationType.apply _)
  }
  final implicit val AdminGetUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminGetUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminGetUserRequest.apply _)
  }
  final implicit val InitiateAuthResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InitiateAuthResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(org.lyranthe.araethura.cognitoidp.models.InitiateAuthResponse.apply _)
  }
  final implicit val DescribeResourceServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeResourceServerResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.ResourceServerType]("ResourceServer").map(org.lyranthe.araethura.cognitoidp.models.DescribeResourceServerResponse.apply _)
  }
  final implicit val DescribeUserPoolResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolType]]("UserPool").map(org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolResponse.apply _)
  }
  final implicit val AuthenticationResultTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccessToken"), o.get[scala.Option[java.lang.String]]("RefreshToken"), o.get[scala.Option[java.lang.String]]("IdToken"), o.get[scala.Option[scala.Int]]("ExpiresIn"), o.get[scala.Option[java.lang.String]]("TokenType"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.NewDeviceMetadataType]]("NewDeviceMetadata")).mapN(org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType.apply _)
  }
  final implicit val DeleteResourceServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier")).mapN(org.lyranthe.araethura.cognitoidp.models.DeleteResourceServerRequest.apply _)
  }
  final implicit val ForgotPasswordRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ForgotPasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Username"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(org.lyranthe.araethura.cognitoidp.models.ForgotPasswordRequest.apply _)
  }
  final implicit val AttributeTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AttributeType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.cognitoidp.models.AttributeType.apply _)
  }
  final implicit val AdminSetUserSettingsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminSetUserSettingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.MFAOptionType]]("MFAOptions")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminSetUserSettingsRequest.apply _)
  }
  final implicit val AdminCreateUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Boolean]]("ForceAliasCreation"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("UserAttributes"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("ValidationData"), o.get[scala.Option[java.lang.String]]("MessageAction"), o.get[scala.Option[java.lang.String]]("TemporaryPassword"), o.get[scala.Option[scala.List[java.lang.String]]]("DesiredDeliveryMediums")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminCreateUserRequest.apply _)
  }
  final implicit val ChangePasswordResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ChangePasswordResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.ChangePasswordResponse)
  final implicit val DescribeUserPoolRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("UserPoolId").map(org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolRequest.apply _)
  }
  final implicit val CodeDeliveryDetailsTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Destination"), o.get[scala.Option[java.lang.String]]("DeliveryMedium"), o.get[scala.Option[java.lang.String]]("AttributeName")).mapN(org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType.apply _)
  }
  final implicit val AdminDisableUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminDisableUserRequest.apply _)
  }
  final implicit val CreateUserPoolClientResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolClientType]]("UserPoolClient").map(org.lyranthe.araethura.cognitoidp.models.CreateUserPoolClientResponse.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidParameterException.apply _)
  }
  final implicit val CreateUserPoolDomainResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolDomainResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.CreateUserPoolDomainResponse)
  final implicit val AdminEnableUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminEnableUserResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminEnableUserResponse)
  final implicit val SetUserSettingsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SetUserSettingsResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.SetUserSettingsResponse)
  final implicit val AddCustomAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AddCustomAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AddCustomAttributesResponse)
  final implicit val DomainDescriptionTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DomainDescriptionType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AWSAccountId"), o.get[scala.Option[java.lang.String]]("Domain"), o.get[scala.Option[java.lang.String]]("S3Bucket"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[java.lang.String]]("CloudFrontDistribution"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Status")).mapN(org.lyranthe.araethura.cognitoidp.models.DomainDescriptionType.apply _)
  }
  final implicit val UpdateIdentityProviderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProviderName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AttributeMapping"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ProviderDetails"), o.get[scala.Option[scala.List[java.lang.String]]]("IdpIdentifiers")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateIdentityProviderRequest.apply _)
  }
  final implicit val AdminListDevicesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminListDevicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.DeviceType]]]("Devices"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminListDevicesResponse.apply _)
  }
  final implicit val RespondToAuthChallengeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.RespondToAuthChallengeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(org.lyranthe.araethura.cognitoidp.models.RespondToAuthChallengeResponse.apply _)
  }
  final implicit val UserPoolTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserPoolType] = io.circe.Decoder.instance { o => 
    for (`name` <- o.get[scala.Option[java.lang.String]]("Name"); `emailVerificationMessage` <- o.get[scala.Option[java.lang.String]]("EmailVerificationMessage"); `lastModifiedDate` <- o.get[scala.Option[java.time.Instant]]("LastModifiedDate"); `creationDate` <- o.get[scala.Option[java.time.Instant]]("CreationDate"); `estimatedNumberOfUsers` <- o.get[scala.Option[scala.Int]]("EstimatedNumberOfUsers"); `adminCreateUserConfig` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AdminCreateUserConfigType]]("AdminCreateUserConfig"); `smsConfiguration` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.SmsConfigurationType]]("SmsConfiguration"); `smsConfigurationFailure` <- o.get[scala.Option[java.lang.String]]("SmsConfigurationFailure"); `emailConfigurationFailure` <- o.get[scala.Option[java.lang.String]]("EmailConfigurationFailure"); `usernameAttributes` <- o.get[scala.Option[scala.List[java.lang.String]]]("UsernameAttributes"); `lambdaConfig` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.LambdaConfigType]]("LambdaConfig"); `userPoolTags` <- o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("UserPoolTags"); `aliasAttributes` <- o.get[scala.Option[scala.List[java.lang.String]]]("AliasAttributes"); `emailVerificationSubject` <- o.get[scala.Option[java.lang.String]]("EmailVerificationSubject"); `schemaAttributes` <- o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.SchemaAttributeType]]]("SchemaAttributes"); `deviceConfiguration` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.DeviceConfigurationType]]("DeviceConfiguration"); `autoVerifiedAttributes` <- o.get[scala.Option[scala.List[java.lang.String]]]("AutoVerifiedAttributes"); `emailConfiguration` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.EmailConfigurationType]]("EmailConfiguration"); `smsVerificationMessage` <- o.get[scala.Option[java.lang.String]]("SmsVerificationMessage"); `smsAuthenticationMessage` <- o.get[scala.Option[java.lang.String]]("SmsAuthenticationMessage"); `verificationMessageTemplate` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.VerificationMessageTemplateType]]("VerificationMessageTemplate"); `id` <- o.get[scala.Option[java.lang.String]]("Id"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `mfaConfiguration` <- o.get[scala.Option[java.lang.String]]("MfaConfiguration"); `policies` <- o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolPolicyType]]("Policies")) yield org.lyranthe.araethura.cognitoidp.models.UserPoolType(name, emailVerificationMessage, lastModifiedDate, creationDate, estimatedNumberOfUsers, adminCreateUserConfig, smsConfiguration, smsConfigurationFailure, emailConfigurationFailure, usernameAttributes, lambdaConfig, userPoolTags, aliasAttributes, emailVerificationSubject, schemaAttributes, deviceConfiguration, autoVerifiedAttributes, emailConfiguration, smsVerificationMessage, smsAuthenticationMessage, verificationMessageTemplate, id, status, mfaConfiguration, policies)
  }
  final implicit val AdminConfirmSignUpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminConfirmSignUpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminConfirmSignUpRequest.apply _)
  }
  final implicit val GroupTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GroupType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("GroupName"), o.get[scala.Option[scala.Int]]("Precedence"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("UserPoolId")).mapN(org.lyranthe.araethura.cognitoidp.models.GroupType.apply _)
  }
  final implicit val UpdateUserPoolClientRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.List[java.lang.String]]]("CallbackURLs"), o.get[scala.Option[scala.Int]]("RefreshTokenValidity"), o.get[scala.Option[java.lang.String]]("ClientName"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("ReadAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("WriteAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("LogoutURLs"), o.get[scala.Option[scala.List[java.lang.String]]]("ExplicitAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthScopes"), o.get[scala.Option[scala.Boolean]]("AllowedOAuthFlowsUserPoolClient"), o.get[scala.Option[java.lang.String]]("DefaultRedirectURI"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedIdentityProviders")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolClientRequest.apply _)
  }
  final implicit val ListUsersInGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUsersInGroupResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.UserType]]]("Users"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUsersInGroupResponse.apply _)
  }
  final implicit val UserImportInProgressExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserImportInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UserImportInProgressException.apply _)
  }
  final implicit val DescribeUserPoolClientResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolClientType]]("UserPoolClient").map(org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolClientResponse.apply _)
  }
  final implicit val CreateUserImportJobRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("JobName"), o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("CloudWatchLogsRoleArn")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateUserImportJobRequest.apply _)
  }
  final implicit val CreateUserPoolDomainRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Domain"), o.get[java.lang.String]("UserPoolId")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateUserPoolDomainRequest.apply _)
  }
  final implicit val UpdateUserPoolClientResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolClientType]]("UserPoolClient").map(org.lyranthe.araethura.cognitoidp.models.UpdateUserPoolClientResponse.apply _)
  }
  final implicit val CreateUserImportJobResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserImportJobType]]("UserImportJob").map(org.lyranthe.araethura.cognitoidp.models.CreateUserImportJobResponse.apply _)
  }
  final implicit val ListUserPoolClientsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolClientsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUserPoolClientsRequest.apply _)
  }
  final implicit val CreateUserPoolResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateUserPoolResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserPoolType]]("UserPool").map(org.lyranthe.araethura.cognitoidp.models.CreateUserPoolResponse.apply _)
  }
  final implicit val ListIdentityProvidersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListIdentityProvidersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListIdentityProvidersRequest.apply _)
  }
  final implicit val UsernameExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UsernameExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UsernameExistsException.apply _)
  }
  final implicit val DescribeResourceServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier")).mapN(org.lyranthe.araethura.cognitoidp.models.DescribeResourceServerRequest.apply _)
  }
  final implicit val ProviderDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ProviderDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("ProviderType"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate")).mapN(org.lyranthe.araethura.cognitoidp.models.ProviderDescription.apply _)
  }
  final implicit val ListUserImportJobsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUserImportJobsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.UserImportJobType]]]("UserImportJobs"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUserImportJobsResponse.apply _)
  }
  final implicit val AdminLinkProviderForUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminLinkProviderForUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[org.lyranthe.araethura.cognitoidp.models.ProviderUserIdentifierType]("DestinationUser"), o.get[org.lyranthe.araethura.cognitoidp.models.ProviderUserIdentifierType]("SourceUser")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminLinkProviderForUserRequest.apply _)
  }
  final implicit val DeleteUserAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.DeleteUserAttributesResponse)
  final implicit val DeleteUserPoolClientRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ClientId")).mapN(org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolClientRequest.apply _)
  }
  final implicit val AdminRespondToAuthChallengeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminRespondToAuthChallengeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminRespondToAuthChallengeResponse.apply _)
  }
  final implicit val DeviceTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeviceType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeviceKey"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("DeviceAttributes"), o.get[scala.Option[java.time.Instant]]("DeviceCreateDate"), o.get[scala.Option[java.time.Instant]]("DeviceLastModifiedDate"), o.get[scala.Option[java.time.Instant]]("DeviceLastAuthenticatedDate")).mapN(org.lyranthe.araethura.cognitoidp.models.DeviceType.apply _)
  }
  final implicit val AdminDisableUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableUserResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminDisableUserResponse)
  final implicit val NotAuthorizedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.NotAuthorizedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.NotAuthorizedException.apply _)
  }
  final implicit val DeleteUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccessToken").map(org.lyranthe.araethura.cognitoidp.models.DeleteUserRequest.apply _)
  }
  final implicit val EmailConfigurationTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.EmailConfigurationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceArn"), o.get[scala.Option[java.lang.String]]("ReplyToEmailAddress")).mapN(org.lyranthe.araethura.cognitoidp.models.EmailConfigurationType.apply _)
  }
  final implicit val InvalidUserPoolConfigurationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidUserPoolConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidUserPoolConfigurationException.apply _)
  }
  final implicit val ListDevicesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListDevicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.DeviceType]]]("Devices"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListDevicesResponse.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.TooManyRequestsException.apply _)
  }
  final implicit val DuplicateProviderExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DuplicateProviderException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.DuplicateProviderException.apply _)
  }
  final implicit val MFAOptionTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.MFAOptionType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeliveryMedium"), o.get[scala.Option[java.lang.String]]("AttributeName")).mapN(org.lyranthe.araethura.cognitoidp.models.MFAOptionType.apply _)
  }
  final implicit val GetCSVHeaderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetCSVHeaderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("UserPoolId").map(org.lyranthe.araethura.cognitoidp.models.GetCSVHeaderRequest.apply _)
  }
  final implicit val InvalidSmsRoleAccessPolicyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidSmsRoleAccessPolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidSmsRoleAccessPolicyException.apply _)
  }
  final implicit val CodeDeliveryFailureExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryFailureException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.CodeDeliveryFailureException.apply _)
  }
  final implicit val DescribeUserImportJobRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("JobId")).mapN(org.lyranthe.araethura.cognitoidp.models.DescribeUserImportJobRequest.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.ConcurrentModificationException.apply _)
  }
  final implicit val DeleteUserAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("UserAttributeNames"), o.get[java.lang.String]("AccessToken")).mapN(org.lyranthe.araethura.cognitoidp.models.DeleteUserAttributesRequest.apply _)
  }
  final implicit val SetUICustomizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SetUICustomizationResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.UICustomizationType]("UICustomization").map(org.lyranthe.araethura.cognitoidp.models.SetUICustomizationResponse.apply _)
  }
  final implicit val GetDeviceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("AccessToken")).mapN(org.lyranthe.araethura.cognitoidp.models.GetDeviceRequest.apply _)
  }
  final implicit val IdentityProviderTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.IdentityProviderType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AttributeMapping"), o.get[scala.Option[java.lang.String]]("ProviderType"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ProviderDetails"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[scala.List[java.lang.String]]]("IdpIdentifiers")).mapN(org.lyranthe.araethura.cognitoidp.models.IdentityProviderType.apply _)
  }
  final implicit val UserPoolDescriptionTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserPoolDescriptionType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.LambdaConfigType]]("LambdaConfig"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Status")).mapN(org.lyranthe.araethura.cognitoidp.models.UserPoolDescriptionType.apply _)
  }
  final implicit val ListUsersInGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUsersInGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("GroupName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUsersInGroupRequest.apply _)
  }
  final implicit val DeleteUserPoolDomainRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Domain"), o.get[java.lang.String]("UserPoolId")).mapN(org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolDomainRequest.apply _)
  }
  final implicit val UpdateUserAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType]]]("CodeDeliveryDetailsList").map(org.lyranthe.araethura.cognitoidp.models.UpdateUserAttributesResponse.apply _)
  }
  final implicit val ListGroupsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.GroupType]]]("Groups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListGroupsResponse.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.LimitExceededException.apply _)
  }
  final implicit val MFAMethodNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.MFAMethodNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.MFAMethodNotFoundException.apply _)
  }
  final implicit val SetUserSettingsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SetUserSettingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.MFAOptionType]]("MFAOptions")).mapN(org.lyranthe.araethura.cognitoidp.models.SetUserSettingsRequest.apply _)
  }
  final implicit val ListUserPoolsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUserPoolsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.UserPoolDescriptionType]]]("UserPools"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUserPoolsResponse.apply _)
  }
  final implicit val DescribeIdentityProviderResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeIdentityProviderResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(org.lyranthe.araethura.cognitoidp.models.DescribeIdentityProviderResponse.apply _)
  }
  final implicit val ListUsersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListUsersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[java.lang.String]]("Filter"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListUsersRequest.apply _)
  }
  final implicit val SetUICustomizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.SetUICustomizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("CSS"), o.get[scala.Option[scala.Array[scala.Byte]]]("ImageFile")).mapN(org.lyranthe.araethura.cognitoidp.models.SetUICustomizationRequest.apply _)
  }
  final implicit val VerificationMessageTemplateTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.VerificationMessageTemplateType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EmailMessage"), o.get[scala.Option[java.lang.String]]("EmailSubjectByLink"), o.get[scala.Option[java.lang.String]]("EmailSubject"), o.get[scala.Option[java.lang.String]]("DefaultEmailOption"), o.get[scala.Option[java.lang.String]]("EmailMessageByLink"), o.get[scala.Option[java.lang.String]]("SmsMessage")).mapN(org.lyranthe.araethura.cognitoidp.models.VerificationMessageTemplateType.apply _)
  }
  final implicit val DeleteUserPoolDomainResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolDomainResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.DeleteUserPoolDomainResponse)
  final implicit val UserNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UserNotFoundException.apply _)
  }
  final implicit val CreateResourceServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier"), o.get[java.lang.String]("Name"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.ResourceServerScopeType]]]("Scopes")).mapN(org.lyranthe.araethura.cognitoidp.models.CreateResourceServerRequest.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.ResourceNotFoundException.apply _)
  }
  final implicit val UpdateDeviceStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateDeviceStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("DeviceRememberedStatus")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateDeviceStatusRequest.apply _)
  }
  final implicit val DescribeUserPoolClientRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ClientId")).mapN(org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolClientRequest.apply _)
  }
  final implicit val ChangePasswordRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ChangePasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PreviousPassword"), o.get[java.lang.String]("ProposedPassword"), o.get[java.lang.String]("AccessToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ChangePasswordRequest.apply _)
  }
  final implicit val GlobalSignOutRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GlobalSignOutRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccessToken").map(org.lyranthe.araethura.cognitoidp.models.GlobalSignOutRequest.apply _)
  }
  final implicit val UpdateUserAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UpdateUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]("UserAttributes"), o.get[java.lang.String]("AccessToken")).mapN(org.lyranthe.araethura.cognitoidp.models.UpdateUserAttributesRequest.apply _)
  }
  final implicit val DescribeIdentityProviderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ProviderName")).mapN(org.lyranthe.araethura.cognitoidp.models.DescribeIdentityProviderRequest.apply _)
  }
  final implicit val ScopeDoesNotExistExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ScopeDoesNotExistException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.ScopeDoesNotExistException.apply _)
  }
  final implicit val DeleteIdentityProviderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DeleteIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ProviderName")).mapN(org.lyranthe.araethura.cognitoidp.models.DeleteIdentityProviderRequest.apply _)
  }
  final implicit val UserTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("UserCreateDate"), o.get[scala.Option[java.time.Instant]]("UserLastModifiedDate"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]]("Attributes"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cognitoidp.models.MFAOptionType]]]("MFAOptions"), o.get[scala.Option[java.lang.String]]("UserStatus"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(org.lyranthe.araethura.cognitoidp.models.UserType.apply _)
  }
  final implicit val CodeMismatchExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CodeMismatchException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.CodeMismatchException.apply _)
  }
  final implicit val ResourceServerScopeTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ResourceServerScopeType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ScopeName"), o.get[java.lang.String]("ScopeDescription")).mapN(org.lyranthe.araethura.cognitoidp.models.ResourceServerScopeType.apply _)
  }
  final implicit val UnsupportedUserStateExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UnsupportedUserStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UnsupportedUserStateException.apply _)
  }
  final implicit val GetIdentityProviderByIdentifierRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetIdentityProviderByIdentifierRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("IdpIdentifier")).mapN(org.lyranthe.araethura.cognitoidp.models.GetIdentityProviderByIdentifierRequest.apply _)
  }
  final implicit val GetCSVHeaderResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetCSVHeaderResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[scala.List[java.lang.String]]]("CSVHeader")).mapN(org.lyranthe.araethura.cognitoidp.models.GetCSVHeaderResponse.apply _)
  }
  final implicit val AdminUpdateDeviceStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateDeviceStatusResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminUpdateDeviceStatusResponse)
  final implicit val GroupExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GroupExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.GroupExistsException.apply _)
  }
  final implicit val AddCustomAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AddCustomAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.SchemaAttributeType]]("CustomAttributes")).mapN(org.lyranthe.araethura.cognitoidp.models.AddCustomAttributesRequest.apply _)
  }
  final implicit val AdminRespondToAuthChallengeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminRespondToAuthChallengeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("ChallengeName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeResponses")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminRespondToAuthChallengeRequest.apply _)
  }
  final implicit val AdminListGroupsForUserRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminListGroupsForUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminListGroupsForUserRequest.apply _)
  }
  final implicit val InvalidOAuthFlowExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.InvalidOAuthFlowException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.InvalidOAuthFlowException.apply _)
  }
  final implicit val AdminAddUserToGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminAddUserToGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("GroupName")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminAddUserToGroupRequest.apply _)
  }
  final implicit val CreateResourceServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.CreateResourceServerResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.ResourceServerType]("ResourceServer").map(org.lyranthe.araethura.cognitoidp.models.CreateResourceServerResponse.apply _)
  }
  final implicit val UserPoolPolicyTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UserPoolPolicyType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.PasswordPolicyType]]("PasswordPolicy").map(org.lyranthe.araethura.cognitoidp.models.UserPoolPolicyType.apply _)
  }
  final implicit val GetUserAttributeVerificationCodeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GetUserAttributeVerificationCodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("AttributeName")).mapN(org.lyranthe.araethura.cognitoidp.models.GetUserAttributeVerificationCodeRequest.apply _)
  }
  final implicit val AdminGetDeviceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminGetDeviceResponse] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.cognitoidp.models.DeviceType]("Device").map(org.lyranthe.araethura.cognitoidp.models.AdminGetDeviceResponse.apply _)
  }
  final implicit val ListDevicesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ListDevicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.cognitoidp.models.ListDevicesRequest.apply _)
  }
  final implicit val StopUserImportJobResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.StopUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.UserImportJobType]]("UserImportJob").map(org.lyranthe.araethura.cognitoidp.models.StopUserImportJobResponse.apply _)
  }
  final implicit val ResendConfirmationCodeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.ResendConfirmationCodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails").map(org.lyranthe.araethura.cognitoidp.models.ResendConfirmationCodeResponse.apply _)
  }
  final implicit val GlobalSignOutResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.GlobalSignOutResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.GlobalSignOutResponse)
  final implicit val UnsupportedIdentityProviderExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.UnsupportedIdentityProviderException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.cognitoidp.models.UnsupportedIdentityProviderException.apply _)
  }
  final implicit val StartUserImportJobRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.StartUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("JobId")).mapN(org.lyranthe.araethura.cognitoidp.models.StartUserImportJobRequest.apply _)
  }
  final implicit val DescribeUserPoolDomainRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Domain").map(org.lyranthe.araethura.cognitoidp.models.DescribeUserPoolDomainRequest.apply _)
  }
  final implicit val AdminDisableProviderForUserResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminDisableProviderForUserResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cognitoidp.models.AdminDisableProviderForUserResponse)
  final implicit val AdminUpdateUserAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cognitoidp.models.AdminUpdateUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.List[org.lyranthe.araethura.cognitoidp.models.AttributeType]]("UserAttributes")).mapN(org.lyranthe.araethura.cognitoidp.models.AdminUpdateUserAttributesRequest.apply _)
  }
}