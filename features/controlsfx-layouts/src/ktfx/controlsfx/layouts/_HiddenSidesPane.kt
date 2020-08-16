@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import org.controlsfx.control.HiddenSidesPane
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [HiddenSidesPane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.hiddenSidesPane(): HiddenSidesPane = hiddenSidesPane() { }

/**
 * Create a [HiddenSidesPane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun hiddenSidesPane(configuration: (@LayoutDslMarker KtfxHiddenSidesPane).() -> Unit):
    HiddenSidesPane {
        contract { callsInPlace(configuration, EXACTLY_ONCE) }
        val child = KtfxHiddenSidesPane()
        child.configuration()
        return child
    }

/**
 * Add a [HiddenSidesPane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.hiddenSidesPane(
    configuration: (@LayoutDslMarker KtfxHiddenSidesPane).() ->
    Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [HiddenSidesPane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledHiddenSidesPane(vararg styleClass: String, id: String? = null): HiddenSidesPane =
    styledHiddenSidesPane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [HiddenSidesPane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledHiddenSidesPane(vararg styleClass: String, id: String? = null):
    HiddenSidesPane = styledHiddenSidesPane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [HiddenSidesPane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledHiddenSidesPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxHiddenSidesPane).() -> Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [HiddenSidesPane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledHiddenSidesPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxHiddenSidesPane).() -> Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
