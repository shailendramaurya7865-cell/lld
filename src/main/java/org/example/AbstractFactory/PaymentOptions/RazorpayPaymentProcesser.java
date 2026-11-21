package org.example.AbstractFactory.PaymentOptions;

public class RazorpayPaymentProcesser implements PaymentProcesser{
    @Override
    public void processPayment() {
        System.out.println("RazorpayPaymentProcesser.processPayment");
    }
}
