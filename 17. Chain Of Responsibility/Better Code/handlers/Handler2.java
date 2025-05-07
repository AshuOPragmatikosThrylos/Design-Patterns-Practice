package handlers;

import src.AbstractHandler;
import src.Request;

public class Handler2 extends AbstractHandler {
    @Override
    protected boolean canHandle(Request request) {
        return "Type2".equals(request.getType());
    }

    @Override
    protected void process(Request request) {
        System.out.println("Handler2 processed the request: " + request.getData());
    }
}