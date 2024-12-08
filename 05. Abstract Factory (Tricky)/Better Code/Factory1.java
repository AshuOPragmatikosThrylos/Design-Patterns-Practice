import Interfaces.FactoryInterface;
import Interfaces.ObjectInterface;

class Factory1 implements FactoryInterface {
    public ObjectInterface createObject1() {
        System.out.print("Factory1 created ");
        return new Object1();
    }

    public ObjectInterface createObject2() {
        System.out.print("Factory1 created ");
        return new Object2();
    }
}