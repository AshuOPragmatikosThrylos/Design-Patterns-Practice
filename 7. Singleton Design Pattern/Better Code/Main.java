import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create multiple threads to test Singleton in a multithreaded environment
        Thread thread1 = new Thread(new SingletonTest(), "Thread-1");
        Thread thread2 = new Thread(new SingletonTest(), "Thread-2");
        Thread thread3 = new Thread(new SingletonTest(), "Thread-3");
        Thread thread4 = new Thread(new SingletonTest(), "Thread-4");
        Thread thread5 = new Thread(new SingletonTest(), "Thread-5");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(2000); // 2-second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread4.start();
        thread5.start();
    }
}


class SingletonTest implements Runnable {
    @Override
    public void run() {
        String timeStamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());

        // Singleton instance = Singleton.getInstance();
        // BillPughSingleton instance = BillPughSingleton.getInstance();
        EnumSingleton instance = EnumSingleton.INSTANCE;

        System.out.println(Thread.currentThread().getName() + " got instance at " + timeStamp + ": " + instance);
    }
}
