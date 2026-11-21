package org.example.Factory.Logistic;

public class AirPlane implements Transport {
    @Override
    public void transport() {
        System.out.println("AirPlane.deliver");
    }
}
