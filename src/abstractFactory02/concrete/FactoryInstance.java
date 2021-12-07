package abstractFactory02.concrete;

import abstractFactory02.abst.GuiFactory;
import abstractFactory02.linux.LinuxGuiFactory;
import abstractFactory02.mac.MacGuiFactory;
import abstractFactory02.window.WindowGuiFactory;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() throws Exception {
        switch (0) {
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

}
