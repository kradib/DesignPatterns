package org.example.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IObserver> observerList = new ArrayList<>();
        WeatherStation weatherStation = new WeatherStation(observerList, 10);
        //create Observer
        IObserver pcSensor = new PCSensor(weatherStation);
        IObserver mobileSensor = new MobileSensor(weatherStation);
        //add the observers
        weatherStation.add(pcSensor);
        weatherStation.add(mobileSensor);

        //update temperature
        weatherStation.setTemperature(12);
    }
}
