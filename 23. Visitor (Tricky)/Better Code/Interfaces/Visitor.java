package Interfaces;

import elementImpl.Element1;
import elementImpl.Element2;

public interface Visitor {
    void visit(Element1 element1);
    void visit(Element2 element2);
}