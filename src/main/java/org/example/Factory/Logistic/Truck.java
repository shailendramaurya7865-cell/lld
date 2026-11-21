package org.example.Factory.Logistic;

public class Truck implements Transport{
    @Override
    public void transport() {
        System.out.println("Truck.deliver");
    }
}
