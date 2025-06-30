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

package com.ideal.linked.toposoid.knowledgebase.regist.model

import play.api.libs.json.{Json, OWrites, Reads}

/**
 * A model that defines the logical relationships between knowledge
 * @param operator Logical relationship between knowledge. [AND, OR]
 * @param sourceIndex Index of the source clause
 * @param destinationIndex Index of the destination clause
 */
case class PropositionRelation(operator:String, sourceIndex:Int, destinationIndex:Int)
object PropositionRelation {
  implicit val jsonWrites: OWrites[PropositionRelation] = Json.writes[PropositionRelation]
  implicit val jsonReads: Reads[PropositionRelation] = Json.reads[PropositionRelation]
}
