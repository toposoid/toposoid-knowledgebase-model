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
 * A model for storing the results of predicate-argument structure analysis of sentences
 * ref. Japanese
 * https://nlp.ist.i.kyoto-u.ac.jp/?plugin=attach&refer=KNP&openfile=knp_feature.pdf
 * @param currentId 文章の何番目の文節かを識別するID
 * @param parentId 当該の文節が係っている文節のID
 * @param isMainSection 文末を表すフラグ ture/false
 * @param surface 文節の表層
 * @param normalizedName 文節の正規化表現（KNPのfeatureの正規化代表表記参照）
 * @param dependType 親の文節との関係　依存関係:D、並列関係:P
 * @param caseType 文節の格情報（KNPのfeatureの係参照）
 * @param isDenialWord 否定表現を表すフラグ true/false (KNPのfeatureの否定参照)
 * @param isConditionalConnection 条件節及びそれに類する節を表すフラグ（KNPのfeatureの条件節候補参照）
 * @param normalizedNameYomi 文節の正規化表現の読み仮名
 * @param surfaceYomi 文節の表層の読み仮名
 * @param modalityType モダリティ（KNPのfeatureのモダリティ参照）
 * @param parallelType (KNPの並列タイプ参照)
 * @param nodeType com.ideal.linked.toposoid.common.SentenceType
 * @param morphemes 形態素解析結果
 */
case class PredicateArgumentStructure(currentId: Int,
                                        parentId: Int,
                                        isMainSection: Boolean,
                                        surface: String,
                                        normalizedName: String,
                                        dependType: String,
                                        caseType: String,
                                        isDenialWord: Boolean,
                                        isConditionalConnection: Boolean,
                                        normalizedNameYomi: String,
                                        surfaceYomi: String,
                                        modalityType: String,
                                        parallelType: String,
                                        nodeType: Int,
                                        morphemes:List[String]
                                     )

object PredicateArgumentStructure {
  implicit val jsonWrites: OWrites[PredicateArgumentStructure] = Json.writes[PredicateArgumentStructure]
  implicit val jsonReads: Reads[PredicateArgumentStructure] = Json.reads[PredicateArgumentStructure]
}
