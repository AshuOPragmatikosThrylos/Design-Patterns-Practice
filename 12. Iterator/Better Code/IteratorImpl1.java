import Interfaces.Iterator;

public class IteratorImpl1<T> implements Iterator<T> {
    private T[] items;      // Items in the collection
    private int position;   // Current position in the collection

    public IteratorImpl1(T[] items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements.");
        }
        return items[position++];
    }
}
