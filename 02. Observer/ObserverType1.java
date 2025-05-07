import Interfaces.ObserverInterface;

public class ObserverType1 implements ObserverInterface {
    
    public void actionPerformed() {
        System.out.println(" notified of event on Observable");
    }
}
