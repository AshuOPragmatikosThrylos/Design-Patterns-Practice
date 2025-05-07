import java.util.Stack;

public class Caretaker {
    private final Stack<String> stateHistory = new Stack<>(); // tightly coupled with originator's internal structure (State is of string type; originator's state is of ype string)

    public void saveState(String state) {
        System.out.println("Saving State: " + state);
        stateHistory.push(state);
    }

    public String restoreState() {
        if (!stateHistory.isEmpty()) {
            String state = stateHistory.pop();
            System.out.println("State restored to: " + state);
            return state;
        }
        System.out.println("Empty stack. No state to restore");
        return null;
    }
}