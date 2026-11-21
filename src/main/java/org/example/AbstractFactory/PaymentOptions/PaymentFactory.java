package org.example.AbstractFactory.PaymentOptions;

public interface PaymentFactory {
    PaymentProcesser buildPaymentProcesser();

    PaymentValidator buildPaymentValidator();

    RefundProcesser buildRefundProcesser();
}
