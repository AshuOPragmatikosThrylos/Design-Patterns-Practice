package handlers;

import src.AbstractHandler;
import src.Request;

public class Handler1 extends AbstractHandler {
    @Override
    protected boolean canHandle(Request request) {
        return "Type1".equals(request.getType());
    }

    @Override
    protected void process(Request request) {
        System.out.println("Handler1 processed the request: " + request.getData());
    }
}
