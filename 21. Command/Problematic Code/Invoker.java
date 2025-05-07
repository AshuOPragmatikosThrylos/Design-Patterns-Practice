public class Invoker {
    private Receiver receiver;

    public Invoker(Receiver receiver) {
        this.receiver = receiver;
    }

    void execute(String action) {
        if ("ActionOne".equals(action)) {
            receiver.actionOne();
        } else if ("ActionTwo".equals(action)) {
            receiver.actionTwo();
        } else {
            System.out.println("Unknown action");
        }
    }
}

// Problems with above code
// 1. Invoker and Receiver are tightly-coupled => harder to change or add new actions/commands
// 2. Adding new actions/commands would require modifying the Invoker class, violating the Open/Closed Principle