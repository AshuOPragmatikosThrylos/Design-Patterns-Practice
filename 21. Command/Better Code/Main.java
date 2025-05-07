import Interfaces.Command;
import commandImpl.ActionOneCommand;
import commandImpl.ActionTwoCommand;
import src.Receiver;
import src.Invoker;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command actionOne = new ActionOneCommand(receiver);
        Command actionTwo = new ActionTwoCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(actionOne);
        invoker.executeCommand();

        invoker.setCommand(actionTwo);
        invoker.executeCommand();
    }
}

// setCommand() is useful for GUI buttons or remotes where the same invoker(button) performs different actions based on user input