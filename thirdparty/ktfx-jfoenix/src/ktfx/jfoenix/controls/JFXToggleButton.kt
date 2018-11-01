@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.jfoenix

import com.jfoenix.controls.JFXToggleButton
import ktfx.NodeManager
import ktfx.LayoutDsl

/** Creates a [JFXToggleButton]. */
fun jfxToggleButton(
    init: ((@LayoutDsl JFXToggleButton).() -> Unit)? = null
): JFXToggleButton = JFXToggleButton().also { init?.invoke(it) }

/** Creates a [JFXToggleButton] and add it to this manager. */
inline fun NodeManager.jfxToggleButton(
    noinline init: ((@LayoutDsl JFXToggleButton).() -> Unit)? = null
): JFXToggleButton = ktfx.jfoenix.jfxToggleButton(init)()