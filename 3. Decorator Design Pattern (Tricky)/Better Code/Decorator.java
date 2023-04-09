import Interfaces.BaseInterface;

public abstract class Decorator implements BaseInterface { // decorator is-a base
    protected BaseInterface base; // decorator has-a base

    public Decorator(BaseInterface base) {
        this.base = base;
    }

    @Override
    public void operation() {
        base.operation();
    }
}

// either implement the abstract methods of the interface or declare yourself abstract class
// Decorator should be an abstract class cuz I want its child classes to mandatorily implement their own operation() with addOn operations
