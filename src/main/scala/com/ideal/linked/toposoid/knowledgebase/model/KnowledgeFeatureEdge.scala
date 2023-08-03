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
 * A model that expresses the relationship of feature nodes
 * @param sourceId ID that identifies the parent of the dependency in a relationship between feature nodes
 * @param destinationId　An ID that identifies a dependency child in a relationship between feature nodes
 * @param logicType ref. KnowledgeBaseNodeのdependType
 * @param lang lang language locale
 */
case class KnowledgeFeatureEdge(sourceId:String, destinationId:String, logicType:String, lang:String))

object KnowledgeFeatureEdge {
  implicit val jsonWrites: OWrites[KnowledgeFeatureEdge] = Json.writes[KnowledgeFeatureEdge]
  implicit val jsonReads: Reads[KnowledgeFeatureEdge] = Json.reads[KnowledgeFeatureEdge]
}
