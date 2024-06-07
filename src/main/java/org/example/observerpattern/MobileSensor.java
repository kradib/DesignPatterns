package org.example.observerpattern;

public class MobileSensor implements IObserver {

    WeatherStation weatherStation;

    public MobileSensor(final WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.display(weatherStation.getTemperature());

    }

    public void display(double temperature) {
        System.out.println("The temperature at Mobil sensor is : " + temperature);
    }
}
