package org.example.StrategyDesignPattern.RouteStrategy;

public class NavigationSystem {

    private NavigationStrategy strategy;

    public void setStrategy(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    public void fetchNavigationDetails() {
        strategy.route();
        strategy.calculateEstimatedDistance();
        strategy.calculateEstimatedTime();
    }
}
