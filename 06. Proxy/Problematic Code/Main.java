public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        if (checkAccess()) { // Manually checking access
            realSubject.request(); // Directly calling the method
            logAccess(); // Manually logging access
        }
    }

    private static boolean checkAccess() {
        System.out.println("Checking access prior to firing a real request.");
        // Perform some access checks or other pre-processing.
        return true;
    }

    private static void logAccess() {
        System.out.println("Logging the time of request.");
        // Perform some logging or other post-processing.
    }
}
