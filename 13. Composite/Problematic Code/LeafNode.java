public class LeafNode {

    String leafNodeName;

    public LeafNode(String name) {
        this.leafNodeName = name;
    }

    public void function() {
        System.out.println("LeafNode name " + leafNodeName);
    }
}
