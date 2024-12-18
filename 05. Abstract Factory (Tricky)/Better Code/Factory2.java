import Interfaces.FactoryInterface;
import Interfaces.ObjectInterface;

class Factory2 implements FactoryInterface {
    public ObjectInterface createObject1() {
        System.out.print("Factory2 created ");
        return new Object1();
    }

    public ObjectInterface createObject2() {
        System.out.print("Factory2 created ");
        return new Object2();
    }
}