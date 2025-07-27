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
