@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXDatePicker
import java.time.LocalDate
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addChild

/** Create a [JFXDatePicker] with configuration block. */
inline fun jfxDatePicker(
    value: LocalDate? = null,
    configuration: (@LayoutDslMarker JFXDatePicker).() -> Unit
): JFXDatePicker {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return JFXDatePicker(value).apply(configuration)
}

/** Add a [JFXDatePicker] to this manager. */
fun NodeManager.jfxDatePicker(
    value: LocalDate? = null
): JFXDatePicker = addChild(JFXDatePicker(value))

/** Add a [JFXDatePicker] with configuration block to this manager. */
inline fun NodeManager.jfxDatePicker(
    value: LocalDate? = null,
    configuration: (@LayoutDslMarker JFXDatePicker).() -> Unit
): JFXDatePicker {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(JFXDatePicker(value), configuration)
}