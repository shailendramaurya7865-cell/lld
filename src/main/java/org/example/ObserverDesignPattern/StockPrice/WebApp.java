package org.example.ObserverDesignPattern.StockPrice;

public class WebApp implements StockObserver {

    @Override
    public void update(double oldStockPrice, double currentStockPrice) {
        if(currentStockPrice - oldStockPrice > 5) {
            System.out.println("WebApp.update");
            System.out.println("oldStockPrice = " + oldStockPrice + ", currentStockPrice = " + currentStockPrice);
        }
    }
}
