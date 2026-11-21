package org.example.StrategyDesignPattern.PaymentProcessing;

public class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Pay Via Debit Card");
    }
}
