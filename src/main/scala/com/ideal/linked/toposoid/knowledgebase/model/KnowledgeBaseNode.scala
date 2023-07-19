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

import play.api.libs.json.Json

/**
 * 日本語の文章を述語項構造解析した結果を格納するためのモデル
 * ref.
 * https://nlp.ist.i.kyoto-u.ac.jp/?plugin=attach&refer=KNP&openfile=knp_feature.pdf
 * @param nodeId 文章の文節を識別するID
 * @param propositionId 命題としての文章集合を識別するID
 * @param sentenceId 命題としての文章集合中の文章を識別するID
 * @param predicateArgumentStructure
 * @param localContext
 * @param extentText 拡張領域
 */
case class KnowledgeBaseNode(nodeId:String,
                              propositionId:String,
                              sentenceId:String,
                              predicateArgumentStructure:PredicateArgumentStructure,
                              localContext:LocalContext,
                              extentText:String = "{}",
                            )
object KnowledgeBaseNode {
  implicit val jsonWrites = Json.writes[KnowledgeBaseNode]
  implicit val jsonReads = Json.reads[KnowledgeBaseNode]
}
