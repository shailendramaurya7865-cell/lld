package org.example.ObserverDesignPattern.FoodOrder;

public class EmailObserver implements OrderObserver {
    Order order;

    EmailObserver(Order order) {
        this.order = order;
    }
    @Override
    public void updateOrder() {
        System.out.println("order = " + order);
    }
}
