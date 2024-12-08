package Interfaces;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
