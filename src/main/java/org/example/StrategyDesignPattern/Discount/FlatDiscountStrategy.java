package org.example.StrategyDesignPattern.Discount;

public class FlatDiscountStrategy implements DiscountStrategy {
    double flatDiscount;

    public FlatDiscountStrategy(double flatDiscount) {
        this.flatDiscount = flatDiscount;
    }

    @Override
    public double discount(double price) {
        return price - flatDiscount;
    }
}
