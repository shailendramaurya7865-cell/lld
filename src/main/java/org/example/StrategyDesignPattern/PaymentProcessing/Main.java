package org.example.StrategyDesignPattern.PaymentProcessing;

public class Main {
    static void main(String[] args) {
        Payment payment = new Payment();
        payment.setPaymentStrategy(new CreditCard());
        payment.makePayment();
    }
}
