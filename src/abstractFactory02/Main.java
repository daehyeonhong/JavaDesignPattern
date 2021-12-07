package abstractFactory02;

import abstractFactory02.abst.Button;
import abstractFactory02.abst.GuiFactory;
import abstractFactory02.abst.TextArea;
import abstractFactory02.concrete.FactoryInstance;

public class Main {

    public static void main(String[] args) throws Exception {
        GuiFactory factory = FactoryInstance.getGuiFactory();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println("textArea.getText() = " + textArea.getText());
    }

}
