package grammar;

import Interfaces.Expression;

// NonTerminalExpression
public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean evaluate() { // interpret()
        return expr1.evaluate() && expr2.evaluate();
    }
}
