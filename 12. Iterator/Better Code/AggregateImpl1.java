import Interfaces.Aggregate;
import Interfaces.Iterator;

public class AggregateImpl1<T> implements Aggregate<T> {
    private T[] items; // can be any collection and not just array

    public AggregateImpl1(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new IteratorImpl1<T>(items); // Iterator can be changed without affecting client's operations
    }
}
