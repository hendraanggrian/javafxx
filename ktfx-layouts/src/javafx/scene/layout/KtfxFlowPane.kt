@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.scene.Node
import javafx.scene.layout.FlowPane
import kotlin.DeprecationLevel.ERROR
import kotlin.contracts.ExperimentalContracts
import ktfx.internal.KtfxInternals.NO_GETTER
import ktfx.internal.KtfxInternals.noGetter

/**
 * [FlowPane] with dynamic-layout dsl support.
 * Invoking dsl will add its children.
 */
open class KtfxFlowPane(orientation: Orientation, hgap: Double, vgap: Double) : FlowPane(orientation, hgap, vgap),
    NodeManager {

    constructor(orientation: Orientation, gap: Double) : this(orientation, gap, gap)

    final override fun <C : Node> addChild(child: C): C = child.also { children += it }

    /** Clear children constraints. */
    @JvmName("clearConstraints2")
    inline fun Node.clearConstraints(): Unit = clearConstraints(this)

    /** Children margin in this layout. */
    inline var Node.margin: Insets?
        @JvmName("getMargin2") get() = getMargin(this)
        @JvmName("setMargin2") set(value) = setMargin(this, value)

    /** Top margin of this children. */
    var Node.topMargin: Double?
        inline get() = margin?.top
        set(value) {
            margin = Insets(value ?: 0.0, rightMargin ?: 0.0, bottomMargin ?: 0.0, leftMargin ?: 0.0)
        }

    /** Right margin of this children. */
    var Node.rightMargin: Double?
        inline get() = margin?.right
        set(value) {
            margin = Insets(topMargin ?: 0.0, value ?: 0.0, bottomMargin ?: 0.0, leftMargin ?: 0.0)
        }

    /** Bottom margin of this children. */
    var Node.bottomMargin: Double?
        inline get() = margin?.bottom
        set(value) {
            margin = Insets(topMargin ?: 0.0, rightMargin ?: 0.0, value ?: 0.0, leftMargin ?: 0.0)
        }

    /** Left margin of this children. */
    var Node.leftMargin: Double?
        inline get() = margin?.left
        set(value) {
            margin = Insets(topMargin ?: 0.0, rightMargin ?: 0.0, bottomMargin ?: 0.0, value ?: 0.0)
        }

    /** Sets left and right margin of this children. */
    var Node.horizontalMargin: Double?
        @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
        set(value) {
            margin = Insets(topMargin ?: 0.0, value ?: 0.0, bottomMargin ?: 0.0, value ?: 0.0)
        }

    /** Sets top and bottom margin of this children. */
    var Node.verticalMargin: Double?
        @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
        set(value) {
            margin = Insets(value ?: 0.0, rightMargin ?: 0.0, value ?: 0.0, leftMargin ?: 0.0)
        }

    /** Sets margin to all sides of this children. */
    var Node.margins: Double?
        @Deprecated(NO_GETTER, level = ERROR) get() = noGetter()
        set(value) {
            margin = Insets(value ?: 0.0)
        }

    /** Configure margin fluidly using infix operator. */
    inline infix fun <C : Node> C.margin(insets: Insets): C {
        margin = insets
        return this
    }

    /** Configure top margin fluidly using infix operator. */
    inline infix fun <C : Node> C.topMargin(margin: Double): C {
        topMargin = margin
        return this
    }

    /** Configure right margin fluidly using infix operator. */
    inline infix fun <C : Node> C.rightMargin(margin: Double): C {
        rightMargin = margin
        return this
    }

    /** Configure bottom margin fluidly using infix operator. */
    inline infix fun <C : Node> C.bottomMargin(margin: Double): C {
        bottomMargin = margin
        return this
    }

    /** Configure left margin fluidly using infix operator. */
    inline infix fun <C : Node> C.leftMargin(margin: Double): C {
        leftMargin = margin
        return this
    }

    /** Configure horizontal margin fluidly using infix operator. */
    inline infix fun <C : Node> C.horizontalMargin(margin: Double): C {
        horizontalMargin = margin
        return this
    }

    /** Configure vertical margin fluidly using infix operator. */
    inline infix fun <C : Node> C.verticalMargin(margin: Double): C {
        verticalMargin = margin
        return this
    }

    /** Configure all margin fluidly using infix operator. */
    inline infix fun <C : Node> C.margins(margin: Double): C {
        margins = margin
        return this
    }
}