package org.example.StrategyDesignPattern.RouteStrategy;

public class Walking implements NavigationStrategy {
    @Override
    public void route() {
        System.out.println("Walking Route");
    }

    @Override
    public void calculateEstimatedTime() {
        System.out.println("Walking Estimated Time");
    }

    @Override
    public void calculateEstimatedDistance() {
        System.out.println("Walking Estimated Distance");
    }
}
