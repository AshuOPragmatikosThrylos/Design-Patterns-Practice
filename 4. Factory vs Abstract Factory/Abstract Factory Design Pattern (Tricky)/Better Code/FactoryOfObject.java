import Interfaces.ObjectTypeInterface;

public class FactoryOfObject {

    int type;

    FactoryOfObject(int type) {
      this.type = type;
    }

    public void log() {
        switch (type) {
            case 1:
               ObjectTypeInterface objType1 = new ObjectType1();
               objType1.log();
               break;
            case 2:
               ObjectTypeInterface objType2 = new ObjectType2();
               objType2.log();
               break;
            default:
               System.out.println("Invalid Input");
        }
    }

}
