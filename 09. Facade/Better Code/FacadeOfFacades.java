public class FacadeOfFacades {
    private FacadeClass1 facadeClass1;
    private FacadeClass2 facadeClass2;

    public FacadeOfFacades() {
        facadeClass1 = new FacadeClass1();
        facadeClass2 = new FacadeClass2();
    }      
    
    public void mergedFacadeFunction() {
        System.out.println("Executing facade of facades");
        functionsfromFacade1();
        functionsfromFacade2();
    }

    // Use case 2: Combine functions into one
    public void functionsfromFacade1() {
        System.out.println("Executing combined functions 1,2 from facade class 1");
        facadeClass1.function1();
        facadeClass1.function2();
    }

    public void functionsfromFacade2() {
        System.out.println("Executing combined functions 3-100 from facade class 2");
        facadeClass2.function3();
        facadeClass2.function99();
        facadeClass2.function100();
    }
}
