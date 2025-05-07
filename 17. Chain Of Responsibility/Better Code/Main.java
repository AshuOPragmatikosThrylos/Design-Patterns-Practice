import handlers.DefaultHandler;
import handlers.Handler1;
import handlers.Handler2;
import src.AbstractHandler;
import src.Request;

public class Main {
    public static void main(String[] args) {

        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler defaultHandler = new DefaultHandler();

        // Set up the chain
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(defaultHandler);

        Request request1 = new Request("Type1", "Data for 1");
        Request request2 = new Request("Type2", "Data for 2");
        Request request3 = new Request("Type3", "Data for 3");

        // Send requests through the chain
        handler1.handleRequest(request1);
        handler1.handleRequest(request2); // handler1 skips this request
        handler1.handleRequest(request3); // handler1, handler2 skip this request
    }
}
