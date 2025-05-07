import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, FlyweightEntity> flyweights = new HashMap<>();

    public static FlyweightEntity getFlyweight(String sharedProperty1, String sharedProperty2) {
        String key = sharedProperty1 + ":" + sharedProperty2;
        flyweights.putIfAbsent(key, new FlyweightEntity(sharedProperty1, sharedProperty2));
        return flyweights.get(key);
    }

    public static int getFlyweightCount() {
        return flyweights.size();
    }
}

// Why static? 
// - Directly call `FlyweightFactory.getFlyweight()`; no factory instantiation needed  
// - Ensures a single `flyweights` map; avoids redundant factories and preserves object reuse