package org.example.AbstractFactory.PaymentOptions;

public class StripeRefundProcesser implements RefundProcesser{
    @Override
    public void refund() {
        System.out.println("StripeRefundProcesser.refund");
    }
}
