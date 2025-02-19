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
 *
 * @param documentId
 * @param pageNo
 * @param titleOfTopPage
 * @param references
 * @param tableOfContents
 */
case class DocumentReference(documentId: String, pageNo: Int, titleOfTopPage: String, references: List[String]=List.empty[String], tableOfContents: List[String] = List.empty[String])

object DocumentReference {
  implicit val jsonWrites: OWrites[DocumentReference] = Json.writes[DocumentReference]
  implicit val jsonReads: Reads[DocumentReference] = Json.reads[DocumentReference]
}
