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

import play.api.libs.json.Json

/**
 * 文節に対する類義語を格納するためのモデル
 * @param sourceId 文節の正規化表現に対する類義語を識別するID
 * @param destinationId 類義語に対する文節を識別するID
 * @param similality 類似度（現在未使用）
 */
case class KnowledgeBaseSynonymEdge(sourceId:String, destinationId:String, similality:Float)
object KnowledgeBaseSynonymEdge {
  implicit val jsonWrites = Json.writes[KnowledgeBaseSynonymEdge]
  implicit val jsonReads = Json.reads[KnowledgeBaseSynonymEdge]
}
