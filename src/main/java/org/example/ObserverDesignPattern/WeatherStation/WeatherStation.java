package org.example.ObserverDesignPattern.WeatherStation;

public interface WeatherStation {
    void add(WeatherObserver observer);

    void remove(WeatherObserver observer);

    void notifyObservers();

    void setData(double temp);

    double getData();




}
