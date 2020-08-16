@file:JvmMultifileClass
@file:JvmName("JFoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXTabPane
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
 * Add a [JFXTabPane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxTabPane(): JFXTabPane = jfxTabPane() { }

/**
 * Create a [JFXTabPane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun jfxTabPane(configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit): JFXTabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxJFXTabPane()
    child.configuration()
    return child
}

/**
 * Add a [JFXTabPane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.jfxTabPane(configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit):
    JFXTabPane {
        contract { callsInPlace(configuration, EXACTLY_ONCE) }
        val child = KtfxJFXTabPane()
        child.configuration()
        return addChild(child)
    }

/**
 * Create a styled [JFXTabPane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledJFXTabPane(vararg styleClass: String, id: String? = null): JFXTabPane =
    styledJFXTabPane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXTabPane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledJFXTabPane(vararg styleClass: String, id: String? = null): JFXTabPane =
    styledJFXTabPane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXTabPane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledJFXTabPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit
): JFXTabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxJFXTabPane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [JFXTabPane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXTabPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxJFXTabPane).() -> Unit
): JFXTabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxJFXTabPane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
