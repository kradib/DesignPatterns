package org.example.observerpattern;

public interface IObservable {

    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
}
