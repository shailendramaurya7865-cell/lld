package org.example.StrategyDesignPattern.Discount;

public class Order {
    double price;
    DiscountStrategy discountStrategy;

    public Order(double price) {
        this.price = price;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void processDiscount() {
        double discount = discountStrategy.discount(price);
        System.out.println("Discounted Price = "  + discount);
    }
}
