package org.lyranthe.araethura.ecr.models
final case class CreateRepositoryRequest(repositoryName: java.lang.String)
final case class BatchDeleteImageResponse(imageIds: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageIdentifier]] = scala.None, failures: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageFailure]] = scala.None)
final case class BatchGetImageRequest(repositoryName: java.lang.String, imageIds: scala.List[org.lyranthe.araethura.ecr.models.ImageIdentifier], registryId: scala.Option[java.lang.String] = scala.None, acceptedMediaTypes: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class BatchCheckLayerAvailabilityRequest(repositoryName: java.lang.String, layerDigests: scala.List[java.lang.String], registryId: scala.Option[java.lang.String] = scala.None)
final case class DeleteRepositoryPolicyRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class UploadNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class GetLifecyclePolicyPreviewRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, filter: scala.Option[org.lyranthe.araethura.ecr.models.LifecyclePolicyPreviewFilter] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, imageIds: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageIdentifier]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class PutImageRequest(repositoryName: java.lang.String, imageManifest: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, imageTag: scala.Option[java.lang.String] = scala.None)
final case class DeleteLifecyclePolicyResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, lifecyclePolicyText: scala.Option[java.lang.String] = scala.None, lastEvaluatedAt: scala.Option[java.time.Instant] = scala.None)
final case class LifecyclePolicyPreviewFilter(tagStatus: scala.Option[java.lang.String] = scala.None)
final case class LifecyclePolicyPreviewSummary(expiringImageTotalCount: scala.Option[scala.Int] = scala.None)
final case class DeleteRepositoryResponse(repository: scala.Option[org.lyranthe.araethura.ecr.models.Repository] = scala.None)
final case class LayerFailure(layerDigest: scala.Option[java.lang.String] = scala.None, failureCode: scala.Option[java.lang.String] = scala.None, failureReason: scala.Option[java.lang.String] = scala.None)
final case class LifecyclePolicyPreviewNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class BatchCheckLayerAvailabilityResponse(layers: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.Layer]] = scala.None, failures: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.LayerFailure]] = scala.None)
final case class ListImagesResponse(imageIds: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageIdentifier]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class StartLifecyclePolicyPreviewResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, lifecyclePolicyText: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class CompleteLayerUploadResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, uploadId: scala.Option[java.lang.String] = scala.None, layerDigest: scala.Option[java.lang.String] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
final case class InitiateLayerUploadRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class GetLifecyclePolicyPreviewResponse(registryId: scala.Option[java.lang.String] = scala.None, summary: scala.Option[org.lyranthe.araethura.ecr.models.LifecyclePolicyPreviewSummary] = scala.None, status: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, previewResults: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.LifecyclePolicyPreviewResult]] = scala.None, lifecyclePolicyText: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListImagesFilter(tagStatus: scala.Option[java.lang.String] = scala.None)
final case class InvalidLayerPartException(registryId: scala.Option[java.lang.String] = scala.None, lastValidByteReceived: scala.Option[scala.Long] = scala.None, message: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, uploadId: scala.Option[java.lang.String] = scala.None)
final case class BatchGetImageResponse(images: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.Image]] = scala.None, failures: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageFailure]] = scala.None)
final case class Repository(registryId: scala.Option[java.lang.String] = scala.None, repositoryArn: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, repositoryUri: scala.Option[java.lang.String] = scala.None)
final case class SetRepositoryPolicyResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, policyText: scala.Option[java.lang.String] = scala.None)
final case class AuthorizationData(authorizationToken: scala.Option[java.lang.String] = scala.None, expiresAt: scala.Option[java.time.Instant] = scala.None, proxyEndpoint: scala.Option[java.lang.String] = scala.None)
final case class EmptyUploadException(message: scala.Option[java.lang.String] = scala.None)
final case class RepositoryNotEmptyException(message: scala.Option[java.lang.String] = scala.None)
final case class DeleteLifecyclePolicyRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class GetLifecyclePolicyRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class GetRepositoryPolicyRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class GetAuthorizationTokenResponse(authorizationData: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.AuthorizationData]] = scala.None)
final case class ImageFailure(imageId: scala.Option[org.lyranthe.araethura.ecr.models.ImageIdentifier] = scala.None, failureCode: scala.Option[java.lang.String] = scala.None, failureReason: scala.Option[java.lang.String] = scala.None)
final case class StartLifecyclePolicyPreviewRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, lifecyclePolicyText: scala.Option[java.lang.String] = scala.None)
final case class DescribeRepositoriesRequest(registryId: scala.Option[java.lang.String] = scala.None, repositoryNames: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DeleteRepositoryRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, force: scala.Option[scala.Boolean] = scala.None)
final case class PutImageResponse(image: scala.Option[org.lyranthe.araethura.ecr.models.Image] = scala.None)
final case class ImageAlreadyExistsException(message: scala.Option[java.lang.String] = scala.None)
final case class InitiateLayerUploadResponse(uploadId: scala.Option[java.lang.String] = scala.None, partSize: scala.Option[scala.Long] = scala.None)
final case class CreateRepositoryResponse(repository: scala.Option[org.lyranthe.araethura.ecr.models.Repository] = scala.None)
final case class ListImagesRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, filter: scala.Option[org.lyranthe.araethura.ecr.models.ListImagesFilter] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CompleteLayerUploadRequest(repositoryName: java.lang.String, uploadId: java.lang.String, layerDigests: scala.List[java.lang.String], registryId: scala.Option[java.lang.String] = scala.None)
final case class GetDownloadUrlForLayerRequest(repositoryName: java.lang.String, layerDigest: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class LifecyclePolicyPreviewInProgressException(message: scala.Option[java.lang.String] = scala.None)
final case class LayersNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class UploadLayerPartResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, uploadId: scala.Option[java.lang.String] = scala.None, lastByteReceived: scala.Option[scala.Long] = scala.None)
final case class GetLifecyclePolicyResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, lifecyclePolicyText: scala.Option[java.lang.String] = scala.None, lastEvaluatedAt: scala.Option[java.time.Instant] = scala.None)
final case class DescribeImagesResponse(imageDetails: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageDetail]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class RepositoryNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class SetRepositoryPolicyRequest(repositoryName: java.lang.String, policyText: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, force: scala.Option[scala.Boolean] = scala.None)
final case class Layer(layerDigest: scala.Option[java.lang.String] = scala.None, layerAvailability: scala.Option[java.lang.String] = scala.None, layerSize: scala.Option[scala.Long] = scala.None, mediaType: scala.Option[java.lang.String] = scala.None)
final case class DescribeRepositoriesResponse(repositories: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.Repository]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeImagesRequest(repositoryName: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, imageIds: scala.Option[scala.List[org.lyranthe.araethura.ecr.models.ImageIdentifier]] = scala.None, filter: scala.Option[org.lyranthe.araethura.ecr.models.DescribeImagesFilter] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class RepositoryAlreadyExistsException(message: scala.Option[java.lang.String] = scala.None)
final case class ImageDetail(registryId: scala.Option[java.lang.String] = scala.None, imageDigest: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, imageSizeInBytes: scala.Option[scala.Long] = scala.None, imageTags: scala.Option[scala.List[java.lang.String]] = scala.None, imagePushedAt: scala.Option[java.time.Instant] = scala.None)
final case class LimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class LifecyclePolicyPreviewResult(imageDigest: scala.Option[java.lang.String] = scala.None, imageTags: scala.Option[scala.List[java.lang.String]] = scala.None, imagePushedAt: scala.Option[java.time.Instant] = scala.None, appliedRulePriority: scala.Option[scala.Int] = scala.None, action: scala.Option[org.lyranthe.araethura.ecr.models.LifecyclePolicyRuleAction] = scala.None)
final case class RepositoryPolicyNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class LayerAlreadyExistsException(message: scala.Option[java.lang.String] = scala.None)
final case class LifecyclePolicyNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class LayerInaccessibleException(message: scala.Option[java.lang.String] = scala.None)
final case class GetAuthorizationTokenRequest(registryIds: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class PutLifecyclePolicyRequest(repositoryName: java.lang.String, lifecyclePolicyText: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class PutLifecyclePolicyResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, lifecyclePolicyText: scala.Option[java.lang.String] = scala.None)
final case class GetDownloadUrlForLayerResponse(downloadUrl: scala.Option[java.lang.String] = scala.None, layerDigest: scala.Option[java.lang.String] = scala.None)
final case class DeleteRepositoryPolicyResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, policyText: scala.Option[java.lang.String] = scala.None)
final case class BatchDeleteImageRequest(repositoryName: java.lang.String, imageIds: scala.List[org.lyranthe.araethura.ecr.models.ImageIdentifier], registryId: scala.Option[java.lang.String] = scala.None)
final case class LayerPartTooSmallException(message: scala.Option[java.lang.String] = scala.None)
final case class ServerException(message: scala.Option[java.lang.String] = scala.None)
final case class GetRepositoryPolicyResponse(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, policyText: scala.Option[java.lang.String] = scala.None)
final case class UploadLayerPartRequest(partFirstByte: scala.Long, partLastByte: scala.Long, layerPartBlob: scala.Array[scala.Byte], repositoryName: java.lang.String, uploadId: java.lang.String, registryId: scala.Option[java.lang.String] = scala.None)
final case class DescribeImagesFilter(tagStatus: scala.Option[java.lang.String] = scala.None)
final case class ImageIdentifier(imageDigest: scala.Option[java.lang.String] = scala.None, imageTag: scala.Option[java.lang.String] = scala.None)
final case class InvalidLayerException(message: scala.Option[java.lang.String] = scala.None)
final case class ImageNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class Image(registryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, imageId: scala.Option[org.lyranthe.araethura.ecr.models.ImageIdentifier] = scala.None, imageManifest: scala.Option[java.lang.String] = scala.None)
final case class LifecyclePolicyRuleAction(`type`: scala.Option[java.lang.String] = scala.None)