package org.example.AbstractFactory.PaymentOptions;

public class RazorpayRefundProcesser implements RefundProcesser{
    @Override
    public void refund() {
        System.out.println("RazorpayRefundProcesser.refund");
    }
}
