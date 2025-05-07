public class Main {
    public static void main(String[] args) {
        ParentAbstractClass obj1 = new SubClass1(new Functionality1());
        ParentAbstractClass obj2 = new SubClass1(new Functionality2());
        ParentAbstractClass obj3 = new SubClass2(new Functionality2());

        obj1.abstractMethod();
        obj2.abstractMethod();
        obj3.abstractMethod();
    }
}