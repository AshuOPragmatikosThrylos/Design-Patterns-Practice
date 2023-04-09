import Interfaces.*;

public class Factory2 implements FactoryOfFactoryInterface {
    public Factory1Interface createFactory1() {
        return new Object2Factory1();
    }

    public Factory2Interface createFactory2() {
        return new Object2Factory2();
    }
}
