@file:JvmMultifileClass
@file:JvmName("ColumnKt")
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.controls

import javafx.scene.control.TreeTableColumn
import javafx.scene.control.TreeTableView

/** Apply [TreeTableView.CONSTRAINED_RESIZE_POLICY] to this table. */
inline fun TreeTableView<*>.constrained() {
    columnResizePolicy = TreeTableView.CONSTRAINED_RESIZE_POLICY
}

/** Apply [TreeTableView.UNCONSTRAINED_RESIZE_POLICY] to this table. */
inline fun TreeTableView<*>.unconstrained() {
    columnResizePolicy = TreeTableView.UNCONSTRAINED_RESIZE_POLICY
}

/** Invokes a [TreeTableColumn] DSL builder. */
fun <S> TreeTableView<S>.columns(builder: (@TableColumnDslMarker TreeTableColumnsBuilder<S>.() -> Unit)): Unit =
    TreeTableColumnsBuilder<S>(columns).builder()

/** Invokes a [TreeTableColumn] DSL builder creating multiline column. */
fun <S, T> TreeTableColumn<S, T>.columns(builder: (@TableColumnDslMarker TreeTableColumnsBuilder<S>.() -> Unit)): Unit =
    TreeTableColumnsBuilder<S>(columns).builder()

/** Interface to build [TreeTableColumn] with Kotlin DSL. */
class TreeTableColumnsBuilder<S> internal constructor(private val columns: MutableCollection<TreeTableColumn<S, *>>) {

    fun <T> column(text: String? = null): TreeTableColumn<S, T> =
        TreeTableColumn<S, T>(text).also { columns += it }

    inline fun <T> column(
        text: String? = null,
        init: (@TableColumnDslMarker TreeTableColumn<S, T>.() -> Unit)
    ): TreeTableColumn<S, T> = column<T>(text).apply(init)

    inline operator fun <T> String.invoke(
        init: (@TableColumnDslMarker TreeTableColumn<S, T>.() -> Unit)
    ): TreeTableColumn<S, T> = column(this, init)
}
