package org.example.Factory.FactoryMethod;

public class MainFactoryMethod {
    static void main(String[] args) {
        PaymentProcesser paymentProcesser = new UPIPaymentProcesser();
        paymentProcesser.processPayment();
    }
}
