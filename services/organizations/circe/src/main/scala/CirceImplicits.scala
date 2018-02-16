package org.lyranthe.araethura.organizations
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DuplicateOrganizationalUnitExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DuplicateOrganizationalUnitException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationalUnitNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.OrganizationalUnitNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CancelHandshakeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CancelHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val DescribeCreateAccountStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeCreateAccountStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatus" -> o.createAccountStatus.asJson)
  }
  final implicit val AccountEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Account] = io.circe.Encoder.instance { o => 
    Json.obj("JoinedTimestamp" -> o.joinedTimestamp.asJson, "JoinedMethod" -> o.joinedMethod.asJson, "Arn" -> o.arn.asJson, "Status" -> o.status.asJson, "Email" -> o.email.asJson, "Name" -> o.name.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ListTargetsForPolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListTargetsForPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DuplicatePolicyAttachmentExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DuplicatePolicyAttachmentException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PolicyTargetSummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyTargetSummary] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val HandshakePartyEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.HandshakeParty] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListTargetsForPolicyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListTargetsForPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val OrganizationalUnitNotEmptyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.OrganizationalUnitNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MasterCannotLeaveOrganizationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.MasterCannotLeaveOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InviteAccountToOrganizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.InviteAccountToOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Target" -> o.target.asJson, "Notes" -> o.notes.asJson)
  }
  final implicit val PolicyTypeNotAvailableForOrganizationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyTypeNotAvailableForOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeAccountRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson)
  }
  final implicit val PolicySummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicySummary] = io.circe.Encoder.instance { o => 
    Json.obj("AwsManaged" -> o.awsManaged.asJson, "Id" -> o.id.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "Arn" -> o.arn.asJson)
  }
  final implicit val AttachPolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AttachPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "TargetId" -> o.targetId.asJson)
  }
  final implicit val ListParentsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListParentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Parents" -> o.parents.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribePolicyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val DescribeOrganizationalUnitRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson)
  }
  final implicit val DeletePolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DeletePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson)
  }
  final implicit val ParentNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationNotEmptyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.OrganizationNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeclineHandshakeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DeclineHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val HandshakeAlreadyInStateExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.HandshakeAlreadyInStateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MalformedPolicyDocumentExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.MalformedPolicyDocumentException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateOrganizationalUnitRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DuplicatePolicyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DuplicatePolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val HandshakeFilterEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.HandshakeFilter] = io.circe.Encoder.instance { o => 
    Json.obj("ActionType" -> o.actionType.asJson, "ParentHandshakeId" -> o.parentHandshakeId.asJson)
  }
  final implicit val UpdateOrganizationalUnitRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.UpdateOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DuplicateHandshakeExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DuplicateHandshakeException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidHandshakeTransitionExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.InvalidHandshakeTransitionException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdatePolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.UpdatePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Content" -> o.content.asJson)
  }
  final implicit val ListPoliciesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListPoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policies" -> o.policies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RootEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Root] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "PolicyTypes" -> o.policyTypes.asJson)
  }
  final implicit val DeleteOrganizationalUnitRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DeleteOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson)
  }
  final implicit val ListRootsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListRootsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeCreateAccountStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeCreateAccountStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountRequestId" -> o.createAccountRequestId.asJson)
  }
  final implicit val HandshakeConstraintViolationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.HandshakeConstraintViolationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val PolicyNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CancelHandshakeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CancelHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val SourceParentNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.SourceParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TargetNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.TargetNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateAccountStatusNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateAccountStatusNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DisablePolicyTypeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DisablePolicyTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Root" -> o.root.asJson)
  }
  final implicit val ListOrganizationalUnitsForParentRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListOrganizationalUnitsForParentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListAccountsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListAccountsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Accounts" -> o.accounts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListPoliciesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListPoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val EnableAllFeaturesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.EnableAllFeaturesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListHandshakesForOrganizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListHandshakesForOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshakes" -> o.handshakes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val MoveAccountRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.MoveAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "SourceParentId" -> o.sourceParentId.asJson, "DestinationParentId" -> o.destinationParentId.asJson)
  }
  final implicit val HandshakeEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Handshake] = io.circe.Encoder.instance { o => 
    Json.obj("RequestedTimestamp" -> o.requestedTimestamp.asJson, "ExpirationTimestamp" -> o.expirationTimestamp.asJson, "Resources" -> o.resources.asJson, "Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Parties" -> o.parties.asJson, "State" -> o.state.asJson, "Action" -> o.action.asJson)
  }
  final implicit val PolicyTypeSummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyTypeSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ListAccountsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListAccountsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ChildNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ChildNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListAccountsForParentResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListAccountsForParentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Accounts" -> o.accounts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PolicyEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Policy] = io.circe.Encoder.instance { o => 
    Json.obj("PolicySummary" -> o.policySummary.asJson, "Content" -> o.content.asJson)
  }
  final implicit val DescribeHandshakeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val DescribePolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson)
  }
  final implicit val CreateAccountStatusEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateAccountStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "RequestedTimestamp" -> o.requestedTimestamp.asJson, "CompletedTimestamp" -> o.completedTimestamp.asJson, "State" -> o.state.asJson, "AccountName" -> o.accountName.asJson, "AccountId" -> o.accountId.asJson, "FailureReason" -> o.failureReason.asJson)
  }
  final implicit val UpdatePolicyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.UpdatePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val EnabledServicePrincipalEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.EnabledServicePrincipal] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson, "DateEnabled" -> o.dateEnabled.asJson)
  }
  final implicit val DescribeOrganizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Organization" -> o.organization.asJson)
  }
  final implicit val DescribeHandshakeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val DescribeAccountResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Account" -> o.account.asJson)
  }
  final implicit val DisablePolicyTypeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DisablePolicyTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RootId" -> o.rootId.asJson, "PolicyType" -> o.policyType.asJson)
  }
  final implicit val CreateOrganizationalUnitResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val PolicyTypeAlreadyEnabledExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyTypeAlreadyEnabledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EnablePolicyTypeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.EnablePolicyTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RootId" -> o.rootId.asJson, "PolicyType" -> o.policyType.asJson)
  }
  final implicit val AWSOrganizationsNotInUseExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AWSOrganizationsNotInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationalUnitEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.OrganizationalUnit] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson)
  }
  final implicit val ListAWSServiceAccessForOrganizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListAWSServiceAccessForOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EnabledServicePrincipals" -> o.enabledServicePrincipals.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AcceptHandshakeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AcceptHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val AlreadyInOrganizationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AlreadyInOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForAccountResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListHandshakesForAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshakes" -> o.handshakes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DetachPolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DetachPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "TargetId" -> o.targetId.asJson)
  }
  final implicit val ListOrganizationalUnitsForParentResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListOrganizationalUnitsForParentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnits" -> o.organizationalUnits.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InviteAccountToOrganizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.InviteAccountToOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val AcceptHandshakeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AcceptHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val CreatePolicyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreatePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val AccountNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AccountNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListPoliciesForTargetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListPoliciesForTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListPoliciesForTargetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListPoliciesForTargetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policies" -> o.policies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ListAccountsForParentRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListAccountsForParentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeclineHandshakeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DeclineHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val CreateAccountRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Email" -> o.email.asJson, "AccountName" -> o.accountName.asJson, "RoleName" -> o.roleName.asJson, "IamUserAccessToBilling" -> o.iamUserAccessToBilling.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RootNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.RootNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PolicyNotAttachedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyNotAttachedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListCreateAccountStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListCreateAccountStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatuses" -> o.createAccountStatuses.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListCreateAccountStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListCreateAccountStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("States" -> o.states.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val FinalizingOrganizationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.FinalizingOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateAccountExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DuplicateAccountException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForAccountRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListHandshakesForAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DestinationParentNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DestinationParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EnableAllFeaturesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.EnableAllFeaturesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val ListRootsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListRootsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Roots" -> o.roots.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateOrganizationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Organization" -> o.organization.asJson)
  }
  final implicit val CreateOrganizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("FeatureSet" -> o.featureSet.asJson)
  }
  final implicit val ListChildrenRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListChildrenRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "ChildType" -> o.childType.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val CreatePolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreatePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Content" -> o.content.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val HandshakeResourceEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.HandshakeResource] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Type" -> o.`type`.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val ChildEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Child] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListParentsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListParentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ChildId" -> o.childId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DisableAWSServiceAccessRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DisableAWSServiceAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateOrganizationalUnitResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.UpdateOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val HandshakeNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.HandshakeNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RemoveAccountFromOrganizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.RemoveAccountFromOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson)
  }
  final implicit val PolicyInUseExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccessDeniedForDependencyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.AccessDeniedForDependencyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val DescribeOrganizationalUnitResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.DescribeOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val ListAWSServiceAccessForOrganizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListAWSServiceAccessForOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val OrganizationEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Organization] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "MasterAccountArn" -> o.masterAccountArn.asJson, "FeatureSet" -> o.featureSet.asJson, "MasterAccountEmail" -> o.masterAccountEmail.asJson, "AvailablePolicyTypes" -> o.availablePolicyTypes.asJson, "MasterAccountId" -> o.masterAccountId.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ConstraintViolationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ConstraintViolationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val EnablePolicyTypeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.EnablePolicyTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Root" -> o.root.asJson)
  }
  final implicit val ListChildrenResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListChildrenResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Children" -> o.children.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EnableAWSServiceAccessRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.EnableAWSServiceAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson)
  }
  final implicit val PolicyTypeNotEnabledExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.PolicyTypeNotEnabledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForOrganizationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ListHandshakesForOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateAccountResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.CreateAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatus" -> o.createAccountStatus.asJson)
  }
  final implicit val ParentEncoder: io.circe.Encoder[org.lyranthe.araethura.organizations.models.Parent] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val DuplicateOrganizationalUnitExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DuplicateOrganizationalUnitException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.DuplicateOrganizationalUnitException.apply _)
  }
  final implicit val OrganizationalUnitNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.OrganizationalUnitNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.OrganizationalUnitNotFoundException.apply _)
  }
  final implicit val CancelHandshakeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CancelHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(org.lyranthe.araethura.organizations.models.CancelHandshakeRequest.apply _)
  }
  final implicit val DescribeCreateAccountStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeCreateAccountStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.CreateAccountStatus]]("CreateAccountStatus").map(org.lyranthe.araethura.organizations.models.DescribeCreateAccountStatusResponse.apply _)
  }
  final implicit val AccountDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Account] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("JoinedTimestamp"), o.get[scala.Option[java.lang.String]]("JoinedMethod"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Email"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Id")).mapN(org.lyranthe.araethura.organizations.models.Account.apply _)
  }
  final implicit val ListTargetsForPolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListTargetsForPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListTargetsForPolicyRequest.apply _)
  }
  final implicit val DuplicatePolicyAttachmentExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DuplicatePolicyAttachmentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.DuplicatePolicyAttachmentException.apply _)
  }
  final implicit val PolicyTargetSummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyTargetSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type")).mapN(org.lyranthe.araethura.organizations.models.PolicyTargetSummary.apply _)
  }
  final implicit val HandshakePartyDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.HandshakeParty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[java.lang.String]("Type")).mapN(org.lyranthe.araethura.organizations.models.HandshakeParty.apply _)
  }
  final implicit val ListTargetsForPolicyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListTargetsForPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicyTargetSummary]]]("Targets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListTargetsForPolicyResponse.apply _)
  }
  final implicit val OrganizationalUnitNotEmptyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.OrganizationalUnitNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.OrganizationalUnitNotEmptyException.apply _)
  }
  final implicit val MasterCannotLeaveOrganizationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.MasterCannotLeaveOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.MasterCannotLeaveOrganizationException.apply _)
  }
  final implicit val InviteAccountToOrganizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.InviteAccountToOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.organizations.models.HandshakeParty]("Target"), o.get[scala.Option[java.lang.String]]("Notes")).mapN(org.lyranthe.araethura.organizations.models.InviteAccountToOrganizationRequest.apply _)
  }
  final implicit val PolicyTypeNotAvailableForOrganizationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyTypeNotAvailableForOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.PolicyTypeNotAvailableForOrganizationException.apply _)
  }
  final implicit val DescribeAccountRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeAccountRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccountId").map(org.lyranthe.araethura.organizations.models.DescribeAccountRequest.apply _)
  }
  final implicit val PolicySummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicySummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AwsManaged"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Arn")).mapN(org.lyranthe.araethura.organizations.models.PolicySummary.apply _)
  }
  final implicit val AttachPolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AttachPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[java.lang.String]("TargetId")).mapN(org.lyranthe.araethura.organizations.models.AttachPolicyRequest.apply _)
  }
  final implicit val ListParentsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListParentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Parent]]]("Parents"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListParentsResponse.apply _)
  }
  final implicit val DescribePolicyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Policy]]("Policy").map(org.lyranthe.araethura.organizations.models.DescribePolicyResponse.apply _)
  }
  final implicit val DescribeOrganizationalUnitRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OrganizationalUnitId").map(org.lyranthe.araethura.organizations.models.DescribeOrganizationalUnitRequest.apply _)
  }
  final implicit val DeletePolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DeletePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PolicyId").map(org.lyranthe.araethura.organizations.models.DeletePolicyRequest.apply _)
  }
  final implicit val ParentNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.ParentNotFoundException.apply _)
  }
  final implicit val OrganizationNotEmptyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.OrganizationNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.OrganizationNotEmptyException.apply _)
  }
  final implicit val DeclineHandshakeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DeclineHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Handshake]]("Handshake").map(org.lyranthe.araethura.organizations.models.DeclineHandshakeResponse.apply _)
  }
  final implicit val HandshakeAlreadyInStateExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.HandshakeAlreadyInStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.HandshakeAlreadyInStateException.apply _)
  }
  final implicit val MalformedPolicyDocumentExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.MalformedPolicyDocumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.MalformedPolicyDocumentException.apply _)
  }
  final implicit val CreateOrganizationalUnitRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[java.lang.String]("Name")).mapN(org.lyranthe.araethura.organizations.models.CreateOrganizationalUnitRequest.apply _)
  }
  final implicit val DuplicatePolicyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DuplicatePolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.DuplicatePolicyException.apply _)
  }
  final implicit val HandshakeFilterDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.HandshakeFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionType"), o.get[scala.Option[java.lang.String]]("ParentHandshakeId")).mapN(org.lyranthe.araethura.organizations.models.HandshakeFilter.apply _)
  }
  final implicit val UpdateOrganizationalUnitRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.UpdateOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OrganizationalUnitId"), o.get[scala.Option[java.lang.String]]("Name")).mapN(org.lyranthe.araethura.organizations.models.UpdateOrganizationalUnitRequest.apply _)
  }
  final implicit val DuplicateHandshakeExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DuplicateHandshakeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.DuplicateHandshakeException.apply _)
  }
  final implicit val InvalidHandshakeTransitionExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.InvalidHandshakeTransitionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.InvalidHandshakeTransitionException.apply _)
  }
  final implicit val UpdatePolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.UpdatePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Content")).mapN(org.lyranthe.araethura.organizations.models.UpdatePolicyRequest.apply _)
  }
  final implicit val ListPoliciesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListPoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicySummary]]]("Policies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListPoliciesResponse.apply _)
  }
  final implicit val RootDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Root] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicyTypeSummary]]]("PolicyTypes")).mapN(org.lyranthe.araethura.organizations.models.Root.apply _)
  }
  final implicit val DeleteOrganizationalUnitRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DeleteOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OrganizationalUnitId").map(org.lyranthe.araethura.organizations.models.DeleteOrganizationalUnitRequest.apply _)
  }
  final implicit val ListRootsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListRootsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListRootsRequest.apply _)
  }
  final implicit val DescribeCreateAccountStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeCreateAccountStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CreateAccountRequestId").map(org.lyranthe.araethura.organizations.models.DescribeCreateAccountStatusRequest.apply _)
  }
  final implicit val HandshakeConstraintViolationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.HandshakeConstraintViolationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(org.lyranthe.araethura.organizations.models.HandshakeConstraintViolationException.apply _)
  }
  final implicit val PolicyNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.PolicyNotFoundException.apply _)
  }
  final implicit val CancelHandshakeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CancelHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Handshake]]("Handshake").map(org.lyranthe.araethura.organizations.models.CancelHandshakeResponse.apply _)
  }
  final implicit val SourceParentNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.SourceParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.SourceParentNotFoundException.apply _)
  }
  final implicit val TargetNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.TargetNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.TargetNotFoundException.apply _)
  }
  final implicit val CreateAccountStatusNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateAccountStatusNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.CreateAccountStatusNotFoundException.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.AccessDeniedException.apply _)
  }
  final implicit val DisablePolicyTypeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DisablePolicyTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Root]]("Root").map(org.lyranthe.araethura.organizations.models.DisablePolicyTypeResponse.apply _)
  }
  final implicit val ListOrganizationalUnitsForParentRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListOrganizationalUnitsForParentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListOrganizationalUnitsForParentRequest.apply _)
  }
  final implicit val ListAccountsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListAccountsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Account]]]("Accounts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListAccountsResponse.apply _)
  }
  final implicit val ListPoliciesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListPoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListPoliciesRequest.apply _)
  }
  final implicit val EnableAllFeaturesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.EnableAllFeaturesRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.organizations.models.EnableAllFeaturesRequest)
  final implicit val ListHandshakesForOrganizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListHandshakesForOrganizationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Handshake]]]("Handshakes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListHandshakesForOrganizationResponse.apply _)
  }
  final implicit val MoveAccountRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.MoveAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("SourceParentId"), o.get[java.lang.String]("DestinationParentId")).mapN(org.lyranthe.araethura.organizations.models.MoveAccountRequest.apply _)
  }
  final implicit val HandshakeDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Handshake] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("RequestedTimestamp"), o.get[scala.Option[java.time.Instant]]("ExpirationTimestamp"), o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.HandshakeResource]]]("Resources"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.HandshakeParty]]]("Parties"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Action")).mapN(org.lyranthe.araethura.organizations.models.Handshake.apply _)
  }
  final implicit val PolicyTypeSummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyTypeSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Status")).mapN(org.lyranthe.araethura.organizations.models.PolicyTypeSummary.apply _)
  }
  final implicit val ListAccountsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListAccountsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListAccountsRequest.apply _)
  }
  final implicit val ChildNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ChildNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.ChildNotFoundException.apply _)
  }
  final implicit val ListAccountsForParentResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListAccountsForParentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Account]]]("Accounts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListAccountsForParentResponse.apply _)
  }
  final implicit val PolicyDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Policy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.organizations.models.PolicySummary]]("PolicySummary"), o.get[scala.Option[java.lang.String]]("Content")).mapN(org.lyranthe.araethura.organizations.models.Policy.apply _)
  }
  final implicit val DescribeHandshakeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(org.lyranthe.araethura.organizations.models.DescribeHandshakeRequest.apply _)
  }
  final implicit val DescribePolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PolicyId").map(org.lyranthe.araethura.organizations.models.DescribePolicyRequest.apply _)
  }
  final implicit val CreateAccountStatusDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateAccountStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("RequestedTimestamp"), o.get[scala.Option[java.time.Instant]]("CompletedTimestamp"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("AccountName"), o.get[scala.Option[java.lang.String]]("AccountId"), o.get[scala.Option[java.lang.String]]("FailureReason")).mapN(org.lyranthe.araethura.organizations.models.CreateAccountStatus.apply _)
  }
  final implicit val UpdatePolicyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.UpdatePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Policy]]("Policy").map(org.lyranthe.araethura.organizations.models.UpdatePolicyResponse.apply _)
  }
  final implicit val EnabledServicePrincipalDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.EnabledServicePrincipal] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ServicePrincipal"), o.get[scala.Option[java.time.Instant]]("DateEnabled")).mapN(org.lyranthe.araethura.organizations.models.EnabledServicePrincipal.apply _)
  }
  final implicit val DescribeOrganizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Organization]]("Organization").map(org.lyranthe.araethura.organizations.models.DescribeOrganizationResponse.apply _)
  }
  final implicit val DescribeHandshakeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Handshake]]("Handshake").map(org.lyranthe.araethura.organizations.models.DescribeHandshakeResponse.apply _)
  }
  final implicit val DescribeAccountResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeAccountResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Account]]("Account").map(org.lyranthe.araethura.organizations.models.DescribeAccountResponse.apply _)
  }
  final implicit val DisablePolicyTypeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DisablePolicyTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RootId"), o.get[java.lang.String]("PolicyType")).mapN(org.lyranthe.araethura.organizations.models.DisablePolicyTypeRequest.apply _)
  }
  final implicit val CreateOrganizationalUnitResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.OrganizationalUnit]]("OrganizationalUnit").map(org.lyranthe.araethura.organizations.models.CreateOrganizationalUnitResponse.apply _)
  }
  final implicit val PolicyTypeAlreadyEnabledExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyTypeAlreadyEnabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.PolicyTypeAlreadyEnabledException.apply _)
  }
  final implicit val EnablePolicyTypeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.EnablePolicyTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RootId"), o.get[java.lang.String]("PolicyType")).mapN(org.lyranthe.araethura.organizations.models.EnablePolicyTypeRequest.apply _)
  }
  final implicit val AWSOrganizationsNotInUseExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AWSOrganizationsNotInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.AWSOrganizationsNotInUseException.apply _)
  }
  final implicit val OrganizationalUnitDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.OrganizationalUnit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name")).mapN(org.lyranthe.araethura.organizations.models.OrganizationalUnit.apply _)
  }
  final implicit val ListAWSServiceAccessForOrganizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListAWSServiceAccessForOrganizationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.EnabledServicePrincipal]]]("EnabledServicePrincipals"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListAWSServiceAccessForOrganizationResponse.apply _)
  }
  final implicit val AcceptHandshakeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AcceptHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Handshake]]("Handshake").map(org.lyranthe.araethura.organizations.models.AcceptHandshakeResponse.apply _)
  }
  final implicit val AlreadyInOrganizationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AlreadyInOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.AlreadyInOrganizationException.apply _)
  }
  final implicit val ListHandshakesForAccountResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListHandshakesForAccountResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Handshake]]]("Handshakes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListHandshakesForAccountResponse.apply _)
  }
  final implicit val DetachPolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DetachPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[java.lang.String]("TargetId")).mapN(org.lyranthe.araethura.organizations.models.DetachPolicyRequest.apply _)
  }
  final implicit val ListOrganizationalUnitsForParentResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListOrganizationalUnitsForParentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.OrganizationalUnit]]]("OrganizationalUnits"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListOrganizationalUnitsForParentResponse.apply _)
  }
  final implicit val InviteAccountToOrganizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.InviteAccountToOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Handshake]]("Handshake").map(org.lyranthe.araethura.organizations.models.InviteAccountToOrganizationResponse.apply _)
  }
  final implicit val AcceptHandshakeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AcceptHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(org.lyranthe.araethura.organizations.models.AcceptHandshakeRequest.apply _)
  }
  final implicit val CreatePolicyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreatePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Policy]]("Policy").map(org.lyranthe.araethura.organizations.models.CreatePolicyResponse.apply _)
  }
  final implicit val AccountNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AccountNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.AccountNotFoundException.apply _)
  }
  final implicit val ListPoliciesForTargetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListPoliciesForTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetId"), o.get[java.lang.String]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListPoliciesForTargetRequest.apply _)
  }
  final implicit val ListPoliciesForTargetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListPoliciesForTargetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicySummary]]]("Policies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListPoliciesForTargetResponse.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Message")).mapN(org.lyranthe.araethura.organizations.models.TooManyRequestsException.apply _)
  }
  final implicit val ListAccountsForParentRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListAccountsForParentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListAccountsForParentRequest.apply _)
  }
  final implicit val DeclineHandshakeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DeclineHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(org.lyranthe.araethura.organizations.models.DeclineHandshakeRequest.apply _)
  }
  final implicit val CreateAccountRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Email"), o.get[java.lang.String]("AccountName"), o.get[scala.Option[java.lang.String]]("RoleName"), o.get[scala.Option[java.lang.String]]("IamUserAccessToBilling")).mapN(org.lyranthe.araethura.organizations.models.CreateAccountRequest.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.ServiceException.apply _)
  }
  final implicit val RootNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.RootNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.RootNotFoundException.apply _)
  }
  final implicit val PolicyNotAttachedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyNotAttachedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.PolicyNotAttachedException.apply _)
  }
  final implicit val ListCreateAccountStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListCreateAccountStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.CreateAccountStatus]]]("CreateAccountStatuses"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListCreateAccountStatusResponse.apply _)
  }
  final implicit val ListCreateAccountStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListCreateAccountStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("States"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListCreateAccountStatusRequest.apply _)
  }
  final implicit val FinalizingOrganizationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.FinalizingOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.FinalizingOrganizationException.apply _)
  }
  final implicit val DuplicateAccountExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DuplicateAccountException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.DuplicateAccountException.apply _)
  }
  final implicit val ListHandshakesForAccountRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListHandshakesForAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.organizations.models.HandshakeFilter]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListHandshakesForAccountRequest.apply _)
  }
  final implicit val DestinationParentNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DestinationParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.DestinationParentNotFoundException.apply _)
  }
  final implicit val EnableAllFeaturesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.EnableAllFeaturesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Handshake]]("Handshake").map(org.lyranthe.araethura.organizations.models.EnableAllFeaturesResponse.apply _)
  }
  final implicit val ListRootsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListRootsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Root]]]("Roots"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListRootsResponse.apply _)
  }
  final implicit val CreateOrganizationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Organization]]("Organization").map(org.lyranthe.araethura.organizations.models.CreateOrganizationResponse.apply _)
  }
  final implicit val CreateOrganizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateOrganizationRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FeatureSet").map(org.lyranthe.araethura.organizations.models.CreateOrganizationRequest.apply _)
  }
  final implicit val ListChildrenRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListChildrenRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[java.lang.String]("ChildType"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListChildrenRequest.apply _)
  }
  final implicit val CreatePolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreatePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Content"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type")).mapN(org.lyranthe.araethura.organizations.models.CreatePolicyRequest.apply _)
  }
  final implicit val HandshakeResourceDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.HandshakeResource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.HandshakeResource]]]("Resources")).mapN(org.lyranthe.araethura.organizations.models.HandshakeResource.apply _)
  }
  final implicit val ChildDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Child] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Type")).mapN(org.lyranthe.araethura.organizations.models.Child.apply _)
  }
  final implicit val ListParentsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListParentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ChildId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListParentsRequest.apply _)
  }
  final implicit val DisableAWSServiceAccessRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DisableAWSServiceAccessRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServicePrincipal").map(org.lyranthe.araethura.organizations.models.DisableAWSServiceAccessRequest.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(org.lyranthe.araethura.organizations.models.InvalidInputException.apply _)
  }
  final implicit val UpdateOrganizationalUnitResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.UpdateOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.OrganizationalUnit]]("OrganizationalUnit").map(org.lyranthe.araethura.organizations.models.UpdateOrganizationalUnitResponse.apply _)
  }
  final implicit val HandshakeNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.HandshakeNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.HandshakeNotFoundException.apply _)
  }
  final implicit val RemoveAccountFromOrganizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.RemoveAccountFromOrganizationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccountId").map(org.lyranthe.araethura.organizations.models.RemoveAccountFromOrganizationRequest.apply _)
  }
  final implicit val PolicyInUseExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.PolicyInUseException.apply _)
  }
  final implicit val AccessDeniedForDependencyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.AccessDeniedForDependencyException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(org.lyranthe.araethura.organizations.models.AccessDeniedForDependencyException.apply _)
  }
  final implicit val DescribeOrganizationalUnitResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.DescribeOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.OrganizationalUnit]]("OrganizationalUnit").map(org.lyranthe.araethura.organizations.models.DescribeOrganizationalUnitResponse.apply _)
  }
  final implicit val ListAWSServiceAccessForOrganizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListAWSServiceAccessForOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListAWSServiceAccessForOrganizationRequest.apply _)
  }
  final implicit val OrganizationDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Organization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("MasterAccountArn"), o.get[scala.Option[java.lang.String]]("FeatureSet"), o.get[scala.Option[java.lang.String]]("MasterAccountEmail"), o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicyTypeSummary]]]("AvailablePolicyTypes"), o.get[scala.Option[java.lang.String]]("MasterAccountId"), o.get[scala.Option[java.lang.String]]("Id")).mapN(org.lyranthe.araethura.organizations.models.Organization.apply _)
  }
  final implicit val ConstraintViolationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ConstraintViolationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(org.lyranthe.araethura.organizations.models.ConstraintViolationException.apply _)
  }
  final implicit val EnablePolicyTypeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.EnablePolicyTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.Root]]("Root").map(org.lyranthe.araethura.organizations.models.EnablePolicyTypeResponse.apply _)
  }
  final implicit val ListChildrenResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListChildrenResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Child]]]("Children"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.organizations.models.ListChildrenResponse.apply _)
  }
  final implicit val EnableAWSServiceAccessRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.EnableAWSServiceAccessRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServicePrincipal").map(org.lyranthe.araethura.organizations.models.EnableAWSServiceAccessRequest.apply _)
  }
  final implicit val PolicyTypeNotEnabledExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.PolicyTypeNotEnabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.PolicyTypeNotEnabledException.apply _)
  }
  final implicit val ListHandshakesForOrganizationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ListHandshakesForOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.organizations.models.HandshakeFilter]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.organizations.models.ListHandshakesForOrganizationRequest.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.organizations.models.ConcurrentModificationException.apply _)
  }
  final implicit val CreateAccountResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.CreateAccountResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.organizations.models.CreateAccountStatus]]("CreateAccountStatus").map(org.lyranthe.araethura.organizations.models.CreateAccountResponse.apply _)
  }
  final implicit val ParentDecoder: io.circe.Decoder[org.lyranthe.araethura.organizations.models.Parent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Type")).mapN(org.lyranthe.araethura.organizations.models.Parent.apply _)
  }
}