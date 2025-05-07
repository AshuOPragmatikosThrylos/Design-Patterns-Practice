import Interfaces.Aggregate;
import Interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] items = {"Alpha", "Beta", "Gamma", "Delta"};
        Aggregate<String> collection = new AggregateImpl1<>(items);

        Iterator<String> iterator = collection.createIterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}