@file:JvmMultifileClass
@file:JvmName("ListenersKt")
@file:Suppress("PackageDirectoryMismatch")

package ktfx.listeners

import javafx.scene.control.ComboBox

/** Providing a custom cell factory allows for complete customization of the rendering of items in the ComboBox. */
fun <T> ComboBox<T>.cellFactory(
    cellFactory: ListCellBuilder<T>.() -> Unit
): Unit = setCellFactory { cellFactory.build() }

/** Converts the user-typed input. */
fun <T> ComboBox<T>.converter(
    converter: StringConverterBuilder<T>.() -> Unit
): Unit = setConverter(buildStringConverter(converter))