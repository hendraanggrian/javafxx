@file:JvmMultifileClass
@file:JvmName("JFoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXTogglePane
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [JFXTogglePane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxTogglePane(): JFXTogglePane = jfxTogglePane() { }

/**
 * Create a [JFXTogglePane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun jfxTogglePane(configuration: (@LayoutDslMarker KtfxJFXTogglePane).() -> Unit):
    JFXTogglePane {
        contract { callsInPlace(configuration, EXACTLY_ONCE) }
        val child = KtfxJFXTogglePane()
        child.configuration()
        return child
    }

/**
 * Add a [JFXTogglePane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.jfxTogglePane(
    configuration: (@LayoutDslMarker KtfxJFXTogglePane).() ->
    Unit
): JFXTogglePane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxJFXTogglePane()
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [JFXTogglePane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledJFXTogglePane(vararg styleClass: String, id: String? = null): JFXTogglePane =
    styledJFXTogglePane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXTogglePane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledJFXTogglePane(vararg styleClass: String, id: String? = null): JFXTogglePane =
    styledJFXTogglePane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXTogglePane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledJFXTogglePane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxJFXTogglePane).() -> Unit
): JFXTogglePane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxJFXTogglePane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [JFXTogglePane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXTogglePane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxJFXTogglePane).() -> Unit
): JFXTogglePane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxJFXTogglePane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
