package org.example.ObserverDesignPattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationConcrete implements WeatherStation {
    List<WeatherObserver> observerList = new ArrayList<>();
    double currentTemp;

    public WeatherStationConcrete(float currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public void add(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(double temp) {
        currentTemp = temp;
        notifyObservers();
    }

    @Override
    public double getData() {
        return currentTemp;
    }

}
