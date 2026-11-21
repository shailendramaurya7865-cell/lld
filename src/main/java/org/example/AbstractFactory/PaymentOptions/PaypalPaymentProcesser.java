package org.example.AbstractFactory.PaymentOptions;

public class PaypalPaymentProcesser implements PaymentProcesser{
    @Override
    public void processPayment() {
        System.out.println("PaypalPaymentProcesser.processPayment");
    }
}
