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

package com.ideal.linked.toposoid.knowledgebase.regist.model

import play.api.libs.json.Json

/**
 * This model used when registering natural sentences as a knowledge graph in the database
 * @param premiseList Premise knowledge list
 * @param premiseLogicRelation　List of Proposition Relations on the premise side
 * @param claimList Claim knowledge list
 * @param claimLogicRelation List of Proposition Relations on the premise side
 */
case class KnowledgeSentenceSet(premiseList:List[Knowledge],premiseLogicRelation:List[PropositionRelation], claimList:List[Knowledge], claimLogicRelation:List[PropositionRelation])
object KnowledgeSentenceSet {
  implicit val jsonWrites = Json.writes[KnowledgeSentenceSet]
  implicit val jsonReads = Json.reads[KnowledgeSentenceSet]
}

