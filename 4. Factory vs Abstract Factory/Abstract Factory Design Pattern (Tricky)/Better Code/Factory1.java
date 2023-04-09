import Interfaces.*;

public class Factory1 implements FactoryOfFactoryInterface {
    public Factory1Interface createFactory1() {
        return new Object1Factory1();
    }

    public Factory2Interface createFactory2() {
        return new Object1Factory2();
    }
}
