@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.geometry.Orientation
import javafx.geometry.Orientation.HORIZONTAL
import javafx.scene.control.Separator
import ktfx.NodeManager
import ktfx.LayoutDsl

/** Creates a [Separator]. */
fun separator(
    orientation: Orientation = HORIZONTAL,
    init: ((@LayoutDsl Separator).() -> Unit)? = null
): Separator = Separator(orientation).also { init?.invoke(it) }

/** Creates a [Separator] and add it to this manager. */
inline fun NodeManager.separator(
    orientation: Orientation = HORIZONTAL,
    noinline init: ((@LayoutDsl Separator).() -> Unit)? = null
): Separator = ktfx.layouts.separator(orientation, init)()