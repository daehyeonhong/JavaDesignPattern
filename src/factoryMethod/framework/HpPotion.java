package factoryMethod.framework;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }

}
