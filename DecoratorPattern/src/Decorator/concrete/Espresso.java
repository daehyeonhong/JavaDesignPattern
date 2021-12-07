package Decorator.concrete;

import Decorator.abst.AbstractAdding;
import Decorator.abst.Beverage;

public class Espresso extends AbstractAdding {

    protected static int espressoCount = 0;

    public Espresso(Beverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }

    /**
     * 에스프레소 추가 가격
     * @return
     */
    private static int getAddPrice() {
        espressoCount++;
        int addPrice = 100;
        if (espressoCount > 1)
            addPrice = 70;
        return addPrice;
    }

}
