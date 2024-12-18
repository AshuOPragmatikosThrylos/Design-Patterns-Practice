public class Main {
    public static void main(String[] args) {
        Entity entity1 = new Entity("Property Value");
        Entity entity2 = null;

        printEntityProperty(entity1);
        printEntityProperty(entity2);
    }

    public static void printEntityProperty(Entity entity) {
        if (entity != null) { // to prevent NPE
            System.out.println("Entity property is: " + entity.getProperty());
        } else {
            System.out.println("Entity does not exist");
        }
    }
}