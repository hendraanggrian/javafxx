@file:JvmMultifileClass
@file:JvmName("BindingsKt")
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.bindings

import javafx.beans.Observable
import javafx.beans.binding.Bindings
import javafx.beans.binding.StringBinding
import javafx.beans.value.ObservableBooleanValue
import javafx.beans.value.ObservableDoubleValue
import javafx.beans.value.ObservableFloatValue
import javafx.beans.value.ObservableIntegerValue
import javafx.beans.value.ObservableLongValue
import javafx.beans.value.ObservableObjectValue
import javafx.collections.ObservableList
import ktfx.collections.observableListOf
import java.util.concurrent.Callable

/** Create a [StringBinding] with multiple [Observable] dependencies. */
inline fun stringBindingOf(vararg dependencies: Observable, noinline valueProvider: () -> String?): StringBinding =
    Bindings.createStringBinding(Callable(valueProvider), *dependencies)

/** Create a [StringBinding] with single [ObservableObjectValue] dependency. */
fun <V> ObservableObjectValue<V>.asString(valueProvider: (V?) -> String?): StringBinding =
    object : StringBinding() {
        override fun dispose(): Unit = unbind(this@asString)
        override fun computeValue(): String? = valueProvider(this@asString.value)
        override fun getDependencies(): ObservableList<*> = observableListOf(this@asString)

        init {
            bind(this@asString)
        }
    }

/** Create a [StringBinding] with single [ObservableBooleanValue] dependency. */
fun ObservableBooleanValue.asString(valueProvider: (Boolean) -> String?): StringBinding =
    object : StringBinding() {
        override fun dispose(): Unit = unbind(this@asString)
        override fun computeValue(): String? = valueProvider(this@asString.value)
        override fun getDependencies(): ObservableList<*> = observableListOf(this@asString)

        init {
            bind(this@asString)
        }
    }

/** Create a [StringBinding] with single [ObservableDoubleValue] dependency. */
fun ObservableDoubleValue.asString(valueProvider: (Double) -> String?): StringBinding =
    object : StringBinding() {
        override fun dispose(): Unit = unbind(this@asString)
        override fun computeValue(): String? = valueProvider(this@asString.value as Double)
        override fun getDependencies(): ObservableList<*> = observableListOf(this@asString)

        init {
            bind(this@asString)
        }
    }

/** Create a [StringBinding] with single [ObservableFloatValue] dependency. */
fun ObservableFloatValue.asString(valueProvider: (Float) -> String?): StringBinding =
    object : StringBinding() {
        override fun dispose(): Unit = unbind(this@asString)
        override fun computeValue(): String? = valueProvider(this@asString.value as Float)
        override fun getDependencies(): ObservableList<*> = observableListOf(this@asString)

        init {
            bind(this@asString)
        }
    }

/** Create a [StringBinding] with single [ObservableIntegerValue] dependency. */
fun ObservableIntegerValue.asString(valueProvider: (Int) -> String?): StringBinding =
    object : StringBinding() {
        override fun dispose(): Unit = unbind(this@asString)
        override fun computeValue(): String? = valueProvider(this@asString.value as Int)
        override fun getDependencies(): ObservableList<*> = observableListOf(this@asString)

        init {
            bind(this@asString)
        }
    }

/** Create a [StringBinding] with single [ObservableLongValue] dependency. */
fun ObservableLongValue.asString(valueProvider: (Long) -> String?): StringBinding =
    object : StringBinding() {
        override fun dispose(): Unit = unbind(this@asString)
        override fun computeValue(): String? = valueProvider(this@asString.value as Long)
        override fun getDependencies(): ObservableList<*> = observableListOf(this@asString)

        init {
            bind(this@asString)
        }
    }
