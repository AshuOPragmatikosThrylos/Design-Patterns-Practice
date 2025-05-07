public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("TypeA", new ConcretePrototype("PrototypeA", 100));
        registry.addPrototype("TypeB", new ConcretePrototype("PrototypeB", 200));

        ConcretePrototype prototypeA = registry.getPrototype("TypeA");
        System.out.println("Cloned Prototype A: " + prototypeA);

        // Modify cloned prototypes
        prototypeA.setName("ModifiedA");
        prototypeA.setValue(150);

        System.out.println("Modified Prototype A: " + prototypeA);
        System.out.println("Original Prototype A in Registry remains unchanged: " + registry.getPrototype("TypeA"));
    }
}
