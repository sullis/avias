package org.lyranthe.araethura.resourcegroupstaggingapi.models
final case class GetTagValuesInput(key: java.lang.String, paginationToken: scala.Option[java.lang.String] = scala.None)
final case class InternalServiceException(message: scala.Option[java.lang.String] = scala.None)
final case class GetTagKeysOutput(paginationToken: scala.Option[java.lang.String] = scala.None, tagKeys: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class GetTagValuesOutput(paginationToken: scala.Option[java.lang.String] = scala.None, tagValues: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class GetResourcesOutput(paginationToken: scala.Option[java.lang.String] = scala.None, resourceTagMappingList: scala.Option[scala.List[org.lyranthe.araethura.resourcegroupstaggingapi.models.ResourceTagMapping]] = scala.None)
final case class GetTagKeysInput(paginationToken: scala.Option[java.lang.String] = scala.None)
final case class TagResourcesInput(resourceARNList: scala.List[java.lang.String], tags: scala.collection.immutable.Map[java.lang.String, java.lang.String])
final case class UntagResourcesInput(resourceARNList: scala.List[java.lang.String], tagKeys: scala.List[java.lang.String])
final case class GetResourcesInput(resourcesPerPage: scala.Option[scala.Int] = scala.None, paginationToken: scala.Option[java.lang.String] = scala.None, tagFilters: scala.Option[scala.List[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagFilter]] = scala.None, resourceTypeFilters: scala.Option[scala.List[java.lang.String]] = scala.None, tagsPerPage: scala.Option[scala.Int] = scala.None)
final case class TagResourcesOutput(failedResourcesMap: scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo]] = scala.None)
final case class PaginationTokenExpiredException(message: scala.Option[java.lang.String] = scala.None)
final case class UntagResourcesOutput(failedResourcesMap: scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo]] = scala.None)
final case class FailureInfo(statusCode: scala.Option[scala.Int] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class ResourceTagMapping(resourceARN: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[org.lyranthe.araethura.resourcegroupstaggingapi.models.Tag]] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
final case class Tag(key: java.lang.String, value: java.lang.String)
final case class ThrottledException(message: scala.Option[java.lang.String] = scala.None)
final case class TagFilter(key: scala.Option[java.lang.String] = scala.None, values: scala.Option[scala.List[java.lang.String]] = scala.None)