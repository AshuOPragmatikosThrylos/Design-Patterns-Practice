public class ConcreteProcessB extends ProcessAbstractClass{

    protected void step1() {
        System.out.println("Overriding step1...");
    }

    @Override
    protected void step2() {
        System.out.println("Executing step2 in ConcreteProcessB...");
    }
    
}
