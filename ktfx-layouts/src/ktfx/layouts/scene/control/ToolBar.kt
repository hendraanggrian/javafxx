@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.ToolBar

@Suppress("ClassName")
open class _ToolBar(vararg items: Node) : ToolBar(*items), ItemManager

inline fun toolBar(vararg items: Node, noinline init: ((@LayoutDsl _ToolBar).() -> Unit)? = null): ToolBar = _ToolBar(*items).apply { init?.invoke(this) }

inline fun Manager<Node>.toolBar(vararg items: Node, noinline init: ((@LayoutDsl _ToolBar).() -> Unit)? = null): ToolBar = ktfx.layouts.toolBar(*items, init = init).add()