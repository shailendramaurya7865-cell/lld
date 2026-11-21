package org.example.StrategyDesignPattern.Discount;

public class PremiumDiscount implements DiscountStrategy {
    private final double discountPercentage = 20;

    @Override
    public double applyDiscount(double marketPrice) {
        double discount = (marketPrice * discountPercentage) / 100;
        return marketPrice - discount;
    }
}
