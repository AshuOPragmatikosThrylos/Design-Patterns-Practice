package handlers;

import src.AbstractHandler;
import src.Request;


public class DefaultHandler extends AbstractHandler {
    @Override
    protected boolean canHandle(Request request) {
        return true; // Handles any remaining requests
    }

    @Override
    protected void process(Request request) {
        System.out.println("DefaultHandler processed the request: " + request.getData());
    }
}