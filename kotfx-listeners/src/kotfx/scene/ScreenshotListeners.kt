@file:Suppress("NOTHING_TO_INLINE")

package kotfx.scene

import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.SnapshotParameters
import javafx.scene.SnapshotResult
import javafx.scene.image.WritableImage
import kotfx.internal.Interopability.asCallback

inline fun Node.screenshot(
    params: SnapshotParameters? = null,
    image: WritableImage? = null,
    noinline callback: (SnapshotResult) -> Unit
) = snapshot(asCallback(callback), params, image)

inline fun Scene.screenshot(
    image: WritableImage? = null,
    noinline callback: (SnapshotResult) -> Unit
) = snapshot(asCallback(callback), image)