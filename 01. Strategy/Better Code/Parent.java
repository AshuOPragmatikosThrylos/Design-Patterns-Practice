import Interfaces.FunctionalityInterface;

public class Parent {

    FunctionalityInterface obj;

    Parent(FunctionalityInterface obj) {
        this.obj = obj;
    }

    public void functionality() {
        obj.functionality();
    }
}