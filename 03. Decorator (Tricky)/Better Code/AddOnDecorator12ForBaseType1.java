import Interfaces.BaseTypeInterface;

public class AddOnDecorator12ForBaseType1 extends Decorator {
    public AddOnDecorator12ForBaseType1(BaseTypeInterface base) {
        super(base);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("AddOnDecorator12ForBaseType1 additional operation.");
    }
}
