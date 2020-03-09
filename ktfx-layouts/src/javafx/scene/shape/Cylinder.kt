@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Cylinder
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [Cylinder] with configuration block. */
inline fun cylinder(
    radius: Double = 1.0,
    height: Double = 2.0,
    division: Int = 64,
    configuration: (@LayoutDslMarker Cylinder).() -> Unit
): Cylinder {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return Cylinder(radius, height, division).apply(configuration)
}

/** Add a [Cylinder] to this manager. */
fun NodeManager.cylinder(
    radius: Double = 1.0,
    height: Double = 2.0,
    division: Int = 64
): Cylinder = addChild(Cylinder(radius, height, division))

/** Add a [Cylinder] with configuration block to this manager. */
inline fun NodeManager.cylinder(
    radius: Double = 1.0,
    height: Double = 2.0,
    division: Int = 64,
    configuration: (@LayoutDslMarker Cylinder).() -> Unit
): Cylinder {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(Cylinder(radius, height, division), configuration)
}