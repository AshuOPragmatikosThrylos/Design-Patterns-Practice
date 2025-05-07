public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        System.out.println("Note: State 3 is not saved");

        // Undo to previous states
        originator.restoreStateFromMemento(caretaker.getMemento());
        originator.restoreStateFromMemento(caretaker.getMemento());
    }
}

// - The client (neither the caretaker) does not directly interact with the Originator's state. Instead, it handles Memento objects that encapsulate the state details, preserving encapsulation
// - If the Originator's state becomes more complex, the changes are localized to the Memento and Originator classes. The Caretaker remains unaffected
