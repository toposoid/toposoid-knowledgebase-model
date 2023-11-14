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
 * A model for storing the results of predicate-argument structure analysis of sentences
 * @param sourceId ID that identifies the child of the dependency in the relation between clauses
 * @param destinationId　ID that identifies the dependent parent in the relation between clauses
 * @param caseStr　Relations between clauses (case structure, etc.)
 * @param dependType ref. KnowledgeBaseNodeのdependType
 * @param logicType　ref. KnowledgeBaseNodeのlogicType
 */
case class KnowledgeBaseEdge(sourceId:String, destinationId:String, caseStr:String, dependType:String, parallelType:String, logicType:String)
object KnowledgeBaseEdge {
  implicit val jsonWrites: OWrites[KnowledgeBaseEdge] = Json.writes[KnowledgeBaseEdge]
  implicit val jsonReads: Reads[KnowledgeBaseEdge] = Json.reads[KnowledgeBaseEdge]
}

