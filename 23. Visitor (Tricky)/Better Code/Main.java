import Interfaces.Visitor;
import Interfaces.Element;
import elementImpl.Element1;
import elementImpl.Element2;
import visitorImpl.Visitor1;
import visitorImpl.Visitor2;

public class Main {
    public static void main(String[] args) {
        Element element1 = new Element1();
        Element element2 = new Element2();

        Visitor visitor1 = new Visitor1();
        Visitor visitor2 = new Visitor2();

        System.out.println("Applying Visitor1 on all elements");
        element1.accept(visitor1);
        element2.accept(visitor1);

        System.out.println("\nApplying Visitor2 on all elements");
        element1.accept(visitor2);
        element2.accept(visitor2);
    }
}
