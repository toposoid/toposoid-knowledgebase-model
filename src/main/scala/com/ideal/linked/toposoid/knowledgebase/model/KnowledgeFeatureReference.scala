/*
 * Copyright 2021 Linked Ideal LLC.[https://linked-ideal.com/]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ideal.linked.toposoid.knowledgebase.model

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param id
 * @param featureType
 * @param url
 * @param source
 * @param featureInputType
 * @param extentText
 */
case class KnowledgeFeatureReference(propositionId:String, sentenceId:String, featureId:String, featureType:Int, url:String = "", source:String = "", featureInputType:Int = 0, extentText:String = "{}")

object KnowledgeFeatureReference {
  implicit val jsonWrites: OWrites[KnowledgeFeatureReference] = Json.writes[KnowledgeFeatureReference]
  implicit val jsonReads: Reads[KnowledgeFeatureReference] = Json.reads[KnowledgeFeatureReference]
}
