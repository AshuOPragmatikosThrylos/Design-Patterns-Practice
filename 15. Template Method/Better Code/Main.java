public class Main {
    public static void main(String[] args) {
        ProcessAbstractClass processA = new ConcreteProcessA();
        ProcessAbstractClass processB = new ConcreteProcessB();

        System.out.println("Executing ConcreteProcessA:");
        processA.execute();

        System.out.println("\nExecuting ConcreteProcessB:");
        processB.execute();
    }
}