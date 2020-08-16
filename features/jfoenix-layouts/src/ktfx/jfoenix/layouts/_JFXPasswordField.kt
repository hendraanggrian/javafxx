@file:JvmMultifileClass
@file:JvmName("JFoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXPasswordField
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
 * Add a [JFXPasswordField] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxPasswordField(): JFXPasswordField = jfxPasswordField() { }

/**
 * Create a [JFXPasswordField] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun jfxPasswordField(configuration: (@LayoutDslMarker JFXPasswordField).() -> Unit):
    JFXPasswordField {
        contract { callsInPlace(configuration, EXACTLY_ONCE) }
        val child = JFXPasswordField()
        child.configuration()
        return child
    }

/**
 * Add a [JFXPasswordField] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.jfxPasswordField(
    configuration: (@LayoutDslMarker JFXPasswordField).() ->
    Unit
): JFXPasswordField {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXPasswordField()
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [JFXPasswordField].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledJFXPasswordField(vararg styleClass: String, id: String? = null): JFXPasswordField =
    styledJFXPasswordField(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXPasswordField] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledJFXPasswordField(vararg styleClass: String, id: String? = null):
    JFXPasswordField = styledJFXPasswordField(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXPasswordField] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledJFXPasswordField(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker JFXPasswordField).() -> Unit
): JFXPasswordField {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXPasswordField()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [JFXPasswordField] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXPasswordField(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker JFXPasswordField).() -> Unit
): JFXPasswordField {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = JFXPasswordField()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
