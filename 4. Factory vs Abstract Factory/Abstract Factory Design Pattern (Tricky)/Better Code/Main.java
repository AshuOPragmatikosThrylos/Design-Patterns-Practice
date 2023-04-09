import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int factoryType = scn.nextInt();
        int objectType = scn.nextInt();

        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.getObject(factoryType, objectType);

        scn.close();
    }
}