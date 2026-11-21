package org.example.AbstractFactory.PaymentOptions;

public class PaymentManager {
    PaymentProcesser paymentProcesser;
    PaymentValidator paymentValidator;
    RefundProcesser refundProcesser;

    PaymentManager(PaymentFactory factory) {
        paymentProcesser = factory.buildPaymentProcesser();
        paymentValidator = factory.buildPaymentValidator();
        refundProcesser = factory.buildRefundProcesser();
    }

    public void doPayment() {
        paymentProcesser.processPayment();
    }

    public void processRefund() {
        refundProcesser.refund();
    }

    public void validatePayment() {
        paymentValidator.validate();
    }


}
