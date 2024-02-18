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
 * @param lang language locale
 * @param namedEntity named entity
 * @param rangeExpressions　Quantity range representation
 * @param categories Category (For Japanese, see the KNP feature category)
 * @param domains Domain (For Japanese, refer to KNP's feature domain)
 * @param knowledgeFeatureReference feature's information
 */
case class LocalContext(lang:String,
                        namedEntity: String,
                        rangeExpressions: Map[String, Map[String, String]],
                        categories: Map[String, String],
                        domains: Map[String, String],
                        knowledgeFeatureReferences: List[KnowledgeFeatureReference]
                       )

object LocalContext {
  implicit val jsonWrites: OWrites[LocalContext] = Json.writes[LocalContext]
  implicit val jsonReads: Reads[LocalContext] = Json.reads[LocalContext]
}
