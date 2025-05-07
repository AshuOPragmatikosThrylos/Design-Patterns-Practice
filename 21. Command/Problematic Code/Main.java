public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(receiver);

        invoker.execute("ActionOne");
        invoker.execute("ActionTwo");
    }
}