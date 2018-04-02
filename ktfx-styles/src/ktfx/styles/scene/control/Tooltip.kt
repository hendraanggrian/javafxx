package ktfx.styles

import javafx.scene.control.ContentDisplay
import javafx.scene.control.OverrunStyle
import javafx.scene.text.TextAlignment
import ktfx.styles.internal.NotImplemented
import ktfx.styles.internal._TooltipStyleBuilder

interface TooltipStyleBuilder {

    var textAlignment: TextAlignment

    var textOverrun: OverrunStyle

    var wrapText: Boolean

    var graphic: Url

    var contentDisplay: ContentDisplay

    var graphicTextGap: Number

    @NotImplemented
    var font: String
}

inline fun tooltipStyle(
    prettyPrint: Boolean = false,
    builder: TooltipStyleBuilder .() -> Unit
): String = _TooltipStyleBuilder(prettyPrint).apply(builder).toString()