
import src.ReusableObject;
import src.ThreadSafeObjectPool;

public class Main {
    public static void main(String[] args) {
        ThreadSafeObjectPool pool = ThreadSafeObjectPool.INSTANCE;

        Runnable task = () -> {
            try {
                ReusableObject obj = pool.borrowObject();
                System.out.println(Thread.currentThread().getName() + " borrowed: " + obj);
                obj.performTask();

                Thread.sleep(100);

                pool.returnObject(obj);
                System.out.println(Thread.currentThread().getName() + " returned: " + obj);
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " encountered error: " + e.getMessage());
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
