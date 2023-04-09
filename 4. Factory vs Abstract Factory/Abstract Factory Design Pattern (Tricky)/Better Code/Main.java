import Interfaces.FactoryOfFactory;

public class Main {
    public static void main(String[] args) {
        FactoryOfFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.execute();

        FactoryOfFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}
