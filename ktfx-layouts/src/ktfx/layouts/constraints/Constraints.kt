@file:Suppress("PackageDirectoryMismatch")

package ktfx.layouts

import javafx.scene.Node

/** Marks a layout manager with constrained children. */
interface Constraints {

    /** Clear children constraints. */
    fun Node.reset()
}
