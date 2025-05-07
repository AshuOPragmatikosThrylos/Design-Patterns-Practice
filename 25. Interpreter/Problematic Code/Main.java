public class Main {
    public static void main(String[] args) {
        RuleEvaluator evaluator = new RuleEvaluator();

        System.out.println("Rule: A AND B -> Result: " + evaluator.evaluate("A AND B")+"\n");
        System.out.println("Rule: B AND A -> Result: " + evaluator.evaluate("B AND A")+"\n");
        System.out.println("Rule: A OR B -> Result: " + evaluator.evaluate("A OR B")+"\n");
        System.out.println("Rule: B OR A -> Result: " + evaluator.evaluate("B OR A")+"\n");
        System.out.println("Rule: NOT A -> Result: " + evaluator.evaluate("NOT A")+"\n");
        System.out.println("Rule: INVALID RULE -> Result: " + evaluator.evaluate("INVALID RULE"));
    }
}
