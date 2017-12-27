package kotfx.bindings

import javafx.scene.control.Label
import kotfx.eq
import kotfx.neq

class ObservableObjectBindingsTest {

    private val label = Label()

    fun eq() {
        label.alignmentProperty().isEqualTo(label.backgroundProperty())
        label.alignmentProperty() eq label.backgroundProperty()
    }

    fun neq() {
        label.alignmentProperty().isNotEqualTo(label.backgroundProperty())
        label.alignmentProperty() neq label.backgroundProperty()
    }
}