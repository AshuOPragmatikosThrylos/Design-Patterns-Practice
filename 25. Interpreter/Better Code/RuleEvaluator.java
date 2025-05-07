import Interfaces.Expression;

public class RuleEvaluator {
    private final RuleRegistry ruleRegistry;

    public RuleEvaluator(RuleRegistry ruleRegistry) {
        this.ruleRegistry = ruleRegistry;
    }

    public Boolean evaluate(String ruleName) {
        Expression expression = ruleRegistry.getRule(ruleName);
        if (expression != null) {
            return expression.evaluate();
        } else {
            return null; // Invalid rule
        }
    }
}
