package org.lyranthe.araethura.cloudhsm
trait Amazoncloudhsm[F[_]] {
  def deleteLunaClient(input: org.lyranthe.araethura.cloudhsm.models.DeleteLunaClientRequest): F[org.lyranthe.araethura.cloudhsm.models.DeleteLunaClientResponse]
  def describeHapg(input: org.lyranthe.araethura.cloudhsm.models.DescribeHapgRequest): F[org.lyranthe.araethura.cloudhsm.models.DescribeHapgResponse]
  def describeLunaClient(input: org.lyranthe.araethura.cloudhsm.models.DescribeLunaClientRequest): F[org.lyranthe.araethura.cloudhsm.models.DescribeLunaClientResponse]
  def modifyLunaClient(input: org.lyranthe.araethura.cloudhsm.models.ModifyLunaClientRequest): F[org.lyranthe.araethura.cloudhsm.models.ModifyLunaClientResponse]
  def createHapg(input: org.lyranthe.araethura.cloudhsm.models.CreateHapgRequest): F[org.lyranthe.araethura.cloudhsm.models.CreateHapgResponse]
  def addTagsToResource(input: org.lyranthe.araethura.cloudhsm.models.AddTagsToResourceRequest): F[org.lyranthe.araethura.cloudhsm.models.AddTagsToResourceResponse]
  def listHapgs(input: org.lyranthe.araethura.cloudhsm.models.ListHapgsRequest): F[org.lyranthe.araethura.cloudhsm.models.ListHapgsResponse]
  def listLunaClients(input: org.lyranthe.araethura.cloudhsm.models.ListLunaClientsRequest): F[org.lyranthe.araethura.cloudhsm.models.ListLunaClientsResponse]
  def deleteHapg(input: org.lyranthe.araethura.cloudhsm.models.DeleteHapgRequest): F[org.lyranthe.araethura.cloudhsm.models.DeleteHapgResponse]
  def getConfig(input: org.lyranthe.araethura.cloudhsm.models.GetConfigRequest): F[org.lyranthe.araethura.cloudhsm.models.GetConfigResponse]
  def listTagsForResource(input: org.lyranthe.araethura.cloudhsm.models.ListTagsForResourceRequest): F[org.lyranthe.araethura.cloudhsm.models.ListTagsForResourceResponse]
  def listAvailableZones: F[org.lyranthe.araethura.cloudhsm.models.ListAvailableZonesResponse]
  def modifyHapg(input: org.lyranthe.araethura.cloudhsm.models.ModifyHapgRequest): F[org.lyranthe.araethura.cloudhsm.models.ModifyHapgResponse]
  def removeTagsFromResource(input: org.lyranthe.araethura.cloudhsm.models.RemoveTagsFromResourceRequest): F[org.lyranthe.araethura.cloudhsm.models.RemoveTagsFromResourceResponse]
  def listHsms(input: org.lyranthe.araethura.cloudhsm.models.ListHsmsRequest): F[org.lyranthe.araethura.cloudhsm.models.ListHsmsResponse]
  def deleteHsm(input: org.lyranthe.araethura.cloudhsm.models.DeleteHsmRequest): F[org.lyranthe.araethura.cloudhsm.models.DeleteHsmResponse]
  def createHsm(input: org.lyranthe.araethura.cloudhsm.models.CreateHsmRequest): F[org.lyranthe.araethura.cloudhsm.models.CreateHsmResponse]
  def createLunaClient(input: org.lyranthe.araethura.cloudhsm.models.CreateLunaClientRequest): F[org.lyranthe.araethura.cloudhsm.models.CreateLunaClientResponse]
  def describeHsm(input: org.lyranthe.araethura.cloudhsm.models.DescribeHsmRequest): F[org.lyranthe.araethura.cloudhsm.models.DescribeHsmResponse]
  def modifyHsm(input: org.lyranthe.araethura.cloudhsm.models.ModifyHsmRequest): F[org.lyranthe.araethura.cloudhsm.models.ModifyHsmResponse]
}