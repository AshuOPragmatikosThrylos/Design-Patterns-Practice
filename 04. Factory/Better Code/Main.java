import java.util.*;
import Interfaces.ObjectInterface;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter object type (1 for Object1, 2 for Object1): ");
        int type = scn.nextInt();

        // creation logic is not exposed to client
        Factory factory = new Factory();
        ObjectInterface desiredObject = factory.getObject(type);
        if (desiredObject != null)
            desiredObject.log();
        else
            System.out.println("Invalid Input");
        scn.close();
    }
}