package grammar;

import Interfaces.Expression;

// TerminalExpression
public class VariableExpression implements Expression {
    private boolean value;

    public VariableExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() { // interpret()
        return value;
    }
}
