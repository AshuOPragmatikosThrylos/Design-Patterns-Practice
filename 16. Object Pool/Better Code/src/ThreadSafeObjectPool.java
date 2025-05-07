package src;
import java.util.Queue;

import java.util.LinkedList;

import Interfaces.ObjectPool;

public enum ThreadSafeObjectPool implements ObjectPool{
    INSTANCE; // Enum Singleton

    private final Queue<ReusableObject> pool = new LinkedList<>();
    private int currentId = 1;
    private final int maxSize = 5;

    ThreadSafeObjectPool() {
        for (int i = 0; i < 2; i++) {
            pool.offer(new ReusableObject(currentId++));
        }
    }

    public synchronized ReusableObject borrowObject() {
        if (!pool.isEmpty()) {
            return pool.poll();
        }
        throw new IllegalStateException("No objects available in the pool");
    }

    public synchronized void returnObject(ReusableObject object) {
        if (pool.size() < maxSize) {
            pool.offer(object);
        } else {
            System.out.println("Pool is full; object not added back.");
        }
    }
}
