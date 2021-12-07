package abstractFactory02.concrete;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() throws Exception {
        switch (getOsCode()) {
            case 0:
                return new MacGuiFactory();
            case 1:
                return new LinuxGuiFactory();
            case 2:
                return new WindowGuiFactory();
            default:
                throw new Exception();
        }
    }

    private static int getOsCode() {
        final String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac"))
            return 0;
        else if (os.contains("linux"))
            return 1;
        else if (os.contains("window"))
            return 2;
        else return 3;
    }

}

class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }

}

class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux Button");
    }

}

class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "Linux TextArea";
    }

}

class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }

}

class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Mac Button");
    }

}

class MacTextArea implements TextArea {

    @Override
    public String getText() {
        return "Mac TextArea";
    }

}

class WindowGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowTextArea();
    }

}

class WindowButton implements Button {

    @Override
    public void click() {
        System.out.println("Window Button");
    }

}

class WindowTextArea implements TextArea {

    @Override
    public String getText() {
        return "Window TextArea";
    }

}
