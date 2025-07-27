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
 * This model used when registering natural sentences as a knowledge graph in the database
 * @param premiseList Premise knowledge list
 * @param premiseLogicRelation　List of Proposition Relations on the premise side
 * @param claimList Claim knowledge list
 * @param claimLogicRelation List of Proposition Relations on the premise side
 */
case class KnowledgeSentenceSet(premiseList:List[Knowledge],premiseLogicRelation:List[PropositionRelation], claimList:List[Knowledge], claimLogicRelation:List[PropositionRelation])
object KnowledgeSentenceSet {
  implicit val jsonWrites: OWrites[KnowledgeSentenceSet] = Json.writes[KnowledgeSentenceSet]
  implicit val jsonReads: Reads[KnowledgeSentenceSet] = Json.reads[KnowledgeSentenceSet]
}

