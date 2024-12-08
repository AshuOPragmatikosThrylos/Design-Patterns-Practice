import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, ConcretePrototype> prototypes = new HashMap<>();

    // Register a prototype with a key
    public void addPrototype(String key, ConcretePrototype prototype) {
        prototypes.put(key, prototype);
    }

    // Retrieve and clone a prototype
    public ConcretePrototype getPrototype(String key) {
        ConcretePrototype prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("No prototype registered with key: " + key);
    }
}