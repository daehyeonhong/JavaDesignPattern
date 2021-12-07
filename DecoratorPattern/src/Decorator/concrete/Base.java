package Decorator.concrete;

import Decorator.abst.Beverage;

public class Base implements Beverage {

    /**
     * <h2><b>Role: </b>ConcreteComponent</h2>
     * <p>
     * Component의 실질적인 Instance의 부분이며, 책임의 주체입니다.
     * </p>
     * @author DEV_HONGDAE
     */
    @Override
    public int getTotalPrice() {
        return 0;
    }

}
