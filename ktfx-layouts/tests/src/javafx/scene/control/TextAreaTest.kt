package ktfx.layouts

import javafx.scene.control.TextArea
import ktfx.test.BaseLayoutTest
import kotlin.test.assertEquals

class TextAreaTest : BaseLayoutTest<NodeManager, TextArea>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = textArea { }
    override fun NodeManager.child2() = textArea()
    override fun NodeManager.child3() = textArea { }

    override fun TextArea.testDefaultValues() {
        assertEquals("", text)
    }
}