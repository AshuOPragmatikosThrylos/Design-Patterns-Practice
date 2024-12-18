package Interfaces;

public interface ObservableInterface {

    void register(ObserverInterface observer);

    void event();
}