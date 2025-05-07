package src.stateImpl;

import Interfaces.State;

public class Context {
    private State currentState;

    public Context(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void performOperationA() {
        currentState.operationA(this);
    }

    public void performOperationB() {
        currentState.operationB(this);
    }

    public void performOperationC() {
        currentState.operationC(this);
    }
}
