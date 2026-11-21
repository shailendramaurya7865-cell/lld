package org.example.StrategyDesignPattern.Discount;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(100);
        DiscountStrategy discountStrategy = new NoDiscountStrategy();
        order.setDiscountStrategy(discountStrategy);
        order.processDiscount();

        FlatDiscountStrategy flatDiscountStrategy = new FlatDiscountStrategy(50);
        order.setDiscountStrategy(flatDiscountStrategy);
        order.processDiscount();

        PercentageDiscountStrategy percentageDiscountStrategy = new PercentageDiscountStrategy(16);
        order.setDiscountStrategy(percentageDiscountStrategy);
        order.processDiscount();
    }
}
