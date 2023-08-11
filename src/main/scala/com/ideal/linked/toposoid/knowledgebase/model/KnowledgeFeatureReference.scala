package com.ideal.linked.toposoid.knowledgebase.model

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param id
 * @param url
 * @param source
 * @param featureType
 * @param inputType
 */
case class KnowledgeFeatureReference(id:String, featureDataType:Int, url:String = "", source:String = "", featureInputType:Int = 0, extentText:String = "{}")

object KnowledgeBaseNode {
  implicit val jsonWrites: OWrites[KnowledgeFeatureReference] = Json.writes[KnowledgeFeatureReference]
  implicit val jsonReads: Reads[KnowledgeFeatureReference] = Json.reads[KnowledgeFeatureReference]
}
