import java.util.Stack;

// Caretaker: Manages the Mementos without knowing their internal details
public class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>(); // not tightly coupled with originator's internal structure (State is not of string type; originator's state is of ype string)

    public void saveMemento(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        System.out.println("Empty stack. No state to restore");
        return null;
    }
}