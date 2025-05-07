import java.util.Queue;

import java.util.LinkedList;

public class SimpleObjectPool {
    private final Queue<ReusableObject> pool = new LinkedList<>();
    private int currentId = 1;
    private final int maxSize;

    public SimpleObjectPool(int maxSize) {
        this.maxSize = maxSize;
        for (int i = 0; i < maxSize; i++) {
            pool.offer(new ReusableObject(currentId++));
        }
    }

    // No Thread Safety: not synchronized, so multiple threads can modify the pool simultaneously
    public ReusableObject borrowObject() {
        if (!pool.isEmpty()) {
            return pool.poll();
        }
        throw new IllegalStateException("No objects available in the pool");
    }

    // No Thread Safety: not synchronized, so multiple threads can modify the pool simultaneously
    public void returnObject(ReusableObject object) {
        if (pool.size() < maxSize) {
            pool.offer(object);
        } else {
            System.out.println("Pool is full; object not added back.");
        }
    }
}
