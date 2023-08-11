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
 *　A model for storing the results of predicate-argument structure analysis of sentences
 * ref. Japanese
 * https://nlp.ist.i.kyoto-u.ac.jp/?plugin=attach&refer=KNP&openfile=knp_feature.pdf
 * @param nodeId ID that identifies the clause of the sentence
 * @param propositionId D that identifies a sentence set as a proposition
 * @param sentenceId ID that identifies a sentence in a sentence set as a proposition
 * @param predicateArgumentStructure Predicate argument structure analysis result
 * @param localContext localContext
 * @param extentText Extended information area
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
