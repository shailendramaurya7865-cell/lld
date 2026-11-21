package org.example.StrategyDesignPattern.Discount;

public class FestiveDiscount implements DiscountStrategy{
    private final double discountPercentage = 25;

    @Override
    public double applyDiscount(double marketPrice) {
        double discount = (marketPrice * discountPercentage) / 100;
        return marketPrice - discount;
    }
}
