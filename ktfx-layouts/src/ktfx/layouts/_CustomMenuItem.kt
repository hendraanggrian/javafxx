@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.CustomMenuItem
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [CustomMenuItem] to this manager.
 *
 * @return the control added.
 */
fun MenuItemManager.customMenuItem(content: Node? = null, hideOnClick: Boolean = true):
    CustomMenuItem = customMenuItem(content = content, hideOnClick = hideOnClick) { }

/**
 * Create a [CustomMenuItem] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun customMenuItem(
    content: Node? = null,
    hideOnClick: Boolean = true,
    configuration: (@LayoutDslMarker CustomMenuItem).() -> Unit
): CustomMenuItem {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = CustomMenuItem(content, hideOnClick)
    child.configuration()
    return child
}

/**
 * Add a [CustomMenuItem] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun MenuItemManager.customMenuItem(
    content: Node? = null,
    hideOnClick: Boolean = true,
    configuration: (@LayoutDslMarker CustomMenuItem).() -> Unit
): CustomMenuItem {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = CustomMenuItem(content, hideOnClick)
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [CustomMenuItem].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledCustomMenuItem(
    content: Node? = null,
    hideOnClick: Boolean = true,
    vararg styleClass: String,
    id: String? = null
): CustomMenuItem = styledCustomMenuItem(
    content = content, hideOnClick = hideOnClick,
    styleClass =
        *styleClass,
    id = id
) { }

/**
 * Add a styled [CustomMenuItem] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun MenuItemManager.styledCustomMenuItem(
    content: Node? = null,
    hideOnClick: Boolean = true,
    vararg styleClass: String,
    id: String? = null
): CustomMenuItem = styledCustomMenuItem(
    content = content, hideOnClick = hideOnClick,
    styleClass =
        *styleClass,
    id = id
) { }

/**
 * Create a styled [CustomMenuItem] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledCustomMenuItem(
    content: Node? = null,
    hideOnClick: Boolean = true,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker CustomMenuItem).() -> Unit
): CustomMenuItem {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = CustomMenuItem(content, hideOnClick)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [CustomMenuItem] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun MenuItemManager.styledCustomMenuItem(
    content: Node? = null,
    hideOnClick: Boolean = true,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker CustomMenuItem).() -> Unit
): CustomMenuItem {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = CustomMenuItem(content, hideOnClick)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
