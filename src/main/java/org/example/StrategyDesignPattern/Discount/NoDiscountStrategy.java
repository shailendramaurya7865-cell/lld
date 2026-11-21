package org.example.StrategyDesignPattern.Discount;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double discount(double price) {
        return price;
    }
}
