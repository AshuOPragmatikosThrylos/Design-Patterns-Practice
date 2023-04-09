import Interfaces.*;

public class ConcreteFactory2 implements FactoryOfFactory {
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
