import Interfaces.BaseInterface;

public class Main {
    public static void main(String[] args) {
        BaseInterface base1 = new ConcreteClassA();
        base1.operation();
        System.out.println();

        AddOnCombination1ForClassA addOnCombination1ForClassA = new AddOnCombination1ForClassA();
        addOnCombination1ForClassA.additionalOperation();
        System.out.println();

        AddOnCombination12ForClassA addOnCombination2ForClassA = new AddOnCombination12ForClassA(); // not using already formed object of AddOnCombination1ForClassA to make object of AddOnCombination12ForClassA
        addOnCombination2ForClassA.additionalOperation();


    }
}
