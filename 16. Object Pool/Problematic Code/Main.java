public class Main {
    public static void main(String[] args) {
        SimpleObjectPool pool = new SimpleObjectPool(2);

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

// Output can be below
// --------------------
// Thread-1 borrowed: ReusableObject {id=1}
// Thread-3 borrowed: null
// Thread-2 borrowed: ReusableObject {id=2}
// Performing task with object ID: 1       
// Performing task with object ID: 2       
// Thread-3 encountered error: Cannot invoke "ReusableObject.performTask()" because "<local1>" is null
// Thread-1 returned: ReusableObject {id=1}
// Thread-2 returned:ReusableObject
// {id=2}

// The output demonstrates the importance of using both Singleton and Thread Safety:
// 1. Thread Safety: Without thread safety, multiple threads can access and modify the object pool simultaneously, 
//    leading to inconsistent behavior. For example, Thread-3 borrows `null` because Thread-1 took the only available object 
//    without synchronization, causing Thread-3 to fail when attempting to borrow an object.
// 2. Singleton: Without a Singleton, each thread could have its own pool instance, leading to isolated pools and 
//    resources not being shared correctly. The Singleton ensures a shared pool across all threads, which is essential for 
//    resource management in a multi-threaded environment

// Using both patterns ensures proper object borrowing and returning across threads, avoiding errors and inconsistent states

