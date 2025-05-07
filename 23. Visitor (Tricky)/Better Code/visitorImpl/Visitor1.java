package visitorImpl;

import Interfaces.Visitor;
import elementImpl.Element1;
import elementImpl.Element2;

public class Visitor1 implements Visitor {
    @Override
    public void visit(Element1 element1) {
        System.out.println("Performing operation - Visitor1 on Element1");
    }

    @Override
    public void visit(Element2 element2) {
        System.out.println("Performing operation - Visitor1 on Element2");
    }
}