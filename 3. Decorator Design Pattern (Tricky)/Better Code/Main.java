import Interfaces.BaseInterface;

public class Main {
    public static void main(String[] args) {
        BaseInterface base = new ConcreteClassA();
        base.operation();
        System.out.println();

        base = new AddOnDecorator1ForClassA(base);
        // new AddOnDecorator1ForClassA(base) --> AddOnDecorator1ForClassA should take a BaseInterface object
        // But interface cannot have a constructor
        // Therefore intermediary Decorator class which takes BaseInterface object

        // base = new ...
        // new AddOnDecorator1ForClassA(base) should return/be a BaseInterface object
        // and since AddOnDecorator1ForClassA extends Decorator
        // Therefore Decorator should implement BaseInterface
        base.operation();
        System.out.println();

        base = new AddOnDecorator12ForClassA(base); // using already formed object of AddOnDecorator1ForClassA to make object of AddOnDecorator12ForClassA
        base.operation();
    }
}
