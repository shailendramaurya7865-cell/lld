package org.example.ObserverDesignPattern.FoodOrder;

public class Order {
    public String orderName;
    public double price;
    public String status;

    public Order(String orderName, double price, String status) {
        this.orderName = orderName;
        this.price = price;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
