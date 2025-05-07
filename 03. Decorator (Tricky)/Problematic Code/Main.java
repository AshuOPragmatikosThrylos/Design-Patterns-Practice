import Interfaces.BaseTypeInterface;

public class Main {
    public static void main(String[] args) {
        BaseTypeInterface base1 = new BaseType1();
        base1.operation();
        System.out.println();

        AddOnCombination1ForBaseType1 addOnCombination1ForClassA = new AddOnCombination1ForBaseType1();
        addOnCombination1ForClassA.additionalOperation();
        System.out.println();

        AddOnCombination12ForBaseType1 addOnCombination2ForClassA = new AddOnCombination12ForBaseType1(); // not using already formed object of AddOnCombination1ForBaseType1 to make object of AddOnCombination12ForBaseType1
        addOnCombination2ForClassA.additionalOperation();


    }
}
