package org.example.StrategyDesignPattern.Discount;

public class PercentageDiscountStrategy implements DiscountStrategy{
    double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double discount(double currentPrice) {
        double discount = (currentPrice * discountPercentage) / 100;
        return currentPrice - discount;
    }
}
