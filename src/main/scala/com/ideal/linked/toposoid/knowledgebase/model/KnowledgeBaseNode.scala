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
 *　
 * @param nodeId ID that identifies the clause of the sentence
 * @param propositionId D that identifies a sentence set as a proposition
 * @param sentenceId ID that identifies a sentence in a sentence set as a proposition
 * @param predicateArgumentStructure Predicate argument structure analysis result
 * @param localContext localContext
 */
case class KnowledgeBaseNode(nodeId:String,
                              propositionId:String,
                              sentenceId:String,
                              predicateArgumentStructure:PredicateArgumentStructure,
                              localContext:LocalContext
                            )
object KnowledgeBaseNode {
  implicit val jsonWrites: OWrites[KnowledgeBaseNode] = Json.writes[KnowledgeBaseNode]
  implicit val jsonReads: Reads[KnowledgeBaseNode] = Json.reads[KnowledgeBaseNode]
}
