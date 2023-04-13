import Interfaces.BaseTypeInterface;

public class Main {
    public static void main(String[] args) {
        BaseTypeInterface base = new BaseType1();
        base.operation();
        System.out.println();

        base = new AddOnDecorator1ForBaseType1(base);
        // new AddOnDecorator1ForBaseType1(base) --> AddOnDecorator1ForBaseType1 should take a BaseInterface object
        // But interface cannot have a constructor
        // Therefore intermediary Decorator class which takes BaseInterface object

        // base = new ...
        // new AddOnDecorator1ForBaseType1(base) should return/be a BaseInterface object
        // and since AddOnDecorator1ForBaseType1 extends Decorator
        // Therefore Decorator should implement BaseInterface
        base.operation();
        System.out.println();

        base = new AddOnDecorator12ForBaseType1(base); // using already formed object of AddOnDecorator1ForBaseType1 to make object of AddOnDecorator12ForBaseType1
        base.operation();
    }
}
