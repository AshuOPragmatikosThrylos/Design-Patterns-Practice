import Interfaces.ObjectTypeInterface;

public class FactoryOfObject {

   public ObjectTypeInterface getObject(int type) {
      switch (type) {
         case 1:
            return new ObjectType1();
         case 2:
            return new ObjectType2();
         default:
            return null;
      }
   }

}
