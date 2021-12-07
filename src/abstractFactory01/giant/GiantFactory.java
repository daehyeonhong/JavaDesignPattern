package abstractFactory01.giant;

import abstractFactory01.BikeFactory;
import abstractFactory01.Body;
import abstractFactory01.Wheel;

public class GiantFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GiantBody();
    }

    @Override
    public Wheel createWheel() {
        return new GiantWheel();
    }

}
