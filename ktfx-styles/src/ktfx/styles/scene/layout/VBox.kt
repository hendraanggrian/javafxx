package ktfx.styles

import javafx.geometry.Pos

class VBoxStyleBuilder : RegionStyleBuilder() {

    var spacing: Number by map

    var alignment: Pos by map

    var fillWidth: Boolean by map
}

inline fun vboxStyle(builder: VBoxStyleBuilder.() -> Unit): String =
    VBoxStyleBuilder().apply(builder).toString()