package org.example.StrategyDesignPattern.PaymentProcessing;

public class Payment {
    public PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment() {
        paymentStrategy.processPayment();
    }
}
