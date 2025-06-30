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

package com.ideal.linked.toposoid.knowledgebase.featurevector.model
import play.api.libs.json.{Json, OWrites, Reads}

/**
 * For feature vector search requests.
 * Multiple vectors can be set.
 * @param vectors
 * @param num the number of search results
 * @param radius Radius is used to determine the space of search candidate radius for neighborhood vectors. -1 means infinite circle.
 * @param epsilon Epsilon is used to determines how much to expand from search candidate radius.
 * @param timeout Timeout is used for search time deadline. The unit is nano-seconds.
 */
case class MultiFeatureVectorForSearch(vectors:List[FeatureVectorForSearch], num:Int)
object MultiFeatureVectorForSearch {
  implicit val jsonWrites: OWrites[MultiFeatureVectorForSearch] = Json.writes[MultiFeatureVectorForSearch]
  implicit val jsonReads: Reads[MultiFeatureVectorForSearch] = Json.reads[MultiFeatureVectorForSearch]
}
