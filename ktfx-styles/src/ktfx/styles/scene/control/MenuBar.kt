package ktfx.styles

import ktfx.styles.internal._MenuBarStyleBuilder

interface MenuBarStyleBuilder {

    var useSystemMenuBar: Boolean
}

inline fun menuBarStyle(
    prettyPrint: Boolean = false,
    builder: MenuBarStyleBuilder .() -> Unit
): String = _MenuBarStyleBuilder(prettyPrint).apply(builder).toString()