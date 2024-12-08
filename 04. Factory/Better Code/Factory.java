import Interfaces.ObjectInterface;

public class Factory {

   public ObjectInterface getObject(int type) {
      switch (type) {
         case 1:
            return new Object1();
         case 2:
            return new Object2();
         default:
            return null;
      }
   }

}
