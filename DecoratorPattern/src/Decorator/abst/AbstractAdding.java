package Decorator.abst;

public class AbstractAdding implements Beverage {

    /**
     * <h2><b>Role: </b>Decorator</h2>
     * <p>
     * Component와 장식을 동일시 해주는 역할입니다.
     * </p>
     * @author DEV_HONGDAE
     */
    private Beverage base;

    public AbstractAdding(Beverage base) {
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected Beverage getBase() {
        return base;
    }

}
