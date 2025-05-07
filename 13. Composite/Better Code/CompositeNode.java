import java.util.ArrayList;
import java.util.List;

import Interfaces.CompositeNodeInterface;

public class CompositeNode implements CompositeNodeInterface { // CompositeNode can be another CompositeNode
    String compositeNodeName;
    List<CompositeNodeInterface> compositeNodeList;

    public CompositeNode(String name) {
        this.compositeNodeName = name;
        compositeNodeList = new ArrayList<>();
    }

    public void add(CompositeNodeInterface compositeNode) {
        compositeNodeList.add(compositeNode);
    }

    public void function() {
        System.out.println("CompositeNode Name: " + compositeNodeName);

        for (CompositeNodeInterface compositeNode : compositeNodeList) {
            compositeNode.function();
        }
    }

}
