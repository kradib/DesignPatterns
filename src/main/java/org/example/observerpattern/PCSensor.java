package org.example.observerpattern;

public class PCSensor implements  IObserver {
    WeatherStation weatherStation;
    public PCSensor(final WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        this.display(weatherStation.getTemperature());
    }

    public void display(double temperature) {
        System.out.println("The temperature at PC sensor is : " + temperature);
    }
}
