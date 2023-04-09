import Interfaces.*;

public class Client {
    private Factory1Interface factory1;
    private Factory2Interface factory2;

    public Client(FactoryOfFactoryInterface factory) {
        factory1 = factory.createFactory1();
        factory2 = factory.createFactory2();
    }

    public void execute() {
        factory1.performAction();
        factory2.performAction();
    }
}
