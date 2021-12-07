package abstractFactory01.focus;

import abstractFactory01.BikeFactory;
import abstractFactory01.Body;
import abstractFactory01.Wheel;

public class FocusFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new FocusBody();
    }

    @Override
    public Wheel createWheel() {
        return new FocusWheel();
    }

}
