package ktfx.controlsfx.layouts

import ktfx.layouts.KtfxPane
import ktfx.layouts.NodeManager
import ktfx.test.BaseLayoutTest
import org.controlsfx.control.PlusMinusSlider

class PlusMinusSliderTest : BaseLayoutTest<NodeManager, PlusMinusSlider>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = plusMinusSlider { }
    override fun NodeManager.child2() = plusMinusSlider()
    override fun NodeManager.child3() = plusMinusSlider { }
}