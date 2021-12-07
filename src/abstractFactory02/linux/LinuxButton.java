package abstractFactory02.linux;

import abstractFactory02.abst.Button;

public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux Button");
    }

}
