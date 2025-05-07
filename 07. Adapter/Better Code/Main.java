import Interfaces.AdapterInterface;
import Interfaces.AdapteeInterface;

public class Main {
    public static void main(String[] args) {
        AdapterInterface adapter = new AdapterInterfaceImpl(new AdapteeInterfaceImpl());
        adapter.adaptActualOperation();
    }
}
