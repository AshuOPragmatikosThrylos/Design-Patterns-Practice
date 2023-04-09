import Interfaces.FactoryTypeInterface;

public class FactoryOfFactory {

    int factoryType;

    FactoryOfFactory(int factoryType) {
      this.factoryType = factoryType;
    }

    public void log(int objectType) {
        switch (factoryType) {
            case 1:
               FactoryTypeInterface factoryType1 = new FactoryType1(objectType);
               factoryType1.log();
               break;
            case 2:
                FactoryTypeInterface factoryType2 = new FactoryType2(objectType);
                factoryType2.log();
                break;
            default:
               System.out.println("Invalid Input: factoryType");
        }
    }

}
