    package org.example.ObserverDesignPattern.WeatherStation;

    public class MobileDisplayObserver implements WeatherObserver {
        WeatherStation weatherStation;

        public MobileDisplayObserver(WeatherStation weatherStation) {
            this.weatherStation = weatherStation;
        }

        @Override
        public void update() {
            double data = weatherStation.getData();
            System.out.println("Mobile Display -> Temp changed to = " + data);
        }
    }
