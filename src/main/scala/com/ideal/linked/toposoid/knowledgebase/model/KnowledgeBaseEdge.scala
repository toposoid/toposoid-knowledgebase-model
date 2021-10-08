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
 * 日本語の文章を述語項構造解析した結果を格納するためのモデル
 * @param sourceId 文節間の関係で係受けの子を識別するID
 * @param destinationId　文節間の関係で係受けの親を識別するID
 * @param caseStr　文節間の関係（格構造 etc）
 * @param dependType KnowledgeBaseNodeのdependType参照
 * @param logicType　KnowledgeBaseNodeのlogicType参照
 */
case class KnowledgeBaseEdge(sourceId:String, destinationId:String, caseStr:String, dependType:String, logicType:String)
object KnowledgeBaseEdge {
  implicit val jsonWrites = Json.writes[KnowledgeBaseEdge]
  implicit val jsonReads = Json.reads[KnowledgeBaseEdge]
}

