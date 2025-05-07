package src.stateImpl;

import Interfaces.State;

public class StateA implements State {
    @Override
    public void operationA(Context context) {
        System.out.println("operationA executed in StateA. Transitioning to StateB");
        context.setState(new StateB());
    }

    @Override
    public void operationB(Context context) {
        throw new UnsupportedOperationException("operationB is not supported in StateA");
    }

    @Override
    public void operationC(Context context) {
        throw new UnsupportedOperationException("operationC is not supported in StateA");
    }
}