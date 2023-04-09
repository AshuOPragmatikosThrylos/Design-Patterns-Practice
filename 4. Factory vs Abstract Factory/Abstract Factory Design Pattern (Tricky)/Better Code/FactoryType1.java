import Interfaces.*;

public class FactoryType1 extends FactoryOfObject implements FactoryTypeInterface {


    FactoryType1(int objectType) {
       super(objectType);
       factoryLog();
    }

    public void factoryLog () {
        System.out.println("FactoryType1 chosen");
    }

    public void log() {
       super.log();
    }
}
