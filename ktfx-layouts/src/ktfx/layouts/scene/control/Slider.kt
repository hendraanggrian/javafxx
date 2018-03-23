@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.Slider

inline fun slider(min: Double, max: Double, value: Double, noinline init: ((@LayoutDsl Slider).() -> Unit)? = null): Slider = Slider(min, max, value).apply { init?.invoke(this) }

inline fun Manager<Node>.slider(min: Double, max: Double, value: Double, noinline init: ((@LayoutDsl Slider).() -> Unit)? = null): Slider = ktfx.layouts.slider(min, max, value, init).add()