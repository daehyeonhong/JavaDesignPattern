package abstractFactory02.window;

import abstractFactory02.abst.TextArea;

public class WindowTextArea implements TextArea {

    @Override
    public String getText() {
        return "Window TextArea";
    }

}
