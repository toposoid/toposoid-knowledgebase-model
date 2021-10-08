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
 *
 * @param nodeId 文章の文節を識別するID
 * @param propositionId 命題としての文章集合を識別するID
 * @param currentId 文章の何番目の文節かを識別するID
 * @param parentId 当該の文節が係っている文節のID
 * @param isMainSection 文末を表すフラグ ture/false
 * @param surface 文節の表層
 * @param normalizedName 文節の正規化表現（KNPのfeatureの正規化代表表記参照）
 * @param dependType　親の文節との関係　依存関係:D、並列関係:P
 * @param caseType 文節の格情報（KNPのfeatureの係参照）
 * @param namedEntity 固有表現（KNPのfeatureのNE参照）
 * @param rangeExpressions 範囲表現
 * @param categories カテゴリ（KNPのfeatureのカテゴリ参照）
 * @param domains ドメイン（KNPのfeatureのドメイン参照）
 * @param isDenial 否定表現を表すフラグ true/false (KNPのfeatureの否定参照)
 * @param isConditionalConnection 条件節及びそれに類する節を表すフラグ（KNPのfeatureの条件節候補参照）
 * @param normalizedNameYomi　文節の正規化表現の読み仮名
 * @param surfaceYomi 文節の表層の読み仮名
 * @param modalityType モダリティ（KNPのfeatureのモダリティ参照）
 * @param logicType (KNPの並列タイプ参照、その他包含関係はIMPという種別もあり)
 * @param nodeType com.ideal.linked.toposoid.common.SentenceType
 * @param extentText 拡張領域
 */
case class KnowledgeBaseNode(nodeId:String,
                             propositionId:String,
                             currentId:Int,
                             parentId:Int,
                             isMainSection:Boolean,
                             surface:String,
                             normalizedName:String,
                             dependType:String,
                             caseType:String,
                             namedEntity:String,
                             rangeExpressions:Map[String, Map[String, String]],
                             categories:Map[String,String],
                             domains:Map[String,String],
                             isDenial:Boolean,
                             isConditionalConnection:Boolean,
                             normalizedNameYomi:String,
                             surfaceYomi:String,
                             modalityType:String,
                             logicType:String,
                             nodeType:Int,
                             extentText:String = "{}"
                            )
object KnowledgeBaseNode {
  implicit val jsonWrites = Json.writes[KnowledgeBaseNode]
  implicit val jsonReads = Json.reads[KnowledgeBaseNode]
}
