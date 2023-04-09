import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int factoryType = scn.nextInt();
        int objectType = scn.nextInt();

        // creation logic is not exposed to client
        FactoryOfFactory factoryOfFactory = new FactoryOfFactory(factoryType); //factory of factories
        factoryOfFactory.log(objectType);
        scn.close();
    }
}