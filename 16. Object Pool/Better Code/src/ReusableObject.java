package src;
public class ReusableObject {
    private final int id;

    public ReusableObject(int id) {
        this.id = id;
    }

    public void performTask() {
        System.out.println("Performing task with object ID: " + id);
    }

    @Override
    public String toString() {
        return "ReusableObject {id=" + id + "}";
    }
}
