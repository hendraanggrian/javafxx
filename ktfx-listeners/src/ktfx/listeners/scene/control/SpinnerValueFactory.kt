@file:Suppress("NOTHING_TO_INLINE", "UsePropertyAccessSyntax")

package ktfx.listeners

import javafx.scene.control.SpinnerValueFactory

inline fun <T> SpinnerValueFactory<T>.converter(
    converter: StringConverterBuilder<T>.() -> Unit
) = setConverter(stringConverter(converter))