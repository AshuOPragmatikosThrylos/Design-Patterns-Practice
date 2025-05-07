import Interfaces.Prototype;

public class ConcretePrototype implements Prototype<ConcretePrototype> {
    private String name;
    private int value;

    public ConcretePrototype(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this.name, this.value);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{name = '" + name + "', value = " + value + "}";
    }
}

