package Interfaces;

public interface ObservableInterface {

    public void register(ObserverInterface observer);

    public void event();
}