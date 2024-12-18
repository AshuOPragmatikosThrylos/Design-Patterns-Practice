public class Singleton {
    // 'volatile' ensures reads/writes are from/to main memory, not CPU cache
    // guarantees happens-before: all writes complete before any reads
    // prevents threads from seeing an incomplete instance left by another thread pre-empted before completion of its instructions 
    // or else multiple objects could get created violating the singleton pattern

    // static variable ensures there's only one instance shared across all instances of the class
    private static volatile Singleton instance;

    // private constructor to prevent other classes from creating new instances
    private Singleton() {
    }

    // eager initialization wastes resources by creating the instance even if it's never used
    // although inherently it's thread-safe unlike lazy initialization which has to be made thread-safe using synchronization
    // final prevents the instance from being reassigned after initialization
    // private static final Singleton instance = new Singleton();

    // getInstance not synchronized to avoid locking overhead on every call
    // double-checked locking only synchronizes on first instance creation
    public static Singleton getInstance() {
        // first check (no lock) : if no instance exists, we proceed to create one
        if (instance == null) {
            // synchronized block to ensure that only one thread can create an instance at a time
            synchronized (Singleton.class) {
                // second check (with lock): ensures no other thread has already created an instance
                if (instance == null) {
                    // lazy initialization: creating the instance only when it's needed (alternative to eager initialization)
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
