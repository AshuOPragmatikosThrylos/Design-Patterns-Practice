abstract class ProcessAbstractClass {
    // Template method - ensures steps are followed in a specific sequence
    public final void execute() { // 'final' to prevent subclasses from changing the sequence
        step1();
        step2();
        step3();
    }

    //optional to override
    protected void step1() {
        System.out.println("Default step1...");
    }

    // Abstract step to be implemented by subclasses
    protected abstract void step2();

    //optional to override
    protected void step3() {
        System.out.println("Default step3...");
    }
}
