@file:Suppress("NOTHING_TO_INLINE")

package ktfx.scene.control

import javafx.scene.Node
import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType.CONFIRMATION
import javafx.scene.control.Alert.AlertType.ERROR
import javafx.scene.control.Alert.AlertType.INFORMATION
import javafx.scene.control.Alert.AlertType.NONE
import javafx.scene.control.Alert.AlertType.WARNING
import javafx.scene.control.ButtonType
import javafx.scene.image.ImageView

/**
 * Build an alert with Kotlin DSL.
 *
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
inline fun alert(
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    noinline init: (Alert.() -> Unit)? = null
): Alert = alert(null, null, contentText, *buttonTypes, init = init)

/**
 * Build an alert with Kotlin DSL.
 *
 * @param title title of the dialog.
 * @param graphic node to be displayed in header.
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
fun alert(
    title: String? = null,
    graphic: Node? = null,
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    init: (Alert.() -> Unit)? = null
): Alert = Alert(NONE, contentText, *buttonTypes).also { dialog ->
    if (title != null) dialog.headerTitle = title
    if (graphic != null) (graphic as? ImageView)?.let { dialog.graphicIcon = it } ?: dialog.setGraphic(graphic)
    init?.invoke(dialog)
}

/**
 * Build an information alert with Kotlin DSL.
 *
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
inline fun infoAlert(
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    noinline init: (Alert.() -> Unit)? = null
): Alert = infoAlert(null, null, contentText, *buttonTypes, init = init)

/**
 * Build an information alert with Kotlin DSL.
 *
 * @param title title of the dialog.
 * @param graphic node to be displayed in header.
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
fun infoAlert(
    title: String? = null,
    graphic: Node? = null,
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    init: (Alert.() -> Unit)? = null
): Alert = Alert(INFORMATION, contentText, *buttonTypes).also { dialog ->
    if (title != null) dialog.headerTitle = title
    if (graphic != null) (graphic as? ImageView)?.let { dialog.graphicIcon = it } ?: dialog.setGraphic(graphic)
    init?.invoke(dialog)
}

/**
 * Build a warning alert with Kotlin DSL.
 *
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
inline fun warningAlert(
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    noinline init: (Alert.() -> Unit)? = null
): Alert = warningAlert(null, null, contentText, *buttonTypes, init = init)

/**
 * Build a warning alert with Kotlin DSL.
 *
 * @param title title of the dialog.
 * @param graphic node to be displayed in header.
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
fun warningAlert(
    title: String? = null,
    graphic: Node? = null,
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    init: (Alert.() -> Unit)? = null
): Alert = Alert(WARNING, contentText, *buttonTypes).also { dialog ->
    if (title != null) dialog.headerTitle = title
    if (graphic != null) (graphic as? ImageView)?.let { dialog.graphicIcon = it } ?: dialog.setGraphic(graphic)
    init?.invoke(dialog)
}

/**
 * Build a confirmation alert with Kotlin DSL.
 *
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
inline fun confirmAlert(
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    noinline init: (Alert.() -> Unit)? = null
): Alert = confirmAlert(null, null, contentText, *buttonTypes, init = init)

/**
 * Build a confirmation alert with Kotlin DSL.
 *
 * @param title title of the dialog.
 * @param graphic node to be displayed in header.
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
fun confirmAlert(
    title: String? = null,
    graphic: Node? = null,
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    init: (Alert.() -> Unit)? = null
): Alert = Alert(CONFIRMATION, contentText, *buttonTypes).also { dialog ->
    if (title != null) dialog.headerTitle = title
    if (graphic != null) (graphic as? ImageView)?.let { dialog.graphicIcon = it } ?: dialog.setGraphic(graphic)
    init?.invoke(dialog)
}

/**
 * Build an error alert with Kotlin DSL.
 *
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
inline fun errorAlert(
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    noinline init: (Alert.() -> Unit)? = null
): Alert = errorAlert(null, null, contentText, *buttonTypes, init = init)

/**
 * Build an error alert with Kotlin DSL.
 *
 * @param title title of the dialog.
 * @param graphic node to be displayed in header.
 * @param contentText alert message.
 * @param buttonTypes alert buttons.
 * @param init custom initialization block.
 */
fun errorAlert(
    title: String? = null,
    graphic: Node? = null,
    contentText: String = "",
    vararg buttonTypes: ButtonType,
    init: (Alert.() -> Unit)? = null
): Alert = Alert(ERROR, contentText, *buttonTypes).also { dialog ->
    if (title != null) dialog.headerTitle = title
    if (graphic != null) (graphic as? ImageView)?.let { dialog.graphicIcon = it } ?: dialog.setGraphic(graphic)
    init?.invoke(dialog)
}