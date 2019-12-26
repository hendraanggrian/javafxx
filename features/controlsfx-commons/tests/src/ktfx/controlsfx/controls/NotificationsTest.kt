package ktfx.controlsfx.controls

import javafx.geometry.Pos
import javafx.scene.image.ImageView
import javafx.stage.Stage
import ktfx.test.SampleImageView
import ktfx.test.testScene
import ktfx.util.seconds
import org.controlsfx.control.Notifications
import org.testfx.framework.junit.ApplicationTest
import kotlin.test.Test
import kotlin.test.assertNotNull

class NotificationsTest : ApplicationTest() {
    private lateinit var stage: Stage
    private lateinit var sampleGraphic: ImageView

    override fun start(stage: Stage) {
        this.stage = stage
        stage.testScene<Notifications>()
        sampleGraphic = SampleImageView()
    }

    @Test fun buildNotifications() {
        assertNotNull(buildNotifications {
            text = "Welcome"
            title = "Hi"
            graphic = sampleGraphic
            position = Pos.BOTTOM_RIGHT
            owner = stage
            hideAfter = 10.seconds
            onAction { }
            darkStyle()
            hideCloseButton()
            actions()
            threshold(0) { }
        })
    }
}