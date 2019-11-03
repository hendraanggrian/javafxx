@file:JvmMultifileClass
@file:JvmName("ListenersKt")
@file:Suppress("PackageDirectoryMismatch")

package ktfx.listeners

import javafx.beans.property.Property
import javafx.beans.property.StringProperty

/**
 * Create a bidirectional binding between this `StringProperty` and another
 * arbitrary property. Relies on an implementation of converter DSL builder for conversion.
 */
fun <T> StringProperty.bindBidirectional(
    property: Property<T>,
    converter: StringConverterBuilder<T>.() -> Unit
): Unit = bindBidirectional(property, buildStringConverter(converter))