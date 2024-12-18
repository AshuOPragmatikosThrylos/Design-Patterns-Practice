public class Main {

    public static void main(String args[]) {

        CompositeNode compositeNode1 = new CompositeNode("compositeNode1");

        LeafNode leafNode1 = new LeafNode("leafNode1");
        compositeNode1.add(leafNode1);

        CompositeNode compositeNode2 = new CompositeNode("compositeNode2");
        LeafNode leafNode2 = new LeafNode("leafNode2");
        compositeNode2.add(leafNode2);
        compositeNode1.add(compositeNode2);

        compositeNode1.function();

    }
}
