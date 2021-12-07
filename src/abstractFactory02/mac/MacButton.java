package abstractFactory02.mac;

import abstractFactory02.abst.Button;

public class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Mac Button");
    }

}
