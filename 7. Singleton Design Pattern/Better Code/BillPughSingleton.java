public class BillPughSingleton {

    private BillPughSingleton() {
    }

    // The inner class is not loaded into memory until it's referenced for the first time in the getInstance() method
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
