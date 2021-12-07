package Decorator.concrete;

import Decorator.abst.AbstractAdding;
import Decorator.abst.Beverage;

public class Milk extends AbstractAdding {

    public Milk(Beverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }

}
