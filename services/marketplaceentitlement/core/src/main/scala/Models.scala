package org.lyranthe.araethura.marketplaceentitlement.models
final case class Entitlement(productCode: scala.Option[java.lang.String] = scala.None, dimension: scala.Option[java.lang.String] = scala.None, customerIdentifier: scala.Option[java.lang.String] = scala.None, value: scala.Option[org.lyranthe.araethura.marketplaceentitlement.models.EntitlementValue] = scala.None, expirationDate: scala.Option[java.time.Instant] = scala.None)
final case class GetEntitlementsRequest(productCode: java.lang.String, filter: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class InternalServiceErrorException(message: scala.Option[java.lang.String] = scala.None)
final case class EntitlementValue(integerValue: scala.Option[scala.Int] = scala.None, doubleValue: scala.Option[scala.Double] = scala.None, booleanValue: scala.Option[scala.Boolean] = scala.None, stringValue: scala.Option[java.lang.String] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
final case class ThrottlingException(message: scala.Option[java.lang.String] = scala.None)
final case class GetEntitlementsResult(entitlements: scala.Option[scala.List[org.lyranthe.araethura.marketplaceentitlement.models.Entitlement]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)