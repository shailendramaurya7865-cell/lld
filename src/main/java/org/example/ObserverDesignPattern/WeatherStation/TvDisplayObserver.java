package org.example.ObserverDesignPattern.WeatherStation;

public class TvDisplayObserver implements WeatherObserver {
    WeatherStation station;

    public TvDisplayObserver(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        double data = station.getData();
        System.out.println("TV Display -> Temp changed to = " + data);
    }
}
