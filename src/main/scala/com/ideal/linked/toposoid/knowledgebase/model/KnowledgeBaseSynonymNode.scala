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
 * 文節に対する類義語を格納するためのモデル
 * @param nodeId 類義語を識別するID
 * @param nodeName 類義語
 * @param propositionId KnowledgeBaseNodeのpropositionId参照
 * @param sentenceId KnowledgeBaseNodeのsentenceId参照
 */
case class KnowledgeBaseSynonymNode(nodeId:String, nodeName:String, propositionId:String, sentenceId:String)
object KnowledgeBaseSynonymNode {
  implicit val jsonWrites: OWrites[KnowledgeBaseSynonymNode] = Json.writes[KnowledgeBaseSynonymNode]
  implicit val jsonReads: Reads[KnowledgeBaseSynonymNode] = Json.reads[KnowledgeBaseSynonymNode]
}

