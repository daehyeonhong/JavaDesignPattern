package pattern;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {

    Map<String, Flyweight> pool;

    public FlyweightFactory() {
        this.pool = new TreeMap<>();
    }

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = pool.get(key);

        if (flyweight == null) {
            flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            System.out.printf("새로 생성 : %s\n", key);
        } else
            System.out.printf("재사용 : %s\n", key);

        return flyweight;
    }

}
