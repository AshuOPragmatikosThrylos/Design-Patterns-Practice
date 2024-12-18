public class Main {
    public static void main(String []args) {
        System.out.println("NormalChild: ");
        Child normalChild = new Child(new NormalFunctionality());
        normalChild.functionality();
        System.out.println();

        System.out.println("SpecialChild1: ");
        Child specialChild1 = new Child(new SpecialFunctionality());
        specialChild1.functionality();
        System.out.println();

        System.out.println("SpecialChild2: ");
        Child specialChild2 = new Child(new SpecialFunctionality());
        specialChild2.functionality();
        System.out.println();
    }
}