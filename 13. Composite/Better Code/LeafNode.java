import Interfaces.CompositeNodeInterface;

// LeafNode is a CompositeNode -> In other words CompositeNode can be a LeafNode
public class LeafNode implements CompositeNodeInterface {
    String leafNodeName;

    public LeafNode(String name){
        this.leafNodeName = name;
    }

    public void function() {
        System.out.println("LeafNode name " + leafNodeName);
    }

}
