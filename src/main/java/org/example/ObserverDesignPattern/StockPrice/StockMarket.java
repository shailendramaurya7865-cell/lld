package org.example.ObserverDesignPattern.StockPrice;

public interface StockMarket {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers(double price);
    void setData(double price);
}
