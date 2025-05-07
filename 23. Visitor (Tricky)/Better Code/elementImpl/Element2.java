package elementImpl;

import Interfaces.Element;
import Interfaces.Visitor;

public class Element2 implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
