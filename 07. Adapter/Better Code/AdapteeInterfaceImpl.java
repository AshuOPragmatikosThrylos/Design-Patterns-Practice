import Interfaces.AdapteeInterface;

public class AdapteeInterfaceImpl implements AdapteeInterface {
    @Override
    public void actualOperation() {
        System.out.println("Internally calling actualOperation");
    }
}