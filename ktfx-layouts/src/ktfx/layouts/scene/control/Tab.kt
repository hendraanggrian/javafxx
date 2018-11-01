@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.Tab
import ktfx.NodeManager
import ktfx.TabManager
import ktfx.LayoutDsl

open class _Tab(title: String?, content: Node?) : Tab(title, content), NodeManager by NodeManager.invokableOnly() {

    override operator fun <T : Node> T.invoke(): T = also { content = it }
}

/** Creates a [Tab]. */
fun tab(
    text: String? = null,
    content: Node? = null,
    init: ((@LayoutDsl _Tab).() -> Unit)? = null
): Tab = _Tab(text, content).also { init?.invoke(it) }

/** Creates a [Tab] and add it to this manager. */
inline fun TabManager.tab(
    text: String? = null,
    content: Node? = null,
    noinline init: ((@LayoutDsl _Tab).() -> Unit)? = null
): Tab = ktfx.layouts.tab(text, content, init)()