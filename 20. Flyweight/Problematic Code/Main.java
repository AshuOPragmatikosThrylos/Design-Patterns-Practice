import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        int numberOfObjects = 1000;
        for (int i = 0; i < numberOfObjects; i++) {
            // Every object redundantly stores sharedProperty1 and sharedProperty2
            entities.add(new Entity("CommonValue1", "CommonValue2", "UniqueValue " + i));
        }

        entities.forEach(Entity::performAction);

        System.out.println("\nTotal objects created: " + numberOfObjects);
    }
}
