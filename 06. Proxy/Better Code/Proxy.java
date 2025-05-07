public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        if (checkAccess()) {
            realSubject.request();
            logAccess();
        }
    }

    private boolean checkAccess() {
        System.out.println("Proxy: Checking access prior to firing a real request.");
        // Perform some access checks or other pre-processing.
        return true;
    }

    private void logAccess() {
        System.out.println("Proxy: Logging the time of request.");
        // Perform some logging or other post-processing.
    }
}

