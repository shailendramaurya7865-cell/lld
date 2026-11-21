package org.example.StrategyDesignPattern.RouteStrategy;

public class Car implements NavigationStrategy{
    @Override
    public void route() {
        System.out.println("Car Route");
    }

    @Override
    public void calculateEstimatedTime() {
        System.out.println("Car Time");
    }

    @Override
    public void calculateEstimatedDistance() {
        System.out.println("Car Distance");
    }
}
