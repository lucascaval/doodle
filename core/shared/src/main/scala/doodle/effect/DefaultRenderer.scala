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
package effect

/**
  * The `DefaultRenderer` typeclass is a `Renderer` that has a reasonable default frame.
  */
trait DefaultRenderer[+Algebra, F[_], Frame, Canvas] extends Renderer[Algebra, F, Frame, Canvas] {
  def default: Frame
}
object DefaultRenderer {
  def apply[Algebra, F[_], Frame, Canvas](
      implicit renderer: DefaultRenderer[Algebra, F, Frame, Canvas])
    : DefaultRenderer[Algebra, F, Frame, Canvas] = renderer
}
