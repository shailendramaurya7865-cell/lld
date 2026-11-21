package org.example.ObserverDesignPattern.FoodOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SampleOrder implements FoodOrder {
    public List<OrderObserver> observers = new ArrayList<>();

    public Order order;

    public SampleOrder(Order order) {
        this.order = order;
    }

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (OrderObserver orderObserver : observers) {
            orderObserver.updateOrder();
        }
    }

    public void updateOrder(Order updatedOrder) {
        if (Objects.equals(updatedOrder.status, "paid")) {
            order = updatedOrder;
            notifyObserver();
        }
    }
}
