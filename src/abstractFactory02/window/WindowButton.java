package abstractFactory02.window;

import abstractFactory02.abst.Button;

public class WindowButton implements Button {

    @Override
    public void click() {
        System.out.println("Window Button");
    }

}
