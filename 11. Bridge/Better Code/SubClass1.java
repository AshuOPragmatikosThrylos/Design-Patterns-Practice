class SubClass1 extends ParentAbstractClass {
    public SubClass1(FunctionalityInterface functionality) {
        super(functionality);
    }

    @Override
    public void abstractMethod() {
        System.out.print("SubClass1: ");
        functionality.functionality();
    }
}