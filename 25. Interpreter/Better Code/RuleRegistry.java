import java.util.HashMap;
import java.util.Map;

import Interfaces.Expression;

public class RuleRegistry {
    private final Map<String, Expression> rules = new HashMap<>();

    public void addRule(String ruleName, Expression expression) {
        rules.put(ruleName, expression);
    }

    public Expression getRule(String ruleName) {
        return rules.get(ruleName);
    }
}
