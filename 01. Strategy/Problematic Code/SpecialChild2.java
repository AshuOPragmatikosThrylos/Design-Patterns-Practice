public class SpecialChild2 extends Parent {

    public void functionality() {
        System.out.println("Child's own special functionality"); 
        /* 
        SpecialClass2 wants its own special functionality not the one provided by the parent. But when its own special functionality is exactly the same as that implemented by SpecialClass1, then why the code redundancy?
        We can write the redundant code only in 1 place in a class. And since all Child are not like SpecialChild1, some are NormalChild as well, therefore it's like multiple implementations of the same functionality ==> Interface
        */
        
    }
}