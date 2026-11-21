package org.example.StrategyDesignPattern.PaymentProcessing;

public class NetBanking implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Pay Via Net Banking");
    }
}
