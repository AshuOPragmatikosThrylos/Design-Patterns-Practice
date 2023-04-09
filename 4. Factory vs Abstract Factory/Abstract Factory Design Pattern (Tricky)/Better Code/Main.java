import Interfaces.FactoryOfFactoryInterface;

public class Main {
    public static void main(String[] args) {
        FactoryOfFactoryInterface factory1 = new Factory1();
        Client client1 = new Client(factory1);
        client1.execute();

        FactoryOfFactoryInterface factory2 = new Factory2();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}
