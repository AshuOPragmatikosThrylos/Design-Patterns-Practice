import Interfaces.FactoryOfFactoryInterface;

class Factory1OfObject implements FactoryOfFactoryInterface {
    public Object createObject1() {
        System.out.print("Factory1OfObject created ");
        return new ObjectType1();
    }

    public Object createObject2() {
        System.out.print("Factory1OfObject created ");
        return new ObjectType2();
    }
}