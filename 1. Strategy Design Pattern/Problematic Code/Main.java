public class Main {
    public static void main(String []args) {
        System.out.println("NormalChild: ");
        NormalChild normalChild = new NormalChild();
        normalChild.functionality();
        System.out.println();

        System.out.println("SpecialChild1: ");
        SpecialChild1 specialChild1 = new SpecialChild1();
        specialChild1.functionality();
        System.out.println();

        System.out.println("SpecialChild2: ");
        SpecialChild2 specialChild2 = new SpecialChild2();
        specialChild2.functionality();
        System.out.println();
    }
}