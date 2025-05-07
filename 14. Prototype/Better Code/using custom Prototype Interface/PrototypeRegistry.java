import Interfaces.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, ConcretePrototype> prototypes = new HashMap<>();

    // Register a prototype with a key
    public void addPrototype(String key, ConcretePrototype prototype) {
        prototypes.put(key, prototype);
    }

    // Retrieve and clone a prototype
    @SuppressWarnings("unchecked")
    public <T> T getPrototype(String key) {
        Prototype<?> prototype = prototypes.get(key);
        if (prototype != null) {
            return (T) prototype.clone();
        }
        throw new IllegalArgumentException("No prototype registered with key: " + key);
    }
}
