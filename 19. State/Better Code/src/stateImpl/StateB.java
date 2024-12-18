package src.stateImpl;

import Interfaces.State;

public class StateB implements State {
    @Override
    public void operationA(Context context) {
        throw new UnsupportedOperationException("operationA is not supported in StateB");
    }

    @Override
    public void operationB(Context context) {
        System.out.println("operationB executed in StateB. Transitioning to StateC");
        context.setState(new StateC());
    }

    @Override
    public void operationC(Context context) {
        throw new UnsupportedOperationException("operationC is not supported in StateB");
    }
}