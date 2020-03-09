@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addChild
import org.controlsfx.control.RangeSlider

/** Create a [RangeSlider] with configuration block. */
inline fun rangeSlider(
    min: Double = 0.0,
    max: Double = 1.0,
    lowValue: Double = 0.25,
    highValue: Double = 0.75,
    configuration: (@LayoutDslMarker RangeSlider).() -> Unit
): RangeSlider {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return RangeSlider(min, max, lowValue, highValue).apply(configuration)
}

/** Add a [RangeSlider] to this manager. */
fun NodeManager.rangeSlider(
    min: Double = 0.0,
    max: Double = 1.0,
    lowValue: Double = 0.25,
    highValue: Double = 0.75
): RangeSlider = addChild(RangeSlider(min, max, lowValue, highValue))

/** Add a [RangeSlider] with configuration block to this manager. */
inline fun NodeManager.rangeSlider(
    min: Double = 0.0,
    max: Double = 1.0,
    lowValue: Double = 0.25,
    highValue: Double = 0.75,
    configuration: (@LayoutDslMarker RangeSlider).() -> Unit
): RangeSlider {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(RangeSlider(min, max, lowValue, highValue), configuration)
}