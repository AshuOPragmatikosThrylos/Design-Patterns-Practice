import Interfaces.ObservableInterface;

public class Main {
    public static void main(String[] args) {
        ObservableInterface observed = new Observable1();
        observed.register(new ObserverType1());
        observed.register(new ObserverType1());
        observed.register(new ObserverType1());

        observed.event();

    }
}
