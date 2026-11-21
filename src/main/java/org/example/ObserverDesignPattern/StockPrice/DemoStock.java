package org.example.ObserverDesignPattern.StockPrice;

import java.util.ArrayList;
import java.util.List;

public class DemoStock implements StockMarket{
    private List<StockObserver> observerList = new ArrayList<>();
    private double price;

    public DemoStock(int price) {
        this.price = price;
    }

    @Override
    public void addObserver(StockObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(StockObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(double currentPrice) {
        for (StockObserver stockObserver : observerList) {
            stockObserver.update(price, currentPrice);
        }
    }

    @Override
    public void setData(double currentPrice) {
        notifyObservers(currentPrice);
        price = currentPrice;

    }
}
