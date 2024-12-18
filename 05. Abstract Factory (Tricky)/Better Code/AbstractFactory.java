import Interfaces.FactoryInterface;
import Interfaces.ObjectInterface;

class AbstractFactory {

    public ObjectInterface getObject(int factoryType, int objectType) {
        FactoryInterface factory = null;
        ObjectInterface object = null;

        if (factoryType == 1) {
            factory = new Factory1();
        } else if (factoryType == 2) {
            factory = new Factory2();
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