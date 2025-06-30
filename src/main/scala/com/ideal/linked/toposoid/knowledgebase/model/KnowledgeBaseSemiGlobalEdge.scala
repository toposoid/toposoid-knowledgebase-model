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
 * A model that expresses the relationship of feature nodes
 * @param sourceId ID that identifies the parent of the dependency in a relationship between feature nodes
 * @param destinationId　An ID that identifies a dependency child in a relationship between feature nodes
 * @param logicType ref. KnowledgeBaseNodeのdependType
 */
case class KnowledgeBaseSemiGlobalEdge(sourceId:String, destinationId:String, logicType:String)

object KnowledgeBaseSemiGlobalEdge {
  implicit val jsonWrites: OWrites[KnowledgeBaseSemiGlobalEdge] = Json.writes[KnowledgeBaseSemiGlobalEdge]
  implicit val jsonReads: Reads[KnowledgeBaseSemiGlobalEdge] = Json.reads[KnowledgeBaseSemiGlobalEdge]
}
