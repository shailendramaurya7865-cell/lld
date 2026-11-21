package org.example.ObserverDesignPattern.StockPrice;

public class MobileApp implements StockObserver{


    @Override
    public void update(double oldStockPrice, double currentStockPrice) {
        System.out.println("oldStockPrice = " + oldStockPrice);
        System.out.println("MobileApp.update");
    }
}
