import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FlyweightEntity> flyweights = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            // Reuse shared state while providing unique state dynamically
            FlyweightEntity flyweight = FlyweightFactory.getFlyweight("CommonValue1", "CommonValue2");
            flyweight.performAction("UniqueValue " + i);
            flyweights.add(flyweight);
        }

        System.out.println("\nTotal Flyweights created: " + FlyweightFactory.getFlyweightCount());
    }
}
