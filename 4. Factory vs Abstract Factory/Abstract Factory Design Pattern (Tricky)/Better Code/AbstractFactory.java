import Interfaces.FactoryOfFactoryInterface;

class AbstractFactory {

    public Object getObject(int factoryType, int objectType) {
        FactoryOfFactoryInterface factory = null;
        Object object = null;

        if (factoryType == 1) {
            factory = new Factory1OfObject();
        } else if (factoryType == 2) {
            factory = new Factory2OfObject();
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