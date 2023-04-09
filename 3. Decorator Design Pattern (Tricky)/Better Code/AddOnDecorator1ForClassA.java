import Interfaces.BaseInterface;

public class AddOnDecorator1ForClassA extends Decorator {
    public AddOnDecorator1ForClassA(BaseInterface base) {
        super(base);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("AddOnDecorator1ForClassA additional operation.");
    }
}
/*
 Why an extra layer of Decorator class? Why can't AddOnDecorator1ForClassA directly implement BaseInterface? or why can't Decorator be an interface itself?
 --> Refer Main.java
 */
