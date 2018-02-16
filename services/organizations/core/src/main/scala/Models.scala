package org.lyranthe.araethura.organizations.models
final case class DuplicateOrganizationalUnitException(message: scala.Option[java.lang.String] = scala.None)
final case class OrganizationalUnitNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class CancelHandshakeRequest(handshakeId: java.lang.String)
final case class DescribeCreateAccountStatusResponse(createAccountStatus: scala.Option[org.lyranthe.araethura.organizations.models.CreateAccountStatus] = scala.None)
final case class Account(joinedTimestamp: scala.Option[java.time.Instant] = scala.None, joinedMethod: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, email: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, id: scala.Option[java.lang.String] = scala.None)
final case class ListTargetsForPolicyRequest(policyId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DuplicatePolicyAttachmentException(message: scala.Option[java.lang.String] = scala.None)
final case class PolicyTargetSummary(targetId: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class HandshakeParty(id: java.lang.String, `type`: java.lang.String)
final case class ListTargetsForPolicyResponse(targets: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicyTargetSummary]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class OrganizationalUnitNotEmptyException(message: scala.Option[java.lang.String] = scala.None)
final case class MasterCannotLeaveOrganizationException(message: scala.Option[java.lang.String] = scala.None)
final case class InviteAccountToOrganizationRequest(target: org.lyranthe.araethura.organizations.models.HandshakeParty, notes: scala.Option[java.lang.String] = scala.None)
final case class PolicyTypeNotAvailableForOrganizationException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeAccountRequest(accountId: java.lang.String)
final case class PolicySummary(awsManaged: scala.Option[scala.Boolean] = scala.None, id: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None)
final case class AttachPolicyRequest(policyId: java.lang.String, targetId: java.lang.String)
final case class ListParentsResponse(parents: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Parent]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribePolicyResponse(policy: scala.Option[org.lyranthe.araethura.organizations.models.Policy] = scala.None)
final case class DescribeOrganizationalUnitRequest(organizationalUnitId: java.lang.String)
final case class DeletePolicyRequest(policyId: java.lang.String)
final case class ParentNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class OrganizationNotEmptyException(message: scala.Option[java.lang.String] = scala.None)
final case class DeclineHandshakeResponse(handshake: scala.Option[org.lyranthe.araethura.organizations.models.Handshake] = scala.None)
final case class HandshakeAlreadyInStateException(message: scala.Option[java.lang.String] = scala.None)
final case class MalformedPolicyDocumentException(message: scala.Option[java.lang.String] = scala.None)
final case class CreateOrganizationalUnitRequest(parentId: java.lang.String, name: java.lang.String)
final case class DuplicatePolicyException(message: scala.Option[java.lang.String] = scala.None)
final case class HandshakeFilter(actionType: scala.Option[java.lang.String] = scala.None, parentHandshakeId: scala.Option[java.lang.String] = scala.None)
final case class UpdateOrganizationalUnitRequest(organizationalUnitId: java.lang.String, name: scala.Option[java.lang.String] = scala.None)
final case class DuplicateHandshakeException(message: scala.Option[java.lang.String] = scala.None)
final case class InvalidHandshakeTransitionException(message: scala.Option[java.lang.String] = scala.None)
final case class UpdatePolicyRequest(policyId: java.lang.String, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, content: scala.Option[java.lang.String] = scala.None)
final case class ListPoliciesResponse(policies: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicySummary]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Root(id: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, policyTypes: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicyTypeSummary]] = scala.None)
final case class DeleteOrganizationalUnitRequest(organizationalUnitId: java.lang.String)
final case class ListRootsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DescribeCreateAccountStatusRequest(createAccountRequestId: java.lang.String)
final case class HandshakeConstraintViolationException(message: scala.Option[java.lang.String] = scala.None, reason: scala.Option[java.lang.String] = scala.None)
final case class PolicyNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class CancelHandshakeResponse(handshake: scala.Option[org.lyranthe.araethura.organizations.models.Handshake] = scala.None)
final case class SourceParentNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class TargetNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class CreateAccountStatusNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class AccessDeniedException(message: scala.Option[java.lang.String] = scala.None)
final case class DisablePolicyTypeResponse(root: scala.Option[org.lyranthe.araethura.organizations.models.Root] = scala.None)
final case class ListOrganizationalUnitsForParentRequest(parentId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ListAccountsResponse(accounts: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Account]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListPoliciesRequest(filter: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object EnableAllFeaturesRequest
final case class ListHandshakesForOrganizationResponse(handshakes: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Handshake]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class MoveAccountRequest(accountId: java.lang.String, sourceParentId: java.lang.String, destinationParentId: java.lang.String)
final case class Handshake(requestedTimestamp: scala.Option[java.time.Instant] = scala.None, expirationTimestamp: scala.Option[java.time.Instant] = scala.None, resources: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.HandshakeResource]] = scala.None, id: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, parties: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.HandshakeParty]] = scala.None, state: scala.Option[java.lang.String] = scala.None, action: scala.Option[java.lang.String] = scala.None)
final case class PolicyTypeSummary(`type`: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class ListAccountsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ChildNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class ListAccountsForParentResponse(accounts: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Account]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Policy(policySummary: scala.Option[org.lyranthe.araethura.organizations.models.PolicySummary] = scala.None, content: scala.Option[java.lang.String] = scala.None)
final case class DescribeHandshakeRequest(handshakeId: java.lang.String)
final case class DescribePolicyRequest(policyId: java.lang.String)
final case class CreateAccountStatus(id: scala.Option[java.lang.String] = scala.None, requestedTimestamp: scala.Option[java.time.Instant] = scala.None, completedTimestamp: scala.Option[java.time.Instant] = scala.None, state: scala.Option[java.lang.String] = scala.None, accountName: scala.Option[java.lang.String] = scala.None, accountId: scala.Option[java.lang.String] = scala.None, failureReason: scala.Option[java.lang.String] = scala.None)
final case class UpdatePolicyResponse(policy: scala.Option[org.lyranthe.araethura.organizations.models.Policy] = scala.None)
final case class EnabledServicePrincipal(servicePrincipal: scala.Option[java.lang.String] = scala.None, dateEnabled: scala.Option[java.time.Instant] = scala.None)
final case class DescribeOrganizationResponse(organization: scala.Option[org.lyranthe.araethura.organizations.models.Organization] = scala.None)
final case class DescribeHandshakeResponse(handshake: scala.Option[org.lyranthe.araethura.organizations.models.Handshake] = scala.None)
final case class DescribeAccountResponse(account: scala.Option[org.lyranthe.araethura.organizations.models.Account] = scala.None)
final case class DisablePolicyTypeRequest(rootId: java.lang.String, policyType: java.lang.String)
final case class CreateOrganizationalUnitResponse(organizationalUnit: scala.Option[org.lyranthe.araethura.organizations.models.OrganizationalUnit] = scala.None)
final case class PolicyTypeAlreadyEnabledException(message: scala.Option[java.lang.String] = scala.None)
final case class EnablePolicyTypeRequest(rootId: java.lang.String, policyType: java.lang.String)
final case class AWSOrganizationsNotInUseException(message: scala.Option[java.lang.String] = scala.None)
final case class OrganizationalUnit(id: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class ListAWSServiceAccessForOrganizationResponse(enabledServicePrincipals: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.EnabledServicePrincipal]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AcceptHandshakeResponse(handshake: scala.Option[org.lyranthe.araethura.organizations.models.Handshake] = scala.None)
final case class AlreadyInOrganizationException(message: scala.Option[java.lang.String] = scala.None)
final case class ListHandshakesForAccountResponse(handshakes: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Handshake]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DetachPolicyRequest(policyId: java.lang.String, targetId: java.lang.String)
final case class ListOrganizationalUnitsForParentResponse(organizationalUnits: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.OrganizationalUnit]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class InviteAccountToOrganizationResponse(handshake: scala.Option[org.lyranthe.araethura.organizations.models.Handshake] = scala.None)
final case class AcceptHandshakeRequest(handshakeId: java.lang.String)
final case class CreatePolicyResponse(policy: scala.Option[org.lyranthe.araethura.organizations.models.Policy] = scala.None)
final case class AccountNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class ListPoliciesForTargetRequest(targetId: java.lang.String, filter: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ListPoliciesForTargetResponse(policies: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicySummary]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class TooManyRequestsException(`type`: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None)
final case class ListAccountsForParentRequest(parentId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DeclineHandshakeRequest(handshakeId: java.lang.String)
final case class CreateAccountRequest(email: java.lang.String, accountName: java.lang.String, roleName: scala.Option[java.lang.String] = scala.None, iamUserAccessToBilling: scala.Option[java.lang.String] = scala.None)
final case class ServiceException(message: scala.Option[java.lang.String] = scala.None)
final case class RootNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class PolicyNotAttachedException(message: scala.Option[java.lang.String] = scala.None)
final case class ListCreateAccountStatusResponse(createAccountStatuses: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.CreateAccountStatus]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListCreateAccountStatusRequest(states: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class FinalizingOrganizationException(message: scala.Option[java.lang.String] = scala.None)
final case class DuplicateAccountException(message: scala.Option[java.lang.String] = scala.None)
final case class ListHandshakesForAccountRequest(filter: scala.Option[org.lyranthe.araethura.organizations.models.HandshakeFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DestinationParentNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class EnableAllFeaturesResponse(handshake: scala.Option[org.lyranthe.araethura.organizations.models.Handshake] = scala.None)
final case class ListRootsResponse(roots: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Root]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateOrganizationResponse(organization: scala.Option[org.lyranthe.araethura.organizations.models.Organization] = scala.None)
final case class CreateOrganizationRequest(featureSet: scala.Option[java.lang.String] = scala.None)
final case class ListChildrenRequest(parentId: java.lang.String, childType: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class CreatePolicyRequest(content: java.lang.String, description: java.lang.String, name: java.lang.String, `type`: java.lang.String)
final case class HandshakeResource(value: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, resources: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.HandshakeResource]] = scala.None)
final case class Child(id: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class ListParentsRequest(childId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DisableAWSServiceAccessRequest(servicePrincipal: java.lang.String)
final case class InvalidInputException(message: scala.Option[java.lang.String] = scala.None, reason: scala.Option[java.lang.String] = scala.None)
final case class UpdateOrganizationalUnitResponse(organizationalUnit: scala.Option[org.lyranthe.araethura.organizations.models.OrganizationalUnit] = scala.None)
final case class HandshakeNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class RemoveAccountFromOrganizationRequest(accountId: java.lang.String)
final case class PolicyInUseException(message: scala.Option[java.lang.String] = scala.None)
final case class AccessDeniedForDependencyException(message: scala.Option[java.lang.String] = scala.None, reason: scala.Option[java.lang.String] = scala.None)
final case class DescribeOrganizationalUnitResponse(organizationalUnit: scala.Option[org.lyranthe.araethura.organizations.models.OrganizationalUnit] = scala.None)
final case class ListAWSServiceAccessForOrganizationRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class Organization(arn: scala.Option[java.lang.String] = scala.None, masterAccountArn: scala.Option[java.lang.String] = scala.None, featureSet: scala.Option[java.lang.String] = scala.None, masterAccountEmail: scala.Option[java.lang.String] = scala.None, availablePolicyTypes: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.PolicyTypeSummary]] = scala.None, masterAccountId: scala.Option[java.lang.String] = scala.None, id: scala.Option[java.lang.String] = scala.None)
final case class ConstraintViolationException(message: scala.Option[java.lang.String] = scala.None, reason: scala.Option[java.lang.String] = scala.None)
final case class EnablePolicyTypeResponse(root: scala.Option[org.lyranthe.araethura.organizations.models.Root] = scala.None)
final case class ListChildrenResponse(children: scala.Option[scala.List[org.lyranthe.araethura.organizations.models.Child]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class EnableAWSServiceAccessRequest(servicePrincipal: java.lang.String)
final case class PolicyTypeNotEnabledException(message: scala.Option[java.lang.String] = scala.None)
final case class ListHandshakesForOrganizationRequest(filter: scala.Option[org.lyranthe.araethura.organizations.models.HandshakeFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ConcurrentModificationException(message: scala.Option[java.lang.String] = scala.None)
final case class CreateAccountResponse(createAccountStatus: scala.Option[org.lyranthe.araethura.organizations.models.CreateAccountStatus] = scala.None)
final case class Parent(id: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)