import java.util.*;
import Interfaces.ObjectTypeInterface;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int type = scn.nextInt();

        // creation logic is not exposed to client
        FactoryOfObject factory = new FactoryOfObject();
        ObjectTypeInterface desiredObject = factory.getObject(type);
        if (desiredObject != null)
            desiredObject.log();
        else
            System.out.println("Invalid Input");
        scn.close();
    }
}