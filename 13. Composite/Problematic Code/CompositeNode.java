import java.util.ArrayList;
import java.util.List;

public class CompositeNode {
    String compositeNodeName;
    List<Object> objectList;

    public CompositeNode(String name) {
        this.compositeNodeName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void function() {
        System.out.println("CompositeNode Name: " + compositeNodeName);
        for (Object obj : objectList) {

            // if-else ladder: disadvantage of not using interfaces/composite DP
            if (obj instanceof LeafNode node) {
                node.function();
            } else if (obj instanceof CompositeNode node) {
                node.function();
            }
        }
    }
}
