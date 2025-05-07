import Interfaces.AdapteeInterface;
import Interfaces.AdapterInterface;

// Adapter Class (adapts the AdapteeInterface to the AdapterInterface)
public class AdapterInterfaceImpl implements AdapterInterface {
    private final AdapteeInterface adaptee;

    public AdapterInterfaceImpl(AdapteeInterface adaptee) {
        this.adaptee = adaptee;  // Constructor determines which AdapteeInterface to use
    }

    @Override
    public void adaptActualOperation() {
        System.out.println("Adapted operation called");
        adaptee.actualOperation();
    }
}