package abstractFactory02;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;
import abstractFactory02.linux.LinuxGuiFactory;
import abstractFactory02.mac.MacGuiFactory;
import abstractFactory02.window.WindowGuiFactory;

public class Main {

    public static void main(String[] args) {
//        GuiFactory factory = new LinuxGuiFactory();
//        GuiFactory factory = new MacGuiFactory();
        GuiFactory factory = new WindowGuiFactory();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println("textArea.getText() = " + textArea.getText());
    }

}
