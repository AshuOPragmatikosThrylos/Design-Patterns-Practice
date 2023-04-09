import Interfaces.*;

public class Client {
    private ProductA productA;
    private ProductB productB;

    public Client(FactoryOfFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void execute() {
        productA.performAction();
        productB.performAnotherAction();
    }
}
