import Interfaces.FactoryOfFactoryInterface;

class AbstractFactory {
    private final Factory1OfObject factory1 = new Factory1OfObject();
    private final Factory2OfObject factory2 = new Factory2OfObject();

    public Object getObject(int factoryType, int objectType) {
        FactoryOfFactoryInterface factory = null;
        Object object = null;

        if (factoryType == 1) {
            factory = factory1;
        } else if (factoryType == 2) {
            factory = factory2;
        }

        if (factory != null) {
            if (objectType == 1) {
                object = factory.createObject1();
            } else if (objectType == 2) {
                object = factory.createObject2();
            }
        }

        return object;
    }
}