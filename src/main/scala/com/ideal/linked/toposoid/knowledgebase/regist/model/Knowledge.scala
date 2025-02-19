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

import play.api.libs.json.{Json, OWrites, Reads}


/**
 * Normal knnowledge model
 * @param sentence
 * @param lang
 * @param extentInfoJson
 * @param isNegativeSentence Currently, this property is always set to false when registering data.
 * @param knowledgeForImages
 * @param knowledgeForTables
 * @param documentReference
 */
case class Knowledge(
                      sentence:String,
                      lang:String,
                      extentInfoJson:String,
                      isNegativeSentence:Boolean=false,
                      knowledgeForImages:List[KnowledgeForImage]=List.empty[KnowledgeForImage],
                      knowledgeForTables: List[KnowledgeForTable]=List.empty[KnowledgeForTable],
                      documentReference: DocumentReference = DocumentReference(documentId = "", pageNo = 0, titleOfTopPage="")
)
object Knowledge {
  implicit val jsonWrites: OWrites[Knowledge] = Json.writes[Knowledge]
  implicit val jsonReads: Reads[Knowledge] = Json.reads[Knowledge]
}
