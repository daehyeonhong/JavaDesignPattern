package abstractFactory01;

import abstractFactory01.focus.FocusFactory;

public class Main {

    public static void main(String[] args) {
//        BikeFactory factory = new GiantFactory();
        BikeFactory factory = new FocusFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println("body = " + body);
        System.out.println("wheel = " + wheel);
    }

}
