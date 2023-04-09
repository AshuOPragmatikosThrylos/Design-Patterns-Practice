import Interfaces.*;

public class FactoryType2 extends FactoryOfObject implements FactoryTypeInterface {


    FactoryType2(int objectType) {
       super(objectType);
       factoryLog();
    }

    public void factoryLog () {
        System.out.println("FactoryType2 chosen");
    }

    public void log() {
       super.log();
    }
}
