package abstractFactory02.window;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;

public class WindowGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowTextArea();
    }

}
