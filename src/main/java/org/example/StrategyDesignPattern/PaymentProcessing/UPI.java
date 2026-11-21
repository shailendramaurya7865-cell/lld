package org.example.StrategyDesignPattern.PaymentProcessing;

public class UPI implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Pay Via UPI");
    }
}
