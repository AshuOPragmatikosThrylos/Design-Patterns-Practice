public class EntityFactory {
    public static AbstractEntity getEntity(String property) {
        if (property != null && !property.isEmpty()) {
            return new RealEntity(property);
        } else {
            return new NullEntity();
        }
    }
}