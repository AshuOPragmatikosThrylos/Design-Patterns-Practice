import Interfaces.Expression;
import grammar.*;

public class Main {
    public static void main(String[] args) {
        RuleRegistry registry = new RuleRegistry();

        // Define Rules
        registry.addRule("A AND B", new AndExpression(new VariableExpression(true), new VariableExpression(false)));
        registry.addRule("B AND A", new AndExpression(new VariableExpression(false), new VariableExpression(true)));
        registry.addRule("A OR B", new OrExpression(new VariableExpression(true), new VariableExpression(false)));
        registry.addRule("B OR A", new OrExpression(new VariableExpression(false), new VariableExpression(true)));
        registry.addRule("NOT A", new NotExpression(new VariableExpression(true)));

        RuleEvaluator evaluator = new RuleEvaluator(registry);

        System.out.println("Rule: A AND B -> Result: " + evaluator.evaluate("A AND B"));
        System.out.println("Rule: B AND A -> Result: " + evaluator.evaluate("B AND A"));
        System.out.println("Rule: A OR B -> Result: " + evaluator.evaluate("A OR B"));
        System.out.println("Rule: B OR A -> Result: " + evaluator.evaluate("B OR A"));
        System.out.println("Rule: NOT A -> Result: " + evaluator.evaluate("NOT A"));
        System.out.println("Rule: INVALID RULE -> Result: " + evaluator.evaluate("INVALID RULE"));

        // Adding a new rule dynamically
        registry.addRule("A AND NOT B", new AndExpression(new VariableExpression(true), new NotExpression(new VariableExpression(false))));
        System.out.println("Rule: A AND NOT B -> Result: " + evaluator.evaluate("A AND NOT B"));
    }
}
