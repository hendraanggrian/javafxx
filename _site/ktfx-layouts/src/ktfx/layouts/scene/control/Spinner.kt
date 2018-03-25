@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.Spinner

inline fun <T> spinner(
    noinline init: ((@LayoutDsl Spinner<T>).() -> Unit)? = null
): Spinner<T> = Spinner<T>().also { init?.invoke(it) }

inline fun <T> LayoutManager<Node>.spinner(
    noinline init: ((@LayoutDsl Spinner<T>).() -> Unit)? = null
): Spinner<T> = ktfx.layouts.spinner(init).add()