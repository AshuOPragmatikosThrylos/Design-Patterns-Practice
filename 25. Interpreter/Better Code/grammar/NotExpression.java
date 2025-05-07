package grammar;

import Interfaces.Expression;

// NonTerminalExpression
public class NotExpression implements Expression {
    private Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    @Override
    public boolean evaluate() { // interpret()
        return !expr.evaluate();
    }
}
