import java.util.*;

import Interfaces.ObservableInterface;
import Interfaces.ObserverInterface;

public class Observable1 implements ObservableInterface {

    List<ObserverInterface> observerList = new ArrayList<>(); // note: observerList not in Observable interface cuz data members in interface are final

    public void register(ObserverInterface observer) {
        observerList.add(observer);
    }

    public void event() {
        System.out.println("Event occured on Observable");
        for(int i=0; i<observerList.size(); i++) {
            System.out.print("Observer " + i);
            observerList.get(i).actionPerformed();
        }
    }
    
}
