public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.saveState(originator.getState());

        originator.setState("State 2");
        caretaker.saveState(originator.getState());

        originator.setState("State 3");
        System.out.println("Note: " + originator.getState() + " is not saved");

        caretaker.restoreState();
        caretaker.restoreState();
    }
}

// - The client directly interacts with the Originator's internal state (state) via getState() and setState(). This breaks encapsulation by exposing the Originator's internal details
// - The Caretaker is tightly coupled to the internal representation of the Originator. If the Originator's internal structure changes (e.g., state becomes an object instead of a string), the Caretaker must also be updated
// - Encapsulation aims to hide these internal details so changes in one class don’t ripple through the entire system
