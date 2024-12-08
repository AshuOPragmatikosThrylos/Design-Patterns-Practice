import java.util.*;
import Interfaces.ObjectInterface;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int type = scn.nextInt();

        // creation logic is exposed to client
        // Problem: When I add/remove ObjectTypes I do not want the client to have to change the creation logic
        switch (type) {
            case 1:
               ObjectInterface objType1 = new Object1();
               objType1.log();
               break;
            case 2:
               ObjectInterface objType2 = new Object2();
               objType2.log();
               break;
            default:
               System.out.println("Invalid Input");
        }
        scn.close();
    }
}