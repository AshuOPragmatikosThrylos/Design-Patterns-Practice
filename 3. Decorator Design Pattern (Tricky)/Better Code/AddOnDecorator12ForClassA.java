import Interfaces.BaseInterface;

public class AddOnDecorator12ForClassA extends Decorator {
    public AddOnDecorator12ForClassA(BaseInterface base) {
        super(base);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("AddOnDecorator12ForClassA additional operation.");
    }
}
