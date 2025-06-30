/*
 * Copyright (C) 2025  Linked Ideal LLC.[https://linked-ideal.com/]
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
case class KnowledgeBaseEdge(sourceId:String, destinationId:String, caseStr:String, dependType:String, parallelType:String, hasInclusion:Boolean,  logicType:String)
object KnowledgeBaseEdge {
  implicit val jsonWrites: OWrites[KnowledgeBaseEdge] = Json.writes[KnowledgeBaseEdge]
  implicit val jsonReads: Reads[KnowledgeBaseEdge] = Json.reads[KnowledgeBaseEdge]
}

