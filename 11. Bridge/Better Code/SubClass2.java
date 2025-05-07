class SubClass2 extends ParentAbstractClass {
    public SubClass2(FunctionalityInterface functionality) {
        super(functionality);
    }

    @Override
    public void abstractMethod() {
        System.out.print("SubClass2: ");
        functionality.functionality();
    }
}