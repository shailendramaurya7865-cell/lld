package org.example.StrategyDesignPattern.Discount;

public class RegularDiscount implements DiscountStrategy {
    private final double regularDiscount = 300;

    @Override
    public double applyDiscount(double marketPrice) {
        System.out.println("Original Amount : = " + marketPrice);
        System.out.println("Discount Applied (Flat) = " + regularDiscount + " Rs");
        return marketPrice - regularDiscount;

    }
}
