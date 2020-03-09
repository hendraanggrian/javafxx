@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.QuadCurve
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [QuadCurve] with configuration block. */
inline fun quadCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX: Double = 0.0,
    controlY: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0,
    configuration: (@LayoutDslMarker QuadCurve).() -> Unit
): QuadCurve {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return QuadCurve(startX, startY, controlX, controlY, endX, endY).apply(configuration)
}

/** Add a [QuadCurve] to this manager. */
fun NodeManager.quadCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX: Double = 0.0,
    controlY: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0
): QuadCurve = addChild(QuadCurve(startX, startY, controlX, controlY, endX, endY))

/** Add a [QuadCurve] with configuration block to this manager. */
inline fun NodeManager.quadCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX: Double = 0.0,
    controlY: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0,
    configuration: (@LayoutDslMarker QuadCurve).() -> Unit
): QuadCurve {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(QuadCurve(startX, startY, controlX, controlY, endX, endY), configuration)
}