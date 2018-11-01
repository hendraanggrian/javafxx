@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName", "UNCHECKED_CAST")

package ktfx.controlsfx

import javafx.scene.Node
import ktfx.NodeManager
import ktfx.LayoutDsl
import org.controlsfx.control.SegmentedButton

open class _SegmentedButton : SegmentedButton(), NodeManager {

    override val collection: MutableCollection<Node> get() = buttons as MutableCollection<Node>
}

/** Creates a [SegmentedButton]. */
fun segmentedButton(
    init: ((@LayoutDsl _SegmentedButton).() -> Unit)? = null
): SegmentedButton = _SegmentedButton().also { init?.invoke(it) }

/** Creates a [SegmentedButton] and add it to this manager. */
inline fun NodeManager.segmentedButton(
    noinline init: ((@LayoutDsl _SegmentedButton).() -> Unit)? = null
): SegmentedButton = ktfx.controlsfx.segmentedButton(init)()