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

