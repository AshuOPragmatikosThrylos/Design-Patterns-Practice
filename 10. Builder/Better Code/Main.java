public class Main {
    public static void main(String[] args) {
        // Using BuilderType1, only building partA
        Builder builder1 = new BuilderType1();
        Director1 director1 = new Director1(builder1);
        Product product1 = director1.construct();
        System.out.println(product1);

        //Using BuilderType2, building both partA and partB
        Builder builder2 = new BuilderType2();
        Director2 director2 = new Director2(builder2);
        Product product2 = director2.construct();
        System.out.println(product2);
    }
}