public class RuleEvaluator {

    public Boolean evaluate(String rule) {
        if (rule.equals("A AND B")) {
            return evaluateA() && evaluateB();
        } else if (rule.equals("B AND A")) {
            return evaluateB() && evaluateA();
        } else if (rule.equals("A OR B")) {
            return evaluateA() || evaluateB();
        } else if (rule.equals("B OR A")) {
            return evaluateB() || evaluateA();
        } else if (rule.equals("NOT A")) {
            return !evaluateA();
        } else {
            return null;
        }
    }

    private boolean evaluateA() {
        boolean dummyValue = true;
        System.out.println("Evaluating condition A: " + dummyValue);
        return dummyValue;
    }

    private boolean evaluateB() {
        boolean dummyValue = false;
        System.out.println("Evaluating condition B: " + dummyValue);
        return dummyValue;
    }
}

// As the number of logical expressions grows, adding new ones = modifying the method = inextensible