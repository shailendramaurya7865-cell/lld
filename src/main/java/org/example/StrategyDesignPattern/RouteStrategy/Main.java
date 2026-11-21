package org.example.StrategyDesignPattern.RouteStrategy;

public class Main {
    static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem();
        navigationSystem.setStrategy(new Walking());
        navigationSystem.fetchNavigationDetails();
    }
}
