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
 * model representing feature nodes
 * @param propositionId　A unique ID that identifies the node
 * @param sentenceId A unique ID that identifies the sentence
 * @param sentence sentence
 * @param sentenceType com.ideal.linked.toposoid.common.SentenceType
 * @param localContextForFeature localContextForFeature
 */
case class KnowledgeBaseSemiGlobalNode(sentenceId: String,
                                propositionId: String,
                                documentId: String,
                                sentence: String,
                                sentenceType:Int,
                                localContextForFeature: LocalContextForFeature
                               )

object KnowledgeBaseSemiGlobalNode {
  implicit val jsonWrites: OWrites[KnowledgeBaseSemiGlobalNode] = Json.writes[KnowledgeBaseSemiGlobalNode]
  implicit val jsonReads: Reads[KnowledgeBaseSemiGlobalNode] = Json.reads[KnowledgeBaseSemiGlobalNode]
}
