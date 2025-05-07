import java.util.*;

import Interfaces.ObjectInterface;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter factory type (1 for Factory1, 2 for Factory2): ");
        int factoryType = scn.nextInt();
        System.out.print("Enter object type (1 for Object1, 2 for Object2): ");
        int objectType = scn.nextInt();

        AbstractFactory abstractFactory = new AbstractFactory();
        ObjectInterface desiredObject = abstractFactory.getObject(factoryType, objectType);

        if (desiredObject != null)
            desiredObject.log();
        else
            System.out.println("Invalid Input");
        scn.close();
    }
}