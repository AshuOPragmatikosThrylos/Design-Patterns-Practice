package src.stateImpl;

import Interfaces.State;

public class StateC implements State {
    @Override
    public void operationA(Context context) {
        throw new UnsupportedOperationException("operationA is not supported in StateC");
    }

    @Override
    public void operationB(Context context) {
        throw new UnsupportedOperationException("operationB is not supported in StateC");
    }

    @Override
    public void operationC(Context context) {
        System.out.println("operationC executed in StateC. Transitioning back to StateA");
        context.setState(new StateA());
    }
}
