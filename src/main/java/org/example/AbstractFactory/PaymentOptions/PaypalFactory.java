package org.example.AbstractFactory.PaymentOptions;

public class PaypalFactory implements PaymentFactory{
    @Override
    public PaymentProcesser buildPaymentProcesser() {
        return new PaypalPaymentProcesser();
    }

    @Override
    public PaymentValidator buildPaymentValidator() {
        return new PaypalPaymentValidator();
    }

    @Override
    public RefundProcesser buildRefundProcesser() {
        return new PaypalRefundProcesser();
    }
}
