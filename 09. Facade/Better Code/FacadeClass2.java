// Use case 1: Expose limited system functions to client
public class FacadeClass2 {

    private OriginalClass originalClass;

    public FacadeClass2() {
        originalClass = new OriginalClass();
    }
 
    // functions 1, 2 not exposed to client through facade class 2


    public void function3() {
        System.out.println("Executing function 3 from facade class 2");
        originalClass.function3();
    }

    public void function99() {
        System.out.println("Executing function 99 from facade class 2");
        originalClass.function99();
    }

    public void function100() {
        System.out.println("Executing function 100 from facade class 2");
        originalClass.function100();
    }
}
