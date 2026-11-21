package org.example.ObserverDesignPattern.StockPrice;

public class Main {
    static void main(String[] args) {
        DemoStock stock = new DemoStock(100);
        stock.addObserver(new EmailAlert());
        stock.addObserver(new WebApp());
        stock.addObserver(new MobileApp());

        stock.setData(110);
    }
}
