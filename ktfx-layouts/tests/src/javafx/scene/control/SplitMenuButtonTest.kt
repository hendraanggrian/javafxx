package ktfx.layouts

import javafx.scene.control.SplitMenuButton
import ktfx.test.BaseLayoutTest
import ktfx.test.assertEmpty
import kotlin.test.Test
import kotlin.test.assertEquals

class SplitMenuButtonTest : BaseLayoutTest<NodeManager, SplitMenuButton>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = splitMenuButton { }
    override fun NodeManager.child2() = splitMenuButton()
    override fun NodeManager.child3() = splitMenuButton { }

    @Test fun stringInvocation() {
        splitMenuButton {
            assertEmpty(items)
            menuItem("Hello")
            "World" {
            }
            assertEquals(2, items.size)
        }
    }
}