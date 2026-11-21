package org.example.ObserverDesignPattern.WeatherStation;

public class Main {
    static void main(String[] args) {

        WeatherStation station = new WeatherStationConcrete(30.4f);
        TvDisplayObserver tvDisplayObserver = new TvDisplayObserver(station);
        MobileDisplayObserver mobileDisplayObserver = new MobileDisplayObserver(station);
        station.add(mobileDisplayObserver);
        station.add(tvDisplayObserver);

        station.remove(tvDisplayObserver);
        station.setData(30);
    }
}
