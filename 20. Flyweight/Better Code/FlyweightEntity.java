public class FlyweightEntity {
    private final String sharedProperty1; // Intrinsic property
    private final String sharedProperty2;

    public FlyweightEntity(String sharedProperty1, String sharedProperty2) {
        this.sharedProperty1 = sharedProperty1;
        this.sharedProperty2 = sharedProperty2;
    }

    public void performAction(String uniqueProperty) { // Unique property as extrinsic state
        System.out.println("Action performed with " + sharedProperty1 + ", " + sharedProperty2 + ", and " + uniqueProperty);
    }
}
