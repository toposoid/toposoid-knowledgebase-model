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

package com.ideal.linked.toposoid.knowledgebase.featurevector.model
import play.api.libs.json.Json

/**
 *　For feature vector search requests
 * Single vector can be set.
 * @param vector
 * @param num the number of search results
 * @param radius Radius is used to determine the space of search candidate radius for neighborhood vectors. -1 means infinite circle.
 * @param epsilon Epsilon is used to determines how much to expand from search candidate radius.
 * @param timeout Timeout is used for search time deadline. The unit is nano-seconds.
 */
case class SingleFeatureVectorForSearch(vector:List[Float], num:Int, radius:Float, epsilon:Float, timeout:Long)
object SingleFeatureVectorForSearch {
  implicit val jsonWrites = Json.writes[SingleFeatureVectorForSearch]
  implicit val jsonReads = Json.reads[SingleFeatureVectorForSearch]
}
