import src.stateImpl.Context;
import src.stateImpl.StateA;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StateA());

        try {
            context.performOperationA();
            context.performOperationB();
            context.performOperationC();
            context.performOperationB();
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
        }
    }
}