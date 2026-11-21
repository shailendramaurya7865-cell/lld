package org.example.Factory.Logistic;

public class Ship implements Transport {
    @Override
    public void transport() {
        System.out.println("Ship.deliver");
    }
}
