package factoryMethod.concrete;

import factoryMethod.framework.HpCreator;
import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;
import factoryMethod.framework.MpCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }

}
