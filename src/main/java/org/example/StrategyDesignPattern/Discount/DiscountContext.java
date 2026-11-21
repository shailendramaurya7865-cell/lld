package org.example.StrategyDesignPattern.Discount;

public class DiscountContext {
    private DiscountStrategy strategy;


    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDiscount(double marketPrice) {
        return strategy.applyDiscount(marketPrice);
    }
}
