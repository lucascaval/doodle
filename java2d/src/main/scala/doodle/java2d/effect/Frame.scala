/*
 * Copyright 2015 Creative Scala
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

package doodle
package java2d
package effect

import doodle.core.Color

final case class Frame(size: Size,
                       title: String = "",
                       background: Option[Color] = None) {
  def background(color: Color): Frame =
    this.copy(background = Some(color))

  def title(title: String): Frame =
    this.copy(title = title)
}
object Frame {
  def fitToImage(border: Int = 20): Frame =
    Frame(Size.fitToImage(border))

  def size(width: Double, height: Double): Frame =
    Frame(Size.fixedSize(width, height))
}
