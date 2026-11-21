package org.example.AbstractFactory.PaymentOptions;

public class StripeFactory implements PaymentFactory {
    @Override
    public PaymentProcesser buildPaymentProcesser() {
        return new StripePaymentProcessor();
    }

    @Override
    public PaymentValidator buildPaymentValidator() {
        return new StripePaymentValidator();
    }

    @Override
    public RefundProcesser buildRefundProcesser() {
        return new StripeRefundProcesser();
    }
}
