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
 *
 * @param lang 言語のロケール
 * @param namedEntity 固有表現（KNPのfeatureのNE参照）
 * @param rangeExpressions　数量の範囲表現　
 * @param categories カテゴリ（KNPのfeatureのカテゴリ参照）
 * @param domains ドメイン（KNPのfeatureのドメイン参照）
 * @param referenceIdMap キー：id名　バリュー:id
 */
case class LocalContext(lang:String,
                        namedEntity: String,
                        rangeExpressions: Map[String, Map[String, String]],
                        categories: Map[String, String],
                        domains: Map[String, String],
                        referenceIdMap:Map[String, String]
                       )

object LocalContext {
  implicit val jsonWrites = Json.writes[LocalContext]
  implicit val jsonReads = Json.reads[LocalContext]
}
