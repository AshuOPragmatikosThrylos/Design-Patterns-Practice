public class Main {
    public static void main(String[] args) {
        AbstractEntity entity1 = EntityFactory.getEntity("Property Value");
        AbstractEntity entity2 = EntityFactory.getEntity(null);

        printEntityProperty(entity1);
        printEntityProperty(entity2);
    }

    public static void printEntityProperty(AbstractEntity entity) {
        System.out.println("Entity property is: " + entity.getProperty());
    }
}