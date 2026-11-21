package org.example.AbstractFactory.PaymentOptions;

public class RazorpayFactory implements PaymentFactory{
    @Override
    public PaymentProcesser buildPaymentProcesser() {
        return new RazorpayPaymentProcesser();
    }

    @Override
    public PaymentValidator buildPaymentValidator() {
        return new RazorpayPaymentValidator();
    }

    @Override
    public RefundProcesser buildRefundProcesser() {
        return new RazorpayRefundProcesser();
    }
}
