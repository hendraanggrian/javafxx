@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.MoveTo
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [MoveTo] with configuration block. */
inline fun moveTo(
    x: Double = 0.0,
    y: Double = 0.0,
    configuration: (@LayoutDslMarker MoveTo).() -> Unit
): MoveTo {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return MoveTo(x, y).apply(configuration)
}

/** Add a [MoveTo] to this manager. */
fun PathElementManager.moveTo(
    x: Double = 0.0,
    y: Double = 0.0
): MoveTo = addChild(MoveTo(x, y))

/** Add a [MoveTo] with configuration block to this manager. */
inline fun PathElementManager.moveTo(
    x: Double = 0.0,
    y: Double = 0.0,
    configuration: (@LayoutDslMarker MoveTo).() -> Unit
): MoveTo {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(MoveTo(x, y), configuration)
}