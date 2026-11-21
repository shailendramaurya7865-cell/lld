package org.example.ObserverDesignPattern.FoodOrder;

//observable
public interface FoodOrder {
    void addObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void notifyObserver();
}
