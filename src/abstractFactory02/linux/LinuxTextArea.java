package abstractFactory02.linux;

import abstractFactory02.abst.TextArea;

public class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "Linux TextArea";
    }

}
