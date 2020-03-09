@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.MenuItem
import javafx.scene.control.SplitMenuButton
import kotlin.contracts.ExperimentalContracts

/**
 * [SplitMenuButton] with dynamic-layout dsl support.
 * Invoking dsl will add its children.
 */
open class KtfxSplitMenuButton : SplitMenuButton(), MenuItemManager {

    final override fun <C : MenuItem> addChild(child: C): C = child.also { items += it }

    /** Call [MenuItemManager.menuItem] by string invocation. */
    inline operator fun String.invoke(
        graphic: Node? = null,
        configuration: (@LayoutDslMarker MenuItem).() -> Unit
    ): MenuItem = menuItem(this, graphic, configuration)
}