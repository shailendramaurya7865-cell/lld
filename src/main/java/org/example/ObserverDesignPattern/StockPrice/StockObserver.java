package org.example.ObserverDesignPattern.StockPrice;

public interface StockObserver {
    void update(double oldStockPrice, double currentStockPrice);
}
