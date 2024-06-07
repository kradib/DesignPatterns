package org.example.observerpattern;

import java.util.List;

public class WeatherStation implements IObservable{

    private final List<IObserver> observers;
    private double temperature;

    public WeatherStation(final List<IObserver> observers, final double temperature) {
        this.observers = observers;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }
}
