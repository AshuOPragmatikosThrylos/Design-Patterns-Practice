public class Entity {
    private String sharedProperty1; // Shared among many objects
    private String sharedProperty2; 
    private String uniqueProperty;  // Unique to each object

    public Entity(String sharedProperty1, String sharedProperty2, String uniqueProperty) {
        this.sharedProperty1 = sharedProperty1;
        this.sharedProperty2 = sharedProperty2;
        this.uniqueProperty = uniqueProperty;
    }

    public void performAction() {
        System.out.println("Action performed with " + sharedProperty1 + ", " + sharedProperty2 + ", and " + uniqueProperty);
    }
}