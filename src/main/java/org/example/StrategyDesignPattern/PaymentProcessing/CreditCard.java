package org.example.StrategyDesignPattern.PaymentProcessing;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Pay Via Credit Card");
    }
}
