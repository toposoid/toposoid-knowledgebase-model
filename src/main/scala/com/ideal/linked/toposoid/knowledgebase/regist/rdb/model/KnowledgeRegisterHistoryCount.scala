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

package com.ideal.linked.toposoid.knowledgebase.regist.rdb.model

import play.api.libs.json.{Json, OWrites, Reads}

case class KnowledgeRegisterHistoryCount(documentId:String, count:Int)
object KnowledgeRegisterHistoryCount {
  implicit val jsonWrites: OWrites[KnowledgeRegisterHistoryCount] = Json.writes[KnowledgeRegisterHistoryCount]
  implicit val jsonReads: Reads[KnowledgeRegisterHistoryCount] = Json.reads[KnowledgeRegisterHistoryCount]
}

