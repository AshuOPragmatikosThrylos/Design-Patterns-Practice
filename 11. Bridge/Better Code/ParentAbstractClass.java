abstract class ParentAbstractClass {
    protected FunctionalityInterface functionality;

    protected ParentAbstractClass(FunctionalityInterface functionality) {
        this.functionality = functionality;
    }

    public abstract void abstractMethod();
}