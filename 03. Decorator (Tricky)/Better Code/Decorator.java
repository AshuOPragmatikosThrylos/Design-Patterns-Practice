import Interfaces.BaseTypeInterface;

public abstract class Decorator implements BaseTypeInterface { // decorator is-a base
    protected BaseTypeInterface base; // decorator has-a base

    public Decorator(BaseTypeInterface base) {
        this.base = base;
    }

    @Override
    public void operation() {
        base.operation();
    }
}

// either implement the abstract methods of the interface or declare yourself abstract class
// Decorator should be an abstract class cuz I want its child classes to mandatorily implement their own operation() with addOn operations

// abstract class might not have any abstract method. But if a class has even 1 abstract method then the class has to be declared abstract
