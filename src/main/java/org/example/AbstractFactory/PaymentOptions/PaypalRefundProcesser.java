package org.example.AbstractFactory.PaymentOptions;

public class PaypalRefundProcesser implements RefundProcesser{
    @Override
    public void refund() {
        System.out.println("PaypalRefundProcesser.refund");
    }
}
