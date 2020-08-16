@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Rectangle
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [Rectangle] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.rectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0
): Rectangle = rectangle(x = x, y = y, width = width, height = height) { }

/**
 * Create a [Rectangle] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun rectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0,
    configuration: (@LayoutDslMarker Rectangle).() -> Unit
): Rectangle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rectangle(x, y, width, height)
    child.configuration()
    return child
}

/**
 * Add a [Rectangle] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun NodeManager.rectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0,
    configuration: (@LayoutDslMarker Rectangle).() -> Unit
): Rectangle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rectangle(x, y, width, height)
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [Rectangle].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledRectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0,
    vararg styleClass: String,
    id: String? = null
): Rectangle = styledRectangle(
    x = x, y = y, width = width, height = height,
    styleClass =
        *styleClass,
    id = id
) { }

/**
 * Add a styled [Rectangle] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun NodeManager.styledRectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0,
    vararg styleClass: String,
    id: String? = null
): Rectangle = styledRectangle(
    x = x, y = y, width = width, height = height,
    styleClass =
        *styleClass,
    id = id
) { }

/**
 * Create a styled [Rectangle] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledRectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker Rectangle).() -> Unit
): Rectangle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rectangle(x, y, width, height)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [Rectangle] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun NodeManager.styledRectangle(
    x: Double = 0.0,
    y: Double = 0.0,
    width: Double = 0.0,
    height: Double = 0.0,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker Rectangle).() -> Unit
): Rectangle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rectangle(x, y, width, height)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
