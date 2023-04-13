import Interfaces.BaseTypeInterface;

public class AddOnDecorator1ForBaseType1 extends Decorator {
    public AddOnDecorator1ForBaseType1(BaseTypeInterface base) {
        super(base);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("AddOnDecorator1ForBaseType1 additional operation.");
    }
}
/*
 Why an extra layer of Decorator class? Why can't AddOnDecorator1ForBaseType1 directly implement BaseInterface? or why can't Decorator be an interface itself?
 --> Refer Main.java
 */
