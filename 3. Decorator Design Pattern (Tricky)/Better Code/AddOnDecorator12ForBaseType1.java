import Interfaces.BaseInterface;

public class AddOnDecorator12ForBaseType1 extends Decorator {
    public AddOnDecorator12ForBaseType1(BaseInterface base) {
        super(base);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("AddOnDecorator12ForBaseType1 additional operation.");
    }
}
