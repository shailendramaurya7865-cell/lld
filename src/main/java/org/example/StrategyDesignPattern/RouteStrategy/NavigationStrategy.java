package org.example.StrategyDesignPattern.RouteStrategy;

public interface NavigationStrategy {

    void route();

    void calculateEstimatedTime();

    void calculateEstimatedDistance();
}
