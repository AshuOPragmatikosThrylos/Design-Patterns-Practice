// Use case 1: Expose limited system functions to client
public class FacadeClass1 {

    private OriginalClass originalClass;

    public FacadeClass1() {
        originalClass = new OriginalClass();
    }

    public void function1() {
        System.out.println("Executing function 1 from facade class 1");
        originalClass.function1();
    }

    public void function2() {
        System.out.println("Executing function 2 from facade class 1");
        originalClass.function2();
    }

    // functions 3-100 not exposed to client through facade class 1
}
